/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author DELL
 */
public class AnyDataBase extends HttpServlet {

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
        //as2q1ajsp.jsp : Write JSP Program to create a Database
	String dbname=request.getParameter("dbname");
	String tablename=request.getParameter("tablename");
        PrintWriter out = response.getWriter();
        try  {
                out.println("<body bgcolor=black>");
		String f1="<font face=times new roman size=6 color=blue>";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","sonu@2001");
                String sql2="CREATE DATABASE "+dbname;
		PreparedStatement ps2=conn.prepareStatement(sql2);  // Creating database
		int x=ps2.executeUpdate();
		if(x>0)
		{
			out.println(f1+"Database Created Successfully.");
		}
		else
		{
			out.println(f1+"***Database not created.***");
		}
		
		//To make connection with database
		Connection conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname,"root","sonu@2001");
		String sql3="CREATE TABLE "+tablename+"(name varchar(25), email varchar(25), telephone varchar(15))";
		PreparedStatement ps3=conn1.prepareStatement(sql3); //Executing table creation query
		int y=ps3.executeUpdate();
		if(y>0)
		{
			out.println(f1+tablename+" created successfully...");
		}
		else
		{
			out.println(f1+tablename+" can not be created...");
		}
	}
	catch(SQLException sqle)
	{
            
            out.println(sqle.toString());
	}
        catch(ClassNotFoundException e){
            out.println(e.toString());

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
