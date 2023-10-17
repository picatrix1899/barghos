package org.barghos.util.collection;;

public class CharIndexValuePair
{
	private char value;
	private int index;
	
	public CharIndexValuePair() { }
	
	public CharIndexValuePair(char value, int index)
	{
		set(value, index);
	}
	
	public CharIndexValuePair set(char value, int index)
	{
		value(value);
		index(index);
		
		return this;
	}
	
	public CharIndexValuePair index(int index)
	{
		this.index = index;
		
		return this;
	}
	
	public CharIndexValuePair value(char value)
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
