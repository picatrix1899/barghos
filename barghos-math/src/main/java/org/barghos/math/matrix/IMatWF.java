package org.barghos.math.matrix;

public interface IMatWF extends IMatRF
{
	/** {@inheritDoc} */
	@Override
	IMatWF createNew();
	
	/** {@inheritDoc} */
	@Override
	IMatWF createNew(float[] m);
	
	IMatWF setAt(int row, int column, float value);
	
	IMatWF setRowAt(int row, float[] values);
	
	IMatWF setColAt(int column, float[] values);

	IMatWF set(float[] m);

	IMatWF initZero();
}
