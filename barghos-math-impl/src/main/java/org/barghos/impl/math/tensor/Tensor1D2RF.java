package org.barghos.impl.math.tensor;

import org.barghos.validation.Validate;

public interface Tensor1D2RF extends Tensor1DRF
{
	default int tDimSize(int dim)
	{
		Validate.Arg.checkInRange("dim", 0, 0, dim);
		
		return 2;
	}
	
	float tGetAt(int index);
}
