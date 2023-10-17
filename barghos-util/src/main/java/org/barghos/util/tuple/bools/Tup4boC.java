package org.barghos.util.tuple.bools;

import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;

/**
 * This interface provides the common functions and methods for boolean tuples with four dimensions.
 */
public interface Tup4boC extends Tup4boR, TupboC
{
	/** {@inheritDoc}} */
	@Override
	Tup4boC createNew();
	
	/** {@inheritDoc}} */
	@Override
	default Tup4boC createNew(Tup4boR t)
	{
		return createNew(t.v0(), t.v1(), t.v2(), t.v3());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4boC createNew(@MinLength(4) boolean[] t)
	{
		return createNew(t[0], t[1], t[2], t[3]);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4boC createNew(boolean value)
	{
		return createNew(value, value, value, value);
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup4boC createNew(boolean v0, boolean v1, boolean v2, boolean v3);
	
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
	Tup4boC v0(boolean v0);
	
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
	Tup4boC v1(boolean v1);
	
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
	Tup4boC v2(boolean v2);
	
	/**
	 * Sets the value of the fourth component of the tuple.
	 * 
	 * @param v3 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original concept was too close to the naming conventions
	 * of vectors. Because not all tuples are necessarily vectors, the vector naming convention might be confusing to understand or could even
	 * create conflicts hence it was changed.
	 */
	Tup4boC v3(boolean v3);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup4boR}.
	 * 
	 * @param t An existing implementation of {@link Tup4boR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup4boC set(Tup4boR t)
	{
		return set(t.v0(), t.v1(), t.v2(), t.v3());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4boC set(boolean value)
	{
		return set(value, value, value, value);
	}
	
	/**
	 * Sets the values of all components to the corresponding parameters.
	 * 
	 * @param v0 The new value of the first component.
	 * @param v1 The new value of the second component.
	 * @param v2 The new value of the third component.
	 * @param v2 The new value of the fourth component.
	 * 
	 * @return The current tuple.
	 */
	default Tup4boC set(boolean v0, boolean v1, boolean v2, boolean v3)
	{
		v0(v0);
		v1(v1);
		v2(v2);
		v3(v3);
		
		return this;
	}

	/** {@inheritDoc}} */
	@Override
	default Tup4boC set(@MinLength(4) TupboR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4boC setByIndex(@IntValueRange(min=0, max=3) int index, boolean value)
	{
		Objects.checkIndex(index, 4);
		
		switch(index)
		{
			case 0: return v0(value);
			case 1: return v1(value);
			case 2: return v2(value);
			case 3: return v3(value);
			default: throw new AssertionError(index);
		}
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4boC setArray(@MinLength(4) boolean... v)
	{
		return set(v[0], v[1], v[2], v[3]);
	}
	
	/** {@inheritDoc} */
	@Override
	Tup4boC copy();
}