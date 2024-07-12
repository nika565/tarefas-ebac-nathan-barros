/**
 * Tarefa módulo 10 da EBAC: Ler quantro notas do aluno e adicionar uma verificação
 * se o aluno foi aprovador, de recuperação ou reprovado através de um controle de
 * fluxo.
 *
 *  -- Caso a média do aluno seja maior ou igual a 7 ele foi aprovado
 *  -- Caso a média do aluno seja maior ou igual a 5 ele ficou de recuperação
 *  -- Caso seja inferior a cinco ele foi reprovado...
 *
 * @author nathan
 */
import java.util.Scanner;

public class ExemploControleDeFluxo {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Lendo as notas do aluno:
        System.out.print("\nInforme a primeira nota: ");
        int nota1 = scanner.nextInt();

        System.out.print("\nInforme a segunda nota: ");
        int nota2 = scanner.nextInt();

        System.out.print("\nInforme a terceira nota: ");
        int nota3 = scanner.nextInt();

        System.out.print("\nInforme a quarta nota: ");
        int nota4 = scanner.nextInt();

        // Calculando a média
        float media = (float) (nota1 + nota2 + nota3 + nota4) / 4;

        // Imprimindo a média no console
        System.out.println("\nA média do aluno foi de: " + media);

        if(media >= 7){
            System.out.println("\nALUNO APROVADO!");
        } else if(media >= 5) {
            System.out.println("\nALUNO DE RECUPERAÇÃO");
        } else {
            System.out.println("\nALUNO REPROVADO...");
        }

        scanner.close();
    }

}
