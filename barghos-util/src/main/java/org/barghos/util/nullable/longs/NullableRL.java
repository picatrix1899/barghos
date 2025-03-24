package org.barghos.util.nullable.longs;

import org.barghos.util.nullable.NullableR;

public interface NullableRL extends NullableR<Long>
{
	
	long valueL();
	
	Long value();
	
	boolean equals(NullableRL obj);
	
	boolean equalsValue(Long obj);
	
	boolean equalsValueL(long obj);
	
}
