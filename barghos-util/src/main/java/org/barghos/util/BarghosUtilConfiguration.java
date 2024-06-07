package org.barghos.util;

import org.barghos.util.math.JavaMathProvider;
import org.barghos.util.math.MathProvider;

public class BarghosUtilConfiguration
{
	private static MathProvider MATH_PROVIDER = new JavaMathProvider();
		
	public static void mathProvider(MathProvider provider)
	{
		MATH_PROVIDER = provider;
	}
	
	public static MathProvider mathProvider()
	{
		return MATH_PROVIDER;
	}
}
