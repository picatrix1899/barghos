package org.barghos.util.collection;;

public class ObjectIndexValuePair
{
	private Object value;
	private int index;
	
	public ObjectIndexValuePair() { }
	
	public ObjectIndexValuePair(Object value, int index)
	{
		set(value, index);
	}
	
	public ObjectIndexValuePair set(Object value, int index)
	{
		value(value);
		index(index);
		
		return this;
	}
	
	public ObjectIndexValuePair index(int index)
	{
		this.index = index;
		
		return this;
	}
	
	public ObjectIndexValuePair value(Object value)
	{
		this.value = value;
		
		return this;
	}
	
	public int index()
	{
		return this.index;
	}
	
	public Object value()
	{
		return this.value;
	}
}
