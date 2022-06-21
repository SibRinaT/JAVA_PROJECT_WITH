module com.example.konec {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.konec to javafx.fxml;
    exports com.example.konec;
}