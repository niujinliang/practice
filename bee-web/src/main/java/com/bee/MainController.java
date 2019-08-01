package com.bee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by niujinliang on 2019/3/11.
 */
@Controller
public class MainController {
    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView =new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }
    @RequestMapping("/layout")
    public String l(){
        return "/layout/layout";
    }
}
