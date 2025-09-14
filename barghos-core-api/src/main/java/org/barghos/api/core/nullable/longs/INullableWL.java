package org.barghos.api.core.nullable.longs;

import org.barghos.annotation.AllowNull;

public interface INullableWL extends INullableRL
{
	INullableWL value(long value);
	
	INullableWL value(@AllowNull Long value);
	
	INullableWL set(@AllowNull INullableRL value);
	
	INullableWL setNull();
}
