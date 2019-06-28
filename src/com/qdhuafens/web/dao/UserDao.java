package com.qdhuafens.web.dao;

import com.qdhuafens.web.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    /**
     * 用户登录
     * */
    public User login(@Param("userName") String userName, @Param("password") String password);

    /**
     * 查询所有的用户
     * @return List User
     * */
    public List<User> qerryUser();

    /**
     * 根据信息查询
     * @param User
     * @return List User
     * */
    public List<User> qerryByUser(User user);

    /**
     * 添加用户
     * @param User
     * @return Number of affected items in the database
     * */
    public Integer addUser(User user);


    /**
     * 删除用户
     * @param id
     * @return Number of affected items in the database
     * */
    public Integer delUser(Integer id);

    /**
     * 修改用户
     * @param User
     * @return Number of affected items in the database
     * */
    public Integer updateUser(User user);
}
