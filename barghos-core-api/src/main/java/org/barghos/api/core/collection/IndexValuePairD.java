package org.barghos.api.core.collection;

public class IndexValuePairD
{
	private double value;
	private int index;
	
	public IndexValuePairD() { }
	
	public IndexValuePairD(double value, int index)
	{
		set(value, index);
	}
	
	public IndexValuePairD set(double value, int index)
	{
		value(value);
		index(index);
		
		return this;
	}
	
	public IndexValuePairD index(int index)
	{
		this.index = index;
		
		return this;
	}
	
	public IndexValuePairD value(double value)
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
