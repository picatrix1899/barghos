package org.barghos.util.nullable.longs;

import org.barghos.util.nullable.NullableR;
import org.barghos.util.nullable.NullableW;

public interface NullableWL extends NullableRL, NullableW<Long>
{
	
	NullableWL valueI(long value);
	
	NullableWL value(Long value);
	
	NullableWL set(NullableRL value);
	
	NullableWL set(NullableR<Long> value);
	
	NullableWL setNull();
	
}
