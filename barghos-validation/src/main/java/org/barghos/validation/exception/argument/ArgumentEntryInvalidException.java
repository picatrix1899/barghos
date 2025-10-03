package org.barghos.validation.exception.argument;

import org.barghos.validation.internal.Nullable;

public class ArgumentEntryInvalidException extends ArgumentInvalidException
{
	private static final long serialVersionUID = 1L;

	private Nullable<Object> index = new Nullable<>();
	
	protected ArgumentEntryInvalidException()
	{
		super();
	}
	
	public ArgumentEntryInvalidException(String parameter)
	{
		super(parameter);
	}
	
	public ArgumentEntryInvalidException(String parameter, Object index)
	{
		super(parameter);
		
		this.index.set(index);
	}
	
	public ArgumentEntryInvalidException(String parameter, String message)
	{
		super(parameter, message);
	}
	
	public ArgumentEntryInvalidException(String parameter, Object index, String message)
	{
		super(parameter, message);
		
		this.index.set(index);
	}
	
	public Object index()
	{
		return this.index.value();
	}
	
	public boolean hasIndex()
	{
		return this.index.isSet();
	}
	
	@Override
	public String localizationKey()
	{
		return "exception.argument.entryinvalid";
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
		builder.append("contains an invalid entry ");
		if(hasIndex()) builder.append("at index \"").append(index()).append("\" ");
		builder.append(".");
		
		return builder.toString();
	}
}