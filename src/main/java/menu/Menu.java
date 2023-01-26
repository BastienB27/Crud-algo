package menu;

import java.util.*;

import crud.*;


    public class Menu {

        public static void menu() {
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n\n\n\n\n\n☰ Base de données Sakila\n");

                System.out.println("╔════════════════════════════════════════════════════╗");
                System.out.println("║  1. Pays                                           ║");
                System.out.println("║  2. Villes                                         ║");
                System.out.println("║  3. Films                                          ║");
                System.out.println("║  4. Acteurs                                        ║");
                System.out.println("║  5. Clients                                        ║");
                System.out.println("║  6. Langues                                        ║");
                System.out.println("║  7. Adresses                                       ║");
                System.out.println("║  8. Inventaire                                     ║");
                System.out.println("║  9. Paiement                                       ║");
                System.out.println("║ 10. Staff                                          ║");
                System.out.println("║ 11. Store                     12. Quitter le menu  ║");
                System.out.println("╚════════════════════════════════════════════════════╝");

                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        menupays();

                        break;
                    case 2:
                        menuville();

                        break;
                    case 3:
                        menufilm();

                        break;
                    case 4:
                        menuacteur();

                        break;
                    case 5:
                        menuclient();

                        break;
                    case 6:
                        menulangue();

                        break;
                    case 7:
                        menuadress();

                        break;
                    case 8:
                        menuinventaire();

                        break;
                    case 9:
                        menupaiement();

                        break;
                    case 10:
                        menustaff();

                        break;
                    case 11:
                        menustore();

                        break;

                    case 12:
                        System.out.println("A la prochaine ☹");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Veuillez choisir un choix valide.");
                }
            }   while (choice != 0);
        }

        public static void menupays() {
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

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

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
        public static void menufilm() {
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n☰ Table film\n");

                System.out.println("1. Ajouter un nouveau film");
                System.out.println("2. Afficher la liste des film");
                System.out.println("3. Modifier un film");
                System.out.println("4. Supprimer un film\n");
                System.out.println("5. Revenir à la liste des tables");
                System.out.println("6. Quitter le menu");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

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

        public static void menuacteur() {
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n☰ Table acteur\n");

                System.out.println("1. Ajouter un nouveau acteur");
                System.out.println("2. Afficher la liste des acteurs");
                System.out.println("3. Modifier un acteur");
                System.out.println("4. Supprimer un acteur\n");
                System.out.println("5. Revenir à la liste des tables");
                System.out.println("6. Quitter le menu");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

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

        public static void menuclient() {
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n☰ Table client\n");

                System.out.println("1. Ajouter un nouveau client");
                System.out.println("2. Afficher la liste des clients");
                System.out.println("3. Modifier un client");
                System.out.println("4. Supprimer un client\n");
                System.out.println("5. Revenir à la liste des tables");
                System.out.println("6. Quitter le menu");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

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


        public static void menuadress() {
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n☰ Table adresse\n");

                System.out.println("1. Ajouter une nouvelle adresse");
                System.out.println("2. Afficher la liste des adresses");
                System.out.println("3. Modifier une adresse");
                System.out.println("4. Supprimer une adresse\n");
                System.out.println("5. Revenir à la liste des tables");
                System.out.println("6. Quitter le menu");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

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


        public static void menulangue() {
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n☰ Table langue\n");

                System.out.println("1. Ajouter une nouvelle langue");
                System.out.println("2. Afficher la liste des langues");
                System.out.println("3. Modifier une langue");
                System.out.println("4. Supprimer une langue\n");
                System.out.println("5. Revenir à la liste des tables");
                System.out.println("6. Quitter le menu");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

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


        public static void menuville() {
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n☰ Table ville\n");

                System.out.println("1. Ajouter une nouvelle ville");
                System.out.println("2. Afficher la liste des villes");
                System.out.println("3. Modifier une ville");
                System.out.println("4. Supprimer une ville\n");
                System.out.println("5. Revenir à la liste des tables");
                System.out.println("6. Quitter le menu");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

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

        public static void menuinventaire() {
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n☰ Table Inventaire\n");

                System.out.println("1. Ajouter une nouveeau inventaire");
                System.out.println("2. Afficher la liste des inventaires");
                System.out.println("3. Modifier un inventaire");
                System.out.println("4. Supprimer un inventaire\n");
                System.out.println("5. Revenir à la liste des tables");
                System.out.println("6. Quitter le menu");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

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


        public static void menupaiement() {
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n☰ Table Paiement\n");

                System.out.println("1. Ajouter un nouveau paiement");
                System.out.println("2. Afficher la liste des paiements");
                System.out.println("3. Modifier un paiement");
                System.out.println("4. Supprimer un paiement\n");
                System.out.println("5. Revenir à la liste des tables");
                System.out.println("6. Quitter le menu");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

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


        public static void menustaff() {
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n☰ Table Staff\n");

                System.out.println("1. Ajouter un nouveau staff");
                System.out.println("2. Afficher la liste des staffs");
                System.out.println("3. Modifier un staff");
                System.out.println("4. Supprimer un staff\n");
                System.out.println("5. Revenir à la liste des tables");
                System.out.println("6. Quitter le menu");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

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

        public static void menustore() {
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n☰ Table Store\n");

                System.out.println("1. Ajouter un nouveau store");
                System.out.println("2. Afficher la liste des stores");
                System.out.println("3. Modifier un store");
                System.out.println("4. Supprimer un store\n");
                System.out.println("5. Revenir à la liste des tables");
                System.out.println("6. Quitter le menu");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

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





