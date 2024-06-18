package org.barghos.util.collection;;

public class IndexValuePairC
{
	private char value;
	private int index;
	
	public IndexValuePairC() { }
	
	public IndexValuePairC(char value, int index)
	{
		set(value, index);
	}
	
	public IndexValuePairC set(char value, int index)
	{
		value(value);
		index(index);
		
		return this;
	}
	
	public IndexValuePairC index(int index)
	{
		this.index = index;
		
		return this;
	}
	
	public IndexValuePairC value(char value)
	{
		this.value = value;
		
		return this;
	}
	
	public int index()
	{
		return this.index;
	}
	
	public char value()
	{
		return this.value;
	}
}
