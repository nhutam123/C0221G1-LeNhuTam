package controller;

import model.bean.*;
import model.service.ContractService;
import model.service.CustomerService;
import model.service.EmployeeService;
import model.service.ServiceService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ContractServlet", urlPatterns = "/contract")
public class ContractServlet extends HttpServlet {
    ContractService contractService = new ContractService();
    EmployeeService employeeService = new EmployeeService();
    CustomerService customerService = new CustomerService();
    ServiceService serviceService = new ServiceService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                insertContract(request, response);
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
                showNewForm(request, response);
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
                listContract(request, response);
                break;
        }
    }

    private void insertContract(HttpServletRequest request, HttpServletResponse response) {
        String startTime=request.getParameter("startTime");
        String endTime=request.getParameter("endTime");
        double deposit=Double.parseDouble(request.getParameter("deposit"));
        double total=Double.parseDouble(request.getParameter("total"));
        Employee employee=employeeService.select(Integer.parseInt(request.getParameter("employee")));
        Customer customer=customerService.selectCustomer(Integer.parseInt(request.getParameter("customer")));
        Service service=serviceService.selectService(Integer.parseInt(request.getParameter("service")));
        Contract contract=new Contract(startTime,endTime,deposit,total,employee,customer,service);
        contractService.insertContract(contract);

        RequestDispatcher dispatcher = request.getRequestDispatcher("furama/contract/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) {
        List<Employee> list = employeeService.selectAll();
        List<Customer> customerList = customerService.selectAll();
        List<Service> serviceList = serviceService.selectAll();
        request.setAttribute("employeeList", list);
        request.setAttribute("customerList", customerList);
        request.setAttribute("ServiceList", serviceList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("furama/contract/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    private void listContract(HttpServletRequest request, HttpServletResponse response) {
        List<Contract> list = contractService.selectAll();
        request.setAttribute("listContract", list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/furama/contract/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
