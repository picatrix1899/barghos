package org.barghos.util.nullable.floats;

import java.io.Serializable;
import java.util.Objects;

import org.barghos.annotation.AllowNull;

public class NullableF implements INullableWF, Serializable
{
	private static final long serialVersionUID = 1L;
	
	private float value;
	private boolean hasValue;
	
	public NullableF()
	{
		setNull();
	}
	
	public NullableF(@AllowNull INullableRF value)
	{
		set(value);
	}

	public NullableF(int value)
	{
		value(value);
	}
	
	public NullableF(@AllowNull Float value)
	{
		value(value);
	}
	
	@Override
	public float value()
	{
		return this.value;
	}

	@Override
	public float valueOrDefault(float def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public float valueOrDefault()
	{
		if(this.hasValue) return this.value;
		
		return 0.0f;
	}
	
	@Override
	public boolean isNull()
	{
		return !this.hasValue;
	}

	@Override
	public boolean isNotNull()
	{
		return this.hasValue;
	}
	
	@Override
	public NullableF value(float value)
	{
		this.value = value;
		this.hasValue = true;
		
		return this;
	}

	@Override
	public NullableF value(@AllowNull Float value)
	{
		this.hasValue = value != null;
		this.value = this.hasValue ? value : 0.0f;

		return this;
	}
	
	@Override
	public NullableF set(@AllowNull INullableRF value)
	{
		this.hasValue = value != null && value.isNotNull();
		this.value = this.hasValue ? value.value() : 0.0f;
		
		return this;
	}

	@Override
	public NullableF setNull()
	{
		this.value = 0.0f;
		this.hasValue = false;
		
		return this;
	}
	
	@Override
	public boolean equals(@AllowNull Object obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		
		if(obj instanceof INullableRF n) return equals(n);
		
		if(obj instanceof Float val) return equals(val);
		
		return false;
	}
	
	@Override
	public boolean equals(@AllowNull INullableRF obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		if(obj.isNotNull() != this.hasValue) return false;
		
		if(this.hasValue) return obj.value() == this.value;
		
		return true;
	}
	
	@Override
	public boolean equals(float obj)
	{
		if(!this.hasValue) return false;
		
		return this.value == obj;
	}
	
	@Override
	public boolean equals(@AllowNull Float obj)
	{
		if(!this.hasValue && obj == null) return true;
		if(!this.hasValue) return false;
		
		return this.value == obj;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(this.hasValue, this.value);
	}
	
	@Override
	public String toString()
	{
		return "float?(" + (this.hasValue ? this.value : "null") + ")";
	}
}
