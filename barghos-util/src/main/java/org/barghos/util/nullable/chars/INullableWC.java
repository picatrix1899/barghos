package org.barghos.util.nullable.chars;

import org.barghos.annotation.AllowNull;

public interface INullableWC extends INullableRC
{
	INullableWC value(char value);
	
	INullableWC value(@AllowNull Character value);
	
	INullableWC set(@AllowNull INullableRC value);
	
	INullableWC setNull();
}
