package org.barghos.util.nullable.doubles;

import org.barghos.util.nullable.NullableR;
import org.barghos.util.nullable.NullableW;

public interface NullableWD extends NullableRD, NullableW<Double>
{
	
	NullableWD valueD(double value);
	
	NullableWD value(Double value);
	
	NullableWD set(NullableRD value);
	
	NullableWD set(NullableR<Double> value);
	
	NullableWD setNull();
	
}
