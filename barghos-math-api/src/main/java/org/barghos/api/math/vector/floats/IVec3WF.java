package org.barghos.api.math.vector.floats;

/**
 * This interface provides the common functions and methods for float vectors with two dimensions.
 */
public interface IVec3WF extends IVec3RF
{
	
	/** {@inheritDoc} */
	IVec3WF x(float x);
	
	/** {@inheritDoc} */
	IVec3WF y(float y);
	
	/** {@inheritDoc} */
	IVec3WF z(float z);
	
	/** {@inheritDoc} */
	IVec3WF set(IVec3RF v);
	
	/** {@inheritDoc} */
	IVec3WF set(float[] v);
	
	/** {@inheritDoc} */
	IVec3WF set(float x, float y, float z);
	
	/** {@inheritDoc} */
	IVec3WF at(int index, float value);
	
}
