package org.barghos.tuple.api.t4;

import org.barghos.documentation.Nullable;

/**
 * This interface provides non invasive (readonly) functions and methods for object tuples with four dimensions.
 * 
 * @param <X> The type of the x component.
 * @param <Y> The type of the y component.
 * @param <Z> The type of the z component.
 * @param <W> The type of the w component.
 * 
 * @author picatrix1899
 */
public interface Tup4oR<X,Y,Z,W>
{
	/**
	 * Returns the value of the x component of the tuple.
	 * 
	 * @return The value of the x component.
	 */
	X getX();
	
	/**
	 * Returns the value of the y component of the tuple.
	 * 
	 * @return The value of the y component.
	 */
	Y getY();
	
	/**
	 * Returns the value of the z component of the tuple.
	 * 
	 * @return The value of the z component.
	 */
	Z getZ();
	
	/**
	 * Returns the value of the w component of the tuple.
	 * 
	 * @return The value of the w component.
	 */
	W getW();
	
	/**
	 * Copies the component values to a new instance of the current type.
	 * 
	 * @return A new instance of the current tuple with the same component values.
	 */
	Tup4oR<X,Y,Z,W> copy();
	
	/**
	 * Compares the value of the components of this tuple and the given tuple and returns true,
	 * if the value of each component of this tuple is equal to the value of the corresponding component in the other tuple.
	 * 
	 * @param other The tuple to compare with.
	 * 
	 * @return True if this tuple is componentwise equal to the other tuple.
	 */
	boolean equals(@Nullable Tup4oR<X,Y,Z,W> other);
}