module com.example.konec {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.konec to javafx.fxml;
    exports com.example.konec;
//    exports com.example.konec.firstWindowControllers;
//    opens com.example.konec.firstWindowControllers to javafx.fxml;
//    exports com.example.konec.dietControllers;
//    opens com.example.konec.dietControllers to javafx.fxml;
}