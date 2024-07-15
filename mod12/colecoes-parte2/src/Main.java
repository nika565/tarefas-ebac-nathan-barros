import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Tarefa do módulo 12: Fazer um programa que leia um nome e o sexo.
 * -> Separar as pessoas por grupos. Masculino e Feminio.
 * -> Versionar no github na pata Colecoes-parte-2
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        while(true){

            System.out.println("\nDigite o nome da pessoa: ");
            String nome = scanner.nextLine();

            System.out.println("\nQual é o sexo Dessa pessoa?");
            System.out.println("\nDigite F para feminino.");
            System.out.println("\nDigite M para masculino.");
            String sexo = scanner.nextLine();

            if(sexo.equals("M")){
                masculino.add(nome);
            } else if(sexo.equals("F")){
                feminino.add(nome);
            } else {
                System.out.println("Ops... Parece que você digitou errado. Tente novamente");
                continue;
            }

            System.out.println("\nDeseja continuar o programa?");
            System.out.println("\nDigite S para sim.");
            System.out.println("\nDigite N para não.");
            String continuar = scanner.nextLine();

            if(continuar.equals("N")){
                break;
            }

        }

        System.out.println("Grupo Feminino: " + feminino.toString());
        System.out.println("Grupo Masculino: " + masculino.toString());

        scanner.close();
    }
}