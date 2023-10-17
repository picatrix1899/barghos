package org.barghos.util.tuple.strings;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;
import org.barghos.annotation.Nullable;

import org.barghos.util.consumer.Consumer4;
import org.barghos.util.consumer.strings.Consumer4str;

import org.barghos.validation.Validation;

/**
 * This interface provides non-invasive (read only) functions and methods for string tuples with
 * four dimensions.
 */
public interface Tup4strR extends TupstrR
{
	/** {@inheritDoc}} */
	@Override
	Tup4strR createNew();
	
	/** {@inheritDoc}} */
	@Override
	default Tup4strR createNew(TupstrR t)
	{
		Validation.validateNotNull("t", t);
		
		return createNew(t.toArray());
	}
	
	/**
	 * Creates a new instance of the type of this tuple and adopts the component values from the
	 * given tuple {@code (t)}.
	 * 
	 * @param t The tuple to adopt the component values from.
	 * 
	 * @return A new instance.
	 */
	default Tup4strR createNew(Tup4strR t)
	{
		Validation.validateNotNull("t", t);

		return createNew(t.v0(), t.v1(), t.v2(), t.v3());
	}
	
	/**
	 * Creates a new instance of the type of this tuple and adopts the component values from the
	 * given tuple {@code (t[0], t[1], t[2], t[3])}.
	 * 
	 * @param t The tuple as an array with at least three entries to adopt the component values from.
	 * 
	 * @return A new instance.
	 */
	default Tup4strR createNew(@MinLength(4) String[] t)
	{
		Validation.validateNotNull("t", t);
		Validation.validateMinSize("t", t, 4);

		return createNew(t[0], t[1], t[2], t[3]);
	}
	
	/**
	 * Creates a new instance of the type of this tuple and sets the component values to the given
	 * value {@code (value)}.
	 * 
	 * @param value The value that will be used for all component values.
	 * 
	 * @return A new instance.
	 */
	default Tup4strR createNew(String value)
	{
		return createNew(value, value, value, value);
	}
	
	/**
	 * Creates a new instance of the type of this tuple and adopts the component values from the
	 * given tuple {@code (v0, v1, v2, v3)}.
	 * 
	 * @param v0 The new value of the first component.
	 * @param v1 The new value of the second component.
	 * @param v2 The new value of the third component.
	 * @param v3 The new value of the fourth component.
	 * 
	 * @return A new instance.
	 */
	Tup4strR createNew(String v0, String v1, String v2, String v3);
	
	/**
	 * {@inheritDoc}
	 * 
	 * <p>
	 * For any derivative or implementation of {@link Tup4strR} this will be two.
	 * 
	 * @apiNote Do not override this function, as it already returns the correct value for any four
	 * dimensional tuple.
	 */
	@Override
	default int size()
	{
		return 4;
	}
	
	/**
	 * Returns the value of the first component of the tuple.
	 * 
	 * @return The value of the first component.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original
	 * concept was too close to the naming conventions of vectors. Because not all tuples are
	 * necessarily vectors, the vector naming convention might be confusing to understand or could
	 * even create conflicts hence it was changed.
	 */
	String v0();
	
	/**
	 * Returns the value of the second component of the tuple.
	 * 
	 * @return The value of the second component.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original
	 * concept was too close to the naming conventions of vectors. Because not all tuples are
	 * necessarily vectors, the vector naming convention might be confusing to understand or could
	 * even create conflicts hence it was changed.
	 */
	String v1();
	
	/**
	 * Returns the value of the third component of the tuple.
	 * 
	 * @return The value of the third component.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original
	 * concept was too close to the naming conventions of vectors. Because not all tuples are
	 * necessarily vectors, the vector naming convention might be confusing to understand or could
	 * even create conflicts hence it was changed.
	 */
	String v2();
	
	/**
	 * Returns the value of the fourth component of the tuple.
	 * 
	 * @return The value of the fourth component.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original
	 * concept was too close to the naming conventions of vectors. Because not all tuples are
	 * necessarily vectors, the vector naming convention might be confusing to understand or could
	 * even create conflicts hence it was changed.
	 */
	String v3();
	
	/** {@inheritDoc}} */
	@Override
	default String getByIndex(@IntValueRange(min=0, max=3) int index)
	{
		Validation.validateInRange("index", index, 0, 3);
		
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
	default String[] toArray(@ExtractionParam @MinLength(4) String[] res)
	{
		Validation.validateMinSize("res", res, 4);
		
		res[0] = v0();
		res[1] = v1();
		res[2] = v2();
		res[3] = v3();
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	Tup4strR copy();
	
	/**
	 * Compares the value of the components of this tuple and the given tuple and returns true,
	 * if the value of each component of this tuple is equal to the value of the corresponding component in the other tuple.
	 * 
	 * @param other The tuple to compare with.
	 * 
	 * @return True if this tuple is component-wise equal to the other tuple.
	 */
	default boolean equals(@Nullable Tup4strR other)
	{
		if(other == null) return false;
		if(other == this) return true;
		
		if(v0() != other.v0()) return false;
		if(v1() != other.v1()) return false;
		if(v2() != other.v2()) return false;
		if(v3() != other.v3()) return false;
		
		return true;
	}
	
	/** {@inheritDoc} */
	@Override
	default boolean equals(@Nullable TupstrR other)
	{
		if(other == null) return false;
		if(other == this) return true;
		if(other.size() != 4) return false;
		
		if(v0() != other.getByIndex(0)) return false;
		if(v1() != other.getByIndex(1)) return false;
		if(v2() != other.getByIndex(2)) return false;
		if(v3() != other.getByIndex(3)) return false;
		
		return true;
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	default Tup4strR resizeN(int size)
	{
		throw new UnsupportedOperationException();
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4strR rearrangeN(int[] indices)
	{
		Validation.validateNotNull("indices", indices);
		Validation.validateExpectSize("indices", indices, 4);
		
		String v0 = getByIndex(indices[0]);
		String v1 = getByIndex(indices[1]);
		String v2 = getByIndex(indices[2]);
		String v3 = getByIndex(indices[3]);

		return createNew(v0, v1, v2, v3);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	default Tup4strR rearrangeResizeN(int[] indices)
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v1} and returns the result as a new
	 * instance of this type of tuple.
	 * 
	 * @return A new instance of this type of tuple with the result.
	 */
	default Tup4strR swapV0AndV1N()
	{
		return createNew(v1(), v0(), v2(), v3());
	}
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v2} and returns the result as a new
	 * instance of this type of tuple.
	 * 
	 * @return A new instance of this type of tuple with the result.
	 */
	default Tup4strR swapV0AndV2N()
	{
		return createNew(v2(), v1(), v0(), v3());
	}
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v3} and returns the result as a new
	 * instance of this type of tuple.
	 * 
	 * @return A new instance of this type of tuple with the result.
	 */
	default Tup4strR swapV0AndV3N()
	{
		return createNew(v3(), v1(), v2(), v0());
	}
	
	/**
	 * Swaps the values of the components {@code v1} and {@code v2} and returns the result as a new
	 * instance of this type of tuple.
	 * 
	 * @return A new instance of this type of tuple with the result.
	 */
	default Tup4strR swapV1AndV2N()
	{
		return createNew(v0(), v2(), v1(), v3());
	}
	
	/**
	 * Swaps the values of the components {@code v1} and {@code v3} and returns the result as a new
	 * instance of this type of tuple.
	 * 
	 * @return A new instance of this type of tuple with the result.
	 */
	default Tup4strR swapV1AndV3N()
	{
		return createNew(v0(), v3(), v2(), v1());
	}
	
	/**
	 * Swaps the values of the components {@code v2} and {@code v3} and returns the result as a new
	 * instance of this type of tuple.
	 * 
	 * @return A new instance of this type of tuple with the result.
	 */
	default Tup4strR swapV2AndV3N()
	{
		return createNew(v0(), v1(), v3(), v2());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4strR swapByIndexN(int indexA, int indexB)
	{
		Validation.validateInRange("indexA", indexA, 0, 3);
		Validation.validateInRange("indexB", indexB, 0, 3);
		
		String[] values = toArray();
		String temp = values[indexA];
		values[indexA] = values[indexB];
		values[indexB] = temp;
		
		return createNew(values);
	}
	
	/**
	 * Passes the tuple to the consumer.
	 * 
	 * <p>
	 * This allows to pass a tuple not as an instance of tuple but as single components to a
	 * consumer.
	 * 
	 * @param consumer The consumer receiving the tuple.
	 */
	default void passTo(Consumer4str consumer)
	{
		Validation.validateNotNull("consumer", consumer);
		
		consumer.acceptString(v0(), v1(), v2(), v3());
	}
	
	/**
	 * Passes the tuple to the consumer.
	 * 
	 * <p>
	 * This allows to pass a tuple not as an instance of tuple but as single components to a
	 * consumer.
	 * 
	 * @param consumer The consumer receiving the tuple.
	 */
	default void passTo(Consumer4<String,String,String,String> consumer)
	{
		Validation.validateNotNull("consumer", consumer);
		
		consumer.accept(v0(), v1(), v2(), v3());
	}
}