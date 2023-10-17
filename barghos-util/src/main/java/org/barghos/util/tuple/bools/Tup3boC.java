package org.barghos.util.tuple.bools;

import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;
import org.barghos.util.tuple.bools.Tup3boC;

/**
 * This interface provides the common functions and methods for boolean tuples with three dimensions.
 */
public interface Tup3boC extends Tup3boR, TupboC
{
	/** {@inheritDoc}} */
	@Override
	Tup3boC createNew();
	
	/** {@inheritDoc}} */
	@Override
	default Tup3boC createNew(Tup3boR t)
	{
		return createNew(t.v0(), t.v1(), t.v2());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3boC createNew(@MinLength(3) boolean[] t)
	{
		return createNew(t[0], t[1], t[2]);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3boC createNew(boolean value)
	{
		return createNew(value, value, value);
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup3boC createNew(boolean v0, boolean v1, boolean v2);
	
	/**
	 * Sets the value of the first component of the tuple.
	 * 
	 * @param v0 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original concept was too close to the naming conventions
	 * of vectors. Because not all tuples are necessarily vectors, the vector naming convention might be confusing to understand or could even
	 * create conflicts hence it was changed.
	 */
	Tup3boC v0(boolean v0);
	
	/**
	 * Sets the value of the second component of the tuple.
	 * 
	 * @param v1 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original concept was too close to the naming conventions
	 * of vectors. Because not all tuples are necessarily vectors, the vector naming convention might be confusing to understand or could even
	 * create conflicts hence it was changed.
	 */
	Tup3boC v1(boolean v1);
	
	/**
	 * Sets the value of the third component of the tuple.
	 * 
	 * @param v2 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original concept was too close to the naming conventions
	 * of vectors. Because not all tuples are necessarily vectors, the vector naming convention might be confusing to understand or could even
	 * create conflicts hence it was changed.
	 */
	Tup3boC v2(boolean v2);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup3boR}.
	 * 
	 * @param t An existing implementation of {@link Tup3boR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup3boC set(Tup3boR t)
	{
		return set(t.v0(), t.v1(), t.v2());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3boC set(boolean value)
	{
		return set(value, value, value);
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
	default Tup3boC set(boolean v0, boolean v1, boolean v2)
	{
		v0(v0);
		v1(v1);
		v2(v2);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3boC set(@MinLength(3) TupboR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3boC setByIndex(@IntValueRange(min=0, max=2) int index, boolean value)
	{
		Objects.checkIndex(index, 3);
		
		switch(index)
		{
			case 0: return v0(value);
			case 1: return v1(value);
			case 2: return v2(value);
			default: throw new AssertionError(index);
		}
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3boC setArray(@MinLength(3) boolean... v)
	{
		return set(v[0], v[1], v[2]);
	}
	
	/** {@inheritDoc} */
	@Override
	Tup3boC copy();
}