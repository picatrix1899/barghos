package org.barghos.math.api.util;

public class Maths implements MathConstants
{
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
		return Math.floor(value);
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
		return (float)Math.floor(value);
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
		return Math.ceil(value);
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
		return (float)Math.ceil(value);
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
		return Math.round(value);
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
		return Math.round(value);
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
		return Math.sqrt(value);
	}
	
	// MISSING_DOC
	public static float sqrt(float value)
	{
		return (float)Math.sqrt(value);
	}
	
	// MISSING_DOC
	public static double min(double a, double b)
	{
		return Math.min(a, b);
	}
	
	// MISSING_DOC
	public static float min(float a, float b)
	{
		return Math.min(a, b);
	}
	
	// MISSING_DOC
	public static double max(double a, double b)
	{
		return Math.max(a, b);
	}
	
	// MISSING_DOC
	public static float max(float a, float b)
	{
		return Math.max(a, b);
	}
	
	// MISSING_DOC
	public static double abs(double value)
	{
		return Math.abs(value);
	}
	
	// MISSING_DOC
	public static float abs(float value)
	{
		return Math.abs(value);
	}
	
	// MISSING_DOC
	public static boolean isZero(double value)
	{
		return value == 0.0;
	}
	
	// MISSING_DOC
	public static boolean isZero(float value)
	{
		return value == 0.0f;
	}
	
	// MISSING_DOC
	public static boolean isZeroWithMargin(float value, float tolerance)
	{
		return Math.abs(value) <= tolerance;
	}
	
	// MISSING_DOC
	public static boolean isZeroWithMargin(double value, double tolerance)
	{
		return Math.abs(value) <= tolerance;
	}
	
	// MISSING_DOC
	public static double signum(double value)
	{
		return Math.signum(value);
	}
	
	// MISSING_DOC
	public static float signum(float value)
	{
		return Math.signum(value);
	}
	
	// MISSING_DOC
	public static float lerpf(float a, float b, float alpha)
	{
		return (1.0f - alpha) * a + alpha * b;
	}
}
