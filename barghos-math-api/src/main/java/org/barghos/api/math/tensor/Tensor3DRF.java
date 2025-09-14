package org.barghos.api.math.tensor;

public interface Tensor3DRF extends TensorRF
{
	default int tOrder()
	{
		return 3;
	}

	float tGetAt(int index0, int index1, int index3);
}
