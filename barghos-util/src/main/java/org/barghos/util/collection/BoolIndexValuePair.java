package org.barghos.util.collection;;

public class BoolIndexValuePair
{
	private boolean value;
	private int index;
	
	public BoolIndexValuePair() { }
	
	public BoolIndexValuePair(boolean value, int index)
	{
		set(value, index);
	}
	
	public BoolIndexValuePair set(boolean value, int index)
	{
		value(value);
		index(index);
		
		return this;
	}
	
	public BoolIndexValuePair index(int index)
	{
		this.index = index;
		
		return this;
	}
	
	public BoolIndexValuePair value(boolean value)
	{
		this.value = value;
		
		return this;
	}
	
	public int index()
	{
		return this.index;
	}
	
	public boolean value()
	{
		return this.value;
	}
}
