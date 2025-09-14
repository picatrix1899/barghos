//package org.barghos.util.comparator.floats;
//
//import org.barghos.util.comparator.Comparator;
//import org.barghos.validation.Validate;
//
//public interface ComparatorFA extends Comparator<float[]>
//{
//	int compareFA(float[] o1, float[] o2);
//	
//	default int compare(float[] o1, float[] o2)
//	{
//		return compareFA(o1, o2);
//	}
//	
//	boolean equals(Object obj);
//	
//	default ComparatorFA reverse()
//	{
//		return new ReverseComparatorFA(this);
//	}
//	
//	default ComparatorFA then(ComparatorFA other)
//	{
//		Validate.Arg.checkNotNull("other", other);
//		
//		return new SimpleChainedComparatorFA(this, other);
//	}
//	
//	default ComparatorFA then(Comparator<? super float[]> other)
//	{
//		Validate.Arg.checkNotNull("other", other);
//		
//		return then(other::compare);
//	}
//	
//	default ComparatorFA then(java.util.Comparator<? super float[]> other)
//	{
//		Validate.Arg.checkNotNull("other", other);
//		
//		return then(other::compare);
//	}
//}
package org;

