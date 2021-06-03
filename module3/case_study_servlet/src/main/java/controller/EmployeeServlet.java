package controller;

import model.bean.Employee;
import model.service.EmployeeService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "EmployeeServlet" ,urlPatterns = {"/employee"})
public class EmployeeServlet extends HttpServlet {
    EmployeeService service=new EmployeeService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    insertEmployee(request, response);
                    break;
                case "edit":
//                    updateUser(request, response);
                    break;
                case "search":
//                    searchUser(request,response);
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
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
                listEmployee(request, response);
                break;
        }

    }
    private void insertEmployee(HttpServletRequest request, HttpServletResponse response) {
        String name=request.getParameter("name");

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
