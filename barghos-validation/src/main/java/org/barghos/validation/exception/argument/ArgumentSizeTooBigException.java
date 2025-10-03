package org.barghos.validation.exception.argument;

public class ArgumentSizeTooBigException extends ArgumentSizeInvalidException
{
	private static final long serialVersionUID = 1L;
	
	private Object maxSize;
	
	protected ArgumentSizeTooBigException()
	{
		super();
	}
	
	public ArgumentSizeTooBigException(String argument, Object size, Object maxSize)
	{
		super(argument, size);
		
		this.maxSize = maxSize;
	}
	
	public ArgumentSizeTooBigException(String argument, Object size, Object maxSize, String message)
	{
		super(argument, size, message);
		
		this.maxSize = maxSize;
	}
	
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
