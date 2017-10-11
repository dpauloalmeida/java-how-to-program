package Capitulo25.Cap25_9;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javax.swing.*;

public class Controller {

    @FXML
    private TextField weightTextField;

    @FXML
    private TextField heightTextField;

    @FXML
    private void calculateButtonPressed(ActionEvent event) {
        try {
            double weight = Double.parseDouble(weightTextField.getText());
            double height = Double.parseDouble(heightTextField.getText());

            double imc = weight / (height * height);

            if (imc < 16) {
                JOptionPane.showMessageDialog(null, "Magreza Grave");
            }
            else if (imc >= 16 && imc < 17) {
                JOptionPane.showMessageDialog(null, "Magreza Moderada");
            }
            else if (imc >= 17 && imc < 18.5) {
                JOptionPane.showMessageDialog(null, "Magreza Leve");
            }
            else if (imc >= 18.5 && imc < 25) {
                JOptionPane.showMessageDialog(null, "Saudável");
            }
            else if (imc >= 25 && imc < 30) {
                JOptionPane.showMessageDialog(null, "Sobrepeso");
            }
            else if (imc >= 30 && imc < 35) {
                JOptionPane.showMessageDialog(null, "Obesidade Grau I");
            }
            else if (imc >= 35 && imc < 40) {
                JOptionPane.showMessageDialog(null, "Obesidade Grau II");
            }
            else {
                JOptionPane.showMessageDialog(null, "Obesidade Grau II");
            }
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Format Invalid", "Message Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
