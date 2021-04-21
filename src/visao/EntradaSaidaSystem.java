/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.Aplicativo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author André
 */
public class EntradaSaidaSystem implements InterfaceEntradaSaida {

    private final Scanner teclado;//Atributo privado do tipo Scanner

    public EntradaSaidaSystem () {
        this.teclado = new Scanner(System.in);//Criação do objeto teclado para a leitura dos dados.
    }
    
    @Override
    //Método que irá mostrar o menu para o usuário, com todas as opções disponíveis e retornará a op para a classe Main.
    public int mostraMenuLerOpcao() {
       
        System.out.println("Digite 1 para listar dados \nDigite 2 para cadastrar avaliação "
                + "\nDigite 3 para remover por índice \nDigite 0 para sair");
        int op = teclado.nextInt(); //Leitura da opção desejada pelo usuário.
        teclado.nextLine();
        return op;//Retorno da opção.
    }

    @Override
    //Método que irá listar todas as avaliações cadastradas para o usuário.
    public void listarDadosBanco(Aplicativo app) {
        ArrayList list = app.listar(); //Criação de uma ArrayList que recebe a ArrayList list da classe Aplicativo e então, com o for, o mostra na tela.
    for (int i = 0; i < list.size(); i++) {
	System.out.println(i+" "+list.get(i));//Estará sendo mostrado a avaliação que estiver no indice controlado pelo for, junto com o seu indice correspondente que foi pego pelo método .get na ArrayList list.
      }
    }
    @Override
    //Método que lê os dados da avaliação que será fornecida pelo usuário e os cadastra.
    public void lerDadosExecutaCadastro(Aplicativo app) {
        
        System.out.print("\nDigite o nome da avaliação: ");
        String nome = teclado.next();//Leitura do nome da avaliação.
        System.out.print("Digite a disciplina da avaliação: ");
        String disciplina = teclado.next();//Leitura da disciplina da avaliação.
        System.out.print("Digite o conteúdo da avaliação: ");
        String conteudo = teclado.next();//Leitura do conteúdo da avaliação.
        System.out.print("Digite o dia da avaliação: ");
        int dia = teclado.nextInt();//Leitura do dia da avaliação.
        System.out.print("Digite o mês da avaliação: ");
        int mes = teclado.nextInt();//Leitura do mês da avaliação.
        System.out.print("Digite o ano da avaliação: ");
        int ano = teclado.nextInt();//Leitura do ano da avaliação.
        teclado.nextLine(); 
        app.cadastrar(nome, disciplina, conteudo, dia, mes, ano);//O objeto app está executando o método cadastrar da classe Aplicativo, enviando-o por parametro os dados digitados.
        salvarArquivo(app);//Atualiza o arquivo, acrescentando a avaliação que foi adicionada.
        System.out.println("\nAvaliação cadastrada!\n");
    
    }

    @Override
    //Método que irá ler o indice da avaliação que o usuário deseja deletar.
    public void lerIndiceExecutaRemocao(Aplicativo app) {
        System.out.print("\nDigite o indice da avaliação: ");
        int indice = teclado.nextInt();//Leitura do indice da avaliação.
        teclado.nextLine();
        app.deletar(indice);//O objeto app executará o método .deletar da classe Aplicativo, enviando por parametro o indice que o usuário digitou.
        salvarArquivo(app);//Atualiza o arquivo, retirando a avaliação que foi deletada.
        System.out.println("\nAvaliação deletada!\n");        

    }
    //Método que irá ler o nome que o usuário deseja dar ao arquivo
    public void salvarArquivo(Aplicativo app) {
        String nome = "avaliacoes.txt";//Váriavel do tipo String que guarda o nome do arquivo que será criado, no qual será salvo as avaliações.
        app.salva(nome);//O objeto app executará o método .salva da classe Aplicativo, enviando por parametro o nome do arquivo.  

    }

}
