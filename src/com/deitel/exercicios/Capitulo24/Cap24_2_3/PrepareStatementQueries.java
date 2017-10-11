package com.deitel.exercicios.Capitulo24.Cap24_2_3;

import javax.swing.table.AbstractTableModel;
import java.sql.*;

public class PrepareStatementQueries extends AbstractTableModel {

    private static final String URL = "jdbc:mysql://localhost/deitel_java_cap24_ex1";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private boolean toMonitorDatabase = false;

    private Connection connection;
    private PreparedStatement selectDefault;
    private PreparedStatement selectTitlesByAuthor;
    private PreparedStatement selectAuthorsByTitle;

    public PrepareStatementQueries() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            toMonitorDatabase = true;

            selectDefault = connection.prepareStatement("SELECT * FROM authors");

            selectTitlesByAuthor = connection.prepareStatement(
                    "SELECT title FROM titles " +
                            "JOIN author_isbn ON author_isbn.ISBN = titles.ISBN " +
                            "JOIN authors ON authors.authorID = author_isbn.authorID " +
                            "WHERE firstName = ? AND lastName = ?");

            selectAuthorsByTitle = connection.prepareStatement(
                    "SELECT firstName, lastName FROM authors " +
                            "JOIN author_isbn ON author_isbn.authorID = authors.authorID " +
                            "JOIN titles ON titles.ISBN = author_isbn.ISBN " +
                            "WHERE title = ?");
        }
        catch (SQLException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public PrepareStatementQueries(String title) {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

        }
        catch (SQLException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public PrepareStatementQueries(String s, String s2) {
        this.toMonitorDatabase = toMonitorDatabase;
    }

    @Override
    public int getRowCount() {
        return 0;
    }

    @Override
    public int getColumnCount() {
        return 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }

    public void disconnectFromDatabase() {
        try {
            if (toMonitorDatabase) {
                connection.close();
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            toMonitorDatabase = false;
        }
    }
}
