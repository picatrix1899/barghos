package org.barghos.api.core.nullable.objs;

import org.barghos.annotation.AllowNull;

public interface INullableRO
{
	boolean isNull();
	
	boolean isNotNull();
	
	Object value();
	
	Object valueOrDefault(@AllowNull Object def);
	
	Object valueOrDefault();
	
	boolean equals(@AllowNull Object obj);
	
	boolean equals(@AllowNull INullableRO obj);
}
