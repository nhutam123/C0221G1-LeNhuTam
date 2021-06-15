package controller;

import model.bean.Product;
import model.service.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "ProductServlet" ,urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    ProductService service = new ProductService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "Create":
                try {
                    insertProduct(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "Edit":
                updateProduct(request, response);
                break;
            case "Search":
                searchProduct(request,response);
                break;
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "Create":
                showNewForm(request, response);
                break;
            case "Edit":
                showEditForm(request, response);
                break;
            case "Delete":
                delete(request, response);
                break;
            case "Sort":
//                sort(request,response);
                break;
            default:
                listProduct(request, response);
                break;
        }
    }
    private void searchProduct(HttpServletRequest request, HttpServletResponse response) {
        String name=request.getParameter("name");
        List<Product> products= service.search(name);
        RequestDispatcher dispatcher ;
        if (products.size()==0){
            dispatcher=request.getRequestDispatcher("product/error.jsp");
            try {
                dispatcher.forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            request.setAttribute("listProduct" ,products);
            try {
                dispatcher=request.getRequestDispatcher("product/list.jsp");
                dispatcher.forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
//
//
    private void delete(HttpServletRequest request, HttpServletResponse response) {
        int id=Integer.parseInt(request.getParameter("id"));
        service.delete(id);
        List<Product> list=service.selectAll();
        request.setAttribute("listProduct",list);
        RequestDispatcher dispatcher=request.getRequestDispatcher("/product/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
//
    private void updateProduct(HttpServletRequest request, HttpServletResponse response) {
        int id=Integer.parseInt(request.getParameter("id"));
        String name=request.getParameter("name");
        int price=Integer.parseInt(request.getParameter("price"));
        String color=request.getParameter("color");
        String describe=request.getParameter("describe");
        Product product=new Product(id,name,price,color,describe);
        service.update(product);
        Product product1=service.selectProduct(id);
        request.setAttribute("product",product1);
        RequestDispatcher dispatcher=request.getRequestDispatcher("product/edit.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//
    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = service.selectProduct(id);
        request.setAttribute("product", product);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/product/edit.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
//
    private void insertProduct(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));
        String color = request.getParameter("color");
        String describe = request.getParameter("describe");
        Product product = new Product(name, price, color, describe);
        Map<String, String> map = service.insertProduct(product);
        if (map.isEmpty()) {
            List<Product> list = service.selectAll();
            request.setAttribute("listProduct", list);
            RequestDispatcher dispatcher = request.getRequestDispatcher("product/list.jsp");
            dispatcher.forward(request, response);
        } else {
            request.setAttribute("employee", product);
            request.setAttribute("message", map.get("name"));
            try {
                request.getRequestDispatcher("employee/create.jsp").forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

//        List<Employee> list=service.selectAll();
//        request.setAttribute("listEmployee",list);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("employee/list.jsp");
//        try {
//            dispatcher.forward(request, response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//}


    private void showNewForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/product/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void listProduct(HttpServletRequest request, HttpServletResponse response) {
        List<Product> list= service.selectAll();
        request.setAttribute("listProduct" , list);
        RequestDispatcher dispatcher=request.getRequestDispatcher("/product/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
