package br.com.nathan.tests;

import br.com.nathan.tarefa.dao.ClienteDao;
import br.com.nathan.tarefa.dao.ClienteDaoMock;
import br.com.nathan.tarefa.dao.IClienteDao;
import br.com.nathan.tarefa.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {

    @Test
    public void salvarTest(){
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

}
