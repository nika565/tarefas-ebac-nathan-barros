package br.com.nathan.tarefa.service;

import br.com.nathan.tarefa.dao.IClienteDao;

public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao dao){
        this.clienteDao = dao;
    }

    public String salvar(){
        this.clienteDao.salvar();
        return "Sucesso";
    }

    public String buscar(){
        this.clienteDao.buscar();
        return "Dados retornados com sucesso";
    }

    public String atualizar(){
        this.clienteDao.atualizar();
        return "Dados atualizados";
    }

    public String excluir(){
        this.clienteDao.excluir();
        return "Dados excluidos";
    }

}
