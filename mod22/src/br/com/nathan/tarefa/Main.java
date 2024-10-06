package br.com.nathan.tarefa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Tarefa: Criar uma lista de pessoas e seus gêneros e criar uma nova lista somente com pessoas
 * do sexo feminino
 */
public class Main {

    public static void main(String[] args) {

        // Lista de pessoas
        List<Pessoa> pessoas = new Pessoa().retornaListaDePessoas();

        // Lista só com as mulheres da lista de pessoas
        List<Pessoa> mulheres = pessoas
                .stream()
                .filter(pessoa -> pessoa.getSexo().equals("Feminino"))
                .collect(Collectors.toCollection(ArrayList::new));

        // Exibindo a lista de mulheres
        System.out.println(mulheres);
    }

}
