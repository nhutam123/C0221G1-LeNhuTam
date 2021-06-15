package controller;

import model.bean.Student;
import model.service.StudentService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ObjectServlet",urlPatterns = "/customer")
public class ObjectServlet extends HttpServlet {

    StudentService service=new StudentService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
//                insertCustomer(request, response);
                break;
            case "edit":
//                updateCustomer(request, response);
                break;
            case "search":
//                searchCustomer(request,response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
//                showNewForm(request, response);
                break;
            case "edit":
//                showEditForm(request, response);
                break;
            case "delete":
//                delete(request, response);
                break;
            case "sort":
//                sort(request,response);
                break;
            default:
                listUser(request, response);
                break;
        }


    }

    private void listUser(HttpServletRequest request, HttpServletResponse response) {
        List<Student> list= service.selectAll();
        request.setAttribute("listStudent" , list);
        RequestDispatcher dispatcher=request.getRequestDispatcher("/pro/object/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
