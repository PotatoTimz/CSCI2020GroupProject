package com.example.csci2020groupproject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.ResourceBundle;

public class ServerController implements Initializable{

    @FXML
    public static TextArea messageBox;

    @FXML
    Button exitButton;

    @FXML
    AnchorPane anchorPane;

    Stage stage;
    private Server server;
    private ClientHandler clients;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        messageBox.appendText("dawdwad");
    }

    /*public static void updateText(String message){
        String currentMessageLog = messageBox.getText();
        String updatedText = currentMessageLog+"\n"+message;
        messageBox.setText(updatedText);
    }*/

    public void setExitButton(ActionEvent event) throws IOException{
        stage = (Stage) anchorPane.getScene().getWindow();
        stage.close();
    }

}
