package org.barghos.util.iterator;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;

import org.barghostest.util.collection.core.consumer.BigDecMonoConsumer;

/**
 * An iterator over a {@link BigDecimal} collection that can work with the primitive values instead of
 * boxed ones. For more details see {@link Iterator}.
 */
public interface BigDecIterator extends PrimitiveIterator<BigDecimal, BigDecMonoConsumer>
{
	/**
     * Returns the next value in the iteration.
     *
     * @return The next value in the iteration.
     * 
     * @throws NoSuchElementException If the iteration has no more values.
     */
	BigDecimal nextBigDec();
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Use {@link #nextBigDec()} instead.
	 */
	@Override
	@Deprecated
	default BigDecimal next()
	{
		return nextBigDec();
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Use {@link #forEachRemaining(BigDecMonoConsumer)} instead.
	 */
	@Override
	@Deprecated
	default void forEachRemaining(Consumer<? super BigDecimal> action)
	{
        forEachRemaining((BigDecMonoConsumer) action::accept);
    }
	
	/**
	 * Skips the given number of elements.
	 *
	 * <p>
	 * The effect of this call is exactly the same as that of calling {@link #next()} for {@code n}
	 * times (possibly stopping if {@link #hasNext()} becomes false).
	 *
	 * @param n the number of elements to skip.
	 * @return the number of elements actually skipped.
	 * @see Iterator#next()
	 */
	default int skip(int n)
	{
		if (n < 0) throw new IllegalArgumentException("Argument must be nonnegative: " + n);
		
		int i = n;
		
		while (i-- != 0 && hasNext())
		{
			nextBigDec();
		}
		
		return n - i - 1;
	}
}