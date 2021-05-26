import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet",urlPatterns = "/discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product=request.getParameter("product");
        float listPrice=Float.parseFloat(request.getParameter("listPrice"));
        float discountPercen=Float.parseFloat(request.getParameter("discount"));

        double discount=listPrice*discountPercen*0.01;
        PrintWriter writer=response.getWriter();
        writer.println("<html>");
        writer.println("name :"+product);
        writer.println("discount : "+discount);
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
