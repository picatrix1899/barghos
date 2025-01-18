package org.barghos.validation;

public class BarghosValidationConfiguration
{
	private static boolean VALIDATE_ARGS;
	
	public static void validateArgs(boolean enabled)
	{
		VALIDATE_ARGS = enabled;
	}
	
	public static boolean validateArgs()
	{
		return VALIDATE_ARGS;
	}
}
