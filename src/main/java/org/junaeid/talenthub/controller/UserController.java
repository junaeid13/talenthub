package org.junaeid.talenthub.controller;

import org.junaeid.talenthub.model.User;
import org.junaeid.talenthub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String getUsers(Model model) {
        List<User> all_users = userService.getUsers();
        if (all_users != null)
            model.addAttribute("users", all_users);
        return "user/index";
    }
}
