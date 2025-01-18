//package org.barghos.util.comparator;
//
//import java.io.Serializable;
//
//import org.barghos.validation.Validate;
//
//public class ReverseComparator<T> implements Comparator<T>, Serializable
//{
//	private static final long serialVersionUID = 1L;
//	
//	protected Comparator<T> parent;
//	
//	public ReverseComparator(Comparator<T> parent)
//	{
//		Validate.Arg.checkNotNull("parent", parent);
//		
//		this.parent = parent;
//	}
//	
//	@Override
//	public int compare(T o1, T o2)
//	{
//		return this.parent.compare(o2, o1);
//	}
//	
//	@Override
//	public Comparator<T> reverse()
//	{
//		return this.parent;
//	}
//}
