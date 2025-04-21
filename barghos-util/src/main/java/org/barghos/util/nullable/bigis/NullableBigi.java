package org.barghos.util.nullable.bigis;

import java.math.BigInteger;
import java.util.Objects;

import org.barghos.util.nullable.NullableR;

public class NullableBigi implements NullableWBigi
{
	public BigInteger value;
	public boolean hasValue;
	
	public NullableBigi()
	{
		setNull();
	}
	
	public NullableBigi(NullableRBigi value)
	{
		set(value);
	}
	
	public NullableBigi(NullableR<BigInteger> value)
	{
		set(value);
	}
	
	public NullableBigi(BigInteger value)
	{
		valueBigi(value);
	}
	
	@Override
	public BigInteger valueBigi()
	{
		return this.value;
	}

	@Override
	public BigInteger valueOrDefaultBigi(BigInteger def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public BigInteger valueOrDefaultBigi()
	{
		if(this.hasValue) return this.value;
		
		return BigInteger.ZERO;
	}
	
	@Override
	public BigInteger value()
	{
		return this.value;
	}
	
	@Override
	public BigInteger valueOrDefault(BigInteger def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public BigInteger valueOrDefault()
	{
		if(this.hasValue) return this.value;
		
		return BigInteger.ZERO;
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
	public NullableBigi valueBigi(BigInteger value)
	{
		this.value = value;
		this.hasValue = true;
		
		return this;
	}

	@Override
	public NullableBigi value(BigInteger value)
	{
		this.value = value;
		this.hasValue = true;
		
		return this;
	}
	
	@Override
	public NullableBigi set(NullableRBigi value)
	{
		this.hasValue = value.isNotNull();
		if(this.hasValue) this.value = value.valueBigi();
		
		return this;
	}
	
	@Override
	public NullableBigi set(NullableR<BigInteger> value)
	{
		this.hasValue = value.isNotNull();
		if(this.hasValue) this.value = value.value();
		
		return this;
	}
	
	@Override
	public NullableBigi setNull()
	{
		this.value = BigInteger.ZERO;
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
		
		if(obj instanceof BigInteger f)
		{
			return equalsValueBigi(f);
		}
		
		return false;
	}
	
	@Override
	public boolean equals(NullableRBigi obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		if(obj.isNotNull() != this.hasValue) return false;
		
		if(this.hasValue)
		{
			return obj.valueBigi() == this.value;
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
			if(obj.value() instanceof BigInteger f)
			{
				return f == this.value;
			}
			
			return false;
		}
		
		return true;
	}
	
	@Override
	public boolean equalsValueBigi(BigInteger obj)
	{
		if(!this.hasValue) return false;
		
		return this.value == obj;
	}
	
	@Override
	public boolean equalsValue(BigInteger obj)
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
		return "nullableBigi(" + (this.hasValue ? this.value : "null") + ")";
	}
}
