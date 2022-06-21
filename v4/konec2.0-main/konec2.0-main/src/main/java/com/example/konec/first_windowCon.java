package com.example.konec;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class first_windowCon {
    public class animforproud {
        public ScaleTransition wow;
        public animforproud(Node node){
            wow = new ScaleTransition(Duration.millis(2000),node );
            wow.setFromY(1.5);
            wow.setFromX(1.5);
            wow.setByY(1);
            wow.setByX(1);
            wow.setCycleCount(1690);
            wow.setAutoReverse(true);
        }
        public void PlayAnima(){
            wow.playFromStart();
        }
    }

    public Button dietButton;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text proudText;

    @FXML
    private Button enterarms;

    @FXML
    private Button enterfullbody;

    @FXML
    private Button enterlegs;

    @FXML
    void enterarms(ActionEvent event) {
        enterarms.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("armswindow.fxml"));
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
    void enterfullbody(ActionEvent event) {
        enterfullbody.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("fullbodywindow.fxml"));
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
    void enterlegs(ActionEvent event) {
        enterlegs.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("legswindow.fxml"));
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

    public void dietButton(ActionEvent actionEvent) {
        dietButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("dietWindow.fxml"));
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
        public void initialize() {
            animforproud uslerldogin = new animforproud(proudText);
            uslerldogin.PlayAnima();
        }
    }

