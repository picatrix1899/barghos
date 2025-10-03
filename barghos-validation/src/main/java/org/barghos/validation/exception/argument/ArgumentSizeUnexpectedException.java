package org.barghos.validation.exception.argument;

public class ArgumentSizeUnexpectedException extends ArgumentSizeInvalidException
{
	private static final long serialVersionUID = 1L;
	
	private Object expectedSize;
	
	protected ArgumentSizeUnexpectedException()
	{
		super();
	}
	
	public ArgumentSizeUnexpectedException(String argument, Object size, Object expectedSize)
	{
		super(argument, size);
		
		this.expectedSize = expectedSize;
	}
	
	public ArgumentSizeUnexpectedException(String argument, Object size, Object expectedSize, String message)
	{
		super(argument, size, message);
		
		this.expectedSize = expectedSize;
	}
	
	public Object expectedSize()
	{
		return this.expectedSize;
	}
	
	@Override
	public String localizationKey()
	{
		return "exception.argument.sizeunexpected";
	}
	
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
