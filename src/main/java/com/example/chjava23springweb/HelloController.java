package com.example.chjava23springweb;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, world";
    }
    @GetMapping("/goodbye")
    public String goodBye() {
        return "Goodbyey"; }
   @GetMapping("/greeting")
    public String greetSomeOne(@RequestParam(required = false) String name) {
        return "Hello " + name;
    }

    @GetMapping("/greeting/{name}")
    public String greetName(@PathVariable String name) {
        return "Hello " + name;
    }

    @PostMapping("/add-something")
    public String addSomeThing(@RequestBody String name){
        List<String> names = new ArrayList<>();
        names.add(name);
        return name;
    }
}
