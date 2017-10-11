package com.deitel.exercicios.Capitulo24.ConsultingPrepareStatement;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonQueries {

    private static final String URL = "jdbc:mysql://localhost/address_book";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private Connection connection;
    private PreparedStatement selectAllPeople;
    private PreparedStatement selectPeopleByName;
    private PreparedStatement insertNewPerson;
    private PreparedStatement updatePerson;
    private PreparedStatement deletePerson;

    public PersonQueries() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            selectAllPeople = connection.prepareStatement("SELECT * FROM addresses");
            selectPeopleByName = connection.prepareStatement("SELECT * FROM addresses WHERE name_ LIKE ?");
            insertNewPerson = connection.prepareStatement("INSERT INTO addresses (name_, email, phoneNumber) VALUES (?, ?, ?)");
            updatePerson = connection.prepareStatement("UPDATE addresses SET name_ = ?, email = ?, phoneNumber = ? WHERE addressID = ?");
            deletePerson = connection.prepareStatement("DELETE FROM addresses WHERE addressID = ?");
        }
        catch (SQLException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public List<Person> getAllPeople() {
        List<Person> results = null;
        ResultSet resultSet = null;

        try {
            resultSet = selectAllPeople.executeQuery();
            results = new ArrayList<>();

            while (resultSet.next()) {
                results.add(new Person(
                        resultSet.getInt("addressID"),
                        resultSet.getString("name_"),
                        resultSet.getString("email"),
                        resultSet.getString("phoneNumber")));

            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                resultSet.close();
            }
            catch (SQLException e) {
                e.printStackTrace();
                close();
            }
        }
        return results;
    }

    public List<Person> getPeopleName(String name) {
        List<Person> results = null;
        ResultSet resultSet = null;

        try {
            results = new ArrayList<>();

            selectPeopleByName.setString(1, name + "%");
            resultSet = selectPeopleByName.executeQuery();

            while (resultSet.next()) {
                results.add(new Person(
                        resultSet.getInt("addressID"),
                        resultSet.getString("name_"),
                        resultSet.getString("email"),
                        resultSet.getString("phoneNumber")));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                resultSet.close();
            }
            catch (SQLException e) {
                e.printStackTrace();
                close();
            }
        }
        return results;
    }

    public int addPerson(String name, String email, String phone) {
        int result = 0;

        try {

            if (name.equals("") || email.equals("") || phone.equals("")) {
                return result;
            }
            else {
                insertNewPerson.setString(1, name);
                insertNewPerson.setString(2, email);
                insertNewPerson.setString(3, phone);

                result = insertNewPerson.executeUpdate();
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int update(String name, String email, String phone, String ID) {
        int result = 0;

        try {
            if (name.equals("") || email.equals("") || phone.equals("")) {
                return result;
            }
            else {
                updatePerson.setString(1, name);
                updatePerson.setString(2, email);
                updatePerson.setString(3, phone);
                updatePerson.setString(4, ID);

                result = updatePerson.executeUpdate();
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public void delete(String ID) {
        try {
            deletePerson.setString(1, ID);

            deletePerson.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            connection.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
