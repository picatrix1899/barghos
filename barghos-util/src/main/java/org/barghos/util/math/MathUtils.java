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
	 * This is a precalculated square-root of the number 3 (sqrt(3));
	 */
	public static final double SQRT3 = 1.7320508075688772;
	
	/**
	 * This is a precalculated square-root of the number 3 (sqrt(3));
	 */
	public static final float SQRT3f = 1.7320508075688772f;
	
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
	
	public static double sqrtF2D(float value)
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
	
	public static double recSqrtF2D(float value)
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
	
	public static double invSqrtF2D(float value)
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
	
	public static double cbrtF2D(float value)
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
	
	public static double recCbrtF2D(float value)
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
	
	public static double invCbrtF2D(float value)
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
	
	public static double logF2D(float value)
	{
		return Math.log(value);
	}

	public static double log10(double value)
	{
		return Math.log10(value);
	}

	public static double log10F2D(float value)
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

	public static double log1pF2D(float value)
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

	public static double expF2D(float value)
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

	public static double expm1F2D(float value)
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

	public static double powF2D(float base, float power)
	{
		return Math.pow(base, power);
	}
	
	public static float pow(float base, float power)
	{
		return (float)Math.pow(base, power);
	}
	
	public static double fma(double a, double b, double c)
	{
		if(BarghosUtilConfiguration.useFMA())
			return Math.fma(a, b, c);
		
		return a * b + c;
	}

	public static double fmaF2D(float a, float b, float c)
	{
		if(BarghosUtilConfiguration.useFMA())
			return Math.fma(a, b, c);
		
		return a * b + c;
	}
	
	public static float fma(float a, float b, float c)
	{
		if(BarghosUtilConfiguration.useFMA())
			return Math.fma(a, b, c);
		
		return a * b + c;
	}
	
	public static double sin(double angle)
	{
		return Math.sin(angle);
	}
	
	public static double sinF2D(float angle)
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

	public static double cosF2D(float angle)
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

	public static double tanF2D(float angle)
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

	public static double asinF2D(float value)
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
	
	public static double acosF2D(float value)
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

	public static double atanF2D(float value)
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

	public static double atan2F2D(float y, float x)
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

	public static double sinhF2D(float angle)
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

	public static double coshF2D(float angle)
	{
		return Math.cosh(angle);
	}
	
	public static float cosh(float angle)
	{
		return (float)Math.cosh(angle);
	}
	
	public static double tanhF2D(float angle)
	{
		return Math.tanh(angle);
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

	public static double hypotF2D(float x, float y)
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
	
	public static double cotF2D(float angle)
	{
		return 1.0 / Math.tan(angle);
	}
	
	public static float cot(float angle)
	{
		return (float)(1.0 / Math.tan(angle));
	}
	
	public static double sec(double angle)
	{
		return 1.0 / Math.cos(angle);
	}

	public static double secF2D(float angle)
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
	
	public static double fracF2D(float value)
	{
		return value - (int)value;
	}
	
	public static float frac(float value)
	{
		return value - (int)value;
	}
	
	public static double integer(double value)
	{
		return (long)value;
	}
	
	public static double integerF2D(float value)
	{
		return (int)value;
	}
	
	public static float integer(float value)
	{
		return (int)value;
	}
	
	public static long integerD2L(double value)
	{
		return (long)value;
	}
	
	public static long integerF2L(float value)
	{
		return (int)value;
	}
	
	public static int integerF2I(float value)
	{
		return (int)value;
	}
	
	public static BigDecimal sign(BigDecimal value)
	{
		return BigDecimal.valueOf(value.signum());
	}
	
	public static BigDecimal signD2Bigd(double value)
	{
		return BigDecimal.valueOf(Math.signum(value));
	}
	
	public static BigDecimal signF2Bigd(float value)
	{
		return BigDecimal.valueOf(Math.signum(value));
	}
	
	public static BigDecimal signBigi2Bigd(BigInteger value)
	{
		return BigDecimal.valueOf(value.signum());
	}
	
	public static BigDecimal signL2Bigd(long value)
	{
		return BigDecimal.valueOf(Math.signum(value));
	}
	
	public static BigDecimal signI2Bigd(int value)
	{
		return BigDecimal.valueOf(Math.signum(value));
	}
	
	public static BigDecimal signS2Bigd(short value)
	{
		return BigDecimal.valueOf(Math.signum(value));
	}
	
	public static BigDecimal signSB2Bigd(byte value)
	{
		return BigDecimal.valueOf(Math.signum(value));
	}
	
	public static double signBigd2D(BigDecimal value)
	{
		return value.signum();
	}
	
	public static double sign(double value)
	{
		return Math.signum(value);
	}
	
	public static double signF2D(float value)
	{
		return Math.signum(value);
	}
	
	public static double signBigi2D(BigInteger value)
	{
		return value.signum();
	}
	
	public static double signL2D(long value)
	{
		return Math.signum(value);
	}
	
	public static double signI2D(int value)
	{
		return Math.signum(value);
	}
	
	public static double signS2D(short value)
	{
		return Math.signum(value);
	}
	
	public static double signSB2D(byte value)
	{
		return Math.signum(value);
	}
	
	public static float signBigd2F(BigDecimal value)
	{
		return value.signum();
	}
	
	public static float signD2F(double value)
	{
		return (float)Math.signum(value);
	}
	
	public static float sign(float value)
	{
		return Math.signum(value);
	}
	
	public static float signBigi2F(BigInteger value)
	{
		return value.signum();
	}
	
	public static float signL2F(long value)
	{
		return Math.signum(value);
	}
	
	public static float signI2F(int value)
	{
		return Math.signum(value);
	}
	
	public static float signS2F(short value)
	{
		return Math.signum(value);
	}
	
	public static float signSB2F(byte value)
	{
		return Math.signum(value);
	}
	
	public static BigInteger signBigd2Bigi(BigDecimal value)
	{
		return BigInteger.valueOf(value.signum());
	}
	
	public static BigInteger signD2Bigi(double value)
	{
		return BigInteger.valueOf((int)Math.signum(value));
	}
	
	public static BigInteger signF2Bigi(float value)
	{
		return BigInteger.valueOf((int)Math.signum(value));
	}
	
	public static BigInteger sign(BigInteger value)
	{
		return BigInteger.valueOf(value.signum());
	}
	
	public static BigInteger signL2Bigi(long value)
	{
		return BigInteger.valueOf((int)Math.signum(value));
	}
	
	public static BigInteger signI2Bigi(int value)
	{
		return BigInteger.valueOf((int)Math.signum(value));
	}
	
	public static BigInteger signS2Bigi(short value)
	{
		return BigInteger.valueOf((int)Math.signum(value));
	}
	
	public static BigInteger signSB2Bigi(byte value)
	{
		return BigInteger.valueOf((int)Math.signum(value));
	}
	
	public static long signBigd2L(BigDecimal value)
	{
		return value.signum();
	}
	
	public static long signD2L(double value)
	{
		return (long)Math.signum(value);
	}
	
	public static long signF2L(float value)
	{
		return (long)Math.signum(value);
	}
	
	public static long signBigi2L(BigInteger value)
	{
		return value.signum();
	}
	
	public static long sign(long value)
	{
		return (long)Math.signum(value);
	}
	
	public static long signI2L(int value)
	{
		return(long)Math.signum(value);
	}
	
	public static long signS2L(short value)
	{
		return (long)Math.signum(value);
	}
	
	public static long signSB2L(byte value)
	{
		return (long)Math.signum(value);
	}
	
	public static int signBigd2I(BigDecimal value)
	{
		return value.signum();
	}
	
	public static int signD2I(double value)
	{
		return (int)Math.signum(value);
	}
	
	public static int signF2I(float value)
	{
		return (int)Math.signum(value);
	}
	
	public static int signBigi2I(BigInteger value)
	{
		return value.signum();
	}
	
	public static int signL2I(long value)
	{
		return (int)Math.signum(value);
	}
	
	public static int sign(int value)
	{
		return (int)Math.signum(value);
	}

	public static int signS2I(short value)
	{
		return (int)Math.signum(value);
	}
	
	public static int signSB2I(byte value)
	{
		return (int)Math.signum(value);
	}
	
	public static short signBigd2S(BigDecimal value)
	{
		return (short)value.signum();
	}
	
	public static short signD2S(double value)
	{
		return (short)Math.signum(value);
	}
	
	public static short signF2S(float value)
	{
		return (short)Math.signum(value);
	}
	
	public static short signBigi2S(BigInteger value)
	{
		return (short)value.signum();
	}
	
	public static short signL2S(long value)
	{
		return (short)Math.signum(value);
	}
	
	public static short signI2S(int value)
	{
		return (short)Math.signum(value);
	}

	public static short sign(short value)
	{
		return (short)Math.signum(value);
	}
	
	public static short signSB2S(byte value)
	{
		return (short)Math.signum(value);
	}
	
	public static byte signBigd2SB(BigDecimal value)
	{
		return (byte)value.signum();
	}
	
	public static byte signD2SB(double value)
	{
		return (byte)Math.signum(value);
	}
	
	public static byte signF2SB(float value)
	{
		return (byte)Math.signum(value);
	}
	
	public static byte signBigi2SB(BigInteger value)
	{
		return (byte)value.signum();
	}
	
	public static byte signL2SB(long value)
	{
		return (byte)Math.signum(value);
	}
	
	public static byte signI2SB(int value)
	{
		return (byte)Math.signum(value);
	}
	
	public static byte signS2SB(short value)
	{
		return (byte)Math.signum(value);
	}
	
	public static byte sign(byte value)
	{
		return (byte)Math.signum(value);
	}
	
	public static BigDecimal abs(BigDecimal value)
	{
		return value.abs();
	}
	
	public static BigDecimal absD2Bigd(double value)
	{
		return BigDecimal.valueOf(Math.abs(value));
	}
	
	public static BigDecimal absF2Bigd(float value)
	{
		return BigDecimal.valueOf(Math.abs(value));
	}
	
	public static BigDecimal absL2Bigd(long value)
	{
		return BigDecimal.valueOf(Math.abs(value));
	}
	
	public static BigDecimal absI2Bigd(int value)
	{
		return BigDecimal.valueOf(Math.abs(value));
	}
	
	public static BigDecimal absS2Bigd(short value)
	{
		return BigDecimal.valueOf(Math.abs(value));
	}
	
	public static BigDecimal absSB2Bigd(byte value)
	{
		return BigDecimal.valueOf(Math.abs(value));
	}
	
	public static double abs(double value)
	{
		return Math.abs(value);
	}

	public static double absF2D(float value)
	{
		return Math.abs(value);
	}
	
	public static double absL2D(long value)
	{
		return Math.abs(value);
	}
	
	public static double absI2D(int value)
	{
		return Math.abs(value);
	}
	
	public static double absS2D(short value)
	{
		return Math.abs(value);
	}
	
	public static double absSB2D(byte value)
	{
		return Math.abs(value);
	}
	
	public static float abs(float value)
	{
		return Math.abs(value);
	}

	public static float absI2F(int value)
	{
		return Math.abs(value);
	}
	
	public static float absS2F(short value)
	{
		return Math.abs(value);
	}
	
	public static float absSB2F(byte value)
	{
		return Math.abs(value);
	}
	
	public static BigInteger abs(BigInteger value)
	{
		return value.abs();
	}
	
	public static BigInteger absL2Bigi(long value)
	{
		return BigInteger.valueOf(Math.abs(value));
	}
	
	public static BigInteger absI2Bigi(int value)
	{
		return BigInteger.valueOf(Math.abs(value));
	}
	
	public static BigInteger absS2Bigi(short value)
	{
		return BigInteger.valueOf(Math.abs(value));
	}
	
	public static BigInteger absSB2Bigi(byte value)
	{
		return BigInteger.valueOf(Math.abs(value));
	}
	
	public static long abs(long value)
	{
		return Math.abs(value);
	}
	
	public static long absI2L(int value)
	{
		return Math.abs(value);
	}
	
	public static long absS2L(short value)
	{
		return Math.abs(value);
	}
	
	public static long absSB2L(byte value)
	{
		return Math.abs(value);
	}
	
	public static int abs(int value)
	{
		return Math.abs(value);
	}
	
	public static int absS2I(short value)
	{
		return Math.abs(value);
	}
	
	public static int absSB2I(byte value)
	{
		return Math.abs(value);
	}
	
	public static short abs(short value)
	{
		return (short)Math.abs(value);
	}
	
	public static short absSB2S(byte value)
	{
		return (short)Math.abs(value);
	}
	
	public static byte abs(byte value)
	{
		return (byte)Math.abs(value);
	}
	
	public static BigDecimal min(BigDecimal value1, BigDecimal value2)
	{
		
		return value1.min(value2);
	}
	
	public static BigDecimal min(BigDecimal value1, BigDecimal value2, BigDecimal value3)
	{
		return value1.min(value2.min(value3));
	}
	
	public static BigDecimal min(BigDecimal value1, BigDecimal value2, BigDecimal value3, BigDecimal value4)
	{
		return value1.min(value2.min(value3.min(value4)));
	}
	
	public static BigDecimal min(BigDecimal value1, BigDecimal value2, BigDecimal value3, BigDecimal value4, BigDecimal value5)
	{
		return value1.min(value2.min(value3.min(value4.min(value5))));
	}
	
	public static BigDecimal min(BigDecimal... values)
	{
		BigDecimal value = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			value = value.min(values[i]);
		}
		
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
	
	public static BigInteger min(BigInteger value1, BigInteger value2)
	{
		
		return value1.min(value2);
	}
	
	public static BigInteger min(BigInteger value1, BigInteger value2, BigInteger value3)
	{
		return value1.min(value2.min(value3));
	}
	
	public static BigInteger min(BigInteger value1, BigInteger value2, BigInteger value3, BigInteger value4)
	{
		return value1.min(value2.min(value3.min(value4)));
	}
	
	public static BigInteger min(BigInteger value1, BigInteger value2, BigInteger value3, BigInteger value4, BigInteger value5)
	{
		return value1.min(value2.min(value3.min(value4.min(value5))));
	}
	
	public static BigInteger min(BigInteger... values)
	{
		BigInteger value = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			value = value.min(values[i]);
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
	
	public static short min(short value1, short value2)
	{
		return (short)Math.min(value1, value2);
	}
	
	public static short min(short value1, short value2, short value3)
	{
		return (short)Math.min(value1, Math.min(value2, value3));
	}
	
	public static short min(short value1, short value2, short value3, short value4)
	{
		return (short)Math.min(value1, Math.min(value2, Math.min(value3, value4)));
	}
	
	public static short min(short value1, short value2, short value3, short value4, short value5)
	{
		return (short)Math.min(value1, Math.min(value2, Math.min(value3, Math.min(value4, value5))));
	}
	
	public static short min(short... values)
	{
		short value = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			value = (short)Math.min(value, values[i]);
		}
		
		return value;
	}
	
	public static byte min(byte value1, byte value2)
	{
		return (byte)Math.min(value1, value2);
	}
	
	public static byte min(byte value1, byte value2, byte value3)
	{
		return (byte)Math.min(value1, Math.min(value2, value3));
	}
	
	public static byte min(byte value1, byte value2, byte value3, byte value4)
	{
		return (byte)Math.min(value1, Math.min(value2, Math.min(value3, value4)));
	}
	
	public static byte min(byte value1, byte value2, byte value3, byte value4, byte value5)
	{
		return (byte)Math.min(value1, Math.min(value2, Math.min(value3, Math.min(value4, value5))));
	}
	
	public static byte min(byte... values)
	{
		byte value = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			value = (byte)Math.min(value, values[i]);
		}
		
		return value;
	}
	
	public static BigDecimal max(BigDecimal value1, BigDecimal value2)
	{
		return value1.max(value2);
	}
	
	public static BigDecimal max(BigDecimal value1, BigDecimal value2, BigDecimal value3)
	{
		return value1.max(value2.max(value3));
	}
	
	public static BigDecimal max(BigDecimal value1, BigDecimal value2, BigDecimal value3, BigDecimal value4)
	{
		return value1.max(value2.max(value3.max(value4)));
	}
	
	public static BigDecimal max(BigDecimal value1, BigDecimal value2, BigDecimal value3, BigDecimal value4, BigDecimal value5)
	{
		return value1.max(value2.max(value3.max(value4.max(value5))));
	}
	
	public static BigDecimal max(BigDecimal... values)
	{
		BigDecimal value = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			value = value.max(values[i]);
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
	
	public static BigInteger max(BigInteger value1, BigInteger value2)
	{
		return value1.max(value2);
	}
	
	public static BigInteger max(BigInteger value1, BigInteger value2, BigInteger value3)
	{
		return value1.max(value2.max(value3));
	}
	
	public static BigInteger max(BigInteger value1, BigInteger value2, BigInteger value3, BigInteger value4)
	{
		return value1.max(value2.max(value3.max(value4)));
	}
	
	public static BigInteger max(BigInteger value1, BigInteger value2, BigInteger value3, BigInteger value4, BigInteger value5)
	{
		return value1.max(value2.max(value3.max(value4.max(value5))));
	}
	
	public static BigInteger max(BigInteger... values)
	{
		BigInteger value = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			value = value.max(values[i]);
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
	
	public static short max(short value1, short value2)
	{
		return (short)Math.max(value1, value2);
	}
	
	public static short max(short value1, short value2, short value3)
	{
		return (short)Math.max(value1, Math.max(value2, value3));
	}
	
	public static short max(short value1, short value2, short value3, short value4)
	{
		return (short)Math.max(value1, Math.max(value2, Math.max(value3, value4)));
	}
	
	public static short max(short value1, short value2, short value3, short value4, short value5)
	{
		return (short)Math.max(value1, Math.max(value2, Math.max(value3, Math.max(value4, value5))));
	}
	
	public static short max(short... values)
	{
		short value = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			value = (short)Math.max(value, values[i]);
		}
		
		return value;
	}
	
	public static byte max(byte value1, byte value2)
	{
		return (byte)Math.max(value1, value2);
	}
	
	public static byte max(byte value1, byte value2, byte value3)
	{
		return (byte)Math.max(value1, Math.max(value2, value3));
	}
	
	public static byte max(byte value1, byte value2, byte value3, byte value4)
	{
		return (byte)Math.max(value1, Math.max(value2, Math.max(value3, value4)));
	}
	
	public static byte max(byte value1, byte value2, byte value3, byte value4, byte value5)
	{
		return (byte)Math.max(value1, Math.max(value2, Math.max(value3, Math.max(value4, value5))));
	}
	
	public static byte max(byte... values)
	{
		byte value = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			value = (byte)Math.max(value, values[i]);
		}
		
		return value;
	}

	public static BigDecimal clampMin(BigDecimal value, BigDecimal min)
	{
		return value.max(min);
	}
	
	public static double clampMin(double value, double min)
	{
		return Math.max(value, min);
	}

	public static float clampMin(float value, float min)
	{
		return Math.max(value, min);
	}
	
	public static BigInteger clampMin(BigInteger value, BigInteger min)
	{
		return value.max(min);
	}
	
	public static long clampMin(long value, long min)
	{
		return Math.max(value, min);
	}
	
	public static int clampMin(int value, int min)
	{
		return Math.max(value, min);
	}
	
	public static short clampMin(short value, short min)
	{
		return (short)Math.max(value, min);
	}
	
	public static byte clampMinSB(byte value, byte min)
	{
		return (byte)Math.max(value, min);
	}
	
	public static byte clampMinUB(byte value, byte min)
	{
		return (byte)Math.max(value & 0xFF, min & 0xFF);
	}
	
	public static BigDecimal clampMin(BigDecimal tolerance, BigDecimal value, BigDecimal min)
	{
		return value.compareTo(min.add(tolerance)) < 0 ? min : value;
	}
	
	public static double clampMin(double tolerance, double value, double min)
	{
		return value < min + tolerance ? min : value;
	}

	public static float clampMin(float tolerance, float value, float min)
	{
		return value < min + tolerance ? min : value;
	}
	
	public static BigInteger clampMin(BigInteger tolerance, BigInteger value, BigInteger min)
	{
		return value.compareTo(min.add(tolerance)) < 0 ? min : value;
	}
	
	public static long clampMin(long tolerance, long value, long min)
	{
		return value < min + tolerance ? min : value;
	}
	
	public static int clampMin(int tolerance, int value, int min)
	{
		return value < min + tolerance ? min : value;
	}
	
	public static short clampMin(short tolerance, short value, short min)
	{
		return value < min + tolerance ? min : value;
	}
	
	public static byte clampMinSB(byte tolerance, byte value, byte min)
	{
		return value < min + tolerance ? min : value;
	}
	
	public static byte clampMinUB(byte tolerance, byte value, byte min)
	{
		return (value & 0xFF) < (min & 0xFF) + (tolerance & 0xFF) ? min : value;
	}
	
	public static BigDecimal clampMax(BigDecimal value, BigDecimal max)
	{
		return value.min(max);
	}
	
	public static double clampMax(double value, double max)
	{
		return Math.min(value, max);
	}

	public static float clampMax(float value, float max)
	{
		return Math.min(value, max);
	}
	
	public static BigInteger clampMax(BigInteger value, BigInteger max)
	{
		return value.min(max);
	}
	
	public static long clampMax(long value, long max)
	{
		return Math.min(value, max);
	}
	
	public static int clampMax(int value, int max)
	{
		return Math.min(value, max);
	}
	
	public static short clampMax(short value, short max)
	{
		return (short)Math.min(value, max);
	}
	
	public static byte clampMaxSB(byte value, byte max)
	{
		return (byte)Math.min(value, max);
	}
	
	public static byte clampMaxUB(byte value, byte max)
	{
		return (byte)Math.min(value & 0xFF, max & 0xFF);
	}
	
	public static BigDecimal clampMax(BigDecimal tolerance, BigDecimal value, BigDecimal max)
	{
		return value.compareTo(max.subtract(tolerance)) > 0 ? max : value;
	}
	
	public static double clampMax(double tolerance, double value, double max)
	{
		return value > max - tolerance ? max : value;
	}

	public static float clampMax(float tolerance, float value, float max)
	{
		return value > max - tolerance ? max : value;
	}
	
	public static BigInteger clampMax(BigInteger tolerance, BigInteger value, BigInteger max)
	{
		return value.compareTo(max.subtract(tolerance)) > 0 ? max : value;
	}
	
	public static long clampMax(long tolerance, long value, long max)
	{
		return value > max - tolerance ? max : value;
	}
	
	public static int clampMax(int tolerance, int value, int max)
	{
		return value > max - tolerance ? max : value;
	}
	
	public static short clampMax(short tolerance, short value, short max)
	{
		return value > max - tolerance ? max : value;
	}
	
	public static byte clampMaxSB(byte tolerance, byte value, byte max)
	{
		return value > max - tolerance ? max : value;
	}
	
	public static byte clampMaxUB(byte tolerance, byte value, byte max)
	{
		return (value & 0xFF) > (max & 0xFF) - (tolerance & 0xFF) ? max : value;
	}
	
	public static BigDecimal clamp(BigDecimal value, BigDecimal min, BigDecimal max)
	{
		return value.max(min).min(max);
	}
	
	public static double clamp(double value, double min, double max)
	{
		return Math.clamp(value, min, max);
	}
	
	public static float clamp(float value, float min, float max)
	{
		return Math.clamp(value, min, max);
	}

	public static BigInteger clamp(BigInteger value, BigInteger min, BigInteger max)
	{
		return value.max(min).min(max);
	}
	
	public static long clamp(long value, long min, long max)
	{
		return Math.clamp(value, min, max);
	}
	
	public static int clamp(int value, int min, int max)
	{
		return Math.clamp(value, min, max);
	}
	
	public static short clamp(short value, short min, short max)
	{
		return (short)Math.clamp(value, min, max);
	}
	
	public static byte clampSB(byte value, byte min, byte max)
	{
		return (byte)Math.clamp(value, min, max);
	}
	
	public static byte clampUB(byte value, byte min, byte max)
	{
		return (byte)Math.clamp(value & 0xFF, min & 0xFF, max & 0xFF);
	}
	
	public static BigDecimal clamp(BigDecimal tolerance, BigDecimal value, BigDecimal min, BigDecimal max)
	{
		return value.compareTo(min.add(tolerance)) < 0 ? min : value.compareTo(max.subtract(tolerance)) > 0 ? max : value;
	}
	
	public static double clamp(double tolerance, double value, double min, double max)
	{
		return value < min + tolerance ? min : value > max - tolerance ? max : value;
	}

	public static float clamp(float tolerance, float value, float min, float max)
	{
		return value < min + tolerance ? min : value > max - tolerance ? max : value;
	}
	
	public static BigInteger clamp(BigInteger tolerance, BigInteger value, BigInteger min, BigInteger max)
	{
		return value.compareTo(min.add(tolerance)) < 0 ? min : value.compareTo(max.subtract(tolerance)) > 0 ? max : value;
	}
	
	public static long clamp(long tolerance, long value, long min, long max)
	{
		return value < min + tolerance ? min : value > max - tolerance ? max : value;
	}
	
	public static int clamp(int tolerance, int value, int min, int max)
	{
		return value < min + tolerance ? min : value > max - tolerance ? max : value;
	}
	
	public static short clamp(short tolerance, short value, short min, short max)
	{
		return value < min + tolerance ? min : value > max - tolerance ? max : value;
	}
	
	public static byte clampSB(byte tolerance, byte value, byte min, byte max)
	{
		return value < min + tolerance ? min : value > max - tolerance ? max : value;
	}
	
	public static byte clampUB(byte tolerance, byte value, byte min, byte max)
	{
		int iVal = value & 0xFF;
		int iTolerance = tolerance & 0xFF;
		return iVal < (min & 0xFF) + iTolerance ? min : iVal > (max & 0xFF) - iTolerance ? max : value;
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
	
	public static boolean isZero(BigDecimal value)
	{
		return value.compareTo(BigDecimal.ZERO) == 0;
	}
	
	public static boolean isZero(double value)
	{
		return value == 0.0f;
	}
	
	public static boolean isZero(float value)
	{
		return value == 0.0;
	}
	
	public static boolean isZero(BigInteger value)
	{
		return value.compareTo(BigInteger.ZERO) == 0;
	}
	
	public static boolean isZero(long value)
	{
		return value == 0;
	} 
	
	public static boolean isZero(int value)
	{
		return value == 0;
	} 
	
	public static boolean isZero(short value)
	{
		return value == 0;
	} 
	
	public static boolean isZero(byte value)
	{
		return value == 0;
	} 
	
	public static boolean isZero(BigDecimal tolerance, BigDecimal value)
	{
		return value.abs().compareTo(tolerance) <= 0;
	}
	
	public static boolean isZero(float tolerance, float value)
	{
		return Math.abs(value) <= tolerance;
	}
	
	public static boolean isZero(double tolerance, double value)
	{
		return Math.abs(value) <= tolerance;
	}
	
	public static boolean isZero(BigInteger tolerance, BigInteger value)
	{
		return value.abs().compareTo(tolerance) <= 0;
	}
	
	public static boolean isZero(long tolerance, long value)
	{
		return Math.abs(value) <= tolerance;
	}
	
	public static boolean isZero(int tolerance, int value)
	{
		return Math.abs(value) <= tolerance;
	}
	
	public static boolean isZero(short tolerance, short value)
	{
		return Math.abs(value) <= tolerance;
	}
	
	public static boolean isZero(byte tolerance, byte value)
	{
		return Math.abs(value) <= tolerance;
	}

	public static int compare(BigDecimal a, BigDecimal b)
	{
		return a.compareTo(b);
	}
	
	public static int compare(double a, double b)
	{
		return Double.compare(a, b);
	}

	public static int compare(float a, float b)
	{
		return Float.compare(a, b);
	}
	
	public static int compare(BigInteger a, BigInteger b)
	{
		return a.compareTo(b);
	}
	
	public static int compare(long a, long b)
	{
		return Long.compare(a, b);
	}
	
	public static int compare(int a, int b)
	{
		return Integer.compare(a, b);
	}
	
	public static int compare(short a, short b)
	{
		return Short.compare(a, b);
	}
	
	public static int compare(byte a, byte b)
	{
		return Byte.compare(a, b);
	}
	
	public static int compare(BigDecimal tolerance, BigDecimal a, BigDecimal b)
	{
		if(a.subtract(b).abs().compareTo(tolerance) <= 0) return 0;
		
		return a.compareTo(b);
	}
	
	public static int compare(double tolerance, double a, double b)
	{
		if(MathUtils.abs(a - b) <= tolerance) return 0;
		
		return Double.compare(a, b);
	}
	
	public static int compare(float tolerance, float a, float b)
	{
		if(MathUtils.abs(a - b) <= tolerance) return 0;
		
		return Float.compare(a, b);
	}
	
	public static int compare(BigInteger tolerance, BigInteger a, BigInteger b)
	{
		if(a.subtract(b).abs().compareTo(tolerance) <= 0) return 0;
		
		return a.compareTo(b);
	}
	
	public static int compare(long tolerance, long a, long b)
	{
		if(MathUtils.abs(a - b) <= tolerance) return 0;
		
		return Long.compare(a, b);
	}
	
	public static int compare(int tolerance, int a, int b)
	{
		if(MathUtils.abs(a - b) <= tolerance) return 0;
		
		return Integer.compare(a, b);
	}
	
	public static int compare(short tolerance, short a, short b)
	{
		if(MathUtils.abs(a - b) <= tolerance) return 0;
		
		return Short.compare(a, b);
	}
	
	public static int compare(byte tolerance, byte a, byte b)
	{
		if(MathUtils.abs(a - b) <= tolerance) return 0;
		
		return Byte.compare(a, b);
	}
	
	public static boolean equals(BigDecimal a, BigDecimal b)
	{
		return a.compareTo(b) == 0;
	}
	
	public static boolean equals(double a, double b)
	{
		return a == b;
	}
	
	public static boolean equals(float a, float b)
	{
		return a == b;
	}
	
	public static boolean equals(BigInteger a, BigInteger b)
	{
		return a.compareTo(b) == 0;
	}
	
	public static boolean equals(long a, long b)
	{
		return a == b;
	}
	
	public static boolean equals(int a, int b)
	{
		return a == b;
	}
	
	public static boolean equals(short a, short b)
	{
		return a == b;
	}
	
	public static boolean equals(byte a, byte b)
	{
		return a == b;
	}
	
	public static boolean equals(BigDecimal tolerance, BigDecimal a, BigDecimal b)
	{
		return a.subtract(b).abs().compareTo(tolerance) <= 0;
	}
	
	public static boolean equals(double tolerance, double a, double b)
	{
		return MathUtils.abs(a - b) <= tolerance;
	}
	
	public static boolean equals(float tolerance, float a, float b)
	{
		return MathUtils.abs(a - b) <= tolerance;
	}
	
	public static boolean equals(BigInteger tolerance, BigInteger a, BigInteger b)
	{
		return a.subtract(b).abs().compareTo(tolerance) <= 0;
	}
	
	public static boolean equals(long tolerance, long a, long b)
	{
		return MathUtils.abs(a - b) <= tolerance;
	}
	
	public static boolean equals(int tolerance, int a, int b)
	{
		return MathUtils.abs(a - b) <= tolerance;
	}
	
	public static boolean equals(short tolerance, short a, short b)
	{
		return MathUtils.abs(a - b) <= tolerance;
	}

	public static boolean equals(byte tolerance, byte a, byte b)
	{
		return MathUtils.abs(a - b) <= tolerance;
	}
	
	public static double floor(double value)
	{
		return Math.floor(value);
	}

	public static double floorF2D(float value)
	{
		return Math.floor(value);
	}

	public static float floor(float value)
	{
		return (float)Math.floor(value);
	}

	public static long floorD2L(double value)
	{
		return (long)Math.floor(value);
	}

	public static long floorF2L(float value)
	{
		return (long)Math.floor(value);
	}

	public static int floorF2I(float value)
	{
		return (int)Math.floor(value);
	}

	public static double ceil(double value)
	{
		return Math.ceil(value);
	}

	public static double ceilF2D(float value)
	{
		return Math.ceil(value);
	}

	public static float ceil(float value)
	{
		return (float)Math.ceil(value);
	}

	public static long ceilD2L(double value)
	{
		return (long)Math.ceil(value);
	}

	public static long ceilF2L(float value)
	{
		return (long)Math.ceil(value);
	}

	public static int ceilF2I(float value)
	{
		return (int)Math.ceil(value);
	}

	public static double round(double value)
	{
		return Math.round(value);
	}

	public static double roundF2D(float value)
	{
		return Math.round(value);
	}

	public static float round(float value)
	{
		return (float)Math.round(value);
	}

	public static long roundD2L(double value)
	{
		return (long)Math.round(value);
	}

	public static long roundF2L(float value)
	{
		return (long)Math.round(value);
	}

	public static int roundF2I(float value)
	{
		return (int)Math.round(value);
	}

	public static double round(double value, IRoundMethodD method)
	{
		return method.roundD(value);
	}

	public static double roundF2D(float value, IRoundMethodF method)
	{
		return method.roundF(value);
	}

	public static float round(float value, IRoundMethodF method)
	{
		return method.roundF(value);
	}
	
	public static long roundD2L(double value, IRoundMethodD method)
	{
		return (long)method.roundD(value);
	}

	public static long roundF2L(float value, IRoundMethodF method)
	{
		return (long)method.roundF(value);
	}
	
	public static int roundF2I(float value, IRoundMethodF method)
	{
		return (int)method.roundF(value);
	}
	
	public static double trunc(double value)
	{
		return (long)value;
	}
	
	public static double truncF2D(float value)
	{
		return (int)value;
	}
	
	public static float trunc(float value)
	{
		return (int)value;
	}
	
	public static long truncD2L(double value)
	{
		return (long)value;
	}

	public static long truncF2L(float value)
	{
		return (int)value;
	}

	public static int truncF2I(float value)
	{
		return (int)value;
	}

	public static double ceilEven(double value)
	{
		if(value == 0.0 || !Double.isFinite(value)) return value;
		
		double val = Math.ceil(value);
		return (((long)val & 1) == 0 ? val : val + 1);
	}

	public static double ceilEvenF2D(float value)
	{
		if(value == 0.0f || !Float.isFinite(value)) return value;
		
		double val = Math.ceil(value);
		return (((long)val & 1) == 0 ? val : val + 1);
	}
	
	public static double ceilEvenL2D(long value)
	{
		if(value == 0l) return 0.0;
		
		return ((value & 1) == 0 ? value : value + 1);
	}

	public static double ceilEvenI2D(int value)
	{
		if(value == 0) return 0.0;
		
		return ((value & 1) == 0 ? value : value + 1);
	}
	
	public static float ceilEven(float value)
	{
		if(value == 0.0f || !Float.isFinite(value)) return value;
		
		double val = Math.ceil(value);
		return (float)(((long)val & 1) == 0 ? val : val + 1);
	}
	
	public static float ceilEvenI2F(int value)
	{
		if(value == 0) return 0.0f;
		
		return (float)((value & 1) == 0 ? value : value + 1);
	}
	
	public static long ceilEvenD2L(double value)
	{
		if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0) return 0l;
		
		double val = Math.ceil(value);
		return (long)(((long)val & 1) == 0 ? val : val + 1);
	}
	
	public static long ceilEvenF2L(float value)
	{
		if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0f) return 0l;
		
		double val = Math.ceil(value);
		return (long)(((long)val & 1) == 0 ? val : val + 1);
	}
	
	public static long ceilEven(long value)
	{
		if(value == 0l) return 0l;
		
		return ((value & 1) == 0 ? value : value + 1);
	}
	
	public static long ceilEvenI2L(int value)
	{
		if(value == 0) return 0l;
		
		return ((value & 1) == 0 ? value : value + 1);
	}
	
	public static int ceilEvenF2I(float value)
	{
		if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0f) return 0;
		
		double val = Math.ceil(value);
		return (int)(((long)val & 1) == 0 ? val : val + 1);
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
	
	public static double ceilOddF2D(float value)
	{
		if(!Float.isFinite(value)) return value;
		
		double val = Math.ceil(value);
		return (((long)val & 1) == 0 ? val + 1 : val);
	}
	
	public static double ceilOddL2D(long value)
	{
		return ((value & 1) == 0 ? value + 1 : value);
	}
	
	public static double ceilOddI2D(int value)
	{
		return ((value & 1) == 0 ? value + 1 : value);
	}
	
	public static float ceilOdd(float value)
	{
		if(!Float.isFinite(value)) return value;
		
		double val = Math.ceil(value);
		return (float)(((long)val & 1) == 0 ? val + 1 : val);
	}
	
	public static float ceilOddI2F(int value)
	{
		return ((value & 1) == 0 ? value + 1: value);
	}
	
	public static long ceilOddD2L(double value)
	{
		if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		
		double val = Math.ceil(value);
		return (long)(((long)val & 1) == 0 ? val + 1 : val);
	}
	
	public static long ceilOddF2L(float value)
	{
		if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		
		double val = Math.ceil(value);
		return (long)(((long)val & 1) == 0 ? val + 1 : val);
	}
	
	public static long ceilOdd(long value)
	{
		return ((value & 1) == 0 ? value + 1 : value);
	}
	
	public static long ceilOddI2L(int value)
	{
		return ((value & 1) == 0 ? value + 1 : value);
	}
	
	public static int ceilOddF2I(float value)
	{
		if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");

		double val = Math.ceil(value);
		return (int)(((long)val & 1) == 0 ? val + 1 : val);
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
	
	public static double ceilOddZeroF2D(float value)
	{
		if(value == 0.0f || !Float.isFinite(value)) return value;
		
		double val = Math.ceil(value);
		return (((long)val & 1) == 0 ? val + 1 : val);
	}
	
	public static double ceilOddZeroL2D(long value)
	{
		if(value == 0l) return 0.0;
		
		return ((value & 1) == 0 ? value + 1 : value);
	}
	
	public static double ceilOddZeroI2D(int value)
	{
		if(value == 0l) return 0.0;
		
		return ((value & 1) == 0 ? value + 1 : value);
	}
	
	public static float ceilOddZero(float value)
	{
		if(value == 0.0f || !Float.isFinite(value)) return value;
		
		double val = Math.ceil(value);
		return (float)(((long)val & 1) == 0 ? val + 1 : val);
	}
	
	public static float ceilOddZeroI2F(int value)
	{
		if(value == 0) return 0.0f;
		
		return ((value & 1) == 0 ? value + 1 : value);
	}
	
	public static long ceilOddZeroD2L(double value)
	{
		if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0) return (long)value;
		
		double val = Math.ceil(value);
		return (long)(((long)val & 1) == 0 ? val + 1 : val);
	}
	
	public static long ceilOddZeroF2L(float value)
	{
		if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0f) return (long)value;
		
		double val = Math.ceil(value);
		return (long)(((long)val & 1) == 0 ? val + 1 : val);
	}
	
	public static long ceilOddZero(long value)
	{
		if(value == 0) return 0l;
		
		return ((value & 1) == 0 ? value + 1 : value);
	}
	
	public static long ceilOddZeroI2L(int value)
	{
		if(value == 0) return 0l;
		
		return ((value & 1) == 0 ? value + 1 : value);
	}
	
	public static int ceilOddZeroF2I(float value)
	{
		if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0f) return (int)value;
		
		double val = Math.ceil(value);
		return (int)(((long)val & 1) == 0 ? val + 1 : val);
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
	
	public static double floorEvenF2D(float value)
	{
		if(value == 0.0f || !Float.isFinite(value)) return value;
		
		double val = Math.floor(value);
		return (((long)val & 1) == 0 ? val : val - 1);
	}
	
	public static double floorEvenL2D(long value)
	{
		if(value == 0l) return 0.0;
		
		return ((value & 1) == 0 ? value : value - 1);
	}
	
	public static double floorEvenI2D(int value)
	{
		if(value == 0) return 0.0;
		
		return ((value & 1) == 0 ? value : value - 1);
	}
	
	public static float floorEven(float value)
	{
		if(value == 0.0f || !Float.isFinite(value)) return value;
		
		double val = Math.floor(value);
		return (float)(((long)val & 1) == 0 ? val : val - 1);
	}
	
	public static float floorEvenI2F(int value)
	{
		if(value == 0) return 0.0f;
		
		return ((value & 1) == 0 ? value : value - 1);
	}
	
	public static long floorEvenD2L(double value)
	{
		if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0) return 0l;
		
		double val = Math.floor(value);
		return (long)(((long)val & 1) == 0 ? val : val - 1);
	}
	
	public static long floorEvenF2L(float value)
	{
		if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0f) return 0l;
		
		double val = Math.floor(value);
		return (long)(((long)val & 1) == 0 ? val : val - 1);
	}
	
	public static long floorEven(long value)
	{
		if(value == 0l) return 0l;
		
		return ((value & 1) == 0 ? value : value - 1);
	}
	
	public static long floorEvenI2L(int value)
	{
		if(value == 0) return 0l;
		
		return ((value & 1) == 0 ? value : value - 1);
	}
	
	public static int floorEvenF2I(float value)
	{
		if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0f) return 0;
		
		double val = Math.floor(value);
		return (int)(((long)val & 1) == 0 ? val : val - 1);
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
	
	public static double floorOddF2D(float value)
	{
		if(!Float.isFinite(value)) return value;
		
		double val = Math.floor(value);
		return (((long)val & 1) == 0 ? val - 1 : val);
	}
	
	public static double floorOddL2D(long value)
	{
		return ((value & 1) == 0 ? value - 1 : value);
	}
	
	public static double floorOddI2D(int value)
	{
		return ((value & 1) == 0 ? value - 1 : value);
	}
	
	public static float floorOdd(float value)
	{
		if(!Float.isFinite(value)) return value;
		
		double val = Math.floor(value);
		return (float)(((long)val & 1) == 0 ? val - 1 : val);
	}
	
	public static float floorOddI2F(int value)
	{
		return ((value & 1) == 0 ? value - 1 : value);
	}
	
	public static long floorOddD2L(double value)
	{
		if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		
		double val = Math.floor(value);
		return (long)(((long)val & 1) == 0 ? val - 1 : val);
	}
	
	public static long floorOddF2L(float value)
	{
		if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		
		double val = Math.floor(value);
		return (long)(((long)val & 1) == 0 ? val - 1 : val);
	}
	
	public static long floorOdd(long value)
	{
		return ((value & 1) == 0 ? value - 1 : value);
	}
	
	public static long floorOddI2L(int value)
	{
		return ((value & 1) == 0 ? value - 1 : value);
	}
	
	public static int floorOddF2I(float value)
	{
		if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		
		double val = Math.floor(value);
		return (int)(((long)val & 1) == 0 ? val - 1 : val);
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
	
	public static double floorOddZeroF2D(float value)
	{
		if(value == 0.0f || !Float.isFinite(value)) return value;
		
		double val = Math.floor(value);
		return (((long)val & 1) == 0 ? val - 1 : val);
	}
	
	public static double floorOddZeroL2D(long value)
	{
		if(value == 0) return 0.0;
		
		return ((value & 1) == 0 ? value - 1 : value);
	}
	
	public static double floorOddZeroI2D(int value)
	{
		if(value == 0) return 0.0;
		
		return ((value & 1) == 0 ? value - 1 : value);
	}
	
	public static float floorOddZero(float value)
	{
		if(value == 0.0f || !Float.isFinite(value)) return value;
		
		double val = Math.floor(value);
		return (float)(((long)val & 1) == 0 ? val - 1 : val);
	}
	
	public static float floorOddZeroI2F(int value)
	{
		if(value == 0) return 0.0f;
		
		return ((value & 1) == 0 ? value - 1 : value);
	}
	
	public static long floorOddZeroD2L(double value)
	{
		if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0) return 0l;
		
		double val = Math.floor(value);
		return (long)(((long)val & 1) == 0 ? val - 1 : val);
	}
	
	public static long floorOddZeroF2L(float value)
	{
		if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0f) return 0l;
		
		double val = Math.floor(value);
		return (long)(((long)val & 1) == 0 ? val - 1 : val);
	}
	
	public static long floorOddZero(long value)
	{
		if(value == 0) return 0l;
		
		return ((value & 1) == 0 ? value - 1 : value);
	}
	
	public static long floorOddZeroI2L(int value)
	{
		if(value == 0) return 0l;
		
		return ((value & 1) == 0 ? value - 1 : value);
	}
	
	public static int floorOddZeroF2I(float value)
	{
		if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0f) return 0;
		
		double val = Math.floor(value);
		return (int)(((long)val & 1) == 0 ? val - 1 : val);
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
	
	public static double roundEvenF2D(float value)
	{
		if(value == 0.0f || !Float.isFinite(value)) return value;
		
		double mid = (long)(value * 0.5) * 2.0 + Math.signum(value);
		return (mid + (value >= mid ? 1 : -1)); 
	}
	
	public static float roundEven(float value)
	{
		if(value == 0.0 || !Float.isFinite(value)) return value;
		
		double mid = (long)(value * 0.5) * 2.0 + Math.signum(value);
		return (float)(mid + (value >= mid ? 1 : -1)); 
	}
	
	public static long roundEvenD2L(double value)
	{
		if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0) return 0l;
		
		double mid = (long)(value * 0.5) * 2.0 + Math.signum(value);
		return (long)(mid + (value >= mid ? 1 : -1)); 
	}
	
	public static long roundEvenF2L(float value)
	{
		if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0f) return 0l;
		
		double mid = (long)(value * 0.5) * 2.0 + Math.signum(value);
		return (long)(mid + (value >= mid ? 1 : -1)); 
	}
	
	public static int roundEvenF2I(float value)
	{
		if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0f) return 0;
		
		double mid = (long)(value * 0.5) * 2.0 + Math.signum(value);
		return (int)(mid + (value >= mid ? 1 : -1)); 
	}
	
	public static double roundOdd(double value)
	{
		if(!Double.isFinite(value)) return value;
		
		double mid = (long)((value + 1) * 0.5) * 2.0 - 1.0 + (value == 0.0 ? 1 : Math.signum(value));
		return (mid + (value >= mid ? 1 : -1)); 
	}
	
	public static double roundOddF2D(float value)
	{
		if(!Float.isFinite(value)) return value;
		
		double mid = (long)((value + 1) * 0.5) * 2.0 - 1.0 + (value == 0.0 ? 1 : Math.signum(value));
		return (mid + (value >= mid ? 1 : -1)); 
	}
	
	public static float roundOdd(float value)
	{
		if(!Float.isFinite(value)) return value;
		
		double mid = (long)((value + 1) * 0.5) * 2.0 - 1.0 + (value == 0.0 ? 1 : Math.signum(value));
		return (float)(mid + (value >= mid ? 1 : -1)); 
	}
	
	public static long roundOddD2L(double value)
	{
		if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		
		double mid = (long)((value + 1) * 0.5) * 2.0 - 1.0 + (value == 0.0 ? 1 : Math.signum(value));
		return (long)(mid + (value >= mid ? 1 : -1)); 
	}
	
	public static long roundOddF2L(float value)
	{
		if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		
		double mid = (long)((value + 1) * 0.5) * 2.0 - 1.0 + (value == 0.0 ? 1 : Math.signum(value));
		return (long)(mid + (value >= mid ? 1 : -1)); 
	}
	
	public static int roundOddF2I(float value)
	{
		if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		
		double mid = (long)((value + 1) * 0.5) * 2.0 - 1.0 + (value == 0.0 ? 1 : Math.signum(value));
		return (int)(mid + (value >= mid ? 1 : -1)); 
	}
	
	public static double roundOddZero(double value)
	{
		if(value == 0.0 || !Double.isFinite(value)) return value;
		
		double mid = (long)((value + 1) * 0.5) * 2.0 - 1.0 + Math.signum(value);
		return (mid + (value >= mid ? 1 : -1)); 
	}
	
	public static double roundOddZeroF2D(float value)
	{
		if(value == 0.0f || !Float.isFinite(value)) return value;
		
		double mid = (long)((value + 1) * 0.5) * 2.0 - 1.0 + Math.signum(value);
		return (mid + (value >= mid ? 1 : -1)); 
	}
	
	public static float roundOddZero(float value)
	{
		if(value == 0.0f || !Float.isFinite(value)) return value;
		
		double mid = (long)((value + 1) * 0.5) * 2.0 - 1.0 + Math.signum(value);
		return (float)(mid + (value >= mid ? 1 : -1)); 
	}
	
	public static long roundOddZeroD2L(double value)
	{
		if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0) return 0l;
		
		double mid = (long)((value + 1) * 0.5) * 2.0 - 1.0 + (value == 0.0 ? 1 : Math.signum(value));
		return (long)(mid + (value >= mid ? 1 : -1)); 
	}
	
	public static long roundOddZeroF2L(float value)
	{
		if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0f) return 0l;
		
		double mid = (long)((value + 1) * 0.5) * 2.0 - 1.0 + (value == 0.0 ? 1 : Math.signum(value));
		return (long)(mid + (value >= mid ? 1 : -1)); 
	}
	
	public static int roundOddZeroF2I(float value)
	{
		if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0f) return 0;
		
		double mid = (long)((value + 1) * 0.5) * 2.0 - 1.0 + (value == 0.0 ? 1 : Math.signum(value));
		return (int)(mid + (value >= mid ? 1 : -1)); 
	}
	
	public static double ceilMultiple(double value, double x)
	{
		if(value == 0.0) return 0;
		
		return (Math.ceil(value / x) * x);
	}
	
	public static double ceilMultipleF2D(float value, double x)
	{
		if(value == 0.0f) return 0;
		
		return (Math.ceil(value / x) * x);
	}
	
	public static double ceilMultipleL2D(long value, double x)
	{
		if(value == 0l) return 0;
		
		return (Math.ceil(value / x) * x);
	}
	
	public static double ceilMultipleI2D(int value, double x)
	{
		if(value == 0) return 0;
		
		return (Math.ceil(value / x) * x);
	}
	
	public static float ceilMultiple(float value, float x)
	{
		if(value == 0.0f) return 0.0f;
		
		return (float)(Math.ceil(value / x) * x);
	}
	
	public static float ceilMultipleI2F(int value, float x)
	{
		if(value == 0) return 0.0f;
		
		return (float)(Math.ceil(value / x) * x);
	}
	
	public static long ceilMultipleD2L(double value, long x)
	{
		if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0) return 0l;
		
		return (long)(Math.ceil(value / x) * x);
	}
	
	public static long ceilMultipleF2L(float value, long x)
	{
		if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0f) return 0l;
		
		return (long)(Math.ceil(value / x) * x);
	}
	
	public static long ceilMultiple(long value, long x)
	{
		if(value == 0l) return 0l;
		
		return (long)(Math.ceil(value / x) * x);
	}
	
	public static long ceilMultipleI2L(int value, long x)
	{
		if(value == 0) return 0l;
		
		return (long)(Math.ceil(value / x) * x);
	}
	
	public static int ceilMultipleF2I(float value, int x)
	{
		if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0f) return 0;
		
		return (int)(Math.ceil(value / x) * x);
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
	
	public static double floorMultipleF2D(float value, double x)
	{
		if(value == 0.0f) return 0.0;
		
		return (Math.floor(value / x) * x);
	}
	
	public static double floorMultipleL2D(long value, double x)
	{
		if(value == 0l) return 0.0;
		
		return (Math.floor(value / x) * x);
	}
	
	public static double floorMultipleI2D(int value, double x)
	{
		if(value == 0) return 0.0;
		
		return (Math.floor(value / x) * x);
	}
	
	public static float floorMultiple(float value, float x)
	{
		if(value == 0.0f) return 0.0f;
		
		return (float)(Math.floor(value / x) * x);
	}
	
	public static float floorMultipleI2F(int value, float x)
	{
		if(value == 0) return 0.0f;
		
		return (float)(Math.floor(value / x) * x);
	}
	
	public static long floorMultipleD2L(double value, long x)
	{
		if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0) return 0l;
		
		return (long)(Math.floor(value / x) * x);
	}
	
	public static long floorMultipleF2L(float value, long x)
	{
		if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0f) return 0l;
		
		return (long)(Math.floor(value / x) * x);
	}
	
	public static long floorMultiple(long value, long x)
	{
		if(value == 0l) return 0l;
		
		return (long)(Math.floor(value / x) * x);
	}
	
	public static long floorMultipleI2L(int value, long x)
	{
		if(value == 0) return 0l;
		
		return (long)(Math.floor(value / x) * x);
	}
	
	public static int floorMultipleF2I(float value, int x)
	{
		if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0f) return 0;
		
		return (int)(Math.floor(value / x) * x);
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
	
	public static double roundMultipleF2D(float value, double x)
	{
		if(value == 0.0f) return 0.0;
		
		return (Math.round(value / x) * x);
	}
	
	public static double roundMultipleL2D(long value, double x)
	{
		if(value == 0l) return 0.0;
		
		return (Math.round(value / x) * x);
	}
	
	public static double roundMultipleI2D(int value, double x)
	{
		if(value == 0) return 0.0;
		
		return (Math.round(value / x) * x);
	}
	
	public static float roundMultiple(float value, float x)
	{
		if(value == 0.0f) return 0.0f;
		
		return (float)(Math.round(value / x) * x);
	}
	
	public static float roundMultipleI2F(int value, float x)
	{
		if(value == 0) return 0.0f;
		
		return (float)(Math.round(value / x) * x);
	}
	
	public static long roundMultipleD2L(double value, long x)
	{
		if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0) return 0l;
		
		return (long)(Math.round(value / x) * x);
	}
	
	public static long roundMultipleF2L(float value, long x)
	{
		if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0f) return 0l;
		
		return (long)(Math.round(value / x) * x);
	}
	
	public static long roundMultiple(long value, long x)
	{
		if(value == 0l) return 0l;
		
		return (long)(Math.round(value / x) * x);
	}
	
	public static long roundMultipleI2L(int value, long x)
	{
		if(value == 0) return 0l;
		
		return (long)(Math.round(value / x) * x);
	}
	
	public static int roundMultipleF2I(float value, int x)
	{
		if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0f) return 0;
		
		return (int)(Math.round(value / x) * x);
	}
	
	public static int roundMultiple(int value, int x)
	{
		if(value == 0) return 0;
		
		return (int)(Math.round(value / x) * x);
	}
}
