package crud.show;
import java.sql.*;


public class Data {
    public static String nom_table;

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
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        System.exit(0);


    }

}
