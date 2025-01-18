package org.barghos.validation.exception.argument;

/**
 * This exception indicates that a method has been passed an argument that is
 * null but must not be null. It extends the {@link ArgumentInvalidException}.
 */
public class ArgumentNullException extends ArgumentInvalidException
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
	protected ArgumentNullException()
	{
		super();
	}
	
	/**
	 * Creates a new instance of the exception with an argument name as
	 * additional information.
	 * 
	 * @param argument The name of the argument that was null.
	 */
	public ArgumentNullException(String parameter)
	{
		super(parameter);
	}
	
	/**
	 * Creates a new instance of the exception with an argument name and a
	 * custom message as additional information.
	 * 
	 * @param argument The name of the argument that was null.
	 * @param message A custom exception message.
	 */
	public ArgumentNullException(String parameter, String message)
	{
		super(parameter, message);
	}
	
	@Override
	public String localizationKey()
	{
		return "exception.argument.null";
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String defaultMessage()
	{
		StringBuilder builder = new StringBuilder();

		builder.append("The parameter argument ");
		builder.append("\"").append(parameter()).append("\" ");
		builder.append("is null but must not be null.");
		
		return builder.toString();
	}
}