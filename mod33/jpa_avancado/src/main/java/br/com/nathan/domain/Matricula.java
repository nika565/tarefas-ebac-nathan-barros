package br.com.nathan.domain;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "TB_MATRICULA")
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CODIGO", length = 10, nullable = false, unique = true)
    private String codigo;

    @Column(name = "DATA_MATRICULA", nullable = false)
    private Instant dataMatricula;

    @Column(name = "VALOR", nullable = false)
    private Double valor;

    @Column(name = "STATUS_MATRICULA", nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name = "id_curso_fk",
        foreignKey = @ForeignKey(name = "fk_curso_matricula"),
        referencedColumnName = "id", nullable = false
    )
    private Curso curso;

    @OneToOne
    @JoinColumn(name = "id_aluno_fk",
        foreignKey = @ForeignKey(name = "fk_aluno_matricula"),
        referencedColumnName = "id", nullable = false
    )
    private Aluno aluno;

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

    public Instant getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Instant dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}