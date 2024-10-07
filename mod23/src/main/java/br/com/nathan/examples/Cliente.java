package br.com.nathan.examples;

public class Cliente {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicinarNome(String nome){
        setNome(nome);
    }
}
