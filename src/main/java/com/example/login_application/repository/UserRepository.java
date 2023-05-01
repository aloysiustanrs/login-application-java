package com.example.login_application.repository;

import com.example.login_application.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepository {

    public User getUserByUsername(String username) {
        try (Connection con = DatabaseConnection.createConnection()) {
            PreparedStatement statement = con.prepareStatement("SELECT * FROM login.userdata WHERE username = ?");
            statement.setString(1, username);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    User user = new User();
                    user.setUsername(resultSet.getString("username"));
                    user.setPassword(resultSet.getString("password"));
                    int managerValue = Integer.parseInt(resultSet.getString("manager"));
                    user.setManager(managerValue != 0);
                    user.setName(resultSet.getString("name"));
                    return user;
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
