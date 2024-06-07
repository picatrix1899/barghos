package org.barghos.math.quaternion;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;
import org.barghos.core.math.BarghosMath;
import org.barghos.core.math.MathProvider;
import org.barghos.core.tuple.Tup4fR;
import org.barghos.core.tuple.TupfR;

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
		return createNew(v.v0(), v.v1(), v.v2(), v.v3());
	}
	
	/**
	 * Creates a new instance of the type of this quaternion and adopts the component values from the given quaternion {@code (v[0]; v[1], v[2], v[3])}.
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
	 * Creates a new instance of the type of this quaternion and adopts the component values from the given quaternion {@code (w; x, y, z)}.
	 * 
	 * @param w The value of the w component.
	 * @param x The value of the x component.
	 * @param y The value of the y component.
	 * @param z The value of the z component.
	 * 
	 * 
	 * @return A new instance.
	 */
	QuatfC createNew(float w, float x, float y, float z);
	
	/** {@inheritDoc} */
	@Override
	QuatfC copy();
	
	/** {@inheritDoc} */
	@Override
	QuatfC w(float w);
	
	/** {@inheritDoc} */
	@Override
	QuatfC x(float x);

	/** {@inheritDoc} */
	@Override
	QuatfC y(float y);
	
	/** {@inheritDoc} */
	@Override
	QuatfC z(float z);
	
	/** {@inheritDoc} */
	@Override
	default QuatfC v0(float v0)
	{
		return w(v0);
	}
	
	/** {@inheritDoc} */
	@Override
	default QuatfC v1(float v1)
	{
		return x(v1);
	}
	
	/** {@inheritDoc} */
	@Override
	default QuatfC v2(float v2)
	{
		return y(v2);
	}
	
	/** {@inheritDoc} */
	@Override
	default QuatfC v3(float v3)
	{
		return z(v3);
	}
	
	/** {@inheritDoc} */
	@Override
	default QuatfC set(Tup4fR t)
	{
		return set(t.v0(), t.v1(), t.v2(), t.v3());
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
	default QuatfC set(float w, float x, float y, float z)
	{
		SimpleQuatfC.super.set(w, x, y, z);
		
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
	
	/**
	 * Calculates the conjugate of this quaternion.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code Q* }
	 * 
	 * @return The current quaternion.
	 */
	default QuatfC conjugate()
	{
		return QuatfUtils.conjugate(this, this);
	}
	
	/**
	 * Calculates the inverse of this quaternion.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code Q* / |Q|² }
	 * 
	 * 
	 * @return The current quaternion.
	 */
	default QuatfC inverse()
	{
		return QuatfUtils.inverse(this, this);
	}
	
	/**
	 * Normalizes this quaternion.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code Q / |Q|}
	 * 
	 * @return The current quaternion.
	 */
	default QuatfC normalize()
	{
		return QuatfUtils.normalize(this, this);
	}
	
	/**
	 * Normalizes this quaternion.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code Q / |Q|}
	 * 
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The current quaternion.
	 */
	default QuatfC normalize(MathProvider mathProvider)
	{
		return QuatfUtils.normalize(this, mathProvider, this);
	}
	
	/** {@inheritDoc} */
	@Override
	default QuatfC conjugateN()
	{
		return QuatfUtils.conjugateFunc(this, (w, x, y, z) -> createNew(w, x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default QuatfC inverseN()
	{
		return QuatfUtils.inverseFunc(this, (w, x, y, z) -> createNew(w, x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default QuatfC normalizeN()
	{
		return QuatfUtils.normalizeFunc(this, (w, x, y, z) -> createNew(w, x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default QuatfC normalizeN(MathProvider mathProvider)
	{
		return QuatfUtils.normalizeFunc(this, mathProvider, (w, x, y, z) -> createNew(w, x, y, z));
	}
}
