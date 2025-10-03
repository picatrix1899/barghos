package org.barghos.validation.exception.argument;

import org.barghos.validation.internal.Nullable;

public class ArgumentInvalidException extends RuntimeException implements LocalizableException
{
	private static final long serialVersionUID = 1L;
	
	private String parameter;
	private Nullable<String> customMessage = new Nullable<>();
	private Nullable<Object> argument = new Nullable<>();
	
	protected ArgumentInvalidException()
	{
		super();
	}
	
	public ArgumentInvalidException(String parameter)
	{
		super();
		
		this.parameter = parameter;
	}

	public ArgumentInvalidException(String parameter, String message)
	{
		super();

		this.parameter = parameter;
		this.customMessage.set(message);
	}

	public ArgumentInvalidException(String parameter, Object argument)
	{
		super();
		
		this.parameter = parameter;
		this.argument.set(argument);
	}

	public ArgumentInvalidException(String parameter, Object argument, String message)
	{
		super(message);
		
		this.parameter = parameter;
		this.argument.set(argument);
		this.customMessage.set(message);
	}

	public String parameter()
	{
		return this.parameter;
	}
	
	public Object argument()
	{
		return this.argument.value();
	}
	
	public boolean hasArgument()
	{
		return this.argument.isSet();
	}

	public String customMessage()
	{
		return this.customMessage();
	}
	
	public boolean hasCustomMessage()
	{
		return this.customMessage.isSet() && this.customMessage.value() != null && !this.customMessage.value().isBlank();
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String localizationKey()
	{
		return "exception.argument.invalid";
	}

	public String defaultMessage()
	{
		StringBuilder builder = new StringBuilder();

		builder.append("The argument of the parameter ");
		builder.append("\"").append(parameter()).append("\" ");
		builder.append("is invalid.");
		
		return builder.toString();
	}
	
	public String message()
	{
		if(hasCustomMessage()) return customMessage();
		
		return defaultMessage();
	}
	
	public String localizedMessage()
	{
		return message();
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public final String getLocalizedMessage()
	{
		return localizedMessage();
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public final String getMessage()
	{
		return message();
	}
}
