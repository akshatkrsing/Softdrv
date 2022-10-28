package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label wrong;
    @FXML
    private Button button;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    public void login(ActionEvent event) throws IOException {
        authorize();
    }
    public void authorize() throws IOException{
        HelloApplication m = new HelloApplication();
        if(username.getText().toString().equals("") && password.getText().toString().equals("")){
            wrong.setText("Authorized");
                    m.changeScene("");
        }
        else if(username.getText().isEmpty() && password.getText().isEmpty()){
            wrong.setText("Enter credentials");
        }
        else{
            wrong.setText("Wrong credentials");
        }
    }
}