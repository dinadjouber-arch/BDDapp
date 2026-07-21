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

    public static void initialiser() {

        try (Connection con = getConnexion();
             java.sql.Statement stmt = con.createStatement()) {

            stmt.execute("PRAGMA foreign_keys = ON;");

            stmt.execute("""
                CREATE TABLE IF NOT EXISTS categorie(
                    id_categorie INTEGER PRIMARY KEY AUTOINCREMENT,
                    nom TEXT NOT NULL,
                    description TEXT
                );
                """);

            stmt.execute("""
                CREATE TABLE IF NOT EXISTS moyen_paiement(
                    id_paiement INTEGER PRIMARY KEY AUTOINCREMENT,
                    nom TEXT NOT NULL UNIQUE
                );
                """);

            stmt.execute("""
                CREATE TABLE IF NOT EXISTS depense(
                    id_depense INTEGER PRIMARY KEY AUTOINCREMENT,
                    montant REAL NOT NULL,
                    date_depense TEXT NOT NULL,
                    description TEXT,
                    id_categorie INTEGER NOT NULL,
                    id_paiement INTEGER NOT NULL,
                    FOREIGN KEY(id_categorie) REFERENCES categorie(id_categorie),
                    FOREIGN KEY(id_paiement) REFERENCES moyen_paiement(id_paiement)
                );
                """);

            stmt.execute("""
                CREATE TABLE IF NOT EXISTS budget(
                    id_budget INTEGER PRIMARY KEY AUTOINCREMENT,
                    montant REAL NOT NULL,
                    mois INTEGER NOT NULL,
                    annee INTEGER NOT NULL
                );
                """);

            stmt.execute("""
                CREATE TABLE IF NOT EXISTS revenu(
                    id_revenu INTEGER PRIMARY KEY AUTOINCREMENT,
                    montant REAL NOT NULL,
                    date_revenu TEXT NOT NULL,
                    description TEXT
                );
                """);

            stmt.execute("""
                INSERT OR IGNORE INTO moyen_paiement(id_paiement, nom)
                VALUES
                (1,'Espèces'),
                (2,'Carte bancaire'),
                (3,'Virement'),
                (4,'Chèque');
                """);

            System.out.println("Base de données initialisée.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}