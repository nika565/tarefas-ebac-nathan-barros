package br.com.nathan.tarefa.service;

import br.com.nathan.tarefa.dao.IContratoDao;

public class ContratoService implements IContratoService{

    private IContratoDao contratoDao;
    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }
}
