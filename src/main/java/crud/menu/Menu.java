package crud.menu;

import java.sql.SQLException;
import java.util.*;

import crud.*;
import crud.create.Create;
import crud.delete.Delete;
import crud.show.Data;


public class Menu {

    public static void menu() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n☰ Base de données Sakila\n");

            System.out.println("1. Pays");
            System.out.println("2. Villes");
            System.out.println("3. Capitales\n");
            System.out.println("4. Quitter le menu");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    menupays();

                    break;
                case 2:
                    System.out.println("Actions possibles dans : Villes");

                    break;
                case 3:
                    System.out.println("Actions possibles dans : Capitales");

                    break;
                case 4:
                    System.out.println("A la prochaine ☹");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Veuillez choisir un choix valide.");
            }
        }   while (choice != 0);
    }

    public static void menupays() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n☰ Table pays\n");

            System.out.println("1. Créer un nouveau pays");
            System.out.println("2. Afficher la liste des pays");
            System.out.println("3. Modifier un pays");
            System.out.println("4. Supprimer un pays\n");
            System.out.println("5. Revenir à la liste des tables");
            System.out.println("6. Quitter le menu");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Actions possibles dans : Pays");
                    Create.Créer_country();
                    break;
                case 2:
                    System.out.println("Actions possibles dans : Villes");
                    Data.Data_table_country();
                    break;
                case 3:
                    System.out.println("Actions possibles dans : Capitales");

                    break;
                case 4:
                    System.out.println("Actions possibles dans : Capitales");
                    Delete.Supprimer_country();

                    break;
                case 5:
                    menu();
                    break;
                case 6:
                    System.out.println("A la prochaine ☹");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Veuillez choisir un choix valide.");
            }
        }   while (choice != 0);
    }


}




