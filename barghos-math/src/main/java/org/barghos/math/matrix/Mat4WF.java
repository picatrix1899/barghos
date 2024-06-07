package org.barghos.math.matrix;

import org.barghos.util.tuple.floats.Tup4RF;

/**
 * This interface provides the common functions and methods for 4x4 float matrices.
 */
public interface Mat4WF extends Mat4RF, MatBase4WF, SqrMatWF
{
	/** {@inheritDoc} */
	@Override
	Mat4WF createNew();
	
	/** {@inheritDoc} */
	@Override
	default Mat4WF createNew(MatBase4RF m)
	{
		return createNew(m.toArray());
	}
	
	/** {@inheritDoc} */
	@Override
	Mat4WF createNew(float[][] m);
	
	/** {@inheritDoc} */
	@Override
	Mat4WF setRow(int row, Tup4RF t);
	
	/** {@inheritDoc} */
	@Override
	Mat4WF setRow(int row, float[] values);
	
	/** {@inheritDoc} */
	@Override
	Mat4WF setRow(int row, float x, float y, float z, float w);
	
	/** {@inheritDoc} */
	@Override
	Mat4WF setColumn(int column, Tup4RF values);
	
	/** {@inheritDoc} */
	@Override
	Mat4WF setColumn(int column, float[] values);
	
	/** {@inheritDoc} */
	@Override
	Mat4WF setColumn(int column, float x, float y, float z, float w);
	
	/** {@inheritDoc} */
	@Override
	Mat4WF initZero();
	
	/** {@inheritDoc} */
	@Override
	Mat4WF initIdentity();
}
