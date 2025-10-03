package org.barghos.validation.exception.argument;

public class ArgumentSizeInvalidException extends ArgumentInvalidException
{
	private static final long serialVersionUID = 1L;
	
	private Object size;
	
	protected ArgumentSizeInvalidException()
	{
		super();
	}
	
	public ArgumentSizeInvalidException(String argument, Object size)
	{
		super(argument);
		
		this.size = size;
	}
	
	public ArgumentSizeInvalidException(String argument, Object size, String message)
	{
		super(argument, message);
		
		this.size = size;
	}
	
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
