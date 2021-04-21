/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author André
 */
abstract class BancoGenerico {

    abstract public int quantosTem();

    abstract public Avaliacao acessar(int indice);

    abstract public void adicionar(Avaliacao a);

    abstract public Avaliacao remover(int indice);
    
    abstract ArrayList<Avaliacao> carregar(String arquivo);
    
    abstract void salvar(String arquivo);
    
}
