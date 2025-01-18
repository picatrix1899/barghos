//package org.barghos.util.comparator;
//
//import java.io.Serializable;
//
//import org.barghos.validation.Validate;
//
//public class NullComparator<T> implements Comparator<T>, Serializable
//{
//	private static final long serialVersionUID = 1L;
//	
//	protected boolean nullFirst;
//	protected Comparator<T> parent;
//
//    @SuppressWarnings("unchecked")
//    public NullComparator(boolean nullFirst, Comparator<? super T> parent)
//    {
//        this.nullFirst = nullFirst;
//        this.parent = (Comparator<T>)parent;
//    }
//
//    @Override
//    public int compare(T a, T b)
//    {
//        if (a == null) return b == null ? 0 : (this.nullFirst ? -1 : 1);
//        if (b == null) return this.nullFirst ? 1: -1;
//
//        return this.parent == null ? 0 : this.parent.compare(a, b);
//    }
//
//    @Override
//    public Comparator<T> then(Comparator<? super T> other)
//    {
//    	Validate.Arg.checkNotNull("other", other);
//    	
//        return new NullComparator<T>(this.nullFirst, this.parent == null ? other : this.parent.thenComparing(other));
//    }
//
//    @Override
//    public Comparator<T> reverse()
//    {
//        return new NullComparator<>(!this.nullFirst, this.parent == null ? null : this.parent.reversed());
//    }
//}