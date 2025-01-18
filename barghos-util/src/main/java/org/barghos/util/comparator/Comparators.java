//package org.barghos.util.comparator;
//
//public class Comparators
//{
//	public static final Comparator<Comparable<Object>> NATURAL_ORDER = new Comparator<>() {
//		
//		@Override
//        public int compare(Comparable<Object> c1, Comparable<Object> c2)
//		{
//            return c1.compareTo(c2);
//        }
//
//        @Override
//        public Comparator<Comparable<Object>> reverse() {
//            return Comparators.REVERSE_ORDER;
//        }
//	};
//	
//	public static final Comparator<Comparable<Object>> REVERSE_ORDER = new Comparator<>() {
//		
//		@Override
//        public int compare(Comparable<Object> c1, Comparable<Object> c2)
//		{
//            return c2.compareTo(c1);
//        }
//
//        @Override
//        public Comparator<Comparable<Object>> reverse() {
//            return Comparators.NATURAL_ORDER;
//        }
//	};
//}
