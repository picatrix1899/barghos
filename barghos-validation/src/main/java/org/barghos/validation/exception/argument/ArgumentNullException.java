package org.barghos.validation.exception.argument;

public class ArgumentNullException extends ArgumentInvalidException
{

	private static final long serialVersionUID = 1L;

	protected ArgumentNullException()
	{
		super();
	}
	
	public ArgumentNullException(String parameter)
	{
		super(parameter);
	}
	
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