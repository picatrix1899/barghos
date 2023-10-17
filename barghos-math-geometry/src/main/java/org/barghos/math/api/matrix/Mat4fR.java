package org.barghos.math.api.matrix;

/**
 * This interface provides non invasive (readonly) functions and methods for 4x4 float matrices.
 */
public interface Mat4fR extends SimpleMat4fR, SqrMatfR
{
	/** {@inheritDoc} */
	@Override
	Mat4fR createNew();
	
	/** {@inheritDoc} */
	@Override
	default Mat4fR createNew(SimpleMat4fR m)
	{
		return createNew(m.toArray());
	}
	
	/** {@inheritDoc} */
	@Override
	Mat4fR createNew(float[][] m);
	
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
		return 8;
	}
	
	/** {@inheritDoc}} */
	@Override
	default float[][] toArray()
	{
		return toArray(new float[4][4]);
	}
	
	
	/** {@inheritDoc}} */
	@Override
	default float trace()
	{
		return Mat4fUtils.trace(this);
	}
	
	/** {@inheritDoc}} */
	@Override
	default float determinant()
	{
		return Mat4fUtils.determinant(this);
	}
	
	default Mat4fR invertN()
	{
		return Mat4fUtils.invertFunc(this, (a) -> createNew(a));
	}
	
	default Mat4fR transposeN()
	{
		return Mat4fUtils.transposeFunc(this, (a) -> createNew(a));
	}
	
	default Mat4fR mulN(SimpleMat4fR m)
	{
		return Mat4fUtils.mulFunc(this, m, (a) -> createNew(a));
	}
	
	default Mat4fR revMulN(SimpleMat4fR m)
	{
		return Mat4fUtils.mulFunc(m, this, (a) -> createNew(a));
	}
}
