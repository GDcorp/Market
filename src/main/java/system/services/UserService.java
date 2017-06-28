package system.services;

import java.sql.SQLException;

/**
 * Created by Qubo on 26.06.2017.
 */
public interface UserService {
    public boolean isValidUser(String username, String password) throws SQLException;
}
