package controller;

import model.bean.*;
import model.service.RentalTypeService;
import model.service.ServiceService;
import model.service.ServiceTypeService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ServiceServlet" , urlPatterns = "/service")
public class ServiceServlet extends HttpServlet {
    ServiceTypeService typeService=new ServiceTypeService();
    RentalTypeService rentalTypeService=new RentalTypeService();

    ServiceService serviceService =new ServiceService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                insertService(request, response);
                break;
            case "edit":
//                updateSevice(request, response);
                break;
            case "search":
//                searchService(request,response);
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
                listService(request, response);
                break;
        }

    }

    private void listService(HttpServletRequest request, HttpServletResponse response) {
        List<Service> list= serviceService.selectAll();
        request.setAttribute("listService",list);
        RequestDispatcher dispatcher=request.getRequestDispatcher("furama/service/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void insertService(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("name");
        int area=Integer.parseInt(request.getParameter("area"));
        double price =Double.parseDouble(request.getParameter("price"));
        int maxCustomer=Integer.parseInt(request.getParameter("maxCustomer"));
        ServiceType typeId=typeService.selectServiceType(Integer.parseInt(request.getParameter("type")));
        int idrental=Integer.parseInt(request.getParameter("rentalType"));
        RentalType rentalType=rentalTypeService.selectRentalType(Integer.parseInt(request.getParameter("rentalType")));
        int status=Integer.parseInt(request.getParameter("status"));
        Service service = new Service(name,area,price,maxCustomer, typeId, rentalType,status);
        try {
           serviceService.insertService(service);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        List<ServiceType> list=typeService.selectAll();
        List<RentalType> rentalTypeList=rentalTypeService.selectAll();
        request.setAttribute("listType",list);
        request.setAttribute("listRentalType",rentalTypeList);
        request.setAttribute("service",service);
        RequestDispatcher dispatcher = request.getRequestDispatcher("furama/service/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void showNewForm(HttpServletRequest request, HttpServletResponse response) {
        List<ServiceType> list=typeService.selectAll();
        List<RentalType> rentalTypeList =rentalTypeService.selectAll();
        request.setAttribute("listType",list);
        request.setAttribute("listRentalType",rentalTypeList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("furama/service/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}