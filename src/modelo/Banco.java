/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
/**
 *
 * @author André
 */
public class Banco extends BancoGenerico {

    private ArrayList<Avaliacao> lista; //ArrayList lista da classe Banco que é privada e que armazenará as avaliações cadastradas.

    public Banco() {
        this.lista = new ArrayList();//Criação de um objeto lista do tipo ArrayList no construtor da classe Banco.  
        this.lista = carregar("avaliacoes.txt");//Carregamento dos dados do arquivo dados.txt no banco.
    }

    @Override
    //Método que retorna um número inteiro que indica a quantidade de avaliações que foram cadastradas.
    public int quantosTem() {
        return this.lista.size();//Retorno de um inteiro, que é a quantidade de avaliações cadastradas visto a partir do método .size().
    }

    @Override
    //Método que retorna uma avaliação a partir do indice que é solicitado na classe Aplicativo. 
    public Avaliacao acessar(int indice) {
        Avaliacao acess = this.lista.get(indice);//Foi criado uma váriavel Avaliacao para retornar a avaliação que foi pedido pelo for, pois a saída do método é do tipo Avaliacao, que recebe o this.lista.get(i) que por sua vez pega a avaliação correspondente ao indice pedido.
        return acess;//Retorno do várivel do tipo Avaliacao.
    }

    @Override
    //Método que recebe por parametro o obja da classe Aplicativo do tipo Avaliacao com os dados digitados pelo usuário e o cadastra no ArrayList lista.
    public void adicionar(Avaliacao a) {
        this.lista.add(a);//Método .add que adiciona o que foi recebido pela parametro de entrada à lista.
    }

    @Override
    //Método que recebe um indice pelo parametro de entrada e remove a avaliação correspondente ao mesmo.
    public Avaliacao remover(int indice) {
        Avaliacao obja = this.lista.get(indice);//Criação de um objeto obja do tipo Avaliacao que recebe a avaliação que foi pedida pelo indice, o apaga e retorna o obja.
        this.lista.remove(indice);//Método .remove que apaga a avaliação que está no indice que foi digitado pelo usuário.
        return obja;//Retorno do objeto obja.
    }

    @Override
    //Método que carrega arquivo com dados das avaliações e joga no programa.
    public ArrayList<Avaliacao> carregar(String arquivo) {

        ArrayList<Avaliacao> listt = new ArrayList();//ArrayList que será retornada pelo método, que irá ser carregado diretamente no construtor da classe Banco.
        Avaliacao a; //Criação de uma váriavel a que será utilizada mais a frente.

        try { //O try irá tentar executar este trecho do código e caso tenha alguma exceção, irá para o catch
            FileReader arq = new FileReader(arquivo); //Criação de um objeto FileReader que contém o nome do arquivo que foi passado por parametro.
            BufferedReader lerArq = new BufferedReader(arq);//Criação de um objeto BufferedReader que recebe por parametro o objeto arq para a leitura do arquivo.
            String linha;//Declaração da váriavel linha.
            while (lerArq.ready()) { //Estrutura de repetição que irá ler até acabar todas as linhas do arquivo.
                linha = lerArq.readLine();//Utiliza-se do método .readLine para ler uma linha do arquivo e jogar na String linha, sendo isso até acabar as linhas e a repetição acabar.
                String[] dadoc = linha.split(". ");//O método .split() irá dividir a String que existe na variável linha em vários pedaços, e onde tiver um . + espaço, irá pegar o que há no lado deles e armazenará no vetor, em diferente posições.
                String dadoi[] = dadoc[3].split("/");//O método .split() irá dividir a String que existe no vetor dadoc[3] em vários pedaços, e onde houver uma /, irá dividir o que há nos lados da /, cada um em uma posição diferente do vetor.
                a = new Avaliacao(dadoc[1], dadoc[2], dadoc[3], Integer.parseInt(dadoi[0]), Integer.parseInt(dadoi[1]), Integer.parseInt(dadoi[2]));//Criação de um objeto a que recebe por parametros os dados capturados do arquivo e que foram armazenados nos vetores.
                listt.add(a);//Adiciona-se o objeto a ao ArrayList, contendo em seu parametro de entrada todos os dados lidos do arquivo.
            }

        } catch (IOException ex) { //E aqui as exceções serão tratadas, caso exista alguma que acabarem por aparecer no trecho do código acima.

        }
        return listt;//Retorno da ArrayList listt.
    }

    @Override
    //Método que salva os dados da ArrayList lista em um arquivo
    public void salvar(String arquivo) {
        try { //O try irá tentar executar este trecho do código e caso algo tenha alguma exceção, irá para o catch
            try (FileWriter fw = new FileWriter(arquivo); //Objeto FileWriter que irá criar um arquivo com o nome que o usuário digitar e será armazenado no objeto.
                    PrintWriter pw = new PrintWriter(fw) //Objeto PrintWriter que pega o arquivo para escrever os dados no arquivo com o println.
                    ) {
                for (int i = 0; i < lista.size(); i++) {
                pw.println(i + " " + lista.get(i).toString());//A partir do indice, pega-se a avaliação, a coloca no formato .toString e a escreve no arquivo com o método .println do objeto pw, pulando linha.
                }
            } 

        } catch (IOException e) { //E aqui as exceções serão tratadas, caso exista alguma que acabarem por aparecer no trecho do código acima.
            
        }
    }
}
