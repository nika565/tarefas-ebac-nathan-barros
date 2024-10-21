package br.com.nathan;

import br.com.nathan.dao.*;
import br.com.nathan.domain.Aluno;
import br.com.nathan.domain.Curso;
import br.com.nathan.domain.Matricula;
import org.junit.Assert;
import org.junit.Test;

import java.time.Instant;

public class MatriculaTeste {

    private IMatriculaDAO matriculaDAO;
    private ICursoDAO cursoDAO;
    private IAlunoDAO alunoDAO;

    public MatriculaTeste(){
        this.matriculaDAO = new MatriculaDAO();
        this.cursoDAO = new CursoDAO();
        this.alunoDAO = new AlunoDAO();
    }

    @Test
    public void cadastrar(){

        Curso curso = criarCurso("A5");
        Aluno aluno = criarAluno("A2");

        Matricula matricula = new Matricula();
        matricula.setCodigo("A3");
        matricula.setDataMatricula(Instant.now());
        matricula.setStatus("ATIVA");
        matricula.setValor(2000d);
        matricula.setCurso(curso);
        aluno.setMatricula(matricula);
        matricula.setAluno(aluno);

        matricula = matriculaDAO.cadastrar(matricula);

        Assert.assertNotNull(matricula);
        Assert.assertNotNull(matricula.getId());
    }

    private Aluno criarAluno(String codigoAluno) {
        Aluno aluno = new Aluno();
        aluno.setCodigo(codigoAluno);
        aluno.setNome("Nathan");
        aluno.setMatricula(null);
        return alunoDAO.cadastrar(aluno);
    }

    private Curso criarCurso(String codigo){
        Curso curso = new Curso();
        curso.setCodigo(codigo);
        curso.setNome("Curso de C# Backend");
        curso.setDescricao("CURSO TESTE");
        return cursoDAO.cadastrar(curso);
    }

}
