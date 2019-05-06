package com.example.demo.controller;

import com.example.demo.entry.Player;
import com.example.demo.service.PlayerService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


@Controller
@RequestMapping("/player")
public class PlayerController {

    private int i=0;
    Logger logger=Logger.getLogger("PlayerController.class");
    @Autowired
    private PlayerService playerService;

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("hello","hello");
        return "hello";
    }

    @ResponseBody
    @RequestMapping("/findAll")
    public String findAll(){
        List<Player> list=playerService.findAll();
        String json= JSONArray.fromObject(list).toString();
        System.out.println(json);
        return json;
    }

    @RequestMapping("/hi")
    public String hi(Model model){
        Integer in=new Integer(i);
        model.addAttribute("count",in);
        model.addAttribute("hello","hello");
//        i++;
//        logger.info("你好啊");
        return "first";
    }
}
