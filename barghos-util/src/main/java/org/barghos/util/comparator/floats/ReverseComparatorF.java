//package org.barghos.util.comparator.floats;
//
//import java.io.Serializable;
//
//public class ReverseComparatorF implements ComparatorF, Serializable
//{
//	private static final long serialVersionUID = 1L;
//	
//	protected ComparatorF parent;
//	
//	public ReverseComparatorF(ComparatorF parent)
//	{
//		this.parent = parent;
//	}
//	
//	@Override
//	public int compareF(float o1, float o2)
//	{
//		return this.parent.compare(o2, o1);
//	}
//	
//	@Override
//	public ComparatorF reverse()
//	{
//		return this.parent;
//	}
//}
