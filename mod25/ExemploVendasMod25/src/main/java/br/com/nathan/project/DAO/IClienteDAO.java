package br.com.nathan.project.DAO;

import br.com.nathan.project.domain.Cliente;

public interface IClienteDAO {
    Boolean salvar(Cliente cliente);
    Cliente buscarPorCpf(Long cpf);
    void excluir(Long cpf);
    void alterar(Cliente cliente);
}
