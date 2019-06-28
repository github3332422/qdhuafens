package com.qdhuafens.web.service.impl;

import com.qdhuafens.web.dao.UserDao;
import com.qdhuafens.web.entity.User;
import com.qdhuafens.web.service.UserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: Huafens
 * @description: 用户服务层
 * @author: 张清
 * @create: 2019-06-24 08:56
 **/
@Controller
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User login(String userName, String password) {
        System.out.println("login Service");
        return userDao.login(userName,password);
    }

    @Override
    public List<User> querryAllUser() {
        return userDao.qerryUser();
    }

    @Override
    public List<User> qurryByUser(User user) {
        return userDao.qerryByUser(user);
    }

    @Override
    public Integer addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public Integer deleteUser(Integer id) {
        return userDao.delUser(id);
    }

    @Override
    public Integer updateUser(User user) {
        return userDao.updateUser(user);
    }
}
