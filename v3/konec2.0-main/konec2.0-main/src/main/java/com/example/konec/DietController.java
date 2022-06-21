package com.example.konec;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class DietController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button first_dietButton;

    @FXML
    private Button fivest_dietButton;

    @FXML
    private Button fourst_dietButton;

    @FXML
    private Button second_dietButton;

    @FXML
    private Button sevenest_dietButton1;

    @FXML
    private Button sixest_dietButton;

    @FXML
    private AnchorPane sixst_dietButton;

    @FXML
    private Button thierst_dietButton;

    @FXML
    void first_dietButton(ActionEvent event) {
        first_dietButton.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("firstWindowDiet.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();

    }

    @FXML
    void fivest_dietButton(ActionEvent event) {

    }

    @FXML
    void fourst_dietButton(ActionEvent event) {

    }

    @FXML
    void second_dietButton(ActionEvent event) {

    }

    @FXML
    void sevenest_dietButton(ActionEvent event) {

    }

    @FXML
    void sixest_dietButton(ActionEvent event) {

    }

    @FXML
    void thierst_dietButton(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }

}
