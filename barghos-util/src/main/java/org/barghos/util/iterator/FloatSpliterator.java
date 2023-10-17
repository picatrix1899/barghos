package org.barghos.util.iterator;

import java.util.Collection;
import java.util.Spliterator;

import org.barghostest.util.collection.core.consumer.FloatMonoConsumer;

/**
 * An iterator for traversing and partitioning float values of a source.  The source
 * of values covered by a {@link FloatSpliterator} could be, for example, an array, a
 * {@link Collection}, an IO channel, or a generator function. For more details see
 * {@link Spliterator}.
 * 
 * <p>
 * The {@link FloatSpliterator} works with the primitive values instead of
 * boxed ones.
 */
public interface FloatSpliterator extends Spliterator.OfPrimitive<Float, FloatMonoConsumer, FloatSpliterator>
{
	
}