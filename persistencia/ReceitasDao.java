/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvendas.temp.persistencia;
import appvendas.temp.modelosInterfaces.IReceitasDao;
import appvendas.temp.modelosEntidades.Receitas;
import java.util.ArrayList;

// Biblioteca para manupulacao de arquivo texto no disco
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import appvendas.temp.modelosEntidades.Receitas;
/**
 *
 * @author dener
 */
public class ReceitasDao implements IReceitasDao {
    
    //Atributos 
    private String ReceitasTxt = "";
    
    //Construtor

    public ReceitasDao(String ReceitasTxt) {
        this.ReceitasTxt = ReceitasTxt;
    }

    @Override
    public void criar(Receitas objeto) throws Exception {
         try {
            //Criar o arquivo
            FileWriter fw = new FileWriter(ReceitasTxt,true);
            //Criar o buffer do arquivo
            BufferedWriter bw = new BufferedWriter(fw);
            //Escrevendo no arquivo
            bw.write(objeto.toString()+ "\n");
            //fechar o arquivo
            bw.close();
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
     try {
            ArrayList<Receitas> arrayDosBancos = listagem();
            //Criar o arquivo
            FileWriter fw = new FileWriter(ReceitasTxt);
            //Criar o buffer do arquivo
            BufferedWriter bw = new BufferedWriter(fw);
            //Escrevendo no arquivo
            for(int pos = 0; pos < arrayDosBancos.size(); pos++){
                if(id != arrayDosBancos.get(pos).getId()){
                    bw.write(arrayDosBancos.get(pos).toString()+ "\n");
                }
            }
            //fechar o arquivo
            bw.close();
        } catch (Exception erro) {
            throw erro;
        }    
    }

    @Override
    public Receitas consultarPorId(int id) throws Exception {
         BufferedReader br = null;
        try {
            //Abrir o arquivo
            FileReader fr = new FileReader(ReceitasTxt);
            //Criar o buffer do arquivo
            br = new BufferedReader(fr);
            String linha = "";
            Receitas aux = new Receitas();
            while((linha = br.readLine())!=null){
                String vetorString[] = linha.split(";");
                int identificador = Integer.parseInt(vetorString[0]);
                String nomeDoBanco = vetorString[1];
                aux.setId(identificador);
                aux.setDescricao(nomeDoBanco);
                if(aux.getId() == id) return aux;
            }
            aux = null;
            return aux;
        } catch (Exception erro) {
            throw erro;
        }finally{
            br.close();
        }
    }

    @Override
    public ArrayList<Receitas> listagem() throws Exception {
         try {
            ArrayList<Receitas> arrayDasReceitas = new ArrayList();
            //Abrir o arquivo
            FileReader fr = new FileReader(ReceitasTxt);
            //Criar o buffer do arquivo
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while((linha = br.readLine())!=null){
                Receitas aux = new Receitas();
                String vetorString[] = linha.split(";");
                int identificador = Integer.parseInt(vetorString[0]);
                String nomeDoBanco = vetorString[1];
                aux.setId(identificador);
                aux.setDescricao(nomeDoBanco);
                arrayDasReceitas.add(aux);
            }
            br.close();
            return arrayDasReceitas;
        } catch (Exception erro) {
            throw erro;
        }
    }
    
}
