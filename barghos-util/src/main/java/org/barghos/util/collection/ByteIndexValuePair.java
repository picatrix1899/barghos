package org.barghos.util.collection;;


public class ByteIndexValuePair
{
	private byte value;
	private int index;
	
	public ByteIndexValuePair() { }
	
	public ByteIndexValuePair(byte value, int index)
	{
		set(value, index);
	}
	
	public ByteIndexValuePair set(byte value, int index)
	{
		value(value);
		index(index);
		
		return this;
	}
	
	public ByteIndexValuePair index(int index)
	{
		this.index = index;
		
		return this;
	}
	
	public ByteIndexValuePair value(byte value)
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
