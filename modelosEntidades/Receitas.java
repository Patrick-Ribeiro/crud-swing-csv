/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvendas.temp.modelosEntidades;

/**
 *
 * @author dener
 */
public class Receitas {
    
    //Atributos
    private int id = 0;
    private String descricao;
    private float valor;
    private String data;
    
    //Construtores

    public Receitas() {
        
    }

    public Receitas(int id, String descricao, float valor, String data) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }
    
    //Metodos gets e sets 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    //Metodo toString

    @Override
    public String toString() {
        return "Receitas " + id + ";" + descricao + ";" + valor + ";" + data;
    }
    
    
}
