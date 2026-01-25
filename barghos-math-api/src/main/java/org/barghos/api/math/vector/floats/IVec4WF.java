package org.barghos.api.math.vector.floats;

/**
 * This interface provides the common functions and methods for float vectors with two dimensions.
 */
public interface IVec4WF extends IVec4RF
{
	
	/** {@inheritDoc} */
	IVec4WF x(float x);
	
	/** {@inheritDoc} */
	IVec4WF y(float y);
	
	/** {@inheritDoc} */
	IVec4WF z(float z);
	
	/** {@inheritDoc} */
	IVec4WF w(float w);
	
	/** {@inheritDoc} */
	IVec4WF set(IVec4RF v);
	
	/** {@inheritDoc} */
	IVec4WF set(float[] v);
	
	/** {@inheritDoc} */
	IVec4WF set(float x, float y, float z, float w);
	
	/** {@inheritDoc} */
	IVec4WF at(int index, float value);
	
}
