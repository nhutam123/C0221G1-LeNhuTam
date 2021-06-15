package currency_converter.controller;

import org.springframework.http.HttpRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/greeting")
    public String greeting(@RequestParam String name, Model model) {
        return "index";
    }
    @GetMapping("/converter")
    public String converter(@RequestParam String USD, Model model){
       int usd=Integer.parseInt(USD);
       int vnd=usd*23000;
       model.addAttribute("vnd",vnd);
        return "index";
    }



}
