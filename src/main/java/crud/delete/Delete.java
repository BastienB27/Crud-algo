package crud.delete;

import java.sql.*;
import java.util.Scanner;

public class Delete {
    public static void Delete() throws SQLException {
    }
    static String country_name;
    static boolean ajout;

    public static boolean Supprimer_country() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Scanner console = new Scanner(System.in);
            System.out.print("Entrer le nom du pays à supprimer: ");
            country_name = console.nextLine();


            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connexion établie!");

            //Requete d'insertion
            String sql = "DELETE INTO country WHERE country = ?";

            //Créer l'objet statement
            PreparedStatement prepare = conn.prepareStatement(sql);

            //Variable country_name
            prepare.setString(1,country_name);


            prepare.executeUpdate();



            conn.close();
        } catch (Exception e) {
            System.out.println("Vous avez rentré une valeur incorrecte ou");
            System.out.println("Ce pays est relié à une clef étrangère et, donc, pas supprimable");
            System.exit(0);
        }
        System.out.println("Pays supprimé");
        System.exit(0);
        return true;


    }
}
