package br.com.nathan.dao;

import br.com.nathan.domain.Produto;

public interface IProdutoDAO {

    public void cadastrar(Produto produto);

    public Produto buscarProduto(Long id);

    public void alterarProduto(Produto produto);

    public void deletar(Produto produto);

}
