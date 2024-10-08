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

    // BUSCAR
    @Test
    public void buscarTest() {
        IContratoDao dao = new ContratoDaoMock();
        ContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Dados retornados com sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarComBancoDeDadosTest(){
        IContratoDao dao = new ContratoDao();
        ContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Dados retornados com sucesso", retorno);
    }

    // ATUALIZAR
    @Test
    public void atualizarTest() {
        IContratoDao dao = new ContratoDaoMock();
        ContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("Dados atualizados com sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarComBancoDeDadosTest(){
        IContratoDao dao = new ContratoDao();
        ContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("Dados atualizados com sucesso", retorno);
    }

    // EXCLUIR
    @Test
    public void excluirTest() {
        IContratoDao dao = new ContratoDaoMock();
        ContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Dados excluidos com sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirComBancoDeDadosTest(){
        IContratoDao dao = new ContratoDao();
        ContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Dados excluidos com sucesso", retorno);
    }

}
