package org.barghos.validation;

public class ValidationConfiguration
{
	private static boolean argumentValidation;
	
	public static void argumentValidation(boolean enabled)
	{
		argumentValidation = enabled;
	}
	
	public static boolean argumentValidation()
	{
		return argumentValidation;
	}
}
