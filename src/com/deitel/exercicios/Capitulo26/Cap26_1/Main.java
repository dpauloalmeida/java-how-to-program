package Capitulo26.Cap26_1;

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
        Parent root = FXMLLoader.load(getClass().getResource("AppPainter.fxml"));

        primaryStage.setTitle("Painter");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
