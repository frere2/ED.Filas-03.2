package model;

public class Processo {
    private String nome;
    private int qtdRetornos;

    public Processo(String nome, int qtdRetornos) {
        this.nome = nome;
        this.qtdRetornos = qtdRetornos;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdRetornos() {
        return qtdRetornos;
    }

    public void decrementaQtdRetornos() {
        if (qtdRetornos > 0) {
            qtdRetornos--;
        }
    }

    @Override
    public String toString() {
        return "Processo: " + nome + ", Retornos Restantes: " + qtdRetornos;
    }
}