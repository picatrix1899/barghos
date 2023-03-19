package org.barghos.tuple.api.t2;

import java.util.Objects;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.FloatMinValue;
import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;
import org.barghos.annotation.Nullable;

import org.barghos.tuple.api.tn.TupfR;

/**
 * This interface provides non invasive (readonly) functions and methods for float tuples with two dimensions.
 */
public interface Tup2fR extends TupfR
{
	/**
	 * {@inheritDoc}
	 * 
	 * <p>
	 * For any derivative or implementation of {@link Tup2fR} this will be two.
	 * 
	 * @apiNote Do not override this function, as it already returns the correct value for any two dimensional tuple.
	 */
	@Override
	default int getDimensions()
	{
		return 2;
	}
	
	/**
	 * Returns the value of the first component of the tuple.
	 * 
	 * @return The value of the first component.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original concept was too close to the naming conventions
	 * of vectors. Because not all tuples are necessarly vectors, the vector naming convention might be confusing to understand or could even
	 * create conflicts hence it was changed.
	 */
	float getV0();
	
	/**
	 * Returns the value of the second component of the tuple.
	 * 
	 * @return The value of the second component.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original concept was too close to the naming conventions
	 * of vectors. Because not all tuples are necessarly vectors, the vector naming convention might be confusing to understand or could even
	 * create conflicts hence it was changed.
	 */
	float getV1();
	
	/** {@inheritDoc} */
	@Override
	default float getByIndex(@IntValueRange(min=0, max=1) int index)
	{
		Objects.checkIndex(index, 2);

		switch(index)
		{
			case 0: return getV0();
			case 1: return getV1();
			
			default: throw new AssertionError(index);
		}
	}
	
	/** {@inheritDoc} */
	@Override
	default boolean isFinite()
	{
		return	Float.isFinite(getV0()) &&
				Float.isFinite(getV1());
	}
	
	/** {@inheritDoc} */
	@Override
	default boolean isZero()
	{
		return	getV0() == 0.0f &&
				getV1() == 0.0f;
	}
	
	/** {@inheritDoc} */
	@Override
	default boolean isZero(@FloatMinValue(0.0f) float tolerance)
	{
		if(tolerance < 0.0f) throw new IllegalArgumentException();
		
		return	Math.abs(getV0()) <= tolerance &&
				Math.abs(getV1()) <= tolerance;
	}
	
	/** {@inheritDoc} */
	@Override
	default float[] toArray(@ExtractionParam @MinLength(2) float[] res)
	{
		res[0] = getV0();
		res[1] = getV1();
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	Tup2fR copy();
	
	/**
	 * Compares the value of the components of this tuple and the given tuple and returns true,
	 * if the value of each component of this tuple is equal to the value of the corresponding component in the other tuple.
	 * 
	 * @param other The tuple to compare with.
	 * 
	 * @return True if this tuple is componentwise equal to the other tuple.
	 */
	default boolean equals(@Nullable Tup2fR other)
	{
		if(other == null) return false;
		if(this == other) return true;
		
		if(getV0() != other.getV0()) return false;
		if(getV1() != other.getV1()) return false;
		
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
	 * @return True if this tuple is componentwise equal to the other tuple.
	 */
	default boolean equals(@Nullable Tup2fR other, @FloatMinValue(0.0f) float tolerance)
	{
		if(other == null) return false;
		if(this == other) return true;
		
		if(Math.abs(getV0() - other.getV0()) > tolerance) return false;
		if(Math.abs(getV1() - other.getV1()) > tolerance) return false;
		
		return false;
	}
	
	/** {@inheritDoc} */
	@Override
	default boolean equals(@Nullable TupfR other)
	{
		if(other == null) return false;
		if(this == other) return true;
		if(other.getDimensions() != 2) return false;
		
		if(getV0() != other.getByIndex(0)) return false;
		if(getV1() != other.getByIndex(1)) return false;
		
		return true;
	}

	/** {@inheritDoc} */
	@Override
	default boolean equals(@Nullable TupfR other, @FloatMinValue(0.0f) float tolerance)
	{
		if(other == null) return false;
		if(this == other) return true;
		if(other.getDimensions() != 2) return false;
		
		if(Math.abs(getV0() - other.getByIndex(0)) > tolerance) return false;
		if(Math.abs(getV1() - other.getByIndex(1)) > tolerance) return false;
		
		return true;
	}
}