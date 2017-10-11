package com.deitel.exercicios.Capitulo27.TimeLine;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Bounds;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

import java.security.SecureRandom;

public class AppTimeLine {
    @FXML Circle c;
    @FXML AnchorPane anchorPane;

    public void initialize() {
        SecureRandom random = new SecureRandom();

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.millis(10),
                        new EventHandler<ActionEvent>() {
                            int dx = 1 + random.nextInt(5);
                            int dy = 1 + random.nextInt(5);

                            @Override
                            public void handle(final ActionEvent event) {
                                c.setLayoutX(c.getLayoutX() + dx);
                                c.setLayoutY(c.getLayoutY() + dy);
                                Bounds bounds = anchorPane.getBoundsInLocal();

                                if (hitRightOrLeftEdge(bounds)) {
                                    dx *= -1;
                                }

                                if (hitTopOrBottom(bounds)) {
                                    dy *= -1;
                                }
                            }
                        }
                )
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    private boolean hitRightOrLeftEdge(Bounds bounds) {
        return (c.getLayoutX() <= (bounds.getMinX() + c.getRadius())) ||
                (c.getLayoutX() >= (bounds.getMaxX() - c.getRadius()));
    }

    private boolean hitTopOrBottom(Bounds bounds) {
        return (c.getLayoutY() <= (bounds.getMinY() + c.getRadius())) ||
                (c.getLayoutY() >= (bounds.getMaxY() - c.getRadius()));
    }
}
