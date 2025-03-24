package org.barghos.util.nullable.bytes;

import org.barghos.util.nullable.NullableR;
import org.barghos.util.nullable.NullableW;

public interface NullableWB extends NullableRB, NullableW<Byte>
{
	
	NullableWB valueB(byte value);
	
	NullableWB value(Byte value);
	
	NullableWB set(NullableRB value);
	
	NullableWB set(NullableR<Byte> value);
	
	NullableWB setNull();
	
}
