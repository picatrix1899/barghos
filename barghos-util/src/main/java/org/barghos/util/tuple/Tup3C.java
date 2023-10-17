package org.barghos.util.tuple;

import org.barghos.util.tuple.Tup3C;
import org.barghos.validation.Validation;

/**
 * This interface provides the common functions and methods for object tuples with three dimensions.
 * 
 * @param <V0> The type of the first component.
 * @param <V1> The type of the second component.
 * @param <V2> The type of the third component.
 */
public interface Tup3C<V0,V1,V2> extends Tup3R<V0,V1,V2>
{
	/** {@inheritDoc}} */
	@Override
	Tup3C<V0,V1,V2> createNew();
	
	/** {@inheritDoc}} */
	@Override
	default Tup3C<V0,V1,V2> createNew(Tup3R<V0,V1,V2> t)
	{
		Validation.validateNotNull("t", t);
		
		return createNew(t.v0(), t.v1(), t.v2());
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup3C<V0,V1,V2> createNew(V0 v0, V1 v1, V2 v2);
	
	/**
	 * Sets the value of the first component of the tuple.
	 * 
	 * @param v0 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original
	 * concept was too close to the naming conventions of vectors. Because not all tuples are
	 * necessarily vectors, the vector naming convention might be confusing to understand or could
	 * even create conflicts hence it was changed.
	 */
	Tup3C<V0,V1,V2> v0(V0 v0);
	
	/**
	 * Sets the value of the second component of the tuple.
	 * 
	 * @param v1 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original
	 * concept was too close to the naming conventions of vectors. Because not all tuples are
	 * necessarily vectors, the vector naming convention might be confusing to understand or could
	 * even create conflicts hence it was changed.
	 */
	Tup3C<V0,V1,V2> v1(V1 v1);
	
	/**
	 * Sets the value of the third component of the tuple.
	 * 
	 * @param v2 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original
	 * concept was too close to the naming conventions of vectors. Because not all tuples are
	 * necessarily vectors, the vector naming convention might be confusing to understand or could
	 * even create conflicts hence it was changed.
	 */
	Tup3C<V0,V1,V2> v2(V2 v2);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup3R}.
	 * 
	 * @param t An existing implementation of {@link Tup3R} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup3C<V0,V1,V2> set(Tup3R<V0,V1,V2> t)
	{
		Validation.validateNotNull("t", t);
		
		return set(t.v0(), t.v1(), t.v2());
	}
	
	/**
	 * Sets the values of all components to the corresponding parameters.
	 * 
	 * @param v0 The new value of the first component.
	 * @param v1 The new value of the second component.
	 * @param v2 The new value of the third component.
	 * 
	 * @return The current tuple.
	 */
	default Tup3C<V0,V1,V2> set(V0 v0, V1 v1, V2 v2)
	{
		v0(v0);
		v1(v1);
		v2(v2);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	Tup3C<V0,V1,V2> copy();
}