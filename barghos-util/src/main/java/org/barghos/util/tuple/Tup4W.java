package org.barghos.util.tuple;

/**
 * This interface provides common operations for generic tuples with four
 * components.
 * 
 * @param <V0> The type of the first component.
 * @param <V1> The type of the second component.
 * @param <V2> The type of the third component.
 * @param <V3> The type of the fourth component.
 */
public interface Tup4W<V0,V1,V2,V3> extends Tup4R<V0,V1,V2,V3>
{
	/**
	 * Creates a new instance of the type of this tuple with all components
	 * left as default values.
	 * 
	 * @return
	 * A new instance of the type of this tuple with the respective component
	 * values.
	 */
	Tup4W<V0,V1,V2,V3> createNew();
	
	/** {@inheritDoc} */
	@Override
	Tup4W<V0,V1,V2,V3> createNew(Tup4R<V0,V1,V2,V3> t);
	
	/** {@inheritDoc} */
	@Override
	Tup4W<V0,V1,V2,V3> createNew(V0 v0, V1 v1, V2 v2, V3 v3);
	
	/**
	 * Sets the value of the first component of the tuple.
	 * 
	 * @param v0 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn; i.e. "v0") was
	 * introduced, as the original concept was too close to the naming
	 * conventions of vectors. Because not all tuples are necessarily vectors,
	 * the vector naming convention might be confusing to understand or could
	 * even create conflicts hence it was changed.
	 */
	Tup4W<V0,V1,V2,V3> v0(V0 v0);
	
	/**
	 * Sets the value of the second component of the tuple.
	 * 
	 * @param v1 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn; i.e. "v0") was
	 * introduced, as the original concept was too close to the naming
	 * conventions of vectors. Because not all tuples are necessarily vectors,
	 * the vector naming convention might be confusing to understand or could
	 * even create conflicts hence it was changed.
	 */
	Tup4W<V0,V1,V2,V3> v1(V1 v1);
	
	/**
	 * Sets the value of the third component of the tuple.
	 * 
	 * @param v2 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn; i.e. "v0") was
	 * introduced, as the original concept was too close to the naming
	 * conventions of vectors. Because not all tuples are necessarily vectors,
	 * the vector naming convention might be confusing to understand or could
	 * even create conflicts hence it was changed.
	 */
	Tup4W<V0,V1,V2,V3> v2(V2 v2);
	
	/**
	 * Sets the value of the fourth component of the tuple.
	 * 
	 * @param v3 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn; i.e. "v0") was
	 * introduced, as the original concept was too close to the naming
	 * conventions of vectors. Because not all tuples are necessarily vectors,
	 * the vector naming convention might be confusing to understand or could
	 * even create conflicts hence it was changed.
	 */
	Tup4W<V0,V1,V2,V3> v3(V3 v3);
	
	/**
	 * Adopts the component values from the given tuple {@code t}.
	 * 
	 * @param t The tuple to adopt the component values from.
	 * 
	 * @return This tuple.
	 */
	Tup4W<V0,V1,V2,V3> set(Tup4R<V0,V1,V2,V3> t);
	
	/**
	 * Adopts the component values from the given tuple {@code (v0, v1, v2, v3)}
	 * 
	 * @param v0 The new value of the first component.
	 * @param v1 The new value of the second component.
	 * @param v2 The new value of the third component.
	 * @param v2 The new value of the fourth component.
	 * 
	 * @return This tuple.
	 */
	Tup4W<V0,V1,V2,V3> set(V0 v0, V1 v1, V2 v2, V3 v3);
	
	/** {@inheritDoc} */
	@Override
	Tup4W<V0,V1,V2,V3> copy();
}