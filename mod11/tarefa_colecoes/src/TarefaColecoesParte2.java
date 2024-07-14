/**
 * Exercício para o módulo 11 (Coleções Parte 1)
 *
 * TAREFA parte 2
 * - Ler o nome e o sexo de pessoas
 * - Separar em grupos pessoa do sexo masculino e pessoas do sexo feminino
 * - Imprimir os dois grupos separados no console.
 */
import java.util.*;


public class TarefaColecoesParte2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Separando as pessoas em um array
        System.out.println("Informe o nome e o sexo das pessoas:");
        System.out.println("Exemplo de input: Gustavo-M,Isadora-F,Maria Clara-F");
        String[] pessoas = scanner.nextLine().split(",");

        // Variáveis para validar nome e sexo
        String nome;
        String sexo;

        // Agrupando por sexo
        Map<String, List<String>> grupos = new HashMap<>();
        for(var i = 0; i < pessoas.length; i++){
            // O split fará a divisão em dois de cada string sendo nome = indice 0 e sexo = indice 1
            nome = pessoas[i].split("-")[0];
            sexo = pessoas[i].split("-")[1];

            if(sexo.equals("F")) {

                if(grupos.containsKey("Feminino")){
                    grupos.get("Feminino").add(nome);
                } else {
                    List<String> nomesFemininos = new ArrayList<>();
                    nomesFemininos.add(nome);
                    grupos.put("Feminino", nomesFemininos);
                }

            } else {

                if(grupos.containsKey("Masculino")){
                    grupos.get("Masculino").add(nome);
                } else {
                    List<String> nomesMasculinos = new ArrayList<>();
                    nomesMasculinos.add(nome);
                    grupos.put("Masculino", nomesMasculinos);
                }

            }
        }

        // Imprimindo os grupos no console
        System.out.println("Grupos: " + grupos.toString());

        scanner.close();
    }
}
