package org.barghos.api.core.nullable.bytes;

import org.barghos.annotation.AllowNull;

public interface INullableWB extends INullableRB
{
	INullableWB value(byte value);
	
	INullableWB value(@AllowNull Byte value);
	
	INullableWB set(@AllowNull INullableRB value);
	
	INullableWB setNull();
}
