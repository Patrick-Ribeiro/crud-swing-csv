/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvendas.temp.modelosInterfaces;
import appvendas.temp.modelosEntidades.Receitas;
import java.util.ArrayList;
/**
 *
 * @author dener
 */
public interface IReceitasDao {
    
    void criar(Receitas objeto) throws Exception;
    void atualizar(Receitas objeto) throws Exception;
    void deletarPorId(int id) throws Exception;
    Receitas consultarPorId(int id) throws Exception;
    ArrayList<Receitas> listagem() throws Exception;
}
