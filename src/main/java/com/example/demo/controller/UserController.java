package com.example.demo.controller;

import com.example.demo.entry.User;
import com.example.demo.service.UserService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.logging.Logger;

@Controller
public class UserController {

    final Logger logger=Logger.getLogger("UserController.class");
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/login")
    public String login(@RequestParam String inputUsername,@RequestParam String inputPassword,HttpSession session){
        logger.info("开始登录");
        User userFromDB=userService.getUserByUsername(inputUsername);
        if (userFromDB==null){
            return "100";
        }
        if (!userFromDB.getPassword().equals(inputPassword)){
            return "101";
        }
        session.setAttribute("currentUser",userFromDB);
        session.setAttribute("login",true);
        return "200";
    }

    @ResponseBody
    @RequestMapping(value = "/signin",method = RequestMethod.POST)
    public String signIn(@RequestBody JSONObject json){
        logger.info("开始注册");
        if (json.isEmpty()){
            System.out.println("空的");
        }
        String username=json.getString("username");
        if (userService.getUserByUsername(username)!=null){
            return "102";
        }

        String psw1=(String) json.get("password1");
        String psw2=(String) json.get("password2");
        if (!psw1.trim().equals(psw2.trim())){
            return "103";
        }

        User user=new User();
        user.setNickname((String)json.get("nickname"));
        user.setPassword(psw1);
        user.setUsername(username);

        int r=userService.addUser(user);
        if (r!=1){
            return "000";
        }
        return "200";
    }

    @ResponseBody
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("login");
        if (session.getAttribute("login")==null){
            return "200";
        }
        return "fail to logout";
    }

    @RequestMapping("/loginpage")
    public String loginPage(){
        logger.info("登录页面");
        return "loginAndSignin";
    }
}
