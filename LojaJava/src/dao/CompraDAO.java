/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Compra;
import model.Item;


/**
 *
 * @author eric
 */
public class CompraDAO {
    
    private Connection con = null;

    public void insert(Compra compra){
        
        con = Conexao.getConexao();
        
        PreparedStatement stmt = null;
        
        String sql = "INSERT INTO compra (idCliente, idItem, qtd, dataHora) VALUES (?, ?, ?, now())";
        
        try {
            
            stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, compra.getCliente().getId());
            stmt.setInt(2, compra.getItem().getId());
            stmt.setInt(3, compra.getQtd());
            
            stmt.executeUpdate();
            
            baixaEstoque(compra, compra.getItem());
            
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "INSERT ERROR : " + ex.getMessage());
        } finally {
            Conexao.fecharConexao(con, stmt);
        }
    } // fim do metodo insert
    
    public List<Compra> selectCompra(){
        
        con = Conexao.getConexao();
        
        List<Compra> listaCompras = new ArrayList<Compra>();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        String sql = "SELECT codigo, cliente.id as idCliente, cliente.nome as cliente, ";
        sql += "item.id as idItem, item.descricao as item, ";
        sql += "compra.qtd as quantidade, compra.dataHora dataHora ";
        sql += "FROM compra INNER JOIN cliente ON cliente.id = compra.idCliente ";
        sql += "INNER JOIN item ON item.id = compra.idItem";
        
        try {
            
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Cliente c = new Cliente();
                Item i = new Item();
                Compra compra = new Compra();
                
                c.setId(rs.getInt("idCliente"));
                c.setNome(rs.getString("cliente"));
                
                i.setId(rs.getInt("idItem"));
                i.setDescricao(rs.getString("item"));
                
                compra.setCodigo(rs.getLong("codigo"));
                compra.setCliente(c);
                compra.setItem(i);
                compra.setQtd(rs.getInt("quantidade"));
                compra.setDataHora(rs.getString("dataHora"));
                
                listaCompras.add(compra);
            } // fim while
            
            
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "SELECT ERROR : " + ex.getMessage());
        } finally {
            
        }
        
        return listaCompras;
    }
    
    private void baixaEstoque(Compra c, Item i){
        
        con = Conexao.getConexao();
        
        PreparedStatement stmt = null;
        
        /* A quantidade comprada é subtraida da quantida de itens no estoque */
        String sql = "UPDATE item SET estoque = (estoque - ?) WHERE id = ?";
        
        try {
            
            stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, c.getQtd()); // quantidade comprada
            stmt.setInt(2, i.getId()); // id do item  que sera atualizado o estoque
            
            stmt.executeUpdate();
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR ESTOQUE : " + ex.getMessage());
        } finally {
            Conexao.fecharConexao(con, stmt);
        }
        
    }
    
    public void delete(Compra compra){
        
        con = Conexao.getConexao();
        
        PreparedStatement stmt = null;
        
        String sql = "DELETE FROM compra WHERE codigo = ?";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setLong(1, compra.getCodigo());
            stmt.executeUpdate();
                
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DELETE ERROR : " + ex.getMessage());
        } finally {
            Conexao.fecharConexao(con, stmt);
        }
        
    }
    
} // fim class
