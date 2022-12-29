package Servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ExampleServlet {
    public static void main(String[] args) throws Exception {
        AdvancedJava app = new AdvancedJava();

    }
}
class AdvancedJava extends HttpServlet {
    private String output;

    public void init() {
        output = "Java Concept";
    }
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println(output);
        out.close();

    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("over");
    }
}
