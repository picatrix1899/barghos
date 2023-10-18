package org.barghos.util.tuple;

import org.barghos.util.tuple.Tup2C;
import org.barghos.validation.Validation;

/**
 * This interface provides the common functions and methods for object tuples
 * with two dimensions.
 * 
 * @param <V0> The type of the first component.
 * @param <V1> The type of the second component.
 */
public interface Tup2C<V0,V1> extends Tup2R<V0,V1>
{
	/** {@inheritDoc}} */
	@Override
	Tup2C<V0,V1> createNew();
	
	/** {@inheritDoc}} */
	@Override
	default Tup2C<V0,V1> createNew(Tup2R<V0,V1> t)
	{
		Validation.validateNotNull("t", t);
		
		return createNew(t.v0(), t.v1());
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup2C<V0,V1> createNew(V0 v0, V1 v1);
	
	/**
	 * Sets the value of the first component of the tuple.
	 * 
	 * @param v0 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced,
	 * as the original concept was too close to the naming conventions of
	 * vectors. Because not all tuples are necessarily vectors, the vector
	 * naming convention might be confusing to understand or could even create
	 * conflicts hence it was changed.
	 */
	Tup2C<V0,V1> v0(Object v0);
	
	/**
	 * Sets the value of the second component of the tuple.
	 * 
	 * @param v1 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced,
	 * as the original concept was too close to the naming conventions of
	 * vectors. Because not all tuples are necessarily vectors, the vector
	 * naming convention might be confusing to understand or could even create
	 * conflicts hence it was changed.
	 */
	Tup2C<V0,V1> v1(Object v1);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup2R}.
	 * 
	 * @param t An existing implementation of {@link Tup2R} to adopt the
	 * component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup2C<V0,V1> set(Tup2R<V0,V1> t)
	{
		Validation.validateNotNull("t", t);
		
		return set(t.v0(), t.v1());
	}
	
	/**
	 * Sets the values of all components to the corresponding parameters.
	 * 
	 * @param v0 The new value of the first component.
	 * @param v1 The new value of the second component.
	 * 
	 * @return The current tuple.
	 */
	default Tup2C<V0,V1> set(V0 v0, V1 v1)
	{
		v0(v0);
		v1(v1);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	Tup2C<V0,V1> copy();
}