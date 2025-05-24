package org.barghos.util.tuple;

import org.barghos.annotation.AllowNull;

/**
 * This interface provides non-modifying operations for generic tuples with two
 * components.
 * 
 * @param <V0> The type of the first component.
 * @param <V1> The type of the second component.
 */
public interface ITup2R<V0,V1>
{
	/**
	 * Creates a new instance of the type of this tuple and adopts the component
	 * values from the given tuple {@code (t)}.
	 * 
	 * @param t The tuple to adopt the component values from.
	 * 
	 * @return
	 * A new instance of the type of this tuple with the respective component
	 * values.
	 */
	ITup2R<V0,V1> createNew(ITup2R<V0,V1> t);
	
	/**
	 * Creates a new instance of the type of this tuple and adopts the component
	 * values from the given tuple {@code (v0, v1)}.
	 * 
	 * @param v0 The value of the first component.
	 * @param v1 The value of the second component.
	 * 
	 * @return
	 * A new instance of the type of this tuple with the respective component
	 * values.
	 */
	ITup2R<V0,V1> createNew(V0 v0, V1 v1);
	
	/**
	 * Returns the value of the first component of the tuple.
	 * 
	 * @return The value of the first component.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn; i.e. "v0") was
	 * introduced, as the original concept was too close to the naming
	 * conventions of vectors. Because not all tuples are necessarily vectors,
	 * the vector naming convention might be confusing to understand or could
	 * even create conflicts hence it was changed.
	 */
	V0 v0();
	
	/**
	 * Returns the value of the second component of the tuple.
	 * 
	 * @return The value of the second component.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn; i.e. "v0") was
	 * introduced, as the original concept was too close to the naming
	 * conventions of vectors. Because not all tuples are necessarily vectors,
	 * the vector naming convention might be confusing to understand or could
	 * even create conflicts hence it was changed.
	 */
	V1 v1();
	
	/**
	 * Creates a shallow copy of this tuple with adopted component values.
	 * Therefore it creates a new instance of the type of this tuple and
	 * adopts the component values from this tuple.
	 * 
	 * @return A shallow copy of this tuple with the component values adopted.
	 */
	ITup2R<V0,V1> copy();
	
	/**
	 * Returns if the component values of this tuple and the component values
	 * of the given tuple {@code t} are equal.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does require this tuple and the given
	 * tuple {@code t} to be the same instance.
	 * 
	 * @param t The tuple to compare with. May be null.
	 * 
	 * @return
	 * True, if the component values of this tuple and the component
	 * values of the given tuple {@code t} are equal. Otherwise false.
	 */
	boolean equals(@AllowNull ITup2R<V0,V1> t);
	
	/**
	 * Returns if the component values of this tuple and the component values
	 * of the given tuple {@code (v0, v1)} are equal.
	 * 
	 * @param v0 The value of the first component to compare with.
	 * @param v1 The value of the second component to compare with.
	 * 
	 * @return 
	 * True, if the component values of this tuple and the component
	 * values of the given tuple {@code (v0, v1)} are equal. Otherwise false.
	 */
	boolean equals(V0 v0, V1 v1);
	
	/**
	 * Returns if the first component value is {@code null}.
	 * 
	 * @return
	 * True, if the first component value is {@code null}. Otherwise false.
	 */
	boolean isV0Null();
	
	/**
	 * Returns if the second component value is {@code null}.
	 * 
	 * @return
	 * True, if the second component value is {@code null}. Otherwise false.
	 */
	boolean isV1Null();
}