package model.sevice;

import model.bean.User;
import model.repository.UserRepository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UserService implements iUserSercice {
    UserRepository userRepository=new UserRepository();
    @Override
    public void insertUser(User user) throws SQLException {

    }

    @Override
    public User selectUser(int id) {
        return null;
    }

    @Override
    public List<User> selectAllUsers() {

        return userRepository.selectAllUsers();
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        return false;
    }
    public  List<User> sort(){
        List<User> list= userRepository.selectAllUsers();
        list.sort(Comparator.comparing(User::getName));
        return list;
    }
    @Override
    public List<User> search(String name) {
        return userRepository.searchUser(name);
    }
}
