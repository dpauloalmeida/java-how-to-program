package Capitulo26.Cap26_5;

import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.text.NumberFormat;


public class ColorChooser {
    @FXML private Slider redSlider;
    @FXML private Slider greenSlider;
    @FXML private Slider blueSlider;
    @FXML private Slider alphaSlider;
    @FXML private TextField redTextField;
    @FXML private TextField greenTextField;
    @FXML private TextField blueTextField;
    @FXML private TextField alphaTextField;
    @FXML private Rectangle colorRectangle;

    private int red = 0;
    private int green = 0;
    private int blue = 0;
    private double alpha = 1.0;

    public void initialize() {
        colorRectangle.setFill(Color.rgb(red, green, blue, alpha));

        redTextField.textProperty().bindBidirectional(redSlider.valueProperty(), NumberFormat.getIntegerInstance());
        greenTextField.textProperty().bindBidirectional(greenSlider.valueProperty(), NumberFormat.getIntegerInstance());
        blueTextField.textProperty().bindBidirectional(blueSlider.valueProperty(), NumberFormat.getIntegerInstance());
        alphaTextField.textProperty().bindBidirectional(alphaSlider.valueProperty(), NumberFormat.getInstance());

        redSlider.valueProperty().addListener(
                (ov, oldValue, newValue) -> {
                    red = newValue.intValue();
                    colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
                }
        );

        greenSlider.valueProperty().addListener(
                (ov, oldValue, newValue) -> {
                    green = newValue.intValue();
                    colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
                }
        );

        blueSlider.valueProperty().addListener(
                (ov, oldValue, newValue) -> {
                    blue = newValue.intValue();
                    colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
                }
        );

        alphaSlider.valueProperty().addListener(
                (ov, oldValue, newValue) -> {
                    alpha = newValue.intValue();
                    colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
                }
        );
    }

}
