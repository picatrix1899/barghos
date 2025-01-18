package org.barghos.math.tensor;

public interface Tensor1DWF extends Tensor1DRF, TensorWF
{
	default int tOrder()
	{
		return 1;
	}
	
	Tensor1DWF tSetAt(int[] indexVec, float value);
	Tensor1DWF tSetAt(int index, float value);
}
