package br.com.nathan;

import br.com.nathan.dao.CursoDAO;
import br.com.nathan.dao.ICursoDAO;
import br.com.nathan.domain.Curso;
import org.junit.Assert;
import org.junit.Test;

public class CursoTeste {

    private ICursoDAO cursoDAO;

    public CursoTeste() {
        cursoDAO = new CursoDAO();
    }

    @Test
    public void cadastrar() {
        Curso curso = new Curso();
        curso.setCodigo("A2");
        curso.setNome("Curso de React JS");
        curso.setDescricao("CURSO TESTE");
        curso = cursoDAO.cadastrar(curso);

        Assert.assertNotNull(curso);
        Assert.assertNotNull(curso.getId());
    }

}
