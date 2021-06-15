package dictionary.controller;


import dictionary.model.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@org.springframework.stereotype.Controller
public class Controller {
    Service service=new Service();

    @GetMapping("/dictionary")
    public String display(){
        return "index";
    }

    @GetMapping("/translate")
    public String translate(@RequestParam String string, HttpServletRequest request){
        String result=service.translate(string);
        request.setAttribute("result",result);

        return "index";
    }
}
