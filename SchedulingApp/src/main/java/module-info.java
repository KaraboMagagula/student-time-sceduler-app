module com.example.schedulingapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.schedulingapp to javafx.fxml;
    exports com.example.schedulingapp;
}