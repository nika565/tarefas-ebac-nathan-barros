package br.com.nathan.project.DAO;

import br.com.nathan.project.domain.Cliente;

public class ClienteDaoMock implements IClienteDAO{
    @Override
    public void salvar(Cliente cliente) {

    }

    @Override
    public Cliente buscarPorCpf(Long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
    }
}
