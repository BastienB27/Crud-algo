package crud.show;
import java.sql.*;

public class Show {

        public static void afficher_table() {
            String url = "jdbc:mysql://localhost:3306/sakila";
            String username = "root";
            String password = "";

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, username, password);
                System.out.println("Connexion établie!");

                // Obtenir la liste des tables
                DatabaseMetaData meta = conn.getMetaData();
                ResultSet res = meta.getTables(null, null, null, new String[] {"TABLE"});
                while (res.next()) {
                    System.out.println(res.getString("TABLE_NAME"));
                }

                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


}
