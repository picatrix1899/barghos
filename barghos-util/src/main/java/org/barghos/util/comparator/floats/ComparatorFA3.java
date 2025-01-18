//package org.barghos.util.comparator.floats;
//
//import org.barghos.util.comparator.Comparator;
//import org.barghos.validation.Validate;
//
//public interface ComparatorFA3 extends Comparator<float[][][]>
//{
//	int compareFA3(float[][][] o1, float[][][] o2);
//	
//	default int compare(float[][][] o1, float[][][] o2)
//	{
//		return compareFA3(o1, o2);
//	}
//	
//	boolean equals(Object obj);
//	
//	default ComparatorFA3 reverse()
//	{
//		return new ReverseComparatorFA3(this);
//	}
//	
//	default ComparatorFA3 then(ComparatorFA3 other)
//	{
//		Validate.Arg.checkNotNull("other", other);
//		
//		return new SimpleChainedComparatorFA3(this, other);
//	}
//	
//	default ComparatorFA3 then(Comparator<? super float[][][]> other)
//	{
//		Validate.Arg.checkNotNull("other", other);
//		
//		return then(other::compare);
//	}
//	
//	default ComparatorFA3 then(java.util.Comparator<? super float[][][]> other)
//	{
//		Validate.Arg.checkNotNull("other", other);
//		
//		return then(other::compare);
//	}
//}