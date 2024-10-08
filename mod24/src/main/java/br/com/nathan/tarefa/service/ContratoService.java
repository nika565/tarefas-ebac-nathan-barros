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

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Dados retornados com sucesso";
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Dados atualizados com sucesso";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Dados excluidos com sucesso";
    }
}
