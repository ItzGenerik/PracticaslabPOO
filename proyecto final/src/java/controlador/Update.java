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
import java.sql.ResultSet;
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
 * @author Karlo jair
 */
public class Update extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Insert</title>");            
            out.println("</head>");
            out.println("<body>");
            Connection conn = Conectar.conexion();
            Statement state = conn.createStatement();  
            
            usuario.setMatricula(Integer.parseInt(request.getParameter("matricula"))); 
            
            String qry = "SELECT * FROM users WHERE matricula = " + "'" + usuario.getMatricula() + "'";
            System.out.println("* " + qry);

            
            ResultSet rs = state.executeQuery(qry);
            while (rs.next()) {
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setSemestre(rs.getInt("semestre"));
                usuario.setPromedio(rs.getFloat("promedio"));
                
            }
            out.println("Ingresa los datos que deseas cambiar.<br><br>");
   
            out.println(
                        "<form action=\"UpdateInsert\" method=\"get\">"
                    +   "<label for=\"nombre\">Nombre:</label><br>"
                    +   "<input required type=\"text\" id=\"nombre\" name=\"nombre\" value=\""+usuario.getNombre()+"\" maxlength=\"45\"><br><br>"
                    +   "<label for=\"apellido\">Apellido:</label><br>"
                    +   "<input required type=\"text\" id=\"apellido\" name=\"apellido\" value=\""+usuario.getApellido()+"\" maxlength=\"45\"><br><br>"
                    +   "<label for=\"semestre\">Semestre:</label>"
                    +   "<input required type=\"number\" id=\"semestre\" name=\"semestre\" value=\""+usuario.getSemestre()+"\"min=\"1\" max=\"9\"><br><br>"
                    +   "<label for=\"matricula\">Matricula:</label>"
                    +   "<input required type=\"number\" id=\"matricula\" name=\"matricula\" value=\""+usuario.getMatricula()+"\"min=\"1000000\" max=\"9999999\" readonly=\"readonly\"><br><br>"
                    +   "<label for=\"promedio\">Promedio:</label>"
                    +   "<input type=\"number\" id=\"promedio\" name=\"promedio\" value=\""+usuario.getPromedio()+"\"min=\"0\" max=\"10\" required><br><br>"
                    +   "<input type=\"submit\" value=\"Submit\">"
                    +   "</form><br><br>");

            out.println(usuario.regresar());
            out.println("</body>");
            out.println("</html>");
            
        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
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
