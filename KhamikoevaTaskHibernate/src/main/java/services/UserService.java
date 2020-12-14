package services;
import DAO.UserDAO;
import models.User;

import java.util.List;

public class UserService {
    private UserDAO userDao = new UserDAO();

    public UserService(){}

    public void saveUser(User user){
        userDao.save(user);
    }

    public User findUser(int id){
        return userDao.findById(id);
    }
    public List<User> getTeachers() { return userDao.getTeachers(); }
    public List<User> getStudents() { return userDao.getStudents(); }
}