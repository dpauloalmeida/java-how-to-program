package com.deitel.exercicios.Capitulo24.ConsultingDataBaseJTable;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;

public class ResultSetTableModel extends AbstractTableModel {

    private final Connection connection;
    private final Statement statement;
    private ResultSet resultSet;
    private ResultSetMetaData metaData;
    private int numberOfRows;

    private boolean toMonitorConnectedDatabase = false;

    public ResultSetTableModel(String url, String user, String password, String query) throws SQLException {

        connection = DriverManager.getConnection(url, user, password);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        toMonitorConnectedDatabase = true;

        setQuery(query);
    }

    public Class getColumnClass(int column) throws IllegalStateException {
        if (!toMonitorConnectedDatabase) {
            throw new IllegalStateException("Not Connected to Database");
        }

        try {
            String className = metaData.getColumnClassName(column + 1);
            return Class.forName(className);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return Object.class;
    }

    public int getColumnCount() throws IllegalStateException {
        if (!toMonitorConnectedDatabase) {
            throw new IllegalStateException("Not Connected to Database");
        }

        try {
            return metaData.getColumnCount();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    public String getColumnName(int column) throws IllegalStateException {
        if (!toMonitorConnectedDatabase) {
            throw new IllegalStateException("Not Connected to Database");
        }

        try {
            return metaData.getColumnName(column + 1);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return "";
    }

    public int getRowCount() throws IllegalStateException {
        if (!toMonitorConnectedDatabase) {
            throw new IllegalStateException("Not Connected to Database");
        }

        return numberOfRows;
    }

    public Object getValueAt(int row, int column) throws IllegalStateException {
        if (!toMonitorConnectedDatabase) {
            throw new IllegalStateException("Not Connected to Database");
        }

        try {
            resultSet.absolute(row + 1);
            return resultSet.getObject(column + 1);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return "";
    }

    public void setQuery(String query) throws SQLException, IllegalStateException {
        if (!toMonitorConnectedDatabase) {
            throw new IllegalStateException("Not Connected to Database");
        }

        resultSet = statement.executeQuery(query);
        metaData = resultSet.getMetaData();

        resultSet.last();
        numberOfRows = resultSet.getRow();

        fireTableStructureChanged();
    }

    public void disconnectFromDatabase() {
        if (toMonitorConnectedDatabase) {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
            finally {
                toMonitorConnectedDatabase = false;
            }
        }
    }
}
