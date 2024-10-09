package br.com.nathan.tests;

import br.com.nathan.project.DAO.ClienteDaoMock;
import br.com.nathan.project.DAO.IClienteDAO;
import br.com.nathan.project.domain.Cliente;
import br.com.nathan.project.service.ClienteService;
import br.com.nathan.project.service.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteServiceTest {

    private IClienteService clienteService;
    private Cliente cliente;

    public ClienteServiceTest(){
        IClienteDAO dao = new ClienteDaoMock();
        this.clienteService = new ClienteService(dao);
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

        clienteService.salvar(cliente);
    }

    @Test
    public void pesquisarCliente(){
        Cliente clienteConsultado = clienteService.buscarPorCpf(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() {
        Boolean retorno = clienteService.salvar(cliente);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente(){
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente(){
        cliente.setNome("Dante Barros");
        clienteService.alterar(cliente);

        Assert.assertEquals("Dante Barros", cliente.getNome());
    }

}
