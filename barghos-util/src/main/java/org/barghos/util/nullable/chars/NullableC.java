package org.barghos.util.nullable.chars;

import java.util.Objects;

import org.barghos.util.nullable.NullableR;

public class NullableC implements NullableWC
{
	public char value;
	public boolean isNotNull;
	
	public NullableC()
	{
		setNull();
	}
	
	public NullableC(NullableRC value)
	{
		set(value);
	}
	
	public NullableC(NullableR<Character> value)
	{
		set(value);
	}
	
	public NullableC(char value)
	{
		valueC(value);
	}
	
	public NullableC(Character value)
	{
		value(value);
	}
	
	@Override
	public char valueC()
	{
		return this.value;
	}

	@Override
	public Character value()
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
	public NullableC valueC(char value)
	{
		this.value = value;
		this.isNotNull = true;
		
		return this;
	}

	@Override
	public NullableC value(Character value)
	{
		this.value = value;
		this.isNotNull = true;
		
		return this;
	}
	
	@Override
	public NullableC set(NullableRC value)
	{
		this.isNotNull = value.isNotNull();
		if(this.isNotNull) this.value = value.valueC();
		
		return this;
	}
	
	@Override
	public NullableC set(NullableR<Character> value)
	{
		this.isNotNull = value.isNotNull();
		if(this.isNotNull) this.value = value.value();
		
		return this;
	}
	
	@Override
	public NullableC setNull()
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
		
		if(obj instanceof Character f)
		{
			return equalsValueC(f);
		}
		
		return false;
	}
	
	@Override
	public boolean equals(NullableRC obj)
	{
		if(obj == null) return !this.isNotNull;
		if(obj == this) return true;
		if(obj.isNotNull() != this.isNotNull) return false;
		
		if(this.isNotNull)
		{
			return obj.valueC() == this.value;
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
			if(obj.value() instanceof Character f)
			{
				return f == this.value;
			}
			
			return false;
		}
		
		return true;
	}
	
	@Override
	public boolean equalsValueC(char obj)
	{
		if(!this.isNotNull) return false;
		
		return this.value == obj;
	}
	
	@Override
	public boolean equalsValue(Character obj)
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
		return "nullableC(" + (this.isNotNull ? this.value : "null") + ")";
	}
	
}
