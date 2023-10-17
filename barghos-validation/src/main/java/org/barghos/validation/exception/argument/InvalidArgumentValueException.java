package org.barghos.validation.exception.argument;

/**
 * Thrown to indicate that a function argument has an invalid or unexpected value.
 * This extends {@link InvalidArgumentException} by the possibility to specify
 * and access also the argument value outside of the message.
 */
public class InvalidArgumentValueException extends InvalidArgumentException
{
	/**
	 * This constant contains the current version of this class.
	 * It is used to distinguish between different serialized versions of this class.
	 */
	private static final long serialVersionUID = 1L;
	
	private final Object value;
	private final boolean hasValue;
	
	/**
	 * Create a new instance of the exception without any additional details.
	 */
	public InvalidArgumentValueException()
	{
		super();
		
		this.value = null;
		this.hasValue = false;
	}
	
	/**
	 * Creates a new instance of the exception with an argument name and the argument value as additional information.
	 * 
	 * @param argument The name of the argument that was null.
	 * @param value The value of the argument.
	 */
	public InvalidArgumentValueException(String argument, Object value)
	{
		super(argument);
		
		this.value = value;
		this.hasValue = true;
	}
	
	/**
	 * Creates a new instance of the exception with an argument name, the argument value and a custom message as additional information.
	 * 
	 * @param argument The name of the argument that was null.
	 * @param value The value of the argument.
	 * @param message A custom exception message.
	 */
	public InvalidArgumentValueException(String argument, Object value, String message)
	{
		super(argument, message);
		
		this.value = value;
		this.hasValue = true;
	}
	
	/**
	 * Returns the value of the argument for which this exception was created for.
	 * @return The argument value.
	 */
	public Object getValue()
	{
		return this.value;
	}
	
	/**
	 * Returns if the value of the argument was specified for which this exception was created for.
	 * 
	 * @return True, if the value was specified.
	 */
	public boolean hasValue()
	{
		return this.hasValue;
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
		if(!hasArgument()) return "One argument has an invalid or unexpected value.";
		
		StringBuilder builder = new StringBuilder();

		builder.append("The argument ");
		builder.append("\"").append(getArgument()).append("\" ");
		builder.append("has the invalid or unexpected value ");
		builder.append("\"").append(getValue()).append("\".");
		
		return builder.toString();
	}
}
