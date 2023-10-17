package org.barghos.util.collection;;


public class FloatIndexValuePair
{
	private float value;
	private int index;
	
	public FloatIndexValuePair() { }
	
	public FloatIndexValuePair(float value, int index)
	{
		set(value, index);
	}
	
	public FloatIndexValuePair set(float value, int index)
	{
		value(value);
		index(index);
		
		return this;
	}
	
	public FloatIndexValuePair index(int index)
	{
		this.index = index;
		
		return this;
	}
	
	public FloatIndexValuePair value(float value)
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
