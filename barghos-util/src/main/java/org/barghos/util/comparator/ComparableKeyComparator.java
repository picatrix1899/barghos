//package org.barghos.util.comparator;
//
//import java.io.Serializable;
//
//import org.barghos.util.function.Function;
//import org.barghos.validation.Validate;
//
//public class ComparableKeyComparator<T,U extends Comparable<? super U>> implements Comparator<T>, Serializable
//{
//	private static final long serialVersionUID = 1L;
//
//	protected Function<? super T, ? extends U> keyExtractor;
//	
//	public ComparableKeyComparator(Function<? super T, ? extends U> keyExtractor)
//	{
//		Validate.Arg.checkNotNull("keyExtractor", keyExtractor);
//		
//		this.keyExtractor = keyExtractor;
//	}
//	
//	@Override
//	public int compare(T o1, T o2)
//	{
//		return this.keyExtractor.apply(o1).compareTo(this.keyExtractor.apply(o2));
//	}
//	
//}
