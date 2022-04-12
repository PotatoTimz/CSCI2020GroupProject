module com.example.csci2020groupproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csci2020groupproject to javafx.fxml;
    exports com.example.csci2020groupproject;
}