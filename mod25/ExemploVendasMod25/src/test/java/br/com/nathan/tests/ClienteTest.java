package br.com.nathan.tests;

import br.com.nathan.project.DAO.ClienteDaoMock;
import br.com.nathan.project.DAO.IClienteDAO;
import br.com.nathan.project.domain.Cliente;
import br.com.nathan.project.service.ClienteService;
import br.com.nathan.project.service.ClienteServiceMock;
import br.com.nathan.project.service.IClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {

    private IClienteService clienteService;

    public ClienteTest(){
        IClienteDAO dao = new ClienteDaoMock();
        this.clienteService = new ClienteService(dao);
    }

    @Test
    public void pesquisarCliente(){
        Cliente cliente = new Cliente();
        cliente.setNome("Nathan");
        cliente.setCpf(12345678910L);
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(11912345678L);

        clienteService.salvar(cliente);
        Cliente clienteConsultado = clienteService.buscarPorCpf(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }

}
