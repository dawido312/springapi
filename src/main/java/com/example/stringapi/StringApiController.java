package com.example.stringapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StringApiController {
    @RequestMapping("/string")
    public Counter stringInfo(@RequestParam(value = "string", defaultValue = "abc") String name) {
        return new Counter(name);
    }
}
