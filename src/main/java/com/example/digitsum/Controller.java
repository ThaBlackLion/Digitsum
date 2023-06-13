package com.example.digitsum;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    Implementation i = new Implementation();
    @RequestMapping("/calcDigitSum")
    public int calcDigitSum(@RequestParam Integer number) {


        return i.calcDigitSum(number);
    }
}


