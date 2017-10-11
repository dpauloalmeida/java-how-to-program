package Capitulo25.Cap25_4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class Controller {
    private static final NumberFormat currency = NumberFormat.getCurrencyInstance();
    private static final NumberFormat percent = NumberFormat.getPercentInstance();
    private BigDecimal tipPercentage = new BigDecimal(0.15);

    @FXML
    private TextField amountTextField;

    @FXML
    private Label tipPercentageLabel;

    @FXML
    private Slider tipPercentageSlider;

    @FXML
    private TextField tipTextField;

    @FXML
    private TextField totalTextField;

    @FXML
    private TextField personsTextField;

    @FXML
    private TextField totalPersonTextField;


    @FXML
    private void calculateButtonPressed(ActionEvent event) {
        try {
            BigDecimal amount = new BigDecimal(amountTextField.getText());
            BigDecimal persons = new BigDecimal(personsTextField.getText());
            BigDecimal tip = amount.multiply(tipPercentage);
            BigDecimal total = amount.add(tip);
            BigDecimal totalPerson = total.divide(persons, 1);

            tipTextField.setText(currency.format(tip));
            totalPersonTextField.setText(currency.format(totalPerson));
            totalTextField.setText(currency.format(total));
        }
        catch (NumberFormatException e) {
            amountTextField.setText("Enter amount");
            personsTextField.setText("Enter persons");
            amountTextField.selectAll();
            amountTextField.requestFocus();
        }
    }

    public void initialize() {
        currency.setRoundingMode(RoundingMode.HALF_UP);
        personsTextField.setText("1");

        tipPercentageSlider.valueProperty().addListener(
                (ov, oldValue, newValue) -> {
                    tipPercentage = BigDecimal.valueOf(newValue.intValue() / 100.0);
                    tipPercentageLabel.setText(percent.format(tipPercentage));
                }
        );
    }

}
