package org.barghos.util.nullable.floats;

import java.util.Objects;

import org.barghos.util.nullable.NullableR;

public class NullableF implements NullableWF
{
	public float value;
	public boolean hasValue;
	
	public NullableF()
	{
		setNull();
	}
	
	public NullableF(NullableRF value)
	{
		set(value);
	}
	
	public NullableF(NullableR<Float> value)
	{
		set(value);
	}
	
	public NullableF(float value)
	{
		valueF(value);
	}
	
	public NullableF(Float value)
	{
		value(value);
	}
	
	@Override
	public float valueF()
	{
		return this.value;
	}

	@Override
	public float valueOrDefaultF(float def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public float valueOrDefaultF()
	{
		if(this.hasValue) return this.value;
		
		return 0;
	}
	
	@Override
	public Float value()
	{
		return this.value;
	}
	
	@Override
	public Float valueOrDefault(Float def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public Float valueOrDefault()
	{
		if(this.hasValue) return this.value;
		
		return 0.0f;
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
	public NullableF valueF(float value)
	{
		this.value = value;
		this.hasValue = true;
		
		return this;
	}

	@Override
	public NullableF value(Float value)
	{
		this.value = value;
		this.hasValue = true;
		
		return this;
	}
	
	@Override
	public NullableF set(NullableRF value)
	{
		this.hasValue = value.isNotNull();
		if(this.hasValue) this.value = value.valueF();
		
		return this;
	}
	
	@Override
	public NullableF set(NullableR<Float> value)
	{
		this.hasValue = value.isNotNull();
		if(this.hasValue) this.value = value.value();
		
		return this;
	}

	@Override
	public NullableF setNull()
	{
		this.value = 0.0f;
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
		
		if(obj instanceof Float f)
		{
			return equalsValueF(f);
		}
		
		return false;
	}
	
	@Override
	public boolean equals(NullableRF obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		if(obj.isNotNull() != this.hasValue) return false;
		
		if(this.hasValue)
		{
			return obj.valueF() == this.value;
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
			if(obj.value() instanceof Float f)
			{
				return f == this.value;
			}
			
			return false;
		}
		
		return true;
	}
	
	@Override
	public boolean equalsValueF(float obj)
	{
		if(!this.hasValue) return false;
		
		return this.value == obj;
	}
	
	@Override
	public boolean equalsValue(Float obj)
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
		return "nullableF(" + (this.hasValue ? this.value : "null") + ")";
	}
	
}
