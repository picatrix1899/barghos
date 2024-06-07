package org.barghos.validation;

public class BarghosValidationConfiguration
{
	private static boolean PARAMETER_VALIDATION;
	
	public static void parameterValidation(boolean enabled)
	{
		PARAMETER_VALIDATION = enabled;
	}
	
	public static boolean parameterValidation()
	{
		return PARAMETER_VALIDATION;
	}
}
