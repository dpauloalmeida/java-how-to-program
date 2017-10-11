package com.deitel.exercicios.Capitulo28;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends JFrame {
    private JTextField enterField;
    private JTextArea displayArea;
    private ObjectOutputStream outputStream;
    private ObjectInputStream inputStream;
    private ServerSocket server;
    private Socket connection;
    private int counter = 1;

    public Server() {
        super("Server");

        enterField = new JTextField();
        enterField.setEditable(false);
        enterField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendData(e.getActionCommand());
                enterField.setText("");
            }
        });

        add(enterField, BorderLayout.NORTH);

        displayArea = new JTextArea();
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        setSize(300, 150);
        setVisible(true);
    }

    public void runServer() {
        try {
            server = new ServerSocket(12345, 100);
            while (true) {
                try {
                    waitForConnection();
                    getStream();
                    processConnection();
                }
                catch (EOFException e) {
                    displayMessage("\nServer terminated connection");
                }
                finally {
                    closeConnection();
                    ++counter;
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void waitForConnection() throws IOException {
        displayMessage("Waiting for connection\n");
        connection = server.accept();
        displayMessage("Connection " + counter + " received from: " + connection.getInetAddress().getHostName());

    }

    private void getStream() throws IOException {
        outputStream = new ObjectOutputStream(connection.getOutputStream());
        outputStream.flush();

        inputStream = new ObjectInputStream(connection.getInputStream());

        displayMessage("\nGot I/O streams\n");
    }

    private void processConnection() throws IOException {
        String message = "Connection successful";
        sendData(message);

        setTextFieldEditable(true);

        do {
            try {
                message = (String) inputStream.readObject();
                displayMessage("%n" + message);
            }
            catch (ClassNotFoundException e) {
                displayMessage("\nUnknown object type received");
            }
        } while (!message.equals("Client >>> Terminate"));
    }

    private void closeConnection() {
        displayMessage("\nTerminating connection\n");
        setTextFieldEditable(false);

        try {
            outputStream.close();
            inputStream.close();
            connection.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sendData(String message) {
        try {
            outputStream.writeObject("Server >>> " + message);
            outputStream.flush();
            displayMessage("\nServer >>> " + message);
        }
        catch (IOException e) {
            displayMessage("\nError writing object");
        }
    }

    private void displayMessage(final String messageToDisplay) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                displayArea.append(messageToDisplay);
            }
        });
    }

    private void setTextFieldEditable(final boolean editable) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                enterField.setEditable(editable);
            }
        });
    }
}
