package org.barghos.impl.math.tensor;

public interface Tensor1DRF extends TensorRF
{
	default int tOrder()
	{
		return 1;
	}
	
	float tGetAt(int index);
}
