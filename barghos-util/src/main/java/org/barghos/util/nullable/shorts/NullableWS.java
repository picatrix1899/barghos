package org.barghos.util.nullable.shorts;

import org.barghos.util.nullable.NullableR;
import org.barghos.util.nullable.NullableW;

public interface NullableWS extends NullableRS, NullableW<Short>
{
	
	NullableWS valueS(short value);
	
	NullableWS value(Short value);
	
	NullableWS set(NullableRS value);
	
	NullableWS set(NullableR<Short> value);
	
	NullableWS setNull();
	
}
