package org.barghos.util.nullable.objs;

import org.barghos.annotation.AllowNull;

public interface INullableWO extends INullableRO
{
	INullableWO value(Object value);
	
	INullableWO set(@AllowNull INullableRO value);
	
	INullableWO setNull();
}
