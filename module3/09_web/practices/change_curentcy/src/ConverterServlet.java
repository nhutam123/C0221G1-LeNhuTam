import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ConverterServlet" ,urlPatterns = "/convert")
public class ConverterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float rate=Float.parseFloat(request.getParameter("rate"));
        float usd=Float.parseFloat(request.getParameter("usd"));
        float vnd=rate*usd;
        PrintWriter writer=response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Rate : "+rate+"</h1>");
        writer.println("<h1>usd : "+usd+"</h1>");
        writer.println("h1>vnd : "+vnd+"</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
