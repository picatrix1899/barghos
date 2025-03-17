package org.barghos.util.math;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.barghos.util.BarghosUtilConfiguration;

public class MathUtils
{
	public static final MathUtilsProvider PROVIDER;
	
	static
	{
		PROVIDER = BarghosUtilConfiguration.mathUtilsProvider();
	}
	
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
	
	public static double sqrt(double value)
	{
		return PROVIDER.sqrt(value);
	}
	
	public static double sqrtF2D(float value)
	{
		return PROVIDER.sqrtF2D(value);
	}
	
	public static float sqrt(float value)
	{
		return PROVIDER.sqrt(value);
	}
	
	public static double recSqrt(double value)
	{
		return PROVIDER.recSqrt(value);
	}
	
	public static double recSqrtF2D(float value)
	{
		return PROVIDER.recSqrtF2D(value);
	}

	public static float recSqrt(float value)
	{
		return PROVIDER.recSqrt(value);
	}
	
	public static double invSqrt(double value)
	{
		return PROVIDER.invSqrt(value);
	}
	
	public static double invSqrtF2D(float value)
	{
		return PROVIDER.invSqrtF2D(value);
	}

	public static float invSqrt(float value)
	{
		return PROVIDER.invSqrt(value);
	}
	
	public static double cbrt(double value)
	{
		return PROVIDER.cbrt(value);
	}
	
	public static double cbrtF2D(float value)
	{
		return PROVIDER.cbrtF2D(value);
	}
	
	public static float cbrt(float value)
	{
		return PROVIDER.cbrt(value);
	}
	
	public static double recCbrt(double value)
	{
		return PROVIDER.recCbrt(value);
	}
	
	public static double recCbrtF2D(float value)
	{
		return PROVIDER.recCbrtF2D(value);
	}

	public static float recCbrt(float value)
	{
		return PROVIDER.recCbrt(value);
	}
	
	public static double invCbrt(double value)
	{
		return PROVIDER.invCbrt(value);
	}
	
	public static double invCbrtF2D(float value)
	{
		return PROVIDER.invCbrtF2D(value);
	}

	public static float invCbrt(float value)
	{
		return PROVIDER.invCbrt(value);
	}
	
	public static double log(double value)
	{
		return PROVIDER.log(value);
	}
	
	public static double logF2D(float value)
	{
		return PROVIDER.logF2D(value);
	}

	public static float log(float value)
	{
		return PROVIDER.log(value);
	}
	
	public static double log10(double value)
	{
		return PROVIDER.log10(value);
	}
	
	public static double log10F2D(float value)
	{
		return PROVIDER.log10F2D(value);
	}

	public static float log10(float value)
	{
		return PROVIDER.log10(value);
	}
	
	public static double log1p(double value)
	{
		return PROVIDER.log1p(value);
	}
	
	public static double log1pF2D(float value)
	{
		return PROVIDER.log1pF2D(value);
	}

	public static float log1p(float value)
	{
		return PROVIDER.log1p(value);
	}
	
	public static double exp(double value)
	{
		return PROVIDER.exp(value);
	}
	
	public static double expF2D(float value)
	{
		return PROVIDER.expF2D(value);
	}

	public static float exp(float value)
	{
		return PROVIDER.exp(value);
	}
	
	public static double expm1(double value)
	{
		return PROVIDER.expm1(value);
	}
	
	public static double expm1F2D(float value)
	{
		return PROVIDER.expm1F2D(value);
	}

	public static float expm1(float value)
	{
		return PROVIDER.expm1(value);
	}
	
	public static double pow(double base, double power)
	{
		return PROVIDER.pow(base, power);
	}
	
	public static double powF2D(float base, float power)
	{
		return PROVIDER.powF2D(base, power);
	}

	public static float pow(float base, float power)
	{
		return PROVIDER.pow(base, power);
	}
	
	public static double fma(double a, double b, double c)
	{
		return PROVIDER.fma(a, b, c);
	}
	
	public static double fmaF2D(float a, float b, float c)
	{
		return PROVIDER.fmaF2D(a, b, c);
	}
	
	public static float fma(float a, float b, float c)
	{
		return PROVIDER.fma(a, b, c);
	}
	
	public static double sin(double angle)
	{
		return PROVIDER.sin(angle);
	}
	
	public static double sinF2D(float angle)
	{
		return PROVIDER.sinF2D(angle);
	}
	
	public static float sin(float angle)
	{
		return PROVIDER.sin(angle);
	}
	
	public static double cos(double angle)
	{
		return PROVIDER.cos(angle);
	}
	
	public static double cosF2D(float angle)
	{
		return PROVIDER.cosF2D(angle);
	}
	
	public static float cos(float angle)
	{
		return PROVIDER.cos(angle);
	}
	
	public static double tan(double angle)
	{
		return PROVIDER.tan(angle);
	}
	
	public static double tanF2D(float angle)
	{
		return PROVIDER.tanF2D(angle);
	}
	
	public static float tan(float angle)
	{
		return PROVIDER.tan(angle);
	}
	
	public static double asin(double value)
	{
		return PROVIDER.asin(value);
	}
	
	public static double asinF2D(float value)
	{
		return PROVIDER.asinF2D(value);
	}
	
	public static float asin(float value)
	{
		return PROVIDER.asin(value);
	}
	
	public static double acos(double value)
	{
		return PROVIDER.acos(value);
	}
	
	public static double acosF2D(float value)
	{
		return PROVIDER.acosF2D(value);
	}
	
	public static float acos(float value)
	{
		return PROVIDER.acos(value);
	}
	
	public static double atan(double value)
	{
		return PROVIDER.atan(value);
	}
	
	public static double atanF2D(float value)
	{
		return PROVIDER.atanF2D(value);
	}
	
	public static float atan(float value)
	{
		return PROVIDER.atan(value);
	}
	
	public static double atan2(double y, double x)
	{
		return PROVIDER.atan2(y, x);
	}
	
	public static double atan2F2D(float y, float x)
	{
		return PROVIDER.atan2F2D(y, x);
	}
	
	public static float atan2(float y, float x)
	{
		return PROVIDER.atan2(y, x);
	}
	
	public static double sinh(double angle)
	{
		return PROVIDER.sinh(angle);
	}
	
	public static double sinhF2D(float angle)
	{
		return PROVIDER.sinhF2D(angle);
	}
	
	public static float sinh(float angle)
	{
		return PROVIDER.sinh(angle);
	}
	
	public static double cosh(double angle)
	{
		return PROVIDER.cosh(angle);
	}
	
	public static double coshF2D(float angle)
	{
		return PROVIDER.coshF2D(angle);
	}
	
	public static float cosh(float angle)
	{
		return PROVIDER.cosh(angle);
	}
	
	public static double tanh(double angle)
	{
		return PROVIDER.tanh(angle);
	}
	
	public static double tanhF2D(float angle)
	{
		return PROVIDER.tanhF2D(angle);
	}
	
	public static float tanh(float angle)
	{
		return PROVIDER.tanh(angle);
	}
	
	public static double hypot(double x, double y)
	{
		return PROVIDER.hypot(x, y);
	}
	
	public static double hypotF2D(float x, float y)
	{
		return PROVIDER.hypotF2D(x, y);
	}
	
	public static float hypot(float x, float y)
	{
		return PROVIDER.hypot(x, y);
	}
	
	public static double cot(double angle)
	{
		return PROVIDER.cot(angle);
	}
	
	public static double cotF2D(float angle)
	{
		return PROVIDER.cotF2D(angle);
	}
	
	public static float cot(float angle)
	{
		return PROVIDER.cot(angle);
	}
	
	public static double sec(double angle)
	{
		return PROVIDER.sec(angle);
	}
	
	public static double secF2D(float angle)
	{
		return PROVIDER.secF2D(angle);
	}
	
	public static float sec(float angle)
	{
		return PROVIDER.sec(angle);
	}
	
	public static double csc(double angle)
	{
		return PROVIDER.csc(angle);
	}
	
	public static double cscF2D(float angle)
	{
		return PROVIDER.cscF2D(angle);
	}
	
	public static float csc(float angle)
	{
		return PROVIDER.csc(angle);
	}
	
	public static double frac(double value)
	{
		return PROVIDER.frac(value);
	}
	
	public static double fracF2D(float value)
	{
		return PROVIDER.fracF2D(value);
	}
	
	public static float frac(float value)
	{
		return PROVIDER.frac(value);
	}
	
	public static double integer(double value)
	{
		return PROVIDER.integer(value);
	}
	
	public static double integerF2D(float value)
	{
		return PROVIDER.integerF2D(value);
	}
	
	public static float integer(float value)
	{
		return PROVIDER.integer(value);
	}
	
	public static long integerD2L(double value)
	{
		return PROVIDER.integerD2L(value);
	}
	
	public static long integerF2L(float value)
	{
		return PROVIDER.integerF2L(value);
	}
	
	public static int integerF2I(float value)
	{
		return PROVIDER.integerF2I(value);
	}
	
	public static BigDecimal sign(BigDecimal value)
	{
		return PROVIDER.sign(value);
	}
	
	public static BigDecimal signD2Bigd(double value)
	{
		return PROVIDER.signD2Bigd(value);
	}
	
	public static BigDecimal signF2Bigd(float value)
	{
		return PROVIDER.signF2Bigd(value);
	}
	
	public static BigDecimal signBigi2Bigd(BigInteger value)
	{
		return PROVIDER.signBigi2Bigd(value);
	}
	
	public static BigDecimal signL2Bigd(long value)
	{
		return PROVIDER.signL2Bigd(value);
	}
	
	public static BigDecimal signI2Bigd(int value)
	{
		return PROVIDER.signI2Bigd(value);
	}
	
	public static BigDecimal signS2Bigd(short value)
	{
		return PROVIDER.signS2Bigd(value);
	}
	
	public static BigDecimal signSB2Bigd(byte value)
	{
		return PROVIDER.signSB2Bigd(value);
	}
	
	public static double signBigd2D(BigDecimal value)
	{
		return PROVIDER.signBigd2D(value);
	}
	
	public static double sign(double value)
	{
		return PROVIDER.sign(value);
	}
	
	public static double signF2D(float value)
	{
		return PROVIDER.signF2D(value);
	}
	
	public static double signBigi2D(BigInteger value)
	{
		return PROVIDER.signBigi2D(value);
	}
	
	public static double signL2D(long value)
	{
		return PROVIDER.signL2D(value);
	}
	
	public static double signI2D(int value)
	{
		return PROVIDER.signI2D(value);
	}
	
	public static double signS2D(short value)
	{
		return PROVIDER.signS2D(value);
	}
	
	public static double signSB2D(byte value)
	{
		return PROVIDER.signSB2D(value);
	}
	
	public static float signBigd2F(BigDecimal value)
	{
		return PROVIDER.signBigd2F(value);
	}
	
	public static float signD2F(double value)
	{
		return PROVIDER.signD2F(value);
	}
	
	public static float sign(float value)
	{
		return PROVIDER.sign(value);
	}
	
	public static float signBigi2F(BigInteger value)
	{
		return PROVIDER.signBigi2F(value);
	}
	
	public static float signL2F(long value)
	{
		return PROVIDER.signL2F(value);
	}
	
	public static float signI2F(int value)
	{
		return PROVIDER.signI2F(value);
	}
	
	public static float signS2F(short value)
	{
		return PROVIDER.signS2F(value);
	}
	
	public static float signSB2F(byte value)
	{
		return PROVIDER.signSB2F(value);
	}
	
	public static BigInteger signBigd2Bigi(BigDecimal value)
	{
		return PROVIDER.signBigd2Bigi(value);
	}
	
	public static BigInteger signD2Bigi(double value)
	{
		return PROVIDER.signD2Bigi(value);
	}
	
	public static BigInteger signF2Bigi(float value)
	{
		return PROVIDER.signF2Bigi(value);
	}
	
	public static BigInteger sign(BigInteger value)
	{
		return PROVIDER.sign(value);
	}
	
	public static BigInteger signL2Bigi(long value)
	{
		return PROVIDER.signL2Bigi(value);
	}
	
	public static BigInteger signI2Bigi(int value)
	{
		return PROVIDER.signI2Bigi(value);
	}
	
	public static BigInteger signS2Bigi(short value)
	{
		return PROVIDER.signS2Bigi(value);
	}
	
	public static BigInteger signSB2Bigi(byte value)
	{
		return PROVIDER.signSB2Bigi(value);
	}
	
	public static long signBigd2L(BigDecimal value)
	{
		return PROVIDER.signBigd2L(value);
	}
	
	public static long signF2L(float value)
	{
		return PROVIDER.signF2L(value);
	}
	
	public static long signBigi2L(BigInteger value)
	{
		return PROVIDER.signBigi2L(value);
	}
	
	public static long sign(long value)
	{
		return PROVIDER.sign(value);
	}
	
	public static long signI2L(int value)
	{
		return PROVIDER.signI2L(value);
	}
	
	public static long signS2L(short value)
	{
		return PROVIDER.signS2L(value);
	}
	
	public static long signSB2L(byte value)
	{
		return PROVIDER.signSB2L(value);
	}
	
	public static int signBigd2I(BigDecimal value)
	{
		return PROVIDER.signBigd2I(value);
	}
	
	public static int signD2I(double value)
	{
		return PROVIDER.signD2I(value);
	}
	
	public static int signF2I(float value)
	{
		return PROVIDER.signF2I(value);
	}
	
	public static int signBigi2I(BigInteger value)
	{
		return PROVIDER.signBigi2I(value);
	}
	
	public static int signL2I(long value)
	{
		return PROVIDER.signL2I(value);
	}
	
	public static int sign(int value)
	{
		return PROVIDER.sign(value);
	}
	
	public static int signS2I(short value)
	{
		return PROVIDER.signS2I(value);
	}
	
	public static int signSB2I(byte value)
	{
		return PROVIDER.signSB2I(value);
	}
	
	public static short signBigd2S(BigDecimal value)
	{
		return PROVIDER.signBigd2S(value);
	}
	
	public static short signD2S(double value)
	{
		return PROVIDER.signD2S(value);
	}
	
	public static short signF2S(float value)
	{
		return PROVIDER.signF2S(value);
	}
	
	public static short signBigi2S(BigInteger value)
	{
		return PROVIDER.signBigi2S(value);
	}
	
	public static short signL2S(long value)
	{
		return PROVIDER.signL2S(value);
	}
	
	public static short signI2S(int value)
	{
		return PROVIDER.signI2S(value);
	}
	
	public static short sign(short value)
	{
		return PROVIDER.sign(value);
	}
	
	public static short signSB2S(byte value)
	{
		return PROVIDER.signSB2S(value);
	}
	
	public static byte signBigd2SB(BigDecimal value)
	{
		return PROVIDER.signBigd2SB(value);
	}
	
	public static byte signD2SB(double value)
	{
		return PROVIDER.signD2SB(value);
	}
	
	public static byte signF2SB(float value)
	{
		return PROVIDER.signF2SB(value);
	}
	
	public static byte signBigi2SB(BigInteger value)
	{
		return PROVIDER.signBigi2SB(value);
	}
	
	public static byte signL2SB(long value)
	{
		return PROVIDER.signL2SB(value);
	}
	
	public static byte signI2SB(int value)
	{
		return PROVIDER.signI2SB(value);
	}
	
	public static byte signS2SB(short value)
	{
		return PROVIDER.signS2SB(value);
	}
	
	public static byte sign(byte value)
	{
		return PROVIDER.sign(value);
	}
	
	public static BigDecimal abs(BigDecimal value)
	{
		return PROVIDER.abs(value);
	}
	
	public static BigDecimal absD2Bigd(double value)
	{
		return PROVIDER.absD2Bigd(value);
	}
	
	public static BigDecimal absF2Bigd(float value)
	{
		return PROVIDER.absF2Bigd(value);
	}
	
	public static BigDecimal absL2Bigd(long value)
	{
		return PROVIDER.absL2Bigd(value);
	}
	
	public static BigDecimal absI2Bigd(int value)
	{
		return PROVIDER.absI2Bigd(value);
	}
	
	public static BigDecimal absS2Bigd(short value)
	{
		return PROVIDER.absS2Bigd(value);
	}
	
	public static BigDecimal absSB2Bigd(byte value)
	{
		return PROVIDER.absSB2Bigd(value);
	}
	
	public static double abs(double value)
	{
		return PROVIDER.abs(value);
	}
	
	public static double absF2D(float value)
	{
		return PROVIDER.absF2D(value);
	}

	public static double absL2D(long value)
	{
		return PROVIDER.absL2D(value);
	}
	
	public static double absI2D(int value)
	{
		return PROVIDER.absI2D(value);
	}
	
	public static double absS2D(short value)
	{
		return PROVIDER.absS2D(value);
	}
	
	public static double absSB2D(byte value)
	{
		return PROVIDER.absSB2D(value);
	}
	
	public static float abs(float value)
	{
		return PROVIDER.abs(value);
	}

	public static float absI2F(int value)
	{
		return PROVIDER.absI2F(value);
	}
	
	public static float absS2F(short value)
	{
		return PROVIDER.absS2F(value);
	}
	
	public static float absSB2F(byte value)
	{
		return PROVIDER.absSB2F(value);
	}
	
	public static BigInteger abs(BigInteger value)
	{
		return PROVIDER.abs(value);
	}
	
	public static BigInteger absL2Bigi(long value)
	{
		return PROVIDER.absL2Bigi(value);
	}
	
	public static BigInteger absI2Bigi(int value)
	{
		return PROVIDER.absI2Bigi(value);
	}
	
	public static BigInteger absS2Bigi(short value)
	{
		return PROVIDER.absS2Bigi(value);
	}
	
	public static BigInteger absSB2Bigi(byte value)
	{
		return PROVIDER.absSB2Bigi(value);
	}
	
	public static long abs(long value)
	{
		return PROVIDER.abs(value);
	}
	
	public static long absI2L(int value)
	{
		return PROVIDER.absI2L(value);
	}
	
	public static long absS2L(short value)
	{
		return PROVIDER.absS2L(value);
	}
	
	public static long absSB2L(byte value)
	{
		return PROVIDER.absSB2L(value);
	}
	
	public static int abs(int value)
	{
		return PROVIDER.abs(value);
	}
	
	public static int absS2I(short value)
	{
		return PROVIDER.absS2I(value);
	}
	
	public static int absSB2I(byte value)
	{
		return PROVIDER.absSB2I(value);
	}
	
	public static short abs(short value)
	{
		return PROVIDER.abs(value);
	}
	
	public static short absSB2S(byte value)
	{
		return PROVIDER.absSB2S(value);
	}
	
	public static byte abs(byte value)
	{
		return PROVIDER.abs(value);
	}
	
	public static BigDecimal min(BigDecimal value1, BigDecimal value2)
	{
		return PROVIDER.min(value1, value2);
	}
	
	public static BigDecimal min(BigDecimal value1, BigDecimal value2, BigDecimal value3)
	{
		return PROVIDER.min(value1, value2, value3);
	}
	
	public static BigDecimal min(BigDecimal value1, BigDecimal value2, BigDecimal value3, BigDecimal value4)
	{
		return PROVIDER.min(value1, value2, value3, value4);
	}
	
	public static BigDecimal min(BigDecimal value1, BigDecimal value2, BigDecimal value3, BigDecimal value4, BigDecimal value5)
	{
		return PROVIDER.min(value1, value2, value3, value4, value5);
	}
	
	public static BigDecimal min(BigDecimal... values)
	{
		return PROVIDER.min(values);
	}
	
	public static double min(double value1, double value2)
	{
		return PROVIDER.min(value1, value2);
	}
	
	public static double min(double value1, double value2, double value3)
	{
		return PROVIDER.min(value1, value2, value3);
	}
	
	public static double min(double value1, double value2, double value3, double value4)
	{
		return PROVIDER.min(value1, value2, value3, value4);
	}
	
	public static double min(double value1, double value2, double value3, double value4, double value5)
	{
		return PROVIDER.min(value1, value2, value3, value4, value5);
	}
	
	public static double min(double... values)
	{
		return PROVIDER.min(values);
	}
	
	public static float min(float value1, float value2)
	{
		return PROVIDER.min(value1, value2);
	}
	
	public static float min(float value1, float value2, float value3)
	{
		return PROVIDER.min(value1, value2, value3);
	}
	
	public static float min(float value1, float value2, float value3, float value4)
	{
		return PROVIDER.min(value1, value2, value3, value4);
	}
	
	public static float min(float value1, float value2, float value3, float value4, float value5)
	{
		return PROVIDER.min(value1, value2, value3, value4, value5);
	}
	
	public static float min(float... values)
	{
		return PROVIDER.min(values);
	}
	
	public static BigInteger min(BigInteger value1, BigInteger value2)
	{
		return PROVIDER.min(value1, value2);
	}
	
	public static BigInteger min(BigInteger value1, BigInteger value2, BigInteger value3)
	{
		return PROVIDER.min(value1, value2, value3);
	}
	
	public static BigInteger min(BigInteger value1, BigInteger value2, BigInteger value3, BigInteger value4)
	{
		return PROVIDER.min(value1, value2, value3, value4);
	}
	
	public static BigInteger min(BigInteger value1, BigInteger value2, BigInteger value3, BigInteger value4, BigInteger value5)
	{
		return PROVIDER.min(value1, value2, value3, value4, value5);
	}
	
	public static BigInteger min(BigInteger... values)
	{
		return PROVIDER.min(values);
	}
	
	public static long min(long value1, long value2)
	{
		return PROVIDER.min(value1, value2);
	}
	
	public static long min(long value1, long value2, long value3)
	{
		return PROVIDER.min(value1, value2, value3);
	}
	
	public static long min(long value1, long value2, long value3, long value4)
	{
		return PROVIDER.min(value1, value2, value3, value4);
	}
	
	public static long min(long value1, long value2, long value3, long value4, long value5)
	{
		return PROVIDER.min(value1, value2, value3, value4, value5);
	}
	
	public static long min(long... values)
	{
		return PROVIDER.min(values);
	}
	
	public static int min(int value1, int value2)
	{
		return PROVIDER.min(value1, value2);
	}
	
	public static int min(int value1, int value2, int value3)
	{
		return PROVIDER.min(value1, value2, value3);
	}
	
	public static int min(int value1, int value2, int value3, int value4)
	{
		return PROVIDER.min(value1, value2, value3, value4);
	}
	
	public static int min(int value1, int value2, int value3, int value4, int value5)
	{
		return PROVIDER.min(value1, value2, value3, value4, value5);
	}
	
	public static int min(int... values)
	{
		return PROVIDER.min(values);
	}
	
	public static short min(short value1, short value2)
	{
		return PROVIDER.min(value1, value2);
	}
	
	public static short min(short value1, short value2, short value3)
	{
		return PROVIDER.min(value1, value2, value3);
	}
	
	public static short min(short value1, short value2, short value3, short value4)
	{
		return PROVIDER.min(value1, value2, value3, value4);
	}
	
	public static short min(short value1, short value2, short value3, short value4, short value5)
	{
		return PROVIDER.min(value1, value2, value3, value4, value5);
	}
	
	public static short min(short... values)
	{
		return PROVIDER.min(values);
	}
	
	public static byte min(byte value1, byte value2)
	{
		return PROVIDER.min(value1, value2);
	}
	
	public static byte min(byte value1, byte value2, byte value3)
	{
		return PROVIDER.min(value1, value2, value3);
	}
	
	public static byte min(byte value1, byte value2, byte value3, byte value4)
	{
		return PROVIDER.min(value1, value2, value3, value4);
	}
	
	public static byte min(byte value1, byte value2, byte value3, byte value4, byte value5)
	{
		return PROVIDER.min(value1, value2, value3, value4, value5);
	}
	
	public static byte min(byte... values)
	{
		return PROVIDER.min(values);
	}
	
	public static BigDecimal max(BigDecimal value1, BigDecimal value2)
	{
		return PROVIDER.max(value1, value2);
	}
	
	public static BigDecimal max(BigDecimal value1, BigDecimal value2, BigDecimal value3)
	{
		return PROVIDER.max(value1, value2, value3);
	}
	
	public static BigDecimal max(BigDecimal value1, BigDecimal value2, BigDecimal value3, BigDecimal value4)
	{
		return PROVIDER.max(value1, value2, value3, value4);
	}
	
	public static BigDecimal max(BigDecimal value1, BigDecimal value2, BigDecimal value3, BigDecimal value4, BigDecimal value5)
	{
		return PROVIDER.max(value1, value2, value3, value4, value5);
	}
	
	public static BigDecimal max(BigDecimal... values)
	{
		return PROVIDER.max(values);
	}
	
	public static double max(double value1, double value2)
	{
		return PROVIDER.max(value1, value2);
	}
	
	public static double max(double value1, double value2, double value3)
	{
		return PROVIDER.max(value1, value2, value3);
	}
	
	public static double max(double value1, double value2, double value3, double value4)
	{
		return PROVIDER.max(value1, value2, value3, value4);
	}
	
	public static double max(double value1, double value2, double value3, double value4, double value5)
	{
		return PROVIDER.max(value1, value2, value3, value4, value5);
	}
	
	public static double max(double... values)
	{
		return PROVIDER.max(values);
	}
	
	public static float max(float value1, float value2)
	{
		return PROVIDER.max(value1, value2);
	}
	
	public static float max(float value1, float value2, float value3)
	{
		return PROVIDER.max(value1, value2, value3);
	}
	
	public static float max(float value1, float value2, float value3, float value4)
	{
		return PROVIDER.max(value1, value2, value3, value4);
	}
	
	public static float max(float value1, float value2, float value3, float value4, float value5)
	{
		return PROVIDER.max(value1, value2, value3, value4, value5);
	}
	
	public static float max(float... values)
	{
		return PROVIDER.max(values);
	}
	
	public static BigInteger max(BigInteger value1, BigInteger value2)
	{
		return PROVIDER.max(value1, value2);
	}
	
	public static BigInteger max(BigInteger value1, BigInteger value2, BigInteger value3)
	{
		return PROVIDER.max(value1, value2, value3);
	}
	
	public static BigInteger max(BigInteger value1, BigInteger value2, BigInteger value3, BigInteger value4)
	{
		return PROVIDER.max(value1, value2, value3, value4);
	}
	
	public static BigInteger max(BigInteger value1, BigInteger value2, BigInteger value3, BigInteger value4, BigInteger value5)
	{
		return PROVIDER.max(value1, value2, value3, value4, value5);
	}
	
	public static BigInteger max(BigInteger... values)
	{
		return PROVIDER.max(values);
	}
	
	public static long max(long value1, long value2)
	{
		return PROVIDER.max(value1, value2);
	}
	
	public static long max(long value1, long value2, long value3)
	{
		return PROVIDER.max(value1, value2, value3);
	}
	
	public static long max(long value1, long value2, long value3, long value4)
	{
		return PROVIDER.max(value1, value2, value3, value4);
	}
	
	public static long max(long value1, long value2, long value3, long value4, long value5)
	{
		return PROVIDER.max(value1, value2, value3, value4, value5);
	}
	
	public static long max(long... values)
	{
		return PROVIDER.max(values);
	}
	
	public static int max(int value1, int value2)
	{
		return PROVIDER.max(value1, value2);
	}
	
	public static int max(int value1, int value2, int value3)
	{
		return PROVIDER.max(value1, value2, value3);
	}
	
	public static int max(int value1, int value2, int value3, int value4)
	{
		return PROVIDER.max(value1, value2, value3, value4);
	}
	
	public static int max(int value1, int value2, int value3, int value4, int value5)
	{
		return PROVIDER.max(value1, value2, value3, value4, value5);
	}
	
	public static int max(int... values)
	{
		return PROVIDER.max(values);
	}
	
	public static short max(short value1, short value2)
	{
		return PROVIDER.max(value1, value2);
	}
	
	public static short max(short value1, short value2, short value3)
	{
		return PROVIDER.max(value1, value2, value3);
	}
	
	public static short max(short value1, short value2, short value3, short value4)
	{
		return PROVIDER.max(value1, value2, value3, value4);
	}
	
	public static short max(short value1, short value2, short value3, short value4, short value5)
	{
		return PROVIDER.max(value1, value2, value3, value4, value5);
	}
	
	public static short max(short... values)
	{
		return PROVIDER.max(values);
	}
	
	public static byte max(byte value1, byte value2)
	{
		return PROVIDER.max(value1, value2);
	}
	
	public static byte max(byte value1, byte value2, byte value3)
	{
		return PROVIDER.max(value1, value2, value3);
	}
	
	public static byte max(byte value1, byte value2, byte value3, byte value4)
	{
		return PROVIDER.max(value1, value2, value3, value4);
	}
	
	public static byte max(byte value1, byte value2, byte value3, byte value4, byte value5)
	{
		return PROVIDER.max(value1, value2, value3, value4, value5);
	}
	
	public static byte max(byte... values)
	{
		return PROVIDER.max(values);
	}
	
	public static BigDecimal clampMin(BigDecimal value, BigDecimal min)
	{
		return PROVIDER.clampMin(value, min);
	}
	
	public static double clampMin(double value, double min)
	{
		return PROVIDER.clampMin(value, min);
	}
	
	public static float clampMin(float value, float min)
	{
		return PROVIDER.clampMin(value, min);
	}
	
	public static BigInteger clampMin(BigInteger value, BigInteger min)
	{
		return PROVIDER.clampMin(value, min);
	}
	
	public static long clampMin(long value, long min)
	{
		return PROVIDER.clampMin(value, min);
	}
	
	public static int clampMin(int value, int min)
	{
		return PROVIDER.clampMin(value, min);
	}
	
	public static short clampMin(short value, short min)
	{
		return PROVIDER.clampMin(value, min);
	}
	
	public static byte clampMinSB(byte value, byte min)
	{
		return PROVIDER.clampMinSB(value, min);
	}
	
	public static byte clampMinUB(byte value, byte min)
	{
		return PROVIDER.clampMinUB(value, min);
	}
	
	public static BigDecimal clampMin(BigDecimal tolerance, BigDecimal value, BigDecimal min)
	{
		return PROVIDER.clampMin(tolerance, value, min);
	}
	
	public static double clampMin(double tolerance, double value, double min)
	{
		return PROVIDER.clampMin(tolerance, value, min);
	}
	
	public static float clampMin(float tolerance, float value, float min)
	{
		return PROVIDER.clampMin(tolerance, value, min);
	}
	
	public static BigInteger clampMin(BigInteger tolerance, BigInteger value, BigInteger min)
	{
		return PROVIDER.clampMin(tolerance, value, min);
	}
	
	public static long clampMin(long tolerance, long value, long min)
	{
		return PROVIDER.clampMin(tolerance, value, min);
	}
	
	public static int clampMin(int tolerance, int value, int min)
	{
		return PROVIDER.clampMin(tolerance, value, min);
	}
	
	public static short clampMin(short tolerance, short value, short min)
	{
		return PROVIDER.clampMin(tolerance, value, min);
	}
	
	public static byte clampMinSB(byte tolerance, byte value, byte min)
	{
		return PROVIDER.clampMinSB(tolerance, value, min);
	}
	
	public static byte clampMinUB(byte tolerance, byte value, byte min)
	{
		return PROVIDER.clampMinUB(tolerance, value, min);
	}
	
	public static BigDecimal clampMax(BigDecimal value, BigDecimal max)
	{
		return PROVIDER.clampMax(value, max);
	}
	
	public static double clampMax(double value, double max)
	{
		return PROVIDER.clampMax(value, max);
	}
	
	public static float clampMax(float value, float max)
	{
		return PROVIDER.clampMax(value, max);
	}
	
	public static BigInteger clampMax(BigInteger value, BigInteger max)
	{
		return PROVIDER.clampMax(value, max);
	}
	
	public static long clampMax(long value, long max)
	{
		return PROVIDER.clampMax(value, max);
	}
	
	public static int clampMax(int value, int max)
	{
		return PROVIDER.clampMax(value, max);
	}
	
	public static short clampMax(short value, short max)
	{
		return PROVIDER.clampMax(value, max);
	}
	
	public static byte clampMaxSB(byte value, byte max)
	{
		return PROVIDER.clampMaxSB(value, max);
	}
	
	public static byte clampMaxUB(byte value, byte max)
	{
		return PROVIDER.clampMaxUB(value, max);
	}
	
	public static BigDecimal clampMax(BigDecimal tolerance, BigDecimal value, BigDecimal max)
	{
		return PROVIDER.clampMax(tolerance, value, max);
	}
	
	public static double clampMax(double tolerance, double value, double max)
	{
		return PROVIDER.clampMax(tolerance, value, max);
	}
	
	public static float clampMax(float tolerance, float value, float max)
	{
		return PROVIDER.clampMax(tolerance, value, max);
	}
	
	public static BigInteger clampMax(BigInteger tolerance, BigInteger value, BigInteger max)
	{
		return PROVIDER.clampMax(tolerance, value, max);
	}
	
	public static long clampMax(long tolerance, long value, long max)
	{
		return PROVIDER.clampMax(tolerance, value, max);
	}
	
	public static int clampMax(int tolerance, int value, int max)
	{
		return PROVIDER.clampMax(tolerance, value, max);
	}
	
	public static short clampMax(short tolerance, short value, short max)
	{
		return PROVIDER.clampMax(tolerance, value, max);
	}
	
	public static byte clampMaxSB(byte tolerance, byte value, byte max)
	{
		return PROVIDER.clampMaxSB(tolerance, value, max);
	}
	
	public static byte clampMaxUB(byte tolerance, byte value, byte max)
	{
		return PROVIDER.clampMaxUB(tolerance, value, max);
	}
	
	public static BigDecimal clamp(BigDecimal value, BigDecimal min, BigDecimal max)
	{
		return PROVIDER.clamp(value, min, max);
	}
	
	public static double clamp(double value, double min, double max)
	{
		return PROVIDER.clamp(value, min, max);
	}
	
	public static float clamp(float value, float min, float max)
	{
		return PROVIDER.clamp(value, min, max);
	}
	
	public static BigInteger clamp(BigInteger value, BigInteger min, BigInteger max)
	{
		return PROVIDER.clamp(value, min, max);
	}
	
	public static long clamp(long value, long min, long max)
	{
		return PROVIDER.clamp(value, min, max);
	}
	
	public static int clamp(int value, int min, int max)
	{
		return PROVIDER.clamp(value, min, max);
	}
	
	public static short clamp(short value, short min, short max)
	{
		return PROVIDER.clamp(value, min, max);
	}
	
	public static byte clampSB(byte value, byte min, byte max)
	{
		return PROVIDER.clampSB(value, min, max);
	}
	
	public static byte clampUB(byte value, byte min, byte max)
	{
		return PROVIDER.clampUB(value, min, max);
	}
	
	public static BigDecimal clamp(BigDecimal tolerance, BigDecimal value, BigDecimal min, BigDecimal max)
	{
		return PROVIDER.clamp(tolerance, value, min, max);
	}
	
	public static double clamp(double tolerance, double value, double min, double max)
	{
		return PROVIDER.clamp(tolerance, value, min, max);
	}
	
	public static float clamp(float tolerance, float value, float min, float max)
	{
		return PROVIDER.clamp(tolerance, value, min, max);
	}
	
	public static BigInteger clamp(BigInteger tolerance, BigInteger value, BigInteger min, BigInteger max)
	{
		return PROVIDER.clamp(tolerance, value, min, max);
	}
	
	public static long clamp(long tolerance, long value, long min, long max)
	{
		return PROVIDER.clamp(tolerance, value, min, max);
	}
	
	public static int clamp(int tolerance, int value, int min, int max)
	{
		return PROVIDER.clamp(tolerance, value, min, max);
	}
	
	public static short clamp(short tolerance, short value, short min, short max)
	{
		return PROVIDER.clamp(tolerance, value, min, max);
	}
	
	public static byte clampSB(byte tolerance, byte value, byte min, byte max)
	{
		return PROVIDER.clampSB(tolerance, value, min, max);
	}
	
	public static byte clampUB(byte tolerance, byte value, byte min, byte max)
	{
		return PROVIDER.clampUB(tolerance, value, min, max);
	}
	
	public static BigDecimal clamp(BigDecimal toleranceMin, BigDecimal toleranceMax, BigDecimal value, BigDecimal min, BigDecimal max)
	{
		return PROVIDER.clamp(toleranceMin, toleranceMax, value, min, max);
	}
	
	public static double clamp(double toleranceMin, double toleranceMax, double value, double min, double max)
	{
		return PROVIDER.clamp(toleranceMin, toleranceMax, value, min, max);
	}
	
	public static float clamp(float toleranceMin, float toleranceMax, float value, float min, float max)
	{
		return PROVIDER.clamp(toleranceMin, toleranceMax, value, min, max);
	}
	
	public static BigInteger clamp(BigInteger toleranceMin, BigInteger toleranceMax, BigInteger value, BigInteger min, BigInteger max)
	{
		return PROVIDER.clamp(toleranceMin, toleranceMax, value, min, max);
	}
	
	public static long clamp(long toleranceMin, long toleranceMax, long value, long min, long max)
	{
		return PROVIDER.clamp(toleranceMin, toleranceMax, value, min, max);
	}
	
	public static int clamp(int toleranceMin, int toleranceMax, int value, int min, int max)
	{
		return PROVIDER.clamp(toleranceMin, toleranceMax, value, min, max);
	}
	
	public static short clamp(short toleranceMin, short toleranceMax, short value, short min, short max)
	{
		return PROVIDER.clamp(toleranceMin, toleranceMax, value, min, max);
	}
	
	public static byte clampSB(byte toleranceMin, byte toleranceMax, byte value, byte min, byte max)
	{
		return PROVIDER.clampSB(toleranceMin, toleranceMax, value, min, max);
	}
	
	public static byte clampUB(byte toleranceMin, byte toleranceMax, byte value, byte min, byte max)
	{
		return PROVIDER.clampUB(toleranceMin, toleranceMax, value, min, max);
	}
	
	public static class Lerp
	{
		public static final MathUtilsProvider.LerpProvider PROVIDER;
		
		static
		{
			PROVIDER = BarghosUtilConfiguration.lerpMathUtilsProvider();
		}
		
		public static double lerp(double alpha, double a, double b)
		{
			return PROVIDER.lerp(alpha, a, b);
		}
		
		public static float lerp(double alpha, float a, float b)
		{
			return PROVIDER.lerp(alpha, a, b);
		}

		public static double quadricBezier(double alpha, double a, double b, double c)
		{
			return PROVIDER.quadricBezier(alpha, a, b, c);
		}
		
		public static float quadricBezier(double alpha, float a, float b, float c)
		{
			return PROVIDER.quadricBezier(alpha, a, b, c);
		}
		
		public static double cubicBezier(double alpha, double a, double b, double c, double d)
		{
			return PROVIDER.cubicBezier(alpha, a, b, c, d);
		}
		
		public static float cubicBezier(double alpha, float a, float b, float c, float d)
		{
			return PROVIDER.cubicBezier(alpha, a, b, c, d);
		}
		
		public static double bicubicBezier(double alpha, double a, double b, double c, double d, double e)
		{
			return PROVIDER.bicubicBezier(alpha, a, b, c, d, e);
		}
		
		public static float bicubicBezier(double alpha, float a, float b, float c, float d, float e)
		{
			return PROVIDER.bicubicBezier(alpha, a, b, c, d, e);
		}
		
		public static double step(double alpha, double midpoint, double a, double b)
		{
			return PROVIDER.step(alpha, midpoint, a, b);
		}
		
		public static float step(double alpha, double midpoint, float a, float b)
		{
			return PROVIDER.step(alpha, midpoint, a, b);
		}
		
		public static double smoothstep(double alpha, double a, double b)
		{
			return PROVIDER.smoothstep(alpha, a, b);
		}
		
		public static float smoothstep(double alpha, float a, float b)
		{
			return PROVIDER.smoothstep(alpha, a, b);
		}
		
		public static double smootherstep(double alpha, double a, double b)
		{
			return PROVIDER.smootherstep(alpha, a, b);
		}
		
		public static float smootherstep(double alpha, float a, float b)
		{
			return PROVIDER.smootherstep(alpha, a, b);
		}
		
		public static double intLerp(double alpha, double v)
		{
			return PROVIDER.intLerp(alpha, v);
		}
		
		public static float intLerp(double alpha, float v)
		{
			return PROVIDER.intLerp(alpha, v);
		}
		
		public static double intLerp(double alpha, double a, double b)
		{
			return PROVIDER.intLerp(alpha, a, b);
		}
		
		public static float intLerp(double alpha, float a, float b)
		{
			return PROVIDER.intLerp(alpha, a, b);
		}
	}
	
	public class Comp
	{
		public static final MathUtilsProvider.CompareProvider PROVIDER;
		
		static
		{
			PROVIDER = BarghosUtilConfiguration.compareMathUtilsProvider();
		}
		
		public static boolean isZero(BigDecimal value)
		{
			return PROVIDER.isZero(value);
		}
		
		public static boolean isZero(double value)
		{
			return PROVIDER.isZero(value);
		}

		public static boolean isZero(float value)
		{
			return PROVIDER.isZero(value);
		}

		public static boolean isZero(BigInteger value)
		{
			return PROVIDER.isZero(value);
		}
		
		public static boolean isZero(long value)
		{
			return PROVIDER.isZero(value);
		} 
		
		public static boolean isZero(int value)
		{
			return PROVIDER.isZero(value);
		} 
		
		public static boolean isZero(short value)
		{
			return PROVIDER.isZero(value);
		} 
		
		public static boolean isZero(byte value)
		{
			return PROVIDER.isZero(value);
		} 
		
		public static boolean isZero(BigDecimal tolerance, BigDecimal value)
		{
			return PROVIDER.isZero(tolerance, value);
		}
		
		public static boolean isZero(float tolerance, float value)
		{
			return PROVIDER.isZero(tolerance, value);
		}

		public static boolean isZero(double tolerance, double value)
		{
			return PROVIDER.isZero(tolerance, value);
		}

		public static boolean isZero(BigInteger tolerance, BigInteger value)
		{
			return PROVIDER.isZero(tolerance, value);
		}
		
		public static boolean isZero(long tolerance, long value)
		{
			return PROVIDER.isZero(tolerance, value);
		}
		
		public static boolean isZero(int tolerance, int value)
		{
			return PROVIDER.isZero(tolerance, value);
		}
		
		public static boolean isZero(short tolerance, short value)
		{
			return PROVIDER.isZero(tolerance, value);
		}
		
		public static boolean isZero(byte tolerance, byte value)
		{
			return PROVIDER.isZero(tolerance, value);
		}
		
		public static int compare(BigDecimal a, BigDecimal b)
		{
			return PROVIDER.compare(a, b);
		}
		
		public static int compare(double a, double b)
		{
			return PROVIDER.compare(a, b);
		}

		public static int compare(float a, float b)
		{
			return PROVIDER.compare(a, b);
		}
		
		public static int compare(BigInteger a, BigInteger b)
		{
			return PROVIDER.compare(a, b);
		}
		
		public static int compare(long a, long b)
		{
			return PROVIDER.compare(a, b);
		}
		
		public static int compare(int a, int b)
		{
			return PROVIDER.compare(a, b);
		}
		
		public static int compare(short a, short b)
		{
			return PROVIDER.compare(a, b);
		}
		
		public static int compare(byte a, byte b)
		{
			return PROVIDER.compare(a, b);
		}
		
		public static int compare(BigDecimal tolerance, BigDecimal a, BigDecimal b)
		{
			return PROVIDER.compare(tolerance, a, b);
		}
		
		public static int compare(double tolerance, double a, double b)
		{
			return PROVIDER.compare(tolerance, a, b);
		}

		public static int compare(float tolerance, float a, float b)
		{
			return PROVIDER.compare(tolerance, a, b);
		}
		
		public static int compare(BigInteger tolerance, BigInteger a, BigInteger b)
		{
			return PROVIDER.compare(tolerance, a, b);
		}
		
		public static int compare(long tolerance, long a, long b)
		{
			return PROVIDER.compare(tolerance, a, b);
		}
		
		public static int compare(int tolerance, int a, int b)
		{
			return PROVIDER.compare(tolerance, a, b);
		}
		
		public static int compare(short tolerance, short a, short b)
		{
			return PROVIDER.compare(tolerance, a, b);
		}
		
		public static int compare(byte tolerance, byte a, byte b)
		{
			return PROVIDER.compare(tolerance, a, b);
		}
		
		public static boolean equals(BigDecimal a, BigDecimal b)
		{
			return PROVIDER.equals(a, b);
		}
		
		public static boolean equals(double a, double b)
		{
			return PROVIDER.equals(a, b);
		}
		
		public static boolean equals(float a, float b)
		{
			return PROVIDER.equals(a, b);
		}
		
		public static boolean equals(BigInteger a, BigInteger b)
		{
			return PROVIDER.equals(a, b);
		}
		
		public static boolean equals(long a, long b)
		{
			return PROVIDER.equals(a, b);
		}
		
		public static boolean equals(int a, int b)
		{
			return PROVIDER.equals(a, b);
		}
		
		public static boolean equals(short a, short b)
		{
			return PROVIDER.equals(a, b);
		}
		
		public static boolean equals(byte a, byte b)
		{
			return PROVIDER.equals(a, b);
		}
		
		public static boolean equals(BigDecimal tolerance, BigDecimal a, BigDecimal b)
		{
			return PROVIDER.equals(tolerance, a, b);
		}
		
		public static boolean equals(double tolerance, double a, double b)
		{
			return PROVIDER.equals(tolerance, a, b);
		}
		
		public static boolean equals(float tolerance, float a, float b)
		{
			return PROVIDER.equals(tolerance, a, b);
		}
		
		public static boolean equals(BigInteger tolerance, BigInteger a, BigInteger b)
		{
			return PROVIDER.equals(tolerance, a, b);
		}
		
		public static boolean equals(long tolerance, long a, long b)
		{
			return PROVIDER.equals(tolerance, a, b);
		}
		
		public static boolean equals(int tolerance, int a, int b)
		{
			return PROVIDER.equals(tolerance, a, b);
		}
		
		public static boolean equals(short tolerance, short a, short b)
		{
			return PROVIDER.equals(tolerance, a, b);
		}
		
		public static boolean equals(byte tolerance, byte a, byte b)
		{
			return PROVIDER.equals(tolerance, a, b);
		}
	}
	
	public class Round
	{
		public static final MathUtilsProvider.RoundProvider PROVIDER;
		
		static
		{
			PROVIDER = BarghosUtilConfiguration.roundMathUtilsProvider();
		}
		
		public static double floor(double value)
		{
			return PROVIDER.floor(value);
		}
		
		public static double floorF2D(float value)
		{
			return PROVIDER.floorF2D(value);
		}
		
		public static float floor(float value)
		{
			return PROVIDER.floor(value);
		}
		
		public static long floorD2L(double value)
		{
			return PROVIDER.floorD2L(value);
		}
		
		public static long floorF2L(float value)
		{
			return PROVIDER.floorF2L(value);
		}
		
		public static int floorF2I(float value)
		{
			return PROVIDER.floorF2I(value);
		}
		
		public static double ceil(double value)
		{
			return PROVIDER.ceil(value);
		}
		
		public static double ceilF2D(float value)
		{
			return PROVIDER.ceilF2D(value);
		}
		
		public static float ceil(float value)
		{
			return PROVIDER.ceil(value);
		}
		
		public static long ceilD2L(double value)
		{
			return PROVIDER.ceilD2L(value);
		}
		
		public static long ceilF2L(float value)
		{
			return PROVIDER.ceilF2L(value);
		}
		
		public static int ceilF2I(float value)
		{
			return PROVIDER.ceilF2I(value);
		}
		
		public static double round(double value)
		{
			return PROVIDER.round(value);
		}
		
		public static double roundF2D(float value)
		{
			return PROVIDER.roundF2D(value);
		}
		
		public static float round(float value)
		{
			return PROVIDER.round(value);
		}
		
		public static long roundD2L(double value)
		{
			return PROVIDER.roundD2L(value);
		}
		
		public static long roundF2L(float value)
		{
			return PROVIDER.roundF2L(value);
		}
		
		public static int roundF2I(float value)
		{
			return PROVIDER.roundF2I(value);
		}
		
		public static double round(double value, RoundMethodD method)
		{
			return PROVIDER.round(value);
		}
		
		public static double roundF2D(float value, RoundMethodF method)
		{
			return PROVIDER.roundF2D(value);
		}
		
		public static float round(float value, RoundMethodF method)
		{
			return PROVIDER.round(value);
		}
		
		public static long roundD2L(double value, RoundMethodD method)
		{
			return PROVIDER.roundD2L(value);
		}
		
		public static long roundF2L(float value, RoundMethodF method)
		{
			return PROVIDER.roundF2L(value);
		}
		
		public static int roundF2I(float value, RoundMethodF method)
		{
			return PROVIDER.roundF2I(value);
		}
		
		public static double trunc(double value)
		{
			return PROVIDER.trunc(value);
		}
		
		public static double truncF2D(float value)
		{
			return PROVIDER.truncF2D(value);
		}
		
		public static float trunc(float value)
		{
			return PROVIDER.trunc(value);
		}
		
		public static long truncD2L(double value)
		{
			return PROVIDER.truncD2L(value);
		}
		
		public static long truncF2L(float value)
		{
			return PROVIDER.truncF2L(value);
		}
		
		public static int truncF2I(float value)
		{
			return PROVIDER.truncF2I(value);
		}
		
		public static double ceilEven(double value)
		{
			return PROVIDER.ceilEven(value);
		}
		
		public static double ceilEvenF2D(float value)
		{
			return PROVIDER.ceilEvenF2D(value);
		}
		
		public static double ceilEvenL2D(long value)
		{
			return PROVIDER.ceilEvenL2D(value);
		}
		
		public static double ceilEvenI2D(int value)
		{
			return PROVIDER.ceilEvenI2D(value);
		}
		
		public static float ceilEven(float value)
		{
			return PROVIDER.ceilEven(value);
		}
		
		public static float ceilEvenI2F(int value)
		{
			return PROVIDER.ceilEvenI2F(value);
		}
		
		public static long ceilEvenD2L(double value)
		{
			return PROVIDER.ceilEvenD2L(value);
		}
		
		public static long ceilEvenF2L(float value)
		{
			return PROVIDER.ceilEvenF2L(value);
		}
		
		public static long ceilEven(long value)
		{
			return PROVIDER.ceilEven(value);
		}
		
		public static long ceilEvenI2L(int value)
		{
			return PROVIDER.ceilEvenI2L(value);
		}
		
		public static int ceilEvenF2I(float value)
		{
			return PROVIDER.ceilEvenF2I(value);
		}
		
		public static int ceilEven(int value)
		{
			return PROVIDER.ceilEven(value);
		}
		
		public static double ceilOdd(double value)
		{
			return PROVIDER.ceilOdd(value);
		}
		
		public static double ceilOddF2D(float value)
		{
			return PROVIDER.ceilOddF2D(value);
		}
		
		public static double ceilOddL2D(long value)
		{
			return PROVIDER.ceilOddL2D(value);
		}
		
		public static double ceilOddI2D(int value)
		{
			return PROVIDER.ceilOddI2D(value);
		}
		
		public static float ceilOdd(float value)
		{
			return PROVIDER.ceilOdd(value);
		}
		
		public static float ceilOddI2F(int value)
		{
			return PROVIDER.ceilOddI2F(value);
		}
		
		public static long ceilOddD2L(double value)
		{
			return PROVIDER.ceilOddD2L(value);
		}
		
		public static long ceilOddF2L(float value)
		{
			return PROVIDER.ceilOddF2L(value);
		}
		
		public static long ceilOdd(long value)
		{
			return PROVIDER.ceilOdd(value);
		}
		
		public static long ceilOddI2L(int value)
		{
			return PROVIDER.ceilOddI2L(value);
		}
		
		public static int ceilOddF2I(float value)
		{
			return PROVIDER.ceilOddF2I(value);
		}
		
		public static int ceilOdd(int value)
		{
			return PROVIDER.ceilOdd(value);
		}
		
		public static double ceilOddZero(double value)
		{
			return PROVIDER.ceilOddZero(value);
		}
		
		public static double ceilOddZeroF2D(float value)
		{
			return PROVIDER.ceilOddZeroF2D(value);
		}
		
		public static double ceilOddZeroL2D(long value)
		{
			return PROVIDER.ceilOddZeroL2D(value);
		}
		
		public static double ceilOddZeroI2D(int value)
		{
			return PROVIDER.ceilOddZeroI2D(value);
		}
		
		public static float ceilOddZero(float value)
		{
			return PROVIDER.ceilOddZero(value);
		}
		
		public static float ceilOddZeroI2F(int value)
		{
			return PROVIDER.ceilOddZeroI2F(value);
		}
		
		public static long ceilOddZeroD2L(double value)
		{
			return PROVIDER.ceilOddZeroD2L(value);
		}
		
		public static long ceilOddZeroF2L(float value)
		{
			return PROVIDER.ceilOddZeroF2L(value);
		}
		
		public static long ceilOddZero(long value)
		{
			return PROVIDER.ceilOddZero(value);
		}
		
		public static long ceilOddZeroI2L(int value)
		{
			return PROVIDER.ceilOddZeroI2L(value);
		}
		
		public static int ceilOddZeroF2I(float value)
		{
			return PROVIDER.ceilOddZeroF2I(value);
		}
		
		public static int ceilOddZero(int value)
		{
			return PROVIDER.ceilOddZero(value);
		}
		
		public static double floorEven(double value)
		{
			return PROVIDER.floorEven(value);
		}
		
		public static double floorEvenF2D(float value)
		{
			return PROVIDER.floorEvenF2D(value);
		}
		
		public static double floorEvenL2D(long value)
		{
			return PROVIDER.floorEvenL2D(value);
		}
		
		public static double floorEvenI2D(int value)
		{
			return PROVIDER.floorEvenI2D(value);
		}
		
		public static float floorEven(float value)
		{
			return PROVIDER.floorEven(value);
		}
		
		public static float floorEvenI2F(int value)
		{
			return PROVIDER.floorEvenI2F(value);
		}
		
		public static long floorEvenD2L(double value)
		{
			return PROVIDER.floorEvenD2L(value);
		}
		
		public static long floorEvenF2L(float value)
		{
			return PROVIDER.floorEvenF2L(value);
		}
		
		public static long floorEven(long value)
		{
			return PROVIDER.floorEven(value);
		}
		
		public static long floorEvenI2L(int value)
		{
			return PROVIDER.floorEvenI2L(value);
		}
		
		public static int floorEvenF2I(float value)
		{
			return PROVIDER.floorEvenF2I(value);
		}
		
		public static int floorEven(int value)
		{
			return PROVIDER.floorEven(value);
		}
		
		public static double floorOdd(double value)
		{
			return PROVIDER.floorOdd(value);
		}
		
		public static double floorOddF2D(float value)
		{
			return PROVIDER.floorOddF2D(value);
		}
		
		public static double floorOddL2D(long value)
		{
			return PROVIDER.floorOddL2D(value);
		}
		
		public static double floorOddI2D(int value)
		{
			return PROVIDER.floorOddI2D(value);
		}
		
		public static float floorOdd(float value)
		{
			return PROVIDER.floorOdd(value);
		}
		
		public static float floorOddI2F(int value)
		{
			return PROVIDER.floorOddI2F(value);
		}
		
		public static long floorOddD2L(double value)
		{
			return PROVIDER.floorOddD2L(value);
		}
		
		public static long floorOddF2L(float value)
		{
			return PROVIDER.floorOddF2L(value);
		}
		
		public static long floorOdd(long value)
		{
			return PROVIDER.floorOdd(value);
		}
		
		public static long floorOddI2L(int value)
		{
			return PROVIDER.floorOddI2L(value);
		}
		
		public static int floorOddF2I(float value)
		{
			return PROVIDER.floorOddF2I(value);
		}
		
		public static int floorOdd(int value)
		{
			return PROVIDER.floorOdd(value);
		}
		
		public static double floorOddZero(double value)
		{
			return PROVIDER.floorOddZero(value);
		}
		
		public static double floorOddZeroF2D(float value)
		{
			return PROVIDER.floorOddZeroF2D(value);
		}
		
		public static double floorOddZeroL2D(long value)
		{
			return PROVIDER.floorOddZeroL2D(value);
		}
		
		public static double floorOddZeroI2D(int value)
		{
			return PROVIDER.floorOddZeroI2D(value);
		}
		
		public static float floorOddZero(float value)
		{
			return PROVIDER.floorOddZero(value);
		}
		
		public static float floorOddZeroI2F(int value)
		{
			return PROVIDER.floorOddZeroI2F(value);
		}
		
		public static long floorOddZeroD2L(double value)
		{
			return PROVIDER.floorOddZeroD2L(value);
		}
		
		public static long floorOddZeroF2L(float value)
		{
			return PROVIDER.floorOddZeroF2L(value);
		}
		
		public static long floorOddZero(long value)
		{
			return PROVIDER.floorOddZero(value);
		}
		
		public static long floorOddZeroI2L(int value)
		{
			return PROVIDER.floorOddZeroI2L(value);
		}
		
		public static int floorOddZeroF2I(float value)
		{
			return PROVIDER.floorOddZeroF2I(value);
		}
		
		public static int floorOddZero(int value)
		{
			return PROVIDER.floorOddZero(value);
		}
		
		public static double roundEven(double value)
		{
			return PROVIDER.roundEven(value);
		}
		
		public static double roundEvenF2D(float value)
		{
			return PROVIDER.roundEvenF2D(value);
		}
		
		public static float roundEven(float value)
		{
			return PROVIDER.roundEven(value);
		}
		
		public static long roundEvenD2L(double value)
		{
			return PROVIDER.roundEvenD2L(value);
		}
		
		public static long roundEvenF2L(float value)
		{
			return PROVIDER.roundEvenF2L(value);
		}
		
		public static int roundEvenF2I(float value)
		{
			return PROVIDER.roundEvenF2I(value);
		}
		
		public static double roundOdd(double value)
		{
			return PROVIDER.roundOdd(value);
		}
		
		public static double roundOddF2D(float value)
		{
			return PROVIDER.roundOddF2D(value);
		}
		
		public static float roundOdd(float value)
		{
			return PROVIDER.roundOdd(value);
		}
		
		public static long roundOddD2L(double value)
		{
			return PROVIDER.roundOddD2L(value);
		}
		
		public static long roundOddF2L(float value)
		{
			return PROVIDER.roundOddF2L(value);
		}
		
		public static int roundOddF2I(float value)
		{
			return PROVIDER.roundOddF2I(value);
		}
		
		public static double roundOddZero(double value)
		{
			return PROVIDER.roundOddZero(value);
		}
		
		public static double roundOddZeroF2D(float value)
		{
			return PROVIDER.roundOddZeroF2D(value);
		}
		
		public static float roundOddZero(float value)
		{
			return PROVIDER.roundOddZero(value);
		}
		
		public static long roundOddZeroD2L(double value)
		{
			return PROVIDER.roundOddZeroD2L(value);
		}
		
		public static long roundOddZeroF2L(float value)
		{
			return PROVIDER.roundOddZeroF2L(value);
		}
		
		public static int roundOddZeroF2I(float value)
		{
			return PROVIDER.roundOddZeroF2I(value);
		}
		
		public static double ceilMultiple(double value, double x)
		{
			return PROVIDER.ceilMultiple(value, x);
		}
		
		public static double ceilMultipleF2D(float value, double x)
		{
			return PROVIDER.ceilMultipleF2D(value, x);
		}
		
		public static double ceilMultipleL2D(long value, double x)
		{
			return PROVIDER.ceilMultipleL2D(value, x);
		}
		
		public static double ceilMultipleI2D(int value, double x)
		{
			return PROVIDER.ceilMultipleI2D(value, x);
		}
		
		public static float ceilMultiple(float value, float x)
		{
			return PROVIDER.ceilMultiple(value, x);
		}
		
		public static float ceilMultipleI2F(int value, float x)
		{
			return PROVIDER.ceilMultipleI2F(value, x);
		}
		
		public static long ceilMultipleD2L(double value, long x)
		{
			return PROVIDER.ceilMultipleD2L(value, x);
		}
		
		public static long ceilMultipleF2L(float value, long x)
		{
			return PROVIDER.ceilMultipleF2L(value, x);
		}
		
		public static long ceilMultiple(long value, long x)
		{
			return PROVIDER.ceilMultiple(value, x);
		}
		
		public static long ceilMultipleI2L(int value, long x)
		{
			return PROVIDER.ceilMultipleI2L(value, x);
		}
		
		public static int ceilMultipleF2I(float value, int x)
		{
			return PROVIDER.ceilMultipleF2I(value, x);
		}
		
		public static int ceilMultiple(int value, int x)
		{
			return PROVIDER.ceilMultiple(value, x);
		}
		
		public static double floorMultiple(double value, double x)
		{
			return PROVIDER.floorMultiple(value, x);
		}
		
		public static double floorMultipleF2D(float value, double x)
		{
			return PROVIDER.floorMultipleF2D(value, x);
		}
		
		public static double floorMultipleL2D(long value, double x)
		{
			return PROVIDER.floorMultipleL2D(value, x);
		}
		
		public static double floorMultipleI2D(int value, double x)
		{
			return PROVIDER.floorMultipleI2D(value, x);
		}
		
		public static float floorMultiple(float value, float x)
		{
			return PROVIDER.floorMultiple(value, x);
		}
		
		public static float floorMultipleI2F(int value, float x)
		{
			return PROVIDER.floorMultipleI2F(value, x);
		}
		
		public static long floorMultipleD2L(double value, long x)
		{
			return PROVIDER.floorMultipleD2L(value, x);
		}
		
		public static long floorMultipleF2L(float value, long x)
		{
			return PROVIDER.floorMultipleF2L(value, x);
		}
		
		public static long floorMultiple(long value, long x)
		{
			return PROVIDER.floorMultiple(value, x);
		}
		
		public static long floorMultipleI2L(int value, long x)
		{
			return PROVIDER.floorMultipleI2L(value, x);
		}
		
		public static int floorMultipleF2I(float value, int x)
		{
			return PROVIDER.floorMultipleF2I(value, x);
		}
		
		public static int floorMultiple(int value, int x)
		{
			return PROVIDER.floorMultiple(value, x);
		}
		
		public static double roundMultiple(double value, double x)
		{
			return PROVIDER.roundMultiple(value, x);
		}
		
		public static double roundMultipleF2D(float value, double x)
		{
			return PROVIDER.roundMultipleF2D(value, x);
		}
		
		public static double roundMultipleL2D(long value, double x)
		{
			return PROVIDER.roundMultipleL2D(value, x);
		}
		
		public static double roundMultipleI2D(int value, double x)
		{
			return PROVIDER.roundMultipleI2D(value, x);
		}
		
		public static float roundMultiple(float value, float x)
		{
			return PROVIDER.roundMultiple(value, x);
		}
		
		public static float roundMultipleI2F(int value, float x)
		{
			return PROVIDER.roundMultipleI2F(value, x);
		}
		
		public static long roundMultipleD2L(double value, long x)
		{
			return PROVIDER.roundMultipleD2L(value, x);
		}
		
		public static long roundMultipleF2L(float value, long x)
		{
			return PROVIDER.roundMultipleF2L(value, x);
		}
		
		public static long roundMultiple(long value, long x)
		{
			return PROVIDER.roundMultiple(value, x);
		}
		
		public static long roundMultipleI2L(int value, long x)
		{
			return PROVIDER.roundMultipleI2L(value, x);
		}
		
		public static int roundMultipleF2I(float value, int x)
		{
			return PROVIDER.roundMultipleF2I(value, x);
		}
		
		public static int roundMultiple(int value, int x)
		{
			return PROVIDER.roundMultiple(value, x);
		}
	}
}
