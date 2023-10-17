package org.barghos.util.tuple.bigis;

import java.math.BigInteger;
import java.util.Objects;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.IntMinValue;
import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;
import org.barghos.annotation.Nullable;
import org.barghos.util.tuple.bigis.Tup2bigiR;

/**
 * This interface provides non-invasive (read only) functions and methods for {@link BigInteger} tuples with two dimensions.
 */
public interface Tup2bigiR extends TupbigiR
{
	/**
	 * Creates a new instance of the type of this tuple.
	 * 
	 * @return A new instance.
	 */
	Tup2bigiR createNew();
	
	/**
	 * Creates a new instance of the type of this tuple and adopts the component values from the given tuple {@code (t)}.
	 * 
	 * @param t The tuple to adopt the component values from.
	 * 
	 * @return A new instance.
	 */
	default Tup2bigiR createNew(Tup2bigiR t)
	{
		return createNew(t.v0(), t.v1());
	}
	
	/**
	 * Creates a new instance of the type of this tuple and adopts the component values from the given tuple {@code (t[0], t[1])}.
	 * 
	 * @param t The tuple as an array with at least two entries to adopt the component values from.
	 * 
	 * @return A new instance.
	 */
	default Tup2bigiR createNew(@MinLength(2) BigInteger[] t)
	{
		return createNew(t[0], t[1]);
	}
	
	/**
	 * Creates a new instance of the type of this tuple and sets the component values to the given value {@code (value)}.
	 * 
	 * @param value The value that will be used for all component values.
	 * 
	 * @return A new instance.
	 */
	default Tup2bigiR createNew(BigInteger value)
	{
		return createNew(value, value);
	}
	
	/**
	 * Creates a new instance of the type of this tuple and adopts the component values from the given tuple {@code (v0, v1)}.
	 * 
	 * @param v0 The new value of the first component.
	 * @param v1 The new value of the second component.
	 * 
	 * @return A new instance.
	 */
	Tup2bigiR createNew(BigInteger v0, BigInteger v1);
	
	/** {@inheritDoc} */
	@Override
	default int dimensions()
	{
		return 2;
	}
	
	/**
	 * Returns the value of the first component of the tuple.
	 * 
	 * @return The value of the first component.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original concept was too close to the naming conventions
	 * of vectors. Because not all tuples are necessarily vectors, the vector naming convention might be confusing to understand or could even
	 * create conflicts hence it was changed.
	 */
	BigInteger v0();
	
	/**
	 * Returns the value of the second component of the tuple.
	 * 
	 * @return The value of the second component.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original concept was too close to the naming conventions
	 * of vectors. Because not all tuples are necessarily vectors, the vector naming convention might be confusing to understand or could even
	 * create conflicts hence it was changed.
	 */
	BigInteger v1();
	
	/** {@inheritDoc} */
	@Override
	default BigInteger getByIndex(@IntValueRange(min=0, max=1) int index)
	{
		Objects.checkIndex(index, 2);

		switch(index)
		{
			case 0: return v0();
			case 1: return v1();
			
			default: throw new AssertionError(index);
		}
	}
	
	/** {@inheritDoc} */
	@Override
	default boolean isZero()
	{
		return	v0().compareTo(BigInteger.ZERO) == 0 &&
				v1().compareTo(BigInteger.ZERO) == 0;
	}
	
	/** {@inheritDoc} */
	@Override
	default boolean isZero(@IntMinValue(0) BigInteger tolerance)
	{
		if(tolerance.compareTo(BigInteger.ZERO) < 0) throw new IllegalArgumentException();
		
		return	v0().abs().compareTo(tolerance) <= 0 &&
				v1().abs().compareTo(tolerance) <= 0;
	}
	
	/** {@inheritDoc} */
	@Override
	default BigInteger[] toArray(@ExtractionParam @MinLength(2) BigInteger[] res)
	{
		res[0] = v0();
		res[1] = v1();
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	Tup2bigiR copy();
	
	/**
	 * Compares the value of the components of this tuple and the given tuple and returns true,
	 * if the value of each component of this tuple is equal to the value of the corresponding component in the other tuple.
	 * 
	 * @param other The tuple to compare with.
	 * 
	 * @return True if this tuple is component-wise equal to the other tuple.
	 */
	default boolean equals(@Nullable Tup2bigiR other)
	{
		if(other == null) return false;
		if(other == this) return true;
		
		if(v0().compareTo(other.v0()) != 0) return false;
		if(v1().compareTo(other.v1()) != 0) return false;
		
		return true;
	}
	
	/**
	 * Compares the value of the components of this tuple and the given tuple and returns true,
	 * if the value of each component of this tuple is equal to or within an inclusive margin of the given tolerance around
	 * the value of the corresponding component in the other tuple.
	 * 
	 * @param other The tuple to compare with.
	 * @param tolerance The tolerance that defines the margin.
	 * 
	 * @return True if this tuple is component-wise equal to the other tuple.
	 */
	default boolean equals(@Nullable Tup2bigiR other, @IntMinValue(0) BigInteger tolerance)
	{
		if(other == null) return false;
		if(other == this) return true;
		
		if(v0().subtract(other.v0()).abs().compareTo(tolerance) > 0) return false;
		if(v1().subtract(other.v1()).abs().compareTo(tolerance) > 0) return false;
		
		return false;
	}
	
	/** {@inheritDoc} */
	@Override
	default boolean equals(@Nullable TupbigiR other)
	{
		if(other == null) return false;
		if(other == this) return true;
		if(other.dimensions() != 2) return false;
		
		if(v0().compareTo(other.getByIndex(0)) != 0) return false;
		if(v1().compareTo(other.getByIndex(1)) != 0) return false;
		
		return true;
	}

	/** {@inheritDoc} */
	@Override
	default boolean equals(@Nullable TupbigiR other, @IntMinValue(0) BigInteger tolerance)
	{
		if(other == null) return false;
		if(other == this) return true;
		if(other.dimensions() != 2) return false;
		
		if(v0().subtract(other.getByIndex(0)).abs().compareTo(tolerance) > 0) return false;
		if(v1().subtract(other.getByIndex(1)).abs().compareTo(tolerance) > 0) return false;
		
		return true;
	}
}