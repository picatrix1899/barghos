package org.barghos.util.nullable.floats;

import java.util.Objects;

import org.barghos.util.nullable.NullableR;

public class NullableF implements NullableWF
{
	public float value;
	public boolean isNotNull;
	
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
	public Float value()
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
	public NullableF valueF(float value)
	{
		this.value = value;
		this.isNotNull = true;
		
		return this;
	}

	@Override
	public NullableF value(Float value)
	{
		this.value = value;
		this.isNotNull = true;
		
		return this;
	}
	
	@Override
	public NullableF set(NullableRF value)
	{
		this.isNotNull = value.isNotNull();
		if(this.isNotNull) this.value = value.valueF();
		
		return this;
	}
	
	@Override
	public NullableF set(NullableR<Float> value)
	{
		this.isNotNull = value.isNotNull();
		if(this.isNotNull) this.value = value.value();
		
		return this;
	}

	@Override
	public NullableF setNull()
	{
		this.value = 0.0f;
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
		
		if(obj instanceof Float f)
		{
			return equalsValueF(f);
		}
		
		return false;
	}
	
	@Override
	public boolean equals(NullableRF obj)
	{
		if(obj == null) return !this.isNotNull;
		if(obj == this) return true;
		if(obj.isNotNull() != this.isNotNull) return false;
		
		if(this.isNotNull)
		{
			return obj.valueF() == this.value;
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
		if(!this.isNotNull) return false;
		
		return this.value == obj;
	}
	
	@Override
	public boolean equalsValue(Float obj)
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
		return "nullableF(" + (this.isNotNull ? this.value : "null") + ")";
	}
	
}
