package com.compbuilder.model;

import java.util.ArrayList;

public class CompBean 
{
	
	public double getTotalCost()
	{
		return totalCost;
	}
	public void setTotalCost(double totalCost)
	{
		this.totalCost = totalCost;
	}
	public double getCpuCost()
	{
		return this.cpuCost;
	}
	public void setCpuCost(double cpuCost)
	{
		this.cpuCost = cpuCost;
	}
	public double getHardDriveCost()
	{
		return this.hardDriveCost;
	}
	public void setHardDriveCost(double hardDriveCost)
	{
		this.hardDriveCost = hardDriveCost;
	}
	public double getMemoryCost()
	{
		return this.memoryCost;
	}
	public void setMemoryCost(double memoryCost)
	{
		this.memoryCost = memoryCost;
	}
	public double getBasePrice()
	{
		return this.basePrice;
	}
	public void setBasePrice(double basePrice)
	{
		this.basePrice = basePrice;
	}
	public String getModelImage()
	{
		return this.modelImage;
	}
	public void setModelImage(String modelImage)
	{
		this.modelImage = modelImage;
	}
	public String getCpuDescription()
	{
		return this.cpuDescription;
	}
	public void setCpuDescription(String cpuDescription)
	{
		this.cpuDescription = cpuDescription;
	}
	public String getHardDriveDescription()
	{
		return this.hardDriveDescription;
	}
	public void setHardDriveDescription(String hardDriveDescription)
	{
		this.hardDriveDescription = hardDriveDescription;
	}
	public String getMemoryDescription()
	{
		return this.memoryDescription;
	}
        public String getStandardCPU()
	{
		return this.cpuDescription;
	}
	public void setMemoryDescription(String memoryDescription)
	{
		this.memoryDescription = memoryDescription;
	}
	public String getModelName()
	{
		return this.modelName;
	}
	public void setModelName(String modelName)
	{
		this.modelName = modelName;
	}
	
	double hardDriveCost;
	double cpuCost;
	double memoryCost;
	double totalCost;
	double basePrice;
	String modelImage;
	String cpuDescription;
	String memoryDescription;
	String hardDriveDescription;
	String modelName;

}
