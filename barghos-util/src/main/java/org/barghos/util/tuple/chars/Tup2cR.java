package org.barghos.util.tuple.chars;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;
import org.barghos.annotation.Nullable;

import org.barghos.util.consumer.Consumer2;
import org.barghos.util.consumer.chars.Consumer2c;

import org.barghos.validation.Validation;

/**
 * This interface provides non invasive (read only) functions and methods for 
 * char tuples with two dimensions.
 */
public interface Tup2cR extends TupcR
{
	/** {@inheritDoc}} */
	@Override
	Tup2cR createNew();
	
	/** {@inheritDoc}} */
	@Override
	default Tup2cR createNew(TupcR t)
	{
		Validation.validateNotNull("t", t);
		
		return createNew(t.toArray());
	}
	
	/**
	 * Creates a new instance of the type of this tuple and adopts the component
	 * values from the given tuple {@code (t)}.
	 * 
	 * @param t The tuple to adopt the component values from.
	 * 
	 * @return A new instance.
	 */
	default Tup2cR createNew(Tup2cR t)
	{
		Validation.validateNotNull("t", t);
		
		return createNew(t.v0(), t.v1());
	}
	
	/**
	 * Creates a new instance of the type of this tuple and adopts the component
	 * values from the given tuple {@code (t[0], t[1])}.
	 * 
	 * @param t The tuple as an array with at least two entries to adopt the
	 * component values from.
	 * 
	 * @return A new instance.
	 */
	default Tup2cR createNew(@MinLength(2) char[] t)
	{
		Validation.validateNotNull("t", t);
		Validation.validateMinSize("t", t, 2);
		
		return createNew(t[0], t[1]);
	}
	
	/**
	 * Creates a new instance of the type of this tuple and sets the component
	 * values to the given value {@code (value)}.
	 * 
	 * @param value The value that will be used for all component values.
	 * 
	 * @return A new instance.
	 */
	default Tup2cR createNew(char value)
	{
		return createNew(value, value);
	}
	
	/**
	 * Creates a new instance of the type of this tuple and adopts the component
	 * values from the given tuple {@code (v0, v1)}.
	 * 
	 * @param v0 The new value of the first component.
	 * @param v1 The new value of the second component.
	 * 
	 * @return A new instance.
	 */
	Tup2cR createNew(char v0, char v1);
	
	/**
	 * {@inheritDoc}
	 * 
	 * <p>
	 * For any derivative or implementation of {@link Tup2cR} this will be two.
	 * 
	 * @apiNote Do not override this function, as it already returns the correct
	 * value for any two dimensional tuple.
	 */
	@Override
	default int size()
	{
		return 2;
	}
	
	/**
	 * Returns the value of the first component of the tuple.
	 * 
	 * @return The value of the first component.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced,
	 * as the original concept was too close to the naming conventions of
	 * vectors. Because not all tuples are necessarily vectors, the vector
	 * naming convention might be confusing to understand or could even create
	 * conflicts hence it was changed.
	 */
	char v0();
	
	/**
	 * Returns the value of the second component of the tuple.
	 * 
	 * @return The value of the second component.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced,
	 * as the original concept was too close to the naming conventions of
	 * vectors. Because not all tuples are necessarily vectors, the vector
	 * naming convention might be confusing to understand or could even create
	 * conflicts hence it was changed.
	 */
	char v1();
	
	/** {@inheritDoc} */
	@Override
	default char getByIndex(@IntValueRange(min=0, max=1) int index)
	{
		Validation.validateInRange("index", index, 0, 1);
		
		switch(index)
		{
			case 0: return v0();
			case 1: return v1();
			
			default: throw new AssertionError(index);
		}
	}
	
	/** {@inheritDoc} */
	@Override
	default char[] toArray(@ExtractionParam @MinLength(2) char[] res)
	{
		Validation.validateMinSize("res", res, 2);
		
		res[0] = v0();
		res[1] = v1();
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	Tup2cR copy();
	
	/**
	 * Compares the value of the components of this tuple and the given tuple
	 * and returns true, if the value of each component of this tuple is equal
	 * to the value of the corresponding component in the other tuple.
	 * 
	 * @param other The tuple to compare with.
	 * 
	 * @return True if this tuple is component-wise equal to the other tuple.
	 */
	default boolean equals(@Nullable Tup2cR other)
	{
		if(other == null) return false;
		if(other == this) return true;
		
		if(v0() != other.v0()) return false;
		if(v1() != other.v1()) return false;
		
		return true;
	}
	
	/** {@inheritDoc} */
	@Override
	default boolean equals(@Nullable TupcR other)
	{
		if(other == null) return false;
		if(other == this) return true;
		if(other.size() != 2) return false;
		
		if(v0() != other.getByIndex(0)) return false;
		if(v1() != other.getByIndex(1)) return false;
		
		return true;
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	@Override
	default Tup2cR resizeN(int size)
	{
		throw new UnsupportedOperationException();
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2cR rearrangeN(int[] indices)
	{
		Validation.validateNotNull("indices", indices);
		Validation.validateExpectSize("indices", indices, 2);
		
		char v0 = getByIndex(indices[0]);
		char v1 = getByIndex(indices[1]);
		
		return createNew(v0, v1);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	@Override
	default Tup2cR rearrangeResizeN(int[] indices)
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v1} and returns
	 * the result as a new instance of this type of tuple.
	 * 
	 * @return A new instance of this type of tuple with the result.
	 */
	default Tup2cR swapV0AndV1N()
	{
		return createNew(v1(), v0());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2cR swapByIndexN(int indexA, int indexB)
	{
		Validation.validateInRange("indexA", indexA, 0, 1);
		Validation.validateInRange("indexB", indexB, 0, 1);
		
		char v0 = getByIndex(indexA);
		char v1 = getByIndex(indexB);
		
		return createNew(v1, v0);
	}
	
	/**
	 * Passes the tuple to the consumer.
	 * 
	 * <p>
	 * This allows to pass a tuple not as an instance of tuple but as single
	 * components to a consumer.
	 * 
	 * @param consumer The consumer receiving the tuple.
	 */
	default void passTo(Consumer2c consumer)
	{
		Validation.validateNotNull("consumer", consumer);
		
		consumer.acceptChar(v0(), v1());
	}
	
	/**
	 * Passes the tuple to the consumer.
	 * 
	 * <p>
	 * This allows to pass a tuple not as an instance of tuple but as single
	 * components to a consumer.
	 * 
	 * @param consumer The consumer receiving the tuple.
	 */
	default void passTo(Consumer2<Character,Character> consumer)
	{
		Validation.validateNotNull("consumer", consumer);
		
		consumer.accept(v0(), v1());
	}
}