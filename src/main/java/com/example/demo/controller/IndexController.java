package com.example.demo.controller;

import com.example.demo.entry.User;
import org.apache.catalina.connector.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.logging.Logger;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String getIndexPage(Model model, HttpSession session){
        final Logger logger=Logger.getLogger("IndexController.class");
        logger.info("初始化...");
        if (session.getAttribute("login")==null){
            logger.info("初始化页面失败");
            return null;
        }
        User user=(User) session.getAttribute("currentUser");
        model.addAttribute("user",user);
        return "index";
    }
}
