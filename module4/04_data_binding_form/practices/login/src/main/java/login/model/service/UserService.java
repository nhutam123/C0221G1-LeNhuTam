package login.model.service;

import login.model.bean.Login;
import login.model.bean.User;
import login.model.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements iUserService {

    @Override
    public User checkLogin(Login login) {
        return Repository.checkLogin(login);
    }
}
