package org.example.ormhibernatefinalcw.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import org.example.ormhibernatefinalcw.utils.WindowUtils;

public class LoginController {
    @FXML
    private AnchorPane loginPane;

    @FXML
    private PasswordField passwordTxt;

    @FXML
    private TextField usernameTxt;

    @FXML
    void gotoDashboard(ActionEvent event) {

    }

    @FXML
    void gotoLandingPage(ActionEvent event) throws Exception{
        new WindowUtils().navigateTo("Landing",loginPane);
    }

    @FXML
    void gotoRegisterPage(ActionEvent event) throws Exception{
        new WindowUtils().navigateTo("RegisterView",loginPane);
    }

}
