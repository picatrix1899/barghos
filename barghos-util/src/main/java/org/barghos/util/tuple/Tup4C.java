package org.barghos.util.tuple;

import org.barghos.validation.Validation;

/**
 * This interface provides the common functions and methods for object tuples
 * with four dimensions.
 * 
 * @param <V0> The type of the first component.
 * @param <V1> The type of the second component.
 * @param <V2> The type of the third component.
 * @param <V3> The type of the fourth component.
 */
public interface Tup4C<V0,V1,V2,V3> extends Tup4R<V0,V1,V2,V3>
{
	/** {@inheritDoc}} */
	@Override
	Tup4C<V0,V1,V2,V3> createNew();
	
	/** {@inheritDoc}} */
	@Override
	default Tup4C<V0,V1,V2,V3> createNew(Tup4R<V0,V1,V2,V3> t)
	{
		Validation.validateNotNull("t", t);
		
		return createNew(t.v0(), t.v1(), t.v2(), t.v3());
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup4C<V0,V1,V2,V3> createNew(V0 v0, V1 v1, V2 v2, V3 v3);
	
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
	Tup4C<V0,V1,V2,V3> v0(V0 v0);
	
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
	Tup4C<V0,V1,V2,V3> v1(V1 v1);
	
	/**
	 * Sets the value of the third component of the tuple.
	 * 
	 * @param v2 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced,
	 * as the original concept was too close to the naming conventions of
	 * vectors. Because not all tuples are necessarily vectors, the vector
	 * naming convention might be confusing to understand or could even create
	 * conflicts hence it was changed.
	 */
	Tup4C<V0,V1,V2,V3> v2(V2 v2);
	
	/**
	 * Sets the value of the fourth component of the tuple.
	 * 
	 * @param v3 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced,
	 * as the original concept was too close to the naming conventions of
	 * vectors. Because not all tuples are necessarily vectors, the vector
	 * naming convention might be confusing to understand or could even create
	 * conflicts hence it was changed.
	 */
	Tup4C<V0,V1,V2,V3> v3(V3 v3);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup4R}.
	 * 
	 * @param t An existing implementation of {@link Tup4R} to adopt the
	 * component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup4C<V0,V1,V2,V3> set(Tup4R<V0,V1,V2,V3> t)
	{
		Validation.validateNotNull("t", t);
		
		return set(t.v0(), t.v1(), t.v2(), t.v3());
	}
	
	/**
	 * Sets the values of all components to the corresponding parameters.
	 * 
	 * @param x The new value of the x component.
	 * @param y The new value of the y component.
	 * @param z The new value of the z component.
	 * @param w The new value of the w component.
	 * 
	 * @return The current tuple.
	 */
	default Tup4C<V0,V1,V2,V3> set(V0 v0, V1 v1, V2 v2, V3 v3)
	{
		v0(v0);
		v1(v1);
		v2(v2);
		v3(v3);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	Tup4C<V0,V1,V2,V3> copy();
}