package kr.hs.study.Parameter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class mController {

    @GetMapping("/input")
    public String input(){

        return "input_form";
    }
    @PostMapping("/re_input")
    public String re_input(@RequestParam int num){
        for(int i=1; i<=9; i++){
            int g=num*i;
        }
        return "result";
    }
}
