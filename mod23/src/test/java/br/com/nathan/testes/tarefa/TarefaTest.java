package br.com.nathan.testes.tarefa;

import br.com.nathan.tarefa.testes1.Pessoa;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  Pegar a tarefa do módulo de stream e fazer testes para garantir que a lista de mulheres
 *  tenha somente mulheres e verificar se os nomes são femininos
 */

public class TarefaTest {

    // Teste para saber se a lista filtrada possui apenas pessoas do sexo feminino
    @Test
    public void mulheresTest() {
        // Instanciando objeto de pessoas
        Pessoa pessoa = new Pessoa();

        // Criando a lista de pessoas
        List<Pessoa> listaPessoa = pessoa.retornaListaDePessoas();

        // Filtrando somente as mulheres da lista
        List<Pessoa> mulheres = pessoa.retornaListaDeMulheres(listaPessoa);

        // Verificando se a lista tem somente mulheres
        mulheres.forEach(m -> Assert.assertEquals("Feminino", m.getSexo()));
    }

    // Teste para saber se a lista de mulheres possui nomes femininos
    @Test
    public void nomesDeMulheresTest() {
        // Instanciando objeto de pessoas
        Pessoa pessoa = new Pessoa();

        // Criando a lista de pessoas
        List<Pessoa> listaPessoa = pessoa.retornaListaDePessoas();

        // Filtrando somente as mulheres da lista
        List<String> NomesDeMulheres = pessoa.retornaListaDeMulheres(listaPessoa)
                .stream()
                .map(p -> p.getNome())
                .collect(Collectors.toCollection(ArrayList::new));

        // Lista esperada de nomes femininos
        List<String> listaDeMulheresParaTeste = new ArrayList<>(List.of("Isabella", "Beatriz", "Camila"));

        // Verifica se todos os nomes esperados estão na lista de mulheres
        Assert.assertTrue(NomesDeMulheres.containsAll(listaDeMulheresParaTeste));
    }

}
