package org.barghos.api.core.collection;

public class IndexValuePairBo
{
	private boolean value;
	private int index;
	
	public IndexValuePairBo() { }
	
	public IndexValuePairBo(boolean value, int index)
	{
		set(value, index);
	}
	
	public IndexValuePairBo set(boolean value, int index)
	{
		value(value);
		index(index);
		
		return this;
	}
	
	public IndexValuePairBo index(int index)
	{
		this.index = index;
		
		return this;
	}
	
	public IndexValuePairBo value(boolean value)
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
