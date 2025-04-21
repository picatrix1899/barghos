package org.barghos.util.nullable.shorts;

import org.barghos.util.nullable.NullableR;

public interface NullableRS extends NullableR<Short>
{
	
	short valueS();
	
	short valueOrDefaultS(short def);
	
	short valueOrDefaultS();
	
	@Override
	Short value();
	
	@Override
	Short valueOrDefault(Short def);
	
	@Override
	Short valueOrDefault();
	
	boolean equals(NullableRS obj);
	
	boolean equalsValueS(short obj);
	
	@Override
	boolean equalsValue(Short obj);
	
}
