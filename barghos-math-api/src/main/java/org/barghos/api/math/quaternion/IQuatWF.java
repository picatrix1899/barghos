package org.barghos.api.math.quaternion;

/**
 * This interface provides the common functions and methods for float
 * quaternions.
 */
public interface IQuatWF extends IQuatRF
{
	
	IQuatWF x(float x);

	IQuatWF y(float y);

	IQuatWF z(float z);

	IQuatWF w(float w);

	IQuatWF set(IQuatRF t);
	
	IQuatWF set(float[] values);
	
	IQuatWF set(float x, float y, float z, float w);

	IQuatWF at(int index, float value);
	
}
