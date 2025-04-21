package org.barghos.util.nullable.bytes;

import java.util.Objects;

import org.barghos.util.nullable.NullableR;

public class NullableB implements NullableWB
{
	public byte value;
	public boolean hasValue;
	
	public NullableB()
	{
		setNull();
	}
	
	public NullableB(NullableRB value)
	{
		set(value);
	}
	
	public NullableB(NullableR<Byte> value)
	{
		set(value);
	}
	
	public NullableB(byte value)
	{
		valueB(value);
	}
	
	public NullableB(Byte value)
	{
		value(value);
	}
	
	@Override
	public byte valueB()
	{
		return this.value;
	}

	@Override
	public byte valueOrDefaultB(byte def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public byte valueOrDefaultB()
	{
		if(this.hasValue) return this.value;
		
		return 0;
	}
	
	@Override
	public Byte value()
	{
		return this.value;
	}
	
	@Override
	public Byte valueOrDefault(Byte def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public Byte valueOrDefault()
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
	public NullableB valueB(byte value)
	{
		this.value = value;
		this.hasValue = true;
		
		return this;
	}

	@Override
	public NullableB value(Byte value)
	{
		this.value = value;
		this.hasValue = true;
		
		return this;
	}
	
	@Override
	public NullableB set(NullableRB value)
	{
		this.hasValue = value.isNotNull();
		if(this.hasValue) this.value = value.valueB();
		
		return this;
	}
	
	@Override
	public NullableB set(NullableR<Byte> value)
	{
		this.hasValue = value.isNotNull();
		if(this.hasValue) this.value = value.value();
		
		return this;
	}
	
	@Override
	public NullableB setNull()
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
		
		if(obj instanceof Byte f)
		{
			return equalsValueB(f);
		}
		
		return false;
	}
	
	@Override
	public boolean equals(NullableRB obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		if(obj.isNotNull() != this.hasValue) return false;
		
		if(this.hasValue)
		{
			return obj.valueB() == this.value;
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
			if(obj.value() instanceof Byte f)
			{
				return f == this.value;
			}
			
			return false;
		}
		
		return true;
	}
	
	@Override
	public boolean equalsValueB(byte obj)
	{
		if(!this.hasValue) return false;
		
		return this.value == obj;
	}
	
	@Override
	public boolean equalsValue(Byte obj)
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
		return "nullableB(" + (this.hasValue ? this.value : "null") + ")";
	}
	
}
