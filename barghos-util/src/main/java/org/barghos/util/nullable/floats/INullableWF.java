package org.barghos.util.nullable.floats;

import org.barghos.annotation.AllowNull;

public interface INullableWF extends INullableRF
{
	INullableWF value(float value);
	
	INullableWF value(@AllowNull Float value);
	
	INullableWF set(@AllowNull INullableRF value);
	
	INullableWF setNull();
}
