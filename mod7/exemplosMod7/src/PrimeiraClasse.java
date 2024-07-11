
public class PrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("Olá Nathan");

        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("Rua 5");
        cliente.setCodigo(1);


        cliente.imprimirEndereco();
        System.out.println(cliente.getCodigo());

        String end = cliente.retornaEnderecoCliente();
        int valorTotal = cliente.getValorTotal();

        System.out.println(valorTotal);
        System.out.println(end);

    }
}
