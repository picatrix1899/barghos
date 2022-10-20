package org.barghos.math.api.util;


public class ComponentValueFloat
{
	private int component;
	private float value;
	
	public ComponentValueFloat(int component, float value)
	{
		set(component, value);
	}
	
	public void set(int component, float value)
	{
		this.component = component;
		this.value = value;
	}
	
	public int component()
	{
		return this.component;
	}
	
	public float value()
	{
		return this.value;
	}
}
