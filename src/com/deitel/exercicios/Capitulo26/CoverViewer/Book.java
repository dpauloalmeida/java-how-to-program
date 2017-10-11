package com.deitel.exercicios.Capitulo26.CoverViewer;

public class Book {
    private String title;
    private String thumbImage;
    private String largeImage;

    public Book(String title, String thumbImage, String largeImage) {
        this.title = title;
        this.thumbImage = thumbImage;
        this.largeImage = largeImage;
    }

    @Override
    public String toString() {
        return getTitle();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbImage() {
        return thumbImage;
    }

    public void setThumbImage(String thumbImage) {
        this.thumbImage = thumbImage;
    }

    public String getLargeImage() {
        return largeImage;
    }

    public void setLargeImage(String largeImage) {
        this.largeImage = largeImage;
    }
}
