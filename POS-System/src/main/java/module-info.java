module com.example.possystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.possystem to javafx.fxml;
    exports com.example.possystem;
    exports com.example.possystem.controllers;
    opens com.example.possystem.controllers to javafx.fxml;
}