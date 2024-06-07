package org.barghos.validation;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

import org.barghos.validation.exception.argument.ArgumentNullException;
import org.barghos.validation.exception.argument.ArgumentSizeTooSmallException;
import org.barghos.validation.exception.argument.ArgumentValueOutOfRangeException;
import org.barghos.validation.exception.argument.ArgumentValueTooBigException;
import org.barghos.validation.exception.argument.ArgumentValueTooSmallException;
import org.barghos.validation.exception.argument.InvalidArgumentException;
import org.barghos.validation.exception.argument.UnexpectedArgumentSizeException;

public class ParameterValidation
{
private static final boolean parameterValidation;
	
	static
	{
		parameterValidation = BarghosValidationConfiguration.parameterValidation();
	}
	
	/**
	 * Returns if validation of arguments is enabled.
	 * 
	 * @return True, if validation of arguments is enabled. 
	 */
	public static boolean parameterValidation()
	{
		return parameterValidation;
	}
	
	/**
	 * Validates that the passed value is not null. If it is null an
	 * {@link ArgumentNullException} for the passed argument is thrown.
	 * The validation only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * 
	 * @throws ArgumentNullException If the value is null.
	 */
	public static void pvNotNull(String argument, Object v)
	{
		if(!parameterValidation) return;
		
		notNull(argument, v);
	}
	
	/**
	 * Validates that the passed value is within the range of passed min value
	 * to passed max value with the min and max value being part of the range.
	 * If the value is outside of the range an
	 * {@link ArgumentValueOutOfRangeException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value for the range.
	 * @param max The inclusive maximum value for the range.
	 * 
	 * @throws ArgumentValueOutOfRangeException If the value is outside of the
	 * range.
	 */
	public static void pvInRange(String argument, byte v, byte min, byte max)
	{
		if(!parameterValidation) return;
		
		inRange(argument, v, min, max);
	}
	
	/**
	 * Validates that the passed value is within the range of passed min value
	 * to passed max value with the min and max value being part of the range.
	 * If the value is outside of the range an
	 * {@link ArgumentValueOutOfRangeException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value for the range.
	 * @param max The inclusive maximum value for the range.
	 * 
	 * @throws ArgumentValueOutOfRangeException If the value is outside of the
	 * range.
	 */
	public static void pvInRange(String argument, short v, short min, short max)
	{
		if(!parameterValidation) return;
		
		inRange(argument, v, min, max);
	}
	
	/**
	 * Validates that the passed value is within the range of passed min value
	 * to passed max value with the min and max value being part of the range.
	 * If the value is outside of the range an
	 * {@link ArgumentValueOutOfRangeException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value for the range.
	 * @param max The inclusive maximum value for the range.
	 * 
	 * @throws ArgumentValueOutOfRangeException If the value is outside of the
	 * range.
	 */
	public static void pvInRange(String argument, int v, int min, int max)
	{
		if(!parameterValidation) return;
		
		inRange(argument, v, min, max);
	}
	
	/**
	 * Validates that the passed value is within the range of passed min value
	 * to passed max value with the min and max value being part of the range.
	 * If the value is outside of the range an
	 * {@link ArgumentValueOutOfRangeException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value for the range.
	 * @param max The inclusive maximum value for the range.
	 * 
	 * @throws ArgumentValueOutOfRangeException If the value is outside of the
	 * range.
	 */
	public static void pvInRange(String argument, long v, long min, long max)
	{
		if(!parameterValidation) return;
		
		inRange(argument, v, min, max);
	}
	
	/**
	 * Validates that the passed value is within the range of passed min value
	 * to passed max value with the min and max value being part of the range.
	 * If the value is outside of the range an
	 * {@link ArgumentValueOutOfRangeException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value for the range.
	 * @param max The inclusive maximum value for the range.
	 * 
	 * @throws ArgumentValueOutOfRangeException If the value is outside of the
	 * range.
	 */
	public static void pvInRange(String argument, float v, float min, float max)
	{
		if(!parameterValidation) return;
		
		inRange(argument, v, min, max);
	}
	
	/**
	 * Validates that the passed value is within the range of passed min value
	 * to passed max value with the min and max value being part of the range.
	 * If the value is outside of the range an
	 * {@link ArgumentValueOutOfRangeException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value for the range.
	 * @param max The inclusive maximum value for the range.
	 * 
	 * @throws ArgumentValueOutOfRangeException If the value is outside of the
	 * range.
	 */
	public static void pvInRange(String argument, double v, double min, double max)
	{
		if(!parameterValidation) return;
		
		inRange(argument, v, min, max);
	}
	
	/**
	 * Validates that the passed value is within the range of passed min value
	 * to passed max value with the min and max value being part of the range.
	 * If the value is outside of the range an
	 * {@link ArgumentValueOutOfRangeException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value for the range.
	 * @param max The inclusive maximum value for the range.
	 * 
	 * @throws ArgumentValueOutOfRangeException If the value is outside of the
	 * range.
	 */
	public static void pvInRange(String argument, BigDecimal v, BigDecimal min, BigDecimal max)
	{
		if(!parameterValidation) return;
		
		inRange(argument, v, min, max);
	}
	
	/**
	 * Validates that the passed value is within the range of passed min value
	 * to passed max value with the min and max value being part of the range.
	 * If the value is outside of the range an
	 * {@link ArgumentValueOutOfRangeException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value for the range.
	 * @param max The inclusive maximum value for the range.
	 * 
	 * @throws ArgumentValueOutOfRangeException If the value is outside of the
	 * range.
	 */
	public static void pvInRange(String argument, BigInteger v, BigInteger min, BigInteger max)
	{
		if(!parameterValidation) return;
		
		inRange(argument, v, min, max);
	}
	
	/**
	 * Validates that the passed value is at least the passed min value. If the
	 * value is below the min value an {@link ArgumentValueTooSmallException}
	 * for the passed argument is thrown. The validation only occurs if argument
	 * validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is below minimum.
	 */
	public static void pvMin(String argument, byte v, byte min)
	{
		if(!parameterValidation) return;
		
		min(argument, v, min);
	}
	
	/**
	 * Validates that the passed value is at least the passed min value. If the
	 * value is below the min value an {@link ArgumentValueTooSmallException}
	 * for the passed argument is thrown. The validation only occurs if argument
	 * validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is below minimum.
	 */
	public static void pvMin(String argument, short v, short min)
	{
		if(!parameterValidation) return;
		
		min(argument, v, min);
	}
	
	/**
	 * Validates that the passed value is at least the passed min value. If the
	 * value is below the min value an {@link ArgumentValueTooSmallException}
	 * for the passed argument is thrown. The validation only occurs if argument
	 * validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is below minimum.
	 */
	public static void pvMin(String argument, int v, int min)
	{
		if(!parameterValidation) return;
		
		min(argument, v, min);
	}
	
	/**
	 * Validates that the passed value is at least the passed min value. If the
	 * value is below the min value an {@link ArgumentValueTooSmallException}
	 * for the passed argument is thrown. The validation only occurs if argument
	 * validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is below minimum.
	 */
	public static void pvMin(String argument, long v, long min)
	{
		if(!parameterValidation) return;
		
		min(argument, v, min);
	}
	
	/**
	 * Validates that the passed value is at least the passed min value. If the
	 * value is below the min value an {@link ArgumentValueTooSmallException}
	 * for the passed argument is thrown. The validation only occurs if argument
	 * validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is below minimum.
	 */
	public static void pvMin(String argument, float v, float min)
	{
		if(!parameterValidation) return;
		
		min(argument, v, min);
	}
	
	/**
	 * Validates that the passed value is at least the passed min value. If the
	 * value is below the min value an {@link ArgumentValueTooSmallException}
	 * for the passed argument is thrown. The validation only occurs if argument
	 * validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is below minimum.
	 */
	public static void pvMin(String argument, double v, double min)
	{
		if(!parameterValidation) return;
		
		min(argument, v, min);
	}
	
	/**
	 * Validates that the passed value is at least the passed min value. If the
	 * value is below the min value an {@link ArgumentValueTooSmallException}
	 * for the passed argument is thrown. The validation only occurs if argument
	 * validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is below minimum.
	 */
	public static void pvMin(String argument, BigDecimal v, BigDecimal min)
	{
		if(!parameterValidation) return;
		
		min(argument, v, min);
	}
	
	/**
	 * Validates that the passed value is at least the passed min value. If the
	 * value is below the min value an {@link ArgumentValueTooSmallException}
	 * for the passed argument is thrown. The validation only occurs if argument
	 * validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is below minimum.
	 */
	public static void pvMin(String argument, BigInteger v, BigInteger min)
	{
		if(!parameterValidation) return;
		
		min(argument, v, min);
	}
	
	/**
	 * Validates that the passed value is at most the passed max value. If the
	 * value is above the max value an {@link ArgumentValueTooBigException} for
	 * the passed argument is thrown. The validation only occurs if argument
	 * validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param max The inclusive maximum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is above maximum.
	 */
	public static void pvMax(String argument, byte v, byte max)
	{
		if(!parameterValidation) return;
		
		max(argument, v, max);
	}
	
	/**
	 * Validates that the passed value is at most the passed max value. If the
	 * value is above the max value an {@link ArgumentValueTooBigException} for
	 * the passed argument is thrown. The validation only occurs if argument
	 * validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param max The inclusive maximum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is above maximum.
	 */
	public static void pvMax(String argument, short v, short max)
	{
		if(!parameterValidation) return;
		
		max(argument, v, max);
	}
	
	/**
	 * Validates that the passed value is at most the passed max value. If the
	 * value is above the max value an {@link ArgumentValueTooBigException} for
	 * the passed argument is thrown. The validation only occurs if argument
	 * validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param max The inclusive maximum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is above maximum.
	 */
	public static void pvMax(String argument, int v, int max)
	{
		if(!parameterValidation) return;
		
		max(argument, v, max);
	}
	
	/**
	 * Validates that the passed value is at most the passed max value. If the
	 * value is above the max value an {@link ArgumentValueTooBigException} for
	 * the passed argument is thrown. The validation only occurs if argument
	 * validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param max The inclusive maximum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is above maximum.
	 */
	public static void pvMax(String argument, long v, long max)
	{
		if(!parameterValidation) return;
		
		max(argument, v, max);
	}
	
	/**
	 * Validates that the passed value is at most the passed max value. If the
	 * value is above the max value an {@link ArgumentValueTooBigException} for
	 * the passed argument is thrown. The validation only occurs if argument
	 * validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param max The inclusive maximum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is above maximum.
	 */
	public static void pvMax(String argument, float v, float max)
	{
		if(!parameterValidation) return;
		
		max(argument, v, max);
	}
	
	/**
	 * Validates that the passed value is at most the passed max value. If the
	 * value is above the max value an {@link ArgumentValueTooBigException} for
	 * the passed argument is thrown. The validation only occurs if argument
	 * validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param max The inclusive maximum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is above maximum.
	 */
	public static void pvMax(String argument, double v, double max)
	{
		if(!parameterValidation) return;
		
		max(argument, v, max);
	}
	
	/**
	 * Validates that the passed value is at most the passed max value. If the
	 * value is above the max value an {@link ArgumentValueTooBigException} for
	 * the passed argument is thrown. The validation only occurs if argument
	 * validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param max The inclusive maximum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is above maximum.
	 */
	public static void pvMax(String argument, BigDecimal v, BigDecimal max)
	{
		if(!parameterValidation) return;
		
		max(argument, v, max);
	}
	
	/**
	 * Validates that the passed value is at most the passed max value. If the
	 * value is above the max value an {@link ArgumentValueTooBigException} for
	 * the passed argument is thrown. The validation only occurs if argument
	 * validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param max The inclusive maximum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is above maximum.
	 */
	public static void pvMax(String argument, BigInteger v, BigInteger max)
	{
		if(!parameterValidation) return;
		
		max(argument, v, max);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the
	 * array differs from the expected size an
	 * {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from
	 * the expected size.
	 */
	public static <T> void pvExpectSize(String argument, T[] c, int expectedSize)
	{
		if(!parameterValidation) return;
		
		expectSize(argument, c, expectedSize);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the
	 * array differs from the expected size an
	 * {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from
	 * the expected size.
	 */
	public static void pvExpectSize(String argument, byte[] c, int expectedSize)
	{
		if(!parameterValidation) return;
		
		expectSize(argument, c, expectedSize);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the
	 * array differs from the expected size an
	 * {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from
	 * the expected size.
	 */
	public static void pvExpectSize(String argument, short[] c, int expectedSize)
	{
		if(!parameterValidation) return;
		
		expectSize(argument, c, expectedSize);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the
	 * array differs from the expected size an
	 * {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from
	 * the expected size.
	 */
	public static void pvExpectSize(String argument, int[] c, int expectedSize)
	{
		if(!parameterValidation) return;
		
		expectSize(argument, c, expectedSize);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the
	 * array differs from the expected size an
	 * {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from
	 * the expected size.
	 */
	public static void pvExpectSize(String argument, long[] c, int expectedSize)
	{
		if(!parameterValidation) return;
		
		expectSize(argument, c, expectedSize);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the
	 * array differs from the expected size an
	 * {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from
	 * the expected size.
	 */
	public static void pvExpectSize(String argument, float[] c, int expectedSize)
	{
		if(!parameterValidation) return;
		
		expectSize(argument, c, expectedSize);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the
	 * array differs from the expected size an
	 * {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from
	 * the expected size.
	 */
	public static void pvExpectSize(String argument, double[] c, int expectedSize)
	{
		if(!parameterValidation) return;
		
		expectSize(argument, c, expectedSize);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the
	 * array differs from the expected size an
	 * {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from
	 * the expected size.
	 */
	public static void pvExpectSize(String argument, char[] c, int expectedSize)
	{
		if(!parameterValidation) return;
		
		expectSize(argument, c, expectedSize);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the
	 * array differs from the expected size an
	 * {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from
	 * the expected size.
	 */
	public static void pvExpectSize(String argument, boolean[] c, int expectedSize)
	{
		if(!parameterValidation) return;
		
		expectSize(argument, c, expectedSize);
	}
	
	/**
	 * Validates that the passed collection has the expected size. If the size
	 * of the collection differs from the expected size an
	 * {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The collection that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from
	 * the expected size.
	 */
	public static void pvExpectSize(String argument, Collection<?> c, int expectedSize)
	{
		if(!parameterValidation) return;
		
		expectSize(argument, c, expectedSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the
	 * size of the array is below the minimum size an
	 * {@link ArgumentSizeTooSmallException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum
	 * size.
	 */
	public static <T> void pvMinSize(String argument, T[] v, int minSize)
	{
		if(!parameterValidation) return;
		
		minSize(argument, v, minSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the
	 * size of the array is below the minimum size an
	 * {@link ArgumentSizeTooSmallException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum
	 * size.
	 */
	public static void pvMinSize(String argument, byte[] v, int minSize)
	{
		if(!parameterValidation) return;
		
		minSize(argument, v, minSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the
	 * size of the array is below the minimum size an
	 * {@link ArgumentSizeTooSmallException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum
	 * size.
	 */
	public static void pvMinSize(String argument, short[] v, int minSize)
	{
		if(!parameterValidation) return;
		
		minSize(argument, v, minSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the
	 * size of the array is below the minimum size an
	 * {@link ArgumentSizeTooSmallException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum
	 * size.
	 */
	public static void pvMinSize(String argument, int[] v, int minSize)
	{
		if(!parameterValidation) return;
		
		minSize(argument, v, minSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the
	 * size of the array is below the minimum size an
	 * {@link ArgumentSizeTooSmallException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum
	 * size.
	 */
	public static void pvMinSize(String argument, long[] v, int minSize)
	{
		if(!parameterValidation) return;
		
		minSize(argument, v, minSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the
	 * size of the array is below the minimum size an
	 * {@link ArgumentSizeTooSmallException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum
	 * size.
	 */
	public static void pvMinSize(String argument, float[] v, int minSize)
	{
		if(!parameterValidation) return;
		
		minSize(argument, v, minSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the
	 * size of the array is below the minimum size an
	 * {@link ArgumentSizeTooSmallException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum
	 * size.
	 */
	public static void pvMinSize(String argument, double[] v, int minSize)
	{
		if(!parameterValidation) return;
		
		minSize(argument, v, minSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the
	 * size of the array is below the minimum size an
	 * {@link ArgumentSizeTooSmallException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum
	 * size.
	 */
	public static void pvMinSize(String argument, char[] v, int minSize)
	{
		if(!parameterValidation) return;
		
		minSize(argument, v, minSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the
	 * size of the array is below the minimum size an
	 * {@link ArgumentSizeTooSmallException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum
	 * size.
	 */
	public static void pvMinSize(String argument, boolean[] v, int minSize)
	{
		if(!parameterValidation) return;
		
		minSize(argument, v, minSize);
	}
	
	/**
	 * Validates that the passed collection has at least the minimum size.
	 * If the collection of the collection is below the minimum size an
	 * {@link ArgumentSizeTooSmallException} for the passed argument is thrown.
	 * The validation only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The collection that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum
	 * size.
	 */
	public static void pvMinSize(String argument, Collection<?> c, int minSize)
	{
		if(!parameterValidation) return;
		
		minSize(argument, c, minSize);
	}
	
	/**
	 * Validates that no entry in the passed array is null.
	 * If an entry is null an {@link InvalidArgumentException} for the passed
	 * argument is thrown. The validation only occurs if argument validation is
	 * enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * 
	 * @throws InvalidArgumentException If an entry in the array is null.
	 */
	public static <T> void pvEntriesNotNull(String argument, T[] obj)
	{
		if(!parameterValidation) return;
		
		entriesNotNull(argument, obj);
	}
	
	/**
	 * Validates that no entry in the passed list is null.
	 * If an entry is null an {@link InvalidArgumentException} for the passed
	 * argument is thrown. The validation only occurs if argument validation is
	 * enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The list that will be validated.
	 * 
	 * @throws InvalidArgumentException If an entry in the array is null.
	 */
	public static void pvEntriesNotNull(String argument, List<?> obj)
	{
		if(!parameterValidation) return;
		
		entriesNotNull(argument, obj);
	}
	
	/**
	 * Validates that the passed value is not null. If it is null an
	 * {@link ArgumentNullException} for the passed argument is thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * 
	 * @throws ArgumentNullException If the value is null.
	 */
	public static void notNull(String argument, Object v)
	{
		if(v == null) throw new ArgumentNullException(argument);
	}
	
	/**
	 * Validates that the passed value is within the range of passed min value
	 * to passed max value with the min and max value being part of the range.
	 * If the value is outside of the range an
	 * {@link ArgumentValueOutOfRangeException} for the passed argument is
	 * thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value for the range.
	 * @param max The inclusive maximum value for the range.
	 * 
	 * @throws ArgumentValueOutOfRangeException If the value is outside of the
	 * range.
	 */
	public static void inRange(String argument, byte v, byte min, byte max)
	{
		if(v < min || v > max) throw new ArgumentValueOutOfRangeException(argument, v, min, max);
	}
	
	/**
	 * Validates that the passed value is within the range of passed min value
	 * to passed max value with the min and max value being part of the range.
	 * If the value is outside of the range an
	 * {@link ArgumentValueOutOfRangeException} for the passed argument is
	 * thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value for the range.
	 * @param max The inclusive maximum value for the range.
	 * 
	 * @throws ArgumentValueOutOfRangeException If the value is outside of the
	 * range.
	 */
	public static void inRange(String argument, short v, short min, short max)
	{
		if(v < min || v > max) throw new ArgumentValueOutOfRangeException(argument, v, min, max);
	}
	
	/**
	 * Validates that the passed value is within the range of passed min value
	 * to passed max value with the min and max value being part of the range.
	 * If the value is outside of the range an
	 * {@link ArgumentValueOutOfRangeException} for the passed argument is
	 * thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value for the range.
	 * @param max The inclusive maximum value for the range.
	 * 
	 * @throws ArgumentValueOutOfRangeException If the value is outside of the
	 * range.
	 */
	public static void inRange(String argument, int v, int min, int max)
	{
		if(v < min || v > max) throw new ArgumentValueOutOfRangeException(argument, v, min, max);
	}
	
	/**
	 * Validates that the passed value is within the range of passed min value
	 * to passed max value with the min and max value being part of the range.
	 * If the value is outside of the range an
	 * {@link ArgumentValueOutOfRangeException} for the passed argument is
	 * thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value for the range.
	 * @param max The inclusive maximum value for the range.
	 * 
	 * @throws ArgumentValueOutOfRangeException If the value is outside of the
	 * range.
	 */
	public static void inRange(String argument, long v, long min, long max)
	{
		if(v < min || v > max) throw new ArgumentValueOutOfRangeException(argument, v, min, max);
	}
	
	/**
	 * Validates that the passed value is within the range of passed min value
	 * to passed max value with the min and max value being part of the range.
	 * If the value is outside of the range an
	 * {@link ArgumentValueOutOfRangeException} for the passed argument is
	 * thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value for the range.
	 * @param max The inclusive maximum value for the range.
	 * 
	 * @throws ArgumentValueOutOfRangeException If the value is outside of the
	 * range.
	 */
	public static void inRange(String argument, float v, float min, float max)
	{
		if(v < min || v > max) throw new ArgumentValueOutOfRangeException(argument, v, min, max);
	}
	
	/**
	 * Validates that the passed value is within the range of passed min value
	 * to passed max value with the min and max value being part of the range.
	 * If the value is outside of the range an
	 * {@link ArgumentValueOutOfRangeException} for the passed argument is
	 * thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value for the range.
	 * @param max The inclusive maximum value for the range.
	 * 
	 * @throws ArgumentValueOutOfRangeException If the value is outside of the
	 * range.
	 */
	public static void inRange(String argument, double v, double min, double max)
	{
		if(v < min || v > max) throw new ArgumentValueOutOfRangeException(argument, v, min, max);
	}
	
	/**
	 * Validates that the passed value is within the range of passed min value
	 * to passed max value with the min and max value being part of the range.
	 * If the value is outside of the range an
	 * {@link ArgumentValueOutOfRangeException} for the passed argument is
	 * thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value for the range.
	 * @param max The inclusive maximum value for the range.
	 * 
	 * @throws ArgumentValueOutOfRangeException If the value is outside of the
	 * range.
	 */
	public static void inRange(String argument, BigDecimal v, BigDecimal min, BigDecimal max)
	{
		if(v.compareTo(min) < 0 || v.compareTo(max) > 0) throw new ArgumentValueOutOfRangeException(argument, v, min, max);
	}
	
	/**
	 * Validates that the passed value is within the range of passed min value
	 * to passed max value with the min and max value being part of the range.
	 * If the value is outside of the range an
	 * {@link ArgumentValueOutOfRangeException} for the passed argument is
	 * thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value for the range.
	 * @param max The inclusive maximum value for the range.
	 * 
	 * @throws ArgumentValueOutOfRangeException If the value is outside of the
	 * range.
	 */
	public static void inRange(String argument, BigInteger v, BigInteger min, BigInteger max)
	{
		if(v.compareTo(min) < 0 || v.compareTo(max) > 0) throw new ArgumentValueOutOfRangeException(argument, v, min, max);
	}
	
	/**
	 * Validates that the passed value is at least the passed min value. If the
	 * value is below the min value an {@link ArgumentValueTooSmallException}
	 * for the passed argument is thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is below minimum.
	 */
	public static void min(String argument, byte v, byte min)
	{
		if(v < min) throw new ArgumentValueTooSmallException(argument, v, min);
	}
	
	/**
	 * Validates that the passed value is at least the passed min value. If the
	 * value is below the min value an {@link ArgumentValueTooSmallException}
	 * for the passed argument is thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is below minimum.
	 */
	public static void min(String argument, short v, short min)
	{
		if(v < min) throw new ArgumentValueTooSmallException(argument, v, min);
	}
	
	/**
	 * Validates that the passed value is at least the passed min value. If the
	 * value is below the min value an {@link ArgumentValueTooSmallException}
	 * for the passed argument is thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is below minimum.
	 */
	public static void min(String argument, int v, int min)
	{
		if(v < min) throw new ArgumentValueTooSmallException(argument, v, min);
	}
	
	/**
	 * Validates that the passed value is at least the passed min value. If the
	 * value is below the min value an {@link ArgumentValueTooSmallException}
	 * for the passed argument is thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is below minimum.
	 */
	public static void min(String argument, long v, long min)
	{
		if(v < min) throw new ArgumentValueTooSmallException(argument, v, min);
	}
	
	/**
	 * Validates that the passed value is at least the passed min value. If the
	 * value is below the min value an {@link ArgumentValueTooSmallException}
	 * for the passed argument is thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is below minimum.
	 */
	public static void min(String argument, float v, float min)
	{
		if(v < min) throw new ArgumentValueTooSmallException(argument, v, min);
	}
	
	/**
	 * Validates that the passed value is at least the passed min value. If the
	 * value is below the min value an {@link ArgumentValueTooSmallException}
	 * for the passed argument is thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is below minimum.
	 */
	public static void min(String argument, double v, double min)
	{
		if(v < min) throw new ArgumentValueTooSmallException(argument, v, min);
	}
	
	/**
	 * Validates that the passed value is at least the passed min value. If the
	 * value is below the min value an {@link ArgumentValueTooSmallException}
	 * for the passed argument is thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is below minimum.
	 */
	public static void min(String argument, BigDecimal v, BigDecimal min)
	{
		if(v.compareTo(min) < 0) throw new ArgumentValueTooSmallException(argument, v, min);
	}
	
	/**
	 * Validates that the passed value is at least the passed min value. If the
	 * value is below the min value an {@link ArgumentValueTooSmallException}
	 * for the passed argument is thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is below minimum.
	 */
	public static void min(String argument, BigInteger v, BigInteger min)
	{
		if(v.compareTo(min) < 0) throw new ArgumentValueTooSmallException(argument, v, min);
	}
	
	/**
	 * Validates that the passed value is at most the passed max value. If the
	 * value is above the max value an {@link ArgumentValueTooBigException} for
	 * the passed argument is thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param max The inclusive maximum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is above maximum.
	 */
	public static void max(String argument, byte v, byte max)
	{
		if(v > max) throw new ArgumentValueTooBigException(argument, v, max);
	}
	
	/**
	 * Validates that the passed value is at most the passed max value. If the
	 * value is above the max value an {@link ArgumentValueTooBigException} for
	 * the passed argument is thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param max The inclusive maximum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is above maximum.
	 */
	public static void max(String argument, short v, short max)
	{
		if(v > max) throw new ArgumentValueTooBigException(argument, v, max);
	}
	
	/**
	 * Validates that the passed value is at most the passed max value. If the
	 * value is above the max value an {@link ArgumentValueTooBigException} for
	 * the passed argument is thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param max The inclusive maximum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is above maximum.
	 */
	public static void max(String argument, int v, int max)
	{
		if(v > max) throw new ArgumentValueTooBigException(argument, v, max);
	}
	
	/**
	 * Validates that the passed value is at most the passed max value. If the
	 * value is above the max value an {@link ArgumentValueTooBigException} for
	 * the passed argument is thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param max The inclusive maximum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is above maximum.
	 */
	public static void max(String argument, long v, long max)
	{
		if(v > max) throw new ArgumentValueTooBigException(argument, v, max);
	}
	
	/**
	 * Validates that the passed value is at most the passed max value. If the
	 * value is above the max value an {@link ArgumentValueTooBigException} for
	 * the passed argument is thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param max The inclusive maximum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is above maximum.
	 */
	public static void max(String argument, float v, float max)
	{
		if(v > max) throw new ArgumentValueTooBigException(argument, v, max);
	}
	
	/**
	 * Validates that the passed value is at most the passed max value. If the
	 * value is above the max value an {@link ArgumentValueTooBigException} for
	 * the passed argument is thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param max The inclusive maximum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is above maximum.
	 */
	public static void max(String argument, double v, double max)
	{
		if(v > max) throw new ArgumentValueTooBigException(argument, v, max);
	}
	
	/**
	 * Validates that the passed value is at most the passed max value. If the
	 * value is above the max value an {@link ArgumentValueTooBigException} for
	 * the passed argument is thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param max The inclusive maximum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is above maximum.
	 */
	public static void max(String argument, BigDecimal v, BigDecimal max)
	{
		if(v.compareTo(max) > 0) throw new ArgumentValueTooBigException(argument, v, max);
	}
	
	/**
	 * Validates that the passed value is at most the passed max value. If the
	 * value is above the max value an {@link ArgumentValueTooBigException} for
	 * the passed argument is thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param max The inclusive maximum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is above maximum.
	 */
	public static void max(String argument, BigInteger v, BigInteger max)
	{
		if(v.compareTo(max) > 0) throw new ArgumentValueTooBigException(argument, v, max);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the
	 * array differs from the expected size an
	 * {@link UnexpectedArgumentSizeException} for the passed argument is
	 *  thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from
	 * the expected size.
	 */
	public static <T> void expectSize(String argument, T[] c, int expectedSize)
	{
		if(c.length != expectedSize) throw new UnexpectedArgumentSizeException(argument, c.length, expectedSize);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the
	 * array differs from the expected size an
	 * {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from
	 * the expected size.
	 */
	public static void expectSize(String argument, byte[] c, int expectedSize)
	{
		if(c.length != expectedSize) throw new UnexpectedArgumentSizeException(argument, c.length, expectedSize);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the
	 * array differs from the expected size an
	 * {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from
	 * the expected size.
	 */
	public static void expectSize(String argument, short[] c, int expectedSize)
	{
		if(c.length != expectedSize) throw new UnexpectedArgumentSizeException(argument, c.length, expectedSize);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the
	 * array differs from the expected size an
	 * {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from
	 * the expected size.
	 */
	public static void expectSize(String argument, int[] c, int expectedSize)
	{
		if(c.length != expectedSize) throw new UnexpectedArgumentSizeException(argument, c.length, expectedSize);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the
	 * array differs from the expected size an
	 * {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from
	 * the expected size.
	 */
	public static void expectSize(String argument, long[] c, int expectedSize)
	{
		if(c.length != expectedSize) throw new UnexpectedArgumentSizeException(argument, c.length, expectedSize);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the
	 * array differs from the expected size an
	 * {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from
	 * the expected size.
	 */
	public static void expectSize(String argument, float[] c, int expectedSize)
	{
		if(c.length != expectedSize) throw new UnexpectedArgumentSizeException(argument, c.length, expectedSize);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the
	 * array differs from the expected size an
	 * {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from
	 * the expected size.
	 */
	public static void expectSize(String argument, double[] c, int expectedSize)
	{
		if(c.length != expectedSize) throw new UnexpectedArgumentSizeException(argument, c.length, expectedSize);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the
	 * array differs from the expected size an
	 * {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from
	 * the expected size.
	 */
	public static void expectSize(String argument, char[] c, int expectedSize)
	{
		if(c.length != expectedSize) throw new UnexpectedArgumentSizeException(argument, c.length, expectedSize);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the
	 * array differs from the expected size an
	 * {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from
	 * the expected size.
	 */
	public static void expectSize(String argument, boolean[] c, int expectedSize)
	{
		if(c.length != expectedSize) throw new UnexpectedArgumentSizeException(argument, c.length, expectedSize);
	}
	
	/**
	 * Validates that the passed collection has the expected size. If the size
	 * of the collection differs from the expected size an
	 * {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The collection that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from
	 * the expected size.
	 */
	public static void expectSize(String argument, Collection<?> c, int expectedSize)
	{
		int size = c.size();
		
		if(size != expectedSize) throw new UnexpectedArgumentSizeException(argument, size, expectedSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the
	 * size of the array is below the minimum size an
	 * {@link ArgumentSizeTooSmallException} for the passed argument is thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum
	 * size.
	 */
	public static <T> void minSize(String argument, T[] c, int minSize)
	{
		if(c.length < minSize) throw new ArgumentSizeTooSmallException(argument, c.length, minSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the
	 * size of the array is below the minimum size an
	 * {@link ArgumentSizeTooSmallException} for the passed argument is thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum
	 * size.
	 */
	public static void minSize(String argument, byte[] c, int minSize)
	{
		if(c.length < minSize) throw new ArgumentSizeTooSmallException(argument, c.length, minSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the
	 * size of the array is below the minimum size an
	 * {@link ArgumentSizeTooSmallException} for the passed argument is thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum
	 * size.
	 */
	public static void minSize(String argument, short[] c, int minSize)
	{
		if(c.length < minSize) throw new ArgumentSizeTooSmallException(argument, c.length, minSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the
	 * size of the array is below the minimum size an
	 * {@link ArgumentSizeTooSmallException} for the passed argument is thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum
	 * size.
	 */
	public static void minSize(String argument, int[] c, int minSize)
	{
		if(c.length < minSize) throw new ArgumentSizeTooSmallException(argument, c.length, minSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the
	 * size of the array is below the minimum size an
	 * {@link ArgumentSizeTooSmallException} for the passed argument is thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum
	 * size.
	 */
	public static void minSize(String argument, long[] c, int minSize)
	{
		if(c.length < minSize) throw new ArgumentSizeTooSmallException(argument, c.length, minSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the
	 * size of the array is below the minimum size an
	 * {@link ArgumentSizeTooSmallException} for the passed argument is thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum
	 * size.
	 */
	public static void minSize(String argument, float[] c, int minSize)
	{
		if(c.length < minSize) throw new ArgumentSizeTooSmallException(argument, c.length, minSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the
	 * size of the array is below the minimum size an
	 * {@link ArgumentSizeTooSmallException} for the passed argument is thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum
	 * size.
	 */
	public static void minSize(String argument, double[] c, int minSize)
	{
		if(c.length < minSize) throw new ArgumentSizeTooSmallException(argument, c.length, minSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the
	 * size of the array is below the minimum size an
	 * {@link ArgumentSizeTooSmallException} for the passed argument is thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum
	 * size.
	 */
	public static void minSize(String argument, char[] c, int minSize)
	{
		if(c.length < minSize) throw new ArgumentSizeTooSmallException(argument, c.length, minSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the
	 * size of the array is below the minimum size an
	 * {@link ArgumentSizeTooSmallException} for the passed argument is thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum
	 * size.
	 */
	public static void minSize(String argument, boolean[] c, int minSize)
	{
		if(c.length < minSize) throw new ArgumentSizeTooSmallException(argument, c.length, minSize);
	}
	
	/**
	 * Validates that the passed collection has at least the minimum size.
	 * If the size of the collection is below the minimum size an
	 * {@link ArgumentSizeTooSmallException} for the passed argument is thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The collection that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum
	 * size.
	 */
	public static void minSize(String argument, Collection<?> c, int minSize)
	{
		int size = c.size();
		
		if(size < minSize) throw new ArgumentSizeTooSmallException(argument, size, minSize);
	}
	
	/**
	 * Validates that no entry in the passed array is null.
	 * If an entry is null an {@link InvalidArgumentException} for the passed
	 * argument is thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * 
	 * @throws InvalidArgumentException If an entry in the array is null.
	 */
	public static <T> void entriesNotNull(String argument, T[] c)
	{
		if(c == null) return;
		
		for(int i = 0; i < c.length; i++)
			if(c[i] == null) throw new InvalidArgumentException(argument);
	}
	
	/**
	 * Validates that no entry in the passed list is null.
	 * If an entry is null an {@link InvalidArgumentException} for the passed
	 * argument is thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The list that will be validated.
	 * 
	 * @throws InvalidArgumentException If an entry in the array is null.
	 */
	public static void entriesNotNull(String argument, List<?> c)
	{
		if(c == null) return;
		
		int size = c.size();
		for(int i = 0; i < size; i++)
			if(c.get(i) == null) throw new InvalidArgumentException(argument);
	}
}
