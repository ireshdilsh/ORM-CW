package org.example.ormhibernatefinalcw.controller.ricieption;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import org.example.ormhibernatefinalcw.utils.WindowUtils;

import java.net.URL;
import java.util.ResourceBundle;

public class TherepySessionController implements Initializable {
    @FXML
    private AnchorPane pane;

    @FXML
    void gotoBack(ActionEvent event) throws Exception{
        new WindowUtils().navigateTo("ricieption/RicieptionView",pane);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try{

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
