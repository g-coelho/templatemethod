package org.example;

public abstract class Level {

    private int numero;
    private String nome;
    private int duracao;
    private int tempoJogador;
    private int itens;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTempoJogador() {
        return tempoJogador;
    }

    public void setTempoJogador(int tempoJogador) {
        this.tempoJogador = tempoJogador;
    }

    public int getItens() {
        return itens;
    }

    public void setItens(int pontuacao) {
        this.itens = pontuacao;
    }

    public int calcularScore(){
        return this.tempoJogador * this.itens;
    }

    public abstract String verificarPassagemLevelBonus();

    public String getTipo() {
        return "Level";
    }

    public String getInfo() {
        return "Level{" +
                "numero=" + numero +
                ", nome='" + nome + '\'' +
                ", duracao=" + duracao +
                ", tempoJogador=" + tempoJogador +
                ", itens=" + itens +
                '}';
    }
}