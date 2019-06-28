package com.qdhuafens.web.controller;

import com.qdhuafens.web.entity.User;
import com.qdhuafens.web.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @program: Huafens
 * @description: 用户管理控制器
 * @author: 张清
 * @create: 2019-06-24 08:50
 **/
@Controller
public class UserController {

    @Resource
    private UserService userService;


    /**
     * 进行登录验证
     * */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String userName, String password, HttpSession session, Model model){
        User user = userService.login(userName,password);
        System.out.println(userName + '\t' + password + '\t' + user);
        if(user == null){
            model.addAttribute("msg","用户名或密码错误");
            return "login";
        }else{
            session.setAttribute("USER",userName);
            return "index";
        }
    }

    /**
     * 登出操作
     * */
    @RequestMapping(value = "/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:login";
    }

    /**
     * 向用户登录页面跳转
     * */
    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String toLogin(){
        return "login";
    }

    /**
     * 查询所有用户
     * */
    @RequestMapping("/user")
    public String toString(HttpSession session, Model model){
        List<User> users = userService.querryAllUser();
        model.addAttribute("users",users);
        return "list_user";
    }
}
