package tarefa;

public class Main {
    public static void main(String[] args) {
        // Obtendo a classe Produto
        Class<Produto> produtoClass = Produto.class;

        // Verificando se a classe possui a annotation Tabela
        if (produtoClass.isAnnotationPresent(Tabela.class)) {
            // Obtendo a annotation
            Tabela tabelaAnnotation = produtoClass.getAnnotation(Tabela.class);

            // Imprimindo o nome da tabela
            System.out.println("Nome da tabela: " + tabelaAnnotation.nome());
        } else {
            System.out.println("A classe Produto não possui a annotation Tabela.");
        }
    }
}

