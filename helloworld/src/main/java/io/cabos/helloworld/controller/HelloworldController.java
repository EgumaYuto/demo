package io.cabos.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cabos
 */
@RestController
@RequestMapping("/")
public class HelloworldController {

    @GetMapping("/index")
    public String index() {
        return "{\"message\": \"Hello World\"}";
    }
}
