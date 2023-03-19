package org.barghos.math.api.vector;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;
import org.barghos.tuple.api.t4.Tup4fR;
import org.barghos.tuple.api.tn.TupfR;

/**
 * This interface provides the common functions and methods for float quaternions.
 */
public interface QuatfC extends QuatfR, SimpleQuatfC
{
	/**
	 * Creates a new instance of the type of this vector.
	 * 
	 * @return A new instance.
	 */
	QuatfC createNew();
	
	/**
	 * Creates a new instance of the type of this quaternion and adopts the component values from the given quaternion {@code (v)}.
	 * 
	 * @param v The quaternion to adopt the component values from.
	 * 
	 * @return A new instance.
	 */
	default QuatfC createNew(Tup4fR v)
	{
		return createNew(v.getV0(), v.getV1(), v.getV2(), v.getV3());
	}
	
	/**
	 * Creates a new instance of the type of this quaternion and adopts the component values from the given quaternion {@code (v[0], v[1], v[2], v[3])}.
	 * 
	 * @param v The quaternion as an array to adopt the component values from.
	 * 
	 * @return A new instance.
	 */
	default QuatfC createNew(@MinLength(4) float[] v)
	{
		return createNew(v[0], v[1], v[2], v[3]);
	}
	
	/**
	 * Creates a new instance of the type of this quaternion and adopts the component values from the given quaternion {@code (x, y, z, w)}.
	 * 
	 * @param x The value of the x component.
	 * @param y The value of the y component.
	 * @param z The value of the z component.
	 * @param w The value of the w component.
	 * 
	 * @return A new instance.
	 */
	QuatfC createNew(float x, float y, float z, float w);
	
	/** {@inheritDoc} */
	@Override
	QuatfC copy();
	
	/** {@inheritDoc} */
	@Override
	QuatfC setX(float x);

	/** {@inheritDoc} */
	@Override
	QuatfC setY(float y);
	
	/** {@inheritDoc} */
	@Override
	QuatfC setZ(float z);
	
	/** {@inheritDoc} */
	@Override
	QuatfC setW(float w);
	
	/** {@inheritDoc} */
	@Override
	default QuatfC setV0(float v0)
	{
		return setX(v0);
	}
	
	/** {@inheritDoc} */
	@Override
	default QuatfC setV1(float v1)
	{
		return setY(v1);
	}
	
	/** {@inheritDoc} */
	@Override
	default QuatfC setV2(float v2)
	{
		return setZ(v2);
	}
	
	/** {@inheritDoc} */
	@Override
	default QuatfC setV3(float v3)
	{
		return setW(v3);
	}
	
	/** {@inheritDoc} */
	@Override
	default QuatfC set(Tup4fR t)
	{
		return set(t.getV0(), t.getV1(), t.getV2(), t.getV3());
	}
	
	/**
	 * This operation is not supported by any quaternion.
	 * 
	 * @throws UnsupportedOperationException
	 */
	@Override
	default QuatfC set(float value)
	{
		throw new UnsupportedOperationException();
	}
	
	/** {@inheritDoc} */
	@Override
	default QuatfC set(float x, float y, float z, float w)
	{
		SimpleQuatfC.super.set(x, y, z, w);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	default QuatfC set(@MinLength(4) TupfR t)
	{	
		SimpleQuatfC.super.set(t);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	default QuatfC setByIndex(@IntValueRange(min=0, max=3) int index, float value)
	{
		SimpleQuatfC.super.setByIndex(index, value);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	default QuatfC setArray(@MinLength(4) float... values)
	{
		SimpleQuatfC.super.setArray(values);
		
		return this;
	}
}
