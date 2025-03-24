package org.barghos.util.nullable.shorts;

import java.util.Objects;

import org.barghos.util.nullable.NullableR;

public class NullableS implements NullableWS
{
	public short value;
	public boolean isNotNull;
	
	public NullableS()
	{
		setNull();
	}
	
	public NullableS(NullableRS value)
	{
		set(value);
	}
	
	public NullableS(NullableR<Short> value)
	{
		set(value);
	}
	
	public NullableS(short value)
	{
		valueS(value);
	}
	
	public NullableS(Short value)
	{
		value(value);
	}
	
	@Override
	public short valueS()
	{
		return this.value;
	}

	@Override
	public Short value()
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
	public NullableS valueS(short value)
	{
		this.value = value;
		this.isNotNull = true;
		
		return this;
	}

	@Override
	public NullableS value(Short value)
	{
		this.value = value;
		this.isNotNull = true;
		
		return this;
	}
	
	@Override
	public NullableS set(NullableRS value)
	{
		this.isNotNull = value.isNotNull();
		if(this.isNotNull) this.value = value.valueS();
		
		return this;
	}
	
	@Override
	public NullableS set(NullableR<Short> value)
	{
		this.isNotNull = value.isNotNull();
		if(this.isNotNull) this.value = value.value();
		
		return this;
	}
	
	@Override
	public NullableS setNull()
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
		
		if(obj instanceof Short f)
		{
			return equalsValueS(f);
		}
		
		return false;
	}
	
	@Override
	public boolean equals(NullableRS obj)
	{
		if(obj == null) return !this.isNotNull;
		if(obj == this) return true;
		if(obj.isNotNull() != this.isNotNull) return false;
		
		if(this.isNotNull)
		{
			return obj.valueS() == this.value;
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
			if(obj.value() instanceof Short f)
			{
				return f == this.value;
			}
			
			return false;
		}
		
		return true;
	}
	
	@Override
	public boolean equalsValueS(short obj)
	{
		if(!this.isNotNull) return false;
		
		return this.value == obj;
	}
	
	@Override
	public boolean equalsValue(Short obj)
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
		return "nullableS(" + (this.isNotNull ? this.value : "null") + ")";
	}
	
}
