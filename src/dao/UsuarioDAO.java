package dao;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException; 
import tela.ControllerUsuario;
public class UsuarioDAO { 
     
    public void adiciona(ControllerUsuario usuario){ 
        try {
            System.out.println(usuario.getNome());
            System.out.println(usuario.getSenha());
            final String url = "jdbc:mysql://g84t6zfpijzwx08q.cbetxkdyhwsb.us-east-1.rds.amazonaws.com/umd3cq1j5wexzz4d?useUnicode=true&characterEncoding=utf-8";
            final String user = "sgsiihodbv1c08mj";
            final String pass = "zxkuwxse8ddlrata";
            Connection connection = DriverManager.getConnection(url, user, pass);
            String sql = "INSERT INTO usuarios(nome,senha) VALUES(?,?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSenha());
            stmt.execute();
            stmt.close();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        
    } 
}
