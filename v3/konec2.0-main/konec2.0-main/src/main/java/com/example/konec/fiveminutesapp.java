package com.example.konec;

import javafx.application.Application;
import javafx.fxml.FXMLLoader; 
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class fiveminutesapp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(fiveminutesapp.class.getResource("first_window.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 720, 480);
        stage.setTitle("Five Minutes");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}