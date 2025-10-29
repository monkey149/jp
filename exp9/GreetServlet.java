package exp9;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class GreetServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();

        // Get the 'name' parameter
        String name = req.getParameter("name");

        pw.println("<html><head><title>Greeting Servlet</title></head><body>");
        pw.println("<form method='get' action='GreetServlet'>");
        pw.println("Hey! What's your name: <input type='text' name='name' />");
        pw.println("<input type='submit' value='Greet' />");
        pw.println("</form>");

        if (name != null && !name.isEmpty()) {
            pw.println("<h2>Hi! I'm , " + name + "!</h2>");
        }

        pw.println("</body></html>");
        pw.close();
    }
}

// GreetServlet.class file 
// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetServlet extends HttpServlet {
   public GreetServlet() {
   }

   public void doGet(HttpServletRequest var1, HttpServletResponse var2) throws ServletException, IOException {
      var2.setContentType("text/html");
      PrintWriter var3 = var2.getWriter();
      String var4 = var1.getParameter("name");
      var3.println("<html><head><title>Greeting Servlet</title></head><body>");
      var3.println("<form method='get' action='GreetServlet'>");
      var3.println("Hey! What's your name: <input type='text' name='name' />");
      var3.println("<input type='submit' value='Greet' />");
      var3.println("</form>");
      if (var4 != null && !var4.isEmpty()) {
         var3.println("<h2>Hi! I'm , " + var4 + "!</h2>");
      }

      var3.println("</body></html>");
      var3.close();
   }
}

// steps to run
// place the .servlet file in sample->web-inf->servlet folder
// go to that folder and right click to open the terminal
//  in the terminal paste this:  -> javac -cp "C:\apache-tomcat-9.0.109\lib\servlet-api.jar;." FirstServlet.java
// .class file will be created, ussko cut karke classes wale folder mein daal
// then go to web.xml and jo servlet ka naam hai voh daal do
// bin mein jaake tomcat chalu karo, and http://127.0.0.1:8080/Sample/filename daalo
