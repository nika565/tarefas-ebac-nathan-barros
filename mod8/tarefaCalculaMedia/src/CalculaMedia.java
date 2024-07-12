import java.util.Scanner;

/**
 * Tarefa da EBAC: Ler quatro notas e calcular a média dessas notas
 * @author nathan
 */
public class CalculaMedia {

    // Método principal da aplicação
    public static void main(String[] args){
        // Scanner para realizar a leitura das variáveis pelo console
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite a primeira nota: ");
        int nota1 = scanner.nextInt();

        System.out.print("\nDigite a segunda nota: ");
        int nota2 = scanner.nextInt();

        System.out.print("\nDigite a terceira nota: ");
        int nota3 = scanner.nextInt();

        System.out.print("\nDigite a quarta nota: ");
        int nota4 = scanner.nextInt();

        // Fazendo cálculo da média das notas
        float media = (float) (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("\nMédia das notas: " + media + " \n");

        scanner.close();
    }

}
