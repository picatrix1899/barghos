package org.barghos.api.core.nullable.shorts;

import org.barghos.annotation.AllowNull;

public interface INullableWS extends INullableRS
{
	INullableWS value(short value);
	
	INullableWS value(@AllowNull Short value);
	
	INullableWS set(@AllowNull INullableRS value);
	
	INullableWS setNull();
}
