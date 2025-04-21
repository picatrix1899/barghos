package org.barghos.util.nullable.bigd;

import java.math.BigDecimal;

import org.barghos.util.nullable.NullableR;
import org.barghos.util.nullable.NullableW;

public interface NullableWBigd extends NullableRBigd, NullableW<BigDecimal>
{
	
	NullableWBigd valueBigi(BigDecimal value);
	
	NullableWBigd value(BigDecimal value);
	
	NullableWBigd set(NullableRBigd value);
	
	NullableWBigd set(NullableR<BigDecimal> value);
	
	NullableWBigd setNull();
	
}
