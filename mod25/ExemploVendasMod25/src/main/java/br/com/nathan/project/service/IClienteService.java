package br.com.nathan.project.service;

import br.com.nathan.project.domain.Cliente;

public interface IClienteService {
    public Boolean salvar(Cliente cliente);
    public Cliente buscarPorCpf(Long cpf);
    public void excluir(Long cpf);
    public void alterar(Cliente cliente);
}
