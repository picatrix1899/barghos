package org.barghos.util.tuple.floats;

import java.util.Objects;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.FloatMinValue;
import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;
import org.barghos.annotation.Nullable;

/**
 * This interface provides non-invasive (read only) functions and methods for float tuples with four dimensions.
 */
public interface Tup4fR extends TupfR
{
	/**
	 * Creates a new instance of the type of this tuple.
	 * 
	 * @return A new instance.
	 */
	Tup4fR createNew();
	
	/**
	 * Creates a new instance of the type of this tuple and adopts the component values from the given tuple {@code (t)}.
	 * 
	 * @param t The tuple to adopt the component values from.
	 * 
	 * @return A new instance.
	 */
	default Tup4fR createNew(Tup4fR t)
	{
		return createNew(t.v0(), t.v1(), t.v2(), t.v3());
	}
	
	/**
	 * Creates a new instance of the type of this tuple and adopts the component values from the given tuple {@code (t[0], t[1], t[2], t[3])}.
	 * 
	 * @param t The tuple as an array with at least three entries to adopt the component values from.
	 * 
	 * @return A new instance.
	 */
	default Tup4fR createNew(@MinLength(4) float[] t)
	{
		return createNew(t[0], t[1], t[2], t[3]);
	}
	
	/**
	 * Creates a new instance of the type of this tuple and sets the component values to the given value {@code (value)}.
	 * 
	 * @param value The value that will be used for all component values.
	 * 
	 * @return A new instance.
	 */
	default Tup4fR createNew(float value)
	{
		return createNew(value, value, value, value);
	}
	
	/**
	 * Creates a new instance of the type of this tuple and adopts the component values from the given tuple {@code (v0, v1, v2, v3)}.
	 * 
	 * @param v0 The new value of the first component.
	 * @param v1 The new value of the second component.
	 * @param v2 The new value of the third component.
	 * @param v3 The new value of the fourth component.
	 * 
	 * @return A new instance.
	 */
	Tup4fR createNew(float v0, float v1, float v2, float v3);
	
	/**
	 * {@inheritDoc}
	 * 
	 * <p>
	 * For any derivative or implementation of {@link Tup4fR} this will be two.
	 * 
	 * @apiNote Do not override this function, as it already returns the correct value for any four dimensional tuple.
	 */
	@Override
	default int dimensions()
	{
		return 4;
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
	float v0();
	
	/**
	 * Returns the value of the second component of the tuple.
	 * 
	 * @return The value of the second component.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original concept was too close to the naming conventions
	 * of vectors. Because not all tuples are necessarily vectors, the vector naming convention might be confusing to understand or could even
	 * create conflicts hence it was changed.
	 */
	float v1();
	
	/**
	 * Returns the value of the third component of the tuple.
	 * 
	 * @return The value of the third component.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original concept was too close to the naming conventions
	 * of vectors. Because not all tuples are necessarily vectors, the vector naming convention might be confusing to understand or could even
	 * create conflicts hence it was changed.
	 */
	float v2();
	
	/**
	 * Returns the value of the fourth component of the tuple.
	 * 
	 * @return The value of the fourth component.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original concept was too close to the naming conventions
	 * of vectors. Because not all tuples are necessarily vectors, the vector naming convention might be confusing to understand or could even
	 * create conflicts hence it was changed.
	 */
	float v3();
	
	/** {@inheritDoc}} */
	@Override
	default float getByIndex(@IntValueRange(min=0, max=3) int index)
	{
		Objects.checkIndex(index, 4);
		
		switch(index)
		{
			case 0: return v0();
			case 1: return v1();
			case 2: return v2();
			case 3: return v3();
			default: throw new AssertionError(index);
		}
	}
	
	/** {@inheritDoc}} */
	@Override
	default boolean isFinite()
	{
		return	Float.isFinite(v0()) &&
				Float.isFinite(v1()) &&
				Float.isFinite(v2()) &&
				Float.isFinite(v3());
	}
	
	/** {@inheritDoc}} */
	@Override
	default boolean isZero()
	{
		return	v0() == 0.0f &&
				v1() == 0.0f &&
				v2() == 0.0f &&
				v3() == 0.0f;
	}
	
	/** {@inheritDoc}} */
	@Override
	default boolean isZero(@FloatMinValue(0.0f) float tolerance)
	{
		if(tolerance < 0.0f) throw new IllegalArgumentException();
		
		return	Math.abs(v0()) <= tolerance &&
				Math.abs(v1()) <= tolerance &&
				Math.abs(v2()) <= tolerance &&
				Math.abs(v3()) <= tolerance;
	}
	
	/** {@inheritDoc}} */
	@Override
	default float[] toArray(@ExtractionParam @MinLength(4) float[] res)
	{
		res[0] = v0();
		res[1] = v1();
		res[2] = v2();
		res[3] = v3();
		
		return res;
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup4fR copy();
	
	/**
	 * Compares the value of the components of this tuple and the given tuple and returns true,
	 * if the value of each component of this tuple is equal to the value of the corresponding component in the other tuple.
	 * 
	 * @param other The tuple to compare with.
	 * 
	 * @return True if this tuple is component-wise equal to the other tuple.
	 */
	default boolean equals(@Nullable Tup4fR other)
	{
		if(other == null) return false;
		if(other == this) return true;
		
		if(v0() != other.v0()) return false;
		if(v1() != other.v1()) return false;
		if(v2() != other.v2()) return false;
		if(v3() != other.v3()) return false;
		
		return true;
	}
	
	/**
	 * Compares the value of the components of this tuple and the given tuple and returns true,
	 * if the value of each component of this tuple is equal to or within an inclusive margin of the given tolerance around
	 * the value of the corresponding component in the other tuple.
	 * 
	 * @param other The tuple to compare with.
	 * @param tolerance The tolerance that defines the margin.
	 * @return True if this tuple is component-wise equal to the other tuple.
	 */
	default boolean equals(@Nullable Tup4fR other, @FloatMinValue(0.0f) float tolerance)
	{
		if(other == null) return false;
		if(other == this) return true;
		
		if(Math.abs(v0() - other.v0()) > tolerance) return false;
		if(Math.abs(v1() - other.v1()) > tolerance) return false;
		if(Math.abs(v2() - other.v2()) > tolerance) return false;
		if(Math.abs(v3() - other.v3()) > tolerance) return false;
		
		return false;
	}
	
	/** {@inheritDoc} */
	@Override
	default boolean equals(@Nullable TupfR other)
	{
		if(other == null) return false;
		if(other == this) return true;
		if(other.dimensions() != 4) return false;
		
		if(v0() != other.getByIndex(0)) return false;
		if(v1() != other.getByIndex(1)) return false;
		if(v2() != other.getByIndex(2)) return false;
		if(v3() != other.getByIndex(3)) return false;
		
		return true;
	}

	/** {@inheritDoc} */
	@Override
	default boolean equals(@Nullable TupfR other, @FloatMinValue(0.0f) float tolerance)
	{
		if(other == null) return false;
		if(other == this) return true;
		if(other.dimensions() != 4) return false;
		
		if(Math.abs(v0() - other.getByIndex(0)) > tolerance) return false;
		if(Math.abs(v1() - other.getByIndex(1)) > tolerance) return false;
		if(Math.abs(v2() - other.getByIndex(2)) > tolerance) return false;
		if(Math.abs(v3() - other.getByIndex(3)) > tolerance) return false;
		
		return true;
	}
}