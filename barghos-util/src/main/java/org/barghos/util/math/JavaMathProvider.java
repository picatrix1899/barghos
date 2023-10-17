package org.barghos.util.math;

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

	public double abs(double value)
	{
		return Math.abs(value);
	}

	public float abs(float value)
	{
		return Math.abs(value);
	}

	public boolean isExactlyZero(double value)
	{
		return value == 0.0f;
	}

	public boolean isExactlyZero(float value)
	{
		return value == 0.0;
	}

	public boolean isZero(float value, float tolerance)
	{
		return Math.abs(value) <= tolerance;
	}

	public boolean isZero(double value, double tolerance)
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

}
