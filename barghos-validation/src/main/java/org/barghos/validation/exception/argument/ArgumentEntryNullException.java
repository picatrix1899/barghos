package org.barghos.validation.exception.argument;

import org.barghos.validation.internal.Nullable;

public class ArgumentEntryNullException extends ArgumentEntryInvalidException
{
	private static final long serialVersionUID = 1L;

	private Nullable<Object> index = new Nullable<>();
	
	protected ArgumentEntryNullException()
	{
		super();
	}
	
	public ArgumentEntryNullException(String parameter)
	{
		super(parameter);
	}
	
	public ArgumentEntryNullException(String parameter, Object index)
	{
		super(parameter);
		
		this.index.set(index);
	}

	public ArgumentEntryNullException(String parameter, String message)
	{
		super(parameter, message);
	}

	public ArgumentEntryNullException(String parameter, Object index, String message)
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
		return "exception.argument.entrynull";
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
		builder.append("contains a null entry ");
		if(hasIndex()) builder.append("at index \"").append(index()).append("\" ");
		builder.append(".");
		
		return builder.toString();
	}
}