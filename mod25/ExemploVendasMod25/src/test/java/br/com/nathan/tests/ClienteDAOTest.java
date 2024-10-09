package br.com.nathan.tests;

import br.com.nathan.project.DAO.ClienteDAO;
import br.com.nathan.project.DAO.ClienteDaoMock;
import br.com.nathan.project.DAO.IClienteDAO;
import br.com.nathan.project.domain.Cliente;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDAOTest {

    private IClienteDAO clienteDao;
    private Cliente cliente;

    public ClienteDAOTest() {
        clienteDao = new ClienteDaoMock();
    }

    @Before
    public void init() throws TipoChaveNaoEncontradaException {
        cliente = new Cliente();
        cliente.setCpf(1234567891L);
        cliente.setNome("Bella");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setNumero(10);
        cliente.setTel(12997161270l);

        clienteDao.cadastrar(cliente);

    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        Boolean retorno = clienteDao.cadastrar(cliente);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() {
        clienteDao.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Bella Cabral");
        clienteDao.alterar(cliente);

        Assert.assertEquals("Bella Cabral", cliente.getNome());
    }

}
