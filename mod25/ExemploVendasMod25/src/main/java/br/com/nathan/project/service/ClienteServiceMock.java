package br.com.nathan.project.service;

import br.com.nathan.project.domain.Cliente;

public class ClienteServiceMock implements IClienteService{
    @Override
    public void salvar(Cliente cliente) {

    }

    @Override
    public Cliente buscarPorCpf(Long cpf) {
        return null;
    }
}
