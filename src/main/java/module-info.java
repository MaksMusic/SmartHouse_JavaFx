module com.example.smarthouse_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.smarthouse_javafx to javafx.fxml;
    exports com.example.smarthouse_javafx;
}