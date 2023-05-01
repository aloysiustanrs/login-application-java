module com.example.login_application {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;
    requires java.desktop;


    opens com.example.login_application to javafx.fxml;
    exports com.example.login_application;
    exports com.example.login_application.controllers;
    opens com.example.login_application.controllers to javafx.fxml;
    exports com.example.login_application.model;
    opens com.example.login_application.model to javafx.fxml;
    exports com.example.login_application.repository;
    opens com.example.login_application.repository to javafx.fxml;
    exports com.example.login_application.service;
    opens com.example.login_application.service to javafx.fxml;
}