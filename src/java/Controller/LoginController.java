/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import dal.DAOAccount;
import entity.Account;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author admin
 */
@WebServlet(name = "LoginController", urlPatterns = {"/LoginController"})
public class LoginController extends HttpServlet {

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

        String username = request.getParameter("user");
        String password = request.getParameter("pass");
        String remember = request.getParameter("remember");

        // Call to DAO to validate username and password
        DAOAccount dao = new DAOAccount();
        Account acc = dao.getAccountByUsernameAndPassword(username, password);

        if (acc == null) {
            request.setAttribute("mess", "Incorrect username or password!");
            request.getRequestDispatcher("Login.jsp").forward(request, response);
        } else {
            // Login success: set session attributes
            HttpSession session = request.getSession();
            session.setAttribute("acc", acc);

            // Handle "Remember Me"
            if (remember != null && remember.equals("on")) {
                // Create cookies for username and password
                Cookie userCookie = new Cookie("username", username);
                Cookie passCookie = new Cookie("password", password);

                // Set cookies to expire in 7 days
                userCookie.setMaxAge(60 * 60 * 24 * 7);  // 7 days
                passCookie.setMaxAge(60 * 60 * 24 * 7);  // 7 days

                // Add cookies to response
                response.addCookie(userCookie);
                response.addCookie(passCookie);
            } else {
                // If "Remember Me" is not checked, delete the cookies
                Cookie userCookie = new Cookie("username", "");
                Cookie passCookie = new Cookie("password", "");
                userCookie.setMaxAge(0);  // Deleting the cookie
                passCookie.setMaxAge(0);  // Deleting the cookie
                response.addCookie(userCookie);
                response.addCookie(passCookie);
            }

            request.getRequestDispatcher("home.jsp").forward(request, response);  // Redirect to home page
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
