package controller;

import model.bean.Customer;
import model.bean.Employee;
import model.service.EmployeeService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet" ,urlPatterns = {"/employee"})
public class EmployeeServlet extends HttpServlet {
    EmployeeService service=new EmployeeService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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
                listEmployee(request, response);
                break;
        }

    }

    private void listEmployee(HttpServletRequest request, HttpServletResponse response) {
        List<Employee> list= service.selectAll();
        request.setAttribute("listEmployee" , list);
        RequestDispatcher dispatcher=request.getRequestDispatcher("/furama/employee/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
