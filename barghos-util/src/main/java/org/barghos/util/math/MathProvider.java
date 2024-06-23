package org.barghos.util.math;

import java.math.BigDecimal;
import java.math.BigInteger;

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
	
	BigDecimal abs(BigDecimal value);
	
	BigInteger abs(BigInteger value);
	
	double abs(double value);

	float abs(float value);

	float abs(long value);
	
	float abs(int value);
	
	float abs(short value);
	
	float abs(byte value);
	
	boolean isZero(BigDecimal value);
	
	boolean isZero(BigInteger value);
	
	boolean isZero(double value);

	boolean isZero(float value);

	boolean isZero(long value);
	
	boolean isZero(int value);
	
	boolean isZero(short value);
	
	boolean isZero(byte value);
	
	boolean isZero(BigDecimal tolerance, BigDecimal value);
	
	boolean isZero(BigInteger tolerance, BigInteger value);
	
	boolean isZero(float tolerance, float value);

	boolean isZero(double tolerance, double value);

	boolean isZero(long tolerance, long value);
	
	boolean isZero(int tolerance, int value);
	
	boolean isZero(short tolerance, short value);
	
	boolean isZero(byte tolerance, byte value);
	
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
	
	int compare(BigDecimal a, BigDecimal b);
	
	int compare(BigInteger a, BigInteger b);
	
	int compare(double a, double b);

	int compare(float a, float b);
	
	int compare(long a, long b);
	
	int compare(int a, int b);
	
	int compare(short a, short b);
	
	int compare(byte a, byte b);
	
	int compare(BigDecimal tolerance, BigDecimal a, BigDecimal b);
	
	int compare(BigInteger tolerance, BigInteger a, BigInteger b);
	
	int compare(double tolerance, double a, double b);

	int compare(float tolerance, float a, float b);
	
	int compare(long tolerance, long a, long b);
	
	int compare(int tolerance, int a, int b);
	
	int compare(short tolerance, short a, short b);
	
	int compare(byte tolerance, byte a, byte b);
	
	boolean equals(BigDecimal a, BigDecimal b);
	
	boolean equals(BigInteger a, BigInteger b);
	
	boolean equals(double a, double b);
	
	boolean equals(float a, float b);
	
	boolean equals(long a, long b);
	
	boolean equals(int a, int b);
	
	boolean equals(short a, short b);
	
	boolean equals(byte a, byte b);

	boolean equals(BigDecimal tolerance, BigDecimal a, BigDecimal b);
	
	boolean equals(BigInteger tolerance, BigInteger a, BigInteger b);
	
	boolean equals(double tolerance, double a, double b);
	
	boolean equals(float tolerance, float a, float b);
	
	boolean equals(long tolerance, long a, long b);
	
	boolean equals(int tolerance, int a, int b);
	
	boolean equals(short tolerance, short a, short b);
	
	boolean equals(byte tolerance, byte a, byte b);	
}
