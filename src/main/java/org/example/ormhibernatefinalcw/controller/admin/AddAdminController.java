package org.example.ormhibernatefinalcw.controller.admin;

import org.example.ormhibernatefinalcw.dto.AdminDto;
import org.example.ormhibernatefinalcw.service.ServiceFactory;
import org.example.ormhibernatefinalcw.service.ServiceFactory.Type;
import org.example.ormhibernatefinalcw.service.custom.AdminService;
import org.example.ormhibernatefinalcw.utils.WindowUtils;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class AddAdminController {

    AdminService adminService = (AdminService) ServiceFactory.getInstance().getService(Type.ADMIN);

    @FXML
    private TextField emailTxt;

    @FXML
    private PasswordField passwordTxt;

    @FXML
    private AnchorPane rolesvalidatePane;

    @FXML
    void gotoLandingPage(ActionEvent event) throws Exception {
        new WindowUtils().navigateTo("RolesView", rolesvalidatePane);
    }

    @FXML
    void validateAdmin(ActionEvent event) throws Exception{
        if (emailTxt.getText().isEmpty() || emailTxt.getText().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            new Alert(AlertType.ERROR, "Email Cannot be null !").show();
        }

        if (passwordTxt.getText().isEmpty()) {
            new Alert(AlertType.ERROR, "Password Cannot be null !").show();
        }

        Boolean resp = adminService.addNewAdmin(new AdminDto(
            emailTxt.getText(),passwordTxt.getText()
        ));

        if (resp) {
            new Alert(AlertType.INFORMATION,"New Admin Added !").show();
        }else{
        new Alert(AlertType.ERROR,"Admin Added Failed !").show();
        }

    }
}
