package org.barghos.util.nullable.bytes;

import org.barghos.annotation.AllowNull;

public interface INullableRB
{
	boolean isNull();
	
	boolean isNotNull();
	
	byte value();
	
	byte valueOrDefault(byte def);
	
	byte valueOrDefault();
	
	boolean equals(@AllowNull Object obj);
	
	boolean equals(@AllowNull INullableRB obj);
	
	boolean equals(byte obj);
	
	boolean equals(@AllowNull Byte obj);
}
