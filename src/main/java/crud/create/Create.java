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

    /* -------------------------------------------------------------------------------// */
    static String acteur_name;

    static String option2 = "acteur";

    public static boolean Create_acteur() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Scanner console = new Scanner(System.in);
            System.out.print("Entrer le nom de l'acteur à créer: ");
            client_name = console.nextLine();

            //Connexion à la db
            //Requete d'insertion
            //Créer l'objet statement
            //Variable client_name

        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("\u001B[31m---Erreur, données invalides");
            System.exit(0);
        }
        System.out.println("\u001B[32m+++ Acteur crée");
        System.exit(0);
        return true;

    }

    /* -------------------------------------------------------------------------------// */

    static String client_name;
    static String option3 = "client";

    public static boolean Create_client() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Scanner console = new Scanner(System.in);
            System.out.print("Entrer le nom du client à créer: ");
            client_name = console.nextLine();

            //Connexion à la db
            //Requete d'insertion
            //Créer l'objet statement
            //Variable client_name

        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("\u001B[31m---Erreur, données invalides");
            System.exit(0);
        }
        System.out.println("\u001B[32m+++ Client crée");
        System.exit(0);
        return true;

    }


    /* -------------------------------------------------------------------------------// */

    static String langues_name;
    static String option4 = "langue";

    public static boolean Create_langues() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Scanner console = new Scanner(System.in);
            System.out.print("Entrer le nom de la langue à créer: ");
            client_name = console.nextLine();

            //Connexion à la db
            //Requete d'insertion
            //Créer l'objet statement
            //Variable client_name

        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("\u001B[31m---Erreur, données invalides");
            System.exit(0);
        }
        System.out.println("\u001B[32m+++ Langue crée");
        System.exit(0);
        return true;

    }

    /* -------------------------------------------------------------------------------// */

    static String adresse_name;
    static String option5 = "adresse";

    public static boolean Create_adresses() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Scanner console = new Scanner(System.in);
            System.out.print("Entrer le nom de l'adresse à créer: ");
            client_name = console.nextLine();

            //Connexion à la db
            //Requete d'insertion
            //Créer l'objet statement
            //Variable client_name

        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("\u001B[31m---Erreur, données invalides");
            System.exit(0);
        }
        System.out.println("\u001B[32m+++ Adresse crée");
        System.exit(0);
        return true;

    }

}
