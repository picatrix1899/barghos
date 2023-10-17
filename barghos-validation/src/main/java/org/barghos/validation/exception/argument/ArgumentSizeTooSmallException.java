package org.barghos.validation.exception.argument;

/**
 * Thrown to indicate that a function argument is a collection with a size below a required
 * minimum.
 * This extends {@link InvalidArgumentSizeException} by the possibility to specify
 * and access also the expected minimum size outside of the message.
 */
public class ArgumentSizeTooSmallException extends InvalidArgumentSizeException
{
	/**
	 * This constant contains the current version of this class.
	 * It is used to distinguish between different serialized versions of this class.
	 */
	private static final long serialVersionUID = 1L;
	
	private final long minSize;
	private final boolean hasMinSize;
	
	/**
	 * Create a new instance of the exception without any additional details.
	 */
	public ArgumentSizeTooSmallException()
	{
		super();
		
		this.minSize = -1;
		this.hasMinSize = false;
	}
	
	/**
	 * Creates a new instance of the exception with an argument name, the argument size and the required minimum as additional information.
	 * 
	 * @param argument The name of the argument that was null.
	 * @param size The size of the argument.
	 * @param minSize The required minimum size for the argument.
	 */
	public ArgumentSizeTooSmallException(String argument, long size, long minSize)
	{
		super(argument, size);
		
		this.minSize = minSize;
		this.hasMinSize = true;
	}
	
	/**
	 * Creates a new instance of the exception with an argument name, the argument size, the required minimum and a custom message as additional information.
	 * 
	 * @param argument The name of the argument that was null.
	 * @param size The size of the argument.
	 * @param minSize The required minimum size for the argument.
	 * @param message A custom exception message.
	 */
	public ArgumentSizeTooSmallException(String argument, long size, long minSize, String message)
	{
		super(argument, size, message);
		
		this.minSize = minSize;
		this.hasMinSize = true;
	}
	
	/**
	 * Returns the required minimum size for the argument for which this exception was created for.
	 * 
	 * @return The required minimum size for the argument.
	 */
	public Object getMinSize()
	{
		return this.minSize;
	}
	
	/**
	 * Returns if the required minimum size for the argument was specified for which this exception was created for.
	 * 
	 * @return True, if the required minimum size was specified.
	 */
	public boolean hasMinSize()
	{
		return this.hasMinSize;
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
		if(!hasArgument()) return "One argument has a size which is smaller than the required minimum size.";
		
		StringBuilder builder = new StringBuilder();

		builder.append("The argument ");
		builder.append("\"").append(getArgument()).append("\" ");
		builder.append("has a size ");
		builder.append("\"").append(getSize()).append("\" entries. ");
		builder.append("which is smaller than the required minimum size of ");
		builder.append("\"").append(getMinSize()).append("\" entries.");
		
		return builder.toString();
	}
}
