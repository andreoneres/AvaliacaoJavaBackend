/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author André
 */
public class Avaliacao {
    //Declaração dos atributos da classe Avaliacao que armazenará os dados que serão inseridos pelo usuário para depois irem para a ArrayList da classe Banco: nome, dia, mes, ano, disciplina e conteudo.
    private String nome;
    private int dia;
    private int mes;
    private int ano;
    private String disciplina;
    private String conteudo;
    //Construtor da classe Avaliacao que está modificando os dados originais dos atributos pelos dados vindos pelo parametro de entrada.
    public Avaliacao(String nome, String disciplina, String conteudo, int dia, int mes, int ano) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.conteudo = conteudo;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    //Declaração dos métodos getters e setters para acesso aos atributos privados da classe Avaliacao por classes e objetos que não sejam da classe Avaliacao.
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    //Método toString que é utilizado para "formatar" o texto que será mostrado para o usuário, o sobreescrevendo.
    public String toString() {
        return (this.nome + ". " + this.disciplina + ". " + this.dia + "/" + this.mes + "/" + this.ano);//Retorno de um texto String, com o nome, disciplina, dia, mes e ano da avaliação.
    }

}
