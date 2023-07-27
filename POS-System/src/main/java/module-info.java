module com.example.possystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.possystem to javafx.fxml;
    exports com.example.possystem;
}