package org.barghos.util.collection;;


public class ShortIndexValuePair
{
	private short value;
	private int index;
	
	public ShortIndexValuePair() { }
	
	public ShortIndexValuePair(short value, int index)
	{
		set(value, index);
	}
	
	public ShortIndexValuePair set(short value, int index)
	{
		value(value);
		index(index);
		
		return this;
	}
	
	public ShortIndexValuePair index(int index)
	{
		this.index = index;
		
		return this;
	}
	
	public ShortIndexValuePair value(short value)
	{
		this.value = value;
		
		return this;
	}
	
	public int index()
	{
		return this.index;
	}
	
	public short value()
	{
		return this.value;
	}
}
