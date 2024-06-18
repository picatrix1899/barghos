package org.barghos.util.collection;;


public class IndexValuePairL
{
	private long value;
	private int index;
	
	public IndexValuePairL() { }
	
	public IndexValuePairL(long value, int index)
	{
		set(value, index);
	}
	
	public IndexValuePairL set(long value, int index)
	{
		value(value);
		index(index);
		
		return this;
	}
	
	public IndexValuePairL index(int index)
	{
		this.index = index;
		
		return this;
	}
	
	public IndexValuePairL value(long value)
	{
		this.value = value;
		
		return this;
	}
	
	public int index()
	{
		return this.index;
	}
	
	public long value()
	{
		return this.value;
	}
}
