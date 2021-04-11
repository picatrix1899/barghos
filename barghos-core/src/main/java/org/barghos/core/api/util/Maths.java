/*
MIT License

Copyright (c) 2019 picatrix1899

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

package org.barghos.core.api.util;

/**
 * This class contains mathematical methods and precalculated constants.
 */
public class Maths extends MathConstants
{
	
	/**
	 * Checks if the value is zero with given tolerance.
	 * 
	 * @param value the value to check for 0.
	 * @param tolerance The threshold around 0.
	 * 
	 * @return is the value 0.
	 */
	public static boolean isZero(double value, double tolerance)
	{
		return Math.abs(value) <= tolerance;
	}
	
	/**
	 * Checks if the value is zero with tolerance of SMALL_NUMBER(1.e-8f).
	 * 
	 * @param value the value to check for 0.
	 * 
	 * @return is the value 0.
	 */
	public static boolean isZero(double value)
	{
		return isZero(value, Maths.SMALL_NUMBER_E8);
	}
	
	/**
	 * Rounds the given value away from zero. Therefore if the value is below zero
	 * like -1.4 it is rounded down to -2 whereas a value above zero like 1.4 is rounded up
	 * to 2.
	 * 
	 * @param value The value to be rounded.
	 * 
	 * @return The rounded value
	 */
	public static double roundFromZero(double value)
	{
		return value > 0 ? Math.ceil(value) : value < 0 ? Math.floor(value) : 0;
	}
	
	/**
	 * Rounds the given value towards zero. Therefore if the value is below zero
	 * like -1.4 it is rounded up to -1 whereas a value above zero like 1.4 is rounded down
	 * to 1.
	 * 
	 * @param value The value to be rounded.
	 * 
	 * @return The rounded value
	 */
	public static double roundToZero(double value)
	{
		return value > 0 ? Math.floor(value) : value < 0 ? Math.ceil(value) : 0;
	}
	
	public static byte limit(byte value, byte min, byte max)
	{
		return limitMax(limitMin(value, min), max);
	}
	
	public static char limit(char value, char min, char max)
	{
		return limitMax(limitMin(value, min), max);
	}
	
	public static long limit(long value, long min, long max)
	{
		return limitMax(limitMin(value, min), max);
	}
	
	public static float limit(float value, float min, float max)
	{
		return limitMax(limitMin(value, min), max);
	}
	
	public static int limit(int value, int min, int max)
	{
		return limitMax(limitMin(value, min), max);
	}
	
	public static double limit(double value, double min, double max)
	{
		return limitMax(limitMin(value, min), max);
	}

	public static byte limitMin(byte value, byte min)
	{
		return value < min ? min : value;
	}
	
	public static char limitMin(char value, char min)
	{
		return value < min ? min : value;
	}
	
	public static long limitMin(long value, long min)
	{
		return value < min ? min : value;
	}
	
	public static float limitMin(float value, float min)
	{
		return value < min ? min : value;
	}
	
	public static int limitMin(int value, int min)
	{
		return value < min ? min : value;
	}
	
	public static double limitMin(double value, double min)
	{
		return value < min ? min : value;
	}

	public static byte limitMax(byte value, byte max)
	{
		return value > max ? max : value;
	}
	
	public static char limitMax(char value, char max)
	{
		return value > max ? max : value;
	}
	
	public static long limitMax(long value, long max)
	{
		return value > max ? max : value;
	}
	
	public static float limitMax(float value, float max)
	{
		return value > max ? max : value;
	}
	
	public static int limitMax(int value, int max)
	{
		return value > max ? max : value;
	}
	
	public static double limitMax(double value, double max)
	{
		return value > max ? max : value;
	}
	
	public static boolean isMultipleOfTwo(int value)
	{
		return (value & value - 1) == 0;
	}
	
	public static double reciprocal(double value)
	{
		return 1.0 / value;
	}
	
	public static double reciprocalSafe(double value)
	{
		return isZero(value) ? 0.0 : reciprocal(value);
	}
	
	public static double reciprocalSafe(double value, double tolerance)
	{
		return isZero(value, tolerance) ? 0.0 : 1.0 / value;
	}
	
	public static double sin(double a)
	{
		return Math.sin(a);
	}
	
	public static float sin(float a)
	{
		return (float)Math.sin(a);
	}
	
	public static double cos(double a)
	{
		return Math.cos(a);
	}
	
	public static float cos(float a)
	{
		return (float)Math.cos(a);
	}
	
	public static double sqrt(double a)
	{
		return Math.sqrt(a);
	}
	
	public static float sqrt(float a)
	{
		return (float)Math.sqrt(a);
	}
	
	public static double atan2(double y, double x)
	{
		return Math.atan2(y, x);
	}
	
	public static float atan2(float y, float x)
	{
		return (float)Math.atan2(y, x);
	}
}