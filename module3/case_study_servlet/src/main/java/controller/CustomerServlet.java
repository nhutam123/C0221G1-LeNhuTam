package controller;

import model.bean.Customer;
import model.bean.CustomerType;
import model.service.CustomerService;
import model.service.CustomerTypeService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@WebServlet(name = "CustomerServlet" ,urlPatterns = {"/customer"})
public class CustomerServlet extends HttpServlet {
    CustomerService service=new CustomerService();
    CustomerTypeService typeService=new CustomerTypeService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                insertCustomer(request, response);
                break;
            case "edit":
                    updateCustomer(request, response);
                break;
            case "search":
                    searchCustomer(request,response);
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
    private void searchCustomer(HttpServletRequest request, HttpServletResponse response) {
        String name=request.getParameter("name");
        List<Customer> customers= service.search(name);
        RequestDispatcher dispatcher ;
        if (customers==null){
            dispatcher=request.getRequestDispatcher("furama/error.jsp");
            try {
                dispatcher.forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            request.setAttribute("customers" ,customers);
            try {
                dispatcher=request.getRequestDispatcher("furama/customer/search.jsp");
                dispatcher.forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
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
        CustomerType typeId=typeService.selectType(Integer.parseInt(request.getParameter("typeId")));
        String name=request.getParameter("name");
        String birthday=request.getParameter("birthday");
        String phoneNumber=request.getParameter("phoneNumber");
        String card=request.getParameter("card");
        String email=request.getParameter("email");
        String address=request.getParameter("address");
        Customer customer=new Customer(id,name,birthday,card,phoneNumber,email,address,typeId);
        service.update(customer);
        Customer customer1=service.selectCustomer(id);
        List<CustomerType> list=typeService.selectAll();
        request.setAttribute("list",list);
        request.setAttribute("customer" ,customer1);
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
            List<CustomerType> list=typeService.selectAll();

            RequestDispatcher dispatcher = request.getRequestDispatcher("furama/customer/edit.jsp");
            request.setAttribute("customer", customer);
            request.setAttribute("list",list);
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    private void insertCustomer(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String birthday=request.getParameter("birthday");
        String card =request.getParameter("card");
        String phoneNumber=request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        CustomerType typeId=typeService.selectType(Integer.parseInt(request.getParameter("typeId")));
        Customer customer = new Customer(name,birthday,card,phoneNumber, email, address,typeId);
        try {
            Map<String, String> mapMsg = service.insertCustomer(customer);
            if (mapMsg.isEmpty()) {
                request.setAttribute("listCustomers", service.selectAll());
                request.getRequestDispatcher("furama/customer/list.jsp").forward(request,response);
            }else {
                request.setAttribute("msgEmail", mapMsg.get("email"));
                request.setAttribute("customer", customer);
                request.getRequestDispatcher("furama/customer/create.jsp").forward(request,response);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
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
        List<CustomerType> list=typeService.selectAll();
        RequestDispatcher dispatcher = request.getRequestDispatcher("./furama/customer/create.jsp");
        request.setAttribute("list",list);
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
