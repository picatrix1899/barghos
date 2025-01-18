package org.barghos.validation.exception.argument;

/**
 * Thrown to indicate that a function argument is a collection with an invalid
 * or unexpected size. This extends {@link InvalidArgumentException} by the
 * possibility to specify and access also the argument size outside of the
 * message.
 */
public class ArgumentSizeInvalidException extends ArgumentInvalidException
{
	/**
	 * This constant contains the current version of this class.
	 * It is used to distinguish between different serialized versions of this
	 * class.
	 */
	private static final long serialVersionUID = 1L;
	
	private Object size;
	
	/**
	 * Creates a new instance of the exception without any additional details.
	 */
	protected ArgumentSizeInvalidException()
	{
		super();
	}
	
	/**
	 * Creates a new instance of the exception with an argument name and the
	 * argument size as additional information.
	 * 
	 * @param argument The name of the argument that was null.
	 * @param size The size of the argument.
	 */
	public ArgumentSizeInvalidException(String argument, Object size)
	{
		super(argument);
		
		this.size = size;
	}
	
	/**
	 * Creates a new instance of the exception with an argument name, the
	 * argument size and a custom message as additional information.
	 * 
	 * @param argument The name of the argument that was null.
	 * @param size The size of the argument.
	 * @param message A custom exception message.
	 */
	public ArgumentSizeInvalidException(String argument, Object size, String message)
	{
		super(argument, message);
		
		this.size = size;
	}
	
	/**
	 * Returns the size of the argument for which this exception was created
	 * for.
	 * 
	 * @return The argument size.
	 */
	public Object size()
	{
		return this.size;
	}
	
	@Override
	public String localizationKey()
	{
		return "exception.argument.sizeinvalid";
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
		builder.append("has the invalid or unexpected size ");
		builder.append("\"").append(size()).append("\".");
		
		return builder.toString();
	}
}
