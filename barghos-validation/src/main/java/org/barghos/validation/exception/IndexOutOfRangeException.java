package org.barghos.validation.exception;

/**
 * Thrown to indicate that an index was outside of the valid value range.
 * Unlike {@link IndexOutOfBoundsException} this provides the possibility
 * to specify and access the invalid index, the minimum allowed index and the
 * maximum allowed index outside of the message.
 */
public class IndexOutOfRangeException extends IndexOutOfBoundsException
{
	private static final long serialVersionUID = 1L;
	
	private final Object index;
	private final Object minIndex;
	private final Object maxIndex;
	
	/**
	 * Creates a new instance of the exception without any additional details.
	 */
	public IndexOutOfRangeException()
	{
		this.index = null;
		this.minIndex = null;
		this.maxIndex = null;
	}
	
	/**
	 * Creates a new instance of the exception with the invalid index.
	 * 
	 * @param index The invalid index.
	 */
	public IndexOutOfRangeException(Object index)
	{
		this.index = index;
		this.minIndex = null;
		this.maxIndex = null;
	}
	
	/**
	 * Creates a new instance of the exception with the invalid index and a
	 * custom message.
	 * 
	 * <p>
	 * Only the custom message is shown. The details are not automatically
	 * included in the custom message and are only available through the
	 * getters.
	 * 
	 * @param index The invalid index.
	 * @param message The custom message to show.
	 */
	public IndexOutOfRangeException(Object index, String message)
	{
		super(message);
		
		this.index = index;
		this.minIndex = null;
		this.maxIndex = null;
	}
	
	/**
	 * Creates a new instance of the exception with the invalid index and the
	 * maximum allowed index. The minimum allowed index is automatically set to
	 * 0.
	 * 
	 * @param index The invalid index.
	 * @param maxIndex The maximum allowed index.
	 */
	public IndexOutOfRangeException(Object index, Object maxIndex)
	{
		this.index = index;
		this.minIndex = 0;
		this.maxIndex = maxIndex;
	}
	
	/**
	 * Creates a new instance of the exception with the invalid index, the
	 * maximum allowed index and a custom message. The minimum allowed index is
	 * automatically set to 0.
	 * 
	 * <p>
	 * Only the custom message is shown. The details are not automatically
	 * included in the custom message and are only available through the
	 * getters.
	 * 
	 * @param index The invalid index.
	 * @param maxIndex The maximum allowed index.
	 * @param message The custom message to show.
	 */
	public IndexOutOfRangeException(Object index, Object maxIndex, String message)
	{
		super(message);
		
		this.index = index;
		this.minIndex = 0;
		this.maxIndex = maxIndex;
	}
	
	/**
	 * Creates a new instance of the exception with the invalid index, the
	 * minimum allowed index and the maximum allowed index.
	 * 
	 * @param index The invalid index.
	 * @param minIndex The minimum allowed index.
	 * @param maxIndex The maximum allowed index.
	 */
	public IndexOutOfRangeException(Object index, Object minIndex, Object maxIndex)
	{
		this.index = index;
		this.minIndex = minIndex;
		this.maxIndex = maxIndex;
	}
	
	/**
	 * Creates a new instance of the exception with the invalid index, the
	 * minimum allowed index, the maximum allowed index and a custom message.
	 * 
	 * <p>
	 * Only the custom message is shown. The details are not automatically
	 * included in the custom message and are only available through the
	 * getters.
	 * 
	 * @param index The invalid index.
	 * @param minIndex The minimum allowed index.
	 * @param maxIndex The maximum allowed index.
	 * @param message The custom message to show.
	 */
	public IndexOutOfRangeException(Object index, Object minIndex, Object maxIndex, String message)
	{
		super(message);
		
		this.index = index;
		this.minIndex = minIndex;
		this.maxIndex = maxIndex;
	}
	
	/**
	 * Returns the invalid index.
	 * 
	 * @return The invalid index.
	 */
	public Object getIndex()
	{
		return this.index;
	}
	
	/**
	 * Returns the invalid index as an int value.
	 * 
	 * @return The invalid index as an int value.
	 */
	public int getIndexI()
	{
		return (int)this.index;
	}
	
	/**
	 * Returns the invalid index as a long value.
	 * 
	 * @return The invalid index as a long value.
	 */
	public long getIndexL()
	{
		return (long)this.index;
	}
	
	/**
	 * Returns if an invalid index was specified.
	 * 
	 * @return True, if an invalid index was specified. False otherwise.
	 */
	public boolean hasIndex()
	{
		return this.index != null;
	}
	
	/**
	 * Returns the minimum allowed index.
	 * 
	 * @return The minimum allowed index.
	 */
	public Object getMinIndex()
	{
		return this.minIndex;
	}
	
	/**
	 * Returns the minimum allowed index as an int value.
	 * 
	 * @return The minimum allowed index as an int value.
	 */
	public int getMinIndexI()
	{
		return (int)this.minIndex;
	}
	
	/**
	 * Returns the minimum allowed index as a long value.
	 * 
	 * @return The minimum allowed index as a long value.
	 */
	public long getMinIndexL()
	{
		return (long)this.minIndex;
	}
	
	/**
	 * Returns the maximum allowed index.
	 * 
	 * @return The maximum allowed index.
	 */
	public Object getMaxIndex()
	{
		return this.maxIndex;
	}
	
	/**
	 * Returns the maximum allowed index as an int value.
	 * 
	 * @return The maximum allowed index as an int value.
	 */
	public int getMaxIndexI()
	{
		return (int)this.maxIndex;
	}
	
	/**
	 * Returns the maximum allowed index as a long value.
	 * 
	 * @return The maximum allowed index as a long value.
	 */
	public long getMaxIndexL()
	{
		return (long)this.maxIndex;
	}
	
	/**
	 * Returns if the index range was specified by specifying at least
	 * a maximum index.
	 * 
	 * @return True, if at least a maximum index was specified. False otherwise.
	 */
	public boolean hasRange()
	{
		return this.maxIndex != null;
	}
	
	/**
	 * Returns the localized custom message for this exception.
	 * 
	 * @return The custom message.
	 */
	public String getLocalizedCustomMessage()
	{
		return getCustomMessage();
	}
	
	/**
	 * Returns the custom message for this exception.
	 * 
	 * @return The custom message.
	 */
	public String getCustomMessage()
	{
		return super.getMessage();
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getLocalizedMessage()
	{
		return getMessage();
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
		if(!hasIndex()) return "Index out of range.";
		
		StringBuilder builder = new StringBuilder();

		builder.append("The index ");
		builder.append(getIndex()).append(" ");
		
		/*
		 * Output the range if specified.
		 */
		if(hasRange())
		{
			builder.append("is outside of the range from ");
			builder.append(getMinIndex()).append(" to ");
			builder.append(getMaxIndex()).append(".");
		}
		else
		{
			builder.append("is out of range.");
		}
		
		return builder.toString();
	}
}
