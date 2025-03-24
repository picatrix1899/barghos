package org.barghos.util.nullable.shorts;

import org.barghos.util.nullable.NullableR;

public interface NullableRS extends NullableR<Short>
{
	
	short valueS();
	
	Short value();
	
	boolean equals(NullableRS obj);
	
	boolean equalsValueS(short obj);
	
	boolean equalsValue(Short obj);
	
}
