package org.barghos.util.collection;;


public class IndexValuePairS
{
	private short value;
	private int index;
	
	public IndexValuePairS() { }
	
	public IndexValuePairS(short value, int index)
	{
		set(value, index);
	}
	
	public IndexValuePairS set(short value, int index)
	{
		value(value);
		index(index);
		
		return this;
	}
	
	public IndexValuePairS index(int index)
	{
		this.index = index;
		
		return this;
	}
	
	public IndexValuePairS value(short value)
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
