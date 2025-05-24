package org.barghos.util;

import org.barghos.util.math.MathUtilsProvider;
import org.barghos.util.math.IMathUtilsProvider;
import org.barghos.util.tuple.floats.ITupUtils2FProvider;
import org.barghos.util.tuple.floats.ITupUtils3FProvider;
import org.barghos.util.tuple.floats.DefaultTupUtils2FProvider;
import org.barghos.util.tuple.floats.DefaultTupUtils3FProvider;

public class BarghosUtilConfiguration
{
	private static IMathUtilsProvider MATH_UTILS_PROVIDER = new MathUtilsProvider();
	private static IMathUtilsProvider.IRoundProvider ROUND_MATH_UTILS_PROVIDER = new MathUtilsProvider.RoundProvider();
	private static IMathUtilsProvider.ILerpProvider LERP_MATH_UTILS_PROVIDER = new MathUtilsProvider.LerpProvider();
	private static IMathUtilsProvider.ICompareProvider COMPARE_MATH_UTILS_PROVIDER = new MathUtilsProvider.CompareProvider();
	
	private static ITupUtils2FProvider TUP_UTILS_2F_PROVIDER = new DefaultTupUtils2FProvider();
	private static ITupUtils2FProvider.CompareProvider COMPARE_TUP_UTILS_2F_PROVIDER = new DefaultTupUtils2FProvider.DefaultCompareProvider();
	private static ITupUtils2FProvider.LerpProvider LERP_TUP_UTILS_2F_PROVIDER = new DefaultTupUtils2FProvider.DefaultLerpProvider();
	
	private static ITupUtils3FProvider TUP_UTILS_3F_PROVIDER = new DefaultTupUtils3FProvider();
	private static ITupUtils3FProvider.CompareProvider COMPARE_TUP_UTILS_3F_PROVIDER = new DefaultTupUtils3FProvider.DefaultCompareProvider();
	private static ITupUtils3FProvider.LerpProvider LERP_TUP_UTILS_3F_PROVIDER = new DefaultTupUtils3FProvider.DefaultLerpProvider();
	
	private static boolean USE_FMA = true;
	private static float FP_TOLERANCE_F = 1.e-6f;
	private static double FP_TOLERANCE_D = 1.e-6f;
	
	public static void mathUtilsProvider(MathUtilsProvider provider)
	{
		MATH_UTILS_PROVIDER = provider;
	}
	
	public static IMathUtilsProvider mathUtilsProvider()
	{
		return MATH_UTILS_PROVIDER;
	}
	
	public static void roundMathUtilsProvider(IMathUtilsProvider.IRoundProvider provider)
	{
		ROUND_MATH_UTILS_PROVIDER = provider;
	}
	
	public static IMathUtilsProvider.IRoundProvider roundMathUtilsProvider()
	{
		return ROUND_MATH_UTILS_PROVIDER;
	}
	
	public static void lerpMathUtilsProvider(IMathUtilsProvider.ILerpProvider provider)
	{
		LERP_MATH_UTILS_PROVIDER = provider;
	}
	
	public static IMathUtilsProvider.ILerpProvider lerpMathUtilsProvider()
	{
		return LERP_MATH_UTILS_PROVIDER;
	}
	
	public static void compareMathUtilsProvider(IMathUtilsProvider.ICompareProvider provider)
	{
		COMPARE_MATH_UTILS_PROVIDER = provider;
	}
	
	public static IMathUtilsProvider.ICompareProvider compareMathUtilsProvider()
	{
		return COMPARE_MATH_UTILS_PROVIDER;
	}
	
	public static void tupUtils2FProvider(ITupUtils2FProvider provider)
	{
		TUP_UTILS_2F_PROVIDER = provider;
	}
	
	public static ITupUtils2FProvider tupUtils2FProvider()
	{
		return TUP_UTILS_2F_PROVIDER;
	}
	
	public static void compareTupUtils2FProvider(ITupUtils2FProvider.CompareProvider provider)
	{
		COMPARE_TUP_UTILS_2F_PROVIDER = provider;
	}
	
	public static ITupUtils2FProvider.CompareProvider compareTupUtils2FProvider()
	{
		return COMPARE_TUP_UTILS_2F_PROVIDER;
	}
	
	public static void lerpTupUtils2FProvider(ITupUtils2FProvider.LerpProvider provider)
	{
		LERP_TUP_UTILS_2F_PROVIDER = provider;
	}
	
	public static ITupUtils2FProvider.LerpProvider lerpTupUtils2FProvider()
	{
		return LERP_TUP_UTILS_2F_PROVIDER;
	}
	
	public static void tupUtils3FProvider(ITupUtils3FProvider provider)
	{
		TUP_UTILS_3F_PROVIDER = provider;
	}
	
	public static ITupUtils3FProvider tupUtils3FProvider()
	{
		return TUP_UTILS_3F_PROVIDER;
	}
	
	public static void compareTupUtils2FProvider(ITupUtils3FProvider.CompareProvider provider)
	{
		COMPARE_TUP_UTILS_3F_PROVIDER = provider;
	}
	
	public static ITupUtils3FProvider.CompareProvider compareTupUtils3FProvider()
	{
		return COMPARE_TUP_UTILS_3F_PROVIDER;
	}
	
	public static void lerpTupUtils3FProvider(ITupUtils3FProvider.LerpProvider provider)
	{
		LERP_TUP_UTILS_3F_PROVIDER = provider;
	}
	
	public static ITupUtils3FProvider.LerpProvider lerpTupUtils3FProvider()
	{
		return LERP_TUP_UTILS_3F_PROVIDER;
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
