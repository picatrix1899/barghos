package org.barghos.util.nullable.doubles;

import java.util.Objects;

import org.barghos.util.nullable.NullableR;

public class NullableD implements NullableWD
{
	public double value;
	public boolean hasValue;
	
	public NullableD()
	{
		setNull();
	}
	
	public NullableD(NullableRD value)
	{
		set(value);
	}
	
	public NullableD(NullableR<Double> value)
	{
		set(value);
	}
	
	public NullableD(double value)
	{
		valueD(value);
	}
	
	public NullableD(Double value)
	{
		value(value);
	}
	
	@Override
	public double valueD()
	{
		return this.value;
	}

	@Override
	public double valueOrDefaultD(double def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public double valueOrDefaultD()
	{
		if(this.hasValue) return this.value;
		
		return 0;
	}
	
	@Override
	public Double value()
	{
		return this.value;
	}
	
	@Override
	public Double valueOrDefault(Double def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public Double valueOrDefault()
	{
		if(this.hasValue) return this.value;
		
		return 0.0;
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
	public NullableD valueD(double value)
	{
		this.value = value;
		this.hasValue = true;
		
		return this;
	}

	@Override
	public NullableD value(Double value)
	{
		this.value = value;
		this.hasValue = true;
		
		return this;
	}
	
	@Override
	public NullableD set(NullableRD value)
	{
		this.hasValue = value.isNotNull();
		if(this.hasValue) this.value = value.valueD();
		
		return this;
	}
	
	@Override
	public NullableD set(NullableR<Double> value)
	{
		this.hasValue = value.isNotNull();
		if(this.hasValue) this.value = value.value();
		
		return this;
	}
	
	@Override
	public NullableD setNull()
	{
		this.value = 0.0;
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
		
		if(obj instanceof Double f)
		{
			return equalsValueD(f);
		}
		
		return false;
	}
	
	@Override
	public boolean equals(NullableRD obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		if(obj.isNotNull() != this.hasValue) return false;
		
		if(this.hasValue)
		{
			return obj.valueD() == this.value;
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
			if(obj.value() instanceof Double f)
			{
				return f == this.value;
			}
			
			return false;
		}
		
		return true;
	}
	
	@Override
	public boolean equalsValueD(double obj)
	{
		if(!this.hasValue) return false;
		
		return this.value == obj;
	}
	
	@Override
	public boolean equalsValue(Double obj)
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
		return "nullableD(" + (this.hasValue ? this.value : "null") + ")";
	}
	
}
