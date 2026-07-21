package BDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnexion {

    // Fichier de base de donnees SQLite
    private static final String URL = "jdbc:sqlite:gestion_depenses.db";

    public static Connection getConnexion() throws SQLException {
        return DriverManager.getConnection(URL);
    }

    public static void connexion() {

        try (Connection con = DriverManager.getConnection(URL)) {
            System.out.println("Connexion à la base SQLite réussie !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}