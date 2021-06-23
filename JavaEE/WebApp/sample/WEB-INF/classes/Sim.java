import java.io.IOException;
import java.io.PrintWriter;
import java.util.ResourceBundle;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class sim extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
 response.setContentType("text/html");
PrintWriter out = response.getWriter();
out.println("<!DOCTYPE html><html>");
out.println("<head><h1>SIMSON</head>");
out.println("<body><h2>david</body>");

}
}

