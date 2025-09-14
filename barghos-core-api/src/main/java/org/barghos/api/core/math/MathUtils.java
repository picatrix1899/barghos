package org.barghos.api.core.math;

import java.math.BigDecimal;
import java.math.BigInteger;

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
	
	public static final double EM4 = 1.e-4;
	
	public static final float EM4f = 1.e-4f;
	
	public static final double EM6 = 1.e-6;
	
	public static final float EM6f = 1.e-6f;
	
	public static final double EM8 = 1.e-8;
	
	public static final float EM8f = 1.e-8f;
	
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
	
	public static double sqrt$F2D(float value)
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
	
	public static double recSqrt$F2D(float value)
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
	
	public static double invSqrt$F2D(float value)
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
	
	public static double cbrt$F2D(float value)
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
	
	public static double recCbrt$F2D(float value)
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
	
	public static double invCbrt$F2D(float value)
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
	
	public static double log$F2D(float value)
	{
		return Math.log(value);
	}

	public static double log10(double value)
	{
		return Math.log10(value);
	}

	public static double log10$F2D(float value)
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

	public static double log1p$F2D(float value)
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

	public static double exp$F2D(float value)
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

	public static double expm1$F2D(float value)
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

	public static double pow$F2D(float base, float power)
	{
		return Math.pow(base, power);
	}
	
	public static float pow(float base, float power)
	{
		return (float)Math.pow(base, power);
	}
	
	public static double fma(double a, double b, double c)
	{
		return Math.fma(a, b, c);
	}

	public static double fma$F2D(float a, float b, float c)
	{
		return Math.fma(a, b, c);
	}
	
	public static float fma(float a, float b, float c)
	{
		return Math.fma(a, b, c);
	}
	
	public static double sin(double angle)
	{
		return Math.sin(angle);
	}
	
	public static double sin$F2D(float angle)
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

	public static double cos$F2D(float angle)
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

	public static double tan$F2D(float angle)
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

	public static double asin$F2D(float value)
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
	
	public static double acos$F2D(float value)
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

	public static double atan$F2D(float value)
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

	public static double atan2$F2D(float y, float x)
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

	public static double sinh$F2D(float angle)
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

	public static double cosh$F2D(float angle)
	{
		return Math.cosh(angle);
	}
	
	public static float cosh(float angle)
	{
		return (float)Math.cosh(angle);
	}
	
	public static double tanh$F2D(float angle)
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

	public static double hypot$F2D(float x, float y)
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
	
	public static double cot$F2D(float angle)
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

	public static double sec$F2D(float angle)
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
	
	public static double csc$F2D(float angle)
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
	
	public static double frac$F2D(float value)
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
	
	public static double integer$F2D(float value)
	{
		return (int)value;
	}
	
	public static float integer(float value)
	{
		return (int)value;
	}
	
	public static long integer$D2L(double value)
	{
		return (long)value;
	}
	
	public static long integer$F2L(float value)
	{
		return (int)value;
	}
	
	public static int integer$F2I(float value)
	{
		return (int)value;
	}
	
	public static BigDecimal sign(BigDecimal value)
	{
		return BigDecimal.valueOf(value.signum());
	}
	
	public static BigDecimal sign$D2Bigd(double value)
	{
		return BigDecimal.valueOf(Math.signum(value));
	}
	
	public static BigDecimal sign$F2Bigd(float value)
	{
		return BigDecimal.valueOf(Math.signum(value));
	}
	
	public static BigDecimal sign$Bigi2Bigd(BigInteger value)
	{
		return BigDecimal.valueOf(value.signum());
	}
	
	public static BigDecimal sign$L2Bigd(long value)
	{
		return BigDecimal.valueOf(Math.signum(value));
	}
	
	public static BigDecimal sign$I2Bigd(int value)
	{
		return BigDecimal.valueOf(Math.signum(value));
	}
	
	public static BigDecimal sign$S2Bigd(short value)
	{
		return BigDecimal.valueOf(Math.signum(value));
	}
	
	public static BigDecimal sign$SB2Bigd(byte value)
	{
		return BigDecimal.valueOf(Math.signum(value));
	}
	
	public static double sign$Bigd2D(BigDecimal value)
	{
		return value.signum();
	}
	
	public static double sign(double value)
	{
		return Math.signum(value);
	}
	
	public static double sign$F2D(float value)
	{
		return Math.signum(value);
	}
	
	public static double sign$Bigi2D(BigInteger value)
	{
		return value.signum();
	}
	
	public static double sign$L2D(long value)
	{
		return Math.signum(value);
	}
	
	public static double sign$I2D(int value)
	{
		return Math.signum(value);
	}
	
	public static double sign$S2D(short value)
	{
		return Math.signum(value);
	}
	
	public static double sign$SB2D(byte value)
	{
		return Math.signum(value);
	}
	
	public static float sign$Bigd2F(BigDecimal value)
	{
		return value.signum();
	}
	
	public static float sign$D2F(double value)
	{
		return (float)Math.signum(value);
	}
	
	public static float sign(float value)
	{
		return Math.signum(value);
	}
	
	public static float sign$Bigi2F(BigInteger value)
	{
		return value.signum();
	}
	
	public static float sign$L2F(long value)
	{
		return Math.signum(value);
	}
	
	public static float sign$I2F(int value)
	{
		return Math.signum(value);
	}
	
	public static float sign$S2F(short value)
	{
		return Math.signum(value);
	}
	
	public static float sign$SB2F(byte value)
	{
		return Math.signum(value);
	}
	
	public static BigInteger sign$Bigd2Bigi(BigDecimal value)
	{
		return BigInteger.valueOf(value.signum());
	}
	
	public static BigInteger sign$D2Bigi(double value)
	{
		return BigInteger.valueOf((int)Math.signum(value));
	}
	
	public static BigInteger sign$F2Bigi(float value)
	{
		return BigInteger.valueOf((int)Math.signum(value));
	}
	
	public static BigInteger sign(BigInteger value)
	{
		return BigInteger.valueOf(value.signum());
	}
	
	public static BigInteger sign$L2Bigi(long value)
	{
		return BigInteger.valueOf((int)Math.signum(value));
	}
	
	public static BigInteger sign$I2Bigi(int value)
	{
		return BigInteger.valueOf((int)Math.signum(value));
	}
	
	public static BigInteger sign$S2Bigi(short value)
	{
		return BigInteger.valueOf((int)Math.signum(value));
	}
	
	public static BigInteger sign$SB2Bigi(byte value)
	{
		return BigInteger.valueOf((int)Math.signum(value));
	}
	
	public static long sign$Bigd2L(BigDecimal value)
	{
		return value.signum();
	}
	
	public static long sign$D2L(double value)
	{
		return (long)Math.signum(value);
	}
	
	public static long sign$F2L(float value)
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
	
	public static long sign$I2L(int value)
	{
		return(long)Math.signum(value);
	}
	
	public static long sign$S2L(short value)
	{
		return (long)Math.signum(value);
	}
	
	public static long sign$SB2L(byte value)
	{
		return (long)Math.signum(value);
	}
	
	public static int sign$Bigd2I(BigDecimal value)
	{
		return value.signum();
	}
	
	public static int sign$D2I(double value)
	{
		return (int)Math.signum(value);
	}
	
	public static int sign$F2I(float value)
	{
		return (int)Math.signum(value);
	}
	
	public static int sign$Bigi2I(BigInteger value)
	{
		return value.signum();
	}
	
	public static int sign$L2I(long value)
	{
		return (int)Math.signum(value);
	}
	
	public static int sign(int value)
	{
		return (int)Math.signum(value);
	}

	public static int sign$S2I(short value)
	{
		return (int)Math.signum(value);
	}
	
	public static int sign$SB2I(byte value)
	{
		return (int)Math.signum(value);
	}
	
	public static short sign$Bigd2S(BigDecimal value)
	{
		return (short)value.signum();
	}
	
	public static short sign$D2S(double value)
	{
		return (short)Math.signum(value);
	}
	
	public static short sign$F2S(float value)
	{
		return (short)Math.signum(value);
	}
	
	public static short sign$Bigi2S(BigInteger value)
	{
		return (short)value.signum();
	}
	
	public static short sign$L2S(long value)
	{
		return (short)Math.signum(value);
	}
	
	public static short sign$I2S(int value)
	{
		return (short)Math.signum(value);
	}

	public static short sign(short value)
	{
		return (short)Math.signum(value);
	}
	
	public static short sign$SB2S(byte value)
	{
		return (short)Math.signum(value);
	}
	
	public static byte sign$Bigd2SB(BigDecimal value)
	{
		return (byte)value.signum();
	}
	
	public static byte sign$D2SB(double value)
	{
		return (byte)Math.signum(value);
	}
	
	public static byte sign$F2SB(float value)
	{
		return (byte)Math.signum(value);
	}
	
	public static byte sign$Bigi2SB(BigInteger value)
	{
		return (byte)value.signum();
	}
	
	public static byte sign$L2SB(long value)
	{
		return (byte)Math.signum(value);
	}
	
	public static byte sign$I2SB(int value)
	{
		return (byte)Math.signum(value);
	}
	
	public static byte sign$S2SB(short value)
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
	
	public static BigDecimal abs$D2Bigd(double value)
	{
		return BigDecimal.valueOf(Math.abs(value));
	}
	
	public static BigDecimal abs$F2Bigd(float value)
	{
		return BigDecimal.valueOf(Math.abs(value));
	}
	
	public static BigDecimal abs$L2Bigd(long value)
	{
		return BigDecimal.valueOf(Math.abs(value));
	}
	
	public static BigDecimal abs$I2Bigd(int value)
	{
		return BigDecimal.valueOf(Math.abs(value));
	}
	
	public static BigDecimal abs$S2Bigd(short value)
	{
		return BigDecimal.valueOf(Math.abs(value));
	}
	
	public static BigDecimal abs$SB2Bigd(byte value)
	{
		return BigDecimal.valueOf(Math.abs(value));
	}
	
	public static double abs(double value)
	{
		return Math.abs(value);
	}

	public static double abs$F2D(float value)
	{
		return Math.abs(value);
	}
	
	public static double abs$L2D(long value)
	{
		return Math.abs(value);
	}
	
	public static double abs$I2D(int value)
	{
		return Math.abs(value);
	}
	
	public static double abs$S2D(short value)
	{
		return Math.abs(value);
	}
	
	public static double abs$SB2D(byte value)
	{
		return Math.abs(value);
	}
	
	public static float abs(float value)
	{
		return Math.abs(value);
	}

	public static float abs$I2F(int value)
	{
		return Math.abs(value);
	}
	
	public static float abs$S2F(short value)
	{
		return Math.abs(value);
	}
	
	public static float abs$SB2F(byte value)
	{
		return Math.abs(value);
	}
	
	public static BigInteger abs(BigInteger value)
	{
		return value.abs();
	}
	
	public static BigInteger abs$L2Bigi(long value)
	{
		return BigInteger.valueOf(Math.abs(value));
	}
	
	public static BigInteger abs$I2Bigi(int value)
	{
		return BigInteger.valueOf(Math.abs(value));
	}
	
	public static BigInteger abs$S2Bigi(short value)
	{
		return BigInteger.valueOf(Math.abs(value));
	}
	
	public static BigInteger abs$SB2Bigi(byte value)
	{
		return BigInteger.valueOf(Math.abs(value));
	}
	
	public static long abs(long value)
	{
		return Math.abs(value);
	}
	
	public static long abs$I2L(int value)
	{
		return Math.abs(value);
	}
	
	public static long abs$S2L(short value)
	{
		return Math.abs(value);
	}
	
	public static long abs$SB2L(byte value)
	{
		return Math.abs(value);
	}
	
	public static int abs(int value)
	{
		return Math.abs(value);
	}
	
	public static int abs$S2I(short value)
	{
		return Math.abs(value);
	}
	
	public static int abs$SB2I(byte value)
	{
		return Math.abs(value);
	}
	
	public static short abs(short value)
	{
		return (short)Math.abs(value);
	}
	
	public static short abs$SB2S(byte value)
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
	
	public static boolean isZero$EM4(double value)
	{
		return Math.abs(value) <= EM4;
	}
	
	public static boolean isZero$EM4(float value)
	{
		return Math.abs(value) <= EM4f;
	}

	public static boolean isZero$EM6(double value)
	{
		return Math.abs(value) <= EM6;
	}
	
	public static boolean isZero$EM6(float value)
	{
		return Math.abs(value) <= EM6f;
	}
	
	public static boolean isZero$EM8(double value)
	{
		return Math.abs(value) <= EM8;
	}
	
	public static boolean isZero$EM8(float value)
	{
		return Math.abs(value) <= EM8f;
	}
	
	public static boolean isZero(BigDecimal tolerance, BigDecimal value)
	{
		return value.abs().compareTo(tolerance) <= 0;
	}
	
	public static boolean isZero(double tolerance, double value)
	{
		return Math.abs(value) <= tolerance;
	}
	
	public static boolean isZero(float tolerance, float value)
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
	
	public static int compare$EM4(double a, double b)
	{
		if(MathUtils.abs(a - b) <= EM4) return 0;
		
		return Double.compare(a, b);
	}
	
	public static int compare$EM4(float a, float b)
	{
		if(MathUtils.abs(a - b) <= EM4f) return 0;
		
		return Float.compare(a, b);
	}
	
	public static int compare$EM6(double a, double b)
	{
		if(MathUtils.abs(a - b) <= EM6) return 0;
		
		return Double.compare(a, b);
	}
	
	public static int compare$EM6(float a, float b)
	{
		if(MathUtils.abs(a - b) <= EM6f) return 0;
		
		return Float.compare(a, b);
	}
	
	public static int compare$EM8(double a, double b)
	{
		if(MathUtils.abs(a - b) <= EM8) return 0;
		
		return Double.compare(a, b);
	}
	
	public static int compare$EM8(float a, float b)
	{
		if(MathUtils.abs(a - b) <= EM8f) return 0;
		
		return Float.compare(a, b);
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
	
	public static boolean equals$EM4(double a, double b)
	{
		return MathUtils.abs(a - b) <= EM4;
	}
	
	public static boolean equals$EM4(float a, float b)
	{
		return MathUtils.abs(a - b) <= EM4f;
	}
	
	public static boolean equals$EM6(double a, double b)
	{
		return MathUtils.abs(a - b) <= EM6;
	}
	
	public static boolean equals$EM6(float a, float b)
	{
		return MathUtils.abs(a - b) <= EM6f;
	}
	
	public static boolean equals$EM8(double a, double b)
	{
		return MathUtils.abs(a - b) <= EM8;
	}
	
	public static boolean equals$EM8(float a, float b)
	{
		return MathUtils.abs(a - b) <= EM8f;
	}
	
	public static double floor(double value)
	{
		return Math.floor(value);
	}

	public static double floor$F2D(float value)
	{
		return Math.floor(value);
	}

	public static float floor(float value)
	{
		return (float)Math.floor(value);
	}

	public static long floor$D2L(double value)
	{
		return (long)Math.floor(value);
	}

	public static long floor$F2L(float value)
	{
		return (long)Math.floor(value);
	}

	public static int floor$F2I(float value)
	{
		return (int)Math.floor(value);
	}

	public static double ceil(double value)
	{
		return Math.ceil(value);
	}

	public static double ceil$F2D(float value)
	{
		return Math.ceil(value);
	}

	public static float ceil(float value)
	{
		return (float)Math.ceil(value);
	}

	public static long ceil$D2L(double value)
	{
		return (long)Math.ceil(value);
	}

	public static long ceil$F2L(float value)
	{
		return (long)Math.ceil(value);
	}

	public static int ceil$F2I(float value)
	{
		return (int)Math.ceil(value);
	}

	public static double round(double value)
	{
		return Math.round(value);
	}

	public static double round$F2D(float value)
	{
		return Math.round(value);
	}

	public static float round(float value)
	{
		return (float)Math.round(value);
	}

	public static long round$D2L(double value)
	{
		return (long)Math.round(value);
	}

	public static long round$F2L(float value)
	{
		return (long)Math.round(value);
	}

	public static int round$F2I(float value)
	{
		return (int)Math.round(value);
	}

	public static double round(double value, IRoundMethodD method)
	{
		return method.roundD(value);
	}

	public static double round$F2D(float value, IRoundMethodF method)
	{
		return method.roundF(value);
	}

	public static float round(float value, IRoundMethodF method)
	{
		return method.roundF(value);
	}
	
	public static long round$D2L(double value, IRoundMethodD method)
	{
		return (long)method.roundD(value);
	}

	public static long round$F2L(float value, IRoundMethodF method)
	{
		return (long)method.roundF(value);
	}
	
	public static int round$F2I(float value, IRoundMethodF method)
	{
		return (int)method.roundF(value);
	}
	
	public static double trunc(double value)
	{
		return (long)value;
	}
	
	public static double trunc$F2D(float value)
	{
		return (int)value;
	}
	
	public static float trunc(float value)
	{
		return (int)value;
	}
	
	public static long trunc$D2L(double value)
	{
		return (long)value;
	}

	public static long trunc$F2L(float value)
	{
		return (int)value;
	}

	public static int trunc$F2I(float value)
	{
		return (int)value;
	}

	public static double ceilEven(double value)
	{
		if(value == 0.0 || !Double.isFinite(value)) return value;
		
		double val = Math.ceil(value);
		return (((long)val & 1) == 0 ? val : val + 1);
	}

	public static double ceilEven$F2D(float value)
	{
		if(value == 0.0f || !Float.isFinite(value)) return value;
		
		double val = Math.ceil(value);
		return (((long)val & 1) == 0 ? val : val + 1);
	}
	
	public static double ceilEven$L2D(long value)
	{
		if(value == 0l) return 0.0;
		
		return ((value & 1) == 0 ? value : value + 1);
	}

	public static double ceilEven$I2D(int value)
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
	
	public static float ceilEven$I2F(int value)
	{
		if(value == 0) return 0.0f;
		
		return (float)((value & 1) == 0 ? value : value + 1);
	}
	
	public static long ceilEven$D2L(double value)
	{
		if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0) return 0l;
		
		double val = Math.ceil(value);
		return (long)(((long)val & 1) == 0 ? val : val + 1);
	}
	
	public static long ceilEven$F2L(float value)
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
	
	public static long ceilEven$I2L(int value)
	{
		if(value == 0) return 0l;
		
		return ((value & 1) == 0 ? value : value + 1);
	}
	
	public static int ceilEven$F2I(float value)
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
	
	public static double ceilOdd$F2D(float value)
	{
		if(!Float.isFinite(value)) return value;
		
		double val = Math.ceil(value);
		return (((long)val & 1) == 0 ? val + 1 : val);
	}
	
	public static double ceilOdd$L2D(long value)
	{
		return ((value & 1) == 0 ? value + 1 : value);
	}
	
	public static double ceilOdd$I2D(int value)
	{
		return ((value & 1) == 0 ? value + 1 : value);
	}
	
	public static float ceilOdd(float value)
	{
		if(!Float.isFinite(value)) return value;
		
		double val = Math.ceil(value);
		return (float)(((long)val & 1) == 0 ? val + 1 : val);
	}
	
	public static float ceilOdd$I2F(int value)
	{
		return ((value & 1) == 0 ? value + 1: value);
	}
	
	public static long ceilOdd$D2L(double value)
	{
		if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		
		double val = Math.ceil(value);
		return (long)(((long)val & 1) == 0 ? val + 1 : val);
	}
	
	public static long ceilOdd$F2L(float value)
	{
		if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		
		double val = Math.ceil(value);
		return (long)(((long)val & 1) == 0 ? val + 1 : val);
	}
	
	public static long ceilOdd(long value)
	{
		return ((value & 1) == 0 ? value + 1 : value);
	}
	
	public static long ceilOdd$I2L(int value)
	{
		return ((value & 1) == 0 ? value + 1 : value);
	}
	
	public static int ceilOdd$F2I(float value)
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
	
	public static double ceilOddZero$F2D(float value)
	{
		if(value == 0.0f || !Float.isFinite(value)) return value;
		
		double val = Math.ceil(value);
		return (((long)val & 1) == 0 ? val + 1 : val);
	}
	
	public static double ceilOddZero$L2D(long value)
	{
		if(value == 0l) return 0.0;
		
		return ((value & 1) == 0 ? value + 1 : value);
	}
	
	public static double ceilOddZero$I2D(int value)
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
	
	public static float ceilOddZero$I2F(int value)
	{
		if(value == 0) return 0.0f;
		
		return ((value & 1) == 0 ? value + 1 : value);
	}
	
	public static long ceilOddZero$D2L(double value)
	{
		if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0) return (long)value;
		
		double val = Math.ceil(value);
		return (long)(((long)val & 1) == 0 ? val + 1 : val);
	}
	
	public static long ceilOddZero$F2L(float value)
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
	
	public static long ceilOddZero$I2L(int value)
	{
		if(value == 0) return 0l;
		
		return ((value & 1) == 0 ? value + 1 : value);
	}
	
	public static int ceilOddZero$F2I(float value)
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
	
	public static double floorEven$F2D(float value)
	{
		if(value == 0.0f || !Float.isFinite(value)) return value;
		
		double val = Math.floor(value);
		return (((long)val & 1) == 0 ? val : val - 1);
	}
	
	public static double floorEven$L2D(long value)
	{
		if(value == 0l) return 0.0;
		
		return ((value & 1) == 0 ? value : value - 1);
	}
	
	public static double floorEven$I2D(int value)
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
	
	public static float floorEven$I2F(int value)
	{
		if(value == 0) return 0.0f;
		
		return ((value & 1) == 0 ? value : value - 1);
	}
	
	public static long floorEven$D2L(double value)
	{
		if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0) return 0l;
		
		double val = Math.floor(value);
		return (long)(((long)val & 1) == 0 ? val : val - 1);
	}
	
	public static long floorEven$F2L(float value)
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
	
	public static long floorEven$I2L(int value)
	{
		if(value == 0) return 0l;
		
		return ((value & 1) == 0 ? value : value - 1);
	}
	
	public static int floorEven$F2I(float value)
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
	
	public static double floorOdd$F2D(float value)
	{
		if(!Float.isFinite(value)) return value;
		
		double val = Math.floor(value);
		return (((long)val & 1) == 0 ? val - 1 : val);
	}
	
	public static double floorOdd$L2D(long value)
	{
		return ((value & 1) == 0 ? value - 1 : value);
	}
	
	public static double floorOdd$I2D(int value)
	{
		return ((value & 1) == 0 ? value - 1 : value);
	}
	
	public static float floorOdd(float value)
	{
		if(!Float.isFinite(value)) return value;
		
		double val = Math.floor(value);
		return (float)(((long)val & 1) == 0 ? val - 1 : val);
	}
	
	public static float floorOdd$I2F(int value)
	{
		return ((value & 1) == 0 ? value - 1 : value);
	}
	
	public static long floorOdd$D2L(double value)
	{
		if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		
		double val = Math.floor(value);
		return (long)(((long)val & 1) == 0 ? val - 1 : val);
	}
	
	public static long floorOdd$F2L(float value)
	{
		if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		
		double val = Math.floor(value);
		return (long)(((long)val & 1) == 0 ? val - 1 : val);
	}
	
	public static long floorOdd(long value)
	{
		return ((value & 1) == 0 ? value - 1 : value);
	}
	
	public static long floorOdd$I2L(int value)
	{
		return ((value & 1) == 0 ? value - 1 : value);
	}
	
	public static int floorOdd$F2I(float value)
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
	
	public static double floorOddZero$F2D(float value)
	{
		if(value == 0.0f || !Float.isFinite(value)) return value;
		
		double val = Math.floor(value);
		return (((long)val & 1) == 0 ? val - 1 : val);
	}
	
	public static double floorOddZero$L2D(long value)
	{
		if(value == 0) return 0.0;
		
		return ((value & 1) == 0 ? value - 1 : value);
	}
	
	public static double floorOddZero$I2D(int value)
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
	
	public static float floorOddZero$I2F(int value)
	{
		if(value == 0) return 0.0f;
		
		return ((value & 1) == 0 ? value - 1 : value);
	}
	
	public static long floorOddZero$D2L(double value)
	{
		if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0) return 0l;
		
		double val = Math.floor(value);
		return (long)(((long)val & 1) == 0 ? val - 1 : val);
	}
	
	public static long floorOddZero$F2L(float value)
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
	
	public static long floorOddZero$I2L(int value)
	{
		if(value == 0) return 0l;
		
		return ((value & 1) == 0 ? value - 1 : value);
	}
	
	public static int floorOddZero$F2I(float value)
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
	
	public static double roundEven$F2D(float value)
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
	
	public static long roundEven$D2L(double value)
	{
		if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0) return 0l;
		
		double mid = (long)(value * 0.5) * 2.0 + Math.signum(value);
		return (long)(mid + (value >= mid ? 1 : -1)); 
	}
	
	public static long roundEven$F2L(float value)
	{
		if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0f) return 0l;
		
		double mid = (long)(value * 0.5) * 2.0 + Math.signum(value);
		return (long)(mid + (value >= mid ? 1 : -1)); 
	}
	
	public static int roundEven$F2I(float value)
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
	
	public static double roundOdd$F2D(float value)
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
	
	public static long roundOdd$D2L(double value)
	{
		if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		
		double mid = (long)((value + 1) * 0.5) * 2.0 - 1.0 + (value == 0.0 ? 1 : Math.signum(value));
		return (long)(mid + (value >= mid ? 1 : -1)); 
	}
	
	public static long roundOdd$F2L(float value)
	{
		if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		
		double mid = (long)((value + 1) * 0.5) * 2.0 - 1.0 + (value == 0.0 ? 1 : Math.signum(value));
		return (long)(mid + (value >= mid ? 1 : -1)); 
	}
	
	public static int roundOdd$F2I(float value)
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
	
	public static double roundOddZero$F2D(float value)
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
	
	public static long roundOddZero$D2L(double value)
	{
		if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0) return 0l;
		
		double mid = (long)((value + 1) * 0.5) * 2.0 - 1.0 + (value == 0.0 ? 1 : Math.signum(value));
		return (long)(mid + (value >= mid ? 1 : -1)); 
	}
	
	public static long roundOddZero$F2L(float value)
	{
		if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0f) return 0l;
		
		double mid = (long)((value + 1) * 0.5) * 2.0 - 1.0 + (value == 0.0 ? 1 : Math.signum(value));
		return (long)(mid + (value >= mid ? 1 : -1)); 
	}
	
	public static int roundOddZero$F2I(float value)
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
	
	public static double ceilMultiple$F2D(float value, double x)
	{
		if(value == 0.0f) return 0;
		
		return (Math.ceil(value / x) * x);
	}
	
	public static double ceilMultiple$L2D(long value, double x)
	{
		if(value == 0l) return 0;
		
		return (Math.ceil(value / x) * x);
	}
	
	public static double ceilMultiple$I2D(int value, double x)
	{
		if(value == 0) return 0;
		
		return (Math.ceil(value / x) * x);
	}
	
	public static float ceilMultiple(float value, float x)
	{
		if(value == 0.0f) return 0.0f;
		
		return (float)(Math.ceil(value / x) * x);
	}
	
	public static float ceilMultiple$I2F(int value, float x)
	{
		if(value == 0) return 0.0f;
		
		return (float)(Math.ceil(value / x) * x);
	}
	
	public static long ceilMultiple$D2L(double value, long x)
	{
		if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0) return 0l;
		
		return (long)(Math.ceil(value / x) * x);
	}
	
	public static long ceilMultiple$F2L(float value, long x)
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
	
	public static long ceilMultiple$I2L(int value, long x)
	{
		if(value == 0) return 0l;
		
		return (long)(Math.ceil(value / x) * x);
	}
	
	public static int ceilMultiple$F2I(float value, int x)
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
	
	public static double floorMultiple$F2D(float value, double x)
	{
		if(value == 0.0f) return 0.0;
		
		return (Math.floor(value / x) * x);
	}
	
	public static double floorMultiple$L2D(long value, double x)
	{
		if(value == 0l) return 0.0;
		
		return (Math.floor(value / x) * x);
	}
	
	public static double floorMultiple$I2D(int value, double x)
	{
		if(value == 0) return 0.0;
		
		return (Math.floor(value / x) * x);
	}
	
	public static float floorMultiple(float value, float x)
	{
		if(value == 0.0f) return 0.0f;
		
		return (float)(Math.floor(value / x) * x);
	}
	
	public static float floorMultiple$I2F(int value, float x)
	{
		if(value == 0) return 0.0f;
		
		return (float)(Math.floor(value / x) * x);
	}
	
	public static long floorMultiple$D2L(double value, long x)
	{
		if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0) return 0l;
		
		return (long)(Math.floor(value / x) * x);
	}
	
	public static long floorMultiple$F2L(float value, long x)
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
	
	public static long floorMultiple$I2L(int value, long x)
	{
		if(value == 0) return 0l;
		
		return (long)(Math.floor(value / x) * x);
	}
	
	public static int floorMultiple$F2I(float value, int x)
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
	
	public static double roundMultiple$F2D(float value, double x)
	{
		if(value == 0.0f) return 0.0;
		
		return (Math.round(value / x) * x);
	}
	
	public static double roundMultiple$L2D(long value, double x)
	{
		if(value == 0l) return 0.0;
		
		return (Math.round(value / x) * x);
	}
	
	public static double roundMultiple$I2D(int value, double x)
	{
		if(value == 0) return 0.0;
		
		return (Math.round(value / x) * x);
	}
	
	public static float roundMultiple(float value, float x)
	{
		if(value == 0.0f) return 0.0f;
		
		return (float)(Math.round(value / x) * x);
	}
	
	public static float roundMultiple$I2F(int value, float x)
	{
		if(value == 0) return 0.0f;
		
		return (float)(Math.round(value / x) * x);
	}
	
	public static long roundMultiple$D2L(double value, long x)
	{
		if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
		if(value == 0.0) return 0l;
		
		return (long)(Math.round(value / x) * x);
	}
	
	public static long roundMultiple$F2L(float value, long x)
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
	
	public static long roundMultiple$I2L(int value, long x)
	{
		if(value == 0) return 0l;
		
		return (long)(Math.round(value / x) * x);
	}
	
	public static int roundMultiple$F2I(float value, int x)
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
