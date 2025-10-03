package org.barghos.validation.exception.argument;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.barghos.validation.internal.Nullable;

public class ArgumentTooSmallException extends ArgumentInvalidException
{
	private static final long serialVersionUID = 1L;

	private Object min;
	private Nullable<Object> tolerance = new Nullable<>();
	
	protected ArgumentTooSmallException()
	{
		super();
	}
	
	public ArgumentTooSmallException(String parameter, Object argument, Object min)
	{
		super(parameter, argument);
		
		this.min = min;
	}
	
	public ArgumentTooSmallException(String parameter, Object argument, Object min, Object tolerance)
	{
		super(parameter, argument);
		
		this.min = min;
		this.tolerance.set(tolerance);
	}
	
	public ArgumentTooSmallException(String parameter, Object argument, Object min, String message)
	{
		super(parameter, argument, message);
		
		this.min = min;
	}
	
	public ArgumentTooSmallException(String parameter, Object argument, Object min, Object tolerance, String message)
	{
		super(parameter, argument, message);
		
		this.min = min;
		this.tolerance.set(tolerance);
	}
	
	public Object min()
	{
		return this.min;
	}
	
	public byte minB()
	{
		return (byte)this.min;
	}
	
	public short minS()
	{
		return (short)this.min;
	}
	
	public char minC()
	{
		return (char)this.min;
	}
	
	public int minI()
	{
		return (int)this.min;
	}
	
	public long minL()
	{
		return (long)this.min;
	}
	
	public float minF()
	{
		return (float)this.min;
	}
	
	public double minD()
	{
		return (double)this.min;
	}
	
	public BigDecimal minBigd()
	{
		return (BigDecimal)this.min;
	}
	
	public BigInteger minBigi()
	{
		return (BigInteger)this.min;
	}
	
	public Object tolerance()
	{
		return this.tolerance.value();
	}
	
	public byte toleranceB()
	{
		return (byte)this.tolerance.value();
	}
	
	public short toleranceS()
	{
		return (short)this.tolerance.value();
	}
	
	public char toleranceC()
	{
		return (char)this.tolerance.value();
	}
	
	public int toleranceI()
	{
		return (int)this.tolerance.value();
	}
	
	public long toleranceL()
	{
		return (long)this.tolerance.value();
	}
	
	public float toleranceF()
	{
		return (float)this.tolerance.value();
	}
	
	public double toleranceD()
	{
		return (double)this.tolerance.value();
	}
	
	public BigDecimal toleranceBigd()
	{
		return (BigDecimal)this.tolerance.value();
	}
	
	public BigInteger toleranceBigi()
	{
		return (BigInteger)this.tolerance.value();
	}
	
	public boolean hasTolerance()
	{
		return this.tolerance.isSet();
	}
	
	@Override
	public String localizationKey()
	{
		return "exception.argument.toosmall";
	}
	
	@Override
	public String defaultMessage()
	{
		StringBuilder builder = new StringBuilder();

		builder.append("The argument ");
		builder.append("\"").append(parameter()).append("\" ");
		builder.append("has the value ");
		builder.append("\"").append(argument()).append("\" ");
		builder.append("which is smaller than the expected minimum value ");
		builder.append("inclusive \"").append(min()).append("\" ");
		if(hasTolerance()) builder.append("with a tolerance of \"").append(tolerance()).append("\" ");
		builder.append(".");
		
		return builder.toString();
	}
}
