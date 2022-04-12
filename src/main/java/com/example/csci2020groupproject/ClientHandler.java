package com.example.csci2020groupproject;

import javafx.scene.control.TextArea;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler extends Thread {

    private ArrayList<ClientHandler> clients;
    private Socket socket;
    private static DataInputStream inStream = null;


    public ClientHandler(Socket socket, ArrayList<ClientHandler> clients) {
        try {
            this.socket = socket;
            this.clients = clients;
            this.inStream = new DataInputStream(socket.getInputStream());
        }
        catch (IOException e){
            System.out.println(e);
        }
    }

    public void run() {
        try {
            while (socket.isConnected()) {
                String messageFromClient = inStream.readUTF();
                //ServerController.updateText(messageFromClient);
                System.out.println(messageFromClient);
                //String previousMessages = textBox.getText();
                //textBox.setText(previousMessages+"\n"+messageFromClient);
            }
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
