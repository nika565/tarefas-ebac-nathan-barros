package com.nathan.produtoservice.controller;

import com.nathan.produtoservice.DTO.ProdutoDTO;
import com.nathan.produtoservice.domain.Produto;
import com.nathan.produtoservice.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @GetMapping
    public List<Produto> listarProdutos(){
        return produtoService.listar();
    }

    @GetMapping("/{id}")
    public Optional<Produto> buscarProduto(@PathVariable Long id){
        return produtoService.buscar(id);
    }

    @PostMapping
    public Produto salvarProduto(@RequestBody ProdutoDTO produtoDTO){
        return produtoService.salvar(produtoDTO);
    }

    @PutMapping("/{id}")
    public Produto editarProduto(@PathVariable Long id, @RequestBody ProdutoDTO produtoDTO){
        return produtoService.editar(id, produtoDTO);
    }

    @DeleteMapping("/{id}")
    public String deletarProduto(@PathVariable Long id){
        boolean verificarProduto = produtoService.deletar(id);

        if(verificarProduto) return "Não foi possível deletar o produto...";

        return "Produto deletado com sucesso";

    }

}
