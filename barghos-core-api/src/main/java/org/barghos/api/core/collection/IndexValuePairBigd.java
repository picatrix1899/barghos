package org.barghos.api.core.collection;

import java.math.BigDecimal;

public class IndexValuePairBigd
{
	private BigDecimal value;
	private int index;
	
	public IndexValuePairBigd() { }
	
	public IndexValuePairBigd(BigDecimal value, int index)
	{
		set(value, index);
	}
	
	public IndexValuePairBigd set(BigDecimal value, int index)
	{
		value(value);
		index(index);
		
		return this;
	}
	
	public IndexValuePairBigd index(int index)
	{
		this.index = index;
		
		return this;
	}
	
	public IndexValuePairBigd value(BigDecimal value)
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
