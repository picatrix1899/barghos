package org.barghos.util.nullable.bools;

import org.barghos.util.nullable.NullableR;

public interface NullableRBo extends NullableR<Boolean>
{
	
	boolean valueBo();
	
	Boolean value();
	
	boolean equals(NullableRBo obj);
	
	boolean equalsValueBo(boolean obj);
	
	boolean equalsValue(Boolean obj);
	
}
