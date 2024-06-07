package org.barghos.math.matrix;

/**
 * This interface provides non invasive (readonly) functions and methods for 4x4 float matrices.
 */
public interface Mat4RF extends MatBase4RF, SqrMatRF
{
	/** {@inheritDoc} */
	@Override
	Mat4RF createNew();
	
	/** {@inheritDoc} */
	@Override
	Mat4RF createNew(MatBase4RF m);
	
	/** {@inheritDoc} */
	@Override
	Mat4RF createNew(float[][] m);
	
	/** {@inheritDoc}} */
	@Override
	default int getRowCount()
	{
		return 4;
	}
	
	/** {@inheritDoc}} */
	@Override
	default int getColumnCount()
	{
		return 4;
	}
	
	/** {@inheritDoc}} */
	@Override
	default int getCellCount()
	{
		return 16;
	}
	
	/** {@inheritDoc}} */
	@Override
	float[][] toArray();
	
	
	/** {@inheritDoc}} */
	@Override
	float trace();
	
	/** {@inheritDoc}} */
	@Override
	float determinant();
	
	Mat4RF invertN();
	
	Mat4RF transposeN();
	
	Mat4RF mulN(MatBase4RF m);
	
	Mat4RF revMulN(MatBase4RF m);
}
