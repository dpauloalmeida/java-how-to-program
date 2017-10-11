package com.deitel.exercicios.Capitulo26.CoverViewer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class CoverViewer {

    @FXML private ListView<Book> bookListView;
    @FXML private ImageView coverImageView;

    private final ObservableList<Book> books = FXCollections.observableArrayList();

    public void initialize() {
        books.add(new Book("Android How to Program",
                "file:/C:/Users/danil/IdeaProjects/JavaHowToProgramJavaFX/src/CoverViewer/small/androidhtp.jpg",
                "file:/C:/Users/danil/IdeaProjects/JavaHowToProgramJavaFX/src/CoverViewer/large/androidhtp.jpg"));

        books.add(new Book("C How to Program",
                "file:/C:/Users/danil/IdeaProjects/JavaHowToProgramJavaFX/src/CoverViewer/small/chtp.jpg",
                "file:/C:/Users/danil/IdeaProjects/JavaHowToProgramJavaFX/src/CoverViewer/large/chtp.jpg"));

        books.add(new Book("C++ How to Program",
                "file:/C:/Users/danil/IdeaProjects/JavaHowToProgramJavaFX/src/CoverViewer/small/cpphtp.jpg",
                "file:/C:/Users/danil/IdeaProjects/JavaHowToProgramJavaFX/src/CoverViewer/large/cpphtp.jpg"));

        books.add(new Book("Internet and World Wide Web How to Program",
                "file:/C:/Users/danil/IdeaProjects/JavaHowToProgramJavaFX/src/CoverViewer/small/iw3htp.jpg",
                "file:/C:/Users/danil/IdeaProjects/JavaHowToProgramJavaFX/src/CoverViewer/large/iw3htp.jpg"));

        books.add(new Book("Java How to Program",
                "file:/C:/Users/danil/IdeaProjects/JavaHowToProgramJavaFX/src/CoverViewer/small/jhtp.jpg",
                "file:/C:/Users/danil/IdeaProjects/JavaHowToProgramJavaFX/src/CoverViewer/large/jhtp.jpg"));

        books.add(new Book("Visual Basic How to Program",
                "file:/C:/Users/danil/IdeaProjects/JavaHowToProgramJavaFX/src/CoverViewer/small/vbhtp.jpg",
                "file:/C:/Users/danil/IdeaProjects/JavaHowToProgramJavaFX/src/CoverViewer/large/vbhtp.jpg"));

        books.add(new Book("Visual C# How to Program",
                "file:/C:/Users/danil/IdeaProjects/JavaHowToProgramJavaFX/src/CoverViewer/small/vcshtp.jpg",
                "file:/C:/Users/danil/IdeaProjects/JavaHowToProgramJavaFX/src/CoverViewer/large/vcshtp.jpg"));

        bookListView.setItems(books);

        bookListView.setCellFactory((listView) -> new ImageTextCell());

        bookListView.getSelectionModel().selectedItemProperty().addListener(
                (ov, oldValue, newValue) ->
                    coverImageView.setImage(new Image(newValue.getLargeImage()))
        );
    }
}
