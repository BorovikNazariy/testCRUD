package com.example.testCRUD.service;

import com.example.testCRUD.dao.UserDao;
import com.example.testCRUD.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private UserDao userDao = new UserDao();
    @Override
    public void create(User user) {
        userDao.save(user);
    }

    @Override
    public List<User> readAll() {
        return userDao.findAll();
    }

    @Override
    public User read(int id) {
        return userDao.findById(id);
    }

    @Override
    public void update(User user, int id) {
        userDao.update(user);
    }

    @Override
    public void delete(int id) {
        userDao.delete(userDao.findById(id));
    }
}
