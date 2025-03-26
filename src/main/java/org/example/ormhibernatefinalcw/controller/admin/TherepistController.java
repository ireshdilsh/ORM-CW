package org.example.ormhibernatefinalcw.controller.admin;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import org.example.ormhibernatefinalcw.dto.ProgrammeDto;
import org.example.ormhibernatefinalcw.dto.tm.ProgrammeTM;
import org.example.ormhibernatefinalcw.service.ServiceFactory;
import org.example.ormhibernatefinalcw.service.ServiceFactory.Type;
import org.example.ormhibernatefinalcw.service.custom.ProgrammeService;
import org.example.ormhibernatefinalcw.service.custom.TherepistService;
import org.example.ormhibernatefinalcw.utils.WindowUtils;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class TherepistController implements Initializable {
    @FXML
    private AnchorPane pane;

    @FXML
    private JFXComboBox<ProgrammeDto> programmeCmb;

    // @FXML
    // private JFXComboBox<ProgrammeDto> programmeCmb;

    @FXML
    private TableColumn<?, ?> contactCol;

    @FXML
    private TextField contactTxt;

    @FXML
    private JFXButton deleteBtn;

    @FXML
    private TableColumn<?, ?> idCol;

    @FXML
    private TableColumn<?, ?> nameCol;

    @FXML
    private TextField nameTxt;

    @FXML
    private TableColumn<?, ?> programmeCol;

    @FXML
    private JFXButton saveBtn;

    @FXML
    private TableView<?> therepistTbl;

    @FXML
    private JFXButton updateBtn;

    TherepistService therepistService = (TherepistService) ServiceFactory.getInstance().getService(Type.THEREPIST);
    ProgrammeService programmeService = (ProgrammeService) ServiceFactory.getInstance().getService(Type.PROGRAMME);

    void getAllProgrammes() {

        ArrayList<ProgrammeDto> proDtos = programmeService.getAll();

        ObservableList<ProgrammeDto> programmeList = FXCollections.observableArrayList(proDtos);
        programmeCmb.setItems(programmeList);

        // Set how the items should be displayed in the ComboBox
        programmeCmb.setConverter(new javafx.util.StringConverter<ProgrammeDto>() {
            @Override
            public String toString(ProgrammeDto programme) {
                return programme != null ? programme.getName() : "";
            }

            @Override
            public ProgrammeDto fromString(String string) {
                return programmeCmb.getItems().stream()
                        .filter(prog -> prog.getName().equals(string))
                        .findFirst()
                        .orElse(null);
            }
        });
    }

    // this variable create get the programmeid(store therepist table programmeid) 
    private static int id = 0;

    @FXML
    void addTherepist(ActionEvent event) {
        
    }

    @FXML
    void clickCmb(ActionEvent event) {
        ProgrammeDto selectedProgramme = programmeCmb.getSelectionModel().getSelectedItem();

        if (selectedProgramme != null) {
            id = selectedProgramme.getId();
        }
    }

    @FXML
    void clickTbl(MouseEvent event) {

    }

    @FXML
    void deleteTherepist(ActionEvent event) {
        
    }

    @FXML
    void updateTherepist(ActionEvent event) {

    }

    @FXML
    void gotoBack(ActionEvent event) throws Exception {
        new WindowUtils().navigateTo("admin/AdminView", pane);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            updateBtn.setDisable(true);
            deleteBtn.setDisable(true);
            getAllProgrammes();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
