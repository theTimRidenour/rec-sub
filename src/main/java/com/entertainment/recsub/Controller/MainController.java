package com.entertainment.recsub.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.validation.Valid;
import java.util.*;

import com.entertainment.recsub.Model.User;
import com.entertainment.recsub.Model.Data.UserRepository;

@Controller
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path="/")
    public String index(Model model) {

        model.addAttribute("title", "Recipe Substitution");

        return "index";

    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

}
