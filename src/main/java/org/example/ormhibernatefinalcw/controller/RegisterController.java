package org.example.ormhibernatefinalcw.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import org.example.ormhibernatefinalcw.utils.WindowUtils;

public class RegisterController {
    @FXML
    private PasswordField passwordTxt;

    @FXML
    private PasswordField reenterPasswordTxt;

    @FXML
    private AnchorPane registerPane;

    @FXML
    private TextField usernameTxt;

    @FXML
    void gotoDashboard(ActionEvent event) {
        // need validation part
    }

    @FXML
    void gotoLandingPage(ActionEvent event) throws Exception{
        new WindowUtils().navigateTo("Landing",registerPane);
    }

    @FXML
    void gotoLoginPage(ActionEvent event) throws Exception{
        new WindowUtils().navigateTo("LoginView",registerPane);
    }
}
