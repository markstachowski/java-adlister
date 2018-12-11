import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegisterServlet", urlPatterns = "/")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password"))
        {
            RequestDispatcher req = request.getRequestDispatcher("profile.jsp");
            req.include(request, response);
        }
        else
        {
            RequestDispatcher req = request.getRequestDispatcher("index.jsp");
            req.forward(request, response);
        }
    }
}
