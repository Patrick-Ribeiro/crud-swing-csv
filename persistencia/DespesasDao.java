/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvendas.temp.persistencia;

import appvendas.temp.modelosInterfaces.IDespesasDao;
import appvendas.temp.modelosEntidades.Despesas;
import java.util.ArrayList;

// Biblioteca para manupulacao de arquivo texto no disco
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author dener
 */
public class DespesasDao implements IDespesasDao {

    //Atributos 
    private String DespesasTxt = "";

    //Construtor
    public DespesasDao(String DespesasTxt) {
        this.DespesasTxt = DespesasTxt;
    }

    @Override
    public Despesas criar(Despesas objeto) throws Exception {
        ArrayList<Despesas> despesasCadastradas = listagem();
        int novoId = despesasCadastradas.size() + 1;
        objeto.setId(novoId);
        try {
            //Criar o arquivo
            FileWriter fw = new FileWriter(DespesasTxt, true);
            //Criar o buffer do arquivo
            BufferedWriter bw = new BufferedWriter(fw);
            //Escrevendo no arquivo
            bw.write(objeto.toString() + "\n");
            //fechar o arquivo
            bw.close();
            return consultarPorId(novoId);
        } catch (Exception erro) {
            System.out.println("DEU ERRO NO CRIAR DO CONTROLE");
            throw erro;
        }
    }

    /**
     * Este método cria um arquivo temporário e escreve os dados do arquivo
     * original neste temporário Alterando a despesa a ser atualizada com o
     * valor do parâmetro despesaAtualizada
     */
    @Override
    public void atualizar(int id, Despesas despesaAtualizada) throws Exception {
        BufferedWriter bwArquivoTemp = null;
        BufferedReader brArquivoOriginal = null;
        try {
            File arquivoOriginal = new File(DespesasTxt);
            FileReader frArquivoOriginal = new FileReader(arquivoOriginal);
            brArquivoOriginal = new BufferedReader(frArquivoOriginal);

            File arquivoTemporario = new File("./DadosDasDespesas/DespesasTEMP.txt");
            FileWriter fwArquivoTemp = new FileWriter(arquivoTemporario, true);
            bwArquivoTemp = new BufferedWriter(fwArquivoTemp);

            String linha = "";
            while ((linha = brArquivoOriginal.readLine()) != null) {
                String[] csv = linha.split(";");
                Despesas despesaOriginal = new Despesas(csv);

                if (despesaOriginal.getId() == id) { // se for a despesa a ser atualizada, passa as informações atualizadas
                    despesaAtualizada.setId(id);
                    bwArquivoTemp.write(despesaAtualizada.toString() + "\n");
                } else { // caso contrário escreve as informações anteriores
                    bwArquivoTemp.write(despesaOriginal.toString() + "\n");
                }
            }
            arquivoTemporario.renameTo(arquivoOriginal);
        } catch (Exception e) {
            throw e;
        } finally {
            brArquivoOriginal.close();
            bwArquivoTemp.close();
        }
    }

    @Override
    public void deletarPorId(int id) throws Exception {
        try {
            ArrayList<Despesas> arrayDosBancos = listagem();
            //Criar o arquivo
            FileWriter fw = new FileWriter(DespesasTxt);
            //Criar o buffer do arquivo
            BufferedWriter bw = new BufferedWriter(fw);
            //Escrevendo no arquivo
            for (int pos = 0; pos < arrayDosBancos.size(); pos++) {
                if (id != arrayDosBancos.get(pos).getId()) {
                    bw.write(arrayDosBancos.get(pos).toString() + "\n");
                }
            }
            //fechar o arquivo
            bw.close();
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public Despesas consultarPorId(int id) throws Exception {
        BufferedReader br = null;
        try {
            //Abrir o arquivo
            FileReader fr = new FileReader(DespesasTxt);
            //Criar o buffer do arquivo
            br = new BufferedReader(fr);
            String linha = "";
            Despesas aux = new Despesas();
            while ((linha = br.readLine()) != null) {
                String vetorString[] = linha.split(";");
                aux = new Despesas(vetorString);
                if (aux.getId() == id) {
                    return aux;
                }
            }
            aux = null;
            return aux;
        } catch (Exception erro) {
            throw erro;
        } finally {
            br.close();
        }
    }

    @Override
    public ArrayList<Despesas> listagem() throws Exception {
        try {
            ArrayList<Despesas> arrayDasDespesas = new ArrayList<>();
            //Abrir o arquivo
            FileReader fr = new FileReader(DespesasTxt);
            //Criar o buffer do arquivo
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Despesas aux = new Despesas();
                String vetorString[] = linha.split(";");
                int identificador = Integer.parseInt(vetorString[0]);
                String nomeDoBanco = vetorString[1];
                aux.setId(identificador);
                aux.setDescricao(nomeDoBanco);
                arrayDasDespesas.add(aux);
            }
            br.close();
            return arrayDasDespesas;
        } catch (Exception erro) {
            throw erro;
        }
    }

    public void corromperBanco() {

    }

}
