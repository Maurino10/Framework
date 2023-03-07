package etu1809.framework.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import utils.Util;

public class FrontServlet extends HttpServlet{
    protected void processRequest(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String  url = String.valueOf(req.getRequestURL());
        out.println(Util.trait_url(url));
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}  

 