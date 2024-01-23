package com.example.chjava23springweb.message;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {
    private final List<String> names = new ArrayList<>();

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, world";
    }
    @GetMapping("/goodbye")
    public String goodBye() {
        return "Goodbye"; }

   @GetMapping("/greeting")
    public String greetSomeOne(@RequestParam(required = false) String name) {
        return "Hello " + name;
    }

    @GetMapping("/greeting/{name}")
    public String greetName(@PathVariable String name) {
        return "Hello " + name;
    }

    @PostMapping("/add-something")
    public String addSomeThing(@RequestBody String name) {
        names.add(name);
        return name;
    }
}
