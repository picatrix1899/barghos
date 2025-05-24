package org.barghos.util.nullable.chars;

import org.barghos.annotation.AllowNull;

public interface INullableRC
{
	boolean isNull();
	
	boolean isNotNull();
	
	char value();
	
	char valueOrDefault(char def);
	
	char valueOrDefault();
	
	boolean equals(@AllowNull Object obj);
	
	boolean equals(@AllowNull INullableRC obj);
	
	boolean equals(char obj);
	
	boolean equals(@AllowNull Character obj);
}
