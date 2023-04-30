module com.example.login_application {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;
    requires java.desktop;


    opens com.example.login_application to javafx.fxml;
    exports com.example.login_application;
}