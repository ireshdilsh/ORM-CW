package org.example.ormhibernatefinalcw.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import org.example.ormhibernatefinalcw.utils.WindowUtils;

public class LandingController {
    
    @FXML
    private AnchorPane mainPane;

    @FXML
    void gotoRegisterPage(ActionEvent event) throws Exception{
        new WindowUtils().navigateTo("RolesView", mainPane);
    }
}
