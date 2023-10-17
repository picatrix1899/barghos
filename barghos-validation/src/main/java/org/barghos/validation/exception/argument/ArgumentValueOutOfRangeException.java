package org.barghos.validation.exception.argument;

/**
 * Thrown to indicate that a function argument has a value which is out of the
 * expected range.
 * This extends {@link InvalidArgumentValueException} by the possibility to specify
 * and access also the minimum and maximum value outside of the message.
 */
public class ArgumentValueOutOfRangeException extends InvalidArgumentValueException
{
	/**
	 * This constant contains the current version of this class.
	 * It is used to distinguish between different serialized versions of this class.
	 */
	private static final long serialVersionUID = 1L;

	private final Object min;
	private final Object max;
	private final boolean hasBounds;
	
	/**
	 * Create a new instance of the exception without any additional details.
	 */
	public ArgumentValueOutOfRangeException()
	{
		super();
		
		this.min = null;
		this.max = null;
		this.hasBounds = false;
	}
	
	/**
	 * Creates a new instance of the exception with an argument name, the argument value and the
	 * expected minimum and maximum values for the argument as additional information.
	 * 
	 * @param argument The name of the argument that was out of range.
	 * @param value The value of the argument.
	 * @param min The minimum allowed value for the argument.
	 * @param max The maximum allowed value for the argument.
	 */
	public ArgumentValueOutOfRangeException(String argument, Object value, Object min, Object max)
	{
		super(argument, value);
		
		this.min = min;
		this.max = max;
		this.hasBounds = true;
	}
	
	/**
	 * Creates a new instance of the exception with an argument name, the argument value, the
	 * expected minimum and maximum values for the argument and a custom message as additional information.
	 * 
	 * @param argument The name of the argument that was out of range.
	 * @param value The value of the argument.
	 * @param min The minimum allowed value for the argument.
	 * @param max The maximum allowed value for the argument.
	 * @param message A custom exception message.
	 */
	public ArgumentValueOutOfRangeException(String argument, Object value, Object min, Object max, String message)
	{
		super(argument, value, message);
		
		this.min = min;
		this.max = max;
		this.hasBounds = true;
	}
	
	/**
	 * Returns the expected minimum value for the argument for which this exception was created for.
	 * 
	 * @return The expected minimum value..
	 */
	public Object getMin()
	{
		return this.min;
	}
	
	/**
	 * Returns the expected maximum value for the argument for which this exception was created for.
	 * 
	 * @return The expected maximum value.
	 */
	public Object getMax()
	{
		return this.max;
	}
	
	/**
	 * Returns if the expected minimum and maximum value bounds for the argument for which this exception was created for were specified.
	 * 
	 * @return True, if the expected minimum and maximum bounds were specified.
	 */
	public boolean hasBounds()
	{
		return this.hasBounds;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getMessage()
	{
		/*
		 * If a custom message is provided only output that.
		 */
		String customMsg = getCustomMessage();
		if(customMsg != null && !customMsg.isBlank())
		{
			return customMsg;
		}
		
		/*
		 * If no custom message is provided build and return the default
		 * one.
		 */
		if(!hasArgument()) return "One argument has a value which is out of expected range.";
		
		StringBuilder builder = new StringBuilder();

		builder.append("The argument ");
		builder.append("\"").append(getArgument()).append("\" ");
		builder.append("has the value ");
		builder.append("\"").append(getValue()).append("\" ");
		builder.append("which is out of the expected range ");
		builder.append("from inclusive \"").append(getMin()).append("\" ");
		builder.append("to inclusive \"").append(getMax()).append("\".");
		
		return builder.toString();
	}
}
