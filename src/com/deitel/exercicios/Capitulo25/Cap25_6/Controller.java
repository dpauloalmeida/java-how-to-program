package Capitulo25.Cap25_6;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.event.ActionEvent;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class Controller {
    private static final NumberFormat currency = NumberFormat.getCurrencyInstance();
    private BigDecimal year = new BigDecimal(5);
    private BigDecimal monthsPerYear = new BigDecimal(12);

    @FXML
    private TextField loanValueTextField;

    @FXML
    private TextField annualRateTextField;

    @FXML
    private Label yearsLabel;

    @FXML
    private Slider yearsSlider;

    @FXML
    private TextField monthlyPaymentTextField;

    @FXML
    private void calculateButtonPressed(ActionEvent event) {
        try {
            BigDecimal loanValue = new BigDecimal(loanValueTextField.getText());
            BigDecimal annualRate = new BigDecimal(annualRateTextField.getText());
            BigDecimal totalRate = annualRate.multiply(year).divide(BigDecimal.valueOf(100.00));

            BigDecimal interest = loanValue.multiply(totalRate).add(loanValue);
            BigDecimal monthlyPayment = interest.divide(year.multiply(monthsPerYear), RoundingMode.HALF_UP);

            monthlyPaymentTextField.setText(currency.format(monthlyPayment));
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Format Invalid", "Message Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void initialize() {
        currency.setRoundingMode(RoundingMode.HALF_UP);

        yearsSlider.valueProperty().addListener(
                (ov, oldValue, newValue) -> {
                    year = BigDecimal.valueOf(newValue.intValue());
                    yearsLabel.setText(year + " Years");
                }
        );
    }

}
