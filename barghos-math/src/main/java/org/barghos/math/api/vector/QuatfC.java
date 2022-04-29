package org.barghos.math.api.vector;

import static org.barghos.core.api.tuple.TupleConstants.*;

import org.barghos.core.api.tuple.TupdR;
import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.core.api.tuple4.Tup4fC;
import org.barghos.core.api.tuple4.Tup4fR;
import org.barghos.core.api.util.ExtractParam;

// MISSING_DOC
public interface QuatfC extends QuatfR, Tup4fC
{
	/**
	 * Sets the x component of the quaternion.
	 * 
	 * @param x The new x value.
	 * 
	 * @return The current quaternion.
	 */
	@Override
	QuatfC setX(float x);
	
	/**
	 * Sets the y component of the quaternion.
	 * 
	 * @param y The new y value.
	 * 
	 * @return The current quaternion.
	 */
	@Override
	QuatfC setY(float y);
	
	/**
	 * Sets the z component of the quaternion.
	 * 
	 * @param z The new z value.
	 * 
	 * @return The current quaternion.
	 */
	@Override
	QuatfC setZ(float z);
	
	/**
	 * Sets the w component of the quaternion.
	 * 
	 * @param w The new w value.
	 * 
	 * @return The current quaternion.
	 */
	@Override
	QuatfC setW(float w);
	
	/**
	 * Adopts the values from an existing instance of {@link Tup4fR}.
	 * 
	 * @param t An existing implementation of {@link Tup4fR} to adopt the values from.
	 * 
	 * @return The current quaternion.
	 */
	@Override
	default QuatfC set(Tup4fR t)
	{
		return (QuatfC)Tup4fC.super.set(t);
	}
	
	/**
	 * This operation is not supported for a quaternion.
	 */
	@Override
	default Tup4fC set(float value)
	{
		throw new UnsupportedOperationException();
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
	@Override
	default QuatfC set(float x, float y, float z, float w)
	{
		return (QuatfC)Tup4fC.super.set(x, y, z, w);
	}
	
	/**
	 * Sets the value of the component at the given index.
	 * 
	 * @param index The index of the component to store the value in.
	 * @param value The new value for the component.
	 * 
	 * @return The current quaternion.
	 */
	@Override
	default QuatfC setByIndex(int index, float value)
	{
		return (QuatfC)Tup4fC.super.setByIndex(index, value);
	}
	
	/**
	 * Sets the components to the corresponding components.
	 * 
	 * @param values The values to store in the components of the vector.
	 * 
	 * @return The current quaternion.
	 */
	@Override
	default QuatfC setArray(float... values)
	{
		return (QuatfC)Tup4fC.super.setArray(values);
	}
	
	/**
	 * Adopts the values from an existing instance of {@link TupdR}.
	 * 
	 * @param t An existing implementation of {@link TupdR} to adopt the values from.
	 * 
	 * @return The current quaternion.
	 */
	@Override
	default QuatfC set(TupfR t)
	{
		return (QuatfC)Tup4fC.super.set(t);
	}
	
	/** {@inheritDoc} */
	@Override
	QuatfC clone();
	
	// MISSING_DOC
	default float dot(QuatfR q)
	{
		return getX() * q.getX() + getY() * q.getY() + getZ() * q.getZ() + getW() * q.getW();
	}
	
	// MISSING_DOC
	default QuatfC conjugate()
	{
		return conjugate(this);
	}
	
	// MISSING_DOC
	default QuatfC conjugateN()
	{
		return clone().conjugate();
	}
	
	// MISSING_DOC
	default <T extends QuatfC> T conjugate(@ExtractParam T res)
	{
		res.set(-getX(), -getY(), -getZ(), getW());

		return res;
	}
	
	// MISSING_DOC
	default QuatfC normal()
	{
		return normal(this);
	}
	
	// MISSING_DOC
	default QuatfC normalN()
	{
		return clone().normal();
	}
	
	// MISSING_DOC
	default <T extends QuatfC> T normal(@ExtractParam T res)
	{
		float l = reciprocalLength();
		
		res.set(getX() * l, getY() * l, getZ() * l, getW() * l);

		return res;
	}
	
	// MISSING_DOC
	default QuatfC inverse()
	{
		return inverse(this);
	}
	
	// MISSING_DOC
	default QuatfC inverseN()
	{
		return clone().inverse();
	}
	
	// MISSING_DOC
	default <T extends QuatfC> T inverse(@ExtractParam T res)
	{
		float l = reciprocalLength();
		
		res.set(-getX() * l, -getY() * l, -getZ() * l, getW() * l);
		
		return res;
	}
	
	// MISSING_DOC
	default QuatfC mul(QuatfR q)
	{
		return mul(q, this);
	}

	// MISSING_DOC
	default QuatfC mulN(QuatfR q)
	{
		return clone().mul(q);
	}
	
	// MISSING_DOC
	<T extends QuatfC> T mul(QuatfR q, T res);
	
	// MISSING_DOC
	default QuatfC mulVector(Tup3fR t)
	{
		return mulVector(t.getX(), t.getY(), t.getZ(), this);
	}
	
	// MISSING_DOC
	default QuatfC mulVector(float[] t)
	{
		return mulVector(t[COMP_X], t[COMP_Y], t[COMP_Z], this);
	}
	
	// MISSING_DOC
	default QuatfC mulVector(float x, float y, float z)
	{
		return mulVector(x, y, z, this);
	}

	// MISSING_DOC
	default QuatfC mulVectorN(Tup3fR t)
	{
		return clone().mulVector(t);
	}
	
	// MISSING_DOC
	default QuatfC mulVectorN(float[] t)
	{
		return clone().mulVector(t);
	}
	
	// MISSING_DOC
	default QuatfC mulVectorN(float x, float y, float z)
	{
		return clone().mulVector(x, y, z);
	}
	
	// MISSING_DOC
	default <T extends QuatfC> T mulVector(Tup3fR t, @ExtractParam T res)
	{
		return mulVector(t.getX(), t.getY(), t.getZ(), res);
	}
	
	// MISSING_DOC
	default <T extends QuatfC> T mulVector(float[] t, @ExtractParam T res)
	{
		return mulVector(t[COMP_X], t[COMP_Y], t[COMP_Z], res);
	}
	
	// MISSING_DOC
	<T extends QuatfC> T mulVector(float x, float y, float z, @ExtractParam T res);
}
