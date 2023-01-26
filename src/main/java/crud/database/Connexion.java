package crud.database;

import com.mysql.cj.jdbc.exceptions.CommunicationsException;

import java.sql.*;
import java.util.ResourceBundle;

public class Connexion {
    public Connexion() throws SQLException {
    }

    public static void connect() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("probleme chargement sur driver");
            System.exit(-1);
        }

        System.out.println("Le driver est chargÃ© !!!");
        ResourceBundle bundle = ResourceBundle.getBundle("db");
        // url de connexion
        String host = bundle.getString("db.host");
        String dbName = bundle.getString("db.dbase");
        String port = bundle.getString("db.port");
        String URL = "jdbc:mysql://" + host + ":" + port + "/" + dbName;
        //
        String username = bundle.getString("db.user");
        String password = bundle.getString("db.pass");
        //
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, username, password);
        }
        catch (CommunicationsException e) {
            System.err.println("Erreur : " + e);
        }
        
        if (connection == null) {
            System.err.println("erreur de connexion !!!!");
        } else {
            System.err.println("connexion etablie");

        }
        DatabaseMetaData dbMetaData = connection.getMetaData();
        String productName = dbMetaData.getDatabaseProductName();
        System.out.println("Database: " + productName);
        String productVersion = dbMetaData.getDatabaseProductVersion();
        System.out.println("Version: " + productVersion);

        Statement stmt = connection.createStatement();
    }
}