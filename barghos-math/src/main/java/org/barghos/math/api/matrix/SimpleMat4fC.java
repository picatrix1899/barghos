package org.barghos.math.api.matrix;

import org.barghos.core.tuple.Tup4fR;

/**
 * This interface provides the common functions and methods for basic 4x4 float matrices.
 */
public interface SimpleMat4fC extends SimpleMat4fR, SimpleSqrMatfC
{
	/** {@inheritDoc} */
	@Override
	SimpleMat4fC createNew();
	
	/** {@inheritDoc} */
	@Override
	default SimpleMat4fC createNew(SimpleMat4fR m)
	{
		return createNew(m.toArray());
	}
	
	/** {@inheritDoc} */
	@Override
	SimpleMat4fC createNew(float[][] m);
	
	SimpleMat4fC setRow(int row, Tup4fR t);
	
	/** {@inheritDoc} */
	@Override
	SimpleMat4fC setRow(int row, float[] values);
	SimpleMat4fC setRow(int row, float x, float y, float z, float w);
	
	SimpleMat4fC setColumn(int column, Tup4fR values);
	
	/** {@inheritDoc} */
	@Override
	SimpleMat4fC setColumn(int column, float[] values);
	SimpleMat4fC setColumn(int column, float x, float y, float z, float w);
}
