package br.com.nathan.tests;

import br.com.nathan.tarefa.dao.ClienteDao;
import br.com.nathan.tarefa.dao.ClienteDaoMock;
import br.com.nathan.tarefa.dao.IClienteDao;
import br.com.nathan.tarefa.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {

    // SALVAR
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

    // BUSCAR
    @Test
    public void buscarTest(){
        IClienteDao mock = new ClienteDaoMock();
        ClienteService service = new ClienteService(mock);
        String retorno = service.buscar();
        Assert.assertEquals("Dados retornados com sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscar(){
        IClienteDao mock = new ClienteDao();
        ClienteService service = new ClienteService(mock);
        String retorno = service.buscar();
        Assert.assertEquals("Dados retornados com sucesso", retorno);
    }

    // ATUALIZAR
    @Test
    public void atualizarTest(){
        IClienteDao mock = new ClienteDaoMock();
        ClienteService service = new ClienteService(mock);
        String retorno = service.atualizar();
        Assert.assertEquals("Dados atualizados", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizar(){
        IClienteDao mock = new ClienteDao();
        ClienteService service = new ClienteService(mock);
        String retorno = service.atualizar();
        Assert.assertEquals("Dados atualizados", retorno);
    }

    // EXCLUIR
    @Test
    public void excluirTest(){
        IClienteDao mock = new ClienteDaoMock();
        ClienteService service = new ClienteService(mock);
        String retorno = service.excluir();
        Assert.assertEquals("Dados excluidos", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluir(){
        IClienteDao mock = new ClienteDao();
        ClienteService service = new ClienteService(mock);
        String retorno = service.atualizar();
        Assert.assertEquals("Dados excluidos", retorno);
    }

}
