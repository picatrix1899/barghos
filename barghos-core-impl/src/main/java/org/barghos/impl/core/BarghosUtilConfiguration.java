package org.barghos.impl.core;

public class BarghosUtilConfiguration
{

	private static boolean USE_FMA = true;
	private static float FP_TOLERANCE_F = 1.e-6f;
	private static double FP_TOLERANCE_D = 1.e-6f;

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
