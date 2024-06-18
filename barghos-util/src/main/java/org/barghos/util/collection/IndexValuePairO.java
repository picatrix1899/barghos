package org.barghos.util.collection;;

public class IndexValuePairO
{
	private Object value;
	private int index;
	
	public IndexValuePairO() { }
	
	public IndexValuePairO(Object value, int index)
	{
		set(value, index);
	}
	
	public IndexValuePairO set(Object value, int index)
	{
		value(value);
		index(index);
		
		return this;
	}
	
	public IndexValuePairO index(int index)
	{
		this.index = index;
		
		return this;
	}
	
	public IndexValuePairO value(Object value)
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
