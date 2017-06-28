package system.delegate;

import system.services.UserService;

import java.sql.SQLException;

/**
 * Created by Qubo on 26.06.2017.
 */
public class LoginDelegate {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public boolean isValidUser(String username, String password) throws SQLException {
        return userService.isValidUser(username, password);
    }
}
