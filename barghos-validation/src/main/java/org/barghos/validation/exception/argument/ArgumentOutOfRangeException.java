package org.barghos.validation.exception.argument;

import org.barghos.validation.internal.Nullable;

public class ArgumentOutOfRangeException extends ArgumentInvalidException
{
	private static final long serialVersionUID = 1L;

	private Object min;
	private Object max;
	
	private Nullable<Object> tolerance = new Nullable<>();
	
	/**
	 * Create a new instance of the exception without any additional details.
	 */
	protected ArgumentOutOfRangeException()
	{
		super();
	}
	
	public ArgumentOutOfRangeException(String parameter, Object argument, Object min, Object max)
	{
		super(parameter, argument);
		
		this.min = min;
		this.max = max;
	}
	
	public ArgumentOutOfRangeException(String parameter, Object argument, Object min, Object max, Object tolerance)
	{
		super(parameter, argument);
		
		this.min = min;
		this.max = max;
		
		this.tolerance.set(tolerance);
	}
	
	public ArgumentOutOfRangeException(String parameter, Object argument, Object min, Object max, String message)
	{
		super(parameter, argument, message);
		
		this.min = min;
		this.max = max;
	}
	
	public ArgumentOutOfRangeException(String parameter, Object argument, Object min, Object max, Object tolerance, String message)
	{
		super(parameter, argument, message);
		
		this.min = min;
		this.max = max;
		
		this.tolerance.set(tolerance);
	}
	
	public Object min()
	{
		return this.min;
	}
	
	public Object max()
	{
		return this.max;
	}
	
	public boolean hasTolerance()
	{
		return this.tolerance.isSet();
	}
	
	public Object tolerance()
	{
		return this.tolerance.value();
	}
	
	@Override
	public String localizationKey()
	{
		return "exception.argument.outofrange";
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String defaultMessage()
	{
		StringBuilder builder = new StringBuilder();

		builder.append("The argument ");
		builder.append("\"").append(parameter()).append("\" ");
		builder.append("has the value ");
		builder.append("\"").append(argument()).append("\" ");
		builder.append("which is out of the expected range ");
		builder.append("from inclusive \"").append(min()).append("\" ");
		builder.append("to inclusive \"").append(max()).append("\" ");
		if(hasTolerance()) builder.append("with a tolerance of \"").append(tolerance()).append("\" ");
		builder.append("\".");
		
		return builder.toString();
	}
}
