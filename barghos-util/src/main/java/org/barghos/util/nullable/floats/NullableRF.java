package org.barghos.util.nullable.floats;

import org.barghos.util.nullable.NullableR;

public interface NullableRF extends NullableR<Float>
{
	
	float valueF();
	
	float valueOrDefaultF(float def);
	
	float valueOrDefaultF();
	
	@Override
	Float value();
	
	@Override
	Float valueOrDefault(Float def);
	
	@Override
	Float valueOrDefault();
	
	boolean equals(NullableRF obj);
	
	boolean equalsValueF(float obj);
	
	boolean equalsValue(Float obj);
	
}
