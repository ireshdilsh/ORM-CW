package org.example.ormhibernatefinalcw.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class WindowUtils {
    public void navigateTo(String fxmlPath, AnchorPane paneName) throws Exception {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/"+fxmlPath+".fxml"));
        paneName.getChildren().setAll(pane);
    }
}
