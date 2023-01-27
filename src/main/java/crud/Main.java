package crud;

import crud.database.DBConnection;
import crud.menu.Menu;
import crud.show.Data;
import crud.show.Show;

import java.sql.Connection;
import java.sql.SQLException;

import static crud.show.Data.nom_table;

public class Main {
    private static Connection connection;

    public static Connection getConnection() {
        return connection;
    }

    public static void main(String[] args) throws SQLException {


        connection = DBConnection.getConnection("application.properties");
        Menu.menu(connection);

    }
}