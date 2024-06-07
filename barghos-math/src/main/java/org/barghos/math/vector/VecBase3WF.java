package org.barghos.math.vector;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;
import org.barghos.util.tuple.floats.Tup3RF;
import org.barghos.util.tuple.floats.Tup3WF;
import org.barghos.util.tuple.floats.TupRF;

/**
 * This interface provides the common functions and methods for basic float vectors with three
 * dimensions.
 */
public interface VecBase3WF extends VecBase3RF, Tup3WF
{
	/** {@inheritDoc} */
	@Override
	VecBase3WF createNew();
	
	/** {@inheritDoc} */
	@Override
	VecBase3WF createNew(Tup3RF v);
	
	/** {@inheritDoc} */
	@Override
	VecBase3WF createNew(@MinLength(3) float... v);
	
	/** {@inheritDoc} */
	@Override
	VecBase3WF createNew(float value);
	
	/** {@inheritDoc} */
	@Override
	VecBase3WF createNew(float x, float y, float z);
	
	/** {@inheritDoc} */
	@Override
	VecBase3WF copy();
	
	/**
	 * Sets the value of the x component of the vector.
	 * 
	 * @param x
	 *     The new value.
	 * 
	 * @return The current vector.
	 */
	VecBase3WF x(float x);
	
	/**
	 * Sets the value of the y component of the vector.
	 * 
	 * @param y
	 *     The new value.
	 * 
	 * @return The current vector.
	 */
	VecBase3WF y(float y);
	
	/**
	 * Sets the value of the z component of the vector.
	 * 
	 * @param z
	 *     The new value.
	 * 
	 * @return The current vector.
	 */
	VecBase3WF z(float z);
	
	/** {@inheritDoc} */
	@Override
	VecBase3WF v0(float v0);
	
	/** {@inheritDoc} */
	@Override
	VecBase3WF v1(float v1);
	
	/** {@inheritDoc} */
	@Override
	VecBase3WF v2(float v2);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup3RF}.
	 * 
	 * @param t
	 *     An existing implementation of {@link Tup3RF} to adopt the component values from.
	 * 
	 * @return The current vector.
	 */
	@Override
	VecBase3WF set(Tup3RF t);
	
	/**
	 * Sets all component values to a single value.
	 * 
	 * @param value
	 *     The value used for all component values of the vector.
	 * 
	 * @return The current vector.
	 */
	@Override
	VecBase3WF set(float value);
	
	/**
	 * Sets the values of all components to the corresponding parameters.
	 * 
	 * @param x
	 *     The new value of the x component.
	 * @param y
	 *     The new value of the y component.
	 * @param z
	 *     The new value of the z component.
	 * 
	 * @return The current vector.
	 */
	@Override
	VecBase3WF set(float x, float y, float z);
	
	/**
	 * Adopts the component values from an existing instance of {@link TupRF}.
	 * 
	 * @param t
	 *     An existing implementation of {@link TupRF} to adopt the component values from.
	 * 
	 * @return The current vector.
	 */
	@Override
	VecBase3WF set(@MinLength(3) TupRF t);
	
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
	VecBase3WF setAt(@IntValueRange(min = 0, max = 2) int index, float value);
	
	/**
	 * Sets the component values to the corresponding values in the array.
	 * 
	 * @param values
	 *     The array with the values for the components.
	 * 
	 * @return The current vector.
	 */
	@Override
	VecBase3WF set(@MinLength(3) float... values);
}
