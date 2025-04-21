package org.barghos.util.nullable.ints;

import org.barghos.util.nullable.NullableR;

public interface NullableRI extends NullableR<Integer>
{
	
	int valueI();
	
	int valueOrDefaultI(int def);
	
	int valueOrDefaultI();
	
	@Override
	Integer value();
	
	@Override
	Integer valueOrDefault(Integer def);
	
	@Override
	Integer valueOrDefault();
	
	boolean equals(NullableRI obj);
	
	boolean equalsValueI(int obj);
	
	@Override
	boolean equalsValue(Integer obj);
	
}
