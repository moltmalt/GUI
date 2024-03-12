module com.example.guimar12real {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.guimar12real to javafx.fxml;
    exports com.example.guimar12real;
}