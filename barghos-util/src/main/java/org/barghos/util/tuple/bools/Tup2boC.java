package org.barghos.util.tuple.bools;

import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;
import org.barghos.util.tuple.bools.Tup2boC;

/**
 * This interface provides the common functions and methods for boolean tuples with two dimensions.
 */
public interface Tup2boC extends Tup2boR, TupboC
{
	/** {@inheritDoc}} */
	@Override
	Tup2boC createNew();
	
	/** {@inheritDoc}} */
	@Override
	default Tup2boC createNew(Tup2boR t)
	{
		return createNew(t.v0(), t.v1());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2boC createNew(@MinLength(2) boolean[] t)
	{
		return createNew(t[0], t[1]);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2boC createNew(boolean value)
	{
		return createNew(value, value);
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup2boC createNew(boolean v0, boolean v1);
	
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
	Tup2boC v0(boolean v0);
	
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
	Tup2boC v1(boolean v1);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup2boR}.
	 * 
	 * @param t An existing implementation of {@link Tup2boR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup2boC set(Tup2boR t)
	{
		return set(t.v0(), t.v1());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2boC set(boolean value)
	{
		return set(value, value);
	}
	
	/**
	 * Sets the values of all components to the corresponding parameters.
	 * 
	 * @param v0 The new value of the first component.
	 * @param v1 The new value of the second component.
	 * 
	 * @return The current tuple.
	 */
	default Tup2boC set(boolean v0, boolean v1)
	{
		v0(v0);
		v1(v1);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2boC set(@MinLength(2) TupboR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2boC setByIndex(@IntValueRange(min=0, max=1) int index, boolean value)
	{
		Objects.checkIndex(index, 2);
		
		switch(index)
		{
			case 0: return v0(value);
			case 1: return v1(value);
			
			default: throw new AssertionError(index);
		}
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2boC setArray(@MinLength(2) boolean... v)
	{
		return set(v[0], v[1]);
	}
	
	/** {@inheritDoc} */
	@Override
	Tup2boC copy();
}