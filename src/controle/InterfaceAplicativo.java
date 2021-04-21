/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;

/**
 *
 * @author André
 */
public interface InterfaceAplicativo {

    public void cadastrar(String nome, String disciplina, String conteudo, int dia, int mes, int ano);

    public ArrayList<String> listar();

    public void deletar(int indice);

}
