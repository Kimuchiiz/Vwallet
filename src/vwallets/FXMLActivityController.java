/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwallets;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class FXMLActivityController implements Initializable {

    @FXML
    private void optionButtonAction(ActionEvent event) throws IOException {
        Parent accountParent = FXMLLoader.load(getClass().getResource("FXMLAccount.fxml"));
        Scene accountScene = new Scene(accountParent);
        accountScene.getStylesheets().add("/CSS/CSS.css");
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(accountScene);
        window.show();
    }

    @FXML
    private void homeButtonAction(ActionEvent event) throws IOException {
        Parent homeParent = FXMLLoader.load(getClass().getResource("FXMLHome.fxml"));
        Scene homeScene = new Scene(homeParent);
        homeScene.getStylesheets().add("/CSS/CSS.css");
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(homeScene);
        window.show();
    }

    @FXML
    private void walletButtonAction(ActionEvent event) throws IOException {
        Parent walletParent = FXMLLoader.load(getClass().getResource("FXMLWallet.fxml"));
        Scene walletScene = new Scene(walletParent);
        walletScene.getStylesheets().add("/CSS/CSS.css");
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(walletScene);
        window.show();
    }

    @FXML
    private void activityButtonAction(ActionEvent event) throws IOException {
        Parent activityParent = FXMLLoader.load(getClass().getResource("FXMLActivity.fxml"));
        Scene activityScene = new Scene(activityParent);
        activityScene.getStylesheets().add("/CSS/CSS.css");
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(activityScene);
        window.show();
    }

    @FXML
    private void signoutButtonAction(ActionEvent event) throws IOException {
        Parent signoutParent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene signoutScene = new Scene(signoutParent);
        signoutScene.getStylesheets().add("/CSS/CSS.css");
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(signoutScene);
        window.show();
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
