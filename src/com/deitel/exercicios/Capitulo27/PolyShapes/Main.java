package com.deitel.exercicios.Capitulo27.PolyShapes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("AppPolyShapes.fxml"));

        primaryStage.setTitle("Draw Polylines, Polygons and Paths");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
