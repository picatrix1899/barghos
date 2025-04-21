package org.barghos.util.nullable.chars;

import java.util.Objects;

import org.barghos.util.nullable.NullableR;

public class NullableC implements NullableWC
{
	public char value;
	public boolean hasValue;
	
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
	public char valueOrDefaultC(char def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public char valueOrDefaultC()
	{
		if(this.hasValue) return this.value;
		
		return 0;
	}
	
	@Override
	public Character value()
	{
		return this.value;
	}
	
	@Override
	public Character valueOrDefault(Character def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public Character valueOrDefault()
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
	public NullableC valueC(char value)
	{
		this.value = value;
		this.hasValue = true;
		
		return this;
	}

	@Override
	public NullableC value(Character value)
	{
		this.value = value;
		this.hasValue = true;
		
		return this;
	}
	
	@Override
	public NullableC set(NullableRC value)
	{
		this.hasValue = value.isNotNull();
		if(this.hasValue) this.value = value.valueC();
		
		return this;
	}
	
	@Override
	public NullableC set(NullableR<Character> value)
	{
		this.hasValue = value.isNotNull();
		if(this.hasValue) this.value = value.value();
		
		return this;
	}
	
	@Override
	public NullableC setNull()
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
		
		if(obj instanceof Character f)
		{
			return equalsValueC(f);
		}
		
		return false;
	}
	
	@Override
	public boolean equals(NullableRC obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		if(obj.isNotNull() != this.hasValue) return false;
		
		if(this.hasValue)
		{
			return obj.valueC() == this.value;
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
		if(!this.hasValue) return false;
		
		return this.value == obj;
	}
	
	@Override
	public boolean equalsValue(Character obj)
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
		return "nullableC(" + (this.hasValue ? this.value : "null") + ")";
	}
	
}
