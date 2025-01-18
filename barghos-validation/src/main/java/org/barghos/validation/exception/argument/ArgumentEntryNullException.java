package org.barghos.validation.exception.argument;

import org.barghos.validation.internal.Nullable;

/**
 * This exception indicates that a method has been passed an argument that is
 * null but must not be null. It extends the {@link ArgumentInvalidException}.
 */
public class ArgumentEntryNullException extends ArgumentEntryInvalidException
{
	/**
	 * This constant contains the current version of this class.
	 * It is used to distinguish between different serialized versions of this
	 * class.
	 */
	private static final long serialVersionUID = 1L;

	private Nullable<Object> index = new Nullable<>();
	
	/**
	 * Create a new instance of the exception without any additional details.
	 */
	protected ArgumentEntryNullException()
	{
		super();
	}
	
	/**
	 * Creates a new instance of the exception with an argument name as
	 * additional information.
	 * 
	 * @param argument The name of the argument that was null.
	 */
	public ArgumentEntryNullException(String parameter)
	{
		super(parameter);
	}
	
	/**
	 * Creates a new instance of the exception with an argument name as
	 * additional information.
	 * 
	 * @param argument The name of the argument that was null.
	 */
	public ArgumentEntryNullException(String parameter, Object index)
	{
		super(parameter);
		
		this.index.set(index);
	}
	
	/**
	 * Creates a new instance of the exception with an argument name and a
	 * custom message as additional information.
	 * 
	 * @param argument The name of the argument that was null.
	 * @param message A custom exception message.
	 */
	public ArgumentEntryNullException(String parameter, String message)
	{
		super(parameter, message);
	}
	
	/**
	 * Creates a new instance of the exception with an argument name and a
	 * custom message as additional information.
	 * 
	 * @param argument The name of the argument that was null.
	 * @param message A custom exception message.
	 */
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