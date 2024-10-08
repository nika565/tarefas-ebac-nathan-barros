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

}
