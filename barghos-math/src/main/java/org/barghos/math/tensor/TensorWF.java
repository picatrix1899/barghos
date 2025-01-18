package org.barghos.math.tensor;

public interface TensorWF extends TensorRF
{
	TensorWF tSetAt(int[] indexVec, float value);
}
