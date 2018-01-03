/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Item;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author eric
 */
public class ItemDAO {
    
    private Connection con = null;
    
    public void insert(Item item){
        
        con = Conexao.getConexao();
        
        PreparedStatement stmt = null;
        
        String sql  = "INSERT INTO item (descricao, estoque, valor) VALUES (?, ?, ?)";
        
        try {
            
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, item.getDescricao());
            stmt.setInt(2, item.getEstoque());
            stmt.setDouble(3, item.getValor());
            
            stmt.executeUpdate();
            
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "INSERT ERROR : " + ex.getMessage());
        } finally {
            Conexao.fecharConexao(con, stmt);
        }
        
        
    } // fim do metodo insert
    
    public List<Item> selectItem(){
        
        con = Conexao.getConexao();
        
        List<Item> listaItens = new ArrayList<Item>();
        
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       String sql = "SELECT * FROM item";
       
       try {
           
           stmt = con.prepareStatement(sql);
           rs = stmt.executeQuery();
           
           while(rs.next()){
               
               Item item = new Item();
               
               item.setId(rs.getInt("id"));
               item.setDescricao(rs.getString("descricao"));
               item.setEstoque(rs.getInt("estoque"));
               item.setValor(rs.getDouble("valor"));
               
               listaItens.add(item);
               
           } // fim while
           
           
       } catch (SQLException ex){
           JOptionPane.showMessageDialog(null, "SELECT ERROR : " + ex.getMessage());
       } finally {
           Conexao.fecharConexao(con, stmt, rs);
       }
        
       return listaItens;
    } // fim do Metodo selectItem
    
    public void delete(Item item){
        
        con = Conexao.getConexao();
        
        PreparedStatement stmt = null;
        
        String sql = "DELETE FROM item WHERE id = ?";
        
        try {
            
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, item.getId());
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"DELETE ERROR : " + ex.getMessage());
        } finally {
            Conexao.fecharConexao(con, stmt);
        }
        
    } // fim do metodo delete
    
    public void update(Item item){
        
        con = Conexao.getConexao();
        
        PreparedStatement stmt = null;
        
        String sql = "UPDATE item SET descricao = ?, estoque = ?, valor = ? ";
        sql += "WHERE id = ?";
        
        try {
            
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, item.getDescricao());
            stmt.setInt(2, item.getEstoque());
            stmt.setDouble(3, item.getValor());
            stmt.setInt(4, item.getId());
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"UPDATE ERROR : " + ex);
        } finally {
            Conexao.fecharConexao(con, stmt);
        }
        
    } // fim do metodo update
    
}
