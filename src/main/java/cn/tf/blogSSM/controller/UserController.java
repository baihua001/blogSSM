package cn.tf.blogSSM.controller;

import cn.tf.blogSSM.bean.User;
import cn.tf.blogSSM.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;

    @RequestMapping("/login")
    public String UserLogin(User user, Model model, HttpSession session){
        String msg = "";
        User loginUser = userService.login(user);
        if (loginUser != null){
            session.setAttribute("user",loginUser);
            msg = "登陆成功！";
        }else {
            msg = "登陆失败！";
        }
        return msg;
    }
}
