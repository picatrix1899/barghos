package org.barghos.api.core.nullable.strings;

import org.barghos.annotation.AllowNull;

public interface INullableRStr
{
	boolean isNull();
	
	boolean isNotNull();
	
	String value();
	
	String valueOrDefault(@AllowNull String def);
	
	String valueOrDefault();
	
	boolean equals(@AllowNull Object obj);
	
	boolean equals(@AllowNull INullableRStr obj);
	
	boolean equals(@AllowNull String obj);
	
	boolean equalsIgnoreCase(@AllowNull String obj);
}
