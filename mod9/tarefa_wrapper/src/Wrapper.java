/**
 * Tarefa da EBAC: ler um valor de um tipo primitivo no console e depois fazer o "casting"
 * mudando para o tipo Wrapper da variável
 */

// Scanner para ler o valor no console e atribuir a uma variável.
import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite um valor inteiro: ");
        int valor = scanner.nextInt();

        // Passando o tipo da variável pra um wrapper
        Integer valorWrapper = valor;

        System.out.print("\nAqui está o meu valor usando um Wrapper: " + valorWrapper);

        scanner.close();
    }
}
