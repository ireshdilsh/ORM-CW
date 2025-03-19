package org.example.ormhibernatefinalcw.controller.admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import org.example.ormhibernatefinalcw.utils.WindowUtils;

public class AdminController {

    @FXML
    private AnchorPane loginPane;

    public void gotoLandingPage(ActionEvent actionEvent) throws Exception{
        new WindowUtils().navigateTo("Landing",loginPane);
    }
}
