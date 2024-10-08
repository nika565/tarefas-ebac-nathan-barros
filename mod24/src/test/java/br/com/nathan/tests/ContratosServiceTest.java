package br.com.nathan.tests;

import br.com.nathan.tarefa.dao.ContratoDao;
import br.com.nathan.tarefa.dao.ContratoDaoMock;
import br.com.nathan.tarefa.dao.IContratoDao;
import br.com.nathan.tarefa.service.ContratoService;
import br.com.nathan.tarefa.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratosServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        ContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest(){
        IContratoDao dao = new ContratoDao();
        ContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

}
