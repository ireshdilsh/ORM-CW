package org.example.ormhibernatefinalcw.controller.ricieption;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import org.example.ormhibernatefinalcw.dto.PatcientDto;
import org.example.ormhibernatefinalcw.dto.tm.PatcientTM;
import org.example.ormhibernatefinalcw.service.ServiceFactory;
import org.example.ormhibernatefinalcw.service.custom.PatcientService;
import org.example.ormhibernatefinalcw.utils.WindowUtils;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class PatcientController implements Initializable {

    PatcientService patcientService = (PatcientService) ServiceFactory.getInstance().getService(ServiceFactory.Type.PATCIENT);

    @FXML
    private TableColumn<PatcientTM, Integer> contactCol;

    @FXML
    private TextField contactTxt;

    @FXML
    private TableColumn<PatcientTM, String> emailCol;

    @FXML
    private TextField emailTxt;

    @FXML
    private TableColumn<PatcientTM, Integer> idCol;

    @FXML
    private TableColumn<PatcientTM, String> nameCol;

    @FXML
    private TextField nameTxt;

    @FXML
    private AnchorPane pane;

    @FXML
    private TableView<PatcientTM> patTbl;

    @FXML
    void addPatcient(ActionEvent event) throws Exception{
      //  if (contactTxt.getText().matches("^[0]{1}[7]{1}[01245678]{1}[0-9]{7}$\n")){

            boolean resp = patcientService.addPatcient(new PatcientDto(
                    nameTxt.getText(),emailTxt.getText(), Integer.parseInt(contactTxt.getText())
            ));

            if (resp){
                new Alert(Alert.AlertType.INFORMATION,"Patcient Added Success !").show();
                clearFields();
                getAll();
            }else {
                new Alert(Alert.AlertType.ERROR,"Patcient Added Failed !").show();
            }

//        }else {
//            new Alert(Alert.AlertType.ERROR,"Something Went Wrong !").show();
//        }
    }

    @FXML
    void deletePatcient(ActionEvent event) throws Exception{

        PatcientTM tm = patTbl.getSelectionModel().getSelectedItem();

        if (tm != null){

            int id = tm.getId();
            boolean resp = patcientService.deletePatcient(id);

            if (resp){
                new Alert(Alert.AlertType.INFORMATION,"Patcient Deleted !").show();
                clearFields();
                getAll();
            }else {
                new Alert(Alert.AlertType.ERROR,"Something Went Wrong").show();
            }
        }else {
            new Alert(Alert.AlertType.ERROR,"Cannot find the Patcient !").show();
        }
    }

    @FXML
    void updatePatcient(ActionEvent event) throws Exception{
      //  if (contactTxt.getText().matches("^[0]{1}[7]{1}[01245678]{1}[0-9]{7}$\n")){

        boolean resp = patcientService.updatePatcient(new PatcientDto(
                nameTxt.getText(), emailTxt.getText(), Integer.parseInt(contactTxt.getText())
        ));

        if (resp){
            new Alert(Alert.AlertType.INFORMATION,"Update Success !").show();
            getAll();
            clearFields();
        }else {
            new Alert(Alert.AlertType.ERROR,"Something Went Wrong !").show();
        }

//        }else {
//            new Alert(Alert.AlertType.ERROR,"Something Went Wrong !").show();
//        }
    }

    @FXML
    void gotoBack(ActionEvent event) throws Exception{
        new WindowUtils().navigateTo("ricieption/RicieptionView",pane);
    }

    public void getAll() throws Exception{
        ArrayList<PatcientDto> patDTOS = patcientService.getAll();
        ObservableList<PatcientTM> patTMS = FXCollections.observableArrayList();

        for (PatcientDto patDTO : patDTOS) {
            PatcientTM tm = new PatcientTM(
                    patDTO.getId(),
                    patDTO.getName(),
                    patDTO.getEmail(),
                    patDTO.getContact()
            );
            patTMS.add(tm);
        }
        patTbl.setItems(patTMS);
    }

    @FXML
    void tblClick(MouseEvent event) {
        PatcientTM tm = patTbl.getSelectionModel().getSelectedItem();

        if (tm != null){
            nameTxt.setText(tm.getName());
            emailTxt.setText(tm.getEmail());
            contactTxt.setText(String.valueOf(tm.getContact()));
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));
        contactCol.setCellValueFactory(new PropertyValueFactory<>("contact"));

        try{
            getAll();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    void clearFields(){
        nameTxt.setText("");
        emailTxt.setText("");
        contactTxt.setText("");
    }
}
