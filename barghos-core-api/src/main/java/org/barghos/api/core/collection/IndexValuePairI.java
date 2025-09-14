package org.barghos.api.core.collection;

public class IndexValuePairI
{
	private int value;
	private int index;
	
	public IndexValuePairI() { }
	
	public IndexValuePairI(int value, int index)
	{
		set(value, index);
	}
	
	public IndexValuePairI set(int value, int index)
	{
		value(value);
		index(index);
		
		return this;
	}
	
	public IndexValuePairI index(int index)
	{
		this.index = index;
		
		return this;
	}
	
	public IndexValuePairI value(int value)
	{
		this.value = value;
		
		return this;
	}
	
	public int index()
	{
		return this.index;
	}
	
	public int value()
	{
		return this.value;
	}
}
