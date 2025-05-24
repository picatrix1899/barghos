package org.barghos.util.nullable.doubles;

import java.io.Serializable;
import java.util.Objects;

import org.barghos.annotation.AllowNull;

public class NullableD implements INullableWD, Serializable
{
	private static final long serialVersionUID = 1L;
	
	private double value;
	private boolean hasValue;
	
	public NullableD()
	{
		setNull();
	}
	
	public NullableD(@AllowNull INullableRD value)
	{
		set(value);
	}

	public NullableD(double value)
	{
		value(value);
	}
	
	public NullableD(@AllowNull Double value)
	{
		value(value);
	}
	
	@Override
	public double value()
	{
		return this.value;
	}

	@Override
	public double valueOrDefault(double def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public double valueOrDefault()
	{
		if(this.hasValue) return this.value;
		
		return 0.0;
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
	public NullableD value(double value)
	{
		this.value = value;
		this.hasValue = true;
		
		return this;
	}

	@Override
	public NullableD value(@AllowNull Double value)
	{
		this.hasValue = value != null;
		this.value = this.hasValue ? value : 0.0;

		return this;
	}
	
	@Override
	public NullableD set(@AllowNull INullableRD value)
	{
		this.hasValue = value != null && value.isNotNull();
		this.value = this.hasValue ? value.value() : 0.0;
		
		return this;
	}

	@Override
	public NullableD setNull()
	{
		this.value = 0.0;
		this.hasValue = false;
		
		return this;
	}
	
	@Override
	public boolean equals(@AllowNull Object obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		
		if(obj instanceof INullableRD n) return equals(n);
		
		if(obj instanceof Double val) return equals(val);
		
		return false;
	}
	
	@Override
	public boolean equals(@AllowNull INullableRD obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		if(obj.isNotNull() != this.hasValue) return false;
		
		if(this.hasValue) return obj.value() == this.value;
		
		return true;
	}
	
	@Override
	public boolean equals(double obj)
	{
		if(!this.hasValue) return false;
		
		return this.value == obj;
	}
	
	@Override
	public boolean equals(@AllowNull Double obj)
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
		return "double?(" + (this.hasValue ? this.value : "null") + ")";
	}
}
