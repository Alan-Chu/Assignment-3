/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;
import bean.Student;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author ALAN
 */
public class Servlet extends HttpServlet {

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
        ConnDB c = new ConnDB();
        Student student = new Student();
        HttpSession session = request.getSession(true);
        session.setAttribute("Student", student);
        
        if (request.getParameter("insert_name")!=null && request.getParameter("insert_score")!=null) {
            insertNewScore(request, response, student, c);
        }
        
        else if (request.getParameter("select_name") != null) {
            selectScoreByName(request, response, student, c);
        }
        
        else if (request.getParameter("update_name")!=null && request.getParameter("update_score")!=null) {
            updateScoreByName(request, response, student, c);
        }
    }
    
    protected void insertNewScore(HttpServletRequest request, HttpServletResponse response, Student student, ConnDB c)
            throws ServletException, IOException {
        if(request.getParameter("insert_name")!=null && request.getParameter("insert_score")!=null) {
            String name = request.getParameter("insert_name");
            double score = Double.parseDouble(request.getParameter("insert_score"));
            if(c.insertNew(name, score)) {
                student.setName(name);
                student.setScore(score);
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/insert_success.jsp");
                rd.forward(request, response);
            }
            else {
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/failure.jsp");
                rd.forward(request, response);
            }
        }
    }
    
    protected void selectScoreByName(HttpServletRequest request, HttpServletResponse response, Student student, ConnDB c)
            throws ServletException, IOException {
        String name = request.getParameter("select_name");
        double score = c.selectScore(name);
        if (score != -1) {
            student.setName(name);
            student.setScore(score);
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/select_success.jsp");
            rd.forward(request, response);
        }
        else {
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/failure.jsp");
            rd.forward(request, response);
        }
        
    }
    
    protected void updateScoreByName(HttpServletRequest request, HttpServletResponse response, Student student, ConnDB c)
            throws ServletException, IOException {
        String name = request.getParameter("update_name");
        double newScore = Double.parseDouble(request.getParameter("update_score"));
        student.setName(name);
        student.setScore(newScore);
        if(c.updateScore(name, newScore)) {
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/update_success.jsp");
            rd.forward(request, response);
        }
        else {
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/failure.jsp");
            rd.forward(request, response);
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
