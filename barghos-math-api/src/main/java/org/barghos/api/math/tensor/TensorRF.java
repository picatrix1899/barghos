package org.barghos.api.math.tensor;

public interface TensorRF
{
	int tOrder();
	
	int[] tSize();
	int[] tSize(int[] res);
	
	int tDimSize(int dim);
	
	float tGetAt(int[] indexVec);
}
