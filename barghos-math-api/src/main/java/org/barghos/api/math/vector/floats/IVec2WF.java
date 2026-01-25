package org.barghos.api.math.vector.floats;

/**
 * This interface provides the common functions and methods for float vectors with two dimensions.
 */
public interface IVec2WF extends IVec2RF
{
	
	/** {@inheritDoc} */
	IVec2WF x(float x);
	
	/** {@inheritDoc} */
	IVec2WF y(float y);
	
	IVec2WF set(IVec2RF t);
	
	IVec2WF set(float[] values);
	
	IVec2WF set(float x, float y);
	
	IVec2WF at(int index, float value);
	
}
