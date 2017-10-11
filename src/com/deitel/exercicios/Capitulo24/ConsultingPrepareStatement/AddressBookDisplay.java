package com.deitel.exercicios.Capitulo24.ConsultingPrepareStatement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

public class AddressBookDisplay extends JFrame {

    private Person currentEntry;
    private PersonQueries personQueries;
    private List<Person> results;
    private int numberOfEntries = 0;
    private int currentEntryIndex;

    private JButton browserButton;
    private JLabel emailLabel;
    private JTextField emailTextField;
    private JLabel nameLabel;
    private JTextField nameTextField;
    private JLabel idLabel;
    private JTextField idTextField;
    private JTextField indexTextField;
    private JTextField maxTextField;
    private JButton nextButton;
    private JLabel ofLabel;
    private JLabel phoneLabel;
    private JTextField phoneTextField;
    private JButton previousButton;
    private JButton queryButton;
    private JLabel queryLabel;
    private JPanel queryPanel;
    private JPanel navigatePanel;
    private JPanel displayPanel;
    private JTextField queryTextField;
    private JButton insertButton;
    private JButton updateButton;
    private JButton deleteButton;

    public AddressBookDisplay() {
        super("Address Book");

        personQueries = new PersonQueries();

        navigatePanel = new JPanel();
        previousButton = new JButton();
        indexTextField = new JTextField(2);
        ofLabel = new JLabel();
        maxTextField = new JTextField(2);
        nextButton = new JButton();
        displayPanel = new JPanel();
        idLabel = new JLabel();
        idTextField = new JTextField(10);
        nameLabel = new JLabel();
        nameTextField = new JTextField(20);
        emailLabel = new JLabel();
        emailTextField = new JTextField(10);
        phoneLabel = new JLabel();
        phoneTextField = new JTextField(10);
        queryPanel = new JPanel();
        queryLabel = new JLabel();
        queryTextField = new JTextField(20);
        queryButton = new JButton();
        browserButton = new JButton();
        insertButton = new JButton();
        updateButton = new JButton();
        deleteButton = new JButton();

        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        setBounds(400, 400, 400, 300);
        setResizable(false);

        navigatePanel.setLayout(new BoxLayout(navigatePanel, BoxLayout.X_AXIS));

        previousButton.setText("Previous");
        previousButton.setEnabled(false);
        previousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                previousButtonActionPerformed(e);
            }
        });
        navigatePanel.add(previousButton);
        navigatePanel.add(Box.createHorizontalStrut(10));

        indexTextField.setHorizontalAlignment(JTextField.CENTER);
        indexTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indexTextFieldActionPerformed(e);
            }
        });
        navigatePanel.add(indexTextField);
        navigatePanel.add(Box.createHorizontalStrut(10));

        ofLabel.setText("of");
        navigatePanel.add(ofLabel);
        navigatePanel.add(Box.createHorizontalStrut(10));

        maxTextField.setHorizontalAlignment(JTextField.CENTER);
        maxTextField.setEditable(false);
        navigatePanel.add(maxTextField);
        navigatePanel.add(Box.createHorizontalStrut(10));

        nextButton.setText("Next");
        nextButton.setEnabled(false);
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nextButtonActionPerformed(e);
            }
        });
        navigatePanel.add(nextButton);
        add(navigatePanel);

        displayPanel.setLayout(new GridLayout(5, 2, 4, 4));

        idLabel.setText("Address ID:");
        displayPanel.add(idLabel);

        idTextField.setEditable(false);
        displayPanel.add(idTextField);

        nameLabel.setText("Name:");
        displayPanel.add(nameLabel);
        displayPanel.add(nameTextField);

        emailLabel.setText("Email:");
        displayPanel.add(emailLabel);
        displayPanel.add(emailTextField);

        phoneLabel.setText("Phone:");
        displayPanel.add(phoneLabel);
        displayPanel.add(phoneTextField);
        add(displayPanel);

        queryPanel.setLayout(new BoxLayout(queryPanel, BoxLayout.X_AXIS));

        queryPanel.setBorder(BorderFactory.createTitledBorder("Find an entry by name"));
        queryLabel.setText("Name:");
        queryPanel.add(Box.createHorizontalStrut(5));
        queryPanel.add(queryLabel);
        queryPanel.add(Box.createHorizontalStrut(10));
        queryPanel.add(queryTextField);
        queryPanel.add(Box.createHorizontalStrut(10));

        queryButton.setText("Find");
        queryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                queryButtonActionPerformed(e);
            }
        });
        queryPanel.add(queryButton);
        queryPanel.add(Box.createHorizontalStrut(5));
        add(queryPanel);

        browserButton.setText("Browser All Entries");
        browserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                browserButtonActionPerformed(e);
            }
        });
        add(browserButton);

        insertButton.setText("Insert");
        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertButtonActionPerformed(e);
            }
        });
        add(insertButton);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                personQueries.close();
                System.exit(0);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateButtonActionPerformed(e);
            }
        });
        add(updateButton);

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteButtonActionPerformed(e);
            }
        });
        add(deleteButton);

        setVisible(true);
    }

    private void previousButtonActionPerformed(ActionEvent evt) {
        --currentEntryIndex;

        if (currentEntryIndex < 1) {
            previousButton.setEnabled(false);
        }
        else {
            nextButton.setEnabled(true);
        }

        indexTextField.setText("" + (currentEntryIndex + 1));
        indexTextFieldActionPerformed(evt);
    }

    private void nextButtonActionPerformed(ActionEvent evt) {
        ++currentEntryIndex;

        if (currentEntryIndex >= numberOfEntries - 1) {
            nextButton.setEnabled(false);
        }
        else {
            previousButton.setEnabled(true);
        }

        indexTextField.setText("" + (currentEntryIndex + 1));
        indexTextFieldActionPerformed(evt);
    }

    private void queryButtonActionPerformed(ActionEvent evt) {
        results = personQueries.getPeopleName(queryTextField.getText());
        numberOfEntries = results.size();

        if (numberOfEntries != 0) {
            currentEntryIndex = 0;

            currentEntry = results.get(currentEntryIndex);
            idTextField.setText("" + currentEntry.getAddressID());
            nameTextField.setText("" + currentEntry.getName());
            emailTextField.setText("" + currentEntry.getEmail());
            phoneTextField.setText("" + currentEntry.getPhoneNumber());
            maxTextField.setText("" + numberOfEntries);
            indexTextField.setText("" + (currentEntryIndex + 1));

            previousButton.setEnabled(true);
        }
        else {
            browserButtonActionPerformed(evt);
        }
    }

    private void indexTextFieldActionPerformed(ActionEvent evt) {
        currentEntryIndex = (Integer.parseInt(indexTextField.getText()) - 1);

        if (numberOfEntries != 0 && currentEntryIndex < numberOfEntries) {
            currentEntry = results.get(currentEntryIndex);
            idTextField.setText("" + currentEntry.getAddressID());
            nameTextField.setText("" + currentEntry.getName());
            emailTextField.setText("" + currentEntry.getEmail());
            phoneTextField.setText("" + currentEntry.getPhoneNumber());
            maxTextField.setText("" + numberOfEntries);
            indexTextField.setText("" + (currentEntryIndex + 1));
        }
    }

    private void browserButtonActionPerformed(ActionEvent evt) {
        try {
            results = personQueries.getAllPeople();
            numberOfEntries = results.size();

            if (numberOfEntries != 0) {
                currentEntryIndex = 0;
                currentEntry = results.get(currentEntryIndex);
                idTextField.setText("" + currentEntry.getAddressID());
                nameTextField.setText("" + currentEntry.getName());
                emailTextField.setText("" + currentEntry.getEmail());
                phoneTextField.setText("" + currentEntry.getPhoneNumber());
                maxTextField.setText("" + numberOfEntries);
                indexTextField.setText("" + (currentEntryIndex + 1));

                nextButton.setEnabled(true);
                previousButton.setEnabled(false);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void insertButtonActionPerformed(ActionEvent evt) {
        int result = personQueries.addPerson(nameTextField.getText(),
                emailTextField.getText(), phoneTextField.getText());

        if (result == 1) {
            JOptionPane.showMessageDialog(this, "Person added!", "Person added",
                    JOptionPane.PLAIN_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(this, "Person not added!",
                    "Person added", JOptionPane.ERROR_MESSAGE);
        }

        browserButtonActionPerformed(evt);
    }

    private void updateButtonActionPerformed(ActionEvent evt) {
        int result = personQueries.update(nameTextField.getText(), emailTextField.getText(),
                phoneTextField.getText(), idTextField.getText());



        if (result == 1) {
            JOptionPane.showMessageDialog(this, "Person update!", "Person update",
                    JOptionPane.PLAIN_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(this, "Person not update!",
                    "Person added", JOptionPane.ERROR_MESSAGE);
        }

        browserButtonActionPerformed(evt);
    }

    private void deleteButtonActionPerformed(ActionEvent evt) {
        personQueries.delete(idTextField.getText());

        browserButtonActionPerformed(evt);
    }

    public static void main(String[] args) {
        new AddressBookDisplay();
    }

}
