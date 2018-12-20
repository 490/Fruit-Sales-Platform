package service.impl;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;
import entity.User;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    UserDao userDao;
    public User get(Serializable id) {
        return userDao.get(id);
    }

    public List<User> find(Map map) {
        return userDao.find(map);
    }

    public void insert(User entity) {
        userDao.insert(entity);
    }

    public void update(User entity) {
        userDao.update(entity);
    }

    public void deleteById(Serializable id) {
        userDao.deleteById(id);
    }

    public void delete(Serializable[] ids) {
        userDao.delete(ids);
    }
}
