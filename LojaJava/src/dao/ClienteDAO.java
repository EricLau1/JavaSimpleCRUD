/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eric
 */
public class ClienteDAO {
    
    private Connection con = null;
    
    public void insert(Cliente cliente){
        
        con = Conexao.getConexao();
        
        PreparedStatement stmt = null;
        
        String sql = "INSERT INTO cliente (nome, nascimento, telefone) VALUES (?, ?, ?)";
        
        try {
            
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, cliente.getNome());
            stmt.setDate(2, Date.valueOf(cliente.getNascimento()));
            stmt.setString(3, cliente.getTelefone());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, " Salvo com sucesso!");

        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "INSERT ERROR : " + ex.getMessage());
        } finally {
            Conexao.fecharConexao(con, stmt);
        }
    } // fim do metodo insert
    
    public List<Cliente> selectCliente(){
        
        con = Conexao.getConexao();
        
        List<Cliente> listaClientes = new ArrayList<Cliente>();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        String sql = "SELECT * FROM cliente";
        
        try {
            
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                
                Cliente cliente = new Cliente();
                
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setNascimento(rs.getDate("nascimento").toString());
                cliente.setTelefone(rs.getString("telefone"));
                
                listaClientes.add(cliente);
            } //fim while
            
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "SELECT ERROR : " + ex.getMessage());
        } finally {
            Conexao.fecharConexao(con, stmt, rs);
        }
        
        return listaClientes;
    } // fim do método select
    
    public void delete(Cliente cliente) {
        
        con = Conexao.getConexao();
        
        PreparedStatement stmt = null;
        
        String sql = "DELETE FROM cliente WHERE id = ?";
        
        try {
            
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, cliente.getId());
            stmt.executeUpdate();
        
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "DELETE ERROR : " + ex.getMessage());
        } finally {
            Conexao.fecharConexao(con, stmt);
        }
        
    } // fim metodo delete
    
    public void update(Cliente cliente){
        
        con = Conexao.getConexao();
        
        PreparedStatement stmt = null;
        
        String sql = "UPDATE cliente SET nome = ?, nascimento = ?, telefone = ? ";
        sql += "WHERE id = ?";
        
        try {
            
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, cliente.getNome());
            stmt.setDate(2, Date.valueOf(cliente.getNascimento())); 
            stmt.setString(3, cliente.getTelefone());
            stmt.setInt(4, cliente.getId());
            
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "UPDATE ERROR : " + ex.getMessage());
        } finally {
            Conexao.fecharConexao(con, stmt);
        }
        
    } // fim do metodo update
    
} // fim class
