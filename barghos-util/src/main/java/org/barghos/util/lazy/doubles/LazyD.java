//package org.barghos.util.lazy.doubles;
//
//import org.barghos.util.lazy.Lazy;
//
///**
// * Represents a double value provider, that determines the value to provide on
// * the first call to {@link #valueD()} and stores it for any further calls.
// * This allows to execute probably complex code for determining the value only
// * if and when the value is really needed. 
// */
//public interface LazyD extends Lazy<Double>
//{
//	/**
//	 * Returns the provided value.
//	 * 
//	 * <p>
//	 * WARNING: This will execute the code to determine the value, if the 
//	 * {@link #hasValue()} flag is false. After execution the determined value
//	 * is stored for any further calls and the {@link #hasValue()} flag is set
//	 * to true.
//	 * 
//	 * @return The provided value.
//	 */
//	double valueD();
//	
//	/**
//	 * @deprecated Use {@link #valueD()} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default Double value()
//	{
//		return valueD();
//	}
//}
