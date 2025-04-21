package org.barghos.util.nullable.bools;

import org.barghos.util.nullable.NullableR;

public interface NullableRBo extends NullableR<Boolean>
{
	
	boolean valueBo();
	
	boolean valueOrDefaultB(boolean def);
	
	boolean valueOrDefaultB();
	
	@Override
	Boolean value();
	
	@Override
	Boolean valueOrDefault(Boolean def);
	
	@Override
	Boolean valueOrDefault();
	
	boolean equals(NullableRBo obj);
	
	boolean equalsValueBo(boolean obj);
	
	boolean equalsValue(Boolean obj);
	
}
