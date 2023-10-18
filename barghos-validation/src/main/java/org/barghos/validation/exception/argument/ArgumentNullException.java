package org.barghos.validation.exception.argument;

/**
 * This exception indicates that a method has been passed an argument that is
 * null but must not be null. It extends the {@link IllegalArgumentException}.
 */
public class ArgumentNullException extends InvalidArgumentException
{
	/**
	 * This constant contains the current version of this class.
	 * It is used to distinguish between different serialized versions of this
	 * class.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create a new instance of the exception without any additional details.
	 */
	public ArgumentNullException()
	{
		super();
	}
	
	/**
	 * Creates a new instance of the exception with an argument name as
	 * additional information.
	 * 
	 * @param argument The name of the argument that was null.
	 */
	public ArgumentNullException(String argument)
	{
		super(argument);
	}
	
	/**
	 * Creates a new instance of the exception with an argument name and a
	 * custom message as additional information.
	 * 
	 * @param argument The name of the argument that was null.
	 * @param message A custom exception message.
	 */
	public ArgumentNullException(String argument, String message)
	{
		super(argument, message);
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
		String argument = getArgument();
		boolean hasArgument = argument != null && !argument.isBlank();
		
		StringBuilder builder = new StringBuilder();

		if(hasArgument)
		{
			builder.append("The argument ");
			builder.append("\"").append(argument).append("\" ");
		}
		else
		{
			builder.append("One argument ");
		}
		
		builder.append("is null but must not be null.");
		
		return builder.toString();
	}
}