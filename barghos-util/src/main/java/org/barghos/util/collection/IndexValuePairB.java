package org.barghos.util.collection;;


public class IndexValuePairB
{
	private byte value;
	private int index;
	
	public IndexValuePairB() { }
	
	public IndexValuePairB(byte value, int index)
	{
		set(value, index);
	}
	
	public IndexValuePairB set(byte value, int index)
	{
		value(value);
		index(index);
		
		return this;
	}
	
	public IndexValuePairB index(int index)
	{
		this.index = index;
		
		return this;
	}
	
	public IndexValuePairB value(byte value)
	{
		this.value = value;
		
		return this;
	}
	
	public int index()
	{
		return this.index;
	}
	
	public byte value()
	{
		return this.value;
	}
}
