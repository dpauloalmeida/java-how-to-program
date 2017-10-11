package Capitulo26.Cap26_2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import javax.swing.*;

public class AppContacts {
    @FXML private ListView<Contacts> contactsListView;
    @FXML private TextField firstNameTextField;
    @FXML private TextField lastNameTextField;
    @FXML private TextField emailTextField;
    @FXML private TextField phoneTextField;

    private final ObservableList<Contacts> contacts = FXCollections.observableArrayList();

    public void initialize() {
        contactsListView.getSelectionModel().selectedItemProperty().addListener(
                (ov, oldValue, newValue) -> {
                    firstNameTextField.setText(newValue.getFirstName());
                    lastNameTextField.setText(newValue.getLastName());
                    emailTextField.setText(newValue.getEmail());
                    phoneTextField.setText(newValue.getPhoneNumber());
                }
        );
    }

    @FXML
    private void includeButtonPressed(ActionEvent event) {
        try {
            contacts.add(new Contacts(firstNameTextField.getText(), lastNameTextField.getText(),
                    emailTextField.getText(), phoneTextField.getText()));

            contactsListView.setItems(contacts);
        }
        catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Message", JOptionPane.ERROR_MESSAGE);
        }
        finally {
            firstNameTextField.setText("");
            lastNameTextField.setText("");
            emailTextField.setText("");
            phoneTextField.setText("");
        }
    }

    @FXML
    private void updateButtonPressed(ActionEvent event) {

    }

    @FXML
    private void deleteButtonPressed(ActionEvent event) {

    }
}
