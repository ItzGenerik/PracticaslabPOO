/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

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
import modelo.user;

/**
 *
 * @author Karlo jair
 */
public class UpdateInsert extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            conectar Conectar = new conectar();
            user usuario = new user();

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UpdateInsert</title>");
            out.println("</head>");
            out.println("<body>");

            Connection conn = Conectar.conexion();
            Statement state = conn.createStatement();

            usuario.setMatricula(Integer.parseInt(request.getParameter("matricula"))); 
            usuario.setApellido(request.getParameter("apellido"));
            usuario.setNombre(request.getParameter("nombre"));
            usuario.setPromedio(Float.parseFloat(request.getParameter("promedio")));
            usuario.setSemestre(Integer.parseInt(request.getParameter("semestre")));

            String qry = "UPDATE users \nSET "
                    + "nombre = '" + usuario.getNombre() + "',"
                    + "apellido = " + "'" + usuario.getApellido() + "',"
                    + "semestre = " + usuario.getSemestre() + ","
                    + "promedio =" + usuario.getPromedio() + ""
                    + "\nWHERE matricula = " + usuario.getMatricula() + ";";
            System.out.println("* " + qry);
            state.executeUpdate(qry);
            out.println("<h1>La informacion ha sido actualizada" + "</h1>");

            out.println(usuario.regresar());

        } catch (SQLException ex) {
            Logger.getLogger(UpdateInsert.class.getName()).log(Level.SEVERE, null, ex);
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
