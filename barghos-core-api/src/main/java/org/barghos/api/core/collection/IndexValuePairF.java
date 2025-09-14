package org.barghos.api.core.collection;

public class IndexValuePairF
{
	private float value;
	private int index;
	
	public IndexValuePairF() { }
	
	public IndexValuePairF(float value, int index)
	{
		set(value, index);
	}
	
	public IndexValuePairF set(float value, int index)
	{
		value(value);
		index(index);
		
		return this;
	}
	
	public IndexValuePairF index(int index)
	{
		this.index = index;
		
		return this;
	}
	
	public IndexValuePairF value(float value)
	{
		this.value = value;
		
		return this;
	}
	
	public int index()
	{
		return this.index;
	}
	
	public float value()
	{
		return this.value;
	}
}
