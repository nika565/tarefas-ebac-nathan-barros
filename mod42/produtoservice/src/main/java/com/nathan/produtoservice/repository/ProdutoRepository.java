package com.nathan.produtoservice.repository;

import com.nathan.produtoservice.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
