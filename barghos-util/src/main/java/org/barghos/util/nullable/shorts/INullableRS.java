package org.barghos.util.nullable.shorts;

import org.barghos.annotation.AllowNull;

public interface INullableRS
{
	boolean isNull();
	
	boolean isNotNull();
	
	short value();
	
	short valueOrDefault(short def);
	
	short valueOrDefault();
	
	boolean equals(@AllowNull Object obj);
	
	boolean equals(@AllowNull INullableRS obj);
	
	boolean equals(short obj);
	
	boolean equals(@AllowNull Short obj);
}
