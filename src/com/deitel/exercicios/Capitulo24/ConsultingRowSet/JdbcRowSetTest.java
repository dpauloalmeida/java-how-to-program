package com.deitel.exercicios.Capitulo24.ConsultingRowSet;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JdbcRowSetTest {

    private static final String DATABASE_URL = "jdbc:mysql://localhost/deitel_java_cap24_ex1";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        try (JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet()) {
            rowSet.setUrl(DATABASE_URL);
            rowSet.setUsername(USER);
            rowSet.setPassword(PASSWORD);
            rowSet.setCommand("SELECT * FROM authors");
            rowSet.execute();

            ResultSetMetaData metaData = rowSet.getMetaData();
            int numberOfColumns = metaData.getColumnCount();

            System.out.println("Authors Table of Books Database:%n%n");

            for (int i = 1; i <= numberOfColumns; i++) {
                System.out.printf("%-8s\t", metaData.getColumnName(i));
            }
            System.out.println();

            while (rowSet.next()) {
                for (int i = 1; i <= numberOfColumns; i++) {
                    System.out.printf("%-8s\t", rowSet.getObject(i));
                }
                System.out.println();
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

}
