import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello-world")

public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");

        String name = req.getParameter("name");
        if(name == null) name = "World";

        PrintWriter out = res.getWriter();
        out.println("<h1>" + "Hello, " + name + "!" + "</h1>");
        res.getWriter().println("<h2>Another message...</h2>");

    }
}
