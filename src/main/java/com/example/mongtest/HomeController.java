package com.example.mongtest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @Autowired
    MongoOperations mongoOperation;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(){

        User user = new User();
        user.setName("Jon Deo");

        mongoOperation.save(user);
        return "home";
    }
}
