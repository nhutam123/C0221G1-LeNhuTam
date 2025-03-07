package model.service;

import model.bean.User;

import java.sql.SQLException;
import java.util.List;

public interface iUserService {
    public void insertUser(User user) throws SQLException;

    public User selectUser(int id);

    public List<User> selectAllUsers();

    public boolean deleteUser(int id) throws SQLException;

    public boolean updateUser(User user) throws SQLException;

    User getUserById(int id);

    void insertUserStore(User user) throws SQLException;
    public List<User> displayUsers();
    public void editUser(User user);
    public void delete(int id) throws SQLException;

}
