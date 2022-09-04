module com.example.javacore {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javacore to javafx.fxml;
    exports com.example.javacore;
}