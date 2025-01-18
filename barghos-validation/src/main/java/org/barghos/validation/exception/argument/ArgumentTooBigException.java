package org.barghos.validation.exception.argument;

import org.barghos.validation.internal.Nullable;

/**
 * Thrown to indicate that a function argument has a value which is above an
 * expected maximum. This extends {@link InvalidArgumentValueException} by the
 * possibility to specify and access also the maximum value outside of the
 * message.
 */
public class ArgumentTooBigException extends ArgumentInvalidException
{
	/**
	 * This constant contains the current version of this class.
	 * It is used to distinguish between different serialized versions of this
	 * class.
	 */
	private static final long serialVersionUID = 1L;

	private Object max;
	private Nullable<Object> tolerance = new Nullable<>();
	
	/**
	 * Create a new instance of the exception without any additional details.
	 */
	protected ArgumentTooBigException()
	{
		super();
	}
	
	/**
	 * Creates a new instance of the exception with an argument name, the
	 * argument value and the expected maximum value for the argument as
	 * additional information.
	 * 
	 * @param argument The name of the argument that was out of range.
	 * @param value The value of the argument.
	 * @param max The maximum allowed value for the argument.
	 */
	public ArgumentTooBigException(String argument, Object value, Object max)
	{
		super(argument, value);
		
		this.max = max;
	}
	
	/**
	 * Creates a new instance of the exception with an argument name, the
	 * argument value and the expected maximum value for the argument as
	 * additional information.
	 * 
	 * @param argument The name of the argument that was out of range.
	 * @param value The value of the argument.
	 * @param max The maximum allowed value for the argument.
	 */
	public ArgumentTooBigException(String argument, Object value, Object max, Object tolerance)
	{
		super(argument, value);
		
		this.max = max;
		this.tolerance.set(tolerance);
	}
	
	/**
	 * Creates a new instance of the exception with an argument name, the
	 * argument value, the expected maximum value for the argument and a custom
	 * message as additional information.
	 * 
	 * @param argument The name of the argument that was out of range.
	 * @param value The value of the argument.
	 * @param max The maximum allowed value for the argument.
	 * @param message A custom exception message.
	 */
	public ArgumentTooBigException(String argument, Object value, Object max, String message)
	{
		super(argument, value, message);
		
		this.max = max;
	}
	
	/**
	 * Creates a new instance of the exception with an argument name, the
	 * argument value, the expected maximum value for the argument and a custom
	 * message as additional information.
	 * 
	 * @param argument The name of the argument that was out of range.
	 * @param value The value of the argument.
	 * @param max The maximum allowed value for the argument.
	 * @param message A custom exception message.
	 */
	public ArgumentTooBigException(String argument, Object value, Object max, Object tolerance, String message)
	{
		super(argument, value, message);
		
		this.max = max;
		this.tolerance.set(tolerance);
	}
	
	/**
	 * Returns the expected maximum value for the argument for which this
	 * exception was created for.
	 * 
	 * @return The expected maximum value.
	 */
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
		builder.append("which is greater than the expected maximum value ");
		builder.append("inclusive \"").append(max()).append("\" ");
		if(hasTolerance()) builder.append("with a tolerance of \"").append(tolerance()).append("\" ");
		builder.append(".");
		
		return builder.toString();
	}
}
