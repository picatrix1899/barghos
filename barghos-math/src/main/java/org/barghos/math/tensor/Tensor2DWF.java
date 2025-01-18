package org.barghos.math.tensor;

public interface Tensor2DWF extends Tensor2DRF, TensorWF
{
	Tensor2DWF tSetAt(int[] indexVec, float value);
	Tensor2DWF tSetAt(int index0, int index1, float value);
}
