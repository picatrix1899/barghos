package org.barghos.math.api.matrix;

import org.barghos.core.tuple.Tup4fR;

/**
 * This interface provides the common functions and methods for 4x4 float matrices.
 */
public interface Mat4fC extends Mat4fR, SimpleMat4fC, SqrMatfC
{
	/** {@inheritDoc} */
	@Override
	Mat4fC createNew();
	
	/** {@inheritDoc} */
	@Override
	default Mat4fC createNew(SimpleMat4fR m)
	{
		return createNew(m.toArray());
	}
	
	/** {@inheritDoc} */
	@Override
	Mat4fC createNew(float[][] m);
	
	/** {@inheritDoc} */
	@Override
	Mat4fC setRow(int row, Tup4fR t);
	
	/** {@inheritDoc} */
	@Override
	Mat4fC setRow(int row, float[] values);
	
	/** {@inheritDoc} */
	@Override
	Mat4fC setRow(int row, float x, float y, float z, float w);
	
	/** {@inheritDoc} */
	@Override
	Mat4fC setColumn(int column, Tup4fR values);
	
	/** {@inheritDoc} */
	@Override
	Mat4fC setColumn(int column, float[] values);
	
	/** {@inheritDoc} */
	@Override
	Mat4fC setColumn(int column, float x, float y, float z, float w);
	
	/** {@inheritDoc} */
	@Override
	Mat4fC initZero();
	
	/** {@inheritDoc} */
	@Override
	Mat4fC initIdentity();
}
