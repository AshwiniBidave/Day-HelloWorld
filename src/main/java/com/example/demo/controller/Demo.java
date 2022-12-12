package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class Demo {
    @GetMapping("/get")
    public String getmessage(){
      return "Hello World";
    }
    @GetMapping("/hellobynames/{name}")
    public String getHello(@PathVariable String name) {
        return "Hello " + name;
    }



    @PutMapping("/put/{firstName}")
    public String PutMessage(@PathVariable String firstName, @RequestParam ( value = "lastName") String lastName) {

        return "Hello " + firstName+" "+ lastName;
    }
    @PostMapping("/hellouser")
    public String postMessage(@RequestBody User user) {
        return "Hello " + user.getFirstname() + " " + user.getLastname();
    }

}



