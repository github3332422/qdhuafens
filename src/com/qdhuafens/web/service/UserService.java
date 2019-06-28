package com.qdhuafens.web.service;

import com.qdhuafens.web.entity.User;

import java.util.List;

public interface UserService {

    /**
     * 用户登录
     * */
    public User login(String username,String password);
    /**
     * 查询所有的用户
     * */
    public List<User> querryAllUser();

    /**
     * 查询用户根据信息
     * */
    public List<User> qurryByUser(User user);

    /**
     * 添加部门
     * */
    public Integer addUser(User user);

    /**
     * 删除部门
     * */
    public Integer deleteUser(Integer id);

    /**
     * 修改部门
     * */
    public Integer updateUser(User user);
}
