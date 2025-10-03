package org.barghos.validation.exception.argument;

public class ArgumentSizeTooSmallException extends ArgumentSizeInvalidException
{
	private static final long serialVersionUID = 1L;
	
	private Object minSize;
	
	protected ArgumentSizeTooSmallException()
	{
		super();
	}
	
	public ArgumentSizeTooSmallException(String argument, Object size, Object minSize)
	{
		super(argument, size);
		
		this.minSize = minSize;
	}
	
	public ArgumentSizeTooSmallException(String argument, Object size, Object minSize, String message)
	{
		super(argument, size, message);
		
		this.minSize = minSize;
	}
	
	public Object minSize()
	{
		return this.minSize;
	}
	
	@Override
	public String localizationKey()
	{
		return "exception.argument.sizetoosmall";
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
		builder.append("which is smaller than the required minimum size of ");
		builder.append("\"").append(minSize()).append("\" entries.");
		
		return builder.toString();
	}
}
