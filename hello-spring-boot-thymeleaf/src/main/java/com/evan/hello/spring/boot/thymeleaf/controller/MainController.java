package com.evan.hello.spring.boot.thymeleaf.controller;

import com.evan.hello.spring.boot.thymeleaf.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    @RequestMapping(value = {"", "index"}, method = RequestMethod.GET)
    public String index(Model model) {
        User user = new User();
        user.setName("张三");
        user.setAge(22);

        List<User> users = new ArrayList<>();
        User p1 = new User();
        p1.setName("李四");
        p1.setAge(23);
        users.add(p1);

        User p2 = new User();
        p2.setName("王五");
        p2.setAge(24);
        users.add(p2);

        User p3 = new User();
        p3.setName("赵六");
        p3.setAge(25);
        users.add(p3);

        model.addAttribute("user", user);
        model.addAttribute("users", users);

        return "index";
    }
}
