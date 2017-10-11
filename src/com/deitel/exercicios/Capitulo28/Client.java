package com.deitel.exercicios.Capitulo28;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client extends JFrame {
    private JTextField enterField;
    private JTextArea displayArea;
    private ObjectOutputStream outputStream;
    private ObjectInputStream inputStream;
    private String message = "";
    private String chatServer;
    private Socket client;

    public Client(String host) {
        super("Client");

        chatServer = host;

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

    public void runClient() {
        try {
            connectToServer();
            getStream();
            processConnection();
        }
        catch (EOFException e) {
            displayMessage("\nClient terminated connection");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            closeConnection();
        }
    }

    private void connectToServer() throws IOException {
        displayMessage("Attempting connection\n");

        client = new Socket(InetAddress.getByName(chatServer), 12345);

        displayMessage("Connected to: " + client.getInetAddress().getHostName());
    }

    private void getStream() throws IOException {
        outputStream = new ObjectOutputStream(client.getOutputStream());
        outputStream.flush();

        inputStream = new ObjectInputStream(client.getInputStream());

        displayMessage("\nGot I/O streams\n");
    }

    private void processConnection() throws IOException {
        setTextFieldEditable(true);

        do {
            try {
                message = (String) inputStream.readObject();
                displayMessage("\n" + message);
            }
            catch (ClassNotFoundException e) {
                displayMessage("\nUnknown object type received");
            }
        } while (!message.equals("Server >>> terminate"));
    }

    private void closeConnection() {
        displayMessage("\nClosing connection");

        setTextFieldEditable(false);

        try {
            outputStream.close();
            inputStream.close();
            client.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sendData(String message) {
        try {
            outputStream.writeObject("Client >>> " + message);
            outputStream.flush();
            displayMessage("\nClient >>> " + message);
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
