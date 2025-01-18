package org.barghos.validation.exception;

import org.barghos.validation.exception.argument.LocalizableException;

public class LocalizedRuntimeException extends RuntimeException
{
	private static final long serialVersionUID = 1L;
	
	private RuntimeException parent;
	private LocalizationCallback callback;
	
	public LocalizedRuntimeException(RuntimeException parent, LocalizationCallback callback)
	{
		super(parent);
		
		this.parent = parent;
		this.callback = callback;
	}
	
	@Override
	public String getLocalizedMessage()
	{
		if(this.parent instanceof LocalizableException ex)
		{
			return this.callback.call(ex.localizationKey(), this.parent);
		}
		
		return this.callback.call("", this.parent);
	}
	
	public static interface LocalizationCallback
	{
		String call(String key, RuntimeException ex);
	}
}
