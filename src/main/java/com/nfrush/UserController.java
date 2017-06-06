package com.nfrush;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

/**
 * Created by nfrush on 6/5/17.
 */
@Controller
public class UserController {
    @RequestMapping(value = "/user")
    public String user() {
        return "user";
    }
}