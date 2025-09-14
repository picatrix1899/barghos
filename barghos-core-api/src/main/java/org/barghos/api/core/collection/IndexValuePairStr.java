package org.barghos.api.core.collection;

public class IndexValuePairStr
{
	private String value;
	private int index;
	
	public IndexValuePairStr() { }
	
	public IndexValuePairStr(String value, int index)
	{
		set(value, index);
	}
	
	public IndexValuePairStr set(String value, int index)
	{
		value(value);
		index(index);
		
		return this;
	}
	
	public IndexValuePairStr index(int index)
	{
		this.index = index;
		
		return this;
	}
	
	public IndexValuePairStr value(String value)
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
