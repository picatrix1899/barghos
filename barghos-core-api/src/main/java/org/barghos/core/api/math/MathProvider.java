package org.barghos.core.api.math;

public interface MathProvider
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
	double floor(double value);
	
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
	float floor(float value);
	
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
	double ceil(double value);
	
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
	float ceil(float value);
	
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
	double round(double value);
	
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
	float round(float value);
	
	// MISSING_DOC
	double trunc(double value);
	
	// MISSING_DOC
	float trunc(float value);
	
	// MISSING_DOC
	double sqrt(double value);
	
	// MISSING_DOC
	float sqrt(float value);
	
	// MISSING_DOC
	double invSqrt(double value);
	
	// MISSING_DOC
	float invSqrt(float value);
	
	// MISSING_DOC
	double min(double a, double b);
	
	// MISSING_DOC
	float min(float a, float b);
	
	// MISSING_DOC
	double max(double a, double b);
	
	// MISSING_DOC
	float max(float a, float b);
	
	// MISSING_DOC
	double abs(double value);
	
	// MISSING_DOC
	float abs(float value);
	
	// MISSING_DOC
	boolean isExactlyZero(double value);
	
	// MISSING_DOC
	boolean isExactlyZero(float value);
	
	// MISSING_DOC
	boolean isZero(float value, float tolerance);
	
	// MISSING_DOC
	boolean isZero(double value, double tolerance);
	
	// MISSING_DOC
	double signum(double value);
	
	// MISSING_DOC
	float signum(float value);
	
	// MISSING_DOC
	float lerp(float a, float b, float alpha);
	
	// MISSING_DOC
	double lerp(double a, double b, double alpha);
	
	// MISSING_DOC
	double sin(double angle);
	
	// MISSING_DOC
	float sin(float angle);
	
	// MISSING_DOC
	double cos(double angle);
	
	// MISSING_DOC
	float cos(float angle);
	
	// MISSING_DOC
	double fma(double a, double b, double c);
	
	// MISSING_DOC
	float fma(float a, float b, float c);
	
	double acos(double value);
	float acos(float value);
	
	double atan2(double y, double x);
	float atan2(float y, float x);
}
