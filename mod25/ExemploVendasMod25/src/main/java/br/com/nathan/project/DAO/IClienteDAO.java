package br.com.nathan.project.DAO;

import br.com.nathan.project.domain.Cliente;

public interface IClienteDAO {
    void salvar(Cliente cliente);
    Cliente buscarPorCpf(Long cpf);
}
