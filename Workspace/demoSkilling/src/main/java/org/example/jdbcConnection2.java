package org.example;

import java.sql.*;
import java.util.Scanner;

public class jdbcConnection2 {
    public static void main(String[] args) throws SQLException {
        String host = "localhost";
        String port = "3306";

        Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/klu", "root", "trigun@020903");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter student ID (or type 'exit' to quit): ");
            String studentID = scanner.nextLine().trim();

            if (studentID.equalsIgnoreCase("exit")) {
                break;
            }

            if (isStudentIDExists(con, studentID)) {
                System.out.println("Student ID found. Please enter the student's name:");
                String studentName = scanner.nextLine().trim();
                System.out.println("Enter student's email address:");
                String email = scanner.nextLine().trim();
                System.out.println("Enter student's date of birth (yyyy-mm-dd):");
                String dateOfBirth = scanner.nextLine().trim();

                updateStudentInfo(con, studentID, studentName, email, dateOfBirth);
                System.out.println("Student information updated successfully.");
            } else {
                System.out.println("Student ID not found.");
            }
        }

        con.close();
        scanner.close();
    }

    private static boolean isStudentIDExists(Connection con, String studentID) throws SQLException {
        String query = "SELECT COUNT(*) FROM Student WHERE Student_ID = ?";
        PreparedStatement statement = con.prepareStatement(query);
        statement.setString(1, studentID);
        ResultSet resultSet = statement.executeQuery();
        resultSet.next();
        int count = resultSet.getInt(1);
        statement.close();
        return count > 0;
    }

    private static void updateStudentInfo(Connection con, String studentID, String studentName, String email, String dateOfBirth) throws SQLException {
        String updateSQL = "UPDATE Student SET Student_Name = ?, Email = ?, Date_of_Birth = ? WHERE Student_ID = ?";
        PreparedStatement statement = con.prepareStatement(updateSQL);
        statement.setString(1, studentName);
        statement.setString(2, email);
        statement.setString(3, dateOfBirth);
        statement.setString(4, studentID);
        statement.executeUpdate();
        statement.close();
    }
}
