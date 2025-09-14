package org.barghos.impl.math.matrix;

public interface IMatWF extends IMatRF
{
	IMatWF setAt(int row, int column, float value);
	
	IMatWF setRowAt(int row, float[] values);
	
	IMatWF setColAt(int column, float[] values);

	IMatWF set(float[] m);

	IMatWF setZero();
}
