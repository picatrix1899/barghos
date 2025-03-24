package org.barghos.util.nullable.ints;

import java.util.Objects;

import org.barghos.util.nullable.NullableR;

public class NullableI implements NullableWI
{
	public int value;
	public boolean isNotNull;
	
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
	public Integer value()
	{
		return this.value;
	}
	
	@Override
	public boolean isNull()
	{
		return !this.isNotNull;
	}

	@Override
	public boolean isNotNull()
	{
		return this.isNotNull;
	}
	
	@Override
	public NullableI valueI(int value)
	{
		this.value = value;
		this.isNotNull = true;
		
		return this;
	}

	@Override
	public NullableI value(Integer value)
	{
		this.value = value;
		this.isNotNull = true;
		
		return this;
	}
	
	@Override
	public NullableI set(NullableRI value)
	{
		this.isNotNull = value.isNotNull();
		if(this.isNotNull) this.value = value.valueI();
		
		return this;
	}
	
	@Override
	public NullableI set(NullableR<Integer> value)
	{
		this.isNotNull = value.isNotNull();
		if(this.isNotNull) this.value = value.value();
		
		return this;
	}
	
	@Override
	public NullableI setNull()
	{
		this.value = 0;
		this.isNotNull = false;
		
		return this;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj == null) return !this.isNotNull;
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
		if(obj == null) return !this.isNotNull;
		if(obj == this) return true;
		if(obj.isNotNull() != this.isNotNull) return false;
		
		if(this.isNotNull)
		{
			return obj.valueI() == this.value;
		}
		
		return true;
	}
	
	@Override
	public boolean equals(NullableR<?> obj)
	{
		if(obj == null) return !this.isNotNull;
		if(obj == this) return true;
		if(obj.isNotNull() != this.isNotNull) return false;
		
		if(this.isNotNull)
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
		if(!this.isNotNull) return false;
		
		return this.value == obj;
	}
	
	@Override
	public boolean equalsValue(Integer obj)
	{
		if(!this.isNotNull) return false;
		
		return this.value == obj;
	}
	
	public int hashCode()
	{
		return Objects.hash(this.isNotNull, this.value);
	}
	
	public String toString()
	{
		return "nullableI(" + (this.isNotNull ? this.value : "null") + ")";
	}
	
}
