package org.barghos.util.nullable.bigd;

import java.math.BigDecimal;

import java.util.Objects;

import org.barghos.util.nullable.NullableR;

public class NullableBigd implements NullableWBigd
{
	public BigDecimal value;
	public boolean hasValue;
	
	public NullableBigd()
	{
		setNull();
	}
	
	public NullableBigd(NullableRBigd value)
	{
		set(value);
	}
	
	public NullableBigd(NullableR<BigDecimal> value)
	{
		set(value);
	}
	
	public NullableBigd(BigDecimal value)
	{
		valueBigi(value);
	}
	
	@Override
	public BigDecimal valueBigd()
	{
		return this.value;
	}

	@Override
	public BigDecimal valueOrDefaultBigd(BigDecimal def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public BigDecimal valueOrDefaultBigd()
	{
		if(this.hasValue) return this.value;
		
		return BigDecimal.ZERO;
	}
	
	@Override
	public BigDecimal value()
	{
		return this.value;
	}
	
	@Override
	public BigDecimal valueOrDefault(BigDecimal def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public BigDecimal valueOrDefault()
	{
		if(this.hasValue) return this.value;
		
		return BigDecimal.ZERO;
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
	public NullableBigd valueBigi(BigDecimal value)
	{
		this.value = value;
		this.hasValue = true;
		
		return this;
	}

	@Override
	public NullableBigd value(BigDecimal value)
	{
		this.value = value;
		this.hasValue = true;
		
		return this;
	}
	
	@Override
	public NullableBigd set(NullableRBigd value)
	{
		this.hasValue = value.isNotNull();
		if(this.hasValue) this.value = value.valueBigd();
		
		return this;
	}
	
	@Override
	public NullableBigd set(NullableR<BigDecimal> value)
	{
		this.hasValue = value.isNotNull();
		if(this.hasValue) this.value = value.value();
		
		return this;
	}
	
	@Override
	public NullableBigd setNull()
	{
		this.value = BigDecimal.ZERO;
		this.hasValue = false;
		
		return this;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		
		if(obj instanceof NullableR<?> n)
		{
			return equals(n);
		}
		
		if(obj instanceof BigDecimal f)
		{
			return equalsValueBigd(f);
		}
		
		return false;
	}
	
	@Override
	public boolean equals(NullableRBigd obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		if(obj.isNotNull() != this.hasValue) return false;
		
		if(this.hasValue)
		{
			return obj.valueBigd() == this.value;
		}
		
		return true;
	}
	
	@Override
	public boolean equals(NullableR<?> obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		if(obj.isNotNull() != this.hasValue) return false;
		
		if(this.hasValue)
		{
			if(obj.value() instanceof BigDecimal f)
			{
				return f == this.value;
			}
			
			return false;
		}
		
		return true;
	}
	
	@Override
	public boolean equalsValueBigd(BigDecimal obj)
	{
		if(!this.hasValue) return false;
		
		return this.value == obj;
	}
	
	@Override
	public boolean equalsValue(BigDecimal obj)
	{
		if(!this.hasValue) return false;
		
		return this.value == obj;
	}
	
	public int hashCode()
	{
		return Objects.hash(this.hasValue, this.value);
	}
	
	public String toString()
	{
		return "nullableBigd(" + (this.hasValue ? this.value : "null") + ")";
	}
}
