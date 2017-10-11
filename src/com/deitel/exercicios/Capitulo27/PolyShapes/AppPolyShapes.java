package com.deitel.exercicios.Capitulo27.PolyShapes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.*;

public class AppPolyShapes {

    private enum ShapeType {POLYLINE, POLYGON, PATH};

    @FXML private RadioButton polylineRadioButton;
    @FXML private RadioButton polygonRadioButton;
    @FXML private RadioButton pathRadioButton;
    @FXML private ToggleGroup toggleGroup;
    @FXML private Polyline polyline;
    @FXML private Polygon polygon;
    @FXML private Path path;

    private ShapeType shapeType = ShapeType.POLYLINE;
    private boolean sweepFlag = true;

    public void initialize() {
        polylineRadioButton.setUserData(ShapeType.POLYLINE);
        polygonRadioButton.setUserData(ShapeType.POLYGON);
        pathRadioButton.setUserData(ShapeType.PATH);

        displayShape();
    }

    @FXML
    private void drawingAreaMouseClicked(MouseEvent event) {
        polyline.getPoints().addAll(event.getX(), event.getY());
        polygon.getPoints().addAll(event.getX(), event.getY());

        if (path.getElements().isEmpty()) {
            path.getElements().add(new MoveTo(event.getX(), event.getY()));
            path.getElements().add(new ClosePath());
        }
        else {
            ArcTo arcTo = new ArcTo();
            arcTo.setX(event.getX());
            arcTo.setY(event.getY());
            arcTo.setRadiusX(100.0);
            arcTo.setRadiusY(100.0);
            arcTo.setSweepFlag(sweepFlag);
            sweepFlag = !sweepFlag;
            path.getElements().add(path.getElements().size() - 1, arcTo);
        }
    }

    @FXML
    private void shapeRadioButtonSelected(ActionEvent event) {
        shapeType = (ShapeType) toggleGroup.getSelectedToggle().getUserData();
        displayShape();
    }

    private void displayShape() {
        switch (shapeType) {
            case POLYLINE:
                polyline.setVisible(true);
                polygon.setVisible(false);
                path.setVisible(false);
                break;

            case POLYGON:
                polyline.setVisible(false);
                polygon.setVisible(true);
                path.setVisible(false);
                break;

            case PATH:
                polyline.setVisible(false);
                polygon.setVisible(false);
                path.setVisible(true);
                break;
        }
    }

    @FXML
    private void clearButtonPressed(ActionEvent event) {
        polyline.getPoints().clear();
        polygon.getPoints().clear();
        path.getElements().clear();
    }
}
