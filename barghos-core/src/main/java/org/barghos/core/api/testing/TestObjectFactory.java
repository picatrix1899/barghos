package org.barghos.core.api.testing;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * This class provides utility functions to generate objects in a short way for testing.
 * 
 * @author picatrix1899
 */
public class TestObjectFactory
{
	/**
	 * Generates a BigDecimal of the given value.
	 * 
	 * @param value The value that should be converted to BigDecimal.
	 * 
	 * @return The value as BigDecimal.
	 */
	public static BigDecimal bigd(double value)
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
	public static BigDecimal[] bigdArray(double... values)
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
	public static BigInteger bigi(long value)
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
	public static BigInteger[] bigiArray(long... values)
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
	public static byte b(int value)
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
	public static byte[] bArray(int... values)
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
	public static short s(int value)
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
	public static short[] sArray(int... values)
	{
		if(values.length == 0) return new short[0];
		
		short[] out = new short[values.length];
		
		for(int i = 0; i < values.length; i++)
			out[i] = (short)values[i];
		
		return out;
	}
}
