/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwallets;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class FXMLRegistrationController implements Initializable {

    @FXML
    private Label usernameLabel, pswLabel, nameLabel;

    @FXML
    private TextField username, name;

    @FXML
    private PasswordField psw;

    @FXML
    private void signupButtonAction(ActionEvent event) throws IOException {
        //"[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+" for email
        if (username.getText().isEmpty()) {
            usernameLabel.setText("Please fill the username");
            pswLabel.setText("");
            nameLabel.setText("");
        } else if (!username.getText().matches("[a-zA-Z0-9]*")) {
            usernameLabel.setText("Username must be a-z A-Z 0-9");
            pswLabel.setText("");
            nameLabel.setText("");
        } else if (username.getText().length() <= 6 || username.getText().length() >= 12) {
            usernameLabel.setText("Username must have 6-12 digit");
            pswLabel.setText("");
            nameLabel.setText("");

        } else if (psw.getText().isEmpty()) {
            pswLabel.setText("Please fill the password");
            usernameLabel.setText("");
            nameLabel.setText("");
        } else if (!psw.getText().matches("[a-zA-Z0-9]*")) {
            pswLabel.setText("Password must be a-z A-Z 0-9");
            usernameLabel.setText("");
            nameLabel.setText("");

        } else if (name.getText().isEmpty()) {
            nameLabel.setText("Please fill the name");
            usernameLabel.setText("");
            pswLabel.setText("");
        } else if (!name.getText().matches("[A-Z][a-z]* [A-Z][a-z]*")) {
            nameLabel.setText("Name must be a-z A-Z and ' ' and the first alphabet is must Uppercase");
            usernameLabel.setText("");
            pswLabel.setText("");
        } else {
            usernameLabel.setText("");
            pswLabel.setText("");
            nameLabel.setText("");

            Alert alert = new Alert(AlertType.CONFIRMATION, "Confirm ?", ButtonType.YES, ButtonType.NO);
            alert.showAndWait();

            if (alert.getResult() == ButtonType.YES) {
                username.getText();
                psw.getText();
                name.getText();

                Parent loginParent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
                Scene loginScene = new Scene(loginParent);

                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setScene(loginScene);
                window.show();
            }
            
            if (alert.getResult() == ButtonType.NO) {
                username.clear();
                psw.clear();
                name.clear();
            }

        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb
    ) {
        // TODO
    }

}
