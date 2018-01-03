/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author eric
 */
public class Item {
    
    private int id;
    private String descricao;
    private int estoque;
    private double valor;
    
    public Item(){
        this.id = 0;
        this.descricao = "nao informado";
        this.estoque = 0;
        this.valor = 0.0;
    }
    
    public Item(int id, String descricao, int estoque, double valor){
        this.id = id;
        this.descricao = descricao;
        this.estoque = estoque;
        this.valor = valor;
    }
    
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return this.descricao;
    }
    
    public void setEstoque(int estoque){
        this.estoque = estoque;
    }
    public int getEstoque(){
        return this.estoque;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    public  double getValor(){
        return this.valor;
    }
    
    @Override
    public String toString(){
        return this.descricao;
    }
    
}
