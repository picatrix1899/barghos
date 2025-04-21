package org.barghos.util.nullable.objs;

import org.barghos.util.nullable.NullableR;

public interface NullableRO extends NullableR<Object>
{
	
	Object valueStr();
	
	Object valueOrDefaultStr(Object def);
	
	Object valueOrDefaultStr();
	
	@Override
	Object value();
	
	@Override
	Object valueOrDefault(Object def);
	
	@Override
	Object valueOrDefault();
	
	boolean equals(NullableRO obj);
	
	boolean equalsValueStr(Object obj);
	
	boolean equalsValue(Object obj);
	
}
