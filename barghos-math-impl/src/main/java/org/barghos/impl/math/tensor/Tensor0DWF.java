package org.barghos.impl.math.tensor;

public interface Tensor0DWF extends Tensor0DRF, TensorWF
{
	Tensor0DWF tSetAt(int[] indexVec, float value);
	Tensor0DWF tSetAt(float value);
}
