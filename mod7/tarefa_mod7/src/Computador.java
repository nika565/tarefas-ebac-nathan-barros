import java.util.Scanner;

/**
 * Classe que descreve características e comportamentos de um computador
 * @author Nathan Barros
 */

public class Computador {
    private String marca;
    private String cor;
    private int quantidadeDeMemoriaEmGB;
    private int anoDeFabricacao;

    /**
     * Método principal que executa o método de somar valores
     * @param args
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite um número:");
        int num1 = scanner.nextInt();

        System.out.println("\nDigite outro número para realizar a soma");
        int num2 = scanner.nextInt();

        int soma = somaValores(num1, num2);
        System.out.println("\nValor da soma: " + soma);
    }

    /**
     * Método para somar valores. Todos os computadores tem como sua função principal
     * realizar cálculos matemáticos, então resolvi colocar como um méotodo (comportamento)
     * @param num1
     * @param num2
     * @return num1 + num2
     */
    public static int somaValores(int num1, int num2){
        return num1 + num2;
    }

    /**
     * Método para ligar o computador
     */
    public void ligar(){
        System.out.println("O computador está ligando...\nO Computador está ligado!");
    }

    /**
     * Método para desligar um computador
     */
    public void desligar(){
        System.out.println("O computador está desligando...");
    }

    /**
     * Buscar a marca do computador
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Modificar o valor da marca
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Retorna a cor do computador
     * @return
     */
    public String getCor() {
        return cor;
    }

    /**
     * Modifica a cor do computador
     * @param cor
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * Retorna a quantidade de memória em GB de um computador
     * @return
     */
    public int getQuantidadeDeMemoriaEmGB() {
        return quantidadeDeMemoriaEmGB;
    }

    /**
     * Modifica o valor d memória de um computador
     * @param quantidadeDeMemoriaEmGB
     */
    public void setQuantidadeDeMemoriaEmGB(int quantidadeDeMemoriaEmGB) {
        this.quantidadeDeMemoriaEmGB = quantidadeDeMemoriaEmGB;
    }

    /**
     * Retorna o ano de fabricação de um computador
     * @return
     */
    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    /**
     * Modifica o ano de fabricação de um computador
     * @param anoDeFabricacao
     */
    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }
}
