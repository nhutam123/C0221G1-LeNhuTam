package controller;

import model.bean.Customer;
import model.bean.CustomerType;
import model.service.CustomerService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet" ,urlPatterns = {"/customer"})
public class CustomerServlet extends HttpServlet {
    CustomerService service=new CustomerService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
//                    showNewForm(request, response);
                break;
            case "edit":
//                    showEditForm(request, response);
                break;
            case "delete":
//                    deleteUser(request, response);
                break;
            case "sort":
                sort(request,response);
                break;
            default:
                listUser(request, response);
                break;
        }


    }

    private void sort(HttpServletRequest request, HttpServletResponse response) {
    }

    private void listUser(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> list= service.selectAll();
        request.setAttribute("listCustomers" , list);
        RequestDispatcher dispatcher=request.getRequestDispatcher("/furama/customer/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
