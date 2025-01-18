package org.barghos.math.tensor;

public interface Tensor1D2WF extends Tensor1D2RF, Tensor1DWF
{
	Tensor1D2WF tSetAt(int[] indexVec, float value);
	Tensor1D2WF tSetAt(int index, float value);
}
