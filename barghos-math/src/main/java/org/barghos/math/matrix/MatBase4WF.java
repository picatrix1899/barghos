package org.barghos.math.matrix;

import org.barghos.util.tuple.floats.Tup4RF;

/**
 * This interface provides the common functions and methods for basic 4x4 float matrices.
 */
public interface MatBase4WF extends MatBase4RF, SqrMatBaseWF
{
	/** {@inheritDoc} */
	@Override
	MatBase4WF createNew();
	
	/** {@inheritDoc} */
	@Override
	default MatBase4WF createNew(MatBase4RF m)
	{
		return createNew(m.toArray());
	}
	
	/** {@inheritDoc} */
	@Override
	MatBase4WF createNew(float[][] m);
	
	MatBase4WF setRow(int row, Tup4RF t);
	
	/** {@inheritDoc} */
	@Override
	MatBase4WF setRow(int row, float[] values);
	MatBase4WF setRow(int row, float x, float y, float z, float w);
	
	MatBase4WF setColumn(int column, Tup4RF values);
	
	/** {@inheritDoc} */
	@Override
	MatBase4WF setColumn(int column, float[] values);
	MatBase4WF setColumn(int column, float x, float y, float z, float w);
}
