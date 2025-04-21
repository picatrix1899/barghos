package org.barghos.util.nullable.bigd;

import java.math.BigDecimal;

import org.barghos.util.nullable.NullableR;

public interface NullableRBigd extends NullableR<BigDecimal>
{
	
	BigDecimal valueBigd();
	
	BigDecimal valueOrDefaultBigd(BigDecimal def);
	
	BigDecimal valueOrDefaultBigd();
	
	@Override
	BigDecimal value();
	
	@Override
	BigDecimal valueOrDefault(BigDecimal def);
	
	@Override
	BigDecimal valueOrDefault();
	
	boolean equals(NullableRBigd obj);
	
	boolean equalsValueBigd(BigDecimal obj);
	
	boolean equalsValue(BigDecimal obj);
	
}
