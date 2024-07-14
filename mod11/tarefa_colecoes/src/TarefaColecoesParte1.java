/**
 * Exercício para o módulo 11 (Coleções Parte 1)
 *
 * TAREFA parte 1
 * -- Leia uma sequência de nomes no console separado por vírgula
 * -- Separe esses nomes utilizando split
 * -- Ordene os nomes em ordem alfabética
 * -- Imprimir os nomes no console
 */
import java.util.*;

public class TarefaColecoesParte1 {
    public static void main(String[] args){
        // Classe para ler valores no console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Defina o nome e o sexo de uma pessoa separados por hífen, cada pessoa deve ser separada por vírgula");
        // Exemplo de input: Gustavo,Mariana,Maria Clara,Ronaldo,...
        String nomes = scanner.nextLine();

        // Pegando os nomes separados
        String[] nomesSeparados = nomes.split(",");

        // Usando arrayList
        List<String> listaDeNomes = new ArrayList<String>();
        listaDeNomes.addAll(Arrays.asList(nomesSeparados));

        // Ordenando o array
        Collections.sort(listaDeNomes);

        System.out.println("Lista de nomes em ordem alfabética: " + listaDeNomes);
        scanner.close();
    }
}
