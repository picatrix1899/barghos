//package org.barghos.util.comparator;
//
//import org.barghos.util.function.Function;
//import org.barghos.validation.Validate;
//
//@FunctionalInterface
//public interface Comparator<T> extends java.util.Comparator<T>
//{
//	int compare(T o1, T o2);
//	
//	boolean equals(Object obj);
//	
//	default Comparator<T> reverse()
//	{
//		return new ReverseComparator<T>(this);
//	}
//	
//	default Comparator<T> reversed()
//	{
//		return reverse();
//	}
//	
//	default Comparator<T> then(Comparator<? super T> other)
//	{
//		Validate.Arg.checkNotNull("other", other);
//		
//		return new SimpleChainedComparator<T>(this, other);
//	}
//	
//	default Comparator<T> then(java.util.Comparator<? super T> other)
//	{
//		Validate.Arg.checkNotNull("other", other);
//		
//		return then(other::compare);
//	}
//	
//	default Comparator<T> thenComparing(java.util.Comparator<? super T> other)
//	{
//		Validate.Arg.checkNotNull("other", other);
//		
//		return then(other::compare);
//	}
//
//	default <U> Comparator<T> then(Function<? super T, ? extends U> keyExtractor, Comparator<? super U> keyComparator)
//	{
//		Validate.Arg.checkNotNull("keyExtractor", keyExtractor);
//		Validate.Arg.checkNotNull("other", keyComparator);
//		
//		return new KeyComparator<>(keyExtractor, keyComparator);
//	}
//
//	default <U> Comparator<T> then(Function<? super T, ? extends U> keyExtractor, java.util.Comparator<? super U> keyComparator)
//	{
//		Validate.Arg.checkNotNull("keyExtractor", keyExtractor);
//		Validate.Arg.checkNotNull("other", keyComparator);
//		
//		return then(keyExtractor, keyComparator::compare);
//	}
//	
//	default <U> Comparator<T> then(java.util.function.Function<? super T, ? extends U> keyExtractor, Comparator<? super U> keyComparator)
//	{
//		Validate.Arg.checkNotNull("keyExtractor", keyExtractor);
//		Validate.Arg.checkNotNull("other", keyComparator);
//		
//		return then(keyExtractor::apply, keyComparator);
//	}
//	
//	default <U> Comparator<T> then(java.util.function.Function<? super T, ? extends U> keyExtractor, java.util.Comparator<? super U> keyComparator)
//	{
//		Validate.Arg.checkNotNull("keyExtractor", keyExtractor);
//		Validate.Arg.checkNotNull("other", keyComparator);
//		
//		return then(keyExtractor::apply, keyComparator::compare);
//	}
//	
//	default <U> Comparator<T> thenComparing(java.util.function.Function<? super T, ? extends U> keyExtractor, java.util.Comparator<? super U> keyComparator)
//	{
//		Validate.Arg.checkNotNull("keyExtractor", keyExtractor);
//		Validate.Arg.checkNotNull("other", keyComparator);
//		
//		return then(keyExtractor::apply, keyComparator::compare);
//	}
//	
//	default <U extends Comparable<? super U>> Comparator<T> then(Function<? super T, ? extends U> keyExtractor)
//	{
//		Validate.Arg.checkNotNull("keyExtractor", keyExtractor);
//		return new ComparableKeyComparator<>(keyExtractor);
//	}
//	
//	default <U extends Comparable<? super U>> Comparator<T> then(java.util.function.Function<? super T, ? extends U> keyExtractor)
//	{
//		Validate.Arg.checkNotNull("keyExtractor", keyExtractor);
//		
//		return then(keyExtractor::apply);
//	}
//	
//	default <U extends Comparable<? super U>> Comparator<T> thenComparing(java.util.function.Function<? super T, ? extends U> keyExtractor)
//	{
//		Validate.Arg.checkNotNull("keyExtractor", keyExtractor);
//		
//		return then(keyExtractor::apply);
//	}
//}
