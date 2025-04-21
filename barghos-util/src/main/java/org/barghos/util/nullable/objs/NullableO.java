package org.barghos.util.nullable.objs;

import java.util.Objects;

import org.barghos.util.nullable.NullableR;

public class NullableO implements NullableWO
{
	public Object value;
	public boolean hasValue;
	
	public NullableO()
	{
		setNull();
	}
	
	public NullableO(NullableRO value)
	{
		set(value);
	}
	
	public NullableO(NullableR<Object> value)
	{
		set(value);
	}
	
	public NullableO(Object value)
	{
		valueStr(value);
	}
	
	@Override
	public Object valueStr()
	{
		return this.value;
	}

	@Override
	public Object valueOrDefaultStr(Object def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public Object valueOrDefaultStr()
	{
		if(this.hasValue) return this.value;
		
		return "";
	}
	
	@Override
	public Object value()
	{
		return this.value;
	}
	
	@Override
	public Object valueOrDefault(Object def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public Object valueOrDefault()
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
	public NullableO valueStr(Object value)
	{
		this.value = value;
		this.hasValue = true;
		
		return this;
	}

	@Override
	public NullableO value(Object value)
	{
		this.value = value;
		this.hasValue = true;
		
		return this;
	}
	
	@Override
	public NullableO set(NullableRO value)
	{
		this.hasValue = value.isNotNull();
		if(this.hasValue) this.value = value.valueStr();
		
		return this;
	}
	
	@Override
	public NullableO set(NullableR<Object> value)
	{
		this.hasValue = value.isNotNull();
		if(this.hasValue) this.value = value.value();
		
		return this;
	}
	
	@Override
	public NullableO setNull()
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
	public boolean equals(NullableRO obj)
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
			if(obj.value() instanceof Object f)
			{
				return f == this.value;
			}
			
			return false;
		}
		
		return true;
	}
	
	@Override
	public boolean equalsValueStr(Object obj)
	{
		if(!this.hasValue) return false;
		
		return this.value == obj;
	}
	
	@Override
	public boolean equalsValue(Object obj)
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
		return "nullableO(" + (this.hasValue ? this.value : "null") + ")";
	}
}
