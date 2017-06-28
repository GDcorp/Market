package system.repository;

import java.sql.SQLException;

/**
 * Created by Qubo on 26.06.2017.
 */
public interface UserRepository {
    public boolean isValidUser(String username, String password) throws SQLException;
}
