//package org.barghos.util.comparator.floats;
//
//import java.io.Serializable;
//
//public class SimpleChainedComparatorFA implements ComparatorFA, Serializable
//{
//	private static final long serialVersionUID = 1L;
//	
//	protected ComparatorFA first;
//	protected ComparatorFA second;
//	
//	SimpleChainedComparatorFA(ComparatorFA first, ComparatorFA second)
//	{
//		this.first = first;
//		this.second = second;
//	}
//	
//	@Override
//	public int compareFA(float[] o1, float[] o2)
//	{
//		int res = this.first.compare(o1, o2);
//		
//		return (res != 0) ? res : this.second.compare(o1, o2);
//	}
//	
//}
package org;


