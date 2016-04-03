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
import com.compbuilder.worker.CompWorkerBean;

/**
 * Servlet implementation class BuildModel
 */
@WebServlet("/buildModel")
public class BuildModel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuildModel() {
        super();
      
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		HttpSession session = request.getSession();
		CompWorkerBean worker = new CompWorkerBean();
		
		CompBean compBean = new CompBean();
		
		compBean.setBasePrice(worker.processBasePrice(request));
		compBean.setModelImage(worker.processModelImage(request));
		compBean.setModelName(worker.processModelName(request));
		
		session.setAttribute("builtComputer", compBean);
		
		RequestDispatcher dispatcher = getServletConfig().getServletContext().getRequestDispatcher("/base.jsp");
		
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		doGet(request, response);
	}

}
