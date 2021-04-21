/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.Aplicativo;

/**
 *
 * @author André
 */
public class Main {

    public static void main(String[] args) {
        EntradaSaidaSystem x = new EntradaSaidaSystem();//Criação de um objeto da classe EntradaSaidaSystem para a execução dos métodos dessa classe
        Aplicativo app = new Aplicativo();//Criação de um objeto da classe Aplicativo que será enviada por parametro
        int op = 6;
        //Estrutura de repetição que irá ficar repetindo sempre o menu quando o usuário terminar alguma das opções, até ele digitar 0.
        while (op != 0) {
            op = x.mostraMenuLerOpcao();
            //Switch que irá conferir qual foi a opção desejada pelo usuário e executará o método correspondente a opção.
            switch (op) {
                case 1://Caso a opção digitada seja 1, o objeto x executa o método .listarDadosBanco da classe EntradaSaidaSystem, enviando por parametro um objeto da classe Aplicativo.
                    x.listarDadosBanco(app);
                    break;
                case 2://Caso a opção digitada seja 2, o objeto x executa o método .lerDadosExecutaCadastro da classe EntradaSaidaSystem, enviando por parametro um objeto da classe Aplicativo.
                    x.lerDadosExecutaCadastro(app);
                    break;
                case 3://Caso a opção digitada seja 3, o objeto x executa o método .lerIndiceExecutaRemocao da classe EntradaSaidaSystem, enviando por parametro um objeto da classe Aplicativo.
                    x.lerIndiceExecutaRemocao(app);
                    break;
                case 0://Caso a opção digitada seja 0, mostra uma mensagem na tela informando a saída do programa e finaliza o programa.
                    System.out.println("\nVocê saiu do programa!\n");
                    break;
            }
        }
    }
}
