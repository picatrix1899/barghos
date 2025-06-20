//package org.barghos.util.lazy.bools;
//
//import org.barghos.util.lazy.Lazy;
//
///**
// * Represents a boolean value provider, that determines the value to provide on
// * the first call to {@link #valueBo()} and stores it for any further calls.
// * This allows to execute probably complex code for determining the value only
// * if and when the value is really needed. 
// */
//public interface LazyBo extends Lazy<Boolean>
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
//	boolean valueBo();
//	
//	/**
//	 * @deprecated Use {@link #valueBo()} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default Boolean value()
//	{
//		return valueBo();
//	}
//}
