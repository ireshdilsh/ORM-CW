package org.example.ormhibernatefinalcw.controller.ricieption;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import org.example.ormhibernatefinalcw.utils.WindowUtils;

public class RicieptionController {

    @FXML
    private AnchorPane loginPane;
    
    @FXML
    void gotoLandingPage(ActionEvent event) throws Exception{
        new WindowUtils().navigateTo("Landing",loginPane);
    }
}
