module com.example.lab1_gui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab1_gui to javafx.fxml;
    exports com.example.lab1_gui;
}