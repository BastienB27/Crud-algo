package crud.create;

import java.sql.*;
import java.util.Scanner;

public class Create {
    public static void Create() throws SQLException {
    }
    static String country_name;
    static String option = "country";



    public static boolean Créer_country() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Scanner console = new Scanner(System.in);
            System.out.print("Entrer le nom du pays à créer: ");
            country_name = console.nextLine();

            //Connexion à la db
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("\u001B[36m/// Connexion établie!");

            //Requete d'insertion
            String sql = "INSERT INTO "+option+" VALUES (NULL,?,CURRENT_TIMESTAMP)";

            //Créer l'objet statement
            PreparedStatement prepare = conn.prepareStatement(sql);

            //Variable country_name
            prepare.setString(1, country_name);


            prepare.executeUpdate();


            conn.close();
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("\u001B[31m---Erreur, données invalides");
            System.exit(0);
        }
        System.out.println("\u001B[32m+++ Pays crée");
        System.exit(0);
        return true;


    }
}
