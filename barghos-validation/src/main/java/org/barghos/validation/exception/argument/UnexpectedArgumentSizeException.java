package org.barghos.validation.exception.argument;

/**
 * Thrown to indicate that a function argument is a collection with an unexpected size.
 * This extends {@link InvalidArgumentSizeException} by the possibility to specify
 * and access also the expected size outside of the message.
 */
public class UnexpectedArgumentSizeException extends InvalidArgumentSizeException
{
	/**
	 * This constant contains the current version of this class.
	 * It is used to distinguish between different serialized versions of this class.
	 */
	private static final long serialVersionUID = 1L;
	
	private final long expectedSize;
	private final boolean hasExpectedSize;
	
	/**
	 * Create a new instance of the exception without any additional details.
	 */
	public UnexpectedArgumentSizeException()
	{
		super();
		
		this.expectedSize = -1;
		this.hasExpectedSize = false;
	}
	
	/**
	 * Creates a new instance of the exception with an argument name, the argument size and
	 * the expected size for the argument as additional information.
	 * 
	 * @param argument The name of the argument that was null.
	 * @param size The size of the argument.
	 * @param expectedSize The expected size for the argument.
	 */
	public UnexpectedArgumentSizeException(String argument, long size, long expectedSize)
	{
		super(argument, size);
		
		this.expectedSize = expectedSize;
		this.hasExpectedSize = true;
	}
	
	/**
	 * Creates a new instance of the exception with an argument name, the argument size,
	 * the expected size for the argument and a custom message as additional information.
	 * 
	 * @param argument The name of the argument that was null.
	 * @param size The size of the argument.
	 * @param expectedSize The expected size for the argument.
	 * @param message A custom exception message.
	 */
	public UnexpectedArgumentSizeException(String argument, long size, long expectedSize, String message)
	{
		super(argument, size, message);
		
		this.expectedSize = expectedSize;
		this.hasExpectedSize = true;
	}
	
	/**
	 * Returns the expected size for the argument for which this exception was created for.
	 * 
	 * @return The expected size for the argument.
	 */
	public Object getExpectedSize()
	{
		return this.expectedSize;
	}
	
	/**
	 * Returns if the expected size for the argument was specified for which this exception was created for.
	 * 
	 * @return True, if the expected size was specified.
	 */
	public boolean hasSize()
	{
		return this.hasExpectedSize;
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
		if(!hasArgument()) return "One argument has an unexpected size.";
		
		StringBuilder builder = new StringBuilder();

		builder.append("The argument ");
		builder.append("\"").append(getArgument()).append("\" ");
		builder.append("has the unexpected size of");
		builder.append("\"").append(getSize()).append("\" entries. ");
		builder.append("The expectation was a size of ");
		builder.append("\"").append(getExpectedSize()).append("\" entries.");
		
		return builder.toString();
	}
}
