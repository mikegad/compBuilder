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
		String modelCheck = request.getParameter("modelName");
		
		if (modelCheck.contains("D"))
		{
			totalCost = hardDriveCost + memoryCost + cpuCost;
		}
		else
		{
			totalCost = hardDriveCost + memoryCost + cpuCost + laptopCost;
		}
			
		return totalCost;
	}
	
	public double processBasePrice(HttpServletRequest request)
	{
		String tempModel = request.getParameter("modelName");
		modelName = tempModel.substring(0,4);
		
		switch(modelName)
	     {
	         case "D5B1": basePrice = cpu1GHz + hardDrive240GB + memory4GB;
	                             break;
	         case "D0B2": basePrice = cpu2GHz + hardDrive500GB + memory8GB;
	                             break;
	         case "DDB3": basePrice = cpu3GHz + hardDrive500GB + memory16GB;
             					break;
	         case "L5B1": basePrice = cpu1GHz + hardDrive240GB + memory4GB + laptopCost;
				break;
	         case "L0B2": basePrice = cpu2GHz + hardDrive500GB + memory8GB + laptopCost;
				break;
	         case "LB32": basePrice = cpu3GHz + hardDrive500GB + memory16GB + laptopCost;
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
		String tempModel = request.getParameter("modelName");
		String modelName = tempModel.substring(0,4);
		
		return modelName;
	}
	
	public double processStandardCPU(HttpServletRequest request)
	{
		String tempModel = request.getParameter("modelName");
		modelName = tempModel.substring(0,4);
		// modelName = request.getParameter("modelName");
			
			switch(modelName)
		     {
		         case "D5B1": standardCPU = cpu1GHz;
		                             break;
		         case "D0B2": standardCPU = cpu2GHz;
		                             break;
		         case "DDB3": standardCPU = cpu3GHz;
	             					break;
		         case "L5B1": standardCPU = cpu1GHz;
					break;
		         case "L0B2": standardCPU= cpu2GHz;
					break;
		         case "LB32": standardCPU = cpu3GHz;
					break;
		     }
			
			return standardCPU;	
	}
	
	public double processStandardHardDrive(HttpServletRequest request)
	{
		String tempModel = request.getParameter("modelName");
		modelName = tempModel.substring(0,4);
		 // modelName = request.getParameter("modelName");
			
			switch(modelName)
		     {
		         case "D5B1": standardHardDrive = hardDrive240GB;
		                             break;
		         case "D0B2": standardHardDrive = hardDrive500GB;
		                             break;
		         case "DDB3": standardHardDrive = hardDrive500GB;
	             					break;
		         case "L5B1": standardHardDrive = hardDrive240GB;
					break;
		         case "L0B2": standardHardDrive = hardDrive500GB;
					break;
		         case "LB32": standardHardDrive = hardDrive500GB;
					break;
		     }
			
			return standardHardDrive;
		
	}
	
	public double processStandardMemory(HttpServletRequest request)
	{
		String tempModel = request.getParameter("modelName");
		modelName = tempModel.substring(0,4);
		 // modelName = request.getParameter("modelName");
			
			switch(modelName)
		     {
		         case "D5B1": standardMemory = memory4GB;
		                             break;
		         case "D0B2": standardMemory = memory8GB;
		                             break;
		         case "DDB3": standardMemory = memory16GB;
	             					break;
		         case "L5B1": standardMemory = memory4GB;
					break;
		         case "L0B2": standardMemory = memory8GB;
					break;
		         case "LB32": standardMemory = memory16GB;
					break;
		     }
			
			return standardMemory;
		
	}
	
	public String setConfiguredCpuDescription(HttpServletRequest request) throws Exception
	{
		String tempModel = request.getParameter("modelName");
		modelName = tempModel.substring(0,4);
		// cpuName = request.getParameter("cpustatus");
		
		switch(modelName)
	     {
	         case "D5B1": cpuDescription = cpu1GHzDescription;
	                             break;
	         case "D0B2": cpuDescription = cpu2GHzDescription;
	                             break;
	         case "DDB3": cpuDescription = cpu3GHzDescription;
             					break;
	         case "L5B1": cpuDescription = cpu1GHzDescription;
             					break;
             case "L0B2": cpuDescription = cpu2GHzDescription;
             					break;
             case "LB32": cpuDescription = cpu3GHzDescription;
								break;
	     }
		
		return cpuDescription;
	}
	
	public String setConfiguredHardDriveDescription(HttpServletRequest request) throws Exception
	{
		String tempModel = request.getParameter("modelName");
		modelName = tempModel.substring(0,4);
		// cpuName = request.getParameter("cpustatus");
		
		switch(modelName)
	     {
	         case "D5B1": hardDriveDescription = hardDrive240GBDescription;
	                             break;
	         case "D0B2": hardDriveDescription = hardDrive500GBDescription;
	                             break;
	         case "DDB3": hardDriveDescription = hardDrive500GBDescription;
             					break;
	         case "L5B1": hardDriveDescription = hardDrive240GBDescription;
             					break;
	         case "L0B2": hardDriveDescription = hardDrive500GBDescription;
             					break;
	         case "LB32": hardDriveDescription = hardDrive500GBDescription;
	         					break;
	     }
		
		return hardDriveDescription;
	}
	
	public String setConfiguredMemoryDescription(HttpServletRequest request) throws Exception
	{
		String tempModel = request.getParameter("modelName");
		modelName = tempModel.substring(0,4);
		// cpuName = request.getParameter("cpustatus");
		
		switch(modelName)
	     {
	         case "D5B1": memoryDescription = memory4GBDescription;
	                             break;
	         case "D0B2": memoryDescription = memory8GBDescription;
	                             break;
	         case "DDB3": memoryDescription = memory16GBDescription;
             					break;
	         case "L5B1": memoryDescription = memory4GBDescription;
             					break;
	         case "L0B2": memoryDescription = memory8GBDescription;
             					break;
	         case "LB32": memoryDescription = memory16GBDescription;
	         					break;
	     }
		
		return memoryDescription;
	}
	
	double totalCost;
	double hardDriveCost;
	double memoryCost;
	double cpuCost;
	double basePrice;
	double standardCPU;
	double standardHardDrive;
	double standardMemory;
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
	private static final double laptopCost = 199.99;
	
	private static final String hardDrive500GBDescription = "500GB Hard Drive";
	private static final String hardDrive240GBDescription = "240GB Hard Drive";
	private static final String memory4GBDescription = "4GB RAM";
	private static final String memory8GBDescription = "8GB RAM";
	private static final String memory16GBDescription = "16GB RAM";
	private static final String cpu1GHzDescription = "1GHz Quad-Core Processor";
	private static final String cpu2GHzDescription = "2GHz Quard-Core Processor";
	private static final String cpu3GHzDescription = "3GHz Quad-Core Processor";

}
