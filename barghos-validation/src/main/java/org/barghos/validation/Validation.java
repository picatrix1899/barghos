package org.barghos.validation;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;

import org.barghos.validation.exception.argument.ArgumentNullException;
import org.barghos.validation.exception.argument.ArgumentSizeTooSmallException;
import org.barghos.validation.exception.argument.ArgumentValueOutOfRangeException;
import org.barghos.validation.exception.argument.ArgumentValueTooBigException;
import org.barghos.validation.exception.argument.ArgumentValueTooSmallException;
import org.barghos.validation.exception.argument.UnexpectedArgumentSizeException;

public class Validation
{
private static final boolean argumentValidation;
	
	static
	{
		argumentValidation = ValidationConfiguration.argumentValidation();
	}
	
	/**
	 * Returns if validation of arguments is enabled.
	 * 
	 * @return True, if validation of arguments is enabled. 
	 */
	public static boolean argumentValidation()
	{
		return argumentValidation;
	}
	
	/**
	 * Validates that the passed value is not null. If it is null an {@link ArgumentNullException}
	 * for the passed argument is thrown. The validation only occurs if argument validation is
	 * enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * 
	 * @throws ArgumentNullException If the value is null.
	 */
	public static void validateNotNull(String argument, Object v)
	{
		if(!argumentValidation) return;
		
		notNull(argument, v);
	}
	
	/**
	 * Validates that the passed value is within the range of passed min value to passed max value
	 * with the min and max value being part of the range. If the value is outside of the range an
	 * {@link ArgumentValueOutOfRangeException} for the passed argument is thrown. The validation
	 * only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value for the range.
	 * @param max The inclusive maximum value for the range.
	 * 
	 * @throws ArgumentValueOutOfRangeException If the value is outside of the range.
	 */
	public static void validateInRange(String argument, byte v, byte min, byte max)
	{
		if(!argumentValidation) return;
		
		inRange(argument, v, min, max);
	}
	
	/**
	 * Validates that the passed value is within the range of passed min value to passed max value
	 * with the min and max value being part of the range. If the value is outside of the range an
	 * {@link ArgumentValueOutOfRangeException} for the passed argument is thrown. The validation
	 * only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value for the range.
	 * @param max The inclusive maximum value for the range.
	 * 
	 * @throws ArgumentValueOutOfRangeException If the value is outside of the range.
	 */
	public static void validateInRange(String argument, short v, short min, short max)
	{
		if(!argumentValidation) return;
		
		inRange(argument, v, min, max);
	}
	
	/**
	 * Validates that the passed value is within the range of passed min value to passed max value
	 * with the min and max value being part of the range. If the value is outside of the range an
	 * {@link ArgumentValueOutOfRangeException} for the passed argument is thrown. The validation
	 * only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value for the range.
	 * @param max The inclusive maximum value for the range.
	 * 
	 * @throws ArgumentValueOutOfRangeException If the value is outside of the range.
	 */
	public static void validateInRange(String argument, int v, int min, int max)
	{
		if(!argumentValidation) return;
		
		inRange(argument, v, min, max);
	}
	
	/**
	 * Validates that the passed value is within the range of passed min value to passed max value
	 * with the min and max value being part of the range. If the value is outside of the range an
	 * {@link ArgumentValueOutOfRangeException} for the passed argument is thrown. The validation
	 * only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value for the range.
	 * @param max The inclusive maximum value for the range.
	 * 
	 * @throws ArgumentValueOutOfRangeException If the value is outside of the range.
	 */
	public static void validateInRange(String argument, long v, long min, long max)
	{
		if(!argumentValidation) return;
		
		inRange(argument, v, min, max);
	}
	
	/**
	 * Validates that the passed value is within the range of passed min value to passed max value
	 * with the min and max value being part of the range. If the value is outside of the range an
	 * {@link ArgumentValueOutOfRangeException} for the passed argument is thrown. The validation
	 * only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value for the range.
	 * @param max The inclusive maximum value for the range.
	 * 
	 * @throws ArgumentValueOutOfRangeException If the value is outside of the range.
	 */
	public static void validateInRange(String argument, float v, float min, float max)
	{
		if(!argumentValidation) return;
		
		inRange(argument, v, min, max);
	}
	
	/**
	 * Validates that the passed value is within the range of passed min value to passed max value
	 * with the min and max value being part of the range. If the value is outside of the range an
	 * {@link ArgumentValueOutOfRangeException} for the passed argument is thrown. The validation
	 * only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value for the range.
	 * @param max The inclusive maximum value for the range.
	 * 
	 * @throws ArgumentValueOutOfRangeException If the value is outside of the range.
	 */
	public static void validateInRange(String argument, double v, double min, double max)
	{
		if(!argumentValidation) return;
		
		inRange(argument, v, min, max);
	}
	
	/**
	 * Validates that the passed value is within the range of passed min value to passed max value
	 * with the min and max value being part of the range. If the value is outside of the range an
	 * {@link ArgumentValueOutOfRangeException} for the passed argument is thrown. The validation
	 * only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value for the range.
	 * @param max The inclusive maximum value for the range.
	 * 
	 * @throws ArgumentValueOutOfRangeException If the value is outside of the range.
	 */
	public static void validateInRange(String argument, BigDecimal v, BigDecimal min, BigDecimal max)
	{
		if(!argumentValidation) return;
		
		inRange(argument, v, min, max);
	}
	
	/**
	 * Validates that the passed value is within the range of passed min value to passed max value
	 * with the min and max value being part of the range. If the value is outside of the range an
	 * {@link ArgumentValueOutOfRangeException} for the passed argument is thrown. The validation
	 * only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value for the range.
	 * @param max The inclusive maximum value for the range.
	 * 
	 * @throws ArgumentValueOutOfRangeException If the value is outside of the range.
	 */
	public static void validateInRange(String argument, BigInteger v, BigInteger min, BigInteger max)
	{
		if(!argumentValidation) return;
		
		inRange(argument, v, min, max);
	}
	
	/**
	 * Validates that the passed value is at least the passed min value. If the value is below the
	 * min value an {@link ArgumentValueTooSmallException} for the passed argument is thrown. The
	 * validation only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is below minimum.
	 */
	public static void validateMin(String argument, byte v, byte min)
	{
		if(!argumentValidation) return;
		
		min(argument, v, min);
	}
	
	/**
	 * Validates that the passed value is at least the passed min value. If the value is below the
	 * min value an {@link ArgumentValueTooSmallException} for the passed argument is thrown. The
	 * validation only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is below minimum.
	 */
	public static void validateMin(String argument, short v, short min)
	{
		if(!argumentValidation) return;
		
		min(argument, v, min);
	}
	
	/**
	 * Validates that the passed value is at least the passed min value. If the value is below the
	 * min value an {@link ArgumentValueTooSmallException} for the passed argument is thrown. The
	 * validation only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is below minimum.
	 */
	public static void validateMin(String argument, int v, int min)
	{
		if(!argumentValidation) return;
		
		min(argument, v, min);
	}
	
	/**
	 * Validates that the passed value is at least the passed min value. If the value is below the
	 * min value an {@link ArgumentValueTooSmallException} for the passed argument is thrown. The
	 * validation only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is below minimum.
	 */
	public static void validateMin(String argument, long v, long min)
	{
		if(!argumentValidation) return;
		
		min(argument, v, min);
	}
	
	/**
	 * Validates that the passed value is at least the passed min value. If the value is below the
	 * min value an {@link ArgumentValueTooSmallException} for the passed argument is thrown. The
	 * validation only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is below minimum.
	 */
	public static void validateMin(String argument, float v, float min)
	{
		if(!argumentValidation) return;
		
		min(argument, v, min);
	}
	
	/**
	 * Validates that the passed value is at least the passed min value. If the value is below the
	 * min value an {@link ArgumentValueTooSmallException} for the passed argument is thrown. The
	 * validation only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is below minimum.
	 */
	public static void validateMin(String argument, double v, double min)
	{
		if(!argumentValidation) return;
		
		min(argument, v, min);
	}
	
	/**
	 * Validates that the passed value is at least the passed min value. If the value is below the
	 * min value an {@link ArgumentValueTooSmallException} for the passed argument is thrown. The
	 * validation only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is below minimum.
	 */
	public static void validateMin(String argument, BigDecimal v, BigDecimal min)
	{
		if(!argumentValidation) return;
		
		min(argument, v, min);
	}
	
	/**
	 * Validates that the passed value is at least the passed min value. If the value is below the
	 * min value an {@link ArgumentValueTooSmallException} for the passed argument is thrown. The
	 * validation only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is below minimum.
	 */
	public static void validateMin(String argument, BigInteger v, BigInteger min)
	{
		if(!argumentValidation) return;
		
		min(argument, v, min);
	}
	
	/**
	 * Validates that the passed value is at most the passed max value. If the value is above the
	 * max value an {@link ArgumentValueTooBigException} for the passed argument is thrown. The
	 * validation only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param max The inclusive maximum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is above maximum.
	 */
	public static void validateMax(String argument, byte v, byte max)
	{
		if(!argumentValidation) return;
		
		max(argument, v, max);
	}
	
	/**
	 * Validates that the passed value is at most the passed max value. If the value is above the
	 * max value an {@link ArgumentValueTooBigException} for the passed argument is thrown. The
	 * validation only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param max The inclusive maximum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is above maximum.
	 */
	public static void validateMax(String argument, short v, short max)
	{
		if(!argumentValidation) return;
		
		max(argument, v, max);
	}
	
	/**
	 * Validates that the passed value is at most the passed max value. If the value is above the
	 * max value an {@link ArgumentValueTooBigException} for the passed argument is thrown. The
	 * validation only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param max The inclusive maximum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is above maximum.
	 */
	public static void validateMax(String argument, int v, int max)
	{
		if(!argumentValidation) return;
		
		max(argument, v, max);
	}
	
	/**
	 * Validates that the passed value is at most the passed max value. If the value is above the
	 * max value an {@link ArgumentValueTooBigException} for the passed argument is thrown. The
	 * validation only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param max The inclusive maximum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is above maximum.
	 */
	public static void validateMax(String argument, long v, long max)
	{
		if(!argumentValidation) return;
		
		max(argument, v, max);
	}
	
	/**
	 * Validates that the passed value is at most the passed max value. If the value is above the
	 * max value an {@link ArgumentValueTooBigException} for the passed argument is thrown. The
	 * validation only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param max The inclusive maximum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is above maximum.
	 */
	public static void validateMax(String argument, float v, float max)
	{
		if(!argumentValidation) return;
		
		max(argument, v, max);
	}
	
	/**
	 * Validates that the passed value is at most the passed max value. If the value is above the
	 * max value an {@link ArgumentValueTooBigException} for the passed argument is thrown. The
	 * validation only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param max The inclusive maximum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is above maximum.
	 */
	public static void validateMax(String argument, double v, double max)
	{
		if(!argumentValidation) return;
		
		max(argument, v, max);
	}
	
	/**
	 * Validates that the passed value is at most the passed max value. If the value is above the
	 * max value an {@link ArgumentValueTooBigException} for the passed argument is thrown. The
	 * validation only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param max The inclusive maximum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is above maximum.
	 */
	public static void validateMax(String argument, BigDecimal v, BigDecimal max)
	{
		if(!argumentValidation) return;
		
		max(argument, v, max);
	}
	
	/**
	 * Validates that the passed value is at most the passed max value. If the value is above the
	 * max value an {@link ArgumentValueTooBigException} for the passed argument is thrown. The
	 * validation only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param max The inclusive maximum value.
	 * 
	 * @throws ArgumentValueTooSmallException If the value is above maximum.
	 */
	public static void validateMax(String argument, BigInteger v, BigInteger max)
	{
		if(!argumentValidation) return;
		
		max(argument, v, max);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the array differs from
	 * the expected size an {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from the expected size.
	 */
	public static <T> void validateExpectSize(String argument, T[] c, int expectedSize)
	{
		if(!argumentValidation) return;
		
		expectSize(argument, c, expectedSize);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the array differs from
	 * the expected size an {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from the expected size.
	 */
	public static void validateExpectSize(String argument, byte[] c, int expectedSize)
	{
		if(!argumentValidation) return;
		
		expectSize(argument, c, expectedSize);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the array differs from
	 * the expected size an {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from the expected size.
	 */
	public static void validateExpectSize(String argument, short[] c, int expectedSize)
	{
		if(!argumentValidation) return;
		
		expectSize(argument, c, expectedSize);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the array differs from
	 * the expected size an {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from the expected size.
	 */
	public static void validateExpectSize(String argument, int[] c, int expectedSize)
	{
		if(!argumentValidation) return;
		
		expectSize(argument, c, expectedSize);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the array differs from
	 * the expected size an {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from the expected size.
	 */
	public static void validateExpectSize(String argument, long[] c, int expectedSize)
	{
		if(!argumentValidation) return;
		
		expectSize(argument, c, expectedSize);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the array differs from
	 * the expected size an {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from the expected size.
	 */
	public static void validateExpectSize(String argument, float[] c, int expectedSize)
	{
		if(!argumentValidation) return;
		
		expectSize(argument, c, expectedSize);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the array differs from
	 * the expected size an {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from the expected size.
	 */
	public static void validateExpectSize(String argument, double[] c, int expectedSize)
	{
		if(!argumentValidation) return;
		
		expectSize(argument, c, expectedSize);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the array differs from
	 * the expected size an {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from the expected size.
	 */
	public static void validateExpectSize(String argument, char[] c, int expectedSize)
	{
		if(!argumentValidation) return;
		
		expectSize(argument, c, expectedSize);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the array differs from
	 * the expected size an {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from the expected size.
	 */
	public static void validateExpectSize(String argument, boolean[] c, int expectedSize)
	{
		if(!argumentValidation) return;
		
		expectSize(argument, c, expectedSize);
	}
	
	/**
	 * Validates that the passed collection has the expected size. If the size of the array differs
	 * from the expected size an {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The collection that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from the expected size.
	 */
	public static void validateExpectSize(String argument, Collection<?> c, int expectedSize)
	{
		if(!argumentValidation) return;
		
		expectSize(argument, c, expectedSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the size of the array is
	 * below the minimum size an {@link ArgumentSizeTooSmallException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum size.
	 */
	public static <T> void validateMinSize(String argument, T[] v, int minSize)
	{
		if(!argumentValidation) return;
		
		minSize(argument, v, minSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the size of the array is
	 * below the minimum size an {@link ArgumentSizeTooSmallException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum size.
	 */
	public static void validateMinSize(String argument, byte[] v, int minSize)
	{
		if(!argumentValidation) return;
		
		minSize(argument, v, minSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the size of the array is
	 * below the minimum size an {@link ArgumentSizeTooSmallException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum size.
	 */
	public static void validateMinSize(String argument, short[] v, int minSize)
	{
		if(!argumentValidation) return;
		
		minSize(argument, v, minSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the size of the array is
	 * below the minimum size an {@link ArgumentSizeTooSmallException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum size.
	 */
	public static void validateMinSize(String argument, int[] v, int minSize)
	{
		if(!argumentValidation) return;
		
		minSize(argument, v, minSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the size of the array is
	 * below the minimum size an {@link ArgumentSizeTooSmallException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum size.
	 */
	public static void validateMinSize(String argument, long[] v, int minSize)
	{
		if(!argumentValidation) return;
		
		minSize(argument, v, minSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the size of the array is
	 * below the minimum size an {@link ArgumentSizeTooSmallException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum size.
	 */
	public static void validateMinSize(String argument, float[] v, int minSize)
	{
		if(!argumentValidation) return;
		
		minSize(argument, v, minSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the size of the array is
	 * below the minimum size an {@link ArgumentSizeTooSmallException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum size.
	 */
	public static void validateMinSize(String argument, double[] v, int minSize)
	{
		if(!argumentValidation) return;
		
		minSize(argument, v, minSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the size of the array is
	 * below the minimum size an {@link ArgumentSizeTooSmallException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum size.
	 */
	public static void validateMinSize(String argument, char[] v, int minSize)
	{
		if(!argumentValidation) return;
		
		minSize(argument, v, minSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the size of the array is
	 * below the minimum size an {@link ArgumentSizeTooSmallException} for the passed argument is
	 * thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum size.
	 */
	public static void validateMinSize(String argument, boolean[] v, int minSize)
	{
		if(!argumentValidation) return;
		
		minSize(argument, v, minSize);
	}
	
	/**
	 * Validates that the passed collection has at least the minimum size. If the size of the
	 * collection is below the minimum size an {@link ArgumentSizeTooSmallException} for the passed
	 * argument is thrown. The validation only occurs if argument validation is enabled.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The collection that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum size.
	 */
	public static void validateMinSize(String argument, Collection<?> c, int minSize)
	{
		if(!argumentValidation) return;
		
		minSize(argument, c, minSize);
	}
	
	/**
	 * Validates that the passed value is not null. If it is null an {@link ArgumentNullException}
	 * for the passed argument is thrown.
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
	 * Validates that the passed value is within the range of passed min value to passed max value
	 * with the min and max value being part of the range. If the value is outside of the range an
	 * {@link ArgumentValueOutOfRangeException} for the passed argument is thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value for the range.
	 * @param max The inclusive maximum value for the range.
	 * 
	 * @throws ArgumentValueOutOfRangeException If the value is outside of the range.
	 */
	public static void inRange(String argument, byte v, byte min, byte max)
	{
		if(v < min || v > max) throw new ArgumentValueOutOfRangeException(argument, v, min, max);
	}
	
	/**
	 * Validates that the passed value is within the range of passed min value to passed max value
	 * with the min and max value being part of the range. If the value is outside of the range an
	 * {@link ArgumentValueOutOfRangeException} for the passed argument is thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value for the range.
	 * @param max The inclusive maximum value for the range.
	 * 
	 * @throws ArgumentValueOutOfRangeException If the value is outside of the range.
	 */
	public static void inRange(String argument, short v, short min, short max)
	{
		if(v < min || v > max) throw new ArgumentValueOutOfRangeException(argument, v, min, max);
	}
	
	/**
	 * Validates that the passed value is within the range of passed min value to passed max value
	 * with the min and max value being part of the range. If the value is outside of the range an
	 * {@link ArgumentValueOutOfRangeException} for the passed argument is thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value for the range.
	 * @param max The inclusive maximum value for the range.
	 * 
	 * @throws ArgumentValueOutOfRangeException If the value is outside of the range.
	 */
	public static void inRange(String argument, int v, int min, int max)
	{
		if(v < min || v > max) throw new ArgumentValueOutOfRangeException(argument, v, min, max);
	}
	
	/**
	 * Validates that the passed value is within the range of passed min value to passed max value
	 * with the min and max value being part of the range. If the value is outside of the range an
	 * {@link ArgumentValueOutOfRangeException} for the passed argument is thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value for the range.
	 * @param max The inclusive maximum value for the range.
	 * 
	 * @throws ArgumentValueOutOfRangeException If the value is outside of the range.
	 */
	public static void inRange(String argument, long v, long min, long max)
	{
		if(v < min || v > max) throw new ArgumentValueOutOfRangeException(argument, v, min, max);
	}
	
	/**
	 * Validates that the passed value is within the range of passed min value to passed max value
	 * with the min and max value being part of the range. If the value is outside of the range an
	 * {@link ArgumentValueOutOfRangeException} for the passed argument is thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value for the range.
	 * @param max The inclusive maximum value for the range.
	 * 
	 * @throws ArgumentValueOutOfRangeException If the value is outside of the range.
	 */
	public static void inRange(String argument, float v, float min, float max)
	{
		if(v < min || v > max) throw new ArgumentValueOutOfRangeException(argument, v, min, max);
	}
	
	/**
	 * Validates that the passed value is within the range of passed min value to passed max value
	 * with the min and max value being part of the range. If the value is outside of the range an
	 * {@link ArgumentValueOutOfRangeException} for the passed argument is thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value for the range.
	 * @param max The inclusive maximum value for the range.
	 * 
	 * @throws ArgumentValueOutOfRangeException If the value is outside of the range.
	 */
	public static void inRange(String argument, double v, double min, double max)
	{
		if(v < min || v > max) throw new ArgumentValueOutOfRangeException(argument, v, min, max);
	}
	
	/**
	 * Validates that the passed value is within the range of passed min value to passed max value
	 * with the min and max value being part of the range. If the value is outside of the range an
	 * {@link ArgumentValueOutOfRangeException} for the passed argument is thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value for the range.
	 * @param max The inclusive maximum value for the range.
	 * 
	 * @throws ArgumentValueOutOfRangeException If the value is outside of the range.
	 */
	public static void inRange(String argument, BigDecimal v, BigDecimal min, BigDecimal max)
	{
		if(v.compareTo(min) < 0 || v.compareTo(max) > 0) throw new ArgumentValueOutOfRangeException(argument, v, min, max);
	}
	
	/**
	 * Validates that the passed value is within the range of passed min value to passed max value
	 * with the min and max value being part of the range. If the value is outside of the range an
	 * {@link ArgumentValueOutOfRangeException} for the passed argument is thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param v The value that will be validated.
	 * @param min The inclusive minimum value for the range.
	 * @param max The inclusive maximum value for the range.
	 * 
	 * @throws ArgumentValueOutOfRangeException If the value is outside of the range.
	 */
	public static void inRange(String argument, BigInteger v, BigInteger min, BigInteger max)
	{
		if(v.compareTo(min) < 0 || v.compareTo(max) > 0) throw new ArgumentValueOutOfRangeException(argument, v, min, max);
	}
	
	/**
	 * Validates that the passed value is at least the passed min value. If the value is below the
	 * min value an {@link ArgumentValueTooSmallException} for the passed argument is thrown.
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
	 * Validates that the passed value is at least the passed min value. If the value is below the
	 * min value an {@link ArgumentValueTooSmallException} for the passed argument is thrown.
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
	 * Validates that the passed value is at least the passed min value. If the value is below the
	 * min value an {@link ArgumentValueTooSmallException} for the passed argument is thrown.
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
	 * Validates that the passed value is at least the passed min value. If the value is below the
	 * min value an {@link ArgumentValueTooSmallException} for the passed argument is thrown.
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
	 * Validates that the passed value is at least the passed min value. If the value is below the
	 * min value an {@link ArgumentValueTooSmallException} for the passed argument is thrown.
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
	 * Validates that the passed value is at least the passed min value. If the value is below the
	 * min value an {@link ArgumentValueTooSmallException} for the passed argument is thrown.
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
	 * Validates that the passed value is at least the passed min value. If the value is below the
	 * min value an {@link ArgumentValueTooSmallException} for the passed argument is thrown.
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
	 * Validates that the passed value is at least the passed min value. If the value is below the
	 * min value an {@link ArgumentValueTooSmallException} for the passed argument is thrown.
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
	 * Validates that the passed value is at most the passed max value. If the value is above the
	 * max value an {@link ArgumentValueTooBigException} for the passed argument is thrown.
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
	 * Validates that the passed value is at most the passed max value. If the value is above the
	 * max value an {@link ArgumentValueTooBigException} for the passed argument is thrown.
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
	 * Validates that the passed value is at most the passed max value. If the value is above the
	 * max value an {@link ArgumentValueTooBigException} for the passed argument is thrown.
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
	 * Validates that the passed value is at most the passed max value. If the value is above the
	 * max value an {@link ArgumentValueTooBigException} for the passed argument is thrown.
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
	 * Validates that the passed value is at most the passed max value. If the value is above the
	 * max value an {@link ArgumentValueTooBigException} for the passed argument is thrown.
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
	 * Validates that the passed value is at most the passed max value. If the value is above the
	 * max value an {@link ArgumentValueTooBigException} for the passed argument is thrown.
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
	 * Validates that the passed value is at most the passed max value. If the value is above the
	 * max value an {@link ArgumentValueTooBigException} for the passed argument is thrown.
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
	 * Validates that the passed value is at most the passed max value. If the value is above the
	 * max value an {@link ArgumentValueTooBigException} for the passed argument is thrown.
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
	 * Validates that the passed array has the expected size. If the size of the array differs from
	 * the expected size an {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from the expected size.
	 */
	public static <T> void expectSize(String argument, T[] c, int expectedSize)
	{
		if(c.length != expectedSize) throw new UnexpectedArgumentSizeException(argument, c.length, expectedSize);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the array differs from
	 * the expected size an {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from the expected size.
	 */
	public static void expectSize(String argument, byte[] c, int expectedSize)
	{
		if(c.length != expectedSize) throw new UnexpectedArgumentSizeException(argument, c.length, expectedSize);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the array differs from
	 * the expected size an {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from the expected size.
	 */
	public static void expectSize(String argument, short[] c, int expectedSize)
	{
		if(c.length != expectedSize) throw new UnexpectedArgumentSizeException(argument, c.length, expectedSize);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the array differs from
	 * the expected size an {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from the expected size.
	 */
	public static void expectSize(String argument, int[] c, int expectedSize)
	{
		if(c.length != expectedSize) throw new UnexpectedArgumentSizeException(argument, c.length, expectedSize);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the array differs from
	 * the expected size an {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from the expected size.
	 */
	public static void expectSize(String argument, long[] c, int expectedSize)
	{
		if(c.length != expectedSize) throw new UnexpectedArgumentSizeException(argument, c.length, expectedSize);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the array differs from
	 * the expected size an {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from the expected size.
	 */
	public static void expectSize(String argument, float[] c, int expectedSize)
	{
		if(c.length != expectedSize) throw new UnexpectedArgumentSizeException(argument, c.length, expectedSize);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the array differs from
	 * the expected size an {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from the expected size.
	 */
	public static void expectSize(String argument, double[] c, int expectedSize)
	{
		if(c.length != expectedSize) throw new UnexpectedArgumentSizeException(argument, c.length, expectedSize);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the array differs from
	 * the expected size an {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from the expected size.
	 */
	public static void expectSize(String argument, char[] c, int expectedSize)
	{
		if(c.length != expectedSize) throw new UnexpectedArgumentSizeException(argument, c.length, expectedSize);
	}
	
	/**
	 * Validates that the passed array has the expected size. If the size of the array differs from
	 * the expected size an {@link UnexpectedArgumentSizeException} for the passed argument is
	 * thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from the expected size.
	 */
	public static void expectSize(String argument, boolean[] c, int expectedSize)
	{
		if(c.length != expectedSize) throw new UnexpectedArgumentSizeException(argument, c.length, expectedSize);
	}
	
	/**
	 * Validates that the passed collection has the expected size. If the size of the collection
	 * differs from the expected size an {@link UnexpectedArgumentSizeException} for the passed
	 * argument is thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The collection that will be validated.
	 * @param expectedSize The expected size.
	 * 
	 * @throws UnexpectedArgumentSizeException If the array size differs from the expected size.
	 */
	public static void expectSize(String argument, Collection<?> c, int expectedSize)
	{
		int size = c.size();
		
		if(size != expectedSize) throw new UnexpectedArgumentSizeException(argument, size, expectedSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the size of the array is
	 * below the minimum size an {@link ArgumentSizeTooSmallException} for the passed argument is
	 * thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum size.
	 */
	public static <T> void minSize(String argument, T[] c, int minSize)
	{
		if(c.length < minSize) throw new ArgumentSizeTooSmallException(argument, c.length, minSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the size of the array is
	 * below the minimum size an {@link ArgumentSizeTooSmallException} for the passed argument is
	 * thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum size.
	 */
	public static void minSize(String argument, byte[] c, int minSize)
	{
		if(c.length < minSize) throw new ArgumentSizeTooSmallException(argument, c.length, minSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the size of the array is
	 * below the minimum size an {@link ArgumentSizeTooSmallException} for the passed argument is
	 * thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum size.
	 */
	public static void minSize(String argument, short[] c, int minSize)
	{
		if(c.length < minSize) throw new ArgumentSizeTooSmallException(argument, c.length, minSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the size of the array is
	 * below the minimum size an {@link ArgumentSizeTooSmallException} for the passed argument is
	 * thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum size.
	 */
	public static void minSize(String argument, int[] c, int minSize)
	{
		if(c.length < minSize) throw new ArgumentSizeTooSmallException(argument, c.length, minSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the size of the array is
	 * below the minimum size an {@link ArgumentSizeTooSmallException} for the passed argument is
	 * thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum size.
	 */
	public static void minSize(String argument, long[] c, int minSize)
	{
		if(c.length < minSize) throw new ArgumentSizeTooSmallException(argument, c.length, minSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the size of the array is
	 * below the minimum size an {@link ArgumentSizeTooSmallException} for the passed argument is
	 * thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum size.
	 */
	public static void minSize(String argument, float[] c, int minSize)
	{
		if(c.length < minSize) throw new ArgumentSizeTooSmallException(argument, c.length, minSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the size of the array is
	 * below the minimum size an {@link ArgumentSizeTooSmallException} for the passed argument is
	 * thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum size.
	 */
	public static void minSize(String argument, double[] c, int minSize)
	{
		if(c.length < minSize) throw new ArgumentSizeTooSmallException(argument, c.length, minSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the size of the array is
	 * below the minimum size an {@link ArgumentSizeTooSmallException} for the passed argument is
	 * thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum size.
	 */
	public static void minSize(String argument, char[] c, int minSize)
	{
		if(c.length < minSize) throw new ArgumentSizeTooSmallException(argument, c.length, minSize);
	}
	
	/**
	 * Validates that the passed array has at least the minimum size. If the size of the array is
	 * below the minimum size an {@link ArgumentSizeTooSmallException} for the passed argument is
	 * thrown.
	 * 
	 * @param <T> The array type.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The array that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum size.
	 */
	public static void minSize(String argument, boolean[] c, int minSize)
	{
		if(c.length < minSize) throw new ArgumentSizeTooSmallException(argument, c.length, minSize);
	}
	
	/**
	 * Validates that the passed collection has at least the minimum size. If the size of the
	 * collection is below the minimum size an {@link ArgumentSizeTooSmallException} for the passed
	 * argument is thrown.
	 * 
	 * @param argument The name of the argument that is validated.
	 * @param c The collection that will be validated.
	 * @param minSize The minimum size.
	 * 
	 * @throws ArgumentSizeTooSmallException If the array size is below minimum size.
	 */
	public static void minSize(String argument, Collection<?> c, int minSize)
	{
		int size = c.size();
		
		if(size < minSize) throw new ArgumentSizeTooSmallException(argument, size, minSize);
	}
	
	public static <T> void validateAllNotNull(T[] obj)
	{
		if(obj == null) throw new NullPointerException();

		for(T entry : obj)
			if(entry == null) throw new NullPointerException();
	}
}
