package org.barghos.util.nullable.doubles;

import org.barghos.annotation.AllowNull;

public interface INullableRD
{
	boolean isNull();
	
	boolean isNotNull();
	
	double value();
	
	double valueOrDefault(double def);
	
	double valueOrDefault();
	
	boolean equals(@AllowNull Object obj);
	
	boolean equals(@AllowNull INullableRD obj);
	
	boolean equals(double obj);
	
	boolean equals(@AllowNull Double obj);
}
