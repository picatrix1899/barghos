package org.barghos.util.tuple;

import org.barghos.annotation.Nullable;

/**
 * This interface provides non-modifying operations for generic tuples with
 * three components.
 * 
 * @param <V0> The type of the first component.
 * @param <V1> The type of the second component.
 * @param <V2> The type of the third component.
 */
public interface Tup3R<V0,V1,V2>
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
	Tup3R<V0,V1,V2> createNew(Tup3R<V0,V1,V2> t);
	
	/**
	 * Creates a new instance of the type of this tuple and adopts the component
	 * values from the given tuple {@code (v0, v1, v2)}.
	 * 
	 * @param v0 The value of the first component.
	 * @param v1 The value of the second component.
	 * @param v2 The value of the third component.
	 * 
	 * @return
	 * A new instance of the type of this tuple with the respective component
	 * values.
	 */
	Tup3R<V0,V1,V2> createNew(V0 v0, V1 v1, V2 v2);
	
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
	 * Returns the value of the third component of the tuple.
	 * 
	 * @return The value of the third component.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn; i.e. "v0") was
	 * introduced, as the original concept was too close to the naming
	 * conventions of vectors. Because not all tuples are necessarily vectors,
	 * the vector naming convention might be confusing to understand or could
	 * even create conflicts hence it was changed.
	 */
	V2 v2();
	
	/**
	 * Creates a shallow copy of this tuple with adopted component values.
	 * Therefore it creates a new instance of the type of this tuple and
	 * adopts the component values from this tuple.
	 * 
	 * @return A shallow copy of this tuple with the component values adopted.
	 */
	Tup3R<V0,V1,V2> copy();
	
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
	boolean equals(@Nullable Tup3R<V0,V1,V2> t);
	
	/**
	 * Returns if the component values of this tuple and the component values
	 * of the given tuple {@code (v0, v1, v2)} are equal.
	 * 
	 * @param v0 The value of the first component to compare with.
	 * @param v1 The value of the second component to compare with.
	 * @param v2 The value of the third component to compare with.
	 * 
	 * @return 
	 * True, if the component values of this tuple and the component
	 * values of the given tuple {@code (v0, v1, v2)} are equal. Otherwise
	 * false.
	 */
	boolean equals(V0 v0, V1 v1, V2 v2);
	
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
	
	/**
	 * Returns if the third component value is {@code null}.
	 * 
	 * @return
	 * True, if the third component value is {@code null}. Otherwise false.
	 */
	boolean isV2Null();
}