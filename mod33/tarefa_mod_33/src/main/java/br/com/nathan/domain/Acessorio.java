package br.com.nathan.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "TB_ACESSORIO")
public class Acessorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME", length = 50, nullable = false)
    private String nome;

    @ManyToMany(mappedBy = "acessorios")
    private List<Carro> carros;
}
