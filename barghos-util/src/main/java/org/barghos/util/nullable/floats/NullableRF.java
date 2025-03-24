package org.barghos.util.nullable.floats;

import org.barghos.util.nullable.NullableR;

public interface NullableRF extends NullableR<Float>
{
	
	float valueF();
	
	Float value();
	
	boolean equals(NullableRF obj);
	
	boolean equalsValueF(float obj);
	
	boolean equalsValue(Float obj);
	
}
