package org.barghos.validation.exception.argument;

import org.barghos.validation.internal.Nullable;

/**
 * Thrown to indicate that a function argument has a value which is out of the
 * expected range. This extends {@link InvalidArgumentValueException} by the
 * possibility to specify and access also the minimum and maximum value outside
 * of the message.
 */
public class ArgumentOutOfRangeException extends ArgumentInvalidException
{
	/**
	 * This constant contains the current version of this class.
	 * It is used to distinguish between different serialized versions of this
	 * class.
	 */
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
	
	/**
	 * Creates a new instance of the exception with an argument name, the
	 * argument value and the expected minimum and maximum values for the
	 * argument as additional information.
	 * 
	 * @param argument The name of the argument that was out of range.
	 * @param value The value of the argument.
	 * @param min The minimum allowed value for the argument.
	 * @param max The maximum allowed value for the argument.
	 */
	public ArgumentOutOfRangeException(String parameter, Object argument, Object min, Object max)
	{
		super(parameter, argument);
		
		this.min = min;
		this.max = max;
	}
	
	/**
	 * Creates a new instance of the exception with an argument name, the
	 * argument value and the expected minimum and maximum values for the
	 * argument as additional information.
	 * 
	 * @param argument The name of the argument that was out of range.
	 * @param value The value of the argument.
	 * @param min The minimum allowed value for the argument.
	 * @param max The maximum allowed value for the argument.
	 */
	public ArgumentOutOfRangeException(String parameter, Object argument, Object min, Object max, Object tolerance)
	{
		super(parameter, argument);
		
		this.min = min;
		this.max = max;
		
		this.tolerance.set(tolerance);
	}
	
	/**
	 * Creates a new instance of the exception with an argument name, the
	 * argument value, the expected minimum and maximum values for the argument
	 * and a custom message as additional information.
	 * 
	 * @param argument The name of the argument that was out of range.
	 * @param value The value of the argument.
	 * @param min The minimum allowed value for the argument.
	 * @param max The maximum allowed value for the argument.
	 * @param message A custom exception message.
	 */
	public ArgumentOutOfRangeException(String parameter, Object argument, Object min, Object max, String message)
	{
		super(parameter, argument, message);
		
		this.min = min;
		this.max = max;
	}
	
	/**
	 * Creates a new instance of the exception with an argument name, the
	 * argument value, the expected minimum and maximum values for the argument
	 * and a custom message as additional information.
	 * 
	 * @param argument The name of the argument that was out of range.
	 * @param value The value of the argument.
	 * @param min The minimum allowed value for the argument.
	 * @param max The maximum allowed value for the argument.
	 * @param message A custom exception message.
	 */
	public ArgumentOutOfRangeException(String parameter, Object argument, Object min, Object max, Object tolerance, String message)
	{
		super(parameter, argument, message);
		
		this.min = min;
		this.max = max;
		
		this.tolerance.set(tolerance);
	}
	
	/**
	 * Returns the expected minimum value for the argument for which this
	 * exception was created for.
	 * 
	 * @return The expected minimum value..
	 */
	public Object min()
	{
		return this.min;
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
