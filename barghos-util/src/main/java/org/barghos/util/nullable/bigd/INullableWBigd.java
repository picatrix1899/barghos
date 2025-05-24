package org.barghos.util.nullable.bigd;

import java.math.BigDecimal;

import org.barghos.annotation.AllowNull;

public interface INullableWBigd extends INullableRBigd
{
	INullableWBigd value(BigDecimal value);
	
	INullableWBigd set(@AllowNull INullableRBigd value);
	
	INullableWBigd setNull();
}
