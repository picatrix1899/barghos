package org.barghos.util.math;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.barghos.util.BarghosUtilConfiguration;

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
	 * This is a precalculated square-root of the number 2 (sqrt(3));
	 */
	public static final double SQRT3 = 1.7320508075688772;
	
	/**
	 * This is a precalculated square-root of the number 2 (sqrt(3));
	 */
	public static final float SQRT3f = 1.7320508075688772f;
	
	/**
	 * A very small number used for determining if a floating point number is technically zero.
	 */
	public static final double SMALL_NUMBER_E8 = 1.e-8;

	/**
	 * A very small number used for determining if a floating point number is technically zero.
	 */
	public static final float SMALL_NUMBER_E8f = 1.e-8f;
	
	/**
	 * A very small number used for determining if a floating point number is technically zero.
	 */
	public static final double SMALL_NUMBER_E6 = 1.e-6;

	/**
	 * A very small number used for determining if a floating point number is technically zero.
	 */
	public static final float SMALL_NUMBER_E6f = 1.e-6f;
	
	/**
	 * A very small number used for determining if two floating point numbers
	 * are close enough together to count as equal.
	 */
	public static final double SMALL_NUMBER_E4 = 1.e-4;
	
	/**
	 * A very small number used for determining if two floating point numbers
	 * are close enough together to count as equal.
	 */
	public static final float SMALL_NUMBER_E4f = 1.e-4f;
	
	public static final MathProvider MATH_PROVIDER;
	
	static
	{
		MATH_PROVIDER = BarghosUtilConfiguration.mathProvider();
	}
	
	public static float fma(float a, float b, float c)
	{
		return MATH_PROVIDER.fma(a, b, c);
	}
	
	public static double fma(double a, double b, double c)
	{
		return MATH_PROVIDER.fma(a, b, c);
	}
	
	public static float fma_f(float a, float b, float c)
	{
		return MATH_PROVIDER.fma(a, b, c);
	}
	
	public static double fma_d(double a, double b, double c)
	{
		return MATH_PROVIDER.fma(a, b, c);
	}
	
	/**
	 * Returns the largest (closest to positive infinity)
	 * {@code double} value that is less than or equal to the
	 * argument and is equal to a mathematical integer. Special cases:
	 * <ul><li>If the argument value is already equal to a
	 * mathematical integer, then the result is the same as the
	 * argument.  <li>If the argument is NaN or an infinity or
	 * positive zero or negative zero, then the result is the same as
	 * the argument.</ul>
	 *
	 * @param value A value.
	 * 
	 * @return The largest (closest to positive infinity) floating-point value that less than or
	 * equal to the argument and is equal to a mathematical integer.
	 */
	public static double floor(double value)
	{
		return MATH_PROVIDER.floor(value);
	}
	
	/**
	 * Returns the largest (closest to positive infinity)
	 * {@code double} value that is less than or equal to the
	 * argument and is equal to a mathematical integer. Special cases:
	 * <ul><li>If the argument value is already equal to a
	 * mathematical integer, then the result is the same as the
	 * argument.  <li>If the argument is NaN or an infinity or
	 * positive zero or negative zero, then the result is the same as
	 * the argument.</ul>
	 *
	 * @param value A value.
	 * 
	 * @return The largest (closest to positive infinity) floating-point value that less than or
	 * equal to the argument and is equal to a mathematical integer.
	 */
	public static float floor(float value)
	{
		return MATH_PROVIDER.floor(value);
	}
	
	/**
	 * Returns the smallest (closest to negative infinity)
	 * {@code double} value that is greater than or equal to the
	 * argument and is equal to a mathematical integer. Special cases:
	 * <ul><li>If the argument value is already equal to a
	 * mathematical integer, then the result is the same as the
	 * argument.  <li>If the argument is NaN or an infinity or
	 * positive zero or negative zero, then the result is the same as
	 * the argument.  <li>If the argument value is less than zero but
	 * greater than -1.0, then the result is negative zero.</ul> Note
	 * that the value of {@code Math.ceil(x)} is exactly the
	 * value of {@code -Math.floor(-x)}.
	 *
	 *
	 * @param value A value.
	 * 
	 * @return The smallest (closest to negative infinity) floating-point value that is greater than or
	 * equal to the argument and is equal to a mathematical integer.
	 */
	public static double ceil(double value)
	{
		return MATH_PROVIDER.ceil(value);
	}
	
	/**
	 * Returns the smallest (closest to negative infinity)
	 * {@code double} value that is greater than or equal to the
	 * argument and is equal to a mathematical integer. Special cases:
	 * <ul><li>If the argument value is already equal to a
	 * mathematical integer, then the result is the same as the
	 * argument.  <li>If the argument is NaN or an infinity or
	 * positive zero or negative zero, then the result is the same as
	 * the argument.  <li>If the argument value is less than zero but
	 * greater than -1.0, then the result is negative zero.</ul> Note
	 * that the value of {@code Math.ceil(x)} is exactly the
	 * value of {@code -Math.floor(-x)}.
	 *
	 *
	 * @param value A value.
	 * 
	 * @return The smallest (closest to negative infinity) floating-point value that is greater than or
	 * equal to the argument and is equal to a mathematical integer.
	 */
	public static float ceil(float value)
	{
		return MATH_PROVIDER.ceil(value);
	}
	
	 /**
	 * Returns the closest {@code long} to the argument, with ties
	 * rounding to positive infinity.
	 *
	 * <p>Special cases:
	 * <ul><li>If the argument is NaN, the result is 0.
	 * <li>If the argument is negative infinity or any value less than or
	 * equal to the value of {@code Long.MIN_VALUE}, the result is
	 * equal to the value of {@code Long.MIN_VALUE}.
	 * <li>If the argument is positive infinity or any value greater than or
	 * equal to the value of {@code Long.MAX_VALUE}, the result is
	 * equal to the value of {@code Long.MAX_VALUE}.</ul>
	 *
	 * @param value A floating-point value to be rounded to a {@code long}.
	 * @return The value of the argument rounded to the nearest {@code long} value.
	 * @see java.lang.Long#MAX_VALUE
	 * @see java.lang.Long#MIN_VALUE
	 */
	public static double round(double value)
	{
		return MATH_PROVIDER.round(value);
	}
	
	/**
	 * Returns the closest {@code long} to the argument, with ties
	 * rounding to positive infinity.
	 *
	 * <p>Special cases:
	 * <ul><li>If the argument is NaN, the result is 0.
	 * <li>If the argument is negative infinity or any value less than or
	 * equal to the value of {@code Long.MIN_VALUE}, the result is
	 * equal to the value of {@code Long.MIN_VALUE}.
	 * <li>If the argument is positive infinity or any value greater than or
	 * equal to the value of {@code Long.MAX_VALUE}, the result is
	 * equal to the value of {@code Long.MAX_VALUE}.</ul>
	 *
	 * @param value A floating-point value to be rounded to a {@code long}.
	 * @return The value of the argument rounded to the nearest {@code long} value.
	 * @see java.lang.Long#MAX_VALUE
	 * @see java.lang.Long#MIN_VALUE
	 */
	public static float round(float value)
	{
		return MATH_PROVIDER.round(value);
	}
	
	// MISSING_DOC
	public static double trunc(double value)
	{
		return (long)value;
	}
	
	// MISSING_DOC
	public static float trunc(float value)
	{
		return (int)value;
	}
	
	// MISSING_DOC
	public static double sqrt(double value)
	{
		return MATH_PROVIDER.sqrt(value);
	}
	
	// MISSING_DOC
	public static float sqrt(float value)
	{
		return MATH_PROVIDER.sqrt(value);
	}
	
	// MISSING_DOC
	public static double invSqrt(double value)
	{
		return MATH_PROVIDER.invSqrt(value);
	}
	
	// MISSING_DOC
	public static float invSqrt(float value)
	{
		return MATH_PROVIDER.invSqrt(value);
	}
	
	public static BigDecimal abs(BigDecimal value)
	{
		return MATH_PROVIDER.abs(value);
	}
	
	public static BigInteger abs(BigInteger value)
	{
		return MATH_PROVIDER.abs(value);
	}
	
	public static double abs(double value)
	{
		return MATH_PROVIDER.abs(value);
	}

	public static float abs(float value)
	{
		return MATH_PROVIDER.abs(value);
	}

	public static float abs(long value)
	{
		return MATH_PROVIDER.abs(value);
	}
	
	public static float abs(int value)
	{
		return MATH_PROVIDER.abs(value);
	}
	
	public static float abs(short value)
	{
		return MATH_PROVIDER.abs(value);
	}
	
	public static float abs(byte value)
	{
		return MATH_PROVIDER.abs(value);
	}
	
	public static boolean isZero(BigDecimal value)
	{
		return MATH_PROVIDER.isZero(value);
	}
	
	public static boolean isZero(BigInteger value)
	{
		return MATH_PROVIDER.isZero(value);
	}
	
	public static boolean isZero(double value)
	{
		return MATH_PROVIDER.isZero(value);
	}

	public static boolean isZero(float value)
	{
		return MATH_PROVIDER.isZero(value);
	}

	public static boolean isZero(long value)
	{
		return MATH_PROVIDER.isZero(value);
	} 
	
	public static boolean isZero(int value)
	{
		return MATH_PROVIDER.isZero(value);
	} 
	
	public static boolean isZero(short value)
	{
		return MATH_PROVIDER.isZero(value);
	} 
	
	public static boolean isZero(byte value)
	{
		return MATH_PROVIDER.isZero(value);
	} 
	
	public static boolean isZero(BigDecimal tolerance, BigDecimal value)
	{
		return MATH_PROVIDER.isZero(tolerance, value);
	}
	
	public static boolean isZero(BigInteger tolerance, BigInteger value)
	{
		return MATH_PROVIDER.isZero(tolerance, value);
	}
	
	public static boolean isZero(float tolerance, float value)
	{
		return MATH_PROVIDER.isZero(tolerance, value);
	}

	public static boolean isZero(double tolerance, double value)
	{
		return MATH_PROVIDER.isZero(tolerance, value);
	}

	public static boolean isZero(long tolerance, long value)
	{
		return MATH_PROVIDER.isZero(tolerance, value);
	}
	
	public static boolean isZero(int tolerance, int value)
	{
		return MATH_PROVIDER.isZero(tolerance, value);
	}
	
	public static boolean isZero(short tolerance, short value)
	{
		return MATH_PROVIDER.isZero(tolerance, value);
	}
	
	public static boolean isZero(byte tolerance, byte value)
	{
		return MATH_PROVIDER.isZero(tolerance, value);
	}
	
	// MISSING_DOC
	public static double signum(double value)
	{
		return MATH_PROVIDER.signum(value);
	}
	
	// MISSING_DOC
	public static float signum(float value)
	{
		return MATH_PROVIDER.signum(value);
	}
	
	// MISSING_DOC
	public static float lerp(float a, float b, float alpha)
	{
		return (1.0f - alpha) * a + alpha * b;
	}
	
	public static double lerp(double a, double b, double alpha)
	{
		return (1.0 - alpha) * a + alpha * b;
	}
	
	public static float quadricBezier(float a, float b, float c, float alpha)
	{
		return (1.0f - alpha) * lerp(a, b, alpha) + alpha * lerp(b, c, alpha);
	}
	
	public static double quadricBezier(double a, double b, double c, double alpha)
	{
		return (1.0 - alpha) * lerp(a, b, alpha) + alpha * lerp(b, c, alpha);
	}
	
	public static float cubicBezier(float a, float b, float c, float d, float alpha)
	{
		return (1.0f - alpha) * quadricBezier(a, b, c, alpha) + alpha * quadricBezier(b, c, d, alpha);
	}
	
	public static double cubicBezier(double a, double b, double c, double d, double alpha)
	{
		return (1.0 - alpha) * quadricBezier(a, b, c, alpha) + alpha * quadricBezier(b, c, d, alpha);
	}
	
	public static float bicubicBezier(float a, float b, float c, float d, float e, float alpha)
	{
		return (1.0f - alpha) * cubicBezier(a, b, c, d, alpha) + alpha * cubicBezier(b, c, d, e, alpha);
	}
	
	public static double bicubicBezier(double a, double b, double c, double d, double e, double alpha)
	{
		return (1.0 - alpha) * cubicBezier(a, b, c, d, alpha) + alpha * cubicBezier(b, c, d, e, alpha);
	}
	
	public static float acos(float value)
	{
		return MATH_PROVIDER.acos(value);
	}
	
	public static double acos(double value)
	{
		return MATH_PROVIDER.acos(value);
	}
	
	public static float atan2(float y, float x)
	{
		return MATH_PROVIDER.atan2(y, x);
	}
	
	public static double atan2(double y, double x)
	{
		return MATH_PROVIDER.atan2(y, x);
	}
	
	public static float sin(float angle)
	{
		return MATH_PROVIDER.sin(angle);
	}
	
	public static double sin(double angle)
	{
		return MATH_PROVIDER.sin(angle);
	}
	
	public static float cos(float angle)
	{
		return MATH_PROVIDER.cos(angle);
	}
	
	public static double cos(double angle)
	{
		return MATH_PROVIDER.cos(angle);
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
			value = Math.min(value, values[i]);
		
		return value;
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
			value = Math.min(value, values[i]);
		
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
			value = Math.max(value, values[i]);
		
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
			value = Math.max(value, values[i]);
		
		return value;
	}
	
	public static int compare(BigDecimal a, BigDecimal b)
	{
		return MATH_PROVIDER.compare(a, b);
	}
	
	public static int compare(BigInteger a, BigInteger b)
	{
		return MATH_PROVIDER.compare(a, b);
	}
	
	public static int compare(double a, double b)
	{
		return MATH_PROVIDER.compare(a, b);
	}

	public static int compare(float a, float b)
	{
		return MATH_PROVIDER.compare(a, b);
	}
	
	public static int compare(long a, long b)
	{
		return MATH_PROVIDER.compare(a, b);
	}
	
	public static int compare(int a, int b)
	{
		return MATH_PROVIDER.compare(a, b);
	}
	
	public static int compare(short a, short b)
	{
		return MATH_PROVIDER.compare(a, b);
	}
	
	public static int compare(byte a, byte b)
	{
		return MATH_PROVIDER.compare(a, b);
	}
	
	public static int compare(BigDecimal tolerance, BigDecimal a, BigDecimal b)
	{
		return MATH_PROVIDER.compare(tolerance, a, b);
	}
	
	public static int compare(BigInteger tolerance, BigInteger a, BigInteger b)
	{
		return MATH_PROVIDER.compare(tolerance, a, b);
	}
	
	public static int compare(double tolerance, double a, double b)
	{
		return MATH_PROVIDER.compare(tolerance, a, b);
	}

	public static int compare(float tolerance, float a, float b)
	{
		return MATH_PROVIDER.compare(tolerance, a, b);
	}
	
	public static int compare(long tolerance, long a, long b)
	{
		return MATH_PROVIDER.compare(tolerance, a, b);
	}
	
	public static int compare(int tolerance, int a, int b)
	{
		return MATH_PROVIDER.compare(tolerance, a, b);
	}
	
	public static int compare(short tolerance, short a, short b)
	{
		return MATH_PROVIDER.compare(tolerance, a, b);
	}
	
	public static int compare(byte tolerance, byte a, byte b)
	{
		return MATH_PROVIDER.compare(tolerance, a, b);
	}
	
	public static boolean equals(BigDecimal a, BigDecimal b)
	{
		return MATH_PROVIDER.equals(a, b);
	}
	
	public static boolean equals(BigInteger a, BigInteger b)
	{
		return MATH_PROVIDER.equals(a, b);
	}
	
	public static boolean equals(double a, double b)
	{
		return MATH_PROVIDER.equals(a, b);
	}
	
	public static boolean equals(float a, float b)
	{
		return MATH_PROVIDER.equals(a, b);
	}
	
	public static boolean equals(long a, long b)
	{
		return MATH_PROVIDER.equals(a, b);
	}
	
	public static boolean equals(int a, int b)
	{
		return MATH_PROVIDER.equals(a, b);
	}
	
	public static boolean equals(short a, short b)
	{
		return MATH_PROVIDER.equals(a, b);
	}
	
	public static boolean equals(byte a, byte b)
	{
		return MATH_PROVIDER.equals(a, b);
	}
	
	public static boolean equals(BigDecimal tolerance, BigDecimal a, BigDecimal b)
	{
		return MATH_PROVIDER.equals(tolerance, a, b);
	}
	
	public static boolean equals(BigInteger tolerance, BigInteger a, BigInteger b)
	{
		return MATH_PROVIDER.equals(tolerance, a, b);
	}
	
	public static boolean equals(double tolerance, double a, double b)
	{
		return MATH_PROVIDER.equals(tolerance, a, b);
	}
	
	public static boolean equals(float tolerance, float a, float b)
	{
		return MATH_PROVIDER.equals(tolerance, a, b);
	}
	
	public static boolean equals(long tolerance, long a, long b)
	{
		return MATH_PROVIDER.equals(tolerance, a, b);
	}
	
	public static boolean equals(int tolerance, int a, int b)
	{
		return MATH_PROVIDER.equals(tolerance, a, b);
	}
	
	public static boolean equals(short tolerance, short a, short b)
	{
		return MATH_PROVIDER.equals(tolerance, a, b);
	}
	
	public static boolean equals(byte tolerance, byte a, byte b)
	{
		return MATH_PROVIDER.equals(tolerance, a, b);
	}
}
