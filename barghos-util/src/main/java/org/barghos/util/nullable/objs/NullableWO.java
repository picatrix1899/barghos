package org.barghos.util.nullable.objs;

import org.barghos.util.nullable.NullableR;
import org.barghos.util.nullable.NullableW;

public interface NullableWO extends NullableRO, NullableW<Object>
{
	
	NullableWO valueStr(Object value);
	
	NullableWO value(Object value);
	
	NullableWO set(NullableRO value);
	
	NullableWO set(NullableR<Object> value);
	
	NullableWO setNull();
	
}
