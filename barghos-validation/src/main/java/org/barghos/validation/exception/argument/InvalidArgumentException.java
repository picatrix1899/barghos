package org.barghos.validation.exception.argument;

/**
 * Thrown to indicate that a function argument has an invalid or unexpected
 * value. Unlike {@link IllegalArgumentException} this provides the possibility
 * to specify and access the argument name outside of the message.
 */
public class InvalidArgumentException extends IllegalArgumentException
{
	/**
	 * This constant contains the current version of this class.
	 * It is used to distinguish between different serialized versions of this
	 * class.
	 */
	private static final long serialVersionUID = 1L;
	
	private final String argument;
	
	/**
	 * Create a new instance of the exception without any additional details.
	 */
	public InvalidArgumentException()
	{
		super();
		
		this.argument = null;
	}
	
	/**
	 * Creates a new instance of the exception with an argument name as
	 * additional information.
	 * 
	 * @param argument The name of the argument that was null.
	 */
	public InvalidArgumentException(String argument)
	{
		super();
		
		this.argument = argument;
	}
	
	/**
	 * Creates a new instance of the exception with an argument name and a
	 * custom message as additional information.
	 * 
	 * @param argument The name of the argument that was null.
	 * @param message A custom exception message.
	 */
	public InvalidArgumentException(String argument, String message)
	{
		super(message);
		
		this.argument = argument;
	}
	
	/**
	 * Returns the name of the argument for which this exception was created
	 * for.
	 * 
	 * @return The argument name.
	 */
	public String getArgument()
	{
		return this.argument;
	}

	/**
	 * Returns if the name of the argument was specified for which this
	 * exception was created for.
	 * 
	 * @return True, if the name was specified.
	 */
	public boolean hasArgument()
	{
		return this.argument != null;
	}
	
	/**
	 * Returns the localized custom message for this exception.
	 * 
	 * @return The custom message.
	 */
	public String getLocalizedCustomMessage()
	{
		return getCustomMessage();
	}
	
	/**
	 * Returns the custom message for this exception.
	 * 
	 * @return The custom message.
	 */
	public String getCustomMessage()
	{
		return super.getMessage();
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getLocalizedMessage()
	{
		return getMessage();
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
		if(!hasArgument()) return "One argument is invalid.";
		
		StringBuilder builder = new StringBuilder();

		builder.append("The argument ");
		builder.append("\"").append(getArgument()).append("\" ");
		builder.append("is invalid.");
		
		return builder.toString();
	}
}
