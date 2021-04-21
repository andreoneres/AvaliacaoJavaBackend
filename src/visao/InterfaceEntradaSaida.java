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
public interface InterfaceEntradaSaida {

    public int mostraMenuLerOpcao();

    public void listarDadosBanco(Aplicativo app);

    public void lerDadosExecutaCadastro(Aplicativo app);

    public void lerIndiceExecutaRemocao(Aplicativo app);
}
