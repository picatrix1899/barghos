package org.barghos.util.nullable.floats;

import org.barghos.util.nullable.NullableR;

public interface NullableRF extends NullableR<Float>
{
	
	float valueF();
	default Float value()
	{
		return valueF();
	}
	
	boolean equals(NullableRF obj);
	
	default boolean equalsValue(Float obj)
	{
		return equalsValueF(obj);
	}
	
	boolean equalsValueF(float obj);
	
}
