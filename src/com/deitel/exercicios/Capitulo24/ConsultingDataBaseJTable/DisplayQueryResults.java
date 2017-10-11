package com.deitel.exercicios.Capitulo24.ConsultingDataBaseJTable;

import javax.swing.*;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.regex.PatternSyntaxException;

public class DisplayQueryResults extends JFrame {

    private static final String DATABASE_URL = "jdbc:mysql://localhost/deitel_java_cap24_ex1";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static final String DEFAULT_QUERY = "SELECT * FROM authors";
    private static ResultSetTableModel tableModel;

    public static void main(String[] args) {
        try {
            tableModel = new ResultSetTableModel(DATABASE_URL, USER, PASSWORD, DEFAULT_QUERY);

            final JTextArea queryArea = new JTextArea(DEFAULT_QUERY, 3, 100);
            queryArea.setWrapStyleWord(true);
            queryArea.setLineWrap(true);

            JScrollPane scrollPane = new JScrollPane(queryArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                    ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

            JButton submitButton = new JButton("Submit Query");

            Box boxNorth = Box.createHorizontalBox();
            boxNorth.add(scrollPane);
            boxNorth.add(submitButton);

            JTable resultTable = new JTable(tableModel);

            JLabel filterLabel = new JLabel("Filter:");
            final JTextField filterTextField = new JTextField();
            JButton filterButton = new JButton("Apply Filter");

            Box boxSouth = Box.createHorizontalBox();
            boxSouth.add(filterLabel);
            boxSouth.add(filterTextField);
            boxSouth.add(filterButton);

            JFrame window = new JFrame("Displaying Query Results");
            window.add(boxNorth, BorderLayout.NORTH);
            window.add(new JScrollPane(resultTable), BorderLayout.CENTER);
            window.add(boxSouth, BorderLayout.SOUTH);

            final TableRowSorter<TableModel> sorter = new TableRowSorter<>(tableModel);
            resultTable.setRowSorter(sorter);

            submitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    try {
                        filterTextField.setText("");
                        sorter.setRowFilter(RowFilter.regexFilter(""));
                        tableModel.setQuery(queryArea.getText());
                    }
                    catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(),
                                "Database error", JOptionPane.ERROR_MESSAGE);

                        try {
                            tableModel.setQuery(DEFAULT_QUERY);
                            queryArea.setText(DEFAULT_QUERY);
                        }
                        catch (SQLException e1) {
                            JOptionPane.showMessageDialog(null, e1.getMessage(),
                                    "Database error", JOptionPane.ERROR_MESSAGE);

                            tableModel.disconnectFromDatabase();
                            System.exit(1);
                        }
                    }
                }
            });

            filterButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    String text = filterTextField.getText();

                    if (text.length() == 0) {
                        sorter.setRowFilter(null);
                    }
                    else {
                        try {
                            sorter.setRowFilter(RowFilter.regexFilter(text));
                        }
                        catch (PatternSyntaxException e) {
                            JOptionPane.showMessageDialog(null, "Bad regex pattern",
                                    "Bad regex pattern", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            });

            window.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            window.setBounds(400, 400, 500, 300);
            window.setVisible(true);

            window.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent event) {
                    tableModel.disconnectFromDatabase();
                    System.exit(0);
                }
            });
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Database error", JOptionPane.ERROR_MESSAGE);

            tableModel.disconnectFromDatabase();
            System.exit(1);
        }
    }
}
