package org.barghos.util.nullable.bools;

import java.util.Objects;

import org.barghos.util.nullable.NullableR;

public class NullableBo implements NullableWBo
{
	public boolean value;
	public boolean isNotNull;
	
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
	public Boolean value()
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
	public NullableBo valueBo(boolean value)
	{
		this.value = value;
		this.isNotNull = true;
		
		return this;
	}

	@Override
	public NullableBo value(Boolean value)
	{
		this.value = value;
		this.isNotNull = true;
		
		return this;
	}
	
	@Override
	public NullableBo set(NullableRBo value)
	{
		this.isNotNull = value.isNotNull();
		if(this.isNotNull) this.value = value.valueBo();
		
		return this;
	}
	
	@Override
	public NullableBo set(NullableR<Boolean> value)
	{
		this.isNotNull = value.isNotNull();
		if(this.isNotNull) this.value = value.value();
		
		return this;
	}
	
	@Override
	public NullableBo setNull()
	{
		this.value = false;
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
		
		if(obj instanceof Boolean f)
		{
			return equalsValueBo(f);
		}
		
		return false;
	}
	
	@Override
	public boolean equals(NullableRBo obj)
	{
		if(obj == null) return !this.isNotNull;
		if(obj == this) return true;
		if(obj.isNotNull() != this.isNotNull) return false;
		
		if(this.isNotNull)
		{
			return obj.valueBo() == this.value;
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
		if(!this.isNotNull) return false;
		
		return this.value == obj;
	}
	
	@Override
	public boolean equalsValue(Boolean obj)
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
		return "nullableBo(" + (this.isNotNull ? this.value : "null") + ")";
	}
	
}
