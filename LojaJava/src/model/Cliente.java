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
public class Cliente {
    
    //Atributos
    private int id;
    private String nome;
    private String nascimento;
    private String telefone;
    
    //Construtores
    public Cliente (){
        this.id = 0;
        this.nome = "nao informado";
        this.nascimento = "2018-01-01";
        this.telefone = "nao informado";
    } // fim construtor sem parametros
    
    /* Sobrecarga ~ construtor com parametros */
    public Cliente(int id, String nome, String nascimento, String telefone){
        this.id = id;
        this.nome = nome;
        this.nascimento = nascimento;
        this.telefone = telefone;
    }
    
    // Métodos acessores
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setNascimento(String nascimento){
        this.nascimento = nascimento;
    }
    public String getNascimento(){
        return this.nascimento;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getTelefone(){
        return this.telefone;
    }
    
    @Override
    public String toString(){
        return this.getNome();
    }
}// fim Class

