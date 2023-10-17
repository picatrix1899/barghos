package org.barghos.util.collection;;


public class LongIndexValuePair
{
	private long value;
	private int index;
	
	public LongIndexValuePair() { }
	
	public LongIndexValuePair(long value, int index)
	{
		set(value, index);
	}
	
	public LongIndexValuePair set(long value, int index)
	{
		value(value);
		index(index);
		
		return this;
	}
	
	public LongIndexValuePair index(int index)
	{
		this.index = index;
		
		return this;
	}
	
	public LongIndexValuePair value(long value)
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
