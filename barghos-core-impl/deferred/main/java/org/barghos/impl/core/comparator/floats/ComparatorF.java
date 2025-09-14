//package org.barghos.util.comparator.floats;
//
//import org.barghos.util.comparator.Comparator;
//import org.barghos.validation.Validate;
//
//public interface ComparatorF extends Comparator<Float>
//{
//	int compareF(float o1, float o2);
//	
//	default int compare(Float o1, Float o2)
//	{
//		return compareF(o1, o2);
//	}
//	
//	boolean equals(Object obj);
//	
//	default ComparatorF reverse()
//	{
//		return new ReverseComparatorF(this);
//	}
//	
//	default ComparatorF then(ComparatorF other)
//	{
//		Validate.Arg.checkNotNull("other", other);
//		
//		return new SimpleChainedComparatorF(this, other);
//	}
//	
//	default ComparatorF then(Comparator<? super Float> other)
//	{
//		Validate.Arg.checkNotNull("other", other);
//		
//		return then(other::compare);
//	}
//	
//	default ComparatorF then(java.util.Comparator<? super Float> other)
//	{
//		Validate.Arg.checkNotNull("other", other);
//		
//		return then(other::compare);
//	}
//}
package org;

