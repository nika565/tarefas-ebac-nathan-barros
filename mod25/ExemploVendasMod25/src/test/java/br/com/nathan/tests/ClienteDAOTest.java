package br.com.nathan.tests;

import br.com.nathan.project.DAO.ClienteDAO;
import br.com.nathan.project.DAO.ClienteDaoMock;
import br.com.nathan.project.DAO.IClienteDAO;
import br.com.nathan.project.domain.Cliente;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDAOTest {

    private IClienteDAO clienteDAO;
    private Cliente cliente;

    public ClienteDAOTest(){
        this.clienteDAO = new ClienteDaoMock();
    }

    @Before
    public void init(){
        cliente = new Cliente();
        cliente.setNome("Nathan");
        cliente.setCpf(12345678910L);
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(11912345678L);

        clienteDAO.salvar(cliente);
    }

    @Test
    public void pesquisarCliente(){
        Cliente clienteConsultado = clienteDAO.buscarPorCpf(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void excluirCliente() {
        clienteDAO.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() {
        cliente.setNome("Dante Barros");
        clienteDAO.alterar(cliente);

        Assert.assertEquals("Dante Barros", cliente.getNome());
    }

}
