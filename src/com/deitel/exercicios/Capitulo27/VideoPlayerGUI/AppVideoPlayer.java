package com.deitel.exercicios.Capitulo27.VideoPlayerGUI;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;


import java.net.URL;


public class AppVideoPlayer {
    @FXML private MediaView mediaView;
    @FXML private Button playPauseButton;
    private MediaPlayer mediaPlayer;
    private boolean playing = false;

    public void initialize() {
        URL url = AppVideoPlayer.class.getResource("sts117.mp4");
        Media media = new Media(url.toExternalForm());
        mediaPlayer = new MediaPlayer(media);
        mediaView.setMediaPlayer(mediaPlayer);

        mediaPlayer.setOnEndOfMedia(() -> {
            playing = false;
            playPauseButton.setText("Play");
        });

        mediaPlayer.setOnError(() -> {

        });

        DoubleProperty width = mediaView.fitWidthProperty();
        DoubleProperty height = mediaView.fitHeightProperty();

        width.bind(Bindings.selectDouble(mediaView.sceneProperty(), "width"));
        height.bind(Bindings.selectDouble(mediaView.sceneProperty(), "height"));
    }

    @FXML
    private void playPauseButtonPressed(ActionEvent event) {
        playing = !playing;

        if (playing) {
            playPauseButton.setText("Pause");
            mediaPlayer.play();
        }
        else {
            playPauseButton.setText("Play");
            mediaPlayer.pause();
        }
    }
}
