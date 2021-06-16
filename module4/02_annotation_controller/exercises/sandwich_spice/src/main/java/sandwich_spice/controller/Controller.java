package sandwich_spice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import sandwich_spice.model.service.iService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private iService service;

    @RequestMapping("/")
    public String display() {
        return "index";
    }

    @RequestMapping("/save")
    public String save(@RequestParam String[] spice, Model model) {
        List<String> list;
        list = service.save(spice);
        model.addAttribute("listSpice", list);
        return "list";
    }
}
