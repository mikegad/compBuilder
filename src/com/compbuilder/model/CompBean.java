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
	
	double hardDriveCost;
	double cpuCost;
	double memoryCost;
	double totalCost;

}
