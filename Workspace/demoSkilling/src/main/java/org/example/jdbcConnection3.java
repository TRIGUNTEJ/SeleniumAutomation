package org.example;

import java.sql.*;
import java.util.Scanner;

public class jdbcConnection3 {
    public static void main(String[] args) {
        String host = "localhost";
        String port = "3306";

        try (Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/klu", "root", "**********")) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Enter species name (or type 'exit' to quit): ");
                String name = scanner.nextLine().trim();

                if (name.equalsIgnoreCase("exit")) {
                    break;
                }

                System.out.println("Enter species category (animal/plant): ");
                String category = scanner.nextLine().trim();

                System.out.println("Enter path of the image file (.jpg): ");
                String imagePath = scanner.nextLine().trim();

                System.out.println("Enter path of the description file (.txt): ");
                String descriptionPath = scanner.nextLine().trim();

                insertSpecies(con, name, category, imagePath, descriptionPath);
                System.out.println("Species information saved successfully.");
            }

            scanner.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void insertSpecies(Connection con, String name, String category, String imagePath, String descriptionPath) throws SQLException {
        String insertSQL = "INSERT INTO species (Name, Category, Image, DescriptionFile) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = con.prepareStatement(insertSQL)) {
            statement.setString(1, name);
            statement.setString(2, category);
            statement.setString(3, imagePath);
            statement.setString(4, descriptionPath);
            statement.executeUpdate();
        }
    }
}
//./Database3/Tigerpic.jpg