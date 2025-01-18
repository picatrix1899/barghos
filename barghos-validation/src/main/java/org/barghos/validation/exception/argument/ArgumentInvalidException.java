package org.barghos.validation.exception.argument;

import org.barghos.validation.internal.Nullable;

/**
 * Thrown to indicate that a function argument has an invalid or unexpected
 * value. Unlike {@link IllegalArgumentException} this provides the possibility
 * to specify and access the argument name outside of the message.
 */
public class ArgumentInvalidException extends RuntimeException implements LocalizableException
{
	/**
	 * This constant contains the current version of this class.
	 * It is used to distinguish between different serialized versions of this
	 * class.
	 */
	private static final long serialVersionUID = 1L;
	
	private String parameter;
	private Nullable<String> customMessage = new Nullable<>();
	private Nullable<Object> argument = new Nullable<>();
	
	/**
	 * Creates a new instance of the exception with an argument name as
	 * additional information.
	 * 
	 * @param argument The name of the argument that was null.
	 */
	protected ArgumentInvalidException()
	{
		super();
	}
	
	/**
	 * Creates a new instance of the exception with an argument name as
	 * additional information.
	 * 
	 * @param argument The name of the argument that was null.
	 */
	public ArgumentInvalidException(String parameter)
	{
		super();
		
		this.parameter = parameter;
	}
	
	/**
	 * Creates a new instance of the exception with an argument name and a
	 * custom message as additional information.
	 * 
	 * @param argument The name of the argument that was null.
	 * @param message A custom exception message.
	 */
	public ArgumentInvalidException(String parameter, String message)
	{
		super();

		this.parameter = parameter;
		this.customMessage.set(message);
	}
	
	/**
	 * Creates a new instance of the exception with an argument name and a
	 * custom message as additional information.
	 * 
	 * @param argument The name of the argument that was null.
	 * @param message A custom exception message.
	 */
	public ArgumentInvalidException(String parameter, Object argument)
	{
		super();
		
		this.parameter = parameter;
		this.argument.set(argument);
	}
	
	/**
	 * Creates a new instance of the exception with an argument name and a
	 * custom message as additional information.
	 * 
	 * @param argument The name of the argument that was null.
	 * @param message A custom exception message.
	 */
	public ArgumentInvalidException(String parameter, Object argument, String message)
	{
		super(message);
		
		this.parameter = parameter;
		this.argument.set(argument);
		this.customMessage.set(message);
	}
	
	/**
	 * Returns the name of the argument for which this exception was created
	 * for.
	 * 
	 * @return The argument name.
	 */
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
	
	/**
	 * Returns the custom message for this exception.
	 * 
	 * @return The custom message.
	 */
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
