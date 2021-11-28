/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvendas.temp.modelosEntidades;

import java.util.Date;

/**
 *
 * @author dener
 */
public class Despesas {

    //Atributos
    private int id = 0;
    private String descricao;
    private float valor;
    private String data;

    //Construtores
    public Despesas() {
    }

    public Despesas(int id, String descricao, float valor, String data) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }

    public Despesas(String[] csv) {
        this.id = Integer.parseInt(csv[0]);
        this.descricao = csv[1];
        this.valor = Float.parseFloat(csv[2]);
        this.data = csv[3];
    }

    public int getId() {
        return id;
    }

    //Metodos get e sets
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

    //Metodo toSting
    @Override
    public String toString() {
        return id + ";" + descricao + ";" + valor + ";" + data;
    }

}
