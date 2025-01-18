package org.barghos.validation.exception.argument;

/**
 * Thrown to indicate that a function argument is a collection with a size below
 * a required minimum. This extends {@link InvalidArgumentSizeException} by the
 * possibility to specify and access also the expected minimum size outside of
 * the message.
 */
public class ArgumentSizeTooBigException extends ArgumentSizeInvalidException
{
	/**
	 * This constant contains the current version of this class.
	 * It is used to distinguish between different serialized versions of this
	 * class.
	 */
	private static final long serialVersionUID = 1L;
	
	private Object maxSize;
	
	/**
	 * Create a new instance of the exception without any additional details.
	 */
	protected ArgumentSizeTooBigException()
	{
		super();
	}
	
	/**
	 * Creates a new instance of the exception with an argument name, the
	 * argument size and the required minimum as additional information.
	 * 
	 * @param argument The name of the argument that was null.
	 * @param size The size of the argument.
	 * @param minSize The required minimum size for the argument.
	 */
	public ArgumentSizeTooBigException(String argument, Object size, Object maxSize)
	{
		super(argument, size);
		
		this.maxSize = maxSize;
	}
	
	/**
	 * Creates a new instance of the exception with an argument name, the
	 * argument size, the required minimum and a custom message as additional
	 * information.
	 * 
	 * @param argument The name of the argument that was null.
	 * @param size The size of the argument.
	 * @param minSize The required minimum size for the argument.
	 * @param message A custom exception message.
	 */
	public ArgumentSizeTooBigException(String argument, Object size, Object maxSize, String message)
	{
		super(argument, size, message);
		
		this.maxSize = maxSize;
	}
	
	/**
	 * Returns the required minimum size for the argument for which this
	 * exception was created for.
	 * 
	 * @return The required minimum size for the argument.
	 */
	public Object maxSize()
	{
		return this.maxSize;
	}
	
	@Override
	public String localizationKey()
	{
		return "exception.argument.sizetoobig";
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
		builder.append("has a size ");
		builder.append("\"").append(size()).append("\" entries. ");
		builder.append("which is bigger than the required maximum size of ");
		builder.append("\"").append(maxSize()).append("\" entries.");
		
		return builder.toString();
	}
}
