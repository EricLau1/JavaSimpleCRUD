
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 *
 * @author eric
 */



public class Conexao {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/loja_java";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    
    public static Connection getConexao(){
        
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL,USUARIO,SENHA);
            
        } catch (ClassNotFoundException | SQLException ex){
            throw new RuntimeException("Erro na conexão", ex);
        }
    }//fim do Método
    
    public static void fecharConexao(Connection conexao){
        
        if(conexao != null){
            try {
                conexao.close();
            } catch (SQLException e){
                JOptionPane.showMessageDialog(null,"Erro ao fechar a conexao", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }//fim do Método
    
    /* Sobrecarga */
    public static void fecharConexao(Connection c, PreparedStatement stmt){
        
        if(stmt != null){
            try {
                stmt.close();
            } catch (SQLException e){
                JOptionPane.showMessageDialog(null,"Erro ao fechar a conexao", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        } // fim if
        fecharConexao(c);
    }//fim do Método 
    
    /* Sobrecarga */
    public static void fecharConexao(Connection c, PreparedStatement s, ResultSet rs){
        
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e){
                JOptionPane.showMessageDialog(null,"Erro ao fechar a conexao", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        } // fim if
        fecharConexao(c, s);
    }// fim do Método
    
} // fim Class
