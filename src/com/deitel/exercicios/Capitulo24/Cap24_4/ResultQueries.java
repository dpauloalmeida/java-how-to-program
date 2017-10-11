package com.deitel.exercicios.Capitulo24.Cap24_4;

import javax.swing.table.AbstractTableModel;
import java.sql.*;

public class ResultQueries extends AbstractTableModel {

    private static Connection connection = null;
    private static CallableStatement callableStatement;

    public static void addEmployee(Employees employee) throws SQLException {
        try {
            connection = new ConnectionFactory().getConnection();

            String sql = "CALL `deitel_java_employees`.`addEmployee`(?, ?, ?, ?, ?)";

            callableStatement = connection.prepareCall(sql);

            callableStatement.setString(1, employee.getFirstName());
            callableStatement.setString(2, employee.getLastName());
            callableStatement.setDate(3, new Date(employee.getBirthday().getTimeInMillis()));
            callableStatement.setString(4, employee.getEmployeetype());
            callableStatement.setString(5, employee.getDepartamentName());

            callableStatement.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            callableStatement.close();
            connection.close();
        }

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
}
