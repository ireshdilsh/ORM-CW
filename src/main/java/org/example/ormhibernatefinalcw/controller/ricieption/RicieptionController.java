package org.example.ormhibernatefinalcw.controller.ricieption;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import org.example.ormhibernatefinalcw.utils.WindowUtils;

public class RicieptionController {

    @FXML
    private AnchorPane pane;

    @FXML
    void gotoLandingPage(ActionEvent event) throws Exception{
        new WindowUtils().navigateTo("Landing",pane);
    }

    @FXML
    void gotoPatientView(ActionEvent event) {
        System.out.println("Click Button");
    }

    @FXML
    void gotoPaymentView(ActionEvent event) {
        System.out.println("Click Button");
    }

    @FXML
    void gotoSessionView(ActionEvent event) {
        System.out.println("Click Button");
    }

}
