package com.deitel.exercicios.Capitulo24.ConsultingDataBase;

import java.sql.*;

public class DisplayAuthors {

    public static void main(String[] args) {

        final String DATABASE_URL = "jdbc:mysql://localhost/deitel_java_cap24_ex1";
        final String SELECT_QUERY = "SELECT authorID, firstName, lastName FROM authors ORDER BY firstName, lastName";

        try (Connection connection = DriverManager.getConnection(DATABASE_URL, "root", "root");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(SELECT_QUERY)) {

            ResultSetMetaData metaData = resultSet.getMetaData();
            int numberOfColumns = metaData.getColumnCount();

            System.out.printf("Authors Table of Books Database:%n%n");

            for (int i = 1; i <= numberOfColumns; i++) {
                System.out.printf("%-8s\t", metaData.getColumnName(i));
            }
            System.out.println();

            while (resultSet.next()) {
                for (int i = 1; i <= numberOfColumns; i++) {
                    System.out.printf("%-8s\t", resultSet.getObject(i));
                }
                System.out.println();
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
