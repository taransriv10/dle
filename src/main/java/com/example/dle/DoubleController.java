package com.example.dle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoubleController {

    @GetMapping("/double")
    public int doubleNumber(@RequestParam(value = "number", defaultValue = "0") int number) {
        return number*2;
    }
}
