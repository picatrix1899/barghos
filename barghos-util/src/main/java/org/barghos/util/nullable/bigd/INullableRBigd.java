package org.barghos.util.nullable.bigd;

import java.math.BigDecimal;

import org.barghos.annotation.AllowNull;

public interface INullableRBigd
{
	boolean isNull();
	
	boolean isNotNull();
	
	BigDecimal value();
	
	BigDecimal valueOrDefault(@AllowNull BigDecimal def);
	
	BigDecimal valueOrDefault();
	
	boolean equals(@AllowNull BigDecimal obj);
	
	boolean equals(@AllowNull INullableRBigd obj);
}
