package system.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.repository.UserRepository;
import system.repository.impl.UserRepositoryImpl;
import system.models.User;
import system.services.UserService;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Qubo on 27.05.2017.
 */
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public boolean isValidUser(String username, String password) throws SQLException {
        return userRepository.isValidUser(username, password);
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
