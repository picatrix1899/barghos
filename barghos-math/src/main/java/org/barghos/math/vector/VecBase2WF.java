package org.barghos.math.vector;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;
import org.barghos.util.tuple.floats.Tup2RF;
import org.barghos.util.tuple.floats.Tup2WF;
import org.barghos.util.tuple.floats.TupRF;

/**
 * This interface provides the common functions and methods for basic float vectors with two
 * dimensions.
 */
public interface VecBase2WF extends VecBase2RF, Tup2WF
{
	/** {@inheritDoc} */
	@Override
	VecBase2WF createNew();
	
	/** {@inheritDoc} */
	@Override
	VecBase2WF createNew(Tup2RF v);
	
	@Override
	VecBase2WF createNew(TupRF t);
	
	/** {@inheritDoc} */
	@Override
	VecBase2WF createNew(@MinLength(2) float... v);
	
	/** {@inheritDoc} */
	@Override
	VecBase2WF createNew(float value);
	
	/** {@inheritDoc} */
	@Override
	VecBase2WF createNew(float x, float y);
	
	/** {@inheritDoc} */
	@Override
	VecBase2WF copy();
	
	/**
	 * Sets the value of the x component of the vector.
	 * 
	 * @param x
	 *     The new value.
	 * 
	 * @return The current vector.
	 */
	VecBase2WF x(float x);
	
	/**
	 * Sets the value of the y component of the vector.
	 * 
	 * @param y
	 *     The new value.
	 * 
	 * @return The current vector.
	 */
	VecBase2WF y(float y);
	
	
	@Override
	VecBase2WF v0(float v0);
	
	@Override
	VecBase2WF v1(float v1);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup2RF}.
	 * 
	 * @param t
	 *     An existing implementation of {@link Tup2RF} to adopt the component values from.
	 * 
	 * @return The current vector.
	 */
	@Override
	VecBase2WF set(Tup2RF t);
	
	/**
	 * Sets all component values to a single value.
	 * 
	 * @param value
	 *     The value used for all component values of the vector.
	 * 
	 * @return The current vector.
	 */
	@Override
	VecBase2WF set(float value);
	
	/**
	 * Sets the values of all components to the corresponding parameters.
	 * 
	 * @param x
	 *     The new value of the x component.
	 * @param y
	 *     The new value of the y component.
	 * 
	 * @return The current vector.
	 */
	@Override
	VecBase2WF set(float x, float y);
	
	/**
	 * Adopts the component values from an existing instance of {@link RTupleF}.
	 * 
	 * @param t
	 *     An existing implementation of {@link RTupleF} to adopt the component values from.
	 * 
	 * @return The current vector.
	 */
	@Override
	VecBase2WF set(@MinLength(2) TupRF t);
	
	/**
	 * Sets the value of the component at the given index.
	 * 
	 * @param index
	 *     The index of the component to store the value in.
	 * @param value
	 *     The new value for the component.
	 * 
	 * @return The current vector.
	 */
	@Override
	VecBase2WF setAt(@IntValueRange(min = 0, max = 1) int index, float value);
	
	/**
	 * Sets the component values to the corresponding values in the array.
	 * 
	 * @param values
	 *     The array with the values for the components.
	 * 
	 * @return The current vector.
	 */
	@Override
	VecBase2WF set(@MinLength(2) float... values);
	
	@Override
	VecBase2WF swizzleN(int indexA, int indexB);
	
	@Override
	VecBase2WF swizzleV0V1N();
	
	@Override
	VecBase2WF swizzleXYN();
	
	@Override
	VecBase2WF arrangeN(int... indices);
	
	@Override
	VecBase2WF arrangeN(int i0, int i1);
	
	@Override
	VecBase2WF arrange(int iV0, int iV1);
	
	@Override
	VecBase2WF arrange(int... indices);
	
	@Override
	VecBase2WF swizzle(int indexA, int indexB);
	
	@Override
	VecBase2WF swizzleV0V1();
	
	VecBase2WF swizzleXY();
}
