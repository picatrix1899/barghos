package org.barghos.util.tuple.bigds;

import java.math.BigDecimal;
import java.util.Objects;

import org.barghos.annotation.DoubleMinValue;
import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;
import org.barghos.annotation.Nullable;
import org.barghos.util.tuple.bigds.Tup3bigdR;

/**
 * This interface provides non-invasive (read only) functions and methods for {@link BigDecimal} tuples with three dimensions.
 */
public interface Tup3bigdR extends TupbigdR
{
	/**
	 * Creates a new instance of the type of this tuple.
	 * 
	 * @return A new instance.
	 */
	Tup3bigdR createNew();
	
	/**
	 * Creates a new instance of the type of this tuple and adopts the component values from the given tuple {@code (t)}.
	 * 
	 * @param t The tuple to adopt the component values from.
	 * 
	 * @return A new instance.
	 */
	default Tup3bigdR createNew(Tup3bigdR t)
	{
		return createNew(t.v0(), t.v1(), t.v2());
	}
	
	/**
	 * Creates a new instance of the type of this tuple and adopts the component values from the given tuple {@code (t[0], t[1], t[2])}.
	 * 
	 * @param t The tuple as an array with at least three entries to adopt the component values from.
	 * 
	 * @return A new instance.
	 */
	default Tup3bigdR createNew(@MinLength(3) BigDecimal[] t)
	{
		return createNew(t[0], t[1], t[2]);
	}
	
	/**
	 * Creates a new instance of the type of this tuple and sets the component values to the given value {@code (value)}.
	 * 
	 * @param value The value that will be used for all component values.
	 * 
	 * @return A new instance.
	 */
	default Tup3bigdR createNew(BigDecimal value)
	{
		return createNew(value, value, value);
	}
	
	/**
	 * Creates a new instance of the type of this tuple and adopts the component values from the given tuple {@code (v0, v1, v2)}.
	 * 
	 * @param v0 The new value of the first component.
	 * @param v1 The new value of the second component.
	 * @param v2 The new value of the third component.
	 * 
	 * @return A new instance.
	 */
	Tup3bigdR createNew(BigDecimal v0, BigDecimal v1, BigDecimal v2);
	
	/** {@inheritDoc}} */
	@Override
	default int dimensions()
	{
		return 3;
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
	BigDecimal v0();
	
	/**
	 * Returns the value of the second component of the tuple.
	 * 
	 * @return The value of the second component.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original concept was too close to the naming conventions
	 * of vectors. Because not all tuples are necessarily vectors, the vector naming convention might be confusing to understand or could even
	 * create conflicts hence it was changed.
	 */
	BigDecimal v1();
	
	/**
	 * Returns the value of the third component of the tuple.
	 * 
	 * @return The value of the third component.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original concept was too close to the naming conventions
	 * of vectors. Because not all tuples are necessarily vectors, the vector naming convention might be confusing to understand or could even
	 * create conflicts hence it was changed.
	 */
	BigDecimal v2();
	
	/** {@inheritDoc}} */
	@Override
	default BigDecimal getByIndex(@IntValueRange(min=0, max=2) int index)
	{
		Objects.checkIndex(index, 3);
		
		switch(index)
		{
			case 0: return v0();
			case 1: return v1();
			case 2: return v2();
			default: throw new AssertionError(index);
		}
	}
	
	/** {@inheritDoc}} */
	@Override
	default boolean isZero()
	{
		return	v0().compareTo(BigDecimal.ZERO) == 0 &&
				v1().compareTo(BigDecimal.ZERO) == 0 &&
				v2().compareTo(BigDecimal.ZERO) == 0;
	}
	
	/** {@inheritDoc}} */
	@Override
	default boolean isZero(@DoubleMinValue(0.0) BigDecimal tolerance)
	{
		if(tolerance.compareTo(BigDecimal.ZERO) < 0) throw new IllegalArgumentException();
		
		return	v0().abs().compareTo(tolerance) <= 0 &&
				v1().abs().compareTo(tolerance) <= 0 &&
				v2().abs().compareTo(tolerance) <= 0;
	}
	
	/** {@inheritDoc}} */
	@Override
	default BigDecimal[] toArray(@ExtractionParam @MinLength(3) BigDecimal[] res)
	{
		res[0] = v0();
		res[1] = v1();
		res[2] = v2();
		
		return res;
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup3bigdR copy();
	
	/**
	 * Compares the value of the components of this tuple and the given tuple and returns true,
	 * if the value of each component of this tuple is equal to the value of the corresponding component in the other tuple.
	 * 
	 * @param other The tuple to compare with.
	 * 
	 * @return True if this tuple is component-wise equal to the other tuple.
	 */
	default boolean equals(@Nullable Tup3bigdR other)
	{
		if(other == null) return false;
		if(other == this) return true;
		
		if(v0().compareTo(other.v0()) != 0) return false;
		if(v1().compareTo(other.v1()) != 0) return false;
		if(v2().compareTo(other.v2()) != 0) return false;
		
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
	default boolean equals(@Nullable Tup3bigdR other, @DoubleMinValue(0.0) BigDecimal tolerance)
	{
		if(other == null) return false;
		if(other == this) return true;
		
		if(v0().subtract(other.v0()).abs().compareTo(tolerance) > 0) return false;
		if(v1().subtract(other.v1()).abs().compareTo(tolerance) > 0) return false;
		if(v2().subtract(other.v2()).abs().compareTo(tolerance) > 0) return false;
		
		return false;
	}
	
	/** {@inheritDoc} */
	@Override
	default boolean equals(@Nullable TupbigdR other)
	{
		if(other == null) return false;
		if(other == this) return true;
		if(other.dimensions() != 3) return false;
		
		if(v0().compareTo(other.getByIndex(0)) != 0) return false;
		if(v1().compareTo(other.getByIndex(1)) != 0) return false;
		if(v2().compareTo(other.getByIndex(2)) != 0) return false;
		
		return true;
	}

	/** {@inheritDoc} */
	@Override
	default boolean equals(@Nullable TupbigdR other, @DoubleMinValue(0.0) BigDecimal tolerance)
	{
		if(other == null) return false;
		if(other == this) return true;
		if(other.dimensions() != 3) return false;
		
		if(v0().subtract(other.getByIndex(0)).abs().compareTo(tolerance) > 0) return false;
		if(v1().subtract(other.getByIndex(1)).abs().compareTo(tolerance) > 0) return false;
		if(v2().subtract(other.getByIndex(2)).abs().compareTo(tolerance) > 0) return false;
		
		return true;
	}
}