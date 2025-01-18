//package org.barghos.util.comparator.floats;
//
//import java.io.Serializable;
//
//public class ReverseComparatorFA2 implements ComparatorFA2, Serializable
//{
//	private static final long serialVersionUID = 1L;
//	
//	protected ComparatorFA2 parent;
//	
//	public ReverseComparatorFA2(ComparatorFA2 parent)
//	{
//		this.parent = parent;
//	}
//	
//	@Override
//	public int compareFA2(float[][] o1, float[][] o2)
//	{
//		return this.parent.compare(o2, o1);
//	}
//	
//	@Override
//	public ComparatorFA2 reverse()
//	{
//		return this.parent;
//	}
//}
