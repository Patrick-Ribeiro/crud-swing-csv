/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvendas.temp.controle;

import java.util.ArrayList;
import appvendas.temp.modelosEntidades.Despesas;
import appvendas.temp.modelosInterfaces.IDespesasDao;
import appvendas.temp.persistencia.DespesasDao;

/**
 *
 * @author dener
 */
public class DespesasControle implements IDespesasDao {

    IDespesasDao objDespesasDao = new DespesasDao("DadosDasDespesas/Despesas.txt");

    @Override
    public Despesas criar(Despesas objeto) throws Exception {
        Despesas aux = objDespesasDao.consultarPorId(objeto.getId());
        if (aux == null) {
            return objDespesasDao.criar(objeto);
        } else {
            throw new Exception("Este id de Despesas já consta nos arquivos");
        }
    }

    @Override
    public void atualizar(int id, Despesas objeto) throws Exception {
        objDespesasDao.atualizar(id, objeto);
    }

    @Override
    public void deletarPorId(int id) throws Exception {
        objDespesasDao.deletarPorId(id);
    }

    @Override
    public Despesas consultarPorId(int id) throws Exception {
        return objDespesasDao.consultarPorId(id);
    }

    @Override
    public ArrayList<Despesas> listagem() throws Exception {
        return objDespesasDao.listagem();
    }

}
