package org.barghos.util.collection;

import java.math.BigInteger;

public class BigIntIndexValuePair
{
	private BigInteger value;
	private int index;
	
	public BigIntIndexValuePair() { }
	
	public BigIntIndexValuePair(BigInteger value, int index)
	{
		set(value, index);
	}
	
	public BigIntIndexValuePair set(BigInteger value, int index)
	{
		value(value);
		index(index);
		
		return this;
	}
	
	public BigIntIndexValuePair index(int index)
	{
		this.index = index;
		
		return this;
	}
	
	public BigIntIndexValuePair value(BigInteger value)
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
