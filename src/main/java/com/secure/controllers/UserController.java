package com.secure.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String login() {
        return "redirect: /user";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String home() {
        return "index";
    }


    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String more() {
        return "more";
    }

    @RequestMapping(value = "/admin/min", method = RequestMethod.GET)
    public String grab() {
        return "more";
    }

    @RequestMapping(value = "/admin/about", method = RequestMethod.GET)
    public String about() {
        return "about";
    }

}
