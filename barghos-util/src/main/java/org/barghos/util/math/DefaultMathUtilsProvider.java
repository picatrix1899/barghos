package org.barghos.util.math;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.barghos.util.BarghosUtilConfiguration;

public class DefaultMathUtilsProvider implements MathUtilsProvider
{
	public double sqrt(double value)
	{
		return Math.sqrt(value);
	}

	public double sqrtF2D(float value)
	{
		return Math.sqrt(value);
	}
	
	public float sqrt(float value)
	{
		return (float)Math.sqrt(value);
	}

	public double recSqrt(double value)
	{
		return 1.0 / Math.sqrt(value);
	}

	public double recSqrtF2D(float value)
	{
		return 1.0 / Math.sqrt(value);
	}
	
	public float recSqrt(float value)
	{
		return (float)(1.0 / Math.sqrt(value));
	}
	
	public double invSqrt(double value)
	{
		return 1.0 / Math.sqrt(value);
	}

	public double invSqrtF2D(float value)
	{
		return 1.0 / Math.sqrt(value);
	}
	
	public float invSqrt(float value)
	{
		return (float)(1.0 / Math.sqrt(value));
	}

	public double cbrt(double value)
	{
		return Math.cbrt(value);
	}

	public double cbrtF2D(float value)
	{
		return Math.cbrt(value);
	}
	
	public float cbrt(float value)
	{
		return (float)Math.cbrt(value);
	}
	
	public double recCbrt(double value)
	{
		return 1.0 / Math.cbrt(value);
	}

	public double recCbrtF2D(float value)
	{
		return 1.0 / Math.cbrt(value);
	}
	
	public float recCbrt(float value)
	{
		return (float)(1.0 / Math.cbrt(value));
	}
	
	public double invCbrt(double value)
	{
		return 1.0 / Math.cbrt(value);
	}

	public double invCbrtF2D(float value)
	{
		return 1.0 / Math.cbrt(value);
	}
	
	public float invCbrt(float value)
	{
		return (float)(1.0 / Math.sqrt(value));
	}
	
	public double log(double value)
	{
		return Math.log(value);
	}

	public double logF2D(float value)
	{
		return Math.log(value);
	}
	
	public float log(float value)
	{
		return (float)Math.log(value);
	}
	
	public double log10(double value)
	{
		return Math.log10(value);
	}

	public double log10F2D(float value)
	{
		return Math.log10(value);
	}
	
	public float log10(float value)
	{
		return (float)Math.log10(value);
	}
	
	public double log1p(double value)
	{
		return Math.log1p(value);
	}

	public double log1pF2D(float value)
	{
		return Math.log1p(value);
	}
	
	public float log1p(float value)
	{
		return (float)Math.log1p(value);
	}
	
	public double exp(double value)
	{
		return Math.exp(value);
	}

	public double expF2D(float value)
	{
		return Math.exp(value);
	}
	
	public float exp(float value)
	{
		return (float)Math.exp(value);
	}
	
	public double expm1(double value)
	{
		return Math.expm1(value);
	}

	public double expm1F2D(float value)
	{
		return Math.expm1(value);
	}
	
	public float expm1(float value)
	{
		return (float)Math.expm1(value);
	}
	
	public double pow(double base, double power)
	{
		return Math.pow(base, power);
	}

	public double powF2D(float base, float power)
	{
		return Math.pow(base, power);
	}
	
	public float pow(float base, float power)
	{
		return (float)Math.pow(base, power);
	}
	
	public double fma(double a, double b, double c)
	{
		if(BarghosUtilConfiguration.useFMA())
			return Math.fma(a, b, c);
		
		return a * b + c;
	}

	public double fmaF2D(float a, float b, float c)
	{
		if(BarghosUtilConfiguration.useFMA())
			return Math.fma(a, b, c);
		
		return a * b + c;
	}
	
	public float fma(float a, float b, float c)
	{
		if(BarghosUtilConfiguration.useFMA())
			return Math.fma(a, b, c);
		
		return a * b + c;
	}
	
	@Override
	public double sin(double angle)
	{
		return Math.sin(angle);
	}
	
	@Override
	public double sinF2D(float angle)
	{
		return Math.sin(angle);
	}
	
	@Override
	public float sin(float angle)
	{
		return (float)Math.sin(angle);
	}

	@Override
	public double cos(double angle)
	{
		return Math.cos(angle);
	}

	@Override
	public double cosF2D(float angle)
	{
		return Math.cos(angle);
	}
	
	@Override
	public float cos(float angle)
	{
		return (float)Math.cos(angle);
	}

	@Override
	public double tan(double angle)
	{
		return Math.tan(angle);
	}

	@Override
	public double tanF2D(float angle)
	{
		return Math.tan(angle);
	}
	
	@Override
	public float tan(float angle)
	{
		return (float)Math.tan(angle);
	}
	
	@Override
	public double asin(double value)
	{
		return Math.asin(value);
	}

	@Override
	public double asinF2D(float value)
	{
		return Math.asin(value);
	}
	
	@Override
	public float asin(float value)
	{
		return (float)Math.asin(value);
	}
	
	@Override
	public double acos(double value)
	{
		return Math.acos(value);
	}

	@Override
	public double acosF2D(float value)
	{
		return Math.acos(value);
	}
	
	@Override
	public float acos(float value)
	{
		return (float)Math.acos(value);
	}
	
	@Override
	public double atan(double value)
	{
		return Math.atan(value);
	}

	@Override
	public double atanF2D(float value)
	{
		return Math.atan(value);
	}
	
	@Override
	public float atan(float value)
	{
		return (float)Math.atan(value);
	}
	
	@Override
	public double atan2(double y, double x)
	{
		return Math.atan2(y, x);
	}

	@Override
	public double atan2F2D(float y, float x)
	{
		return Math.atan2(y, x);
	}
	
	@Override
	public float atan2(float y, float x)
	{
		return (float)Math.atan2(y, x);
	}
	
	@Override
	public double sinh(double angle)
	{
		return Math.sinh(angle);
	}

	@Override
	public double sinhF2D(float angle)
	{
		return Math.sinh(angle);
	}
	
	@Override
	public float sinh(float angle)
	{
		return (float)Math.sinh(angle);
	}
	
	@Override
	public double cosh(double angle)
	{
		return Math.cosh(angle);
	}

	@Override
	public double coshF2D(float angle)
	{
		return Math.cosh(angle);
	}
	
	@Override
	public float cosh(float angle)
	{
		return (float)Math.cosh(angle);
	}
	
	@Override
	public double tanhF2D(float angle)
	{
		return Math.tanh(angle);
	}

	@Override
	public double tanh(double angle)
	{
		return Math.tanh(angle);
	}
	
	@Override
	public float tanh(float angle)
	{
		return (float)Math.tanh(angle);
	}
	
	@Override
	public double hypot(double x, double y)
	{
		return Math.hypot(x, y);
	}

	@Override
	public double hypotF2D(float x, float y)
	{
		return Math.hypot(x, y);
	}
	
	@Override
	public float hypot(float x, float y)
	{
		return (float)Math.hypot(x, y);
	}
	
	@Override
	public double cot(double angle)
	{
		return  1.0 / Math.tan(angle);
	}

	@Override
	public double cotF2D(float angle)
	{
		return 1.0 / Math.tan(angle);
	}
	
	@Override
	public float cot(float angle)
	{
		return (float)(1.0 / Math.tan(angle));
	}
	
	@Override
	public double sec(double angle)
	{
		return 1.0 / Math.cos(angle);
	}

	@Override
	public double secF2D(float angle)
	{
		return 1.0 / Math.cos(angle);
	}
	
	@Override
	public float sec(float angle)
	{
		return (float)(1.0 / Math.cos(angle));
	}
	
	@Override
	public double csc(double angle)
	{
		return 1.0 / Math.sin(angle);
	}

	@Override
	public double cscF2D(float angle)
	{
		return 1.0 / Math.sin(angle);
	}
	
	@Override
	public float csc(float angle)
	{
		return (float)(1.0 / Math.sin(angle));
	}
	
	@Override
	public double frac(double value)
	{
		return value - (long)value;
	}
	
	@Override
	public double fracF2D(float value)
	{
		return value - (int)value;
	}
	
	@Override
	public float frac(float value)
	{
		return value - (int)value;
	}
	
	@Override
	public double integer(double value)
	{
		return (long)value;
	}
	
	@Override
	public double integerF2D(float value)
	{
		return (int)value;
	}
	
	@Override
	public float integer(float value)
	{
		return (int)value;
	}
	
	@Override
	public long integerD2L(double value)
	{
		return (long)value;
	}
	
	@Override
	public long integerF2L(float value)
	{
		return (int)value;
	}
	
	@Override
	public int integerF2I(float value)
	{
		return (int)value;
	}
	
	@Override
	public BigDecimal sign(BigDecimal value)
	{
		return BigDecimal.valueOf(value.signum());
	}
	
	@Override
	public BigDecimal signD2Bigd(double value)
	{
		return BigDecimal.valueOf(Math.signum(value));
	}
	
	@Override
	public BigDecimal signF2Bigd(float value)
	{
		return BigDecimal.valueOf(Math.signum(value));
	}
	
	@Override
	public BigDecimal signBigi2Bigd(BigInteger value)
	{
		return BigDecimal.valueOf(value.signum());
	}
	
	@Override
	public BigDecimal signL2Bigd(long value)
	{
		return BigDecimal.valueOf(Math.signum(value));
	}
	
	@Override
	public BigDecimal signI2Bigd(int value)
	{
		return BigDecimal.valueOf(Math.signum(value));
	}
	
	@Override
	public BigDecimal signS2Bigd(short value)
	{
		return BigDecimal.valueOf(Math.signum(value));
	}
	
	@Override
	public BigDecimal signSB2Bigd(byte value)
	{
		return BigDecimal.valueOf(Math.signum(value));
	}
	
	@Override
	public double signBigd2D(BigDecimal value)
	{
		return value.signum();
	}
	
	@Override
	public double sign(double value)
	{
		return Math.signum(value);
	}

	@Override
	public double signF2D(float value)
	{
		return Math.signum(value);
	}
	
	@Override
	public double signBigi2D(BigInteger value)
	{
		return value.signum();
	}
	
	@Override
	public double signL2D(long value)
	{
		return Math.signum(value);
	}
	
	@Override
	public double signI2D(int value)
	{
		return Math.signum(value);
	}
	
	@Override
	public double signS2D(short value)
	{
		return Math.signum(value);
	}
	
	@Override
	public double signSB2D(byte value)
	{
		return Math.signum(value);
	}
	
	@Override
	public float signBigd2F(BigDecimal value)
	{
		return value.signum();
	}
	
	@Override
	public float signD2F(double value)
	{
		return (float)Math.signum(value);
	}
	
	@Override
	public float sign(float value)
	{
		return Math.signum(value);
	}
	
	@Override
	public float signBigi2F(BigInteger value)
	{
		return value.signum();
	}
	
	@Override
	public float signL2F(long value)
	{
		return Math.signum(value);
	}
	
	@Override
	public float signI2F(int value)
	{
		return Math.signum(value);
	}
	
	@Override
	public float signS2F(short value)
	{
		return Math.signum(value);
	}
	
	@Override
	public float signSB2F(byte value)
	{
		return Math.signum(value);
	}
	
	@Override
	public BigInteger signBigd2Bigi(BigDecimal value)
	{
		return BigInteger.valueOf(value.signum());
	}
	
	@Override
	public BigInteger signD2Bigi(double value)
	{
		return BigInteger.valueOf((int)Math.signum(value));
	}
	
	@Override
	public BigInteger signF2Bigi(float value)
	{
		return BigInteger.valueOf((int)Math.signum(value));
	}
	
	@Override
	public BigInteger sign(BigInteger value)
	{
		return BigInteger.valueOf(value.signum());
	}
	
	@Override
	public BigInteger signL2Bigi(long value)
	{
		return BigInteger.valueOf((int)Math.signum(value));
	}
	
	@Override
	public BigInteger signI2Bigi(int value)
	{
		return BigInteger.valueOf((int)Math.signum(value));
	}
	
	@Override
	public BigInteger signS2Bigi(short value)
	{
		return BigInteger.valueOf((int)Math.signum(value));
	}
	
	@Override
	public BigInteger signSB2Bigi(byte value)
	{
		return BigInteger.valueOf((int)Math.signum(value));
	}
	
	@Override
	public long signBigd2L(BigDecimal value)
	{
		return value.signum();
	}
	
	@Override
	public long signD2L(double value)
	{
		return (long)Math.signum(value);
	}
	
	@Override
	public long signF2L(float value)
	{
		return (long)Math.signum(value);
	}
	
	@Override
	public long signBigi2L(BigInteger value)
	{
		return value.signum();
	}
	
	@Override
	public long sign(long value)
	{
		return (long)Math.signum(value);
	}
	
	@Override
	public long signI2L(int value)
	{
		return(long)Math.signum(value);
	}
	
	@Override
	public long signS2L(short value)
	{
		return (long)Math.signum(value);
	}
	
	@Override
	public long signSB2L(byte value)
	{
		return (long)Math.signum(value);
	}
	
	@Override
	public int signBigd2I(BigDecimal value)
	{
		return value.signum();
	}
	
	@Override
	public int signD2I(double value)
	{
		return (int)Math.signum(value);
	}
	
	@Override
	public int signF2I(float value)
	{
		return (int)Math.signum(value);
	}
	
	@Override
	public int signBigi2I(BigInteger value)
	{
		return value.signum();
	}
	
	@Override
	public int signL2I(long value)
	{
		return (int)Math.signum(value);
	}
	
	@Override
	public int sign(int value)
	{
		return (int)Math.signum(value);
	}

	@Override
	public int signS2I(short value)
	{
		return (int)Math.signum(value);
	}
	
	@Override
	public int signSB2I(byte value)
	{
		return (int)Math.signum(value);
	}
	
	@Override
	public short signBigd2S(BigDecimal value)
	{
		return (short)value.signum();
	}
	
	@Override
	public short signD2S(double value)
	{
		return (short)Math.signum(value);
	}
	
	@Override
	public short signF2S(float value)
	{
		return (short)Math.signum(value);
	}
	
	@Override
	public short signBigi2S(BigInteger value)
	{
		return (short)value.signum();
	}
	
	@Override
	public short signL2S(long value)
	{
		return (short)Math.signum(value);
	}
	
	@Override
	public short signI2S(int value)
	{
		return (short)Math.signum(value);
	}

	@Override
	public short sign(short value)
	{
		return (short)Math.signum(value);
	}
	
	@Override
	public short signSB2S(byte value)
	{
		return (short)Math.signum(value);
	}
	
	@Override
	public byte signBigd2SB(BigDecimal value)
	{
		return (byte)value.signum();
	}
	
	@Override
	public byte signD2SB(double value)
	{
		return (byte)Math.signum(value);
	}
	
	@Override
	public byte signF2SB(float value)
	{
		return (byte)Math.signum(value);
	}
	
	@Override
	public byte signBigi2SB(BigInteger value)
	{
		return (byte)value.signum();
	}
	
	@Override
	public byte signL2SB(long value)
	{
		return (byte)Math.signum(value);
	}
	
	@Override
	public byte signI2SB(int value)
	{
		return (byte)Math.signum(value);
	}

	@Override
	public byte signS2SB(short value)
	{
		return (byte)Math.signum(value);
	}
	
	@Override
	public byte sign(byte value)
	{
		return (byte)Math.signum(value);
	}
	
	@Override
	public BigDecimal abs(BigDecimal value)
	{
		return value.abs();
	}
	
	@Override
	public BigDecimal absD2Bigd(double value)
	{
		return BigDecimal.valueOf(Math.abs(value));
	}
	
	@Override
	public BigDecimal absF2Bigd(float value)
	{
		return BigDecimal.valueOf(Math.abs(value));
	}
	
	@Override
	public BigDecimal absL2Bigd(long value)
	{
		return BigDecimal.valueOf(Math.abs(value));
	}
	
	@Override
	public BigDecimal absI2Bigd(int value)
	{
		return BigDecimal.valueOf(Math.abs(value));
	}
	
	@Override
	public BigDecimal absS2Bigd(short value)
	{
		return BigDecimal.valueOf(Math.abs(value));
	}
	
	@Override
	public BigDecimal absSB2Bigd(byte value)
	{
		return BigDecimal.valueOf(Math.abs(value));
	}
	
	@Override
	public double abs(double value)
	{
		return Math.abs(value);
	}

	@Override
	public double absF2D(float value)
	{
		return Math.abs(value);
	}
	
	@Override
	public double absL2D(long value)
	{
		return Math.abs(value);
	}
	
	@Override
	public double absI2D(int value)
	{
		return Math.abs(value);
	}
	
	@Override
	public double absS2D(short value)
	{
		return Math.abs(value);
	}
	
	@Override
	public double absSB2D(byte value)
	{
		return Math.abs(value);
	}
	
	@Override
	public float abs(float value)
	{
		return Math.abs(value);
	}

	@Override
	public float absI2F(int value)
	{
		return Math.abs(value);
	}
	
	@Override
	public float absS2F(short value)
	{
		return Math.abs(value);
	}
	
	@Override
	public float absSB2F(byte value)
	{
		return Math.abs(value);
	}
	
	@Override
	public BigInteger abs(BigInteger value)
	{
		return value.abs();
	}
	
	@Override
	public BigInteger absL2Bigi(long value)
	{
		return BigInteger.valueOf(Math.abs(value));
	}
	
	@Override
	public BigInteger absI2Bigi(int value)
	{
		return BigInteger.valueOf(Math.abs(value));
	}
	
	@Override
	public BigInteger absS2Bigi(short value)
	{
		return BigInteger.valueOf(Math.abs(value));
	}
	
	@Override
	public BigInteger absSB2Bigi(byte value)
	{
		return BigInteger.valueOf(Math.abs(value));
	}
	
	@Override
	public long abs(long value)
	{
		return Math.abs(value);
	}
	
	@Override
	public long absI2L(int value)
	{
		return Math.abs(value);
	}
	
	@Override
	public long absS2L(short value)
	{
		return Math.abs(value);
	}
	
	@Override
	public long absSB2L(byte value)
	{
		return Math.abs(value);
	}
	
	@Override
	public int abs(int value)
	{
		return Math.abs(value);
	}
	
	@Override
	public int absS2I(short value)
	{
		return Math.abs(value);
	}
	
	@Override
	public int absSB2I(byte value)
	{
		return Math.abs(value);
	}
	
	@Override
	public short abs(short value)
	{
		return (short)Math.abs(value);
	}
	
	@Override
	public short absSB2S(byte value)
	{
		return (short)Math.abs(value);
	}
	
	@Override
	public byte abs(byte value)
	{
		return (byte)Math.abs(value);
	}
	
	@Override
	public BigDecimal min(BigDecimal value1, BigDecimal value2)
	{
		
		return value1.min(value2);
	}
	
	@Override
	public BigDecimal min(BigDecimal value1, BigDecimal value2, BigDecimal value3)
	{
		return value1.min(value2.min(value3));
	}
	
	@Override
	public BigDecimal min(BigDecimal value1, BigDecimal value2, BigDecimal value3, BigDecimal value4)
	{
		return value1.min(value2.min(value3.min(value4)));
	}
	
	@Override
	public BigDecimal min(BigDecimal value1, BigDecimal value2, BigDecimal value3, BigDecimal value4, BigDecimal value5)
	{
		return value1.min(value2.min(value3.min(value4.min(value5))));
	}
	
	@Override
	public BigDecimal min(BigDecimal... values)
	{
		BigDecimal value = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			value = value.min(values[i]);
		}
		
		return value;
	}
	
	@Override
	public double min(double value1, double value2)
	{
		return Math.min(value1, value2);
	}
	
	@Override
	public double min(double value1, double value2, double value3)
	{
		return Math.min(value1, Math.min(value2, value3));
	}
	
	@Override
	public double min(double value1, double value2, double value3, double value4)
	{
		return Math.min(value1, Math.min(value2, Math.min(value3, value4)));
	}
	
	@Override
	public double min(double value1, double value2, double value3, double value4, double value5)
	{
		return Math.min(value1, Math.min(value2, Math.min(value3, Math.min(value4, value5))));
	}
	
	@Override
	public double min(double... values)
	{
		double value = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			value = Math.min(value, values[i]);
		}
		
		return value;
	}
	
	@Override
	public float min(float value1, float value2)
	{
		return Math.min(value1, value2);
	}
	
	@Override
	public float min(float value1, float value2, float value3)
	{
		return Math.min(value1, Math.min(value2, value3));
	}
	
	@Override
	public float min(float value1, float value2, float value3, float value4)
	{
		return Math.min(value1, Math.min(value2, Math.min(value3, value4)));
	}
	
	@Override
	public float min(float value1, float value2, float value3, float value4, float value5)
	{
		return Math.min(value1, Math.min(value2, Math.min(value3, Math.min(value4, value5))));
	}
	
	@Override
	public float min(float... values)
	{
		float value = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			value = Math.min(value, values[i]);
		}
		
		return value;
	}
	
	@Override
	public BigInteger min(BigInteger value1, BigInteger value2)
	{
		
		return value1.min(value2);
	}
	
	@Override
	public BigInteger min(BigInteger value1, BigInteger value2, BigInteger value3)
	{
		return value1.min(value2.min(value3));
	}
	
	@Override
	public BigInteger min(BigInteger value1, BigInteger value2, BigInteger value3, BigInteger value4)
	{
		return value1.min(value2.min(value3.min(value4)));
	}
	
	@Override
	public BigInteger min(BigInteger value1, BigInteger value2, BigInteger value3, BigInteger value4, BigInteger value5)
	{
		return value1.min(value2.min(value3.min(value4.min(value5))));
	}
	
	@Override
	public BigInteger min(BigInteger... values)
	{
		BigInteger value = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			value = value.min(values[i]);
		}
		
		return value;
	}
	
	@Override
	public long min(long value1, long value2)
	{
		return Math.min(value1, value2);
	}
	
	@Override
	public long min(long value1, long value2, long value3)
	{
		return Math.min(value1, Math.min(value2, value3));
	}
	
	@Override
	public long min(long value1, long value2, long value3, long value4)
	{
		return Math.min(value1, Math.min(value2, Math.min(value3, value4)));
	}
	
	@Override
	public long min(long value1, long value2, long value3, long value4, long value5)
	{
		return Math.min(value1, Math.min(value2, Math.min(value3, Math.min(value4, value5))));
	}
	
	@Override
	public long min(long... values)
	{
		long value = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			value = Math.min(value, values[i]);
		}
		
		return value;
	}
	
	@Override
	public int min(int value1, int value2)
	{
		return Math.min(value1, value2);
	}
	
	@Override
	public int min(int value1, int value2, int value3)
	{
		return Math.min(value1, Math.min(value2, value3));
	}
	
	@Override
	public int min(int value1, int value2, int value3, int value4)
	{
		return Math.min(value1, Math.min(value2, Math.min(value3, value4)));
	}
	
	@Override
	public int min(int value1, int value2, int value3, int value4, int value5)
	{
		return Math.min(value1, Math.min(value2, Math.min(value3, Math.min(value4, value5))));
	}
	
	@Override
	public int min(int... values)
	{
		int value = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			value = Math.min(value, values[i]);
		}
		
		return value;
	}
	
	@Override
	public short min(short value1, short value2)
	{
		return (short)Math.min(value1, value2);
	}
	
	@Override
	public short min(short value1, short value2, short value3)
	{
		return (short)Math.min(value1, Math.min(value2, value3));
	}
	
	@Override
	public short min(short value1, short value2, short value3, short value4)
	{
		return (short)Math.min(value1, Math.min(value2, Math.min(value3, value4)));
	}
	
	@Override
	public short min(short value1, short value2, short value3, short value4, short value5)
	{
		return (short)Math.min(value1, Math.min(value2, Math.min(value3, Math.min(value4, value5))));
	}
	
	@Override
	public short min(short... values)
	{
		short value = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			value = (short)Math.min(value, values[i]);
		}
		
		return value;
	}
	
	@Override
	public byte min(byte value1, byte value2)
	{
		return (byte)Math.min(value1, value2);
	}
	
	@Override
	public byte min(byte value1, byte value2, byte value3)
	{
		return (byte)Math.min(value1, Math.min(value2, value3));
	}
	
	@Override
	public byte min(byte value1, byte value2, byte value3, byte value4)
	{
		return (byte)Math.min(value1, Math.min(value2, Math.min(value3, value4)));
	}
	
	@Override
	public byte min(byte value1, byte value2, byte value3, byte value4, byte value5)
	{
		return (byte)Math.min(value1, Math.min(value2, Math.min(value3, Math.min(value4, value5))));
	}
	
	@Override
	public byte min(byte... values)
	{
		byte value = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			value = (byte)Math.min(value, values[i]);
		}
		
		return value;
	}
	
	@Override
	public BigDecimal max(BigDecimal value1, BigDecimal value2)
	{
		return value1.max(value2);
	}
	
	@Override
	public BigDecimal max(BigDecimal value1, BigDecimal value2, BigDecimal value3)
	{
		return value1.max(value2.max(value3));
	}
	
	@Override
	public BigDecimal max(BigDecimal value1, BigDecimal value2, BigDecimal value3, BigDecimal value4)
	{
		return value1.max(value2.max(value3.max(value4)));
	}
	
	@Override
	public BigDecimal max(BigDecimal value1, BigDecimal value2, BigDecimal value3, BigDecimal value4, BigDecimal value5)
	{
		return value1.max(value2.max(value3.max(value4.max(value5))));
	}
	
	@Override
	public BigDecimal max(BigDecimal... values)
	{
		BigDecimal value = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			value = value.max(values[i]);
		}
		
		return value;
	}
	
	@Override
	public double max(double value1, double value2)
	{
		return Math.max(value1, value2);
	}
	
	@Override
	public double max(double value1, double value2, double value3)
	{
		return Math.max(value1, Math.max(value2, value3));
	}
	
	@Override
	public double max(double value1, double value2, double value3, double value4)
	{
		return Math.max(value1, Math.max(value2, Math.max(value3, value4)));
	}
	
	@Override
	public double max(double value1, double value2, double value3, double value4, double value5)
	{
		return Math.max(value1, Math.max(value2, Math.max(value3, Math.max(value4, value5))));
	}
	
	@Override
	public double max(double... values)
	{
		double value = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			value = Math.max(value, values[i]);
		}
		
		return value;
	}
	
	@Override
	public float max(float value1, float value2)
	{
		return Math.max(value1, value2);
	}
	
	@Override
	public float max(float value1, float value2, float value3)
	{
		return Math.max(value1, Math.max(value2, value3));
	}
	
	@Override
	public float max(float value1, float value2, float value3, float value4)
	{
		return Math.max(value1, Math.max(value2, Math.max(value3, value4)));
	}
	
	@Override
	public float max(float value1, float value2, float value3, float value4, float value5)
	{
		return Math.max(value1, Math.max(value2, Math.max(value3, Math.max(value4, value5))));
	}
	
	@Override
	public float max(float... values)
	{
		float value = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			value = Math.max(value, values[i]);
		}
		
		return value;
	}
	
	@Override
	public BigInteger max(BigInteger value1, BigInteger value2)
	{
		return value1.max(value2);
	}
	
	@Override
	public BigInteger max(BigInteger value1, BigInteger value2, BigInteger value3)
	{
		return value1.max(value2.max(value3));
	}
	
	@Override
	public BigInteger max(BigInteger value1, BigInteger value2, BigInteger value3, BigInteger value4)
	{
		return value1.max(value2.max(value3.max(value4)));
	}
	
	@Override
	public BigInteger max(BigInteger value1, BigInteger value2, BigInteger value3, BigInteger value4, BigInteger value5)
	{
		return value1.max(value2.max(value3.max(value4.max(value5))));
	}
	
	@Override
	public BigInteger max(BigInteger... values)
	{
		BigInteger value = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			value = value.max(values[i]);
		}
		
		return value;
	}
	
	@Override
	public long max(long value1, long value2)
	{
		return Math.max(value1, value2);
	}
	
	@Override
	public long max(long value1, long value2, long value3)
	{
		return Math.max(value1, Math.max(value2, value3));
	}
	
	@Override
	public long max(long value1, long value2, long value3, long value4)
	{
		return Math.max(value1, Math.max(value2, Math.max(value3, value4)));
	}
	
	@Override
	public long max(long value1, long value2, long value3, long value4, long value5)
	{
		return Math.max(value1, Math.max(value2, Math.max(value3, Math.max(value4, value5))));
	}
	
	@Override
	public long max(long... values)
	{
		long value = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			value = Math.max(value, values[i]);
		}
		
		return value;
	}
	
	@Override
	public int max(int value1, int value2)
	{
		return Math.max(value1, value2);
	}
	
	@Override
	public int max(int value1, int value2, int value3)
	{
		return Math.max(value1, Math.max(value2, value3));
	}
	
	@Override
	public int max(int value1, int value2, int value3, int value4)
	{
		return Math.max(value1, Math.max(value2, Math.max(value3, value4)));
	}
	
	@Override
	public int max(int value1, int value2, int value3, int value4, int value5)
	{
		return Math.max(value1, Math.max(value2, Math.max(value3, Math.max(value4, value5))));
	}
	
	@Override
	public int max(int... values)
	{
		int value = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			value = Math.max(value, values[i]);
		}
		
		return value;
	}
	
	@Override
	public short max(short value1, short value2)
	{
		return (short)Math.max(value1, value2);
	}
	
	@Override
	public short max(short value1, short value2, short value3)
	{
		return (short)Math.max(value1, Math.max(value2, value3));
	}
	
	@Override
	public short max(short value1, short value2, short value3, short value4)
	{
		return (short)Math.max(value1, Math.max(value2, Math.max(value3, value4)));
	}
	
	@Override
	public short max(short value1, short value2, short value3, short value4, short value5)
	{
		return (short)Math.max(value1, Math.max(value2, Math.max(value3, Math.max(value4, value5))));
	}
	
	@Override
	public short max(short... values)
	{
		short value = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			value = (short)Math.max(value, values[i]);
		}
		
		return value;
	}
	
	@Override
	public byte max(byte value1, byte value2)
	{
		return (byte)Math.max(value1, value2);
	}
	
	@Override
	public byte max(byte value1, byte value2, byte value3)
	{
		return (byte)Math.max(value1, Math.max(value2, value3));
	}
	
	@Override
	public byte max(byte value1, byte value2, byte value3, byte value4)
	{
		return (byte)Math.max(value1, Math.max(value2, Math.max(value3, value4)));
	}
	
	@Override
	public byte max(byte value1, byte value2, byte value3, byte value4, byte value5)
	{
		return (byte)Math.max(value1, Math.max(value2, Math.max(value3, Math.max(value4, value5))));
	}
	
	@Override
	public byte max(byte... values)
	{
		byte value = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			value = (byte)Math.max(value, values[i]);
		}
		
		return value;
	}

	@Override
	public BigDecimal clampMin(BigDecimal value, BigDecimal min)
	{
		return value.max(min);
	}
	
	@Override
	public double clampMin(double value, double min)
	{
		return Math.max(value, min);
	}

	@Override
	public float clampMin(float value, float min)
	{
		return Math.max(value, min);
	}
	
	@Override
	public BigInteger clampMin(BigInteger value, BigInteger min)
	{
		return value.max(min);
	}
	
	@Override
	public long clampMin(long value, long min)
	{
		return Math.max(value, min);
	}
	
	@Override
	public int clampMin(int value, int min)
	{
		return Math.max(value, min);
	}
	
	@Override
	public short clampMin(short value, short min)
	{
		return (short)Math.max(value, min);
	}
	
	@Override
	public byte clampMinSB(byte value, byte min)
	{
		return (byte)Math.max(value, min);
	}
	
	@Override
	public byte clampMinUB(byte value, byte min)
	{
		return (byte)Math.max(value & 0xFF, min & 0xFF);
	}
	
	@Override
	public BigDecimal clampMin(BigDecimal tolerance, BigDecimal value, BigDecimal min)
	{
		return value.compareTo(min.add(tolerance)) < 0 ? min : value;
	}
	
	@Override
	public double clampMin(double tolerance, double value, double min)
	{
		return value < min + tolerance ? min : value;
	}

	@Override
	public float clampMin(float tolerance, float value, float min)
	{
		return value < min + tolerance ? min : value;
	}

	@Override
	public BigInteger clampMin(BigInteger tolerance, BigInteger value, BigInteger min)
	{
		return value.compareTo(min.add(tolerance)) < 0 ? min : value;
	}
	
	@Override
	public long clampMin(long tolerance, long value, long min)
	{
		return value < min + tolerance ? min : value;
	}
	
	@Override
	public int clampMin(int tolerance, int value, int min)
	{
		return value < min + tolerance ? min : value;
	}
	
	@Override
	public short clampMin(short tolerance, short value, short min)
	{
		return value < min + tolerance ? min : value;
	}
	
	@Override
	public byte clampMinSB(byte tolerance, byte value, byte min)
	{
		return value < min + tolerance ? min : value;
	}
	
	@Override
	public byte clampMinUB(byte tolerance, byte value, byte min)
	{
		return (value & 0xFF) < (min & 0xFF) + (tolerance & 0xFF) ? min : value;
	}
	
	@Override
	public BigDecimal clampMax(BigDecimal value, BigDecimal max)
	{
		return value.min(max);
	}
	
	@Override
	public double clampMax(double value, double max)
	{
		return Math.min(value, max);
	}

	@Override
	public float clampMax(float value, float max)
	{
		return Math.min(value, max);
	}
	
	@Override
	public BigInteger clampMax(BigInteger value, BigInteger max)
	{
		return value.min(max);
	}
	
	@Override
	public long clampMax(long value, long max)
	{
		return Math.min(value, max);
	}
	
	@Override
	public int clampMax(int value, int max)
	{
		return Math.min(value, max);
	}
	
	@Override
	public short clampMax(short value, short max)
	{
		return (short)Math.min(value, max);
	}
	
	@Override
	public byte clampMaxSB(byte value, byte max)
	{
		return (byte)Math.min(value, max);
	}
	
	@Override
	public byte clampMaxUB(byte value, byte max)
	{
		return (byte)Math.min(value & 0xFF, max & 0xFF);
	}
	
	@Override
	public BigDecimal clampMax(BigDecimal tolerance, BigDecimal value, BigDecimal max)
	{
		return value.compareTo(max.subtract(tolerance)) > 0 ? max : value;
	}
	
	@Override
	public double clampMax(double tolerance, double value, double max)
	{
		return value > max - tolerance ? max : value;
	}

	@Override
	public float clampMax(float tolerance, float value, float max)
	{
		return value > max - tolerance ? max : value;
	}
	
	@Override
	public BigInteger clampMax(BigInteger tolerance, BigInteger value, BigInteger max)
	{
		return value.compareTo(max.subtract(tolerance)) > 0 ? max : value;
	}
	
	@Override
	public long clampMax(long tolerance, long value, long max)
	{
		return value > max - tolerance ? max : value;
	}
	
	@Override
	public int clampMax(int tolerance, int value, int max)
	{
		return value > max - tolerance ? max : value;
	}
	
	@Override
	public short clampMax(short tolerance, short value, short max)
	{
		return value > max - tolerance ? max : value;
	}
	
	@Override
	public byte clampMaxSB(byte tolerance, byte value, byte max)
	{
		return value > max - tolerance ? max : value;
	}
	
	@Override
	public byte clampMaxUB(byte tolerance, byte value, byte max)
	{
		return (value & 0xFF) > (max & 0xFF) - (tolerance & 0xFF) ? max : value;
	}
	
	@Override
	public BigDecimal clamp(BigDecimal value, BigDecimal min, BigDecimal max)
	{
		return value.max(min).min(max);
	}
	
	@Override
	public double clamp(double value, double min, double max)
	{
		return Math.clamp(value, min, max);
	}

	@Override
	public float clamp(float value, float min, float max)
	{
		return Math.clamp(value, min, max);
	}

	@Override
	public BigInteger clamp(BigInteger value, BigInteger min, BigInteger max)
	{
		return value.max(min).min(max);
	}
	
	@Override
	public long clamp(long value, long min, long max)
	{
		return Math.clamp(value, min, max);
	}
	
	@Override
	public int clamp(int value, int min, int max)
	{
		return Math.clamp(value, min, max);
	}
	
	@Override
	public short clamp(short value, short min, short max)
	{
		return (short)Math.clamp(value, min, max);
	}
	
	@Override
	public byte clampSB(byte value, byte min, byte max)
	{
		return (byte)Math.clamp(value, min, max);
	}
	
	@Override
	public byte clampUB(byte value, byte min, byte max)
	{
		return (byte)Math.clamp(value & 0xFF, min & 0xFF, max & 0xFF);
	}
	
	@Override
	public BigDecimal clamp(BigDecimal tolerance, BigDecimal value, BigDecimal min, BigDecimal max)
	{
		return value.compareTo(min.add(tolerance)) < 0 ? min : value.compareTo(max.subtract(tolerance)) > 0 ? max : value;
	}
	
	@Override
	public double clamp(double tolerance, double value, double min, double max)
	{
		return value < min + tolerance ? min : value > max - tolerance ? max : value;
	}

	@Override
	public float clamp(float tolerance, float value, float min, float max)
	{
		return value < min + tolerance ? min : value > max - tolerance ? max : value;
	}
	
	@Override
	public BigInteger clamp(BigInteger tolerance, BigInteger value, BigInteger min, BigInteger max)
	{
		return value.compareTo(min.add(tolerance)) < 0 ? min : value.compareTo(max.subtract(tolerance)) > 0 ? max : value;
	}
	
	@Override
	public long clamp(long tolerance, long value, long min, long max)
	{
		return value < min + tolerance ? min : value > max - tolerance ? max : value;
	}
	
	@Override
	public int clamp(int tolerance, int value, int min, int max)
	{
		return value < min + tolerance ? min : value > max - tolerance ? max : value;
	}
	
	@Override
	public short clamp(short tolerance, short value, short min, short max)
	{
		return value < min + tolerance ? min : value > max - tolerance ? max : value;
	}
	
	@Override
	public byte clampSB(byte tolerance, byte value, byte min, byte max)
	{
		return value < min + tolerance ? min : value > max - tolerance ? max : value;
	}
	
	@Override
	public byte clampUB(byte tolerance, byte value, byte min, byte max)
	{
		int iVal = value & 0xFF;
		int iTolerance = tolerance & 0xFF;
		return iVal < (min & 0xFF) + iTolerance ? min : iVal > (max & 0xFF) - iTolerance ? max : value;
	}
	
	@Override
	public BigDecimal clamp(BigDecimal toleranceMin, BigDecimal toleranceMax, BigDecimal value, BigDecimal min, BigDecimal max)
	{
		return value.compareTo(min.add(toleranceMin)) < 0 ? min : value.compareTo(max.subtract(toleranceMax)) > 0 ? max : value;
	}
	
	@Override
	public double clamp(double toleranceMin, double toleranceMax, double value, double min, double max)
	{
		return value < min + toleranceMin ? min : value > max - toleranceMax ? max : value;
	}
	
	@Override
	public float clamp(float toleranceMin, float toleranceMax, float value, float min, float max)
	{
		return value < min + toleranceMin ? min : value > max - toleranceMax ? max : value;
	}
	
	@Override
	public BigInteger clamp(BigInteger toleranceMin, BigInteger toleranceMax, BigInteger value, BigInteger min, BigInteger max)
	{
		return value.compareTo(min.add(toleranceMin)) < 0 ? min : value.compareTo(max.subtract(toleranceMax)) > 0 ? max : value;
	}
	
	@Override
	public long clamp(long toleranceMin, long toleranceMax, long value, long min, long max)
	{
		return value < min + toleranceMin ? min : value > max - toleranceMax ? max : value;
	}
	
	@Override
	public int clamp(int toleranceMin, int toleranceMax, int value, int min, int max)
	{
		return value < min + toleranceMin ? min : value > max - toleranceMax ? max : value;
	}
	
	@Override
	public short clamp(short toleranceMin, short toleranceMax, short value, short min, short max)
	{
		return value < min + toleranceMin ? min : value > max - toleranceMax ? max : value;
	}
	
	@Override
	public byte clampSB(byte toleranceMin, byte toleranceMax, byte value, byte min, byte max)
	{
		return value < min + toleranceMin ? min : value > max - toleranceMax ? max : value;
	}
	
	@Override
	public byte clampUB(byte toleranceMin, byte toleranceMax, byte value, byte min, byte max)
	{
		int iVal = value & 0xFF;
		return iVal < (min & 0xFF) + (toleranceMin & 0xFF) ? min : iVal > (max & 0xFF) - (toleranceMax & 0xFF) ? max : value;
	}
	
	public static class DefaultCompareProvider implements MathUtilsProvider.CompareProvider
	{
		@Override
		public boolean isZero(BigDecimal value)
		{
			return value.compareTo(BigDecimal.ZERO) == 0;
		}
		
		@Override
		public boolean isZero(double value)
		{
			return value == 0.0f;
		}

		@Override
		public boolean isZero(float value)
		{
			return value == 0.0;
		}

		@Override
		public boolean isZero(BigInteger value)
		{
			return value.compareTo(BigInteger.ZERO) == 0;
		}
		
		@Override
		public boolean isZero(long value)
		{
			return value == 0;
		} 
		
		@Override
		public boolean isZero(int value)
		{
			return value == 0;
		} 
		
		@Override
		public boolean isZero(short value)
		{
			return value == 0;
		} 
		
		@Override
		public boolean isZero(byte value)
		{
			return value == 0;
		} 
		
		@Override
		public boolean isZero(BigDecimal tolerance, BigDecimal value)
		{
			return value.abs().compareTo(tolerance) <= 0;
		}
		
		@Override
		public boolean isZero(float tolerance, float value)
		{
			return Math.abs(value) <= tolerance;
		}

		@Override
		public boolean isZero(double tolerance, double value)
		{
			return Math.abs(value) <= tolerance;
		}

		@Override
		public boolean isZero(BigInteger tolerance, BigInteger value)
		{
			return value.abs().compareTo(tolerance) <= 0;
		}
		
		@Override
		public boolean isZero(long tolerance, long value)
		{
			return Math.abs(value) <= tolerance;
		}
		
		@Override
		public boolean isZero(int tolerance, int value)
		{
			return Math.abs(value) <= tolerance;
		}
		
		@Override
		public boolean isZero(short tolerance, short value)
		{
			return Math.abs(value) <= tolerance;
		}
		
		@Override
		public boolean isZero(byte tolerance, byte value)
		{
			return Math.abs(value) <= tolerance;
		}

		@Override
		public int compare(BigDecimal a, BigDecimal b)
		{
			return a.compareTo(b);
		}
		
		@Override
		public int compare(double a, double b)
		{
			return Double.compare(a, b);
		}

		@Override
		public int compare(float a, float b)
		{
			return Float.compare(a, b);
		}
		
		@Override
		public int compare(BigInteger a, BigInteger b)
		{
			return a.compareTo(b);
		}
		
		@Override
		public int compare(long a, long b)
		{
			return Long.compare(a, b);
		}
		
		@Override
		public int compare(int a, int b)
		{
			return Integer.compare(a, b);
		}
		
		@Override
		public int compare(short a, short b)
		{
			return Short.compare(a, b);
		}
		
		@Override
		public int compare(byte a, byte b)
		{
			return Byte.compare(a, b);
		}
		
		@Override
		public int compare(BigDecimal tolerance, BigDecimal a, BigDecimal b)
		{
			if(a.subtract(b).abs().compareTo(tolerance) <= 0) return 0;
			
			return a.compareTo(b);
		}
		
		@Override
		public int compare(double tolerance, double a, double b)
		{
			if(MathUtils.abs(a - b) <= tolerance) return 0;
			
			return Double.compare(a, b);
		}

		@Override
		public int compare(float tolerance, float a, float b)
		{
			if(MathUtils.abs(a - b) <= tolerance) return 0;
			
			return Float.compare(a, b);
		}
		
		@Override
		public int compare(BigInteger tolerance, BigInteger a, BigInteger b)
		{
			if(a.subtract(b).abs().compareTo(tolerance) <= 0) return 0;
			
			return a.compareTo(b);
		}
		
		@Override
		public int compare(long tolerance, long a, long b)
		{
			if(MathUtils.abs(a - b) <= tolerance) return 0;
			
			return Long.compare(a, b);
		}
		
		@Override
		public int compare(int tolerance, int a, int b)
		{
			if(MathUtils.abs(a - b) <= tolerance) return 0;
			
			return Integer.compare(a, b);
		}
		
		@Override
		public int compare(short tolerance, short a, short b)
		{
			if(MathUtils.abs(a - b) <= tolerance) return 0;
			
			return Short.compare(a, b);
		}
		
		@Override
		public int compare(byte tolerance, byte a, byte b)
		{
			if(MathUtils.abs(a - b) <= tolerance) return 0;
			
			return Byte.compare(a, b);
		}
		
		@Override
		public boolean equals(BigDecimal a, BigDecimal b)
		{
			return a.compareTo(b) == 0;
		}
		
		@Override
		public boolean equals(double a, double b)
		{
			return a == b;
		}
		
		@Override
		public boolean equals(float a, float b)
		{
			return a == b;
		}
		
		@Override
		public boolean equals(BigInteger a, BigInteger b)
		{
			return a.compareTo(b) == 0;
		}
		
		@Override
		public boolean equals(long a, long b)
		{
			return a == b;
		}
		
		@Override
		public boolean equals(int a, int b)
		{
			return a == b;
		}
		
		@Override
		public boolean equals(short a, short b)
		{
			return a == b;
		}
		
		@Override
		public boolean equals(byte a, byte b)
		{
			return a == b;
		}
		
		@Override
		public boolean equals(BigDecimal tolerance, BigDecimal a, BigDecimal b)
		{
			return a.subtract(b).abs().compareTo(tolerance) <= 0;
		}
		
		@Override
		public boolean equals(double tolerance, double a, double b)
		{
			return MathUtils.abs(a - b) <= tolerance;
		}
		
		@Override
		public boolean equals(float tolerance, float a, float b)
		{
			return MathUtils.abs(a - b) <= tolerance;
		}
		
		@Override
		public boolean equals(BigInteger tolerance, BigInteger a, BigInteger b)
		{
			return a.subtract(b).abs().compareTo(tolerance) <= 0;
		}
		
		@Override
		public boolean equals(long tolerance, long a, long b)
		{
			return MathUtils.abs(a - b) <= tolerance;
		}
		
		@Override
		public boolean equals(int tolerance, int a, int b)
		{
			return MathUtils.abs(a - b) <= tolerance;
		}
		
		@Override
		public boolean equals(short tolerance, short a, short b)
		{
			return MathUtils.abs(a - b) <= tolerance;
		}

		public boolean equals(byte tolerance, byte a, byte b)
		{
			return MathUtils.abs(a - b) <= tolerance;
		}
	}
	
	public static class DefaultLerpProvider implements MathUtilsProvider.LerpProvider
	{
		@Override
		public double lerp(double alpha, double a, double b)
		{
			return (a + alpha * (b - a));
		}
		
		@Override
		public float lerp(double alpha, float a, float b)
		{
			return (float)(a + alpha * (b - a));
		}
		
		@Override
		public double quadricBezier(double alpha, double a, double b, double c)
		{
			double p0 = lerp(alpha, a, b);
			
			return (p0 + alpha * (lerp(alpha, b, c) - p0));
		}
		
		@Override
		public float quadricBezier(double alpha, float a, float b, float c)
		{
			double p0 = lerp(alpha, (double)a, (double)b);
			
			return (float)(p0 + alpha * (lerp(alpha, (double)b, (double)c) - p0));
		}
		
		@Override
		public double cubicBezier(double alpha, double a, double b, double c, double d)
		{
			double p0 = quadricBezier(alpha, (double)a, (double)b, (double)c);
			
			return (p0 + alpha * (quadricBezier(alpha, (double)b, (double)c, (double)d) - p0));
		}
		
		@Override
		public float cubicBezier(double alpha, float a, float b, float c, float d)
		{
			double p0 = quadricBezier(alpha, (double)a, (double)b, (double)c);
			
			return (float)(p0 + alpha * (quadricBezier(alpha, (double)b, (double)c, (double)d) - p0));
		}
		
		@Override
		public double bicubicBezier(double alpha, double a, double b, double c, double d, double e)
		{
			double p0 = cubicBezier(alpha, (double)a, (double)b, (double)c, (double)d);
			
			return (p0 + alpha * (cubicBezier(alpha, (double)b, (double)c, (double)d, (double)e) - p0));
		}
		
		@Override
		public float bicubicBezier(double alpha, float a, float b, float c, float d, float e)
		{
			double p0 = cubicBezier(alpha, (double)a, (double)b, (double)c, (double)d);
			
			return (float)(p0 + alpha * (cubicBezier(alpha, (double)b, (double)c, (double)d, (double)e) - p0));
		}
		
		@Override
		public double step(double alpha, double midpoint, double a, double b)
		{
			return (alpha < midpoint ? a : b);
		}
		
		@Override
		public float step(double alpha, double midpoint, float a, float b)
		{
			return (alpha < midpoint ? a : b);
		}
		
		@Override
		public double smoothstep(double alpha, double a, double b)
		{
			double smoothAlpha = MathUtils.clamp(alpha, 0.0, 1.0);
			smoothAlpha = smoothAlpha * smoothAlpha * (3 - 2 * smoothAlpha);
			
			return (a + smoothAlpha * (b - a));
		}
		
		@Override
		public float smoothstep(double alpha, float a, float b)
		{
			double smoothAlpha = MathUtils.clamp(alpha, 0.0, 1.0);
			smoothAlpha = smoothAlpha * smoothAlpha * (3 - 2 * smoothAlpha);
			
			return (float)(a + smoothAlpha * (b - a));
		}
		
		@Override
		public double smootherstep(double alpha, double a, double b)
		{
			double smoothAlpha = MathUtils.clamp(alpha, 0.0, 1.0);
			smoothAlpha = smoothAlpha * smoothAlpha * smoothAlpha * (smoothAlpha * (smoothAlpha * 6 - 15) + 10);
			
			return (a + smoothAlpha * (b - a));
		}
		
		@Override
		public float smootherstep(double alpha, float a, float b)
		{
			double smoothAlpha = MathUtils.clamp(alpha, 0.0, 1.0);
			smoothAlpha = smoothAlpha * smoothAlpha * smoothAlpha * (smoothAlpha * (smoothAlpha * 6 - 15) + 10);
			
			return (float)(a + smoothAlpha * (b - a));
		}
		
		@Override
		public double intLerp(double alpha, double v)
		{
			return (alpha * v);
		}
		
		@Override
		public float intLerp(double alpha, float v)
		{
			return  (float)(alpha * v);
		}
		
		@Override
		public double intLerp(double alpha, double a, double b)
		{
			return (a + alpha * (b - a));
		}
		
		@Override
		public float intLerp(double alpha, float a, float b)
		{
			return (float)(a + alpha * (b - a));
		}
	}
	
	public static class DefaultRoundProvider implements MathUtilsProvider.RoundProvider
	{
		@Override
		public double floor(double value)
		{
			return Math.floor(value);
		}

		@Override
		public double floorF2D(float value)
		{
			return Math.floor(value);
		}

		@Override
		public float floor(float value)
		{
			return (float)Math.floor(value);
		}

		@Override
		public long floorD2L(double value)
		{
			return (long)Math.floor(value);
		}

		@Override
		public long floorF2L(float value)
		{
			return (long)Math.floor(value);
		}

		@Override
		public int floorF2I(float value)
		{
			return (int)Math.floor(value);
		}

		@Override
		public double ceil(double value)
		{
			return Math.ceil(value);
		}

		@Override
		public double ceilF2D(float value)
		{
			return Math.ceil(value);
		}

		@Override
		public float ceil(float value)
		{
			return (float)Math.ceil(value);
		}

		@Override
		public long ceilD2L(double value)
		{
			return (long)Math.ceil(value);
		}

		@Override
		public long ceilF2L(float value)
		{
			return (long)Math.ceil(value);
		}

		@Override
		public int ceilF2I(float value)
		{
			return (int)Math.ceil(value);
		}

		@Override
		public double round(double value)
		{
			return Math.round(value);
		}

		@Override
		public double roundF2D(float value)
		{
			return Math.round(value);
		}

		@Override
		public float round(float value)
		{
			return (float)Math.round(value);
		}

		@Override
		public long roundD2L(double value)
		{
			return (long)Math.round(value);
		}

		@Override
		public long roundF2L(float value)
		{
			return (long)Math.round(value);
		}

		@Override
		public int roundF2I(float value)
		{
			return (int)Math.round(value);
		}

		@Override
		public double round(double value, RoundMethodD method)
		{
			return method.roundD(value);
		}

		@Override
		public double roundF2D(float value, RoundMethodF method)
		{
			return method.roundF(value);
		}

		@Override
		public float round(float value, RoundMethodF method)
		{
			return method.roundF(value);
		}

		@Override
		public long roundD2L(double value, RoundMethodD method)
		{
			return (long)method.roundD(value);
		}

		@Override
		public long roundF2L(float value, RoundMethodF method)
		{
			return (long)method.roundF(value);
		}

		@Override
		public int roundF2I(float value, RoundMethodF method)
		{
			return (int)method.roundF(value);
		}

		@Override
		public double trunc(double value)
		{
			return (long)value;
		}

		@Override
		public double truncF2D(float value)
		{
			return (int)value;
		}

		@Override
		public float trunc(float value)
		{
			return (int)value;
		}

		@Override
		public long truncD2L(double value)
		{
			return (long)value;
		}

		@Override
		public long truncF2L(float value)
		{
			return (int)value;
		}

		@Override
		public int truncF2I(float value)
		{
			return (int)value;
		}

		@Override
		public double ceilEven(double value)
		{
			if(value == 0.0 || !Double.isFinite(value)) return value;
			
			double val = Math.ceil(value);
			return (((long)val & 1) == 0 ? val : val + 1);
		}

		@Override
		public double ceilEvenF2D(float value)
		{
			if(value == 0.0f || !Float.isFinite(value)) return value;
			
			double val = Math.ceil(value);
			return (((long)val & 1) == 0 ? val : val + 1);
		}

		@Override
		public double ceilEvenL2D(long value)
		{
			if(value == 0l) return 0.0;
			
			return ((value & 1) == 0 ? value : value + 1);
		}

		@Override
		public double ceilEvenI2D(int value)
		{
			if(value == 0) return 0.0;
			
			return ((value & 1) == 0 ? value : value + 1);
		}

		@Override
		public float ceilEven(float value)
		{
			if(value == 0.0f || !Float.isFinite(value)) return value;
			
			double val = Math.ceil(value);
			return (float)(((long)val & 1) == 0 ? val : val + 1);
		}

		@Override
		public float ceilEvenI2F(int value)
		{
			if(value == 0) return 0.0f;
			
			return (float)((value & 1) == 0 ? value : value + 1);
		}

		@Override
		public long ceilEvenD2L(double value)
		{
			if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			if(value == 0.0) return 0l;
			
			double val = Math.ceil(value);
			return (long)(((long)val & 1) == 0 ? val : val + 1);
		}

		@Override
		public long ceilEvenF2L(float value)
		{
			if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			if(value == 0.0f) return 0l;
			
			double val = Math.ceil(value);
			return (long)(((long)val & 1) == 0 ? val : val + 1);
		}

		@Override
		public long ceilEven(long value)
		{
			if(value == 0l) return 0l;
			
			return ((value & 1) == 0 ? value : value + 1);
		}

		@Override
		public long ceilEvenI2L(int value)
		{
			if(value == 0) return 0l;
			
			return ((value & 1) == 0 ? value : value + 1);
		}

		@Override
		public int ceilEvenF2I(float value)
		{
			if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			if(value == 0.0f) return 0;
			
			double val = Math.ceil(value);
			return (int)(((long)val & 1) == 0 ? val : val + 1);
		}

		@Override
		public int ceilEven(int value)
		{
			if(value == 0) return 0;
			
			return ((value & 1) == 0 ? value : value + 1);
		}

		@Override
		public double ceilOdd(double value)
		{
			if(!Double.isFinite(value)) return value;
			
			double val = Math.ceil(value);
			return (((long)val & 1) == 0 ? val + 1 : val);
		}

		@Override
		public double ceilOddF2D(float value)
		{
			if(!Float.isFinite(value)) return value;
			
			double val = Math.ceil(value);
			return (((long)val & 1) == 0 ? val + 1 : val);
		}

		@Override
		public double ceilOddL2D(long value)
		{
			return ((value & 1) == 0 ? value + 1 : value);
		}

		@Override
		public double ceilOddI2D(int value)
		{
			return ((value & 1) == 0 ? value + 1 : value);
		}

		@Override
		public float ceilOdd(float value)
		{
			if(!Float.isFinite(value)) return value;
			
			double val = Math.ceil(value);
			return (float)(((long)val & 1) == 0 ? val + 1 : val);
		}

		@Override
		public float ceilOddI2F(int value)
		{
			return ((value & 1) == 0 ? value + 1: value);
		}

		@Override
		public long ceilOddD2L(double value)
		{
			if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			
			double val = Math.ceil(value);
			return (long)(((long)val & 1) == 0 ? val + 1 : val);
		}

		@Override
		public long ceilOddF2L(float value)
		{
			if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			
			double val = Math.ceil(value);
			return (long)(((long)val & 1) == 0 ? val + 1 : val);
		}

		@Override
		public long ceilOdd(long value)
		{
			return ((value & 1) == 0 ? value + 1 : value);
		}

		@Override
		public long ceilOddI2L(int value)
		{
			return ((value & 1) == 0 ? value + 1 : value);
		}

		@Override
		public int ceilOddF2I(float value)
		{
			if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");

			double val = Math.ceil(value);
			return (int)(((long)val & 1) == 0 ? val + 1 : val);
		}

		@Override
		public int ceilOdd(int value)
		{
			return ((value & 1) == 0 ? value + 1 : value);
		}

		@Override
		public double ceilOddZero(double value)
		{
			if(value == 0.0 || !Double.isFinite(value)) return value;
			
			double val = Math.ceil(value);
			return (((long)val & 1) == 0 ? val + 1 : val);
		}

		@Override
		public double ceilOddZeroF2D(float value)
		{
			if(value == 0.0f || !Float.isFinite(value)) return value;
			
			double val = Math.ceil(value);
			return (((long)val & 1) == 0 ? val + 1 : val);
		}

		@Override
		public double ceilOddZeroL2D(long value)
		{
			if(value == 0l) return 0.0;
			
			return ((value & 1) == 0 ? value + 1 : value);
		}

		@Override
		public double ceilOddZeroI2D(int value)
		{
			if(value == 0l) return 0.0;
			
			return ((value & 1) == 0 ? value + 1 : value);
		}

		@Override
		public float ceilOddZero(float value)
		{
			if(value == 0.0f || !Float.isFinite(value)) return value;
			
			double val = Math.ceil(value);
			return (float)(((long)val & 1) == 0 ? val + 1 : val);
		}

		@Override
		public float ceilOddZeroI2F(int value)
		{
			if(value == 0) return 0.0f;
			
			return ((value & 1) == 0 ? value + 1 : value);
		}

		@Override
		public long ceilOddZeroD2L(double value)
		{
			if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			if(value == 0.0) return (long)value;
			
			double val = Math.ceil(value);
			return (long)(((long)val & 1) == 0 ? val + 1 : val);
		}

		@Override
		public long ceilOddZeroF2L(float value)
		{
			if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			if(value == 0.0f) return (long)value;
			
			double val = Math.ceil(value);
			return (long)(((long)val & 1) == 0 ? val + 1 : val);
		}

		@Override
		public long ceilOddZero(long value)
		{
			if(value == 0) return 0l;
			
			return ((value & 1) == 0 ? value + 1 : value);
		}

		@Override
		public long ceilOddZeroI2L(int value)
		{
			if(value == 0) return 0l;
			
			return ((value & 1) == 0 ? value + 1 : value);
		}

		@Override
		public int ceilOddZeroF2I(float value)
		{
			if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			if(value == 0.0f) return (int)value;
			
			double val = Math.ceil(value);
			return (int)(((long)val & 1) == 0 ? val + 1 : val);
		}

		@Override
		public int ceilOddZero(int value)
		{
			if(value == 0) return 0;
			
			return ((value & 1) == 0 ? value + 1 : value);
		}

		@Override
		public double floorEven(double value)
		{
			if(value == 0.0 || !Double.isFinite(value)) return value;
			
			double val = Math.floor(value);
			return (((long)val & 1) == 0 ? val : val - 1);
		}

		@Override
		public double floorEvenF2D(float value)
		{
			if(value == 0.0f || !Float.isFinite(value)) return value;
			
			double val = Math.floor(value);
			return (((long)val & 1) == 0 ? val : val - 1);
		}

		@Override
		public double floorEvenL2D(long value)
		{
			if(value == 0l) return 0.0;
			
			return ((value & 1) == 0 ? value : value - 1);
		}

		@Override
		public double floorEvenI2D(int value)
		{
			if(value == 0) return 0.0;
			
			return ((value & 1) == 0 ? value : value - 1);
		}

		@Override
		public float floorEven(float value)
		{
			if(value == 0.0f || !Float.isFinite(value)) return value;
			
			double val = Math.floor(value);
			return (float)(((long)val & 1) == 0 ? val : val - 1);
		}

		@Override
		public float floorEvenI2F(int value)
		{
			if(value == 0) return 0.0f;
			
			return ((value & 1) == 0 ? value : value - 1);
		}

		@Override
		public long floorEvenD2L(double value)
		{
			if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			if(value == 0.0) return 0l;
			
			double val = Math.floor(value);
			return (long)(((long)val & 1) == 0 ? val : val - 1);
		}

		@Override
		public long floorEvenF2L(float value)
		{
			if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			if(value == 0.0f) return 0l;
			
			double val = Math.floor(value);
			return (long)(((long)val & 1) == 0 ? val : val - 1);
		}

		@Override
		public long floorEven(long value)
		{
			if(value == 0l) return 0l;
			
			return ((value & 1) == 0 ? value : value - 1);
		}

		@Override
		public long floorEvenI2L(int value)
		{
			if(value == 0) return 0l;
			
			return ((value & 1) == 0 ? value : value - 1);
		}

		@Override
		public int floorEvenF2I(float value)
		{
			if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			if(value == 0.0f) return 0;
			
			double val = Math.floor(value);
			return (int)(((long)val & 1) == 0 ? val : val - 1);
		}

		@Override
		public int floorEven(int value)
		{
			if(value == 0) return 0;
			
			return ((value & 1) == 0 ? value : value - 1);
		}

		@Override
		public double floorOdd(double value)
		{
			if(!Double.isFinite(value)) return value;
			
			double val = Math.floor(value);
			return (((long)val & 1) == 0 ? val - 1 : val);
		}

		@Override
		public double floorOddF2D(float value)
		{
			if(!Float.isFinite(value)) return value;
			
			double val = Math.floor(value);
			return (((long)val & 1) == 0 ? val - 1 : val);
		}

		@Override
		public double floorOddL2D(long value)
		{
			return ((value & 1) == 0 ? value - 1 : value);
		}

		@Override
		public double floorOddI2D(int value)
		{
			return ((value & 1) == 0 ? value - 1 : value);
		}

		@Override
		public float floorOdd(float value)
		{
			if(!Float.isFinite(value)) return value;
			
			double val = Math.floor(value);
			return (float)(((long)val & 1) == 0 ? val - 1 : val);
		}

		@Override
		public float floorOddI2F(int value)
		{
			return ((value & 1) == 0 ? value - 1 : value);
		}

		@Override
		public long floorOddD2L(double value)
		{
			if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			
			double val = Math.floor(value);
			return (long)(((long)val & 1) == 0 ? val - 1 : val);
		}

		@Override
		public long floorOddF2L(float value)
		{
			if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			
			double val = Math.floor(value);
			return (long)(((long)val & 1) == 0 ? val - 1 : val);
		}

		@Override
		public long floorOdd(long value)
		{
			return ((value & 1) == 0 ? value - 1 : value);
		}

		@Override
		public long floorOddI2L(int value)
		{
			return ((value & 1) == 0 ? value - 1 : value);
		}

		@Override
		public int floorOddF2I(float value)
		{
			if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			
			double val = Math.floor(value);
			return (int)(((long)val & 1) == 0 ? val - 1 : val);
		}

		@Override
		public int floorOdd(int value)
		{
			return ((value & 1) == 0 ? value - 1 : value);
		}

		@Override
		public double floorOddZero(double value)
		{
			if(value == 0.0 || !Double.isFinite(value)) return value;
			
			double val = Math.floor(value);
			return (((long)val & 1) == 0 ? val - 1 : val);
		}

		@Override
		public double floorOddZeroF2D(float value)
		{
			if(value == 0.0f || !Float.isFinite(value)) return value;
			
			double val = Math.floor(value);
			return (((long)val & 1) == 0 ? val - 1 : val);
		}

		@Override
		public double floorOddZeroL2D(long value)
		{
			if(value == 0) return 0.0;
			
			return ((value & 1) == 0 ? value - 1 : value);
		}

		@Override
		public double floorOddZeroI2D(int value)
		{
			if(value == 0) return 0.0;
			
			return ((value & 1) == 0 ? value - 1 : value);
		}

		@Override
		public float floorOddZero(float value)
		{
			if(value == 0.0f || !Float.isFinite(value)) return value;
			
			double val = Math.floor(value);
			return (float)(((long)val & 1) == 0 ? val - 1 : val);
		}

		@Override
		public float floorOddZeroI2F(int value)
		{
			if(value == 0) return 0.0f;
			
			return ((value & 1) == 0 ? value - 1 : value);
		}

		@Override
		public long floorOddZeroD2L(double value)
		{
			if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			if(value == 0.0) return 0l;
			
			double val = Math.floor(value);
			return (long)(((long)val & 1) == 0 ? val - 1 : val);
		}

		@Override
		public long floorOddZeroF2L(float value)
		{
			if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			if(value == 0.0f) return 0l;
			
			double val = Math.floor(value);
			return (long)(((long)val & 1) == 0 ? val - 1 : val);
		}

		@Override
		public long floorOddZero(long value)
		{
			if(value == 0) return 0l;
			
			return ((value & 1) == 0 ? value - 1 : value);
		}

		@Override
		public long floorOddZeroI2L(int value)
		{
			if(value == 0) return 0l;
			
			return ((value & 1) == 0 ? value - 1 : value);
		}

		@Override
		public int floorOddZeroF2I(float value)
		{
			if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			if(value == 0.0f) return 0;
			
			double val = Math.floor(value);
			return (int)(((long)val & 1) == 0 ? val - 1 : val);
		}

		@Override
		public int floorOddZero(int value)
		{
			if(value == 0) return 0;
			
			return ((value & 1) == 0 ? value - 1 : value);
		}

		@Override
		public double roundEven(double value)
		{
			if(value == 0.0 || !Double.isFinite(value)) return value;
			
			double mid = (long)(value * 0.5) * 2.0 + Math.signum(value);
			return (mid + (value >= mid ? 1 : -1)); 
		}

		@Override
		public double roundEvenF2D(float value)
		{
			if(value == 0.0f || !Float.isFinite(value)) return value;
			
			double mid = (long)(value * 0.5) * 2.0 + Math.signum(value);
			return (mid + (value >= mid ? 1 : -1)); 
		}

		@Override
		public float roundEven(float value)
		{
			if(value == 0.0 || !Float.isFinite(value)) return value;
			
			double mid = (long)(value * 0.5) * 2.0 + Math.signum(value);
			return (float)(mid + (value >= mid ? 1 : -1)); 
		}
		
		@Override
		public long roundEvenD2L(double value)
		{
			if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			if(value == 0.0) return 0l;
			
			double mid = (long)(value * 0.5) * 2.0 + Math.signum(value);
			return (long)(mid + (value >= mid ? 1 : -1)); 
		}

		@Override
		public long roundEvenF2L(float value)
		{
			if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			if(value == 0.0f) return 0l;
			
			double mid = (long)(value * 0.5) * 2.0 + Math.signum(value);
			return (long)(mid + (value >= mid ? 1 : -1)); 
		}

		@Override
		public int roundEvenF2I(float value)
		{
			if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			if(value == 0.0f) return 0;
			
			double mid = (long)(value * 0.5) * 2.0 + Math.signum(value);
			return (int)(mid + (value >= mid ? 1 : -1)); 
		}

		@Override
		public double roundOdd(double value)
		{
			if(!Double.isFinite(value)) return value;
			
			double mid = (long)((value + 1) * 0.5) * 2.0 - 1.0 + (value == 0.0 ? 1 : Math.signum(value));
			return (mid + (value >= mid ? 1 : -1)); 
		}

		@Override
		public double roundOddF2D(float value)
		{
			if(!Float.isFinite(value)) return value;
			
			double mid = (long)((value + 1) * 0.5) * 2.0 - 1.0 + (value == 0.0 ? 1 : Math.signum(value));
			return (mid + (value >= mid ? 1 : -1)); 
		}

		@Override
		public float roundOdd(float value)
		{
			if(!Float.isFinite(value)) return value;
			
			double mid = (long)((value + 1) * 0.5) * 2.0 - 1.0 + (value == 0.0 ? 1 : Math.signum(value));
			return (float)(mid + (value >= mid ? 1 : -1)); 
		}

		@Override
		public long roundOddD2L(double value)
		{
			if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			
			double mid = (long)((value + 1) * 0.5) * 2.0 - 1.0 + (value == 0.0 ? 1 : Math.signum(value));
			return (long)(mid + (value >= mid ? 1 : -1)); 
		}

		@Override
		public long roundOddF2L(float value)
		{
			if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			
			double mid = (long)((value + 1) * 0.5) * 2.0 - 1.0 + (value == 0.0 ? 1 : Math.signum(value));
			return (long)(mid + (value >= mid ? 1 : -1)); 
		}

		@Override
		public int roundOddF2I(float value)
		{
			if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			
			double mid = (long)((value + 1) * 0.5) * 2.0 - 1.0 + (value == 0.0 ? 1 : Math.signum(value));
			return (int)(mid + (value >= mid ? 1 : -1)); 
		}

		@Override
		public double roundOddZero(double value)
		{
			if(value == 0.0 || !Double.isFinite(value)) return value;
			
			double mid = (long)((value + 1) * 0.5) * 2.0 - 1.0 + Math.signum(value);
			return (mid + (value >= mid ? 1 : -1)); 
		}

		@Override
		public double roundOddZeroF2D(float value)
		{
			if(value == 0.0f || !Float.isFinite(value)) return value;
			
			double mid = (long)((value + 1) * 0.5) * 2.0 - 1.0 + Math.signum(value);
			return (mid + (value >= mid ? 1 : -1)); 
		}
		
		@Override
		public float roundOddZero(float value)
		{
			if(value == 0.0f || !Float.isFinite(value)) return value;
			
			double mid = (long)((value + 1) * 0.5) * 2.0 - 1.0 + Math.signum(value);
			return (float)(mid + (value >= mid ? 1 : -1)); 
		}

		@Override
		public long roundOddZeroD2L(double value)
		{
			if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			if(value == 0.0) return 0l;
			
			double mid = (long)((value + 1) * 0.5) * 2.0 - 1.0 + (value == 0.0 ? 1 : Math.signum(value));
			return (long)(mid + (value >= mid ? 1 : -1)); 
		}

		@Override
		public long roundOddZeroF2L(float value)
		{
			if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			if(value == 0.0f) return 0l;
			
			double mid = (long)((value + 1) * 0.5) * 2.0 - 1.0 + (value == 0.0 ? 1 : Math.signum(value));
			return (long)(mid + (value >= mid ? 1 : -1)); 
		}

		@Override
		public int roundOddZeroF2I(float value)
		{
			if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			if(value == 0.0f) return 0;
			
			double mid = (long)((value + 1) * 0.5) * 2.0 - 1.0 + (value == 0.0 ? 1 : Math.signum(value));
			return (int)(mid + (value >= mid ? 1 : -1)); 
		}

		@Override
		public double ceilMultiple(double value, double x)
		{
			if(value == 0.0) return 0;
			
			return (Math.ceil(value / x) * x);
		}

		@Override
		public double ceilMultipleF2D(float value, double x)
		{
			if(value == 0.0f) return 0;
			
			return (Math.ceil(value / x) * x);
		}

		@Override
		public double ceilMultipleL2D(long value, double x)
		{
			if(value == 0l) return 0;
			
			return (Math.ceil(value / x) * x);
		}

		@Override
		public double ceilMultipleI2D(int value, double x)
		{
			if(value == 0) return 0;
			
			return (Math.ceil(value / x) * x);
		}

		@Override
		public float ceilMultiple(float value, float x)
		{
			if(value == 0.0f) return 0.0f;
			
			return (float)(Math.ceil(value / x) * x);
		}

		@Override
		public float ceilMultipleI2F(int value, float x)
		{
			if(value == 0) return 0.0f;
			
			return (float)(Math.ceil(value / x) * x);
		}

		@Override
		public long ceilMultipleD2L(double value, long x)
		{
			if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			if(value == 0.0) return 0l;
			
			return (long)(Math.ceil(value / x) * x);
		}

		@Override
		public long ceilMultipleF2L(float value, long x)
		{
			if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			if(value == 0.0f) return 0l;
			
			return (long)(Math.ceil(value / x) * x);
		}

		@Override
		public long ceilMultiple(long value, long x)
		{
			if(value == 0l) return 0l;
			
			return (long)(Math.ceil(value / x) * x);
		}

		@Override
		public long ceilMultipleI2L(int value, long x)
		{
			if(value == 0) return 0l;
			
			return (long)(Math.ceil(value / x) * x);
		}

		@Override
		public int ceilMultipleF2I(float value, int x)
		{
			if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			if(value == 0.0f) return 0;
			
			return (int)(Math.ceil(value / x) * x);
		}

		@Override
		public int ceilMultiple(int value, int x)
		{
			if(value == 0.0f) return 0;
			
			return (int)(Math.ceil(value / x) * x);
		}

		@Override
		public double floorMultiple(double value, double x)
		{
			if(value == 0.0) return 0.0;
			
			return (Math.floor(value / x) * x);
		}

		@Override
		public double floorMultipleF2D(float value, double x)
		{
			if(value == 0.0f) return 0.0;
			
			return (Math.floor(value / x) * x);
		}

		@Override
		public double floorMultipleL2D(long value, double x)
		{
			if(value == 0l) return 0.0;
			
			return (Math.floor(value / x) * x);
		}

		@Override
		public double floorMultipleI2D(int value, double x)
		{
			if(value == 0) return 0.0;
			
			return (Math.floor(value / x) * x);
		}

		@Override
		public float floorMultiple(float value, float x)
		{
			if(value == 0.0f) return 0.0f;
			
			return (float)(Math.floor(value / x) * x);
		}

		@Override
		public float floorMultipleI2F(int value, float x)
		{
			if(value == 0) return 0.0f;
			
			return (float)(Math.floor(value / x) * x);
		}

		@Override
		public long floorMultipleD2L(double value, long x)
		{
			if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			if(value == 0.0) return 0l;
			
			return (long)(Math.floor(value / x) * x);
		}

		@Override
		public long floorMultipleF2L(float value, long x)
		{
			if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			if(value == 0.0f) return 0l;
			
			return (long)(Math.floor(value / x) * x);
		}

		@Override
		public long floorMultiple(long value, long x)
		{
			if(value == 0l) return 0l;
			
			return (long)(Math.floor(value / x) * x);
		}

		@Override
		public long floorMultipleI2L(int value, long x)
		{
			if(value == 0) return 0l;
			
			return (long)(Math.floor(value / x) * x);
		}

		@Override
		public int floorMultipleF2I(float value, int x)
		{
			if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			if(value == 0.0f) return 0;
			
			return (int)(Math.floor(value / x) * x);
		}

		@Override
		public int floorMultiple(int value, int x)
		{
			if(value == 0) return 0;
			
			return (int)(Math.floor(value / x) * x);
		}

		@Override
		public double roundMultiple(double value, double x)
		{
			if(value == 0.0) return 0.0;
			
			return (Math.round(value / x) * x);
		}

		@Override
		public double roundMultipleF2D(float value, double x)
		{
			if(value == 0.0f) return 0.0;
			
			return (Math.round(value / x) * x);
		}

		@Override
		public double roundMultipleL2D(long value, double x)
		{
			if(value == 0l) return 0.0;
			
			return (Math.round(value / x) * x);
		}

		@Override
		public double roundMultipleI2D(int value, double x)
		{
			if(value == 0) return 0.0;
			
			return (Math.round(value / x) * x);
		}

		@Override
		public float roundMultiple(float value, float x)
		{
			if(value == 0.0f) return 0.0f;
			
			return (float)(Math.round(value / x) * x);
		}

		@Override
		public float roundMultipleI2F(int value, float x)
		{
			if(value == 0) return 0.0f;
			
			return (float)(Math.round(value / x) * x);
		}

		@Override
		public long roundMultipleD2L(double value, long x)
		{
			if(!Double.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			if(value == 0.0) return 0l;
			
			return (long)(Math.round(value / x) * x);
		}

		@Override
		public long roundMultipleF2L(float value, long x)
		{
			if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			if(value == 0.0f) return 0l;
			
			return (long)(Math.round(value / x) * x);
		}

		@Override
		public long roundMultiple(long value, long x)
		{
			if(value == 0l) return 0l;
			
			return (long)(Math.round(value / x) * x);
		}

		@Override
		public long roundMultipleI2L(int value, long x)
		{
			if(value == 0) return 0l;
			
			return (long)(Math.round(value / x) * x);
		}

		@Override
		public int roundMultipleF2I(float value, int x)
		{
			if(!Float.isFinite(value)) throw new NumberFormatException("Infinite or NaN");
			if(value == 0.0f) return 0;
			
			return (int)(Math.round(value / x) * x);
		}

		@Override
		public int roundMultiple(int value, int x)
		{
			if(value == 0) return 0;
			
			return (int)(Math.round(value / x) * x);
		}
	}
}
