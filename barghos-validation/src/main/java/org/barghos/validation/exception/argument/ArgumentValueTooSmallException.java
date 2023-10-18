package org.barghos.validation.exception.argument;

/**
 * Thrown to indicate that a function argument has a value which is below an
 * expected minimum. This extends {@link InvalidArgumentValueException} by the
 * possibility to specify and access also the minimum value outside of the
 * message.
 */
public class ArgumentValueTooSmallException extends InvalidArgumentValueException
{
	/**
	 * This constant contains the current version of this class.
	 * It is used to distinguish between different serialized versions of this
	 * class.
	 */
	private static final long serialVersionUID = 1L;

	private final Object min;
	private final boolean hasMin;
	
	/**
	 * Create a new instance of the exception without any additional details.
	 */
	public ArgumentValueTooSmallException()
	{
		super();
		
		this.min = null;
		this.hasMin = false;
	}
	
	/**
	 * Creates a new instance of the exception with an argument name, the
	 * argument value and the expected minimum value for the argument as
	 * additional information.
	 * 
	 * @param argument The name of the argument that was out of range.
	 * @param value The value of the argument.
	 * @param min The minimum allowed value for the argument.
	 */
	public ArgumentValueTooSmallException(String argument, Object value, Object min)
	{
		super(argument, value);
		
		this.min = min;
		this.hasMin = true;
	}
	
	/**
	 * Creates a new instance of the exception with an argument name, the
	 * argument value, the expected minimum value for the argument and a custom
	 * message as additional information.
	 * 
	 * @param argument The name of the argument that was out of range.
	 * @param value The value of the argument.
	 * @param min The minimum allowed value for the argument.
	 * @param message A custom exception message.
	 */
	public ArgumentValueTooSmallException(String argument, Object value, Object min, String message)
	{
		super(argument, value, message);
		
		this.min = min;
		this.hasMin = true;
	}
	
	/**
	 * Returns the expected minimum value for the argument for which this
	 * exception was created for.
	 * 
	 * @return The expected minimum value.
	 */
	public Object getMin()
	{
		return this.min;
	}
	
	/**
	 * Returns if the expected minimum value for the argument for which this
	 * exception was created for was specified.
	 * 
	 * @return True, if the expected minimum was specified.
	 */
	public boolean hasMin()
	{
		return this.hasMin;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getMessage()
	{
		/*
		 * If a custom message is provided only output that.
		 */
		String customMsg = getCustomMessage();
		if(customMsg != null && !customMsg.isBlank())
		{
			return customMsg;
		}
		
		/*
		 * If no custom message is provided build and return the default
		 * one.
		 */
		if(!hasArgument()) return "One argument has a value which is smaller than the expected minimum value.";
		
		StringBuilder builder = new StringBuilder();

		builder.append("The argument ");
		builder.append("\"").append(getArgument()).append("\" ");
		builder.append("has the value ");
		builder.append("\"").append(getValue()).append("\" ");
		builder.append("which is smaller than the expected minimum value ");
		builder.append("inclusive \"").append(getMin()).append("\".");
		
		return builder.toString();
	}
}
