package Capitulo25.Cap25_5;

import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class Controller {
    private static final NumberFormat currency = NumberFormat.getCurrencyInstance();
    private BigDecimal years = new BigDecimal(10);
    private BigDecimal monthsPerYear = new BigDecimal(12);

    @FXML
    private TextField purchaseValueTextField;

    @FXML
    private TextField inputValueTextField;

    @FXML
    private Label yearsLabel;

    @FXML
    private Slider yearsSlider;

    @FXML
    private TextField loanAmountTextField;

    @FXML
    private TextField interestRateTextField;

    @FXML
    private TextField monthlyPaymentTextField;

    @FXML
    private void calculateButtonPressed(ActionEvent event) {
        try {
            BigDecimal purchaseValue = new BigDecimal(purchaseValueTextField.getText());
            BigDecimal inputValue = new BigDecimal(inputValueTextField.getText());
            BigDecimal interestRate = new BigDecimal(interestRateTextField.getText());
            BigDecimal rate = interestRate.divide(BigDecimal.valueOf(100.0));
            BigDecimal loanAmount = purchaseValue.subtract(inputValue);

            BigDecimal interest = loanAmount.divide(years.multiply(monthsPerYear), 1).multiply(rate);
            BigDecimal monthlyPayment = loanAmount.divide(years.multiply(monthsPerYear), 1).add(interest);

            loanAmountTextField.setText(currency.format(loanAmount));
            monthlyPaymentTextField.setText(currency.format(monthlyPayment));
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Format Invalid");


        }
    }

    public void initialize() {
        currency.setRoundingMode(RoundingMode.HALF_UP);

        yearsSlider.valueProperty().addListener(
                (ov, oldValue, newValue) -> {
                    years = BigDecimal.valueOf(newValue.intValue());
                    yearsLabel.setText(years + " Years");
                }
        );
    }

}
