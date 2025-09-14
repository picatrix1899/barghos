//package org.barghos.util.comparator;
//
//import java.io.Serializable;
//
//import org.barghos.validation.Validate;
//
//public class SimpleChainedComparator<T> implements Comparator<T>, Serializable
//{
//	private static final long serialVersionUID = 1L;
//	
//	protected Comparator<? super T> first;
//	protected Comparator<? super T> second;
//	
//	SimpleChainedComparator(Comparator<? super T> first, Comparator<? super T> second)
//	{
//		Validate.Arg.checkNotNull("first", first);
//		Validate.Arg.checkNotNull("second", second);
//		
//		this.first = first;
//		this.second = second;
//	}
//	
//	@Override
//	public int compare(T o1, T o2)
//	{
//		int res = this.first.compare(o1, o2);
//		
//		return (res != 0) ? res : this.second.compare(o1, o2);
//	}
//	
//}
package org;


