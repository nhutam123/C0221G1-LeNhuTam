package calculator.controller;

import calculator.model.service.iService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private iService service;

    @RequestMapping("/")
    public String display(){
        return "index";
    }
    @RequestMapping("calculator")
    public String calculator(@RequestParam double number1, double number2,String calcul, Model model){
        double result=service.calcul(number1,number2,calcul);

        model.addAttribute("result",result);
        model.addAttribute("number1",number1);
        model.addAttribute("number2",number2);
        return "index";
    }
}
