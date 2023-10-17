package org.barghos.util.collection;;


public class DoubleIndexValuePair
{
	private double value;
	private int index;
	
	public DoubleIndexValuePair() { }
	
	public DoubleIndexValuePair(double value, int index)
	{
		set(value, index);
	}
	
	public DoubleIndexValuePair set(double value, int index)
	{
		value(value);
		index(index);
		
		return this;
	}
	
	public DoubleIndexValuePair index(int index)
	{
		this.index = index;
		
		return this;
	}
	
	public DoubleIndexValuePair value(double value)
	{
		this.value = value;
		
		return this;
	}
	
	public int index()
	{
		return this.index;
	}
	
	public double value()
	{
		return this.value;
	}
}
