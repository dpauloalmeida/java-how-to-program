package Capitulo25.Cap25_8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Controller {

    @FXML
    private TextField kilometersTextField;

    @FXML
    private TextField litersTextField;

    @FXML
    private TextField kmPerLiterTextField;

    @FXML
    private void calculateButtonPressed(ActionEvent event) {
        try {
            BigDecimal kilometers = new BigDecimal(kilometersTextField.getText());
            BigDecimal liters = new BigDecimal(litersTextField.getText());
            BigDecimal kmPerLiter = kilometers.divide(liters, RoundingMode.HALF_UP);

            kmPerLiterTextField.setText(kmPerLiter.toString());
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,  "Format Invalid", "Message Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void initialize() {

    }
}
