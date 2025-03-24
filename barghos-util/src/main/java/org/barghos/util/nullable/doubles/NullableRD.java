package org.barghos.util.nullable.doubles;

import org.barghos.util.nullable.NullableR;

public interface NullableRD extends NullableR<Double>
{
	
	double valueD();
	
	Double value();
	
	boolean equals(NullableRD obj);
	
	boolean equalsValueD(double obj);
	
	boolean equalsValue(Double obj);
	
}
