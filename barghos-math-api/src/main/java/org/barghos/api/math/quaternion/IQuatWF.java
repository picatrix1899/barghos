package org.barghos.api.math.quaternion;

import org.barghos.api.core.tuple.floats.ITup4RF;
import org.barghos.api.core.tuple.floats.ITup4WF;
import org.barghos.api.core.tuple.floats.ITupRF;

/**
 * This interface provides the common functions and methods for float
 * quaternions.
 */
public interface IQuatWF extends IQuatRF, ITup4WF
{
	
	IQuatWF x(float x);

	IQuatWF y(float y);

	IQuatWF z(float z);

	IQuatWF w(float w);
	
	IQuatWF v0(float v0);

	IQuatWF v1(float v1);

	IQuatWF v2(float v2);

	IQuatWF v3(float v3);

	/** {@inheritDoc} */
	@Override
	IQuatWF set(ITup4RF t);

	/** {@inheritDoc} */
	@Override
	IQuatWF set(ITupRF t);
	
	/** {@inheritDoc} */
	@Override
	IQuatWF set(float[] values);
	
	/** {@inheritDoc} */
	@Override
	IQuatWF set(float x, float y, float z, float w);

	/** {@inheritDoc} */
	@Override
	IQuatWF setAt(int index, float value);
	
	IQuatWF setFromAxisAngle(float ax, float ay, float az, float angle);
	
	IQuatWF conj();
	
	/** {@inheritDoc} */
	@Override
	IQuatWF conjN();

	IQuatWF inv();

	/** {@inheritDoc} */
	@Override
	IQuatWF invN();
	
	IQuatWF nrm();
	
	/** {@inheritDoc} */
	@Override
	IQuatWF nrmN();
}
