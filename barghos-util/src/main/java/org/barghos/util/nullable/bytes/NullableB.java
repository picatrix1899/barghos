package org.barghos.util.nullable.bytes;

import java.util.Objects;

import org.barghos.util.nullable.NullableR;

public class NullableB implements NullableWB
{
	public byte value;
	public boolean isNotNull;
	
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
	public Byte value()
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
	public NullableB valueB(byte value)
	{
		this.value = value;
		this.isNotNull = true;
		
		return this;
	}

	@Override
	public NullableB value(Byte value)
	{
		this.value = value;
		this.isNotNull = true;
		
		return this;
	}
	
	@Override
	public NullableB set(NullableRB value)
	{
		this.isNotNull = value.isNotNull();
		if(this.isNotNull) this.value = value.valueB();
		
		return this;
	}
	
	@Override
	public NullableB set(NullableR<Byte> value)
	{
		this.isNotNull = value.isNotNull();
		if(this.isNotNull) this.value = value.value();
		
		return this;
	}
	
	@Override
	public NullableB setNull()
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
		
		if(obj instanceof Byte f)
		{
			return equalsValueB(f);
		}
		
		return false;
	}
	
	@Override
	public boolean equals(NullableRB obj)
	{
		if(obj == null) return !this.isNotNull;
		if(obj == this) return true;
		if(obj.isNotNull() != this.isNotNull) return false;
		
		if(this.isNotNull)
		{
			return obj.valueB() == this.value;
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
		if(!this.isNotNull) return false;
		
		return this.value == obj;
	}
	
	@Override
	public boolean equalsValue(Byte obj)
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
		return "nullableB(" + (this.isNotNull ? this.value : "null") + ")";
	}
	
}
