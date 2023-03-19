package org.barghos.tuple.api.t4;

import java.util.Objects;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.FloatMinValue;
import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;
import org.barghos.annotation.Nullable;

import org.barghos.tuple.api.tn.TupfR;

/**
 * This interface provides non invasive (readonly) functions and methods for float tuples with four dimensions.
 */
public interface Tup4fR extends TupfR
{
	/**
	 * {@inheritDoc}
	 * 
	 * <p>
	 * For any derivative or implementation of {@link Tup4fR} this will be two.
	 * 
	 * @apiNote Do not override this function, as it already returns the correct value for any four dimensional tuple.
	 */
	@Override
	default int getDimensions()
	{
		return 4;
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
	
	/**
	 * Returns the value of the third component of the tuple.
	 * 
	 * @return The value of the third component.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original concept was too close to the naming conventions
	 * of vectors. Because not all tuples are necessarly vectors, the vector naming convention might be confusing to understand or could even
	 * create conflicts hence it was changed.
	 */
	float getV2();
	
	/**
	 * Returns the value of the fourth component of the tuple.
	 * 
	 * @return The value of the fourth component.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original concept was too close to the naming conventions
	 * of vectors. Because not all tuples are necessarly vectors, the vector naming convention might be confusing to understand or could even
	 * create conflicts hence it was changed.
	 */
	float getV3();
	
	/** {@inheritDoc}} */
	@Override
	default float getByIndex(@IntValueRange(min=0, max=3) int index)
	{
		Objects.checkIndex(index, 4);
		
		switch(index)
		{
			case 0: return getV0();
			case 1: return getV1();
			case 2: return getV2();
			case 3: return getV3();
			default: throw new AssertionError(index);
		}
	}
	
	/** {@inheritDoc}} */
	@Override
	default boolean isFinite()
	{
		return	Float.isFinite(getV0()) &&
				Float.isFinite(getV1()) &&
				Float.isFinite(getV2()) &&
				Float.isFinite(getV3());
	}
	
	/** {@inheritDoc}} */
	@Override
	default boolean isZero()
	{
		return	getV0() == 0.0f &&
				getV1() == 0.0f &&
				getV2() == 0.0f &&
				getV3() == 0.0f;
	}
	
	/** {@inheritDoc}} */
	@Override
	default boolean isZero(@FloatMinValue(0.0f) float tolerance)
	{
		if(tolerance < 0.0f) throw new IllegalArgumentException();
		
		return	Math.abs(getV0()) <= tolerance &&
				Math.abs(getV1()) <= tolerance &&
				Math.abs(getV2()) <= tolerance &&
				Math.abs(getV3()) <= tolerance;
	}
	
	/** {@inheritDoc}} */
	@Override
	default float[] toArray(@ExtractionParam @MinLength(4) float[] res)
	{
		res[0] = getV0();
		res[1] = getV1();
		res[2] = getV2();
		res[3] = getV3();
		
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
	 * @return True if this tuple is componentwise equal to the other tuple.
	 */
	default boolean equals(@Nullable Tup4fR other)
	{
		if(other == null) return false;
		if(this == other) return true;
		
		if(getV0() != other.getV0()) return false;
		if(getV1() != other.getV1()) return false;
		if(getV2() != other.getV2()) return false;
		if(getV3() != other.getV3()) return false;
		
		return true;
	}
	
	/**
	 * Compares the value of the components of this tuple and the given tuple and returns true,
	 * if the value of each component of this tuple is equal to or within an inclusive margin of the given tolerance around
	 * the value of the corresponding component in the other tuple.
	 * 
	 * @param other The tuple to compare with.
	 * @param tolerance The tolerance that defines the margin.
	 * @return True if this tuple is componentwise equal to the other tuple.
	 */
	default boolean equals(@Nullable Tup4fR other, @FloatMinValue(0.0f) float tolerance)
	{
		if(other == null) return false;
		if(this == other) return true;
		
		if(Math.abs(getV0() - other.getV0()) > tolerance) return false;
		if(Math.abs(getV1() - other.getV1()) > tolerance) return false;
		if(Math.abs(getV2() - other.getV2()) > tolerance) return false;
		if(Math.abs(getV3() - other.getV3()) > tolerance) return false;
		
		return false;
	}
	
	/** {@inheritDoc} */
	@Override
	default boolean equals(@Nullable TupfR other)
	{
		if(other == null) return false;
		if(this == other) return true;
		if(other.getDimensions() != 4) return false;
		
		if(getV0() != other.getByIndex(0)) return false;
		if(getV1() != other.getByIndex(1)) return false;
		if(getV2() != other.getByIndex(2)) return false;
		if(getV3() != other.getByIndex(3)) return false;
		
		return true;
	}

	/** {@inheritDoc} */
	@Override
	default boolean equals(@Nullable TupfR other, @FloatMinValue(0.0f) float tolerance)
	{
		if(other == null) return false;
		if(this == other) return true;
		if(other.getDimensions() != 4) return false;
		
		if(Math.abs(getV0() - other.getByIndex(0)) > tolerance) return false;
		if(Math.abs(getV1() - other.getByIndex(1)) > tolerance) return false;
		if(Math.abs(getV2() - other.getByIndex(2)) > tolerance) return false;
		if(Math.abs(getV3() - other.getByIndex(3)) > tolerance) return false;
		
		return true;
	}
}