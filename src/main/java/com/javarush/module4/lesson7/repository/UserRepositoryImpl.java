package com.javarush.module4.lesson7.repository;

import com.javarush.module4.lesson7.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class UserRepositoryImpl implements UserRepository {
    private final ConnectionProvider connectionProvider;

    public UserRepositoryImpl(ConnectionProvider connectionProvider) {
        this.connectionProvider = connectionProvider;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public Optional<User> findById(int id) {
        String query = "SELECT * FROM users WHERE ID = ?";
        try (Connection connection = connectionProvider.provideConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {

                    // id  |  login   | password | email
                    // ---------------------------------------------
                    // 1   |  mylogin | 12345678 | example@gmail.com

                    User user = mapResultSetToUser(resultSet);

                    return Optional.of(user);
                } else {
                    return Optional.empty();
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    // java.sql.Date ---> java.util.Date
    //                ---> java.time.LocalDate
    private User mapResultSetToUser(ResultSet resultSet) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setLogin(resultSet.getString("login"));
        user.setPassword(resultSet.getString("password"));
        user.setEmail(resultSet.getString("email"));
        return user;
    }
}
