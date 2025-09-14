//package org.barghos.util.comparator.floats;
//
//import java.io.Serializable;
//
//public class SimpleChainedComparatorFA3 implements ComparatorFA3, Serializable
//{
//	private static final long serialVersionUID = 1L;
//	
//	protected ComparatorFA3 first;
//	protected ComparatorFA3 second;
//	
//	SimpleChainedComparatorFA3(ComparatorFA3 first, ComparatorFA3 second)
//	{
//		this.first = first;
//		this.second = second;
//	}
//	
//	@Override
//	public int compareFA3(float[][][] o1, float[][][] o2)
//	{
//		int res = this.first.compare(o1, o2);
//		
//		return (res != 0) ? res : this.second.compare(o1, o2);
//	}
//	
//}
package org;


