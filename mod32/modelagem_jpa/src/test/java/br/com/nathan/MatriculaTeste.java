package br.com.nathan;

import br.com.nathan.dao.IMatriculaDAO;
import br.com.nathan.dao.MatriculaDAO;
import br.com.nathan.domain.Matricula;
import org.junit.Assert;
import org.junit.Test;

import java.time.Instant;

public class MatriculaTeste {

    private IMatriculaDAO matriculaDAO;

    public MatriculaTeste(){
        this.matriculaDAO = new MatriculaDAO();
    }

    @Test
    public void cadastrar(){
        Matricula matricula = new Matricula();
        matricula.setCodigo("A1");
        matricula.setDataMatricula(Instant.now());
        matricula.setStatus("ATIVA");
        matricula.setValor(2000d);

        matricula = matriculaDAO.cadastrar(matricula);

        Assert.assertNotNull(matricula);
        Assert.assertNotNull(matricula.getId());
    }

}
