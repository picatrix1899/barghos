package org.barghos.util;

import org.barghos.util.math.DefaultMathUtilsProvider;
import org.barghos.util.math.MathUtilsProvider;
import org.barghos.util.tuple.floats.TupUtils2FProvider;
import org.barghos.util.tuple.floats.DefaultTupUtils2FProvider;

public class BarghosUtilConfiguration
{
	private static MathUtilsProvider MATH_UTILS_PROVIDER = new DefaultMathUtilsProvider();
	private static MathUtilsProvider.RoundProvider ROUND_MATH_UTILS_PROVIDER = new DefaultMathUtilsProvider.DefaultRoundProvider();
	private static MathUtilsProvider.LerpProvider LERP_MATH_UTILS_PROVIDER = new DefaultMathUtilsProvider.DefaultLerpProvider();
	private static MathUtilsProvider.CompareProvider COMPARE_MATH_UTILS_PROVIDER = new DefaultMathUtilsProvider.DefaultCompareProvider();
	
	private static TupUtils2FProvider TUP_UTILS_2F_PROVIDER = new DefaultTupUtils2FProvider();
	private static TupUtils2FProvider.CompareProvider COMPARE_TUP_UTILS_2F_PROVIDER = new DefaultTupUtils2FProvider.DefaultCompareProvider();
	private static TupUtils2FProvider.LerpProvider LERP_TUP_UTILS_2F_PROVIDER = new DefaultTupUtils2FProvider.DefaultLerpProvider();
	
	private static boolean USE_FMA = true;
	private static float FP_TOLERANCE_F = 1.e-6f;
	private static double FP_TOLERANCE_D = 1.e-6f;
	
	public static void mathUtilsProvider(MathUtilsProvider provider)
	{
		MATH_UTILS_PROVIDER = provider;
	}
	
	public static MathUtilsProvider mathUtilsProvider()
	{
		return MATH_UTILS_PROVIDER;
	}
	
	public static void roundMathUtilsProvider(MathUtilsProvider.RoundProvider provider)
	{
		ROUND_MATH_UTILS_PROVIDER = provider;
	}
	
	public static MathUtilsProvider.RoundProvider roundMathUtilsProvider()
	{
		return ROUND_MATH_UTILS_PROVIDER;
	}
	
	public static void lerpMathUtilsProvider(MathUtilsProvider.LerpProvider provider)
	{
		LERP_MATH_UTILS_PROVIDER = provider;
	}
	
	public static MathUtilsProvider.LerpProvider lerpMathUtilsProvider()
	{
		return LERP_MATH_UTILS_PROVIDER;
	}
	
	public static void compareMathUtilsProvider(MathUtilsProvider.CompareProvider provider)
	{
		COMPARE_MATH_UTILS_PROVIDER = provider;
	}
	
	public static MathUtilsProvider.CompareProvider compareMathUtilsProvider()
	{
		return COMPARE_MATH_UTILS_PROVIDER;
	}
	
	public static void tupUtils2FProvider(TupUtils2FProvider provider)
	{
		TUP_UTILS_2F_PROVIDER = provider;
	}
	
	public static TupUtils2FProvider tupUtils2FProvider()
	{
		return TUP_UTILS_2F_PROVIDER;
	}
	
	public static void compareTupUtils2FProvider(TupUtils2FProvider.CompareProvider provider)
	{
		COMPARE_TUP_UTILS_2F_PROVIDER = provider;
	}
	
	public static TupUtils2FProvider.CompareProvider compareTupUtils2FProvider()
	{
		return COMPARE_TUP_UTILS_2F_PROVIDER;
	}
	
	public static void lerpTupUtils2FProvider(TupUtils2FProvider.LerpProvider provider)
	{
		LERP_TUP_UTILS_2F_PROVIDER = provider;
	}
	
	public static TupUtils2FProvider.LerpProvider lerpTupUtils2FProvider()
	{
		return LERP_TUP_UTILS_2F_PROVIDER;
	}
	
	public static void useFMA(boolean value)
	{
		USE_FMA = value;
	}
	
	public static boolean useFMA()
	{
		return USE_FMA;
	}
	
	public static void fpToleranceF(float tolerance)
	{
		FP_TOLERANCE_F = tolerance;
	}
	
	public static float fpToleranceF()
	{
		return FP_TOLERANCE_F;
	}
	
	public static void fpToleranceD(double tolerance)
	{
		FP_TOLERANCE_D = tolerance;
	}
	
	public static double fpToleranceD()
	{
		return FP_TOLERANCE_D;
	}
}
