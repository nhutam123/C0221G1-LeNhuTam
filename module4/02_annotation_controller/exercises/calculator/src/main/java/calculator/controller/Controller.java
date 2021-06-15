package calculator.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/")
    public String display(){
        return "index";
    }
    @RequestMapping("calculator")
    public String calculator(@RequestParam int number1, int number2, Model model){
        int sum=number1+number2;
        model.addAttribute("result",sum);
        return "index";
    }
}
