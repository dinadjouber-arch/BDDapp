import BDD.SQLConnexion;
import display.FenetreAccueil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {
    public static void main(String[] args) throws SQLException {


        SQLConnexion c=new SQLConnexion();
        c.connexion();
        SQLConnexion.initialiser();

        new FenetreAccueil();


       /* Connection conn = DriverManager.getConnection("jdbc:sqlite:gestion_depenses.db");
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("DELETE FROM revenu");
        conn.close();*/
    }
}