package org.barghos.util.nullable.strings;

import org.barghos.util.nullable.NullableR;
import org.barghos.util.nullable.NullableW;

public interface NullableWStr extends NullableRStr, NullableW<String>
{
	
	NullableWStr valueStr(String value);
	
	NullableWStr value(String value);
	
	NullableWStr set(NullableRStr value);
	
	NullableWStr set(NullableR<String> value);
	
	NullableWStr setNull();
	
}
