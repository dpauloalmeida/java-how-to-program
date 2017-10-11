package com.deitel.exercicios.Capitulo26.CoverViewer;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;


public class ImageTextCell extends ListCell<Book> {

    @Override
    protected void updateItem(Book item, boolean empty) {
        super.updateItem(item, empty);

        if (empty || item == null) {
            setGraphic(null);
        }
        else {
            VBox vbox = new VBox(8.0);
            vbox.setAlignment(Pos.CENTER);

            ImageView thumbImageView = new ImageView(new Image(item.getThumbImage()));
            thumbImageView.setPreserveRatio(true);
            thumbImageView.setFitHeight(100.0);
            vbox.getChildren().add(thumbImageView);

            Label label = new Label(item.getTitle());
            label.setWrapText(true);
            label.setTextAlignment(TextAlignment.CENTER);
            vbox.getChildren().add(label);

            setGraphic(vbox);
            setPrefWidth(USE_PREF_SIZE);
        }
    }
}
