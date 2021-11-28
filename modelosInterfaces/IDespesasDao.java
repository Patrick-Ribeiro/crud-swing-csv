/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvendas.temp.modelosInterfaces;

import appvendas.temp.modelosEntidades.Despesas;
import java.util.ArrayList;
/**
 *
 * @author dener
 */
public interface IDespesasDao {
    
    Despesas criar(Despesas objeto) throws Exception;
    void atualizar(int id, Despesas despesaAtualizada) throws Exception;
    void deletarPorId(int id) throws Exception;
    Despesas consultarPorId(int id) throws Exception;
    ArrayList<Despesas> listagem() throws Exception;
}
