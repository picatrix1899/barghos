package org.barghos.validation.exception.argument;

/**
 * Thrown to indicate that a function argument is a collection with an
 * unexpected size. This extends {@link InvalidArgumentSizeException} by the
 * possibility to specify and access also the expected size outside of the
 * message.
 */
public class ArgumentSizeUnexpectedException extends ArgumentSizeInvalidException
{
	/**
	 * This constant contains the current version of this class.
	 * It is used to distinguish between different serialized versions of this
	 * class.
	 */
	private static final long serialVersionUID = 1L;
	
	private Object expectedSize;
	
	/**
	 * Create a new instance of the exception without any additional details.
	 */
	protected ArgumentSizeUnexpectedException()
	{
		super();
	}
	
	/**
	 * Creates a new instance of the exception with an argument name, the
	 * argument size and the expected size for the argument as additional
	 * information.
	 * 
	 * @param argument The name of the argument that was null.
	 * @param size The size of the argument.
	 * @param expectedSize The expected size for the argument.
	 */
	public ArgumentSizeUnexpectedException(String argument, Object size, Object expectedSize)
	{
		super(argument, size);
		
		this.expectedSize = expectedSize;
	}
	
	/**
	 * Creates a new instance of the exception with an argument name, the
	 * argument size, the expected size for the argument and a custom message as
	 * additional information.
	 * 
	 * @param argument The name of the argument that was null.
	 * @param size The size of the argument.
	 * @param expectedSize The expected size for the argument.
	 * @param message A custom exception message.
	 */
	public ArgumentSizeUnexpectedException(String argument, Object size, Object expectedSize, String message)
	{
		super(argument, size, message);
		
		this.expectedSize = expectedSize;
	}
	
	/**
	 * Returns the expected size for the argument for which this exception was
	 * created for.
	 * 
	 * @return The expected size for the argument.
	 */
	public Object expectedSize()
	{
		return this.expectedSize;
	}
	
	@Override
	public String localizationKey()
	{
		return "exception.argument.sizeunexpected";
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
		builder.append("has the unexpected size of");
		builder.append("\"").append(size()).append("\" entries. ");
		builder.append("The expectation was a size of ");
		builder.append("\"").append(expectedSize()).append("\" entries.");
		
		return builder.toString();
	}
}
