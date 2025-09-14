package org.barghos.api.math.tensor;

public interface TensorWF extends TensorRF
{
	TensorWF tSetAt(int[] indexVec, float value);
}
