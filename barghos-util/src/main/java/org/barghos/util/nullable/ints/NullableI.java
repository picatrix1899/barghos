package org.barghos.util.nullable.ints;

import java.util.Objects;

import org.barghos.util.nullable.NullableR;

public class NullableI implements NullableWI
{
	public int value;
	public boolean hasValue;
	
	public NullableI()
	{
		setNull();
	}
	
	public NullableI(NullableRI value)
	{
		set(value);
	}
	
	public NullableI(NullableR<Integer> value)
	{
		set(value);
	}
	
	public NullableI(int value)
	{
		valueI(value);
	}
	
	public NullableI(Integer value)
	{
		value(value);
	}
	
	@Override
	public int valueI()
	{
		return this.value;
	}

	@Override
	public int valueOrDefaultI(int def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public int valueOrDefaultI()
	{
		if(this.hasValue) return this.value;
		
		return 0;
	}
	
	@Override
	public Integer value()
	{
		return this.value;
	}
	
	@Override
	public Integer valueOrDefault(Integer def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public Integer valueOrDefault()
	{
		if(this.hasValue) return this.value;
		
		return 0;
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
	public NullableI valueI(int value)
	{
		this.value = value;
		this.hasValue = true;
		
		return this;
	}

	@Override
	public NullableI value(Integer value)
	{
		this.value = value;
		this.hasValue = true;
		
		return this;
	}
	
	@Override
	public NullableI set(NullableRI value)
	{
		this.hasValue = value.isNotNull();
		if(this.hasValue) this.value = value.valueI();
		
		return this;
	}
	
	@Override
	public NullableI set(NullableR<Integer> value)
	{
		this.hasValue = value.isNotNull();
		if(this.hasValue) this.value = value.value();
		
		return this;
	}
	
	@Override
	public NullableI setNull()
	{
		this.value = 0;
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
		
		if(obj instanceof Integer f)
		{
			return equalsValueI(f);
		}
		
		return false;
	}
	
	@Override
	public boolean equals(NullableRI obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		if(obj.isNotNull() != this.hasValue) return false;
		
		if(this.hasValue)
		{
			return obj.valueI() == this.value;
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
			if(obj.value() instanceof Integer f)
			{
				return f == this.value;
			}
			
			return false;
		}
		
		return true;
	}
	
	@Override
	public boolean equalsValueI(int obj)
	{
		if(!this.hasValue) return false;
		
		return this.value == obj;
	}
	
	@Override
	public boolean equalsValue(Integer obj)
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
		return "nullableI(" + (this.hasValue ? this.value : "null") + ")";
	}
	
}
