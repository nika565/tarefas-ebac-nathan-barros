package br.com.nathan;

import br.com.nathan.dao.IProdutoDAO;
import br.com.nathan.dao.ProdutoDAO;
import br.com.nathan.domain.Produto;
import org.junit.Assert;
import org.junit.Test;

public class ProdutoTeste {

    @Test
    public void cadastrar(){

        // Criando o objetos produto
        Produto produto = new Produto();
        produto.setNome("Playstation 5");
        produto.setPreco(3499.99d);
        produto.setQuantidadeEstoque(150);

        // Cadastrando o produto
        IProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.cadastrar(produto);

        // Buscando produto para saber se está realmente cadastrado
        Produto produtoCadastrado = produtoDAO.buscarProduto(1L);

        // Verificando se as características são iguais
        Assert.assertEquals(produto.getNome(), produtoCadastrado.getNome());
        Assert.assertEquals(produto.getPreco(), produtoCadastrado.getPreco());
        Assert.assertEquals(produto.getQuantidadeEstoque(), produtoCadastrado.getQuantidadeEstoque());

    }

    @Test
    public void buscar(){

        IProdutoDAO produtoDAO = new ProdutoDAO();

        Produto p = produtoDAO.buscarProduto(1L);

        Assert.assertNotNull(p);
        Assert.assertNotNull(p.getId());

    }

    @Test
    public void atualizar(){

        // Criando Produto para atualizar no banco de dados
        Produto p = new Produto();
        p.setId(1L);
        p.setNome("PC Gamer");
        p.setPreco(7500.00d);
        p.setQuantidadeEstoque(75);

        // Atualizando o produto
        IProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.alterarProduto(p);

        // Buscando o produto para teste
        Produto produtoAlterado = produtoDAO.buscarProduto(1L);

        Assert.assertEquals(p.getId(), produtoAlterado.getId());
        Assert.assertEquals(p.getNome(), produtoAlterado.getNome());
        Assert.assertEquals(p.getPreco(), produtoAlterado.getPreco());
        Assert.assertEquals(p.getQuantidadeEstoque(), produtoAlterado.getQuantidadeEstoque());

    }

    @Test
    public void deletar(){

        // Buscar Produto e deletar
        IProdutoDAO produtoDAO = new ProdutoDAO();
        Produto p = produtoDAO.buscarProduto(1L);

        produtoDAO.deletar(p);

        Assert.assertNull(produtoDAO.buscarProduto(1L));

    }

}
