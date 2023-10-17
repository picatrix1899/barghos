package org.barghos.util.collection;;


public class IntIndexValuePair
{
	private int value;
	private int index;
	
	public IntIndexValuePair() { }
	
	public IntIndexValuePair(int value, int index)
	{
		set(value, index);
	}
	
	public IntIndexValuePair set(int value, int index)
	{
		value(value);
		index(index);
		
		return this;
	}
	
	public IntIndexValuePair index(int index)
	{
		this.index = index;
		
		return this;
	}
	
	public IntIndexValuePair value(int value)
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
