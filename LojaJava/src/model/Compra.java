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
public class Compra {
    
    private long codigo;
    private Cliente cliente;
    private Item item;
    private int qtd;
    private String dataHora;
    
    public Compra(){
        this.codigo = 0;
        this.cliente = null;
        this.item = null;
        this.qtd = 0;
        this.dataHora = "";
    }
    
    public Compra(long codigo, Cliente c, Item i, int q, String d){
        this.codigo = codigo;
        this.cliente = c;
        this.item = i;
        this.qtd = q;
        this.dataHora = d;
        
    }
    
    public void setCodigo(long codigo){
        this.codigo = codigo;
    }
    public long getCodigo(){
        return this.codigo;
    }
    
    public void setCliente(Cliente c){
        this.cliente = c;
    }
    public Cliente getCliente(){
        return this.cliente;
    }
    
    public void setItem(Item i){
        this.item = i;
    }
    public Item getItem(){
        return this.item;
    }
    
    public void setQtd(int q){
        this.qtd = q;
    }
    public int getQtd(){
        return this.qtd;
    }
    
    public void setDataHora(String d){
        this.dataHora = d;
    }
    public String getDataHora(){
        return this.dataHora;
    }
    
} // fim class
