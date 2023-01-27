package crud.edit;

import java.sql.*;
import java.util.Scanner;

public class Edit {
    public static void Edit() throws SQLException {
    }
    static String edit_name;
    static String name;
    static String option;
    static String option2;

    // ************************************************************************************************************ //
    // ************************************************************************************************************ //

    public static boolean Modifier_country() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        option = "country";

        try {
            Scanner console = new Scanner(System.in);
            System.out.print("Entrer le nom du pays à modifier: ");
            edit_name = console.nextLine();

            System.out.print("Entrer la modification: ");
            name = console.nextLine();

            //Connexion à la db
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("\u001B[36m/// Connexion établie!");

            //Requete d'insertion
            String sql = "UPDATE "+option+" SET country = ? WHERE country = ?";

            //Créer l'objet statement
            PreparedStatement prepare = conn.prepareStatement(sql);

            //Variable country_name
            prepare.setString(1, name);
            prepare.setString(2, edit_name);


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

    // ************************************************************************************************************ //
    // ************************************************************************************************************ //

    public static boolean Modifier_city() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        option = "city";


        try {
            Scanner console = new Scanner(System.in);
            System.out.print("Entrer le nom de la ville à modifier: ");
            edit_name = console.nextLine();

            System.out.print("Que voulez vous modifier dans ville ?: ");
            option2 = console.nextLine();

            System.out.print("Entrer la modification: ");
            name = console.nextLine();

            //Connexion à la db
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("\u001B[36m/// Connexion établie!");

            //Requete d'insertion
            String sql = "UPDATE "+option+" SET "+option2+" = ? WHERE city = ?";

            //Créer l'objet statement
            PreparedStatement prepare = conn.prepareStatement(sql);

            //Variable country_name
            prepare.setString(1, name);
            prepare.setString(2, edit_name);


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

    // ************************************************************************************************************ //
    // ************************************************************************************************************ //
    public static boolean Modifier_film() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        option = "film";


        try {
            Scanner console = new Scanner(System.in);
            System.out.print("Entrer le nom du film à modifier: ");
            edit_name = console.nextLine();

            System.out.print("Que voulez vous modifier dans film ?: ");
            option2 = console.nextLine();

            System.out.print("Entrer la modification: ");
            name = console.nextLine();

            //Connexion à la db
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("\u001B[36m/// Connexion établie!");

            //Requete d'insertion
            String sql = "UPDATE " + option + " SET " + option2 + " = ? WHERE title = ?";

            //Créer l'objet statement
            PreparedStatement prepare = conn.prepareStatement(sql);

            //Variable country_name
            prepare.setString(1, name);
            prepare.setString(2, edit_name);


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

    // ************************************************************************************************************ //
    // ************************************************************************************************************ //

    public static boolean Modifier_acteur() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        option = "acteur";

        try {
            Scanner console = new Scanner(System.in);
            System.out.print("Entrer le nom de l'acteur à modifier: ");
            edit_name = console.nextLine();

            System.out.print("Entrer la modification: ");
            option2 = console.nextLine();

            //Connexion à la db
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("\u001B[36m/// Connexion établie!");

            //Requete d'insertion
            String sql = "UPDATE "+option+" SET option2 = ? WHERE last_name = ?";

            //Créer l'objet statement
            PreparedStatement prepare = conn.prepareStatement(sql);

            //Variable country_name
            prepare.setString(1, name);
            prepare.setString(2, edit_name);


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

    // ************************************************************************************************************ //
    // ************************************************************************************************************ //
    public static boolean Modifier_client() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        option = "client";

        try {

            Scanner console = new Scanner(System.in);
            System.out.print("Entrer le nom du client à modifier: ");
            edit_name = console.nextLine();

            System.out.print("Entrer la modification: ");
            country_nam = console.nextLine();

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

    // ************************************************************************************************************ //
    // ************************************************************************************************************ //

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
