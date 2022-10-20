package org.barghos.core.api;

import java.math.BigDecimal;
import java.math.BigInteger;

public class GeneralUtils
{
	/**
	 * Generates a BigDecimal of the given value.
	 * 
	 * @param value The value that should be converted to BigDecimal.
	 * 
	 * @return The value as BigDecimal.
	 */
	public static BigDecimal toBigD(double value)
	{
		return BigDecimal.valueOf(value);
	}
	
	/**
	 * Generates a BigDecimal array of the given values.
	 * 
	 * @param values The values that should be converted to a BigDecimal array.
	 * 
	 * @return The values converted to BigDecimal as array.
	 */
	public static BigDecimal[] toBigD(double... values)
	{
		if(values.length == 0) return new BigDecimal[0];
		
		BigDecimal[] out = new BigDecimal[values.length];
		
		for(int i = 0; i < values.length; i++)
			out[i] = BigDecimal.valueOf(values[i]);
		
		return out;
	}
	
	/**
	 * Generates a BigInteger of the given value.
	 * 
	 * @param value The value that should be converted to BigInteger.
	 * 
	 * @return The value as BigInteger.
	 */
	public static BigInteger toBigI(long value)
	{
		return BigInteger.valueOf(value);
	}
	
	/**
	 * Generates a BigInteger array of the given values.
	 * 
	 * @param values The values that should be converted to a BigInteger array.
	 * 
	 * @return The values converted to BigInteger as array.
	 */
	public static BigInteger[] toBigI(long... values)
	{
		if(values.length == 0) return new BigInteger[0];
		
		BigInteger[] out = new BigInteger[values.length];
		
		for(int i = 0; i < values.length; i++)
			out[i] = BigInteger.valueOf(values[i]);
		
		return out;
	}
	
	/**
	 * Generates a byte of the given value.
	 * 
	 * @param value The value that should be converted to byte.
	 * 
	 * @return The value as byte.
	 */
	public static byte toByte(int value)
	{
		return (byte)value;
	}
	
	/**
	 * Generates a byte array of the given values.
	 * 
	 * @param values The values that should be converted to a byte array.
	 * 
	 * @return The values converted to byte as array.
	 */
	public static byte[] toByte(int... values)
	{
		if(values.length == 0) return new byte[0];
		
		byte[] out = new byte[values.length];
		
		for(int i = 0; i < values.length; i++)
			out[i] = (byte)values[i];
		
		return out;
	}
	
	/**
	 * Generates a short of the given value.
	 * 
	 * @param value The value that should be converted to short.
	 * 
	 * @return The value as short.
	 */
	public static short toShort(int value)
	{
		return (short)value;
	}
	
	/**
	 * Generates a short array of the given values.
	 * 
	 * @param values The values that should be converted to a short array.
	 * 
	 * @return The values converted to short as array.
	 */
	public static short[] toShort(int... values)
	{
		if(values.length == 0) return new short[0];
		
		short[] out = new short[values.length];
		
		for(int i = 0; i < values.length; i++)
			out[i] = (short)values[i];
		
		return out;
	}
}
