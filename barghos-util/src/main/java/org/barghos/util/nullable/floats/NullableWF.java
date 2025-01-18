package org.barghos.util.nullable.floats;

import org.barghos.util.nullable.NullableR;
import org.barghos.util.nullable.NullableW;

public interface NullableWF extends NullableRF, NullableW<Float>
{
	
	NullableWF valueF(float value);
	
	NullableWF set(NullableR<Float> value);
	NullableWF set(NullableRF value);
	
	default NullableWF value(Float value)
	{
		valueF(value);
		
		return this;
	}
	
	NullableWF clear();
	
}
