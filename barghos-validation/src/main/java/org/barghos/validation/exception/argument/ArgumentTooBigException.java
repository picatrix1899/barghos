package org.barghos.validation.exception.argument;

import org.barghos.validation.internal.Nullable;

public class ArgumentTooBigException extends ArgumentInvalidException
{
	private static final long serialVersionUID = 1L;

	private Object max;
	private Nullable<Object> tolerance = new Nullable<>();
	
	protected ArgumentTooBigException()
	{
		super();
	}
	
	public ArgumentTooBigException(String argument, Object value, Object max)
	{
		super(argument, value);
		
		this.max = max;
	}
	
	public ArgumentTooBigException(String argument, Object value, Object max, Object tolerance)
	{
		super(argument, value);
		
		this.max = max;
		this.tolerance.set(tolerance);
	}
	
	public ArgumentTooBigException(String argument, Object value, Object max, String message)
	{
		super(argument, value, message);
		
		this.max = max;
	}
	
	public ArgumentTooBigException(String argument, Object value, Object max, Object tolerance, String message)
	{
		super(argument, value, message);
		
		this.max = max;
		this.tolerance.set(tolerance);
	}
	
	public Object max()
	{
		return this.max;
	}
	
	public Object tolerance()
	{
		return this.tolerance.value();
	}
	
	public boolean hasTolerance()
	{
		return this.tolerance.isSet();
	}
	
	@Override
	public String localizationKey()
	{
		return "exception.argument.toobig";
	}
	
	@Override
	public String defaultMessage()
	{
		StringBuilder builder = new StringBuilder();

		builder.append("The argument ");
		builder.append("\"").append(parameter()).append("\" ");
		builder.append("has the value ");
		builder.append("\"").append(argument()).append("\" ");
		builder.append("which is greater than the expected maximum value ");
		builder.append("inclusive \"").append(max()).append("\" ");
		if(hasTolerance()) builder.append("with a tolerance of \"").append(tolerance()).append("\" ");
		builder.append(".");
		
		return builder.toString();
	}
}
