package com.nathan.produtoservice.service;

import com.nathan.produtoservice.DTO.ProdutoDTO;
import com.nathan.produtoservice.domain.Produto;
import com.nathan.produtoservice.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    // Listar
    public List<Produto> listar(){
        return produtoRepository.findAll();
    }

    // Buscar por id
    public Optional<Produto> buscar(Long id){
        return produtoRepository.findById(id);
    }

    // Cadastrar
    public Produto salvar(ProdutoDTO produtoDTO){
        Produto produto = new Produto();
        produto.setNome(produtoDTO.nome());
        produto.setPreco(produtoDTO.preco());
        produto.setDescricao(produtoDTO.descricao());
        return produtoRepository.save(produto);
    }

    // Editar
    public Produto editar(Long id, ProdutoDTO produtoDTO){

        // Buscar produto
        Optional<Produto> verificarProduto = produtoRepository.findById(id);

        if(verificarProduto.isPresent()){
            Produto produto = verificarProduto.get();
            produto.setNome(produtoDTO.nome());
            produto.setPreco(produtoDTO.preco());
            produto.setDescricao(produtoDTO.descricao());
            return produtoRepository.save(produto);
        }

        return null;
    }

    // Deletar
    public boolean deletar(Long id){
        if(produtoRepository.existsById(id)){
            produtoRepository.deleteById(id);
        }
        return produtoRepository.existsById(id);
    }

}
