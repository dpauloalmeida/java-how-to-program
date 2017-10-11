package com.deitel.exercicios.Capitulo27.Cap27_1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.shape.Rectangle;

import java.net.URL;

public class AppUsingGradient {

    private enum GradientType {RADIAL, LINEAR};

    @FXML RadioButton radialRadioButton;
    @FXML RadioButton linearRadioButton;
    @FXML TextField startingTextField;
    @FXML TextField endingTextField;
    @FXML ToggleGroup gradientTypeToggleGroup;
    @FXML Rectangle rectangle;

    private GradientType gradientType = GradientType.RADIAL;
    public URL css;

    public void initialize() {
        radialRadioButton.setUserData(GradientType.RADIAL);
        linearRadioButton.setUserData(GradientType.LINEAR);
    }

    @FXML
    private void applyButtonPressed(ActionEvent event) {
        displayGradient();
    }

    @FXML
    private void gradientTypeRadioButtonSelected(ActionEvent event) {
        gradientType = (GradientType) gradientTypeToggleGroup.getSelectedToggle().getUserData();
    }

    private void displayGradient() {
        switch (gradientType) {
            case RADIAL:
                css.getClass().getResource("radial.css").toExternalForm();
                break;
            case LINEAR:
                css.getClass().getResource("linear.css").toExternalForm();
                break;
        }
    }

}
