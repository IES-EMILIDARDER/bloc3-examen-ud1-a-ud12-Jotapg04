package examen;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Main5 {
    
    public static void main(String[] args) throws SQLException {

       String servidor = "jdbc:mysql://192.168.126.245:3306/";
       String bdades = "gbd";
       String usuari = "root";
       String contrase?a = "" ;
        
       sql = "INSERT INTO vehicles (matricula, marca, model, any, preu) VALUES ("4321-JKL", "Ford","Focus",2019,17000)";
       try ( Connection connexio = DriverManager.getConnection(servidor+bdades, usuari, contrase?a);
            Statement statement = connexio.createStatement()) {
           
        try (PreparedStatement statement = connexio.prepareStatement(sql))
            connexio.commit();
        } catch (SQLException e) {
            connexio.rollback();
        }
  
       }
    }
}
