package org.barghos.util.tuple;

/**
 * This interface provides common operations for generic tuples with two
 * components.
 * 
 * @param <V0> The type of the first component.
 * @param <V1> The type of the second component.
 */
public interface ITup2W<V0,V1> extends ITup2R<V0,V1>
{
	/**
	 * Creates a new instance of the type of this tuple with all components
	 * left as default values.
	 * 
	 * @return
	 * A new instance of the type of this tuple with the respective component
	 * values.
	 */
	ITup2W<V0,V1> createNew();
	
	/** {@inheritDoc} */
	@Override
	ITup2W<V0,V1> createNew(ITup2R<V0,V1> t);
	
	/** {@inheritDoc} */
	@Override
	ITup2W<V0,V1> createNew(V0 v0, V1 v1);
	
	/**
	 * Sets the value of the first component of the tuple.
	 * 
	 * @param v0 The new value.
	 * 
	 * @return This tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn; i.e. "v0") was
	 * introduced, as the original concept was too close to the naming
	 * conventions of vectors. Because not all tuples are necessarily vectors,
	 * the vector naming convention might be confusing to understand or could
	 * even create conflicts hence it was changed.
	 */
	ITup2W<V0,V1> v0(V0 v0);
	
	/**
	 * Sets the value of the second component of the tuple.
	 * 
	 * @param v1 The new value.
	 * 
	 * @return This tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn; i.e. "v0") was
	 * introduced, as the original concept was too close to the naming
	 * conventions of vectors. Because not all tuples are necessarily vectors,
	 * the vector naming convention might be confusing to understand or could
	 * even create conflicts hence it was changed.
	 */
	ITup2W<V0,V1> v1(V1 v1);
	
	/**
	 * Adopts the component values from the given tuple {@code t}.
	 * 
	 * @param t The tuple to adopt the component values from.
	 * 
	 * @return This tuple.
	 */
	ITup2W<V0,V1> set(ITup2R<V0,V1> t);
	
	/**
	 * Adopts the component values from the given tuple {@code (v0, v1)}
	 * 
	 * @param v0 The new value of the first component.
	 * @param v1 The new value of the second component.
	 * 
	 * @return This tuple.
	 */
	ITup2W<V0,V1> set(V0 v0, V1 v1);
	
	/** {@inheritDoc} */
	@Override
	ITup2W<V0,V1> copy();
}