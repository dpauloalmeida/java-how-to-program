package com.deitel.exercicios.Capitulo27.VideoPlayerGUI;

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
        Parent root = FXMLLoader.load(getClass().getResource("AppVideoPlayer.fxml"));

        primaryStage.setTitle("Video Player");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
