package org.barghos.util.nullable.strings;

import org.barghos.util.nullable.NullableR;

public interface NullableRStr extends NullableR<String>
{
	
	String valueStr();
	
	String valueOrDefaultStr(String def);
	
	String valueOrDefaultStr();
	
	@Override
	String value();
	
	@Override
	String valueOrDefault(String def);
	
	@Override
	String valueOrDefault();
	
	boolean equals(NullableRStr obj);
	
	boolean equalsValueStr(String obj);
	
	boolean equalsValue(String obj);
	
}
