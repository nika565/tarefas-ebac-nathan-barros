package br.com.nathan.project.service;

import br.com.nathan.project.domain.Cliente;

public class ClienteServiceMock implements IClienteService{
    @Override
    public Boolean salvar(Cliente cliente) {
        return true;
    }

    @Override
    public Cliente buscarPorCpf(Long cpf) {
        return null;
    }

    @Override
    public void excluir(Long cpf) {

    }

    @Override
    public void alterar(Cliente cliente) {

    }


}
