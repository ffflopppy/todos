package com.todos.ffflopppy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/todos")
    public String Todos(){
        return "Let's do Todos";
    }

}
