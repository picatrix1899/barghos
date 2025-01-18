//package org.barghos.util.comparator.floats;
//
//import java.io.Serializable;
//
//public class SimpleChainedComparatorF implements ComparatorF, Serializable
//{
//	private static final long serialVersionUID = 1L;
//	
//	protected ComparatorF first;
//	protected ComparatorF second;
//	
//	SimpleChainedComparatorF(ComparatorF first, ComparatorF second)
//	{
//		this.first = first;
//		this.second = second;
//	}
//	
//	@Override
//	public int compareF(float o1, float o2)
//	{
//		int res = this.first.compare(o1, o2);
//		
//		return (res != 0) ? res : this.second.compare(o1, o2);
//	}
//	
//}
