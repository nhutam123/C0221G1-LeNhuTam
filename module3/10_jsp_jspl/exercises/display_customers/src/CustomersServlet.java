import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomersServlet" ,urlPatterns = {"/abv"})
public class CustomersServlet extends HttpServlet {
    List<Customer> customers=new ArrayList<>();
    public void init() throws SecurityException {
        customers.add(new Customer("Mai Văn Hoàn","1983-08-20","Hà Nội","https://thuthuatnhanh.com/wp-content/uploads/2018/07/gai-xinh-thai-lan-Nene.jpg"));
        customers.add(new Customer("Nguyễn Văn Nam","1983-08-20","Hà Nội","https://james.codegym.vn/pluginfile.php/50370/mod_assign/intro/1.png"));
        customers.add(new Customer("Nguyên Thái Hòa","1983-08-20","Hà Nội","https://james.codegym.vn/pluginfile.php/50370/mod_assign/intro/1.png"));
        customers.add(new Customer("Tràn Đăng Khoa","1983-08-20","Hà Nội","https://james.codegym.vn/pluginfile.php/50370/mod_assign/intro/1.png"));
        customers.add(new Customer("Nguyễn Đình Thi","1983-08-20","Hà Nội","https://james.codegym.vn/pluginfile.php/50370/mod_assign/intro/1.png"));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("list" ,customers);
        request.getRequestDispatcher("/display.jsp").forward(request,response);

    }
}
