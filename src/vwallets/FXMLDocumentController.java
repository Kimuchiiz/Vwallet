/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwallets;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

/**
 *
 * @author USER
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label wrongformat;

    @FXML
    private TextField username;

    @FXML
    private PasswordField psw;

    @FXML
    private void signinButtonAction(ActionEvent event) {
        //"[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+" for email
        if (!username.getText().matches("[a-zA-Z0-9]*") || username.getText().isEmpty()) {
            wrongformat.setText("username must be a-z A-Z 0-9");
        }else if (username.getText().length() <= 6 || username.getText().length() >= 12){
            wrongformat.setText("username must have 6-12 digit");
        }else if (!psw.getText().matches("[a-zA-Z0-9]*")||psw.getText().isEmpty()) {
            wrongformat.setText("password must be a-z A-Z 0-9");
        } else {
            username.getText();
            psw.getText();
            wrongformat.setText("");
        }
    }
      
    @FXML   
    private void signupButtonAction(ActionEvent event) throws Exception{  
         Parent registrationParent = FXMLLoader.load(getClass().getResource("FXMLRegistration.fxml"));
         Scene registrationScene = new Scene(registrationParent);
         
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(registrationScene);
         window.show();
         
     }     
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
