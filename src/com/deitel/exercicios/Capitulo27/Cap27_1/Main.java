package com.deitel.exercicios.Capitulo27.Cap27_1;

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
        AppUsingGradient appUsingGradient = new AppUsingGradient();

        Parent root = FXMLLoader.load(getClass().getResource("AppUsingGradient.fxml"));

        primaryStage.setTitle("Using Gradient Types");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
