package com.t7241.web.controller;
import com.t7241.web.model.User;
import com.t7241.web.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class TestController {

    @Resource
    UserService userService;

    @RequestMapping("/")
    public String getHome(){
        return "home";
    }


    @ResponseBody
    @RequestMapping("/{id}")
    public String getUser(@PathVariable("id")Integer id){
        User user=userService.getUser(1);
        return user.getUsername();
    }

}
