package org.barghos.validation.exception.argument;

/**
 * Thrown to indicate that a function argument is a collection with an invalid
 * or unexpected size. This extends {@link InvalidArgumentException} by the
 * possibility to specify and access also the argument size outside of the
 * message.
 */
public class InvalidArgumentSizeException extends InvalidArgumentException
{
	/**
	 * This constant contains the current version of this class.
	 * It is used to distinguish between different serialized versions of this
	 * class.
	 */
	private static final long serialVersionUID = 1L;
	
	private final long size;
	private final boolean hasSize;
	
	/**
	 * Creates a new instance of the exception without any additional details.
	 */
	public InvalidArgumentSizeException()
	{
		super();
		
		this.size = -1;
		this.hasSize = false;
	}
	
	/**
	 * Creates a new instance of the exception with an argument name and the
	 * argument size as additional information.
	 * 
	 * @param argument The name of the argument that was null.
	 * @param size The size of the argument.
	 */
	public InvalidArgumentSizeException(String argument, long size)
	{
		super(argument);
		
		this.size = size;
		this.hasSize = true;
	}
	
	/**
	 * Creates a new instance of the exception with an argument name, the
	 * argument size and a custom message as additional information.
	 * 
	 * @param argument The name of the argument that was null.
	 * @param size The size of the argument.
	 * @param message A custom exception message.
	 */
	public InvalidArgumentSizeException(String argument, long size, String message)
	{
		super(argument, message);
		
		this.size = size;
		this.hasSize = true;
	}
	
	/**
	 * Returns the size of the argument for which this exception was created
	 * for.
	 * 
	 * @return The argument size.
	 */
	public Object getSize()
	{
		return this.size;
	}
	
	/**
	 * Returns if the size of the argument was specified for which this
	 * exception was created for.
	 * 
	 * @return True, if the size was specified.
	 */
	public boolean hasSize()
	{
		return this.hasSize;
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
		if(!hasArgument()) return "One argument has an invalid or unexpected size.";
		
		StringBuilder builder = new StringBuilder();

		builder.append("The argument ");
		builder.append("\"").append(getArgument()).append("\" ");
		builder.append("has the invalid or unexpected size ");
		builder.append("\"").append(getSize()).append("\".");
		
		return builder.toString();
	}
}
