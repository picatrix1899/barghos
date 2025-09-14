package org.barghos.impl.core.nullable.strings;

import java.io.Serializable;
import java.util.Objects;

import org.barghos.annotation.AllowNull;
import org.barghos.api.core.nullable.strings.INullableRStr;
import org.barghos.api.core.nullable.strings.INullableWStr;

public class NullableStr implements INullableWStr, Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String value;
	private boolean hasValue;
	
	public NullableStr()
	{
		setNull();
	}
	
	public NullableStr(@AllowNull INullableRStr value)
	{
		set(value);
	}

	public NullableStr(@AllowNull String value)
	{
		value(value);
	}
	
	@Override
	public String value()
	{
		return this.value;
	}

	@Override
	public String valueOrDefault(@AllowNull String def)
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
	public NullableStr value(@AllowNull String value)
	{
		this.hasValue = value != null;
		this.value = this.hasValue ? value : "";

		return this;
	}
	
	@Override
	public NullableStr set(@AllowNull INullableRStr value)
	{
		this.hasValue = value != null && value.isNotNull();
		this.value = this.hasValue ? value.value() : "";
		
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
	public boolean equals(@AllowNull Object obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		
		if(obj instanceof INullableRStr n) return equals(n);
		
		if(obj instanceof String val) return equals(val);
		
		return false;
	}
	
	@Override
	public boolean equals(@AllowNull INullableRStr obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		if(obj.isNotNull() != this.hasValue) return false;
		
		if(this.hasValue) return this.value.equals(obj.value());
		
		return true;
	}
	
	@Override
	public boolean equals(@AllowNull String obj)
	{
		if(!this.hasValue && obj == null) return true;
		if(!this.hasValue) return false;

		return this.value.equals(obj);
	}
	
	@Override
	public boolean equalsIgnoreCase(@AllowNull String obj)
	{
		if(!this.hasValue && obj == null) return true;
		if(!this.hasValue) return false;
		
		return this.value.equalsIgnoreCase(obj);
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(this.hasValue, this.value);
	}
	
	@Override
	public String toString()
	{
		return "String?(" + (this.hasValue ? this.value : "null") + ")";
	}
	
}
