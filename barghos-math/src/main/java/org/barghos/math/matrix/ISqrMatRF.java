package org.barghos.math.matrix;

public interface ISqrMatRF extends IMatRF
{
	/** {@inheritDoc} */
	@Override
	ISqrMatRF createNew();
	
	/** {@inheritDoc} */
	@Override
	ISqrMatRF createNew(float[] m);
	
	float det();

	float trace();
}
