package org.barghos.api.core.collection;

public class IndexValuePair<T>
{
	private T value;
	private int index;
	
	public IndexValuePair() { }
	
	public IndexValuePair(T value, int index)
	{
		set(value, index);
	}
	
	public IndexValuePair<T> set(T value, int index)
	{
		value(value);
		index(index);
		
		return this;
	}
	
	public IndexValuePair<T> index(int index)
	{
		this.index = index;
		
		return this;
	}
	
	public IndexValuePair<T> value(T value)
	{
		this.value = value;
		
		return this;
	}
	
	public int index()
	{
		return this.index;
	}
	
	public T value()
	{
		return this.value;
	}
}
