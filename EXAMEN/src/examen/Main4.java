package examen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main4 {

    public static void main(String[] args) throws SQLException {
        
       String servidor = "jdbc:mysql://192.168.126.245:3306/";
       String bdades = "gbd";
       String usuari = "root";
       String contrase?a = "" ;
        
       sql = "SELECT ALL FROM vehicles WHERE any >= 2020";
       try ( Connection connexio = DriverManager.getConnection(servidor+bdades, usuari, contrase?a);
             Statement statement = connexio.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
        System.out.println("Connexió amb la base de dades MySQL exitosa.");
        while (resultSet.next()) {
            System.out.println( resultSet.getString("matricula") + "\t" +
                                resultSet.getString("marca")  + "\t" +
                                resultSet.getString("model")  + "\t" +  
                                resultSet.getInt("any")  + "\t" +
                                resultSet.getDouble("preu")
                                
                              );
        }

        System.out.println("Connexió tancada.");
    } catch (SQLException e) {
        System.err.println("Error al conectarse a la base de dades: " + e.getMessage());
    }
  
        
        
    }
    
}