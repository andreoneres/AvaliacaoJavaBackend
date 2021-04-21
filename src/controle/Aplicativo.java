/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import modelo.Avaliacao;
import modelo.Banco;

/**
 *
 * @author André
 */
public class Aplicativo implements InterfaceAplicativo {

    private final Banco banco;//Declaração do atributo privado banco do tipo Banco.

    //Construtor da classe Aplicativo
    public Aplicativo() {
        this.banco = new Banco();//Criação do objeto banco dentro do construtor da classe Aplicativo
    }

    @Override
    //Método que irá enviar os dados digitados pelo usuário para a classe Banco e irá adiciona-los aos atributos da classe Avaliacao e a ArrayList da classe Banco.
    public void cadastrar(String nome, String disciplina, String conteudo, int dia, int mes, int ano) {
        Avaliacao obja = new Avaliacao(nome, disciplina, conteudo, dia, mes, ano);//O objeto obja que foi criado está recebendo todos os dados digitados pelo usuário, vindos pelo parametro de entrada.
        banco.adicionar(obja); //A objeto banco está executando o método adicionar, mandando o objeto obja para o método.
    }

    @Override
    //Método que irá adicionar todos os dados da ArrayList da classe Banco em uma nova ArrayList, formatando-a com o método .toString
    public ArrayList<String> listar() {
        ArrayList<String> list = new ArrayList<>();//Criação de uma nova ArrayList para ser retornada.
        //Este for está sendo utilizado para adicionar todos os dados encontrados na ArrayList lista da classe Banco na ArrayList list, no modelo toString e por fim, o retorna.
        for (int i = 0; i < banco.quantosTem(); i++) {
            list.add(banco.acessar(i).toString());//Adiciona a avaliação vinda do banco.acessar na ArrayList list com a formatação do .toString
        }
        return list;//Retorno da ArrayList list

    }

    @Override
    //Este método chama o método remover do objeto banco e passa por parametro o indice que foi digitado pelo usuário para o mesmo ser removido.
    public void deletar(int indice) {
        banco.remover(indice);
    }
    //Este método chama o método .salvar do objeto banco e passa por parametro o nome do arquivo onde será salvo as avaliações.
    public void salva(String nome) {
        banco.salvar(nome);
    }
  
}
