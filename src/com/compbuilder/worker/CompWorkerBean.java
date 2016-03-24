package com.compbuilder.worker;

import javax.servlet.http.HttpServletRequest;

public class CompWorkerBean 
{
	public CompWorkerBean()
	{
		totalCost = 0;
		
	}
	
	public double processHardDrive(HttpServletRequest request) throws Exception
	{
		hardDriveName = request.getParameter("harddrivestatus");
		
		switch(hardDriveName)
	     {
	         case "hardDrive1": hardDriveCost = hardDrive500GB;
	                             break;
	         case "hardDrove2": hardDriveCost = hardDrive240GB;
	                             break;
	     }
		
		return hardDriveCost;
	}
	
	public double processMemory(HttpServletRequest request) throws Exception
	{
		memoryName = request.getParameter("memorystatus");
		
		switch(memoryName)
	     {
	         case "memory1": memoryCost = memory4GB;
	                             break;
	         case "memory2": memoryCost = memory8GB;
	                             break;
	         case "memory3": memoryCost = memory16GB;
             					break;
	     }
		
		return memoryCost;
	}
	
	public double processCPU(HttpServletRequest request) throws Exception
	{
		cpuName = request.getParameter("cpustatus");
		
		switch(cpuName)
	     {
	         case "cpu1": memoryCost = cpu1GHz;
	                             break;
	         case "cpu2": memoryCost = cpu2GHz;
	                             break;
	         case "cpu3": memoryCost = cpu3GHz;
             					break;
	     }
		
		return cpuCost;
	}
	
	public double calculateTotalCost(HttpServletRequest request) throws Exception
	{
		totalCost = hardDriveCost + memoryCost + cpuCost;
		
		return totalCost;
	}
	
	double totalCost;
	double hardDriveCost;
	double memoryCost;
	double cpuCost;
	String hardDriveName;
	String memoryName;
	String cpuName;
	private static final double hardDrive500GB = 399.99;
	private static final double hardDrive240GB = 199.99;
	private static final double memory4GB = 199.99;
	private static final double memory8GB = 399.99;
	private static final double memory16GB = 599.99;
	private static final double cpu1GHz = 499.99;
	private static final double cpu2GHz = 799.99;
	private static final double cpu3GHz = 999.99;

}
