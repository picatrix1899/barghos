package org.barghos.util.nullable.strings;

import java.util.Objects;

import org.barghos.util.nullable.NullableR;

public class NullableStr implements NullableWStr
{
	public String value;
	public boolean hasValue;
	
	public NullableStr()
	{
		setNull();
	}
	
	public NullableStr(NullableRStr value)
	{
		set(value);
	}
	
	public NullableStr(NullableR<String> value)
	{
		set(value);
	}
	
	public NullableStr(String value)
	{
		valueStr(value);
	}
	
	@Override
	public String valueStr()
	{
		return this.value;
	}

	@Override
	public String valueOrDefaultStr(String def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public String valueOrDefaultStr()
	{
		if(this.hasValue) return this.value;
		
		return "";
	}
	
	@Override
	public String value()
	{
		return this.value;
	}
	
	@Override
	public String valueOrDefault(String def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public String valueOrDefault()
	{
		if(this.hasValue) return this.value;
		
		return "";
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
	public NullableStr valueStr(String value)
	{
		this.value = value;
		this.hasValue = true;
		
		return this;
	}

	@Override
	public NullableStr value(String value)
	{
		this.value = value;
		this.hasValue = true;
		
		return this;
	}
	
	@Override
	public NullableStr set(NullableRStr value)
	{
		this.hasValue = value.isNotNull();
		if(this.hasValue) this.value = value.valueStr();
		
		return this;
	}
	
	@Override
	public NullableStr set(NullableR<String> value)
	{
		this.hasValue = value.isNotNull();
		if(this.hasValue) this.value = value.value();
		
		return this;
	}
	
	@Override
	public NullableStr setNull()
	{
		this.value = "";
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
		
		if(obj instanceof String f)
		{
			return equalsValueStr(f);
		}
		
		return false;
	}
	
	@Override
	public boolean equals(NullableRStr obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		if(obj.isNotNull() != this.hasValue) return false;
		
		if(this.hasValue)
		{
			return obj.valueStr() == this.value;
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
			if(obj.value() instanceof String f)
			{
				return f == this.value;
			}
			
			return false;
		}
		
		return true;
	}
	
	@Override
	public boolean equalsValueStr(String obj)
	{
		if(!this.hasValue) return false;
		
		return this.value == obj;
	}
	
	@Override
	public boolean equalsValue(String obj)
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
		return "nullableStr(" + (this.hasValue ? this.value : "null") + ")";
	}
}
