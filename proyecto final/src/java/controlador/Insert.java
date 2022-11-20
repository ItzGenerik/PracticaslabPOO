/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import modelo.user;
import conn.conectar;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Karlo Jair
 */
public class Insert extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            conectar Conectar = new conectar();
            user usuario = new user();
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Insert</title>");            
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Servlet Insert at " + request.getContextPath() + "</h1>");

            usuario.setApellido(request.getParameter("apellido"));
            usuario.setNombre(request.getParameter("nombre"));
            usuario.setSemestre(Integer.parseInt(request.getParameter("semestre")));
            usuario.setMatricula(Integer.parseInt(request.getParameter("matricula")));
            usuario.setPromedio(Float.parseFloat(request.getParameter("promedio")));
            
            Connection conn = Conectar.conexion();
            Statement state = conn.createStatement();  
            
            

            String qry;
            qry = "INSERT INTO users (nombre, apellido, semestre, matricula, promedio) "
                    +"VALUES ('" + usuario.getNombre() + "',"
                    + "" +"'" + usuario.getApellido() + "',"
                    + "'" + usuario.getSemestre() + "',"
                    + "'" + usuario.getMatricula() + "',"
                    + "'" + usuario.getPromedio()+ "'"
                    + ");"; 
            
            System.out.println(qry);
            state.executeUpdate(qry);
            out.println("Informacion añadida con exito<br><br>");
            
            out.println(usuario.regresar());
            out.println("</body>");
            out.println("</html>");
            
        } catch (SQLException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
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
