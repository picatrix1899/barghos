package org.barghos.math.api.util;


public class ComponentValueDouble
{
	private double value;
	private int index;
	
	public ComponentValueDouble() { }
	
	public ComponentValueDouble(double value, int index)
	{
		this.value = value;
		this.index = index;
	}
	
	public ComponentValueDouble set(double value, int index)
	{
		return setValue(value).setIndex(index);
	}
	
	public ComponentValueDouble setIndex(int index)
	{
		this.index = index;
		
		return this;
	}
	
	public ComponentValueDouble setValue(double value)
	{
		this.value = value;
		
		return this;
	}
	
	public int getComponentIndex()
	{
		return this.index;
	}
	
	public double getValue()
	{
		return this.value;
	}
}
