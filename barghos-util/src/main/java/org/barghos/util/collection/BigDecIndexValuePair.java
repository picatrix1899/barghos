package org.barghos.util.collection;

import java.math.BigDecimal;

public class BigDecIndexValuePair
{
	private BigDecimal value;
	private int index;
	
	public BigDecIndexValuePair() { }
	
	public BigDecIndexValuePair(BigDecimal value, int index)
	{
		set(value, index);
	}
	
	public BigDecIndexValuePair set(BigDecimal value, int index)
	{
		value(value);
		index(index);
		
		return this;
	}
	
	public BigDecIndexValuePair index(int index)
	{
		this.index = index;
		
		return this;
	}
	
	public BigDecIndexValuePair value(BigDecimal value)
	{
		this.value = value;
		
		return this;
	}
	
	public int index()
	{
		return this.index;
	}
	
	public BigDecimal value()
	{
		return this.value;
	}
}
