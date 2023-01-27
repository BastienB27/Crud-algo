package crud.delete;

import java.sql.*;
import java.util.Scanner;

public class Delete {
    public static void Delete() throws SQLException {
    }
    static String name;
    static boolean ajout;

    public static boolean Supprimer_country() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Scanner console = new Scanner(System.in);
            System.out.print("Entrer le nom du pays à supprimer: ");
            name = console.nextLine();


            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("\u001B[36m/// Connexion établie!");

            //Requete d'insertion
            String sql = "DELETE INTO country WHERE country = ?";

            //Créer l'objet statement
            PreparedStatement prepare = conn.prepareStatement(sql);

            //Variable country_name
            prepare.setString(1,name);


            prepare.executeUpdate();



            conn.close();
        } catch (Exception e) {
            System.out.println("\u001B[31m---Erreur, données invalides");
            System.out.println("\u001B[31mVous avez rentré une valeur incorrecte ou");
            System.out.println("\u001B[31mCe pays est relié à une clef étrangère et, donc, pas supprimable");
            System.exit(0);
        }
        System.out.println("\u001B[32m+++ Pays supprimé");
        System.exit(0);
        return true;


    }


    public static boolean Supprimer_city() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Scanner console = new Scanner(System.in);
            System.out.print("Entrer le nom de la ville à supprimer: ");
            name = console.nextLine();


            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("\u001B[36m/// Connexion établie!");

            //Requete d'insertion
            String sql = "DELETE INTO city WHERE city = ?";

            //Créer l'objet statement
            PreparedStatement prepare = conn.prepareStatement(sql);

            //Variable country_name
            prepare.setString(1,name);


            prepare.executeUpdate();



            conn.close();
        } catch (Exception e) {
            System.out.println("\u001B[31m---Erreur, données invalides");
            System.out.println("\u001B[31mVous avez rentré une valeur incorrecte ou");
            System.out.println("\u001B[31mCette ville est relié à une clef étrangère et, donc, pas supprimable");
            System.exit(0);
        }
        System.out.println("\u001B[32m+++ Ville supprimé");
        System.exit(0);
        return true;


    }


    public static boolean Supprimer_film() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Scanner console = new Scanner(System.in);
            System.out.print("Entrer le nom du film à supprimer: ");
            name = console.nextLine();


            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("\u001B[36m/// Connexion établie!");

            //Requete d'insertion
            String sql = "DELETE INTO film WHERE film = ?";

            //Créer l'objet statement
            PreparedStatement prepare = conn.prepareStatement(sql);

            //Variable country_name
            prepare.setString(1,name);


            prepare.executeUpdate();



            conn.close();
        } catch (Exception e) {
            System.out.println("\u001B[31m---Erreur, données invalides");
            System.out.println("\u001B[31mVous avez rentré une valeur incorrecte ou");
            System.out.println("\u001B[31mCe film est relié à une clef étrangère et, donc, pas supprimable");
            System.exit(0);
        }
        System.out.println("\u001B[32m+++ Film supprimé");
        System.exit(0);
        return true;


    }

    public static boolean Supprimer_inventory() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Scanner console = new Scanner(System.in);
            System.out.print("Entrer le inventory_id à supprimer: ");
            name = console.nextLine();


            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("\u001B[36m/// Connexion établie!");

            //Requete d'insertion
            String sql = "DELETE INTO inventory WHERE inventory = ?";

            //Créer l'objet statement
            PreparedStatement prepare = conn.prepareStatement(sql);

            //Variable inventory_name
            prepare.setString(1,name);


            prepare.executeUpdate();



            conn.close();
        } catch (Exception e) {
            System.out.println("\u001B[31m---Erreur, données invalides");
            System.out.println("\u001B[31mVous avez rentré une valeur incorrecte ou");
            System.out.println("\u001B[31mCe inventaire est relié à une clef étrangère et, donc, pas supprimable");
            System.exit(0);
        }
        System.out.println("\u001B[32m+++ inventaire supprimé");
        System.exit(0);
        return true;


    }
    public static boolean Supprimer_payment() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Scanner console = new Scanner(System.in);
            System.out.print("Entrer le nom du payment à supprimer: ");
            name = console.nextLine();


            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("\u001B[36m/// Connexion établie!");

            //Requete d'insertion
            String sql = "DELETE INTO payment WHERE payment = ?";

            //Créer l'objet statement
            PreparedStatement prepare = conn.prepareStatement(sql);

            //Variable payment_name
            prepare.setString(1,name);


            prepare.executeUpdate();



            conn.close();
        } catch (Exception e) {
            System.out.println("\u001B[31m---Erreur, données invalides");
            System.out.println("\u001B[31mVous avez rentré une valeur incorrecte ou");
            System.out.println("\u001B[31mCe payment est relié à une clef étrangère et, donc, pas supprimable");
            System.exit(0);
        }
        System.out.println("\u001B[32m+++ payment supprimé");
        System.exit(0);
        return true;


    }

    public static boolean Supprimer_staff() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Scanner console = new Scanner(System.in);
            System.out.print("Entrer le nom du staff à supprimer: ");
            name = console.nextLine();


            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("\u001B[36m/// Connexion établie!");

            //Requete d'insertion
            String sql = "DELETE INTO staff WHERE staff = ?";

            //Créer l'objet statement
            PreparedStatement prepare = conn.prepareStatement(sql);

            //Variable country_name
            prepare.setString(1,name);


            prepare.executeUpdate();



            conn.close();
        } catch (Exception e) {
            System.out.println("\u001B[31m---Erreur, données invalides");
            System.out.println("\u001B[31mVous avez rentré une valeur incorrecte ou");
            System.out.println("\u001B[31mCe staff est relié à une clef étrangère et, donc, pas supprimable");
            System.exit(0);
        }
        System.out.println("\u001B[32m+++ staff supprimé");
        System.exit(0);
        return true;


    }

    public static boolean Supprimer_store() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Scanner console = new Scanner(System.in);
            System.out.print("Entrer le nom du store à supprimer: ");
            name = console.nextLine();


            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("\u001B[36m/// Connexion établie!");

            //Requete d'insertion
            String sql = "DELETE INTO store WHERE store = ?";

            //Créer l'objet statement
            PreparedStatement prepare = conn.prepareStatement(sql);

            //Variable country_name
            prepare.setString(1,name);


            prepare.executeUpdate();



            conn.close();
        } catch (Exception e) {
            System.out.println("\u001B[31m---Erreur, données invalides");
            System.out.println("\u001B[31mVous avez rentré une valeur incorrecte ou");
            System.out.println("\u001B[31mCe store est relié à une clef étrangère et, donc, pas supprimable");
            System.exit(0);
        }
        System.out.println("\u001B[32m+++ store supprimé");
        System.exit(0);
        return true;


    }
}
