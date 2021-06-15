package sandwich_spice.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/")
    public String display(){
        return "index";
    }
    @RequestMapping("/save/{Lettuce}&{Tomato}&{Mustard}&{Sprouts}")
    public String save(@RequestParam String Lettuce, String Tomato, String Mustard, String Sprouts, HttpServletRequest request, HttpServletResponse response){
        ArrayList<String> list =new ArrayList<>();
        list.add(Lettuce);
        list.add(Tomato);
        list.add(Mustard);
        list.add(Sprouts);
        request.setAttribute("listSpice",list);
        RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/views/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "list";
    }
}
