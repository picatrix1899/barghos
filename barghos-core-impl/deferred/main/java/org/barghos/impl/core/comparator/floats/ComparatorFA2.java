//package org.barghos.util.comparator.floats;
//
//import org.barghos.util.comparator.Comparator;
//import org.barghos.validation.Validate;
//
//public interface ComparatorFA2 extends Comparator<float[][]>
//{
//	int compareFA2(float[][] o1, float[][] o2);
//	
//	default int compare(float[][] o1, float[][] o2)
//	{
//		return compareFA2(o1, o2);
//	}
//	
//	boolean equals(Object obj);
//	
//	default ComparatorFA2 reverse()
//	{
//		return new ReverseComparatorFA2(this);
//	}
//	
//	default ComparatorFA2 then(ComparatorFA2 other)
//	{
//		Validate.Arg.checkNotNull("other", other);
//		
//		return new SimpleChainedComparatorFA2(this, other);
//	}
//	
//	default ComparatorFA2 then(Comparator<? super float[][]> other)
//	{
//		Validate.Arg.checkNotNull("other", other);
//		
//		return then(other::compare);
//	}
//	
//	default ComparatorFA2 then(java.util.Comparator<? super float[][]> other)
//	{
//		Validate.Arg.checkNotNull("other", other);
//		
//		return then(other::compare);
//	}
//}
package org;

