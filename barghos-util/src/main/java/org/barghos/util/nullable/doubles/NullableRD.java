package org.barghos.util.nullable.doubles;

import org.barghos.util.nullable.NullableR;

public interface NullableRD extends NullableR<Double>
{
	
	double valueD();
	
	double valueOrDefaultD(double def);
	
	double valueOrDefaultD();
	
	@Override
	Double value();
	
	@Override
	Double valueOrDefault(Double def);
	
	@Override
	Double valueOrDefault();
	
	boolean equals(NullableRD obj);
	
	boolean equalsValueD(double obj);
	
	boolean equalsValue(Double obj);
	
}
