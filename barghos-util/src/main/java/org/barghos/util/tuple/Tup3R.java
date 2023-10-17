package org.barghos.util.tuple;

import org.barghos.annotation.Nullable;
import org.barghos.util.tuple.Tup3R;
import org.barghos.validation.Validation;

/**
 * This interface provides non-invasive (read only) functions and methods for object tuples with
 * three dimensions.
 * 
 * @param <V0> The type of the first component.
 * @param <V1> The type of the second component.
 * @param <V2> The type of the third component.
 */
public interface Tup3R<V0,V1,V2>
{
	/**
	 * Creates a new instance of the type of this tuple.
	 * 
	 * @return A new instance.
	 */
	Tup3R<V0,V1,V2> createNew();
	
	/**
	 * Creates a new instance of the type of this tuple and adopts the component values from the
	 * given tuple {@code (t)}.
	 * 
	 * @param t The tuple to adopt the component values from.
	 * 
	 * @return A new instance.
	 */
	default Tup3R<V0,V1,V2> createNew(Tup3R<V0,V1,V2> t)
	{
		Validation.validateNotNull("t", t);
		
		return createNew(t.v0(), t.v1(), t.v2());
	}
	
	/**
	 * Creates a new instance of the type of this tuple and adopts the component values from the
	 * given tuple {@code (v0, v1, v2)}.
	 * 
	 * @param v0 The new value of the first component.
	 * @param v1 The new value of the second component.
	 * @param v2 The new value of the third component.
	 * 
	 * @return A new instance.
	 */
	Tup3R<V0,V1,V2> createNew(V0 v0, V1 v1, V2 v2);
	
	/**
	 * Returns the value of the first component of the tuple.
	 * 
	 * @return The value of the first component.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original
	 * concept was too close to the naming conventions of vectors. Because not all tuples are
	 * necessarily vectors, the vector naming convention might be confusing to understand or could
	 * even create conflicts hence it was changed.
	 */
	V0 v0();
	
	/**
	 * Returns the value of the second component of the tuple.
	 * 
	 * @return The value of the second component.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original
	 * concept was too close to the naming conventions of vectors. Because not all tuples are
	 * necessarily vectors, the vector naming convention might be confusing to understand or could
	 * even create conflicts hence it was changed.
	 */
	V1 v1();
	
	/**
	 * Returns the value of the third component of the tuple.
	 * 
	 * @return The value of the third component.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original
	 * concept was too close to the naming conventions of vectors. Because not all tuples are
	 * necessarily vectors, the vector naming convention might be confusing to understand or could
	 * even create conflicts hence it was changed.
	 */
	V2 v2();
	
	/**
	 * Copies the component values to a new instance of the current type.
	 * 
	 * @return A new instance of the current tuple with the same component values.
	 */
	Tup3R<V0,V1,V2> copy();
	
	/**
	 * Compares the value of the components of this tuple and the given tuple and returns true,
	 * if the value of each component of this tuple is equal to the value of the corresponding
	 * component in the other tuple.
	 * 
	 * @param other The tuple to compare with.
	 * 
	 * @return True if this tuple is component-wise equal to the other tuple.
	 */
	default boolean equals(@Nullable Tup3R<V0,V1,V2> other)
	{
		if(other == null) return false;
		if(other == this) return true;
		
		if(!v0().equals(other.v0())) return false;
		if(!v1().equals(other.v1())) return false;
		if(!v2().equals(other.v2())) return false;
		
		return true;
	}
}