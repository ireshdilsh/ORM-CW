package org.example.ormhibernatefinalcw.controller.ricieption;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import org.example.ormhibernatefinalcw.utils.WindowUtils;

public class PatcientController {
    @FXML
    private AnchorPane pane;

    @FXML
    void gotoBack(ActionEvent event) throws Exception{
        new WindowUtils().navigateTo("ricieption/RicieptionView",pane);
    }
}
