package org.barghos.util.nullable.doubles;

import java.util.Objects;

import org.barghos.util.nullable.NullableR;

public class NullableD implements NullableWD
{
	public double value;
	public boolean isNotNull;
	
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
	public Double value()
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
	public NullableD valueD(double value)
	{
		this.value = value;
		this.isNotNull = true;
		
		return this;
	}

	@Override
	public NullableD value(Double value)
	{
		this.value = value;
		this.isNotNull = true;
		
		return this;
	}
	
	@Override
	public NullableD set(NullableRD value)
	{
		this.isNotNull = value.isNotNull();
		if(this.isNotNull) this.value = value.valueD();
		
		return this;
	}
	
	@Override
	public NullableD set(NullableR<Double> value)
	{
		this.isNotNull = value.isNotNull();
		if(this.isNotNull) this.value = value.value();
		
		return this;
	}
	
	@Override
	public NullableD setNull()
	{
		this.value = 0.0;
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
		
		if(obj instanceof Double f)
		{
			return equalsValueD(f);
		}
		
		return false;
	}
	
	@Override
	public boolean equals(NullableRD obj)
	{
		if(obj == null) return !this.isNotNull;
		if(obj == this) return true;
		if(obj.isNotNull() != this.isNotNull) return false;
		
		if(this.isNotNull)
		{
			return obj.valueD() == this.value;
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
		if(!this.isNotNull) return false;
		
		return this.value == obj;
	}
	
	@Override
	public boolean equalsValue(Double obj)
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
		return "nullableD(" + (this.isNotNull ? this.value : "null") + ")";
	}
	
}
