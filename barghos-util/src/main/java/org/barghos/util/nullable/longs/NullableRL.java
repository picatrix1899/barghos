package org.barghos.util.nullable.longs;

import org.barghos.util.nullable.NullableR;

public interface NullableRL extends NullableR<Long>
{
	
	long valueL();
	
	long valueOrDefaultL(long def);
	
	long valueOrDefaultL();
	
	@Override
	Long value();
	
	@Override
	Long valueOrDefault(Long def);
	
	@Override
	Long valueOrDefault();
	
	boolean equals(NullableRL obj);
	
	boolean equalsValueL(long obj);
	
	@Override
	boolean equalsValue(Long obj);
	
}
