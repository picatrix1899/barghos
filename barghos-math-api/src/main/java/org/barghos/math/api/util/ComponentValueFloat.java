package org.barghos.math.api.util;


public class ComponentValueFloat
{
	private float value;
	private int index;
	
	public ComponentValueFloat() { }
	
	public ComponentValueFloat(float value, int index)
	{
		this.value = value;
		this.index = index;
	}
	
	public ComponentValueFloat set(float value, int index)
	{
		return setValue(value).setIndex(index);
	}
	
	public ComponentValueFloat setIndex(int index)
	{
		this.index = index;
		
		return this;
	}
	
	public ComponentValueFloat setValue(float value)
	{
		this.value = value;
		
		return this;
	}
	
	public int getComponentIndex()
	{
		return this.index;
	}
	
	public float getValue()
	{
		return this.value;
	}
}
