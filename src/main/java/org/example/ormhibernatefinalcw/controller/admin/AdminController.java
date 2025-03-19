package org.example.ormhibernatefinalcw.controller.admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import org.example.ormhibernatefinalcw.utils.WindowUtils;

public class AdminController {

    @FXML
    private AnchorPane pane;

    @FXML
    void gotoLandingPage(ActionEvent event) throws Exception{
        new WindowUtils().navigateTo("RoleAdminView",pane);
    }

    @FXML
    void gotoTherepistView(ActionEvent event) {
        System.out.println("Clicked the button");
    }

    @FXML
    void gotoTherepyProgrammesView(ActionEvent event) {
        System.out.println("Clicked the button");
    }
}
