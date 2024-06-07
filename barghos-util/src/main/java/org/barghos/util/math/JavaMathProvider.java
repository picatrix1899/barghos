package org.barghos.util.math;

import java.math.BigDecimal;
import java.math.BigInteger;

public class JavaMathProvider implements MathProvider
{
	public boolean useFMA = true;
	
	public double floor(double value)
	{
		return Math.floor(value);
	}

	public float floor(float value)
	{
		return (float)Math.floor(0);
	}

	public double ceil(double value)
	{
		return Math.ceil(value);
	}

	public float ceil(float value)
	{
		return (float)Math.ceil(value);
	}

	public double round(double value)
	{
		return Math.round(value);
	}

	public float round(float value)
	{
		return Math.round(value);
	}

	public double trunc(double value)
	{
		return 0;
	}

	public float trunc(float value)
	{
		return 0;
	}

	public double sqrt(double value)
	{
		return Math.sqrt(value);
	}

	public float sqrt(float value)
	{
		return (float)Math.sqrt(value);
	}

	public double invSqrt(double value)
	{
		return 1.0 / Math.sqrt(value);
	}

	public float invSqrt(float value)
	{
		return (float)(1.0 / Math.sqrt(value));
	}
	
	public double min(double a, double b)
	{
		return Math.min(a, b);
	}

	public float min(float a, float b)
	{
		return Math.min(a, b);
	}

	public double max(double a, double b)
	{
		return Math.max(a, b);
	}

	public float max(float a, float b)
	{
		return Math.max(a, b);
	}

	public BigDecimal abs(BigDecimal value)
	{
		return value.abs();
	}
	
	public BigInteger abs(BigInteger value)
	{
		return value.abs();
	}
	
	public double abs(double value)
	{
		return Math.abs(value);
	}

	public float abs(float value)
	{
		return Math.abs(value);
	}

	public float abs(long value)
	{
		return Math.abs(value);
	}
	
	public float abs(int value)
	{
		return Math.abs(value);
	}
	
	public float abs(short value)
	{
		return Math.abs(value);
	}
	
	public float abs(byte value)
	{
		return Math.abs(value);
	}
	
	public boolean isZero(BigDecimal value)
	{
		return value.compareTo(BigDecimal.ZERO) == 0;
	}
	
	public boolean isZero(BigInteger value)
	{
		return value.compareTo(BigInteger.ZERO) == 0;
	}
	
	public boolean isZero(double value)
	{
		return value == 0.0f;
	}

	public boolean isZero(float value)
	{
		return value == 0.0;
	}

	public boolean isZero(long value)
	{
		return value == 0;
	} 
	
	public boolean isZero(int value)
	{
		return value == 0;
	} 
	
	public boolean isZero(short value)
	{
		return value == 0;
	} 
	
	public boolean isZero(byte value)
	{
		return value == 0;
	} 
	
	public boolean isZero(BigDecimal tolerance, BigDecimal value)
	{
		return value.abs().compareTo(tolerance) <= 0;
	}
	
	public boolean isZero(BigInteger tolerance, BigInteger value)
	{
		return value.abs().compareTo(tolerance) <= 0;
	}
	
	public boolean isZero(float tolerance, float value)
	{
		return Math.abs(value) <= tolerance;
	}

	public boolean isZero(double tolerance, double value)
	{
		return Math.abs(value) <= tolerance;
	}

	public boolean isZero(long tolerance, long value)
	{
		return Math.abs(value) <= tolerance;
	}
	
	public boolean isZero(int tolerance, int value)
	{
		return Math.abs(value) <= tolerance;
	}
	
	public boolean isZero(short tolerance, short value)
	{
		return Math.abs(value) <= tolerance;
	}
	
	public boolean isZero(byte tolerance, byte value)
	{
		return Math.abs(value) <= tolerance;
	}
	
	public double signum(double value)
	{
		return Math.signum(value);
	}

	public float signum(float value)
	{
		return Math.signum(value);
	}

	public float lerp(float a, float b, float alpha)
	{
		return 0;
	}

	public double lerp(double a, double b, double alpha)
	{
		return 0;
	}

	public double sin(double angle)
	{
		return Math.sin(angle);
	}

	public float sin(float angle)
	{
		return (float)Math.sin(angle);
	}

	public double cos(double angle)
	{
		return Math.cos(angle);
	}

	public float cos(float angle)
	{
		return (float)Math.cos(angle);
	}

	public double fma(double a, double b, double c)
	{
		if(this.useFMA)
			return Math.fma(a, b, c);
		return a * b + c;
	}

	public float fma(float a, float b, float c)
	{
		if(this.useFMA)
			return Math.fma(a, b, c);
		
		return a * b + c;
	}

	public double acos(double value)
	{
		return Math.acos(value);
	}

	public float acos(float value)
	{
		return (float)Math.acos(value);
	}

	public double atan2(double y, double x)
	{
		return Math.atan2(y, x);
	}

	public float atan2(float y, float x)
	{
		return (float)Math.atan2(y, x);
	}

	public int compare(BigDecimal a, BigDecimal b)
	{
		return a.compareTo(b);
	}
	
	public int compare(BigInteger a, BigInteger b)
	{
		return a.compareTo(b);
	}
	
	public int compare(double a, double b)
	{
		return Double.compare(a, b);
	}

	public int compare(float a, float b)
	{
		return Float.compare(a, b);
	}
	
	public int compare(long a, long b)
	{
		return Long.compare(a, b);
	}
	
	public int compare(int a, int b)
	{
		return Integer.compare(a, b);
	}
	
	public int compare(short a, short b)
	{
		return Short.compare(a, b);
	}
	
	public int compare(byte a, byte b)
	{
		return Byte.compare(a, b);
	}
	
	public int compare(BigDecimal tolerance, BigDecimal a, BigDecimal b)
	{
		if(a.subtract(b).abs().compareTo(tolerance) <= 0) return 0;
		
		return a.compareTo(b);
	}
	
	public int compare(BigInteger tolerance, BigInteger a, BigInteger b)
	{
		if(a.subtract(b).abs().compareTo(tolerance) <= 0) return 0;
		
		return a.compareTo(b);
	}
	
	public int compare(double tolerance, double a, double b)
	{
		if(abs(a - b) <= tolerance) return 0;
		
		return Double.compare(a, b);
	}

	public int compare(float tolerance, float a, float b)
	{
		if(abs(a - b) <= tolerance) return 0;
		
		return Float.compare(a, b);
	}
	
	public int compare(long tolerance, long a, long b)
	{
		if(abs(a - b) <= tolerance) return 0;
		
		return Long.compare(a, b);
	}
	
	public int compare(int tolerance, int a, int b)
	{
		if(abs(a - b) <= tolerance) return 0;
		
		return Integer.compare(a, b);
	}
	
	public int compare(short tolerance, short a, short b)
	{
		if(abs(a - b) <= tolerance) return 0;
		
		return Short.compare(a, b);
	}
	
	public int compare(byte tolerance, byte a, byte b)
	{
		if(abs(a - b) <= tolerance) return 0;
		
		return Byte.compare(a, b);
	}
	
	public boolean equals(BigDecimal a, BigDecimal b)
	{
		return a.compareTo(b) == 0;
	}
	
	public boolean equals(BigInteger a, BigInteger b)
	{
		return a.compareTo(b) == 0;
	}
	
	public boolean equals(double a, double b)
	{
		return a == b;
	}
	
	public boolean equals(float a, float b)
	{
		return a == b;
	}
	
	public boolean equals(long a, long b)
	{
		return a == b;
	}
	
	public boolean equals(int a, int b)
	{
		return a == b;
	}
	
	public boolean equals(short a, short b)
	{
		return a == b;
	}
	
	public boolean equals(byte a, byte b)
	{
		return a == b;
	}
	
	public boolean equals(BigDecimal tolerance, BigDecimal a, BigDecimal b)
	{
		return a.subtract(b).abs().compareTo(tolerance) <= 0;
	}
	
	public boolean equals(BigInteger tolerance, BigInteger a, BigInteger b)
	{
		return a.subtract(b).abs().compareTo(tolerance) <= 0;
	}
	
	public boolean equals(double tolerance, double a, double b)
	{
		return abs(a - b) <= tolerance;
	}
	
	public boolean equals(float tolerance, float a, float b)
	{
		return abs(a - b) <= tolerance;
	}
	
	public boolean equals(long tolerance, long a, long b)
	{
		return abs(a - b) <= tolerance;
	}
	
	public boolean equals(int tolerance, int a, int b)
	{
		return abs(a - b) <= tolerance;
	}
	
	public boolean equals(short tolerance, short a, short b)
	{
		return abs(a - b) <= tolerance;
	}
	
	public boolean equals(byte tolerance, byte a, byte b)
	{
		return abs(a - b) <= tolerance;
	}
}
