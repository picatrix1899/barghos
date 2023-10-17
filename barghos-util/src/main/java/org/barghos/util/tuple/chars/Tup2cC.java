package org.barghos.util.tuple.chars;

import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;
import org.barghos.util.tuple.chars.Tup2cC;

/**
 * This interface provides the common functions and methods for char tuples with two dimensions.
 */
public interface Tup2cC extends Tup2cR, TupcC
{
	/** {@inheritDoc}} */
	@Override
	Tup2cC createNew();
	
	/** {@inheritDoc}} */
	@Override
	default Tup2cC createNew(Tup2cR t)
	{
		return createNew(t.v0(), t.v1());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2cC createNew(@MinLength(2) char[] t)
	{
		return createNew(t[0], t[1]);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2cC createNew(char value)
	{
		return createNew(value, value);
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup2cC createNew(char v0, char v1);
	
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
	Tup2cC v0(char v0);
	
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
	Tup2cC v1(char v1);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup2cR}.
	 * 
	 * @param t An existing implementation of {@link Tup2cR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup2cC set(Tup2cR t)
	{
		return set(t.v0(), t.v1());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2cC set(char value)
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
	default Tup2cC set(char v0, char v1)
	{
		v0(v0);
		v1(v1);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2cC set(@MinLength(2) TupcR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2cC setByIndex(@IntValueRange(min=0, max=1) int index, char value)
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
	default Tup2cC setArray(@MinLength(2) char... v)
	{
		return set(v[0], v[1]);
	}
	
	/** {@inheritDoc} */
	@Override
	Tup2cC copy();
}