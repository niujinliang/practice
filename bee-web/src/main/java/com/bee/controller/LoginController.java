package com.bee.controller;


import com.alibaba.druid.sql.visitor.functions.Bin;
import com.bee.entity.User;
import com.bee.service.UserService;
import com.bee.vo.ResponseObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Created by niujinliang on 2019/3/11.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping("/registerPage")
    public ModelAndView registerPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/register/register");
        return modelAndView;
    }
    @RequestMapping("/register")
    public ModelAndView register(@Valid User user , BindingResult bindingResult){
        ModelAndView modelAndView = new ModelAndView();
        if(bindingResult.hasErrors()){
            String msg=bindingResult.getFieldError().getDefaultMessage();
            modelAndView.addObject("msg",msg);
            modelAndView.addObject(user);
            modelAndView.setViewName("/login/registerPage");
            return modelAndView;
        }
        ResponseObj responseObj= userService.register(user);
        if(!responseObj.isSuccess()){
            modelAndView.addObject("msg",responseObj.getMsg());
            modelAndView.setViewName("/login/registerPage");
            return modelAndView;
        }

        modelAndView.setViewName("/index");
        return modelAndView;
    }
    @RequestMapping("/loginPage")
    public ModelAndView loginPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/login/login");
        return modelAndView;
    }
    @RequestMapping("/login")
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("/index");
        return modelAndView;
    }

}
