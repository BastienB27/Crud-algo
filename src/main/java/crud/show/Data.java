package crud.show;
import java.sql.*;
import java.util.Scanner;


public class Data {
    public static String nom_table;
    public static String recherche;

    public static void Data_table_country() {

            String url = "jdbc:mysql://localhost:3306/sakila";
            String username = "root";
            String password = "";
            String tableName = "country";

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, username, password);
                System.out.println("/// Connexion établie!");

                // Sélection des données de la table
                Statement pstmt = conn.createStatement();
                ResultSet res = pstmt.executeQuery("SELECT * FROM " + tableName);
                ResultSetMetaData rsmd = res.getMetaData();
                int columnsNumber = rsmd.getColumnCount();
                while (res.next()) {
                    for (int i = 1; i <= columnsNumber; i++) {
                        if (i > 1) System.out.print(",  ");
                        String columnValue = res.getString(i);
                        System.out.print(columnValue + " " + rsmd.getColumnName(i));
                    }
                    System.out.println("");
                }
                Recherche_table_country();

            } catch (Exception e) {
                e.printStackTrace();
            }
        System.exit(0);


    }
    public static void Recherche_table_country() {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "";
        String tableName = "country";
        String recherche ;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("/// Connexion établie!");

            Scanner console = new Scanner(System.in);
            System.out.print("Entrer le nom du pays que vous voulez rechercher: ");
            recherche = console.nextLine();

            String sql = "SELECT * FROM " + tableName + " WHERE country = ?";

            //Créer l'objet statement
            PreparedStatement prepare = conn.prepareStatement(sql);

            //Variable country_name
            prepare.setString(1, recherche);

            //Executer la requête
            ResultSet res = prepare.executeQuery();

            //Afficher les résultats
            ResultSetMetaData rsmd = res.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            while (res.next()) {
                for (int i = 1; i <= columnsNumber; i++) {
                    if (i > 1) System.out.print(",  ");
                    String columnValue = res.getString(i);
                    System.out.print(columnValue + " " + rsmd.getColumnName(i));
                }
                System.out.println("");
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
