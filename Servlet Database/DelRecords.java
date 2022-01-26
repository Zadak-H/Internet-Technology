/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 *
 * @author DELL
 */
public class DelRecords extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Connection connection = null;
	Statement stmt = null;
        PrintWriter out = response.getWriter();
        try{
            out.println("");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>JSP Page</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<form method='post'>");
            out.println("<table cellspacing='5px'>");
            out.println("<tr>");
            out.println("<td>Enter the name</td>");
            out.println("<td>:<input type='text' name='name1' id='name1'> </td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td colspan='2'><input type='submit' value = 'Delete'></td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</form>");

            /* TODO output your page here. You may use following sample code. */
            if(request.getParameter("name1")!=null ){
		Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "sonu@2001");
		stmt = connection.createStatement();
                String cmd = "delete from data where name = ('"+request.getParameter("name1")+"');";
		stmt.executeUpdate(cmd);
                
		out.println("Record deleted successfully");
            }
        }
        catch(SQLException e)
        {
            out.println(e.toString());
        }
        catch(ClassNotFoundException e)
        {
            out.println(e.toString());
        }
            out.println("<form action = 'index.html'>");
            out.println("<input type = 'submit' value = 'Go to Home page'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
    }


}
