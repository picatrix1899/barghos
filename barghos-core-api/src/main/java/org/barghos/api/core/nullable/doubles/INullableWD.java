package org.barghos.api.core.nullable.doubles;

import org.barghos.annotation.AllowNull;

public interface INullableWD extends INullableRD
{
	INullableWD value(double value);
	
	INullableWD value(@AllowNull Double value);
	
	INullableWD set(@AllowNull INullableRD value);
	
	INullableWD setNull();
}
