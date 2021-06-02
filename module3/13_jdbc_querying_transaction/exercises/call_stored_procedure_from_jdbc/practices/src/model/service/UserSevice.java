package model.service;

import com.sun.jndi.ldap.Connection;
import model.bean.User;
import model.repository.UserRepository;

import java.sql.SQLException;
import java.util.List;

public class UserSevice implements iUserService {
    public UserSevice() {
    }

    UserRepository userRepository=new UserRepository();

    @Override
    public void insertUser(User user) throws SQLException {
        userRepository.insertUserStore(user);

    }

    @Override
    public User selectUser(int id) {
        return userRepository.selectUser(id);
    }

    @Override
    public List<User> selectAllUsers() {
        return userRepository.selectAllUsers();

    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return userRepository.deleteUser(id);
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        return userRepository.updateUser(user);
    }

    @Override
    public User getUserById(int id) {
        return userRepository.getUserById(id);

    }

    @Override
    public void insertUserStore(User user) throws SQLException {
        userRepository.insertUserStore(user);
    }

    @Override
    public List<User> displayUsers() {
        return userRepository.displayUsers();
    }

    @Override
    public void editUser(User user) {
        userRepository.editUsers(user);

    }

    @Override
    public void delete(int id) throws SQLException {
        userRepository.deleteUsers(id);
    }
}
