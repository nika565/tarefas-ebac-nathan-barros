package br.com.nathan.project.service;

import br.com.nathan.project.domain.Cliente;

public interface IClienteService {

    public void salvar(Cliente cliente);
    public Cliente buscarPorCpf(Long cpf);

}
