package org.barghos.api.core.collection;

import java.math.BigInteger;

public class IndexValuePairBigi
{
	private BigInteger value;
	private int index;
	
	public IndexValuePairBigi() { }
	
	public IndexValuePairBigi(BigInteger value, int index)
	{
		set(value, index);
	}
	
	public IndexValuePairBigi set(BigInteger value, int index)
	{
		value(value);
		index(index);
		
		return this;
	}
	
	public IndexValuePairBigi index(int index)
	{
		this.index = index;
		
		return this;
	}
	
	public IndexValuePairBigi value(BigInteger value)
	{
		this.value = value;
		
		return this;
	}
	
	public int index()
	{
		return this.index;
	}
	
	public BigInteger value()
	{
		return this.value;
	}
}
