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
 * Servlet implementation class BuildServlet
 */
@WebServlet("/build")
public class BuildServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuildServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
        CompWorkerBean worker = new CompWorkerBean();
		
		CompBean compBean = new CompBean();
		
		try 
		{
			compBean.setCpuCost(worker.processCPU(request));
			compBean.setHardDriveCost(worker.processHardDrive(request));
			compBean.setMemoryCost(worker.processMemory(request));
			compBean.setBasePrice(worker.returnBasePrice(request));
			compBean.setTotalCost(worker.calculateTotalCost(request));
			compBean.setModelImage(worker.processModelImage(request));
			compBean.setCpuDescription(worker.processCpuDescription(request));
			compBean.setHardDriveDescription(worker.processHardDriveDescription(request));
			compBean.setMemoryDescription(worker.processMemoryDescription(request));
			compBean.setModelName(worker.processModelName(request));
			
		}
		catch (Exception e)
		{
			
		}
		
		
		session.setAttribute("builtComputer", compBean);
		
		RequestDispatcher dispatcher = getServletConfig().getServletContext().getRequestDispatcher("/checkout.jsp");
		
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
