package org.barghos.math.tensor;

public interface Tensor2DRF extends TensorRF
{
	default int tOrder()
	{
		return 2;
	}

	float tGetAt(int index0, int index1);
}
