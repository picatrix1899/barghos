package org.barghos.util.nullable.longs;

import java.util.Objects;

import org.barghos.util.nullable.NullableR;

public class NullableL implements NullableWL
{
	public long value;
	public boolean hasValue;
	
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
	public long valueOrDefaultL(long def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public long valueOrDefaultL()
	{
		if(this.hasValue) return this.value;
		
		return 0l;
	}
	
	@Override
	public Long value()
	{
		return this.value;
	}
	
	@Override
	public Long valueOrDefault(Long def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public Long valueOrDefault()
	{
		if(this.hasValue) return this.value;
		
		return 0l;
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
	public NullableL valueI(long value)
	{
		this.value = value;
		this.hasValue = true;
		
		return this;
	}

	@Override
	public NullableL value(Long value)
	{
		this.value = value;
		this.hasValue = true;
		
		return this;
	}
	
	@Override
	public NullableL set(NullableRL value)
	{
		this.hasValue = value.isNotNull();
		if(this.hasValue) this.value = value.valueL();
		
		return this;
	}
	
	@Override
	public NullableL set(NullableR<Long> value)
	{
		this.hasValue = value.isNotNull();
		if(this.hasValue) this.value = value.value();
		
		return this;
	}

	@Override
	public NullableL setNull()
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
		
		if(obj instanceof Long f)
		{
			return equalsValueL(f);
		}
		
		return false;
	}
	
	@Override
	public boolean equals(NullableRL obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		if(obj.isNotNull() != this.hasValue) return false;
		
		if(this.hasValue)
		{
			return obj.valueL() == this.value;
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
		if(!this.hasValue) return false;
		
		return this.value == obj;
	}
	
	@Override
	public boolean equalsValue(Long obj)
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
		return "nullableL(" + (this.hasValue ? this.value : "null") + ")";
	}
	
}
