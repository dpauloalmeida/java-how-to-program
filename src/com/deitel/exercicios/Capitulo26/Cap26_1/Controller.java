package Capitulo26.Cap26_1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;


public class Controller {

    private enum PenSize {
        SMALL(2),
        MEDIUM(4),
        LARGE(6);

        private final int radius;

        PenSize(int radius) {
            this.radius = radius;
        }

        public int getRadius() {
            return radius;
        }
    }

    @FXML private Slider redSlider;
    @FXML private Slider greenSlider;
    @FXML private Slider blueSlider;
    @FXML private Slider alphaSlider;
    @FXML private TextField redTextField;
    @FXML private TextField greenTextField;
    @FXML private TextField blueTextField;
    @FXML private TextField alphaTextField;
    @FXML private Rectangle colorRectangle;

    @FXML private RadioButton smallRadioButton;
    @FXML private RadioButton mediumRadioButton;
    @FXML private RadioButton largeRadioButton;
    @FXML private AnchorPane drawingAreaAnchorPane;
    @FXML private ToggleGroup sizeToggleGroup;

    private int red = 0;
    private int green = 0;
    private int blue = 0;
    private double alpha = 1.0;

    private PenSize radius = PenSize.MEDIUM;
    private Paint brushColor = Color.rgb(red, green, blue, alpha);

    public void initialize() {
        colorRectangle.setFill(Color.rgb(red, green, blue, alpha));

        redTextField.textProperty().bind(redSlider.valueProperty().asString("%.0f"));
        greenTextField.textProperty().bind(greenSlider.valueProperty().asString("%.0f"));
        blueTextField.textProperty().bind(blueSlider.valueProperty().asString("%.0f"));
        alphaTextField.textProperty().bind(alphaSlider.valueProperty().asString("%.2f"));

        smallRadioButton.setUserData(PenSize.SMALL);
        mediumRadioButton.setUserData(PenSize.MEDIUM);
        largeRadioButton.setUserData(PenSize.LARGE);

        redSlider.valueProperty().addListener(
                (ov, oldValue, newValue) -> {
                    red = newValue.intValue();
                    colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
                    brushColor = Color.rgb(red, green, blue, alpha);
                }
        );

        greenSlider.valueProperty().addListener(
                (ov, oldValue, newValue) -> {
                    green = newValue.intValue();
                    colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
                    brushColor = Color.rgb(red, green, blue, alpha);
                }
        );

        blueSlider.valueProperty().addListener(
                (ov, oldValue, newValue) -> {
                    blue = newValue.intValue();
                    colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
                    brushColor = Color.rgb(red, green, blue, alpha);
                }
        );

        alphaSlider.valueProperty().addListener(
                (ov, oldValue, newValue) -> {
                    alpha = newValue.intValue();
                    colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
                    brushColor = Color.rgb(red, green, blue, alpha);
                }
        );
    }

    @FXML
    private void drawingAreaMouseDragged(MouseEvent event) {
        Circle newCircle = new Circle(event.getX(), event.getY(), radius.getRadius(), brushColor);

        drawingAreaAnchorPane.getChildren().add(newCircle);
    }

    @FXML
    private void sizeRadioButtonSelected(ActionEvent event) {
        radius = (PenSize) sizeToggleGroup.getSelectedToggle().getUserData();
    }

    @FXML
    private void undoButtonPressed(ActionEvent event) {
        int count = drawingAreaAnchorPane.getChildren().size();

        if (count > 0) {
            drawingAreaAnchorPane.getChildren().remove( count - 1);
        }
    }

    @FXML
    private void clearButtonPressed(ActionEvent event) {
        drawingAreaAnchorPane.getChildren().clear();
    }
}
