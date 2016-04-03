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
	         case "hardDrive1": hardDriveCost = hardDrive240GB;
	                             break;
	         case "hardDrive2": hardDriveCost = hardDrive500GB;
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
	         case "cpu1": cpuCost = cpu1GHz;
	                             break;
	         case "cpu2": cpuCost = cpu2GHz;
	                             break;
	         case "cpu3": cpuCost = cpu3GHz;
             					break;
	     }
		
		return cpuCost;
	}
	
	public String processCpuDescription(HttpServletRequest request) throws Exception
	{
		cpuName = request.getParameter("cpustatus");
		
		switch(cpuName)
	     {
	         case "cpu1": cpuDescription = cpu1GHzDescription;
	                             break;
	         case "cpu2": cpuDescription = cpu2GHzDescription;
	                             break;
	         case "cpu3": cpuDescription = cpu3GHzDescription;
             					break;
	     }
		
		return cpuDescription;
	}
	
	public String processHardDriveDescription(HttpServletRequest request) throws Exception
	{
		hardDriveName = request.getParameter("harddrivestatus");
		
		switch(hardDriveName)
	     {
	         case "hardDrive1": hardDriveDescription = hardDrive240GBDescription;
	                             break;
	         case "hardDrive2": hardDriveDescription = hardDrive500GBDescription;
	                             break;
	     }
		
		return hardDriveDescription;
	}
	
	public String processMemoryDescription(HttpServletRequest request) throws Exception
	{
		memoryName = request.getParameter("memorystatus");
		
		switch(memoryName)
	     {
	         case "memory1": memoryDescription = memory4GBDescription;
	                             break;
	         case "memory2": memoryDescription = memory8GBDescription;
	                             break;
	         case "memory3": memoryDescription = memory16GBDescription;
             break;
	     }
		
		return memoryDescription;
	}
	
	
	public double calculateTotalCost(HttpServletRequest request) throws Exception
	{
		totalCost = hardDriveCost + memoryCost + cpuCost + basePrice;
		
		return totalCost;
	}
	
	public double processBasePrice(HttpServletRequest request)
	{
        modelName = request.getParameter("modelName");
		
		switch(modelName)
	     {
	         case "D5B1": basePrice = d5b1BasePrice;
	                             break;
	         case "D0B2": basePrice = d0b2BasePrice;
	                             break;
	         case "DDB3": basePrice = ddb3BasePrice;
             					break;
	         case "L5B1": basePrice = l5b1BasePrice;
				break;
	         case "L0B2": basePrice = l0b2BasePrice;
				break;
	         case "LB32": basePrice = lb32BasePrice;
				break;
	     }
		
		return basePrice;
	}
	
	public double returnBasePrice(HttpServletRequest request)
	{
		String base= "";
		base = request.getParameter("basePrice");
		
		double price = Double.parseDouble(base);
		
		basePrice = price;
		
		return price;
	}
	
	public String processModelImage(HttpServletRequest request)
	{
        String modelImage = request.getParameter("modelImage");
		
		
		return modelImage;
	}
	
	public String processModelName(HttpServletRequest request)
	{
        String modelName = request.getParameter("modelName");
		
		
		return modelName;
	}
	
	double totalCost;
	double hardDriveCost;
	double memoryCost;
	double cpuCost;
	double basePrice;
	String hardDriveName;
	String memoryName;
	String cpuName;
	String modelName;
	String hardDriveDescription;
	String memoryDescription;
	String cpuDescription;
	String modelDescription;
	
	private static final double hardDrive500GB = 399.99;
	private static final double hardDrive240GB = 199.99;
	private static final double memory4GB = 199.99;
	private static final double memory8GB = 399.99;
	private static final double memory16GB = 599.99;
	private static final double cpu1GHz = 499.99;
	private static final double cpu2GHz = 799.99;
	private static final double cpu3GHz = 999.99;
	
	private static final double d5b1BasePrice = 399.99;
	private static final double d0b2BasePrice = 499.99;
	private static final double ddb3BasePrice = 599.99;
	private static final double l5b1BasePrice = 299.99;
	private static final double l0b2BasePrice = 399.99;
	private static final double lb32BasePrice = 499.99;
	
	private static final String hardDrive500GBDescription = "500GB Hard Drive";
	private static final String hardDrive240GBDescription = "240GB Hard Drive";
	private static final String memory4GBDescription = "4GB RAM";
	private static final String memory8GBDescription = "8GB RAM";
	private static final String memory16GBDescription = "16GB RAM";
	private static final String cpu1GHzDescription = "1GHz Quad-Core Processor";
	private static final String cpu2GHzDescription = "2GHz Quard-Core Processor";
	private static final String cpu3GHzDescription = "3GHz Quad-Core Processor";

}
