package org.barghos.util.nullable.ints;

import org.barghos.annotation.AllowNull;

public interface INullableRI
{
	boolean isNull();
	
	boolean isNotNull();
	
	int value();
	
	int valueOrDefault(int def);
	
	int valueOrDefault();
	
	boolean equals(@AllowNull Object obj);
	
	boolean equals(@AllowNull INullableRI obj);
	
	boolean equals(int obj);
	
	boolean equals(@AllowNull Integer obj);
}
