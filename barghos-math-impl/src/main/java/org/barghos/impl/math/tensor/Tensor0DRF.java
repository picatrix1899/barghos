package org.barghos.impl.math.tensor;

public interface Tensor0DRF extends TensorRF
{
	default int tOrder()
	{
		return 0;
	}
	
	int[] tSize();
	
	int[] tSize(int[] res);

	int tDimSize(int dim);
	
	float tGetAt();
}
