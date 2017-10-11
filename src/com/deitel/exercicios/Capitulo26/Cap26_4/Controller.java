package Capitulo26.Cap26_4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class Controller {
    private static final NumberFormat currency = NumberFormat.getCurrencyInstance();
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

    public void initialize() {
        currency.setRoundingMode(RoundingMode.HALF_UP);

        tipPercentageLabel.textProperty().bind(tipPercentageSlider.valueProperty().asString("%.0f%%"));

        amountTextField.textProperty().addListener(
                (ov, oldValue, newValue) -> {
                    try {
                        BigDecimal amount = new BigDecimal(newValue.toString());
                        BigDecimal tip = amount.multiply(tipPercentage);
                        BigDecimal total = amount.add(tip);

                        tipTextField.setText(currency.format(tip));
                        totalTextField.setText(currency.format(total));
                    }
                    catch (NumberFormatException e) {
                        amountTextField.setText("Enter amount");
                        amountTextField.selectAll();
                        amountTextField.requestFocus();
                    }
                }
        );

        tipPercentageSlider.valueProperty().addListener(
                (ov, oldValue, newValue) -> {
                    tipPercentage = BigDecimal.valueOf(newValue.intValue() / 100.0);

                    try {
                        BigDecimal amount = new BigDecimal(amountTextField.getText());
                        BigDecimal tip = amount.multiply(tipPercentage);
                        BigDecimal total = amount.add(tip);

                        tipTextField.setText(currency.format(tip));
                        totalTextField.setText(currency.format(total));
                    }
                    catch (NumberFormatException e) {
                        amountTextField.setText("Enter amount");
                        amountTextField.selectAll();
                        amountTextField.requestFocus();
                    }
                }
        );
    }

}
