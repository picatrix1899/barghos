package org.barghos.util.nullable.longs;

import org.barghos.annotation.AllowNull;

public interface INullableRL
{
	boolean isNull();
	
	boolean isNotNull();
	
	long value();
	
	long valueOrDefault(long def);
	
	long valueOrDefault();
	
	boolean equals(@AllowNull Object obj);
	
	boolean equals(@AllowNull INullableRL obj);
	
	boolean equals(long obj);
	
	boolean equals(@AllowNull Long obj);
}
