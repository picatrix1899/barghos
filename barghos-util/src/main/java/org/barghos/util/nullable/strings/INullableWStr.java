package org.barghos.util.nullable.strings;

import org.barghos.annotation.AllowNull;

public interface INullableWStr extends INullableRStr
{
	INullableWStr value(@AllowNull String value);
	
	INullableWStr set(@AllowNull INullableRStr value);
	
	INullableWStr setNull();
}
