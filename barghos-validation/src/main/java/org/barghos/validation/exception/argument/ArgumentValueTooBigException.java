package org.barghos.validation.exception.argument;

/**
 * Thrown to indicate that a function argument has a value which is above an expected
 * maximum.
 * This extends {@link InvalidArgumentValueException} by the possibility to specify
 * and access also the maximum value outside of the message.
 */
public class ArgumentValueTooBigException extends InvalidArgumentValueException
{
	/**
	 * This constant contains the current version of this class.
	 * It is used to distinguish between different serialized versions of this class.
	 */
	private static final long serialVersionUID = 1L;

	private final Object max;
	private final boolean hasMax;
	
	/**
	 * Create a new instance of the exception without any additional details.
	 */
	public ArgumentValueTooBigException()
	{
		super();
		
		this.max = null;
		this.hasMax = false;
	}
	
	/**
	 * Creates a new instance of the exception with an argument name, the argument value and
	 * the expected maximum value for the argument as additional information.
	 * 
	 * @param argument The name of the argument that was out of range.
	 * @param value The value of the argument.
	 * @param max The maximum allowed value for the argument.
	 */
	public ArgumentValueTooBigException(String argument, Object value, Object max)
	{
		super(argument, value);
		
		this.max = max;
		this.hasMax = true;
	}
	
	/**
	 * Creates a new instance of the exception with an argument name, the argument value,
	 * the expected maximum value for the argument and a custom message as additional information.
	 * 
	 * @param argument The name of the argument that was out of range.
	 * @param value The value of the argument.
	 * @param max The maximum allowed value for the argument.
	 * @param message A custom exception message.
	 */
	public ArgumentValueTooBigException(String argument, Object value, Object max, String message)
	{
		super(argument, value, message);
		
		this.max = max;
		this.hasMax = true;
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
	 * Returns if the expected maximum value for the argument for which this exception was created for was specified.
	 * 
	 * @return True, if the expected maximum was specified.
	 */
	public boolean hasMax()
	{
		return this.hasMax;
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
		if(!hasArgument()) return "One argument has a value which is greater than the expected maximum value.";
		
		StringBuilder builder = new StringBuilder();

		builder.append("The argument ");
		builder.append("\"").append(getArgument()).append("\" ");
		builder.append("has the value ");
		builder.append("\"").append(getValue()).append("\" ");
		builder.append("which is greater than the expected maximum value ");
		builder.append("inclusive \"").append(getMax()).append("\".");
		
		return builder.toString();
	}
}
