package org.barghos.util.nullable.longs;

import java.util.Objects;

import org.barghos.util.nullable.NullableR;

public class NullableL implements NullableWL
{
	public long value;
	public boolean isNotNull;
	
	public NullableL()
	{
		setNull();
	}
	
	public NullableL(NullableRL value)
	{
		set(value);
	}
	
	public NullableL(NullableR<Long> value)
	{
		set(value);
	}
	
	public NullableL(int value)
	{
		valueI(value);
	}
	
	public NullableL(Long value)
	{
		value(value);
	}
	
	@Override
	public long valueL()
	{
		return this.value;
	}

	@Override
	public Long value()
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
	public NullableL valueI(long value)
	{
		this.value = value;
		this.isNotNull = true;
		
		return this;
	}

	@Override
	public NullableL value(Long value)
	{
		this.value = value;
		this.isNotNull = true;
		
		return this;
	}
	
	@Override
	public NullableL set(NullableRL value)
	{
		this.isNotNull = value.isNotNull();
		if(this.isNotNull) this.value = value.valueL();
		
		return this;
	}
	
	@Override
	public NullableL set(NullableR<Long> value)
	{
		this.isNotNull = value.isNotNull();
		if(this.isNotNull) this.value = value.value();
		
		return this;
	}

	@Override
	public NullableL setNull()
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
		
		if(obj instanceof Long f)
		{
			return equalsValueL(f);
		}
		
		return false;
	}
	
	@Override
	public boolean equals(NullableRL obj)
	{
		if(obj == null) return !this.isNotNull;
		if(obj == this) return true;
		if(obj.isNotNull() != this.isNotNull) return false;
		
		if(this.isNotNull)
		{
			return obj.valueL() == this.value;
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
			if(obj.value() instanceof Long f)
			{
				return f == this.value;
			}
			
			return false;
		}
		
		return true;
	}
	
	@Override
	public boolean equalsValueL(long obj)
	{
		if(!this.isNotNull) return false;
		
		return this.value == obj;
	}
	
	@Override
	public boolean equalsValue(Long obj)
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
		return "nullableL(" + (this.isNotNull ? this.value : "null") + ")";
	}
	
}
