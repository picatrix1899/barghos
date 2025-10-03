package org.barghos.api.core.math;

public class MathUtils
{
	/**
	 * The number PI with 11 digits after point.
	 */
	public static final double PI = 3.14159265359;
	
	/**
	 * The number PI with 11 digits after point.
	 */
	public static final float PIf = 3.14159265359f;
	
	/**
	 * This is the precalculated PI * 2. It's used in some trigonomic calculations.
	 */
	public static final double DOUBLE_PI = 6.28318530718; 
	
	/**
	 * This is the precalculated PI * 2. It's used in some trigonomic calculations.
	 */
	public static final float DOUBLE_PIf = 6.28318530718f; 
	
	/**
	 * The inverse of PI (1 / PI).
	 */
	public static final double INV_PI = 0.31830988618;
	
	/**
	 * The inverse of PI (1 / PI).
	 */
	public static final float INV_PIf = 0.31830988618f;
	
	/** 
	 * This is the precalculated Half-PI (PI / 2). It's used in some trigonomic calculations.
	 */
	public static final double HALF_PI = 1.570796326795;
	
	/** 
	 * This is the precalculated Half-PI (PI / 2). It's used in some trigonomic calculations.
	 */
	public static final float HALF_PIf = 1.570796326795f;
	
	/**
	 * This value is a precalculated scalar for conversation from degrees to radians.
	 * Just multiply it with an angle messured in degree and you get the angle in radians.
	 */
	public static final double DEG_TO_RAD = 0.017453292519944444;
	
	/**
	 * This value is a precalculated scalar for conversation from degrees to radians.
	 * Just multiply it with an angle messured in degree and you get the angle in radians.
	 */
	public static final float DEG_TO_RADf = 0.017453292519944444f;
	
		/**
	 * This value is a precalculated scalar for conversation from radians to degrees.
	 * Just multiply it with an angle messured in radians and you get the angle in degrees.
	 */
	public static final double RAD_TO_DEG = 57.29577951307855;
	
	/**
	 * This value is a precalculated scalar for conversation from radians to degrees.
	 * Just multiply it with an angle messured in radians and you get the angle in degrees.
	 */
	public static final float RAD_TO_DEGf = 57.29577951307855f;
	
	/**
	 * This is a precalculated inversed square-root of the number 2 (1 / sqrt(2)).
	 * It's commonly used for precalculated diagonal normal vectors i.e. vec3(1,1,0).
	 */
	public static final double INV_SQRT2 = 0.7071067811865475;
	
	/**
	 * This is a precalculated inversed square-root of the number 2 (1 / sqrt(2)).
	 * It's commonly used for precalculated diagonal normal vectors i.e. vec3(1,1,0).
	 */
	public static final float INV_SQRT2f = 0.7071067811865475f;

	/**
	 * This is a precalculated inversed square-root of the number 3 (1 / sqrt(3)).
	 * It's commonly used for precalculated diagonal normal vectors i.e. vec3(1,1,1).
	 */
	public static final double INV_SQRT3 = 0.5773502691896258;
	
	/**
	 * This is a precalculated inversed square-root of the number 3 (1 / sqrt(3)).
	 * It's commonly used for precalculated diagonal normal vectors i.e. vec3(1,1,1).
	 */
	public static final float INV_SQRT3f = 0.5773502691896258f;
	
	/**
	 * This is a precalculated square-root of the number 2 (sqrt(2));
	 */
	public static final double SQRT2 = 1.4142135623730951;
	
	/**
	 * This is a precalculated square-root of the number 2 (sqrt(2));
	 */
	public static final float SQRT2f = 1.4142135623730951f;
	
	/**
	 * This is a precalculated square-root of the number 3 (sqrt(3));
	 */
	public static final double SQRT3 = 1.7320508075688772;
	
	/**
	 * This is a precalculated square-root of the number 3 (sqrt(3));
	 */
	public static final float SQRT3f = 1.7320508075688772f;
	
	public static final double EM4 = 1.e-4;
	
	public static final float EM4f = 1.e-4f;
	
	public static final double EM6 = 1.e-6;
	
	public static final float EM6f = 1.e-6f;
	
	public static final double EM8 = 1.e-8;
	
	public static final float EM8f = 1.e-8f;
	
	public static long ceilDiv(long v0, long v1)
	{
		return Math.ceilDiv(v0, v1);
	}

	public static int ceilDiv(int v0, int v1)
	{
		return Math.ceilDiv(v0, v1);
	}

	public static long floorDiv(long v0, long v1)
	{
		return Math.floorDiv(v0, v1);
	}

	public static int floorDiv(int v0, int v1)
	{
		return Math.floorDiv(v0, v1);
	}
	
	public static double sqrt(double value)
	{
		return Math.sqrt(value);
	}
	
	public static float sqrt(float value)
	{
		return (float)Math.sqrt(value);
	}
	
	public static double recSqrt(double value)
	{
		return 1.0 / Math.sqrt(value);
	}

	public static float recSqrt(float value)
	{
		return (float)(1.0 / Math.sqrt(value));
	}
	
	public static double invSqrt(double value)
	{
		return 1.0 / Math.sqrt(value);
	}

	public static float invSqrt(float value)
	{
		return (float)(1.0 / Math.sqrt(value));
	}
	
	public static double cbrt(double value)
	{
		return Math.cbrt(value);
	}
	
	public static float cbrt(float value)
	{
		return (float)Math.cbrt(value);
	}
	
	public static double recCbrt(double value)
	{
		return 1.0 / Math.cbrt(value);
	}

	public static float recCbrt(float value)
	{
		return (float)(1.0 / Math.cbrt(value));
	}
	
	public static double invCbrt(double value)
	{
		return 1.0 / Math.cbrt(value);
	}

	public static float invCbrt(float value)
	{
		return (float)(1.0 / Math.sqrt(value));
	}
	
	public static double log(double value)
	{
		return Math.log(value);
	}

	public static double log10(double value)
	{
		return Math.log10(value);
	}
	
	public static float log10(float value)
	{
		return (float)Math.log10(value);
	}
	
	public static double log1p(double value)
	{
		return Math.log1p(value);
	}
	
	public static float log1p(float value)
	{
		return (float)Math.log1p(value);
	}
	
	public static double exp(double value)
	{
		return Math.exp(value);
	}
	
	public static float exp(float value)
	{
		return (float)Math.exp(value);
	}
	
	public static double expm1(double value)
	{
		return Math.expm1(value);
	}
	
	public static float expm1(float value)
	{
		return (float)Math.expm1(value);
	}
	
	public static double pow(double base, double power)
	{
		return Math.pow(base, power);
	}
	
	public static float pow(float base, float power)
	{
		return (float)Math.pow(base, power);
	}
	
	public static double fma(double a, double b, double c)
	{
		return Math.fma(a, b, c);
	}
	
	public static float fma(float a, float b, float c)
	{
		return Math.fma(a, b, c);
	}
	
	public static double sin(double angle)
	{
		return Math.sin(angle);
	}
	
	public static float sin(float angle)
	{
		return (float)Math.sin(angle);
	}

	public static double cos(double angle)
	{
		return Math.cos(angle);
	}
	
	public static float cos(float angle)
	{
		return (float)Math.cos(angle);
	}

	public static double tan(double angle)
	{
		return Math.tan(angle);
	}
	
	public static float tan(float angle)
	{
		return (float)Math.tan(angle);
	}
	
	public static double asin(double value)
	{
		return Math.asin(value);
	}
	
	public static float asin(float value)
	{
		return (float)Math.asin(value);
	}
	
	public static double acos(double value)
	{
		return Math.acos(value);
	}
	
	public static float acos(float value)
	{
		return (float)Math.acos(value);
	}
	
	public static double atan(double value)
	{
		return Math.atan(value);
	}
	
	public static float atan(float value)
	{
		return (float)Math.atan(value);
	}
	
	public static double atan2(double y, double x)
	{
		return Math.atan2(y, x);
	}
	
	public static float atan2(float y, float x)
	{
		return (float)Math.atan2(y, x);
	}
	
	public static double sinh(double angle)
	{
		return Math.sinh(angle);
	}
	
	public static float sinh(float angle)
	{
		return (float)Math.sinh(angle);
	}
	
	public static double cosh(double angle)
	{
		return Math.cosh(angle);
	}
	
	public static float cosh(float angle)
	{
		return (float)Math.cosh(angle);
	}

	public static double tanh(double angle)
	{
		return Math.tanh(angle);
	}
	
	public static float tanh(float angle)
	{
		return (float)Math.tanh(angle);
	}
	
	public static double hypot(double x, double y)
	{
		return Math.hypot(x, y);
	}
	
	public static float hypot(float x, float y)
	{
		return (float)Math.hypot(x, y);
	}
	
	public static double cot(double angle)
	{
		return  1.0 / Math.tan(angle);
	}
	
	public static float cot(float angle)
	{
		return (float)(1.0 / Math.tan(angle));
	}
	
	public static double sec(double angle)
	{
		return 1.0 / Math.cos(angle);
	}
	
	public static float sec(float angle)
	{
		return (float)(1.0 / Math.cos(angle));
	}
	
	public static double csc(double angle)
	{
		return 1.0 / Math.sin(angle);
	}
	
	public static double cscF2D(float angle)
	{
		return 1.0 / Math.sin(angle);
	}
	
	public static float csc(float angle)
	{
		return (float)(1.0 / Math.sin(angle));
	}
	
	public static double frac(double value)
	{
		return value - (long)value;
	}
	
	public static float frac(float value)
	{
		return value - (int)value;
	}
	
	public static double integer(double value)
	{
		return (long)value;
	}
	
	public static float integer(float value)
	{
		return (int)value;
	}
	
	public static double signum(double value)
	{
		return Math.signum(value);
	}
	
	public static float signumF(double value)
	{
		return (float)Math.signum(value);
	}
	
	public static float signum(float value)
	{
		return Math.signum(value);
	}
	
	public static long signum(long value)
	{
		return (long)Math.signum(value);
	}
	
	public static int signumI(double value)
	{
		return (int)Math.signum(value);
	}
	
	public static int signumI(float value)
	{
		return (int)Math.signum(value);
	}
	
	public static int signumI(long value)
	{
		return (int)Math.signum(value);
	}
	
	public static int signum(int value)
	{
		return (int)Math.signum(value);
	}
	
	public static double signumEM(double tolerance, double value)
	{
		if(Double.isNaN(value)) return Double.NaN;

		return Math.abs(value) <= tolerance ? Math.copySign(0.0, value) : Math.signum(value);
	}
	
	public static float signumEM(float tolerance, float value)
	{
		if(Float.isNaN(value)) return Float.NaN;

		return Math.abs(value) <= tolerance ? Math.copySign(0.0f, value) : Math.signum(value);
	}
	
	public static long signumEM(long tolerance, long value)
	{
		return Math.abs(value) <= tolerance ? 0l : (long)Math.signum(value);
	}
	
	public static int signumIEM(double tolerance, double value)
	{
		return Math.abs(value) <= tolerance ? 0 : (int)Math.signum(value);
	}
	
	public static int signumIEM(float tolerance, float value)
	{
		return Math.abs(value) <= tolerance ? 0 : (int)Math.signum(value);
	}
	
	public static int signumIEM(long tolerance, long value)
	{
		return Math.abs(value) <= tolerance ? 0 : (int)Math.signum(value);
	}
	
	public static int signumEM(int tolerance, int value)
	{
		return Math.abs(value) <= tolerance ? 0 : (int)Math.signum(value);
	}
	
	public static double signumEM4(double value)
	{
		if(Double.isNaN(value)) return Double.NaN;

		return Math.abs(value) <= EM4 ? Math.copySign(0.0, value) : Math.signum(value);
	}
	
	public static float signumEM4(float value)
	{
		if(Float.isNaN(value)) return Float.NaN;

		return Math.abs(value) <= EM4f ? Math.copySign(0.0f, value) : Math.signum(value);
	}
	
	public static int signumIEM4(double value)
	{
		return Math.abs(value) <= EM4 ? 0 : (int)Math.signum(value);
	}
	
	public static int signumIEM4(float value)
	{
		return Math.abs(value) <= EM4f ? 0 : (int)Math.signum(value);
	}
	
	public static double signumEM6(double value)
	{
		if(Double.isNaN(value)) return Double.NaN;

		return Math.abs(value) <= EM6 ? Math.copySign(0.0, value) : Math.signum(value);
	}
	
	public static float signumEM6(float value)
	{
		if(Float.isNaN(value)) return Float.NaN;

		return Math.abs(value) <= EM6f ? Math.copySign(0.0f, value) : Math.signum(value);
	}
	
	public static int signumIEM6(double value)
	{
		return Math.abs(value) <= EM6 ? 0 : (int)Math.signum(value);
	}
	
	public static int signumIEM6(float value)
	{
		return Math.abs(value) <= EM6f ? 0 : (int)Math.signum(value);
	}
	
	public static double signumEM8(double value)
	{
		if(Double.isNaN(value)) return Double.NaN;

		return Math.abs(value) <= EM8 ? Math.copySign(0.0, value) : Math.signum(value);
	}
	
	public static float signumEM8(float value)
	{
		if(Float.isNaN(value)) return Float.NaN;

		return Math.abs(value) <= EM8f ? Math.copySign(0.0f, value) : Math.signum(value);
	}
	
	public static int signumIEM8(double value)
	{
		return Math.abs(value) <= EM8 ? 0 : (int)Math.signum(value);
	}
	
	public static int signumIEM8(float value)
	{
		return Math.abs(value) <= EM8f ? 0 : (int)Math.signum(value);
	}
	
	public static double abs(double value)
	{
		return Math.abs(value);
	}
	
	public static float abs(float value)
	{
		return Math.abs(value);
	}
	
	public static long abs(long value)
	{
		return Math.abs(value);
	}
	
	public static int abs(int value)
	{
		return Math.abs(value);
	}
	
	public static double min(double value1, double value2)
	{
		return Math.min(value1, value2);
	}
	
	public static double min(double value1, double value2, double value3)
	{
		return Math.min(value1, Math.min(value2, value3));
	}
	
	public static double min(double value1, double value2, double value3, double value4)
	{
		return Math.min(value1, Math.min(value2, Math.min(value3, value4)));
	}
	
	public static double min(double value1, double value2, double value3, double value4, double value5)
	{
		return Math.min(value1, Math.min(value2, Math.min(value3, Math.min(value4, value5))));
	}
	
	public static double min(double... values)
	{
		double value = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			value = Math.min(value, values[i]);
		}
		
		return value;
	}
	
	public static float min(float value1, float value2)
	{
		return Math.min(value1, value2);
	}
	
	public static float min(float value1, float value2, float value3)
	{
		return Math.min(value1, Math.min(value2, value3));
	}
	
	public static float min(float value1, float value2, float value3, float value4)
	{
		return Math.min(value1, Math.min(value2, Math.min(value3, value4)));
	}
	
	public static float min(float value1, float value2, float value3, float value4, float value5)
	{
		return Math.min(value1, Math.min(value2, Math.min(value3, Math.min(value4, value5))));
	}
	
	public static float min(float... values)
	{
		float value = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			value = Math.min(value, values[i]);
		}
		
		return value;
	}
	
	public static long min(long value1, long value2)
	{
		return Math.min(value1, value2);
	}
	
	public static long min(long value1, long value2, long value3)
	{
		return Math.min(value1, Math.min(value2, value3));
	}
	
	public static long min(long value1, long value2, long value3, long value4)
	{
		return Math.min(value1, Math.min(value2, Math.min(value3, value4)));
	}
	
	public static long min(long value1, long value2, long value3, long value4, long value5)
	{
		return Math.min(value1, Math.min(value2, Math.min(value3, Math.min(value4, value5))));
	}
	
	public static long min(long... values)
	{
		long value = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			value = Math.min(value, values[i]);
		}
		
		return value;
	}
	
	public static int min(int value1, int value2)
	{
		return Math.min(value1, value2);
	}
	
	public static int min(int value1, int value2, int value3)
	{
		return Math.min(value1, Math.min(value2, value3));
	}
	
	public static int min(int value1, int value2, int value3, int value4)
	{
		return Math.min(value1, Math.min(value2, Math.min(value3, value4)));
	}
	
	public static int min(int value1, int value2, int value3, int value4, int value5)
	{
		return Math.min(value1, Math.min(value2, Math.min(value3, Math.min(value4, value5))));
	}
	
	public static int min(int... values)
	{
		int value = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			value = Math.min(value, values[i]);
		}
		
		return value;
	}
	
	public static double max(double value1, double value2)
	{
		return Math.max(value1, value2);
	}
	
	public static double max(double value1, double value2, double value3)
	{
		return Math.max(value1, Math.max(value2, value3));
	}
	
	public static double max(double value1, double value2, double value3, double value4)
	{
		return Math.max(value1, Math.max(value2, Math.max(value3, value4)));
	}
	
	public static double max(double value1, double value2, double value3, double value4, double value5)
	{
		return Math.max(value1, Math.max(value2, Math.max(value3, Math.max(value4, value5))));
	}
	
	public static double max(double... values)
	{
		double value = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			value = Math.max(value, values[i]);
		}
		
		return value;
	}
	
	public static float max(float value1, float value2)
	{
		return Math.max(value1, value2);
	}
	
	public static float max(float value1, float value2, float value3)
	{
		return Math.max(value1, Math.max(value2, value3));
	}
	
	public static float max(float value1, float value2, float value3, float value4)
	{
		return Math.max(value1, Math.max(value2, Math.max(value3, value4)));
	}
	
	public static float max(float value1, float value2, float value3, float value4, float value5)
	{
		return Math.max(value1, Math.max(value2, Math.max(value3, Math.max(value4, value5))));
	}
	
	public static float max(float... values)
	{
		float value = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			value = Math.max(value, values[i]);
		}
		
		return value;
	}
	
	public static long max(long value1, long value2)
	{
		return Math.max(value1, value2);
	}
	
	public static long max(long value1, long value2, long value3)
	{
		return Math.max(value1, Math.max(value2, value3));
	}
	
	public static long max(long value1, long value2, long value3, long value4)
	{
		return Math.max(value1, Math.max(value2, Math.max(value3, value4)));
	}
	
	public static long max(long value1, long value2, long value3, long value4, long value5)
	{
		return Math.max(value1, Math.max(value2, Math.max(value3, Math.max(value4, value5))));
	}
	
	public static long max(long... values)
	{
		long value = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			value = Math.max(value, values[i]);
		}
		
		return value;
	}
	
	public static int max(int value1, int value2)
	{
		return Math.max(value1, value2);
	}
	
	public static int max(int value1, int value2, int value3)
	{
		return Math.max(value1, Math.max(value2, value3));
	}
	
	public static int max(int value1, int value2, int value3, int value4)
	{
		return Math.max(value1, Math.max(value2, Math.max(value3, value4)));
	}
	
	public static int max(int value1, int value2, int value3, int value4, int value5)
	{
		return Math.max(value1, Math.max(value2, Math.max(value3, Math.max(value4, value5))));
	}
	
	public static int max(int... values)
	{
		int value = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			value = Math.max(value, values[i]);
		}
		
		return value;
	}
	
	public static double clampMin(double value, double min)
	{
		return Math.max(value, min);
	}

	public static float clampMin(float value, float min)
	{
		return Math.max(value, min);
	}
	
	public static long clampMin(long value, long min)
	{
		return Math.max(value, min);
	}
	
	public static int clampMin(int value, int min)
	{
		return Math.max(value, min);
	}
	
	public static double clampMinEM(double tolerance, double value, double min)
	{
		if(Double.isNaN(value) || Double.isNaN(min)) return Double.NaN;
		
		return value < min + tolerance ? min : value;
	}

	public static float clampMinEM(float tolerance, float value, float min)
	{
		if(Float.isNaN(value) || Float.isNaN(min)) return Float.NaN;
		
		return value < min + tolerance ? min : value;
	}
	
	public static long clampMinEM(long tolerance, long value, long min)
	{
		return value < min + tolerance ? min : value;
	}
	
	public static int clampMinEM(int tolerance, int value, int min)
	{
		return value < min + tolerance ? min : value;
	}
	
	public static double clampMinEM4(double value, double min)
	{
		if(Double.isNaN(value) || Double.isNaN(min)) return Double.NaN;
		
		return value < min + EM4 ? min : value;
	}

	public static float clampMinEM4(float value, float min)
	{
		if(Float.isNaN(value) || Float.isNaN(min)) return Float.NaN;
		
		return value < min + EM4f ? min : value;
	}
	
	public static double clampMinEM6(double value, double min)
	{
		if(Double.isNaN(value) || Double.isNaN(min)) return Double.NaN;
		
		return value < min + EM6 ? min : value;
	}

	public static float clampMinEM6(float value, float min)
	{
		if(Float.isNaN(value) || Float.isNaN(min)) return Float.NaN;
		
		return value < min + EM6f ? min : value;
	}
	
	public static double clampMinEM8(double value, double min)
	{
		if(Double.isNaN(value) || Double.isNaN(min)) return Double.NaN;
		
		return value < min + EM8 ? min : value;
	}

	public static float clampMinEM8(float value, float min)
	{
		if(Float.isNaN(value) || Float.isNaN(min)) return Float.NaN;
		
		return value < min + EM8f ? min : value;
	}
	
	public static double clampMax(double value, double max)
	{
		return Math.min(value, max);
	}

	public static float clampMax(float value, float max)
	{
		return Math.min(value, max);
	}
	
	public static long clampMax(long value, long max)
	{
		return Math.min(value, max);
	}
	
	public static int clampMax(int value, int max)
	{
		return Math.min(value, max);
	}
	
	public static double clampMaxEM(double tolerance, double value, double max)
	{
		if(Double.isNaN(value) || Double.isNaN(max)) return Double.NaN;
		
		return value > max - tolerance ? max : value;
	}

	public static float clampMaxEM(float tolerance, float value, float max)
	{
		if(Float.isNaN(value) || Float.isNaN(max)) return Float.NaN;
		
		return value > max - tolerance ? max : value;
	}
	
	public static long clampMaxEM(long tolerance, long value, long max)
	{
		return value > max - tolerance ? max : value;
	}
	
	public static int clampMaxEM(int tolerance, int value, int max)
	{
		return value > max - tolerance ? max : value;
	}
	
	public static double clampMaxEM4(double value, double max)
	{
		if(Double.isNaN(value) || Double.isNaN(max)) return Double.NaN;
		
		return value > max - EM4 ? max : value;
	}

	public static float clampMaxEM4(float value, float max)
	{
		if(Float.isNaN(value) || Float.isNaN(max)) return Float.NaN;
		
		return value > max - EM4f ? max : value;
	}
	
	public static double clampMaxEM6(double value, double max)
	{
		if(Double.isNaN(value) || Double.isNaN(max)) return Double.NaN;
		
		return value > max - EM6 ? max : value;
	}

	public static float clampMaxEM6(float value, float max)
	{
		if(Float.isNaN(value) || Float.isNaN(max)) return Float.NaN;
		
		return value > max - EM6f ? max : value;
	}
	
	public static double clampMaxEM8(double value, double max)
	{
		if(Double.isNaN(value) || Double.isNaN(max)) return Double.NaN;
		
		return value > max - EM8 ? max : value;
	}

	public static float clampMaxEM8(float value, float max)
	{
		if(Float.isNaN(value) || Float.isNaN(max)) return Float.NaN;
		
		return value > max - EM8f ? max : value;
	}
	
	public static double clamp(double value, double min, double max)
	{
		return Math.clamp(value, min, max);
	}
	
	public static float clamp(float value, float min, float max)
	{
		return Math.clamp(value, min, max);
	}
	
	public static long clamp(long value, long min, long max)
	{
		return Math.clamp(value, min, max);
	}
	
	public static int clamp(int value, int min, int max)
	{
		return Math.clamp(value, min, max);
	}

	public static double clampEM(double tolerance, double value, double min, double max)
	{
		if(Double.isNaN(value) || Double.isNaN(min) || Double.isNaN(max)) return Double.NaN;
		
		return value < min + tolerance ? min : value > max - tolerance ? max : value;
	}

	public static float clampEM(float tolerance, float value, float min, float max)
	{
		if(Float.isNaN(value) || Float.isNaN(min) || Float.isNaN(max)) return Float.NaN;
		
		return value < min + tolerance ? min : value > max - tolerance ? max : value;
	}
	
	public static long clampEM(long tolerance, long value, long min, long max)
	{
		return value < min + tolerance ? min : value > max - tolerance ? max : value;
	}
	
	public static int clampEM(int tolerance, int value, int min, int max)
	{
		return value < min + tolerance ? min : value > max - tolerance ? max : value;
	}
	
	public static double clampEM4(double tolerance, double value, double min, double max)
	{
		if(Double.isNaN(value) || Double.isNaN(min) || Double.isNaN(max)) return Double.NaN;
		
		return value < min + EM4 ? min : value > max - EM4 ? max : value;
	}

	public static float clampEM4(float tolerance, float value, float min, float max)
	{
		if(Float.isNaN(value) || Float.isNaN(min) || Float.isNaN(max)) return Float.NaN;
		
		return value < min + EM4f ? min : value > max - EM4f ? max : value;
	}
	
	public static double clampEM6(double tolerance, double value, double min, double max)
	{
		if(Double.isNaN(value) || Double.isNaN(min) || Double.isNaN(max)) return Double.NaN;
		
		return value < min + EM6 ? min : value > max - EM6 ? max : value;
	}

	public static float clampEM6(float tolerance, float value, float min, float max)
	{
		if(Float.isNaN(value) || Float.isNaN(min) || Float.isNaN(max)) return Float.NaN;
		
		return value < min + EM6f ? min : value > max - EM6f ? max : value;
	}
	
	public static double clampEM8(double tolerance, double value, double min, double max)
	{
		if(Double.isNaN(value) || Double.isNaN(min) || Double.isNaN(max)) return Double.NaN;
		
		return value < min + EM8 ? min : value > max - EM8 ? max : value;
	}

	public static float clampEM8(float tolerance, float value, float min, float max)
	{
		if(Float.isNaN(value) || Float.isNaN(min) || Float.isNaN(max)) return Float.NaN;
		
		return value < min + EM8f ? min : value > max - EM8f ? max : value;
	}
	
	public static double lerp(double alpha, double a, double b)
	{
		return (a + alpha * (b - a));
	}
	
	public static float lerp(double alpha, float a, float b)
	{
		return (float)(a + alpha * (b - a));
	}
	
	public static double quadricBezier(double alpha, double a, double b, double c)
	{
		double p0 = lerp(alpha, a, b);
		
		return (p0 + alpha * (lerp(alpha, b, c) - p0));
	}
	
	public static float quadricBezier(double alpha, float a, float b, float c)
	{
		double p0 = lerp(alpha, (double)a, (double)b);
		
		return (float)(p0 + alpha * (lerp(alpha, (double)b, (double)c) - p0));
	}
	
	public static double cubicBezier(double alpha, double a, double b, double c, double d)
	{
		double p0 = quadricBezier(alpha, (double)a, (double)b, (double)c);
		
		return (p0 + alpha * (quadricBezier(alpha, (double)b, (double)c, (double)d) - p0));
	}
	
	public static float cubicBezier(double alpha, float a, float b, float c, float d)
	{
		double p0 = quadricBezier(alpha, (double)a, (double)b, (double)c);
		
		return (float)(p0 + alpha * (quadricBezier(alpha, (double)b, (double)c, (double)d) - p0));
	}
	
	public static double bicubicBezier(double alpha, double a, double b, double c, double d, double e)
	{
		double p0 = cubicBezier(alpha, (double)a, (double)b, (double)c, (double)d);
		
		return (p0 + alpha * (cubicBezier(alpha, (double)b, (double)c, (double)d, (double)e) - p0));
	}
	
	public static float bicubicBezier(double alpha, float a, float b, float c, float d, float e)
	{
		double p0 = cubicBezier(alpha, (double)a, (double)b, (double)c, (double)d);
		
		return (float)(p0 + alpha * (cubicBezier(alpha, (double)b, (double)c, (double)d, (double)e) - p0));
	}
	
	public static double step(double alpha, double midpoint, double a, double b)
	{
		return (alpha < midpoint ? a : b);
	}
	
	public static float step(double alpha, double midpoint, float a, float b)
	{
		return (alpha < midpoint ? a : b);
	}
	
	public static double smoothstep(double alpha, double a, double b)
	{
		double smoothAlpha = MathUtils.clamp(alpha, 0.0, 1.0);
		smoothAlpha = smoothAlpha * smoothAlpha * (3 - 2 * smoothAlpha);
		
		return (a + smoothAlpha * (b - a));
	}
	
	public static float smoothstep(double alpha, float a, float b)
	{
		double smoothAlpha = MathUtils.clamp(alpha, 0.0, 1.0);
		smoothAlpha = smoothAlpha * smoothAlpha * (3 - 2 * smoothAlpha);
		
		return (float)(a + smoothAlpha * (b - a));
	}
	
	public static double smootherstep(double alpha, double a, double b)
	{
		double smoothAlpha = MathUtils.clamp(alpha, 0.0, 1.0);
		smoothAlpha = smoothAlpha * smoothAlpha * smoothAlpha * (smoothAlpha * (smoothAlpha * 6 - 15) + 10);
		
		return (a + smoothAlpha * (b - a));
	}
	
	public static float smootherstep(double alpha, float a, float b)
	{
		double smoothAlpha = MathUtils.clamp(alpha, 0.0, 1.0);
		smoothAlpha = smoothAlpha * smoothAlpha * smoothAlpha * (smoothAlpha * (smoothAlpha * 6 - 15) + 10);
		
		return (float)(a + smoothAlpha * (b - a));
	}
	
	public static double intLerp(double alpha, double v)
	{
		return (alpha * v);
	}
	
	public static float intLerp(double alpha, float v)
	{
		return  (float)(alpha * v);
	}
	
	public static double intLerp(double alpha, double a, double b)
	{
		return (a + alpha * (b - a));
	}
	
	public static float intLerp(double alpha, float a, float b)
	{
		return (float)(a + alpha * (b - a));
	}

	public static boolean isZeroEM(double tolerance, double value)
	{
		return Math.abs(value) <= tolerance;
	}
	
	public static boolean isZeroEM(float tolerance, float value)
	{
		return Math.abs(value) <= tolerance;
	}
	
	public static boolean isZeroEM(long tolerance, long value)
	{
		return Math.abs(value) <= tolerance;
	}
	
	public static boolean isZeroEM(int tolerance, int value)
	{
		return Math.abs(value) <= tolerance;
	}
	
	public static boolean isZeroEM4(double value)
	{
		return Math.abs(value) <= EM4;
	}
	
	public static boolean isZeroEM4(float value)
	{
		return Math.abs(value) <= EM4f;
	}

	public static boolean isZeroEM6(double value)
	{
		return Math.abs(value) <= EM6;
	}
	
	public static boolean isZeroEM6(float value)
	{
		return Math.abs(value) <= EM6f;
	}
	
	public static boolean isZeroEM8(double value)
	{
		return Math.abs(value) <= EM8;
	}
	
	public static boolean isZeroEM8(float value)
	{
		return Math.abs(value) <= EM8f;
	}
	
	public static int compare(double a, double b)
	{
		return Double.compare(a, b);
	}

	public static int compare(float a, float b)
	{
		return Float.compare(a, b);
	}
	
	public static int compare(long a, long b)
	{
		return Long.compare(a, b);
	}
	
	public static int compare(int a, int b)
	{
		return Integer.compare(a, b);
	}
	
	public static int compareEM(double tolerance, double a, double b)
	{
		if(MathUtils.abs(a - b) <= tolerance) return 0;
		
		return Double.compare(a, b);
	}
	
	public static int compareEM(float tolerance, float a, float b)
	{
		if(MathUtils.abs(a - b) <= tolerance) return 0;
		
		return Float.compare(a, b);
	}
	
	public static int compareEM(long tolerance, long a, long b)
	{
		if(MathUtils.abs(a - b) <= tolerance) return 0;
		
		return Long.compare(a, b);
	}
	
	public static int compareEM(int tolerance, int a, int b)
	{
		if(MathUtils.abs(a - b) <= tolerance) return 0;
		
		return Integer.compare(a, b);
	}
	
	public static int compareEM4(double a, double b)
	{
		if(MathUtils.abs(a - b) <= EM4) return 0;
		
		return Double.compare(a, b);
	}
	
	public static int compareEM4(float a, float b)
	{
		if(MathUtils.abs(a - b) <= EM4f) return 0;
		
		return Float.compare(a, b);
	}
	
	public static int compareEM6(double a, double b)
	{
		if(MathUtils.abs(a - b) <= EM6) return 0;
		
		return Double.compare(a, b);
	}
	
	public static int compareEM6(float a, float b)
	{
		if(MathUtils.abs(a - b) <= EM6f) return 0;
		
		return Float.compare(a, b);
	}
	
	public static int compareEM8(double a, double b)
	{
		if(MathUtils.abs(a - b) <= EM8) return 0;
		
		return Double.compare(a, b);
	}
	
	public static int compareEM8(float a, float b)
	{
		if(MathUtils.abs(a - b) <= EM8f) return 0;
		
		return Float.compare(a, b);
	}
	
	public static boolean equalsEM(long tolerance, long a, long b)
	{
		return MathUtils.abs(a - b) <= tolerance;
	}
	
	public static boolean equalsEM(int tolerance, int a, int b)
	{
		return MathUtils.abs(a - b) <= tolerance;
	}
	
	public static boolean equalsEM(double tolerance, double a, double b)
	{
		return MathUtils.abs(a - b) <= tolerance;
	}
	
	public static boolean equalsEM(float tolerance, float a, float b)
	{
		return MathUtils.abs(a - b) <= tolerance;
	}
	
	public static boolean equalsEM4(double a, double b)
	{
		return MathUtils.abs(a - b) <= EM4;
	}
	
	public static boolean equalsEM4(float a, float b)
	{
		return MathUtils.abs(a - b) <= EM4f;
	}
	
	public static boolean equalsEM6(double a, double b)
	{
		return MathUtils.abs(a - b) <= EM6;
	}
	
	public static boolean equalsEM6(float a, float b)
	{
		return MathUtils.abs(a - b) <= EM6f;
	}
	
	public static boolean equalsEM8(double a, double b)
	{
		return MathUtils.abs(a - b) <= EM8;
	}
	
	public static boolean equalsEM8(float a, float b)
	{
		return MathUtils.abs(a - b) <= EM8f;
	}

	public static boolean lessEM(double tolerance, double a, double b)
	{
		return a + tolerance < b;
	}
	
	public static boolean lessEM(float tolerance, float a, float b)
	{
		return a + tolerance < b;
	}
	
	public static boolean lessEM(long tolerance, long a, long b)
	{
		return a + tolerance < b;
	}
	
	public static boolean lessEM(int tolerance, int a, int b)
	{
		return a + tolerance < b;
	}
	
	public static boolean lessEM4(double a, double b)
	{
		return a + EM4 < b;
	}
	
	public static boolean lessEM4(float a, float b)
	{
		return a + EM4f < b;
	}
	
	public static boolean lessEM6(double a, double b)
	{
		return a + EM6 < b;
	}
	
	public static boolean lessEM6(float a, float b)
	{
		return a + EM6f < b;
	}
	
	public static boolean lessEM8(double a, double b)
	{
		return a + EM8 < b;
	}
	
	public static boolean lessEM8(float a, float b)
	{
		return a + EM8f < b;
	}

	public static boolean lessEqualEM(double tolerance, double a, double b)
	{
		return a <= b + tolerance;
	}
	
	public static boolean lessEqualEM(float tolerance, float a, float b)
	{
		return a <= b + tolerance;
	}
	
	public static boolean lessEqualEM(long tolerance, long a, long b)
	{
		return a <= b + tolerance;
	}
	
	public static boolean lessEqualEM(int tolerance, int a, int b)
	{
		return a <= b + tolerance;
	}
	
	public static boolean lessEqualEM4(double a, double b)
	{
		return a <= b + EM4;
	}
	
	public static boolean lessEqualEM4(float a, float b)
	{
		return a <= b + EM4f;
	}
	
	public static boolean lessEqualEM6(double a, double b)
	{
		return a <= b + EM6;
	}
	
	public static boolean lessEqualEM6(float a, float b)
	{
		return a <= b + EM6f;
	}
	
	public static boolean lessEqualEM8(double a, double b)
	{
		return a <= b + EM8;
	}
	
	public static boolean lessEqualEM8(float a, float b)
	{
		return a <= b + EM8f;
	}

	public static boolean greaterEM(double tolerance, double a, double b)
	{
		return a > b + tolerance;
	}
	
	public static boolean greaterEM(float tolerance, float a, float b)
	{
		return a > b + tolerance;
	}
	
	public static boolean greaterEM(long tolerance, long a, long b)
	{
		return a > b + tolerance;
	}
	
	public static boolean greaterEM(int tolerance, int a, int b)
	{
		return a > b + tolerance;
	}
	
	public static boolean greaterEM4(double a, double b)
	{
		return a > b + EM4;
	}
	
	public static boolean greaterEM4(float a, float b)
	{
		return a > b + EM4f;
	}
	
	public static boolean greaterEM6(double a, double b)
	{
		return a > b + EM6;
	}
	
	public static boolean greaterEM6(float a, float b)
	{
		return a > b + EM6f;
	}
	
	public static boolean greaterEM8(double a, double b)
	{
		return a > b + EM8;
	}
	
	public static boolean greaterEM8(float a, float b)
	{
		return a > b + EM8f;
	}
	
	public static boolean greaterEqualEM(double tolerance, double a, double b)
	{
		return a + tolerance >= b;
	}
	
	public static boolean greaterEqualEM(float tolerance, float a, float b)
	{
		return a + tolerance >= b;
	}
	
	public static boolean greaterEqualEM(long tolerance, long a, long b)
	{
		return a + tolerance >= b;
	}
	
	public static boolean greaterEqualEM(int tolerance, int a, int b)
	{
		return a + tolerance >= b;
	}
	
	public static boolean greaterEqualEM4(double a, double b)
	{
		return a + EM4 >= b;
	}
	
	public static boolean greaterEqualEM4(float a, float b)
	{
		return a + EM4f >= b;
	}
	
	public static boolean greaterEqualEM6(double a, double b)
	{
		return a + EM6 >= b;
	}
	
	public static boolean greaterEqualEM6(float a, float b)
	{
		return a + EM6f >= b;
	}
	
	public static boolean greaterEqualEM8(double a, double b)
	{
		return a + EM8 >= b;
	}
	
	public static boolean greaterEqualEM8(float a, float b)
	{
		return a + EM8f >= b;
	}

	public static double floor(double value)
	{
		return Math.floor(value);
	}

	public static float floor(float value)
	{
		return (float)Math.floor(value);
	}

	public static double ceil(double value)
	{
		return Math.ceil(value);
	}

	public static float ceil(float value)
	{
		return (float)Math.ceil(value);
	}

	public static double round(double value)
	{
		return Math.round(value);
	}

	public static float round(float value)
	{
		return (float)Math.round(value);
	}

	public static double round(double value, IRoundMethodD method)
	{
		return method.roundD(value);
	}

	public static float round(float value, IRoundMethodF method)
	{
		return method.roundF(value);
	}
	
	public static double trunc(double value)
	{
		return (long)value;
	}
	
	public static float trunc(float value)
	{
		return (int)value;
	}

	public static double ceilEven(double value)
	{
		if(value == 0.0 || !Double.isFinite(value)) return value;
		
		double val = Math.ceil(value);
		return (((long)val & 1) == 0 ? val : val + 1);
	}
	
	public static float ceilEven(float value)
	{
		if(value == 0.0f || !Float.isFinite(value)) return value;
		
		double val = Math.ceil(value);
		return (float)(((long)val & 1) == 0 ? val : val + 1);
	}
	
	public static long ceilEven(long value)
	{
		if(value == 0l) return 0l;
		
		return ((value & 1) == 0 ? value : value + 1);
	}
	
	public static int ceilEven(int value)
	{
		if(value == 0) return 0;
		
		return ((value & 1) == 0 ? value : value + 1);
	}
	
	public static double ceilOdd(double value)
	{
		if(!Double.isFinite(value)) return value;
		
		double val = Math.ceil(value);
		return (((long)val & 1) == 0 ? val + 1 : val);
	}
	
	public static float ceilOdd(float value)
	{
		if(!Float.isFinite(value)) return value;
		
		double val = Math.ceil(value);
		return (float)(((long)val & 1) == 0 ? val + 1 : val);
	}
	
	public static long ceilOdd(long value)
	{
		return ((value & 1) == 0 ? value + 1 : value);
	}
	
	public static int ceilOdd(int value)
	{
		return ((value & 1) == 0 ? value + 1 : value);
	}
	
	public static double ceilOddZero(double value)
	{
		if(value == 0.0 || !Double.isFinite(value)) return value;
		
		double val = Math.ceil(value);
		return (((long)val & 1) == 0 ? val + 1 : val);
	}
	
	public static float ceilOddZero(float value)
	{
		if(value == 0.0f || !Float.isFinite(value)) return value;
		
		double val = Math.ceil(value);
		return (float)(((long)val & 1) == 0 ? val + 1 : val);
	}
	
	public static long ceilOddZero(long value)
	{
		if(value == 0) return 0l;
		
		return ((value & 1) == 0 ? value + 1 : value);
	}
	
	public static int ceilOddZero(int value)
	{
		if(value == 0) return 0;
		
		return ((value & 1) == 0 ? value + 1 : value);
	}
	
	public static double floorEven(double value)
	{
		if(value == 0.0 || !Double.isFinite(value)) return value;
		
		double val = Math.floor(value);
		return (((long)val & 1) == 0 ? val : val - 1);
	}
	
	public static float floorEven(float value)
	{
		if(value == 0.0f || !Float.isFinite(value)) return value;
		
		double val = Math.floor(value);
		return (float)(((long)val & 1) == 0 ? val : val - 1);
	}
	
	public static long floorEven(long value)
	{
		if(value == 0l) return 0l;
		
		return ((value & 1) == 0 ? value : value - 1);
	}
	
	public static int floorEven(int value)
	{
		if(value == 0) return 0;
		
		return ((value & 1) == 0 ? value : value - 1);
	}
	
	public static double floorOdd(double value)
	{
		if(!Double.isFinite(value)) return value;
		
		double val = Math.floor(value);
		return (((long)val & 1) == 0 ? val - 1 : val);
	}
	
	public static float floorOdd(float value)
	{
		if(!Float.isFinite(value)) return value;
		
		double val = Math.floor(value);
		return (float)(((long)val & 1) == 0 ? val - 1 : val);
	}
	
	public static long floorOdd(long value)
	{
		return ((value & 1) == 0 ? value - 1 : value);
	}
	
	public static int floorOdd(int value)
	{
		return ((value & 1) == 0 ? value - 1 : value);
	}
	
	public static double floorOddZero(double value)
	{
		if(value == 0.0 || !Double.isFinite(value)) return value;
		
		double val = Math.floor(value);
		return (((long)val & 1) == 0 ? val - 1 : val);
	}
	
	public static float floorOddZero(float value)
	{
		if(value == 0.0f || !Float.isFinite(value)) return value;
		
		double val = Math.floor(value);
		return (float)(((long)val & 1) == 0 ? val - 1 : val);
	}
	
	public static long floorOddZero(long value)
	{
		if(value == 0) return 0l;
		
		return ((value & 1) == 0 ? value - 1 : value);
	}
	
	public static int floorOddZero(int value)
	{
		if(value == 0) return 0;
		
		return ((value & 1) == 0 ? value - 1 : value);
	}
	
	public static double roundEven(double value)
	{
		if(value == 0.0 || !Double.isFinite(value)) return value;
		
		double mid = (long)(value * 0.5) * 2.0 + Math.signum(value);
		return (mid + (value >= mid ? 1 : -1)); 
	}
	
	public static float roundEven(float value)
	{
		if(value == 0.0 || !Float.isFinite(value)) return value;
		
		double mid = (long)(value * 0.5) * 2.0 + Math.signum(value);
		return (float)(mid + (value >= mid ? 1 : -1)); 
	}
	
	public static double roundOdd(double value)
	{
		if(!Double.isFinite(value)) return value;
		
		double mid = (long)((value + 1) * 0.5) * 2.0 - 1.0 + (value == 0.0 ? 1 : Math.signum(value));
		return (mid + (value >= mid ? 1 : -1)); 
	}
	
	public static float roundOdd(float value)
	{
		if(!Float.isFinite(value)) return value;
		
		double mid = (long)((value + 1) * 0.5) * 2.0 - 1.0 + (value == 0.0 ? 1 : Math.signum(value));
		return (float)(mid + (value >= mid ? 1 : -1)); 
	}
	
	public static double roundOddZero(double value)
	{
		if(value == 0.0 || !Double.isFinite(value)) return value;
		
		double mid = (long)((value + 1) * 0.5) * 2.0 - 1.0 + Math.signum(value);
		return (mid + (value >= mid ? 1 : -1)); 
	}
	
	public static float roundOddZero(float value)
	{
		if(value == 0.0f || !Float.isFinite(value)) return value;
		
		double mid = (long)((value + 1) * 0.5) * 2.0 - 1.0 + Math.signum(value);
		return (float)(mid + (value >= mid ? 1 : -1)); 
	}
	
	public static double ceilMultiple(double value, double x)
	{
		if(value == 0.0) return 0;
		
		return (Math.ceil(value / x) * x);
	}
	
	public static float ceilMultiple(float value, float x)
	{
		if(value == 0.0f) return 0.0f;
		
		return (float)(Math.ceil(value / x) * x);
	}
	
	public static long ceilMultiple(long value, long x)
	{
		if(value == 0l) return 0l;
		
		return (long)(Math.ceil(value / x) * x);
	}
	
	public static int ceilMultiple(int value, int x)
	{
		if(value == 0.0f) return 0;
		
		return (int)(Math.ceil(value / x) * x);
	}
	
	public static double floorMultiple(double value, double x)
	{
		if(value == 0.0) return 0.0;
		
		return (Math.floor(value / x) * x);
	}
	
	public static float floorMultiple(float value, float x)
	{
		if(value == 0.0f) return 0.0f;
		
		return (float)(Math.floor(value / x) * x);
	}
	
	public static long floorMultiple(long value, long x)
	{
		if(value == 0l) return 0l;
		
		return (long)(Math.floor(value / x) * x);
	}
	
	public static int floorMultiple(int value, int x)
	{
		if(value == 0) return 0;
		
		return (int)(Math.floor(value / x) * x);
	}
	
	public static double roundMultiple(double value, double x)
	{
		if(value == 0.0) return 0.0;
		
		return (Math.round(value / x) * x);
	}
	
	public static float roundMultiple(float value, float x)
	{
		if(value == 0.0f) return 0.0f;
		
		return (float)(Math.round(value / x) * x);
	}
	
	public static long roundMultiple(long value, long x)
	{
		if(value == 0l) return 0l;
		
		return (long)(Math.round(value / x) * x);
	}
	
	public static int roundMultiple(int value, int x)
	{
		if(value == 0) return 0;
		
		return (int)(Math.round(value / x) * x);
	}
	
	public static double sanitizeEM(double tolerance, double value)
	{
		if(!Double.isFinite(value)) return value;
		
		return Math.abs(value) <= tolerance ? Math.copySign(0.0, value) : value;
	}
	
	public static float sanitizeEM(float tolerance, float value)
	{
		if(!Double.isFinite(value)) return value;
		
		return Math.abs(value) <= tolerance ? Math.copySign(0.0f, value) : value;
	}
	
	public static double sanitizeEM4(double value)
	{
		if(!Double.isFinite(value)) return value;
		
		return Math.abs(value) <= EM4 ? Math.copySign(0.0, value) : value;
	}
	
	public static float sanitizeEM4(float value)
	{
		if(!Double.isFinite(value)) return value;
		
		return Math.abs(value) <= EM4f ? Math.copySign(0.0f, value) : value;
	}
	
	public static double sanitizeEM6(double value)
	{
		if(!Double.isFinite(value)) return value;
		
		return Math.abs(value) <= EM6 ? Math.copySign(0.0, value) : value;
	}
	
	public static float sanitizeEM6(float value)
	{
		if(!Double.isFinite(value)) return value;
		
		return Math.abs(value) <= EM6f ? Math.copySign(0.0f, value) : value;
	}
	
	public static double sanitizeEM8(double value)
	{
		if(!Double.isFinite(value)) return value;
		
		return Math.abs(value) <= EM8 ? Math.copySign(0.0, value) : value;
	}
	
	public static float sanitizeEM8(float value)
	{
		if(!Double.isFinite(value)) return value;
		
		return Math.abs(value) <= EM8f ? Math.copySign(0.0f, value) : value;
	}
	
	public static double sanitizeEM(double tolerance, double value, double pivot)
	{
		if(!Double.isFinite(value)) return value;
		
		return Math.abs(value - pivot) <= tolerance ? Math.copySign(pivot, value) : value;
	}
	
	public static float sanitizeEM(float tolerance, float value, float pivot)
	{
		if(!Double.isFinite(value)) return value;
		
		return Math.abs(value) <= tolerance ? Math.copySign(pivot, value) : value;
	}
	
	public static double sanitizeEM4(double value, double pivot)
	{
		if(!Double.isFinite(value)) return value;
		
		return Math.abs(value - pivot) <= EM4 ? Math.copySign(pivot, value) : value;
	}
	
	public static float sanitizeEM4(float value, float pivot)
	{
		if(!Double.isFinite(value)) return value;
		
		return Math.abs(value) <= EM4f ? Math.copySign(pivot, value) : value;
	}
	
	public static double sanitizeEM6(double value, double pivot)
	{
		if(!Double.isFinite(value)) return value;
		
		return Math.abs(value - pivot) <= EM6 ? Math.copySign(pivot, value) : value;
	}
	
	public static float sanitizeEM6(float value, float pivot)
	{
		if(!Double.isFinite(value)) return value;
		
		return Math.abs(value) <= EM6f ? Math.copySign(pivot, value) : value;
	}
	
	public static double sanitizeEM8(double value, double pivot)
	{
		if(!Double.isFinite(value)) return value;
		
		return Math.abs(value - pivot) <= EM8 ? Math.copySign(pivot, value) : value;
	}
	
	public static float sanitizeEM8(float value, float pivot)
	{
		if(!Double.isFinite(value)) return value;
		
		return Math.abs(value) <= EM8f ? Math.copySign(pivot, value) : value;
	}
}
