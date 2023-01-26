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

<<<<<<< HEAD
    /* -------------------------------------------------------------------------------// */

    static String acteur_name;

    public static boolean Supprimer_acteur() throws SQLException {
=======

    public static boolean Supprimer_city() throws SQLException {
>>>>>>> Crud-algo/Flo
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Scanner console = new Scanner(System.in);
<<<<<<< HEAD
            System.out.print("Entrer le nom du pays à supprimer: ");
            country_name = console.nextLine();
=======
            System.out.print("Entrer le nom de la ville à supprimer: ");
            name = console.nextLine();
>>>>>>> Crud-algo/Flo


            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("\u001B[36m/// Connexion établie!");

            //Requete d'insertion
<<<<<<< HEAD
            String sql = "DELETE INTO country WHERE country = ?";
=======
            String sql = "DELETE INTO city WHERE city = ?";
>>>>>>> Crud-algo/Flo

            //Créer l'objet statement
            PreparedStatement prepare = conn.prepareStatement(sql);

            //Variable country_name
<<<<<<< HEAD
            prepare.setString(1,country_name);
=======
            prepare.setString(1,name);
>>>>>>> Crud-algo/Flo


            prepare.executeUpdate();



            conn.close();
        } catch (Exception e) {
            System.out.println("\u001B[31m---Erreur, données invalides");
            System.out.println("\u001B[31mVous avez rentré une valeur incorrecte ou");
<<<<<<< HEAD
            System.out.println("\u001B[31mCe pays est relié à une clef étrangère et, donc, pas supprimable");
            System.exit(0);
        }
        System.out.println("\u001B[32m+++ Pays supprimé");
=======
            System.out.println("\u001B[31mCette ville est relié à une clef étrangère et, donc, pas supprimable");
            System.exit(0);
        }
        System.out.println("\u001B[32m+++ Ville supprimé");
>>>>>>> Crud-algo/Flo
        System.exit(0);
        return true;


    }


<<<<<<< HEAD
    /* -------------------------------------------------------------------------------// */

    static String client_name;

    public static boolean Supprimer_client() throws SQLException {
=======
    public static boolean Supprimer_film() throws SQLException {
>>>>>>> Crud-algo/Flo
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Scanner console = new Scanner(System.in);
<<<<<<< HEAD
            System.out.print("Entrer le nom du pays à supprimer: ");
            country_name = console.nextLine();
=======
            System.out.print("Entrer le nom du film à supprimer: ");
            name = console.nextLine();
>>>>>>> Crud-algo/Flo


            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("\u001B[36m/// Connexion établie!");

            //Requete d'insertion
<<<<<<< HEAD
            String sql = "DELETE INTO country WHERE country = ?";
=======
            String sql = "DELETE INTO film WHERE film = ?";
>>>>>>> Crud-algo/Flo

            //Créer l'objet statement
            PreparedStatement prepare = conn.prepareStatement(sql);

            //Variable country_name
<<<<<<< HEAD
            prepare.setString(1,country_name);
=======
            prepare.setString(1,name);
>>>>>>> Crud-algo/Flo


            prepare.executeUpdate();



            conn.close();
        } catch (Exception e) {
            System.out.println("\u001B[31m---Erreur, données invalides");
            System.out.println("\u001B[31mVous avez rentré une valeur incorrecte ou");
<<<<<<< HEAD
            System.out.println("\u001B[31mCe pays est relié à une clef étrangère et, donc, pas supprimable");
            System.exit(0);
        }
        System.out.println("\u001B[32m+++ Pays supprimé");
=======
            System.out.println("\u001B[31mCe film est relié à une clef étrangère et, donc, pas supprimable");
            System.exit(0);
        }
        System.out.println("\u001B[32m+++ Film supprimé");
>>>>>>> Crud-algo/Flo
        System.exit(0);
        return true;


    }
<<<<<<< HEAD


    /* -------------------------------------------------------------------------------// */

    static String langue_name;

    public static boolean Supprimer_langue() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Scanner console = new Scanner(System.in);
            System.out.print("Entrer le nom du pays à supprimer: ");
            country_name = console.nextLine();


            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("\u001B[36m/// Connexion établie!");

            //Requete d'insertion
            String sql = "DELETE INTO country WHERE country = ?";

            //Créer l'objet statement
            PreparedStatement prepare = conn.prepareStatement(sql);

            //Variable country_name
            prepare.setString(1,country_name);


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


    /* -------------------------------------------------------------------------------// */

    static String adresse_name;

    public static boolean Supprimer_adresse() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        try {
            Scanner console = new Scanner(System.in);
            System.out.print("Entrer le nom du pays à supprimer: ");
            country_name = console.nextLine();


            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("\u001B[36m/// Connexion établie!");

            //Requete d'insertion
            String sql = "DELETE INTO country WHERE country = ?";

            //Créer l'objet statement
            PreparedStatement prepare = conn.prepareStatement(sql);

            //Variable country_name
            prepare.setString(1,country_name);


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

=======
>>>>>>> Crud-algo/Flo
}
