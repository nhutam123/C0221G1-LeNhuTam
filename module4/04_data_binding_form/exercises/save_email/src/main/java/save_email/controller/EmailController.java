package save_email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import save_email.model.bean.Email;
import save_email.model.service.Service;
import save_email.model.service.iService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmailController {
@Autowired
    iService iservice;
    @GetMapping("")
    public String display(Model map){
        map.addAttribute("email",new Email());
        List<String> list=iservice.returnList();
        map.addAttribute("list",list);

        return "index";
    }
    @RequestMapping(value = "/addEmail", method = RequestMethod.POST)
    public String submit(@ModelAttribute("email") Email email, ModelMap model) {
        model.addAttribute("language", email.getLanguage());
        model.addAttribute("size", email.getSize());
        model.addAttribute("signature", email.getSignature());
        model.addAttribute("filter",email.isFilter());

        return "/info";
    }

}
