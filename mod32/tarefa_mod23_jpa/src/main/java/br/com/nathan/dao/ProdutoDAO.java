package br.com.nathan.dao;

import br.com.nathan.domain.Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ProdutoDAO implements IProdutoDAO{

    @Override
    public void cadastrar(Produto produto) {

        // Iniciando configuração do banco
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tarefa_ebac");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Transação
        entityManager.getTransaction().begin();
        entityManager.persist(produto);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

    }

    @Override
    public Produto buscarProduto(Long id) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tarefa_ebac");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Produto produto = entityManager.find(Produto.class, id);

        entityManager.close();
        entityManagerFactory.close();

        return produto;

    }

    @Override
    public void alterarProduto(Produto p) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tarefa_ebac");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        // Buscar Produto para editar
        Produto produto = entityManager.find(Produto.class, p.getId());

        // Atualizando as informações
        produto.setNome(p.getNome());
        produto.setPreco(p.getPreco());
        produto.setQuantidadeEstoque(p.getQuantidadeEstoque());

        // Atualizando
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

    }

    @Override
    public void deletar(Produto p) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tarefa_ebac");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        Produto produto = entityManager.find(Produto.class, p.getId());

        entityManager.remove(produto);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }
}
