package crud;

import crud.database.Connexion;
import crud.menu.Menu;
import crud.show.Data;
import crud.show.Show;

import java.sql.SQLException;

import static crud.show.Data.nom_table;

public class Main {
    public static void main(String[] args) throws SQLException {

        Connexion.connect();
        Menu.menu();

    }
}