package org.barghos.validation.internal;

import java.io.Serializable;

public final class Nullable<T> implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private T value;
	private boolean isSet;
	
	public Nullable()
	{
		reset();
	}
	
	public Nullable(T value)
	{
		set(value);
	}
	
	public Nullable<T> set(T value)
	{
		this.value = value;
		this.isSet = true;
		
		return this;
	}
	
	public Nullable<T> reset()
	{
		this.value = null;
		this.isSet = false;
		
		return this;
	}
	
	public T value()
	{
		return this.value;
	}
	
	public boolean isSet()
	{
		return this.isSet;
	}
}
