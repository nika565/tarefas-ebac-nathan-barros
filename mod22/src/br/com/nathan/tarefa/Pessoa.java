package br.com.nathan.tarefa;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    String nome;
    String sexo;

    public Pessoa(){}

    public Pessoa(String nome, String sexo){
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    public List<Pessoa> retornaListaDePessoas(){
        Pessoa p1 = new Pessoa("Isabella", "Feminino");
        Pessoa p2 = new Pessoa("Beatriz", "Feminino");
        Pessoa p3 = new Pessoa("Dante", "Masculino");
        Pessoa p4 = new Pessoa("Camila", "Feminino");
        Pessoa p5 = new Pessoa("Murilo", "Masculino");
        return new ArrayList<Pessoa>(List.of(p1, p2, p3, p4, p5));
    }

}
