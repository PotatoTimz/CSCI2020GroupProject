package com.example.csci2020groupproject;
import javafx.scene.control.TextArea;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class Server{

    private static ArrayList<ClientHandler> clients = new ArrayList<ClientHandler>();

    public static void main(String[] args){
        ServerSocket serverSocket;
        Socket socket;
        try{
            serverSocket = new ServerSocket(1234);
            while (true){
                System.out.println("Waiting for clients");
                socket = serverSocket.accept();
                System.out.println("Client connected");
                ClientHandler clientThread = new ClientHandler(socket, clients);
                clients.add(clientThread);
                clientThread.start();
            }
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}