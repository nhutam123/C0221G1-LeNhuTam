package controller;

import model.bean.Customer;
import model.service.CustomerService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CustomerServlet" ,urlPatterns = {"/customer"})
public class CustomerServlet extends HttpServlet {
    CustomerService service=new CustomerService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                insertUser(request, response);
                break;
            case "edit":
                    updateCustomer(request, response);
                break;
            case "search":
//                    searchUser(request,response);
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
                    showNewForm(request, response);
                break;
            case "edit":
                    showEditForm(request, response);
                break;
            case "delete":
                    delete(request, response);
                break;
            case "sort":
                sort(request,response);
                break;
            default:
                listUser(request, response);
                break;
        }


    }

    private void delete(HttpServletRequest request, HttpServletResponse response) {
        int id=Integer.parseInt(request.getParameter("id"));
        service.delete(id);
        List<Customer> list=service.selectAll();
        request.setAttribute("listCustomers",list);
        RequestDispatcher dispatcher=request.getRequestDispatcher("furama/customer/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id=Integer.parseInt(request.getParameter("id"));
        int typeId=Integer.parseInt(request.getParameter("typeId"));
        String name=request.getParameter("name");
        String birthday=request.getParameter("birthday");
        String phoneNumber=request.getParameter("phoneNumber");
        String card=request.getParameter("card");
        String email=request.getParameter("email");
        String address=request.getParameter("address");
        Customer customer=new Customer(id,name,birthday,card,phoneNumber,email,address,typeId);
        service.update(customer);
        RequestDispatcher dispatcher=request.getRequestDispatcher("furama/customer/edit.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {

            int id = Integer.parseInt(request.getParameter("id"));
            Customer customer = service.selectCustomer(id);
            RequestDispatcher dispatcher = request.getRequestDispatcher("furama/customer/edit.jsp");
            request.setAttribute("customer", customer);
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    private void insertUser(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String birthday=request.getParameter("birthday");
        String card =request.getParameter("card");
        String phoneNumber=request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int typeId=Integer.parseInt(request.getParameter("type_id"));
        Customer customer = new Customer(name,birthday,card,phoneNumber, email, address,typeId);
        try {
            service.insertCustomer(customer);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("furama/customer/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private void showNewForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("./furama/customer/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
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
