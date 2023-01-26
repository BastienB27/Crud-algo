package crud.edit;

import java.sql.*;
import java.util.Scanner;

public class Edit {
    public static void Edit() throws SQLException {
    }
    static String edit_country_name;
    static String country_name;
    static String option = "country";



    public static boolean Modifier_country() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Scanner console = new Scanner(System.in);
            System.out.print("Entrer le nom du pays à modifier: ");
            edit_country_name = console.nextLine();

            System.out.print("Entrer la modification: ");
            country_name = console.nextLine();

            //Connexion à la db
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("\u001B[36m/// Connexion établie!");

            //Requete d'insertion
            String sql = "UPDATE "+option+" SET country = ? WHERE country = ?";

            //Créer l'objet statement
            PreparedStatement prepare = conn.prepareStatement(sql);

            //Variable country_name
            prepare.setString(1, country_name);
            prepare.setString(2, edit_country_name);


            prepare.executeUpdate();


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\u001B[31m---Erreur, données invalides");
            System.exit(0);
        }
        System.out.println("\u001B[32m+++ Pays modifié");
        System.exit(0);
        return true;


    }

    /* -------------------------------------------------------------------------------// */

    static String edit_acteur_name;
    static String acteur_name;
    static String option1 = "acteur";

    public static boolean Modifier_acteur() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Scanner console = new Scanner(System.in);
            System.out.print("Entrer le nom du pays à modifier: ");
            edit_country_name = console.nextLine();

            System.out.print("Entrer la modification: ");
            country_name = console.nextLine();

            //Connexion à la db
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("\u001B[36m/// Connexion établie!");

            //Requete d'insertion
            String sql = "UPDATE "+option+" SET country = ? WHERE country = ?";

            //Créer l'objet statement
            PreparedStatement prepare = conn.prepareStatement(sql);

            //Variable country_name
            prepare.setString(1, country_name);
            prepare.setString(2, edit_country_name);


            prepare.executeUpdate();


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\u001B[31m---Erreur, données invalides");
            System.exit(0);
        }
        System.out.println("\u001B[32m+++ Pays modifié");
        System.exit(0);
        return true;


    }

    /* -------------------------------------------------------------------------------// */

    static String edit_client_name;
    static String client_name;
    static String option2 = "client";

    public static boolean Modifier_client() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Scanner console = new Scanner(System.in);
            System.out.print("Entrer le nom du pays à modifier: ");
            edit_country_name = console.nextLine();

            System.out.print("Entrer la modification: ");
            country_name = console.nextLine();

            //Connexion à la db
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("\u001B[36m/// Connexion établie!");

            //Requete d'insertion
            String sql = "UPDATE "+option+" SET country = ? WHERE country = ?";

            //Créer l'objet statement
            PreparedStatement prepare = conn.prepareStatement(sql);

            //Variable country_name
            prepare.setString(1, country_name);
            prepare.setString(2, edit_country_name);


            prepare.executeUpdate();


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\u001B[31m---Erreur, données invalides");
            System.exit(0);
        }
        System.out.println("\u001B[32m+++ Pays modifié");
        System.exit(0);
        return true;


    }

    /* -------------------------------------------------------------------------------// */
    static String edit_langue_name;
    static String langue_name;
    static String option3 = "langue";

    public static boolean Modifier_langue() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Scanner console = new Scanner(System.in);
            System.out.print("Entrer le nom du pays à modifier: ");
            edit_country_name = console.nextLine();

            System.out.print("Entrer la modification: ");
            country_name = console.nextLine();

            //Connexion à la db
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("\u001B[36m/// Connexion établie!");

            //Requete d'insertion
            String sql = "UPDATE "+option+" SET country = ? WHERE country = ?";

            //Créer l'objet statement
            PreparedStatement prepare = conn.prepareStatement(sql);

            //Variable country_name
            prepare.setString(1, country_name);
            prepare.setString(2, edit_country_name);


            prepare.executeUpdate();


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\u001B[31m---Erreur, données invalides");
            System.exit(0);
        }
        System.out.println("\u001B[32m+++ Pays modifié");
        System.exit(0);
        return true;


    }

    /* -------------------------------------------------------------------------------// */

    static String edit_adresse_name;
    static String adresse_name;
    static String option4 = "adresse";

    public static boolean Modifier_adresse() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Scanner console = new Scanner(System.in);
            System.out.print("Entrer le nom du pays à modifier: ");
            edit_country_name = console.nextLine();

            System.out.print("Entrer la modification: ");
            country_name = console.nextLine();

            //Connexion à la db
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("\u001B[36m/// Connexion établie!");

            //Requete d'insertion
            String sql = "UPDATE "+option+" SET country = ? WHERE country = ?";

            //Créer l'objet statement
            PreparedStatement prepare = conn.prepareStatement(sql);

            //Variable country_name
            prepare.setString(1, country_name);
            prepare.setString(2, edit_country_name);


            prepare.executeUpdate();


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\u001B[31m---Erreur, données invalides");
            System.exit(0);
        }
        System.out.println("\u001B[32m+++ Pays modifié");
        System.exit(0);
        return true;

    }

}
