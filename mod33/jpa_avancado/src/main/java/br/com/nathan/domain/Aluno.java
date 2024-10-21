package br.com.nathan.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "TB_ALUNO")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CODIGO", length = 10, nullable = false, unique = true)
    private String codigo;

    @Column(name = "NOME", length = 10, nullable = false)
    private String nome;

    @OneToOne(mappedBy = "aluno")
    private Matricula matricula;

    @ManyToMany
    @JoinTable(name = "TB_ALUNO_COMPUTADOR",
            joinColumns = { @JoinColumn(name = "id_aluno_fk") },
            inverseJoinColumns = { @JoinColumn(name = "id_computador_fk") }
    )
    private List<Computador> computadores;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public List<Computador> getComputadores() {
        return computadores;
    }

    public void setComputadores(List<Computador> computadores) {
        this.computadores = computadores;
    }
}
