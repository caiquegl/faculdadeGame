package tela;
import factory.ConnectionFactory;
import java.sql.*;
import java.sql.PreparedStatement;
public class ControllerDb { 
    private Connection connection;
     public ControllerDb(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 
     
    public void adiciona(ControllerUsuario usuario){ 
        String sql = "INSERT INTO usuarios(nome,senha) VALUES(?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSenha());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
}
