/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvendas.temp.controle;

import java.util.ArrayList;
import appvendas.temp.modelosEntidades.Receitas;
import appvendas.temp.modelosInterfaces.IReceitasDao;
import appvendas.temp.persistencia.ReceitasDao;

/**
 *
 * @author dener
 */
public class ReceitasControle implements IReceitasDao {

    ReceitasDao objReceitasDao = new ReceitasDao("./DadosDasReceitas/Receitas.txt");
    
    
    @Override
    public void criar(Receitas objeto) throws Exception {
         try {
            Receitas aux = objReceitasDao.consultarPorId(objeto.getId());
            if(aux == null){
                objReceitasDao.criar(objeto);
            }else{
                throw new Exception("Este id de Despesas já consta nos arquivos");
            }     
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public void atualizar(Receitas objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletarPorId(int id) throws Exception {
         objReceitasDao.deletarPorId(id);
    }

    @Override
    public Receitas consultarPorId(int id) throws Exception {
         return objReceitasDao.consultarPorId(id);
    }

    @Override
    public ArrayList<Receitas> listagem() throws Exception {
        return objReceitasDao.listagem();
    }
    
}
