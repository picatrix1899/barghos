package org.barghos.util.nullable.bools;

import org.barghos.annotation.AllowNull;

public interface INullableWBo extends INullableRBo
{
	INullableWBo value(boolean value);
	
	INullableWBo value(@AllowNull Boolean value);
	
	INullableWBo set(@AllowNull INullableRBo value);
	
	INullableWBo setNull();
}
