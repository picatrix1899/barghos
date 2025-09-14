package org.barghos.impl.core.nullable.bigd;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import org.barghos.annotation.AllowNull;
import org.barghos.api.core.nullable.bigd.INullableRBigd;
import org.barghos.api.core.nullable.bigd.INullableWBigd;

public class NullableBigd implements INullableWBigd, Serializable
{
	private static final long serialVersionUID = 1L;
	
	private BigDecimal value;
	private boolean hasValue;
	
	public NullableBigd()
	{
		setNull();
	}
	
	public NullableBigd(@AllowNull INullableRBigd value)
	{
		set(value);
	}

	public NullableBigd(@AllowNull BigDecimal value)
	{
		value(value);
	}
	
	@Override
	public BigDecimal value()
	{
		return this.value;
	}

	@Override
	public BigDecimal valueOrDefault(@AllowNull BigDecimal def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public BigDecimal valueOrDefault()
	{
		if(this.hasValue) return this.value;
		
		return null;
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
	public NullableBigd value(@AllowNull BigDecimal value)
	{
		this.hasValue = value != null;
		this.value = this.hasValue ? value : null;

		return this;
	}
	
	@Override
	public NullableBigd set(@AllowNull INullableRBigd value)
	{
		this.hasValue = value != null && value.isNotNull();
		this.value = this.hasValue ? value.value() : null;
		
		return this;
	}

	@Override
	public NullableBigd setNull()
	{
		this.value = null;
		this.hasValue = false;
		
		return this;
	}
	
	@Override
	public boolean equals(@AllowNull Object obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		
		if(obj instanceof INullableRBigd n) return equals(n);
		
		if(obj instanceof BigDecimal val) return equals(val);
		
		return this.value.equals(obj);
	}
	
	@Override
	public boolean equals(BigDecimal obj)
	{
		if(!this.hasValue) return false;
		
		return this.value.equals(obj);
	}
	
	@Override
	public boolean equals(@AllowNull INullableRBigd obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		if(obj.isNotNull() != this.hasValue) return false;
		
		if(this.hasValue)
		{
			return obj.value() == this.value;
		}
		
		return true;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(this.hasValue, this.value);
	}
	
	@Override
	public String toString()
	{
		return "BigDecimal?(" + (this.hasValue ? this.value : "null") + ")";
	}
}
