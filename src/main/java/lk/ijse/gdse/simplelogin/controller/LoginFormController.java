package lk.ijse.gdse.simplelogin.controller;

/**
 * --------------------------------------------
 * Author: R.I.B. Shamodha Sahan Rathnamalala
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 9/27/2024 3:53 PM
 * Project: simpleLogin
 * --------------------------------------------
 **/

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class LoginFormController {

    @FXML
    private AnchorPane ancLoginPage;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void signInOnAction(ActionEvent event) throws IOException {
        String username = txtUsername.getText();
        String password = txtPassword.getText();

        if (username.equals("sahan") && password.equals("1234")){
            AnchorPane load = FXMLLoader.load(getClass().getResource("/view/DashBoard.fxml"));
            ancLoginPage.getChildren().clear();
            ancLoginPage.getChildren().add(load);
        }else {
            new Alert(Alert.AlertType.ERROR,"something wrong !").show();
        }
    }

}
