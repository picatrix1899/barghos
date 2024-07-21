package org.barghos.util.iterator.floats;

import org.barghos.util.iterator.Iterable;

/**
 * Represents an object that supports iterating over its float entries.
 * This interface marks possible targets for 'for-each-loops'.
 */
@FunctionalInterface
public interface IterableF extends Iterable<Float>
{
	/**
	 * Returns an iterator over float elements.
	 * @return A float iterator.
	 */
	IteratorF iteratorF();
	
	/** {@inheritDoc} */
	@Override
	default IteratorF iterator()
	{
		return iteratorF();
	}
}
