package org.barghos.util.tuple.bigis;

import java.math.BigInteger;
import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;
import org.barghos.util.tuple.bigis.Tup3bigiC;

/**
 * This interface provides the common functions and methods for {@link BigInteger} tuples with three dimensions.
 */
public interface Tup3bigiC extends Tup3bigiR, TupbigiC
{
	/** {@inheritDoc}} */
	@Override
	Tup3bigiC createNew();
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bigiC createNew(Tup3bigiR t)
	{
		return createNew(t.v0(), t.v1(), t.v2());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bigiC createNew(@MinLength(3) BigInteger[] t)
	{
		return createNew(t[0], t[1], t[2]);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bigiC createNew(BigInteger value)
	{
		return createNew(value, value, value);
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup3bigiC createNew(BigInteger v0, BigInteger v1, BigInteger v2);
	
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
	Tup3bigiC v0(BigInteger v0);
	
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
	Tup3bigiC v1(BigInteger v1);
	
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
	Tup3bigiC v2(BigInteger v2);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup3bigiR}.
	 * 
	 * @param t An existing implementation of {@link Tup3bigiR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup3bigiC set(Tup3bigiR t)
	{
		return set(t.v0(), t.v1(), t.v2());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bigiC set(BigInteger value)
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
	default Tup3bigiC set(BigInteger v0, BigInteger v1, BigInteger v2)
	{
		v0(v0);
		v1(v1);
		v2(v2);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bigiC set(@MinLength(3) TupbigiR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bigiC setByIndex(@IntValueRange(min=0, max=2) int index, BigInteger value)
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
	default Tup3bigiC setArray(@MinLength(3) BigInteger... values)
	{
		return set(values[0], values[1], values[2]);
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup3bigiC copy();
}