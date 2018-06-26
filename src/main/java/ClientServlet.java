import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/cliente","/clienteController" })
public class ClientServlet extends HttpServlet {



    @Override
    public void destroy() {
        System.out.println("Destruindo Servlet");
        super.destroy();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // resp.getWriter().print("Chamando service...");
        super.service(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //System.out.println("GET!");
        resp.getWriter().print("Chamou pelo metodo GET!");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // System.out.println("POST!");
        String email = req.getParameter("email");
        resp.getWriter().print("Chamou pelo metodo POST no email: "+ email);
    }
}
