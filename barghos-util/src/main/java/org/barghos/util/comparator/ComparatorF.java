package org.barghos.util.comparator;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;

public interface ComparatorF extends Comparator<Float>
{
	int compareFloat(float o1, float o2);
	
	/** {@inheritDoc} */
	@Override
	default int compare(Float o1, Float o2)
	{
		return compareFloat(o1, o2);
	}

	/** {@inheritDoc} */
	@Override
	boolean equals(Object obj);

	/** {@inheritDoc} */
	@Override
	default Comparator<Float> reversed()
	{
		return Collections.reverseOrder(this);
	}

	/** {@inheritDoc} */
	@Override
	@SuppressWarnings("unchecked")
	default Comparator<Float> thenComparing(Comparator<? super Float> other)
	{
		Objects.requireNonNull(other);
		return (Comparator<Float> & Serializable) (c1, c2) -> {
			int res = compare(c1, c2);
			return (res != 0) ? res : other.compare(c1, c2);
		};
	}

	/** {@inheritDoc} */
	@Override
	default <U> Comparator<Float> thenComparing(Function<? super Float, ? extends U> keyExtractor, Comparator<? super U> keyComparator)
	{
		return thenComparing(comparing(keyExtractor, keyComparator));
	}

	/** {@inheritDoc} */
	@Override
	default <U extends Comparable<? super U>> Comparator<Float> thenComparing(Function<? super Float, ? extends U> keyExtractor)
	{
		return thenComparing(comparing(keyExtractor));
	}
	
	/** {@inheritDoc} */
	@SuppressWarnings("unchecked")
	public static <U> Comparator<Float> comparing(Function<? super Float, ? extends U> keyExtractor, Comparator<? super U> keyComparator)
	{
		Objects.requireNonNull(keyExtractor);
		Objects.requireNonNull(keyComparator);
		return (Comparator<Float> & Serializable)
			(c1, c2) -> keyComparator.compare(keyExtractor.apply(c1),
											  keyExtractor.apply(c2));
	}
	
	/** {@inheritDoc} */
	@SuppressWarnings("unchecked")
	public static <U extends Comparable<? super U>> Comparator<Float> comparing(Function<? super Float, ? extends U> keyExtractor)
	{
		Objects.requireNonNull(keyExtractor);
		return (Comparator<Float> & Serializable)
			(c1, c2) -> keyExtractor.apply(c1).compareTo(keyExtractor.apply(c2));
	}
}