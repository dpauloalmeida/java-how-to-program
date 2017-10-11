package com.deitel.exercicios.Capitulo28;

import javax.swing.*;

public class ServerTest {
    public static void main(String[] args) {
        Server app = new Server();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.runServer();
    }
}
