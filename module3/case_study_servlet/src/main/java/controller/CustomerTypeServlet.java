package controller;

import model.bean.CustomerType;
import model.service.CustomerTypeService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CustomerTypeServlet",urlPatterns = {"/customer_type"})
public class CustomerTypeServlet extends HttpServlet {
    CustomerTypeService service=new CustomerTypeService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        try {
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
//                    sort(request,response);
                    break;
                default:
                    listtype(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }

    }

    private void listtype(HttpServletRequest request, HttpServletResponse response)
       throws SQLException, IOException, ServletException {
            List<CustomerType> listType = service.selectAll();
            request.setAttribute("list", listType);
            RequestDispatcher dispatcher = request.getRequestDispatcher("./furama/customerType/list.jsp");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
