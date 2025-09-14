package org.barghos.impl.math.tensor;

public interface Tensor3DWF extends Tensor3DRF, TensorWF
{
	Tensor3DWF tSetAt(int[] indexVec, float value);
	Tensor3DWF tSetAt(int index0, int index1, int index3, float value);
}
