package org.example.ormhibernatefinalcw.controller.ricieption;

import org.example.ormhibernatefinalcw.utils.WindowUtils;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class AddRicieptionController {

    @FXML
    private TextField emailTxt;

    @FXML
    private PasswordField passwordTxt;

    @FXML
    private AnchorPane rolesvalidatePane;

    @FXML
    void gotoLandingPage(ActionEvent event) throws Exception{
        new WindowUtils().navigateTo("RoleRicieptionView", rolesvalidatePane);
    }

    @FXML
    void validateAdmin(ActionEvent event) {
            
    }
}
