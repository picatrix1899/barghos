package org.barghos.util.collection;;

public class StringIndexValuePair
{
	private String value;
	private int index;
	
	public StringIndexValuePair() { }
	
	public StringIndexValuePair(String value, int index)
	{
		set(value, index);
	}
	
	public StringIndexValuePair set(String value, int index)
	{
		value(value);
		index(index);
		
		return this;
	}
	
	public StringIndexValuePair index(int index)
	{
		this.index = index;
		
		return this;
	}
	
	public StringIndexValuePair value(String value)
	{
		this.value = value;
		
		return this;
	}
	
	public int index()
	{
		return this.index;
	}
	
	public String value()
	{
		return this.value;
	}
}
