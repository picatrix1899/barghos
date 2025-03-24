package org.barghos.util.nullable.ints;

import org.barghos.util.nullable.NullableR;
import org.barghos.util.nullable.NullableW;

public interface NullableWI extends NullableRI, NullableW<Integer>
{
	
	NullableWI valueI(int value);
	
	NullableWI value(Integer value);
	
	NullableWI set(NullableRI value);
	
	NullableWI set(NullableR<Integer> value);
	
	NullableWI setNull();
	
}
