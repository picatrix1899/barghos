package org.barghos.util.nullable.bools;

import java.util.Objects;

import org.barghos.util.nullable.NullableR;

public class NullableBo implements NullableWBo
{
	public boolean value;
	public boolean hasValue;
	
	public NullableBo()
	{
		setNull();
	}
	
	public NullableBo(NullableRBo value)
	{
		set(value);
	}
	
	public NullableBo(NullableR<Boolean> value)
	{
		set(value);
	}
	
	public NullableBo(boolean value)
	{
		valueBo(value);
	}
	
	public NullableBo(Boolean value)
	{
		value(value);
	}
	
	@Override
	public boolean valueBo()
	{
		return this.value;
	}

	@Override
	public boolean valueOrDefaultB(boolean def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public boolean valueOrDefaultB()
	{
		if(this.hasValue) return this.value;
		
		return false;
	}
	
	@Override
	public Boolean value()
	{
		return this.value;
	}
	
	@Override
	public Boolean valueOrDefault(Boolean def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public Boolean valueOrDefault()
	{
		if(this.hasValue) return this.value;
		
		return false;
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
	public NullableBo valueBo(boolean value)
	{
		this.value = value;
		this.hasValue = true;
		
		return this;
	}

	@Override
	public NullableBo value(Boolean value)
	{
		this.value = value;
		this.hasValue = true;
		
		return this;
	}
	
	@Override
	public NullableBo set(NullableRBo value)
	{
		this.hasValue = value.isNotNull();
		if(this.hasValue) this.value = value.valueBo();
		
		return this;
	}
	
	@Override
	public NullableBo set(NullableR<Boolean> value)
	{
		this.hasValue = value.isNotNull();
		if(this.hasValue) this.value = value.value();
		
		return this;
	}
	
	@Override
	public NullableBo setNull()
	{
		this.value = false;
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
		
		if(obj instanceof Boolean f)
		{
			return equalsValueBo(f);
		}
		
		return false;
	}
	
	@Override
	public boolean equals(NullableRBo obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		if(obj.isNotNull() != this.hasValue) return false;
		
		if(this.hasValue)
		{
			return obj.valueBo() == this.value;
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
			if(obj.value() instanceof Boolean f)
			{
				return f == this.value;
			}
			
			return false;
		}
		
		return true;
	}
	
	@Override
	public boolean equalsValueBo(boolean obj)
	{
		if(!this.hasValue) return false;
		
		return this.value == obj;
	}
	
	@Override
	public boolean equalsValue(Boolean obj)
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
		return "nullableBo(" + (this.hasValue ? this.value : "null") + ")";
	}
	
}
