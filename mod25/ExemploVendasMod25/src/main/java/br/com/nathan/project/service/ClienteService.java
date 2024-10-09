package br.com.nathan.project.service;

import br.com.nathan.project.DAO.ClienteDAO;
import br.com.nathan.project.DAO.IClienteDAO;
import br.com.nathan.project.domain.Cliente;

public class ClienteService implements IClienteService{

    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;                           ;
    }

    @Override
    public Boolean salvar(Cliente cliente) {
        clienteDAO.salvar(cliente);
        return true;
    }

    @Override
    public Cliente buscarPorCpf(Long cpf) {
        return clienteDAO.buscarPorCpf(cpf);
    }

    @Override
    public void excluir(Long cpf) {
        //clienteDAO.excluir(cpf);
    }

    @Override
    public void alterar(Cliente cliente) {
        clienteDAO.alterar(cliente);
    }


}
