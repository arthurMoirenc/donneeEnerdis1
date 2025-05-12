package com.example;

import java.sql.*;
import java.util.*;

public class DonneeDAO {

    public static List<Donnee> getAllDonnees() {
        List<Donnee> liste = new ArrayList<>();

        try (Connection conn = Database.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM donnees ORDER BY date ASC")) {

            while (rs.next()) {
                Donnee donnee = new Donnee(
                        rs.getInt("id"),
                        rs.getString("date"),
                        rs.getInt("valeur"),
                        rs.getString("unite")
                );
                liste.add(donnee);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return liste;
    }

    /// /////////////////////////

    public static void addDonnee(Donnee donnee) {

        try {
            Connection conn = Database.connect();

             PreparedStatement stmt = conn.prepareStatement("INSERT INTO donnees (date, valeur, unite) VALUES(?, ?, ?) ");
             stmt.setString(1, donnee.getDate());
             stmt.setInt(2, donnee.getValeur());
             stmt.setString(3, donnee.getUnite());
             stmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
