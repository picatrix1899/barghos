package org.barghos.util.nullable.ints;

import org.barghos.annotation.AllowNull;

public interface INullableWI extends INullableRI
{
	INullableWI value(int value);
	
	INullableWI value(@AllowNull Integer value);
	
	INullableWI set(@AllowNull INullableRI value);
	
	INullableWI setNull();
}
