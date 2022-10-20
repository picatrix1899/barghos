package org.barghos.math.api.vector;

import static org.barghos.core.api.tuple.TupleConstants.*;

import org.barghos.core.api.math.BarghosMath;

/**
 * This interface represents any modifiable quaternion.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only writes data to the parameter.
 * 
 * @author picatrix1899
 */
public interface QuatC extends QuatR
{
	/**
	 * Sets the x component of the quaternion.
	 * 
	 * @param x The new x value.
	 * 
	 * @return The current quaternion.
	 */
	QuatC setX(double x);
	
	/**
	 * Sets the y component of the quaternion.
	 * 
	 * @param y The new y value.
	 * 
	 * @return The current quaternion.
	 */
	QuatC setY(double y);
	
	/**
	 * Sets the z component of the quaternion.
	 * 
	 * @param z The new z value.
	 * 
	 * @return The current quaternion.
	 */
	QuatC setZ(double z);
	
	/**
	 * Sets the w component of the quaternion.
	 * 
	 * @param w The new w value.
	 * 
	 * @return The current quaternion.
	 */
	QuatC setW(double w);
	
	/**
	 * Adopts the values from an existing instance of {@link QuatR}.
	 * 
	 * @param t An existing implementation of {@link QuatR} to adopt the values from.
	 * 
	 * @return The current quaternion.
	 */
	default QuatC set(QuatR t)
	{
		
		setX(t.getX()).setY(t.getY()).setZ(t.getZ()).setW(t.getW());
		
		return this;
	}
	
	/**
	 * Sets the components to the corresponding paramters.
	 * 
	 * @param x The new x value.
	 * @param y The new y value.
	 * @param z The new z value.
	 * @param w The new w value.
	 * 
	 * @return The current quaternion.
	 */
	default QuatC set(double x, double y, double z, double w)
	{
		setX(x).setY(y).setZ(z).setW(w);
		
		return this;
	}
	
	/**
	 * Sets the value of the component at the given index.
	 * 
	 * @param index The index of the component to store the value in.
	 * @param value The new value for the component.
	 * 
	 * @return The current quaternion.
	 */
	default QuatC setByIndex(int index, double value)
	{
		switch(index)
		{
			case COMP_X: return setX(value);
			case COMP_Y: return setY(value);
			case COMP_Z: return setZ(value);
			case COMP_W: return setW(value);
		}
		
		throw new IndexOutOfBoundsException(index);
	}
	
	/**
	 * Sets the components to the corresponding components.
	 * 
	 * @param values The values to store in the components of the vector.
	 * 
	 * @return The current quaternion.
	 */
	default QuatC setArray(double... values)
	{
		return set(values[0], values[1], values[2], values[3]);
	}
	
	/** {@inheritDoc} */
	@Override
	QuatC clone();
	
	// MISSING_DOC
	default QuatC mul(QuatR q)
	{
		return mul(q.getX(), q.getY(), q.getZ(), q.getW());
	}
	
	// MISSING_DOC
	default QuatC mul(double[] q)
	{
		return mul(q[0], q[1], q[2], q[3]);
	}
	
	// MISSING_DOC
	default QuatC mul(float[] q)
	{
		return mul(q[0], q[1], q[2], q[3]);
	}
	
	// MISSING_DOC
	default QuatC mul(double x, double y, double z, double w)
	{
		return mulR(x, y, z, w, this);
	}
	
	// MISSING_DOC
	default QuatC revMul(QuatR q)
	{
		return revMul(q.getX(), q.getY(), q.getZ(), q.getW());
	}
	
	// MISSING_DOC
	default QuatC revMul(double[] q)
	{
		return revMul(q[0], q[1], q[2], q[3]);
	}
	
	// MISSING_DOC
	default QuatC revMul(float[] q)
	{
		return revMul(q[0], q[1], q[2], q[3]);
	}
	
	// MISSING_DOC
	default QuatC revMul(double x, double y, double z, double w)
	{
		return revMulR(x, y, z, w, this);
	}
	
	// MISSING_DOC
	default QuatC normalize()
	{
		return normalizeR(this);
	}
	
	// MISSING_DOC
	default QuatC inverse()
	{
		return inverseR(this);
	}
	
	// MISSING_DOC
	default QuatC conjugate()
	{
		return conjugateR(this);
	}
	
	// MISSING_DOC
	default QuatC scale(double factor)
	{
		return scaleR(factor, this);
	}

	// MISSING_DOC
	default QuatC integrate(Vec3fR av, double dt)
	{
		return integrate(av.getX(), av.getY(), av.getZ(), dt);
	}
	
	// MISSING_DOC
	default QuatC integrate(double avX, double avY, double avZ, double dt)
	{
		return integrateR(avX, avY, avZ, dt, this);
	}
	
	/** {@inheritDoc} */
	@Override
	default QuatC mulN(QuatR q)
	{
		return clone().mul(q);
	}
	
	/** {@inheritDoc} */
	@Override
	default QuatC mulN(double[] q)
	{
		return clone().mul(q);
	}
	
	/** {@inheritDoc} */
	@Override
	default QuatC mulN(float[] q)
	{
		return clone().mul(q);
	}
	
	/** {@inheritDoc} */
	@Override
	default QuatC mulN(double x, double y, double z, double w)
	{
		return clone().mul(x, y, z, w);
	}

	/** {@inheritDoc} */
	@Override
	default QuatC revMulN(QuatR q)
	{
		return clone().revMul(q);
	}
	
	/** {@inheritDoc} */
	@Override
	default QuatC revMulN(double[] q)
	{
		return clone().revMulN(q);
	}
	
	/** {@inheritDoc} */
	@Override
	default QuatC revMulN(float[] q)
	{
		return clone().revMulN(q);
	}
	
	/** {@inheritDoc} */
	@Override
	default QuatC revMulN(double x, double y, double z, double w)
	{
		return clone().revMul(x, y, z, w);
	}

	/** {@inheritDoc} */
	@Override
	default QuatC normalizeN()
	{
		return clone().normalize();
	}
	
	/** {@inheritDoc} */
	@Override
	default QuatC inverseN()
	{
		return clone().inverse();
	}
	
	/** {@inheritDoc} */
	@Override
	default QuatC conjugateN()
	{
		return clone().conjugate();
	}
	
	/** {@inheritDoc} */
	@Override
	default QuatC scaleN(double factor)
	{
		return clone().scale(factor);
	}

	/** {@inheritDoc} */
	@Override
	default QuatC integrateN(Vec3fR av, double dt)
	{
		return integrateN(av.getX(), av.getY(), av.getZ(), dt);
	}
	
	/** {@inheritDoc} */
	@Override
	default QuatC integrateN(double avX, double avY, double avZ, double dt)
	{
		return clone().integrate(avX, avY, avZ, dt);
	}
	
	/** {@inheritDoc} */
	@Override
	default QuatC rotateN(Vec3fR axis, double angle)
	{
		return rotateN(axis.getX(), axis.getY(), axis.getZ(), angle);
	}
	
	/** {@inheritDoc} */
	@Override
	default QuatC rotateDegN(Vec3fR axis, double angle)
	{
		return rotateN(axis.getX(), axis.getY(), axis.getZ(), angle * BarghosMath.DEG_TO_RAD);
	}
	
	/** {@inheritDoc} */
	@Override
	default QuatC rotateDegN(double x, double y, double z, double angle)
	{
		return rotateN(x, y, z, angle * BarghosMath.DEG_TO_RAD);
	}
	
	/** {@inheritDoc} */
	@Override
	QuatC rotateN(double x, double y, double z, double angle);
	
	/** {@inheritDoc} */
	@Override
	default QuatC rotateGlobalN(Vec3fR axis, double angle)
	{
		return rotateGlobalN(axis.getX(), axis.getY(), axis.getZ(), angle);
	}

	/** {@inheritDoc} */
	@Override
	default QuatC rotateGlobalDegN(Vec3fR axis, double angle)
	{
		return rotateGlobalN(axis.getX(), axis.getY(), axis.getZ(), angle * BarghosMath.DEG_TO_RAD);
	}
	
	/** {@inheritDoc} */
	@Override
	default QuatC rotateGlobalDegN(double x, double y, double z, double angle)
	{
		return rotateGlobalN(x,y,z, angle * BarghosMath.DEG_TO_RAD);
	}
	
	/** {@inheritDoc} */
	@Override
	QuatC rotateGlobalN(double x, double y, double z, double angle);
	
	// MISSING_DOC
	default QuatC setFromAxisAngle(Vec3fR axis, double angle)
	{
		return setFromAxisAngle(axis.getX(), axis.getY(), axis.getZ(), angle);
	}
	
	// MISSING_DOC
	default QuatC setFromAxisAngle(float[] axis, double angle)
	{
		return setFromAxisAngle(axis[COMP_X], axis[COMP_Y], axis[COMP_Z], angle);
	}
	
	// MISSING_DOC
	default QuatC setFromAxisAngle(double[] axis, double angle)
	{
		return setFromAxisAngle(axis[COMP_X], axis[COMP_Y], axis[COMP_Z], angle);
	}
	
	// MISSING_DOC
	default QuatC setFromAxisAngle(double ax, double ay, double az, double angle)
	{
		double halfAngle = angle * 0.5;
		double sinHalfAngle = BarghosMath.sin(halfAngle);
		
		double x_ = ax * sinHalfAngle;
		double y_ = ay * sinHalfAngle;
		double z_ = az * sinHalfAngle;
		double w_ = BarghosMath.cos(halfAngle);
		
		double invLength = BarghosMath.invSqrt(x_ * x_ + y_ * y_ + z_ * z_ + w_ * w_);

		return set(x_ * invLength, y_ * invLength, z_ * invLength, w_ * invLength);
	}
	
	// MISSING_DOC
	default QuatC setFromAxisAngleDeg(Vec3fR axis, double angle)
	{
		return setFromAxisAngleDeg(axis.getX(), axis.getY(), axis.getZ(), angle);
	}
	
	// MISSING_DOC
	default QuatC setFromAxisAngleDeg(float[] axis, double angle)
	{
		return setFromAxisAngleDeg(axis[COMP_X], axis[COMP_Y], axis[COMP_Z], angle);
	}
	
	// MISSING_DOC
	default QuatC setFromAxisAngleDeg(double[] axis, double angle)
	{
		return setFromAxisAngleDeg(axis[COMP_X], axis[COMP_Y], axis[COMP_Z], angle);
	}
	
	// MISSING_DOC
	default QuatC setFromAxisAngleDeg(double ax, double ay, double az, double angle)
	{
		return setFromAxisAngle(ax, ay, az, angle * BarghosMath.DEG_TO_RAD);
	}
}
