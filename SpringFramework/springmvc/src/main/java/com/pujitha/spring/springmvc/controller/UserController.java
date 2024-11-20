package com.pujitha.spring.springmvc.controller;

import com.pujitha.spring.springmvc.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
//    @RequestMapping("/registrationPage")
//    public ModelAndView showRegistrationPage(){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("userReg");
//        return modelAndView;
//    }

    @RequestMapping("/registrationPage")
    public String showRegistrationPage(){
        return "userReg";
    }

//    @RequestMapping(value="registerUser", method = RequestMethod.POST)
//    public ModelAndView registerUser(@ModelAttribute User user){
//        System.out.println(user);
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("regResult");
//        modelAndView.addObject("user",user);
//        return modelAndView;
//    }

   //ModelMap
   @RequestMapping(value="registerUser", method = RequestMethod.POST)
    public String registerUser(@ModelAttribute User user, ModelMap model) {
        model.addAttribute("user",user);
        return "regResult";
    }


}
