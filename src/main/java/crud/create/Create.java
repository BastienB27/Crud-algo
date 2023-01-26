package crud.create;

import crud.show.Data;

import java.sql.*;
import java.util.Scanner;

public class Create {
    public static void Create() throws SQLException {
    }
    static String parametre1;
    static String parametre2;
    static String parametre3;
    static String parametre4;
    static String parametre5;
    static String parametre6;
    static String parametre7;
    static String parametre8;
    static String parametre9;
    static String parametre10;


    static String option;
    static boolean liensboucle = false;



    public static boolean Créer_country() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";

        option = "country";

        try {
            Scanner console = new Scanner(System.in);
            System.out.print("Entrer le nom du pays à créer: ");
            parametre1 = console.nextLine();

            //Connexion à la db
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("\u001B[36m/// Connexion établie!");

            //Requete d'insertion
            String sql = "INSERT INTO "+option+" VALUES (NULL,?,CURRENT_TIMESTAMP)";

            //Créer l'objet statement
            PreparedStatement prepare = conn.prepareStatement(sql);

            //Variable country_name
            prepare.setString(1, parametre1);


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
        public static boolean Créer_city() throws SQLException {
            String url = "jdbc:mysql://localhost:3306/sakila";
            String username = "root";
            String password = "";

            option = "city";



            try {
                //Connexion à la db
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, username, password);
                System.out.println("\u001B[36m/// Connexion établie!");



                Scanner console = new Scanner(System.in);
                System.out.print("Entrer le nom de la ville à créer: ");
                parametre1 = console.nextLine();


                Scanner console2 = new Scanner(System.in);
                System.out.print("Entrer l'id du pays où ce situe la ville: ");
                parametre2 = console2.nextLine();



                //Requete d'insertion
                String sql = "INSERT INTO "+option+" VALUES (NULL,?,?,CURRENT_TIMESTAMP)";

                //Créer l'objet statement
                PreparedStatement prepare = conn.prepareStatement(sql);

                //Variable country_name
                prepare.setString(1, parametre1);
                prepare.setString(2, parametre2);



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
        public static boolean Créer_film() throws SQLException {
            String url = "jdbc:mysql://localhost:3306/sakila";
            String username = "root";
            String password = "";

            option = "film";

            try {
                Scanner console = new Scanner(System.in);

                System.out.print("Entrer le titre du film à créer: ");
                parametre1 = console.nextLine();

                System.out.print("Entrer la description du film à créer: ");
                parametre2 = console.nextLine();

                System.out.print("Entrer l'année de sortie du film à créer: ");
                parametre3 = console.nextLine();

                System.out.print("Entrer l'id de la langue du film à créer | 1 = anglais, 5 = Francais: ");
                parametre4 = console.nextLine();

                System.out.print("Entrer la durée de location: ");
                parametre5 = console.nextLine();

                System.out.print("Entrer le pourcentage de location: ");
                parametre6 = console.nextLine();

                System.out.print("Entrer la durée du film: ");
                parametre7 = console.nextLine();

                System.out.print("Entrer le cout: ");
                parametre8 = console.nextLine();

                System.out.print("Entrer la note de satisfaction: ");
                parametre9 = console.nextLine();

                System.out.print("Entrer les features: ");
                parametre10 = console.nextLine();

                //Connexion à la db
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, username, password);
                System.out.println("\u001B[36m/// Connexion établie!");

                //Requete d'insertion
                String sql = "INSERT INTO "+option+" VALUES (NULL,?,?,?,?,NULL,?,?,?,?,?,?,CURRENT_TIMESTAMP)";

                //Créer l'objet statement
                PreparedStatement prepare = conn.prepareStatement(sql);

                //Variable country_name
                prepare.setString(1, parametre1);
                prepare.setString(2, parametre2);
                prepare.setString(3, parametre3);
                prepare.setString(4, parametre4);
                prepare.setString(5, parametre5);
                prepare.setString(6, parametre6);
                prepare.setString(7, parametre7);
                prepare.setString(8, parametre8);
                prepare.setString(9, parametre9);
                prepare.setString(10, parametre10);


                prepare.executeUpdate();


                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("\u001B[31m---Erreur, données invalides");
                System.exit(0);
            }
            System.out.println("\u001B[32m+++ Film crée");
            System.exit(0);
            return true;


        }
    }



