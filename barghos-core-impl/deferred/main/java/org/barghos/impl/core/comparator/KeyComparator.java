//package org.barghos.util.comparator;
//
//import java.io.Serializable;
//
//import org.barghos.util.function.Function;
//import org.barghos.validation.Validate;
//
//public class KeyComparator<T,U> implements Comparator<T>, Serializable
//{
//	private static final long serialVersionUID = 1L;
//
//	protected Function<? super T, ? extends U> keyExtractor;
//	protected Comparator<? super U> keyComparator;
//	
//	public KeyComparator(Function<? super T, ? extends U> keyExtractor, Comparator<? super U> keyComparator)
//	{
//		Validate.Arg.checkNotNull("keyExtractor", keyExtractor);
//		Validate.Arg.checkNotNull("keyComparator", keyComparator);
//		
//		this.keyExtractor = keyExtractor;
//		this.keyComparator = keyComparator;
//	}
//	
//	@Override
//	public int compare(T o1, T o2)
//	{
//		return this.keyComparator.compare(this.keyExtractor.apply(o1), this.keyExtractor.apply(o2));
//	}
//	
//}
package org;


