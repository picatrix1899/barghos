package org.barghos.util.nullable.bytes;

import org.barghos.util.nullable.NullableR;

public interface NullableRB extends NullableR<Byte>
{
	
	byte valueB();
	
	Byte value();
	
	boolean equals(NullableRB obj);
	
	boolean equalsValueB(byte obj);
	
	boolean equalsValue(Byte obj);
	
}
