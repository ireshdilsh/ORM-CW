package org.example.ormhibernatefinalcw.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import org.example.ormhibernatefinalcw.utils.WindowUtils;

public class RoleController {
    @FXML
    private AnchorPane rolesPane;

    @FXML
    void gotoLandingPage(ActionEvent event) throws Exception{
        new WindowUtils().navigateTo("Landing",rolesPane);
    }

    @FXML
    void gotoLoginView(ActionEvent event) throws Exception{
        new WindowUtils().navigateTo("LoginView",rolesPane);
    }
}
