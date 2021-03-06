package com.compbuilder.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.compbuilder.model.CompBean;
import com.compbuilder.model.Cart;
import com.compbuilder.worker.CompWorkerBean;

/**
 * Servlet implementation class BuildServlet
 */
@WebServlet("/cart")
public class CartController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartController() {
        super();

    }

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
        /**
         * @see HttpServlet#doGet(HttpServletRequest request,
         * HttpServletResponse response)
         */
        String delete = request.getParameter("delete");
        String submit = request.getParameter("Submit");

        if (delete == null) {
            HttpSession session = request.getSession();
            Cart cart = (Cart) session.getAttribute("Cart");
            CompBean compBean = (CompBean) session.getAttribute("builtComputer");
            if (cart == null) {
                cart = new Cart();
            }

            cart.addItem(compBean);

            session.setAttribute("Cart", cart);

            if (submit.equals("Add")) {
                response.sendRedirect("index.html");
            } else if (submit.equals("Checkout")) {
                response.sendRedirect("cart.jsp");
            }
        }
        else {
            HttpSession session = request.getSession();
            int intDelete=Integer.parseInt(delete);
            Cart cart = (Cart) session.getAttribute("Cart");
            //remove the item
            cart.removeItem(intDelete);
            //set the session
            session.setAttribute("Cart", cart);
            //redirect back to cart
            response.sendRedirect("cart.jsp");
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
    }// 

}
