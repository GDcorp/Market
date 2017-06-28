package system.repository.impl;

import org.springframework.stereotype.Repository;
import system.repository.UserRepository;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Qubo on 27.05.2017.
 */
@Repository
public class UserRepositoryImpl implements UserRepository{
    private DataSource dataSource;

    public boolean isValidUser(String username, String password) throws SQLException {
        String sql = "SELECT count(1) FROM user WHERE username = ? AND password = ?";
        PreparedStatement pstmt = dataSource.getConnection().prepareStatement(sql);
        pstmt.setString(1, username);
        pstmt.setString(2, password);
        ResultSet rset = pstmt.executeQuery();
        if (rset.next()) {
            return (rset.getInt(1) > 0);
        } else {
            return false;
        }
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
