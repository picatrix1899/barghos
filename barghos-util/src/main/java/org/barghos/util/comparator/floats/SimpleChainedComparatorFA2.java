//package org.barghos.util.comparator.floats;
//
//import java.io.Serializable;
//
//public class SimpleChainedComparatorFA2 implements ComparatorFA2, Serializable
//{
//	private static final long serialVersionUID = 1L;
//	
//	protected ComparatorFA2 first;
//	protected ComparatorFA2 second;
//	
//	SimpleChainedComparatorFA2(ComparatorFA2 first, ComparatorFA2 second)
//	{
//		this.first = first;
//		this.second = second;
//	}
//	
//	@Override
//	public int compareFA2(float[][] o1, float[][] o2)
//	{
//		int res = this.first.compare(o1, o2);
//		
//		return (res != 0) ? res : this.second.compare(o1, o2);
//	}
//	
//}
