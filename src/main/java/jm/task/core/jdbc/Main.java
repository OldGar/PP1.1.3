package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Igor", "Golubev", (byte) 27);
        userService.saveUser("Igor", "Golubev", (byte) 27);
        userService.saveUser("Igor", "Golubev", (byte) 27);
        userService.saveUser("Igor", "Golubev", (byte) 27);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
