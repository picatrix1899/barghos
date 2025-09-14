package org.barghos.impl.math.tensor;

public interface TensorRF
{
	int tOrder();
	
	int[] tSize();
	int[] tSize(int[] res);
	
	int tDimSize(int dim);
	
	float tGetAt(int[] indexVec);
}
