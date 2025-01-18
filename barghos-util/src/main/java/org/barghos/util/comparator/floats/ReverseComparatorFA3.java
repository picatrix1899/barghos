//package org.barghos.util.comparator.floats;
//
//import java.io.Serializable;
//
//public class ReverseComparatorFA3 implements ComparatorFA3, Serializable
//{
//	private static final long serialVersionUID = 1L;
//	
//	protected ComparatorFA3 parent;
//	
//	public ReverseComparatorFA3(ComparatorFA3 parent)
//	{
//		this.parent = parent;
//	}
//	
//	@Override
//	public int compareFA3(float[][][] o1, float[][][] o2)
//	{
//		return this.parent.compare(o2, o1);
//	}
//	
//	@Override
//	public ComparatorFA3 reverse()
//	{
//		return this.parent;
//	}
//}
