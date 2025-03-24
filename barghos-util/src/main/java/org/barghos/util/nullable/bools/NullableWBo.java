package org.barghos.util.nullable.bools;

import org.barghos.util.nullable.NullableR;
import org.barghos.util.nullable.NullableW;

public interface NullableWBo extends NullableRBo, NullableW<Boolean>
{
	
	NullableWBo valueBo(boolean value);
	
	NullableWBo value(Boolean value);
	
	NullableWBo set(NullableRBo value);
	
	NullableWBo set(NullableR<Boolean> value);
	
	NullableWBo setNull();
	
}
