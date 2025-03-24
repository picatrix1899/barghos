package org.barghos.util.nullable.ints;

import org.barghos.util.nullable.NullableR;

public interface NullableRI extends NullableR<Integer>
{
	
	int valueI();
	
	Integer value();
	
	boolean equals(NullableRI obj);
	
	boolean equalsValueI(int obj);
	
	boolean equalsValue(Integer obj);
	
}
