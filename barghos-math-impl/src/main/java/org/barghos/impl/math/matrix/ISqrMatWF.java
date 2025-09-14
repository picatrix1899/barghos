package org.barghos.impl.math.matrix;

/**
 * This interface provides the common functions and methods for square float matrices.
 */
public interface ISqrMatWF extends ISqrMatRF, IMatWF
{
	/** {@inheritDoc} */
	@Override
	ISqrMatWF setAt(int row, int column, float value);

	/** {@inheritDoc} */
	@Override
	ISqrMatWF setRowAt(int row, float[] values);
	
	/** {@inheritDoc} */
	@Override
	ISqrMatWF setColAt(int column, float[] values);

	/** {@inheritDoc} */
	@Override
	ISqrMatWF set(float[] m);

	/** {@inheritDoc} */
	@Override
	ISqrMatWF setZero();

	ISqrMatWF setIdentity();
}
