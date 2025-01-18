package org.barghos.validation;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;

import org.barghos.validation.exception.argument.ArgumentEntryNullException;
import org.barghos.validation.exception.argument.ArgumentNullException;
import org.barghos.validation.exception.argument.ArgumentOutOfRangeException;
import org.barghos.validation.exception.argument.ArgumentSizeTooBigException;
import org.barghos.validation.exception.argument.ArgumentSizeTooSmallException;
import org.barghos.validation.exception.argument.ArgumentSizeUnexpectedException;
import org.barghos.validation.exception.argument.ArgumentTooBigException;
import org.barghos.validation.exception.argument.ArgumentTooSmallException;

public class Validate
{
	public static class Arg
	{
		private static final boolean enabled;

		static
		{
			enabled = BarghosValidationConfiguration.validateArgs();
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is not null.
		 * If the check fails, the method throws an
		 * {@link ArgumentNullException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentNullException If the check fails.
		 */
		public static void checkNotNull(String paramName, Object arg)
		{
			if(!enabled) return;
			
			requireNotNull(paramName, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is not null.
		 * If the check fails, the method throws an
		 * {@link ArgumentNullException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentNullException If the check fails.
		 */
		public static void requireNotNull(String paramName, Object arg)
		{
			if(arg == null) throw new ArgumentNullException(paramName);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min} (inclusive) to {@code max} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void checkInRange(String paramName, byte min, byte max, byte arg)
		{
			if(!enabled) return;
			
			requireInRange(paramName, min, max, arg);
		}

		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min} (inclusive) to {@code max} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void requireInRange(String paramName, byte min, byte max, byte arg)
		{
			if(arg < min || arg > max) throw new ArgumentOutOfRangeException(paramName, arg, min, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min - tolerance} (inclusive) to
		 * {@code max + tolerance} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void checkInRange(String paramName, byte min, byte max, byte tolerance, byte arg)
		{
			if(!enabled) return;
			
			requireInRange(paramName, min, max, tolerance, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min - tolerance} (inclusive) to
		 * {@code max + tolerance} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void requireInRange(String paramName, byte min, byte max, byte tolerance, byte arg)
		{
			assert tolerance >= 0 : "Tolerance must be non-negative: " + tolerance;

			if(arg < min - tolerance || arg > max + tolerance) throw new ArgumentOutOfRangeException(paramName, arg, min, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min} (inclusive) to {@code max} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void checkInRange(String paramName, short min, short max, short arg)
		{
			if(!enabled) return;
			
			requireInRange(paramName, min, max, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min} (inclusive) to {@code max} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void requireInRange(String paramName, short min, short max, short arg)
		{
			if(arg < min || arg > max) throw new ArgumentOutOfRangeException(paramName, arg, min, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min - tolerance} (inclusive) to
		 * {@code max + tolerance} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void checkInRange(String paramName, short min, short max, short tolerance, short arg)
		{
			if(!enabled) return;
			
			requireInRange(paramName, min, max, tolerance, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min - tolerance} (inclusive) to
		 * {@code max + tolerance} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void requireInRange(String paramName, short min, short max, short tolerance, short arg)
		{
			assert tolerance >= 0 : "Tolerance must be non-negative: " + tolerance;

			if(arg < min - tolerance || arg > max + tolerance) throw new ArgumentOutOfRangeException(paramName, arg, min, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min} (inclusive) to {@code max} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void checkInRange(String paramName, char min, char max, char arg)
		{
			if(!enabled) return;
			
			requireInRange(paramName, min, max, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min} (inclusive) to {@code max} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void requireInRange(String paramName, char min, char max, char arg)
		{
			if(arg < min || arg > max) throw new ArgumentOutOfRangeException(paramName, arg, min, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min - tolerance} (inclusive) to
		 * {@code max + tolerance} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void checkInRange(String paramName, char min, char max, char tolerance, char arg)
		{
			if(!enabled) return;
			
			requireInRange(paramName, min, max, tolerance, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min - tolerance} (inclusive) to
		 * {@code max + tolerance} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void requireInRange(String paramName, char min, char max, char tolerance, char arg)
		{
			assert tolerance >= 0 : "Tolerance must be non-negative: " + tolerance;

			if(arg < min - tolerance || arg > max + tolerance) throw new ArgumentOutOfRangeException(paramName, arg, min, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min} (inclusive) to {@code max} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void checkInRange(String paramName, int min, int max, int arg)
		{
			if(!enabled) return;
			
			requireInRange(paramName, min, max, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min} (inclusive) to {@code max} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void requireInRange(String paramName, int min, int max, int arg)
		{
			if(arg < min || arg > max) throw new ArgumentOutOfRangeException(paramName, arg, min, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min - tolerance} (inclusive) to
		 * {@code max + tolerance} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void checkInRange(String paramName, int min, int max, int tolerance, int arg)
		{
			if(!enabled) return;
			
			requireInRange(paramName, min, max, tolerance, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min - tolerance} (inclusive) to
		 * {@code max + tolerance} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void requireInRange(String paramName, int min, int max, int tolerance, int arg)
		{
			assert tolerance >= 0 : "Tolerance must be non-negative: " + tolerance;

			if(arg < min - tolerance || arg > max + tolerance) throw new ArgumentOutOfRangeException(paramName, arg, min, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min} (inclusive) to {@code max} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void checkInRange(String paramName, long min, long max, long arg)
		{
			if(!enabled) return;
			
			requireInRange(paramName, min, max, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min} (inclusive) to {@code max} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void requireInRange(String paramName, long min, long max, long arg)
		{
			if(arg < min || arg > max) throw new ArgumentOutOfRangeException(paramName, arg, min, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min - tolerance} (inclusive) to
		 * {@code max + tolerance} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void checkInRange(String paramName, long min, long max, long tolerance, long arg)
		{
			if(!enabled) return;
			
			requireInRange(paramName, min, max, tolerance, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min - tolerance} (inclusive) to
		 * {@code max + tolerance} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void requireInRange(String paramName, long min, long max, long tolerance, long arg)
		{
			assert tolerance >= 0 : "Tolerance must be non-negative: " + tolerance;

			if(arg < min - tolerance || arg > max + tolerance) throw new ArgumentOutOfRangeException(paramName, arg, min, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min} (inclusive) to {@code max} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void checkInRange(String paramName, float min, float max, float arg)
		{
			if(!enabled) return;
			
			requireInRange(paramName, min, max, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min} (inclusive) to {@code max} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void requireInRange(String paramName, float min, float max, float arg)
		{
			if(arg < min || arg > max) throw new ArgumentOutOfRangeException(paramName, arg, min, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min - tolerance} (inclusive) to
		 * {@code max + tolerance} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void checkInRange(String paramName, float min, float max, float tolerance, float arg)
		{
			if(!enabled) return;
			
			requireInRange(paramName, min, max, tolerance, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min - tolerance} (inclusive) to
		 * {@code max + tolerance} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void requireInRange(String paramName, float min, float max, float tolerance, float arg)
		{
			assert tolerance >= 0 : "Tolerance must be non-negative: " + tolerance;

			if(arg < min - tolerance || arg > max + tolerance) throw new ArgumentOutOfRangeException(paramName, arg, min, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min} (inclusive) to {@code max} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void checkInRange(String paramName, double min, double max, double arg)
		{
			if(!enabled) return;
			
			requireInRange(paramName, min, max, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min} (inclusive) to {@code max} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void requireInRange(String paramName, double min, double max, double arg)
		{
			if(arg < min || arg > max) throw new ArgumentOutOfRangeException(paramName, arg, min, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min - tolerance} (inclusive) to
		 * {@code max + tolerance} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void checkInRange(String paramName, double min, double max, double tolerance, double arg)
		{
			if(!enabled) return;
			
			requireInRange(paramName, min, max, tolerance, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min - tolerance} (inclusive) to
		 * {@code max + tolerance} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void requireInRange(String paramName, double min, double max, double tolerance, double arg)
		{
			assert tolerance >= 0 : "Tolerance must be non-negative: " + tolerance;

			if(arg < min - tolerance || arg > max + tolerance) throw new ArgumentOutOfRangeException(paramName, arg, min, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min} (inclusive) to {@code max} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void checkInRange(String paramName, BigInteger min, BigInteger max, BigInteger arg)
		{
			if(!enabled) return;
			
			requireInRange(paramName, min, max, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min} (inclusive) to {@code max} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void requireInRange(String paramName, BigInteger min, BigInteger max, BigInteger arg)
		{
			if(arg.compareTo(min) < 0 || arg.compareTo(max) > 0) throw new ArgumentOutOfRangeException(paramName, arg, min, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min - tolerance} (inclusive) to
		 * {@code max + tolerance} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void checkInRange(String paramName, BigInteger min, BigInteger max, BigInteger tolerance, BigInteger arg)
		{
			if(!enabled) return;
			
			requireInRange(paramName, min, max, tolerance, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min - tolerance} (inclusive) to
		 * {@code max + tolerance} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void requireInRange(String paramName, BigInteger min, BigInteger max, BigInteger tolerance, BigInteger arg)
		{
			assert tolerance.compareTo(BigInteger.ZERO) >= 0 : "Tolerance must be non-negative: " + tolerance;

			if(arg.compareTo(min.subtract(tolerance)) < 0 || arg.compareTo(max.add(tolerance)) > 0) throw new ArgumentOutOfRangeException(paramName, arg, min, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min} (inclusive) to {@code max} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void checkInRange(String paramName, BigDecimal min, BigDecimal max, BigDecimal arg)
		{
			if(!enabled) return;
			
			requireInRange(paramName, min, max, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min} (inclusive) to {@code max} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void requireInRange(String paramName, BigDecimal min, BigDecimal max, BigDecimal arg)
		{
			if(arg.compareTo(min) < 0 || arg.compareTo(max) > 0) throw new ArgumentOutOfRangeException(paramName, arg, min, max);
		}

		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min - tolerance} (inclusive) to
		 * {@code max + tolerance} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void checkInRange(String paramName, BigDecimal min, BigDecimal max, BigDecimal tolerance, BigDecimal arg)
		{
			if(!enabled) return;
			
			requireInRange(paramName, min, max, tolerance, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} lies within the
		 * range from {@code min - tolerance} (inclusive) to
		 * {@code max + tolerance} (inclusive).
		 * If the check fails, the method throws an
		 * {@link ArgumentOutOfRangeException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentOutOfRangeException If the check fails.
		 */
		public static void requireInRange(String paramName, BigDecimal min, BigDecimal max, BigDecimal tolerance, BigDecimal arg)
		{
			assert tolerance.compareTo(BigDecimal.ZERO) >= 0 : "Tolerance must be non-negative: " + tolerance;

			if(arg.compareTo(min.subtract(tolerance)) < 0 || arg.compareTo(max.add(tolerance)) > 0) throw new ArgumentOutOfRangeException(paramName, arg, min, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void checkMin(String paramName, byte min, byte arg)
		{
			if(!enabled) return;
			
			requireMin(paramName, min, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void requireMin(String paramName, byte min, byte arg)
		{
			if(arg < min) throw new ArgumentTooSmallException(paramName, arg, min);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min - tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void checkMin(String paramName, byte min, byte tolerance, byte arg)
		{
			if(!enabled) return;
			
			requireMin(paramName, min, tolerance, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min - tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void requireMin(String paramName, byte min, byte tolerance, byte arg)
		{
			assert tolerance >= 0 : "Tolerance must be non-negative: " + tolerance;
			
			if(arg < min - tolerance) throw new ArgumentTooSmallException(paramName, arg, min);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void checkMin(String paramName, short min, short arg)
		{
			if(!enabled) return;
			
			requireMin(paramName, min, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void requireMin(String paramName, short min, short arg)
		{
			if(arg < min) throw new ArgumentTooSmallException(paramName, arg, min);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min - tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void checkMin(String paramName, short min, short tolerance, short arg)
		{
			if(!enabled) return;
			
			requireMin(paramName, min, tolerance, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min - tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void requireMin(String paramName, short min, short tolerance, short arg)
		{
			assert tolerance >= 0 : "Tolerance must be non-negative: " + tolerance;
			
			if(arg < min - tolerance) throw new ArgumentTooSmallException(paramName, arg, min);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void checkMin(String paramName, char min, char arg)
		{
			if(!enabled) return;
			
			requireMin(paramName, min, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void requireMin(String paramName, char min, char arg)
		{
			if(arg < min) throw new ArgumentTooSmallException(paramName, arg, min);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min - tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void checkMin(String paramName, char min, char tolerance, char arg)
		{
			if(!enabled) return;
			
			requireMin(paramName, min, tolerance, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min - tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void requireMin(String paramName, char min, char tolerance, char arg)
		{
			assert tolerance >= 0 : "Tolerance must be non-negative: " + tolerance;
			
			if(arg < min - tolerance) throw new ArgumentTooSmallException(paramName, arg, min);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void checkMin(String paramName, int min, int arg)
		{
			if(!enabled) return;
			
			requireMin(paramName, min, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void requireMin(String paramName, int min, int arg)
		{
			if(arg < min) throw new ArgumentTooSmallException(paramName, arg, min);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min - tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void checkMin(String paramName, int min, int tolerance, int arg)
		{
			if(!enabled) return;
			
			requireMin(paramName, min, tolerance, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min - tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void requireMin(String paramName, int min, int tolerance, int arg)
		{
			assert tolerance >= 0 : "Tolerance must be non-negative: " + tolerance;
			
			if(arg < min - tolerance) throw new ArgumentTooSmallException(paramName, arg, min);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void checkMin(String paramName, long min, long arg)
		{
			if(!enabled) return;
			
			requireMin(paramName, min, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void requireMin(String paramName, long min, long arg)
		{
			if(arg < min) throw new ArgumentTooSmallException(paramName, arg, min);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min - tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void checkMin(String paramName, long min, long tolerance, long arg)
		{
			if(!enabled) return;
			
			requireMin(paramName, min, tolerance, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min - tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void requireMin(String paramName, long min, long tolerance, long arg)
		{
			assert tolerance >= 0 : "Tolerance must be non-negative: " + tolerance;
			
			if(arg < min - tolerance) throw new ArgumentTooSmallException(paramName, arg, min);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void checkMin(String paramName, float min, float arg)
		{
			if(!enabled) return;
			
			requireMin(paramName, min, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void requireMin(String paramName, float min, float arg)
		{
			if(arg < min) throw new ArgumentTooSmallException(paramName, arg, min);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min - tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void checkMin(String paramName, float min, float tolerance, float arg)
		{
			if(!enabled) return;
			
			requireMin(paramName, min, tolerance, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min - tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void requireMin(String paramName, float min, float tolerance, float arg)
		{
			assert tolerance >= 0 : "Tolerance must be non-negative: " + tolerance;
			
			if(arg < min - tolerance) throw new ArgumentTooSmallException(paramName, arg, min);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void checkMin(String paramName, double min, double arg)
		{
			if(!enabled) return;
			
			requireMin(paramName, min, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void requireMin(String paramName, double min, double arg)
		{
			if(arg < min) throw new ArgumentTooSmallException(paramName, arg, min);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min - tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void checkMin(String paramName, double min, double tolerance, double arg)
		{
			if(!enabled) return;
			
			requireMin(paramName, min, tolerance, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min - tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void requireMin(String paramName, double min, double tolerance, double arg)
		{
			assert tolerance >= 0 : "Tolerance must be non-negative: " + tolerance;
			
			if(arg < min - tolerance) throw new ArgumentTooSmallException(paramName, arg, min);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void checkMin(String paramName, BigInteger min, BigInteger arg)
		{
			if(!enabled) return;
			
			requireMin(paramName, min, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void requireMin(String paramName, BigInteger min, BigInteger arg)
		{
			if(arg.compareTo(min) < 0) throw new ArgumentTooSmallException(paramName, arg, min);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min - tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void checkMin(String paramName, BigInteger min, BigInteger tolerance, BigInteger arg)
		{
			if(!enabled) return;
			
			requireMin(paramName, min, tolerance, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min - tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void requireMin(String paramName, BigInteger min, BigInteger tolerance, BigInteger arg)
		{
			assert tolerance.compareTo(BigInteger.ZERO) >= 0 : "Tolerance must be non-negative: " + tolerance;
			
			if(arg.compareTo(min.subtract(tolerance)) < 0) throw new ArgumentTooSmallException(paramName, arg, min);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void checkMin(String paramName, BigDecimal min, BigDecimal arg)
		{
			if(!enabled) return;
			
			requireMin(paramName, min, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void requireMin(String paramName, BigDecimal min, BigDecimal arg)
		{
			if(arg.compareTo(min) < 0) throw new ArgumentTooSmallException(paramName, arg, min);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min - tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void checkMin(String paramName, BigDecimal min, BigDecimal tolerance, BigDecimal arg)
		{
			if(!enabled) return;
			
			requireMin(paramName, min, tolerance, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is greater than or
		 * equal to {@code min - tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooSmallException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param min The minimum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooSmallException If the check fails.
		 */
		public static void requireMin(String paramName, BigDecimal min, BigDecimal tolerance, BigDecimal arg)
		{
			assert tolerance.compareTo(BigDecimal.ZERO) >= 0 : "Tolerance must be non-negative: " + tolerance;
			
			if(arg.compareTo(min.subtract(tolerance)) < 0) throw new ArgumentTooSmallException(paramName, arg, min);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void checkMax(String paramName, byte max, byte arg)
		{
			if(!enabled) return;
			
			requireMax(paramName, max, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void requireMax(String paramName, byte max, byte arg)
		{
			if(arg > max) throw new ArgumentTooBigException(paramName, arg, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max + tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void checkMax(String paramName, byte max, byte tolerance, byte arg)
		{
			if(!enabled) return;
			
			requireMax(paramName, max, tolerance, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max + tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void requireMax(String paramName, byte max, byte tolerance, byte arg)
		{
			assert tolerance >= 0 : "Tolerance must be non-negative: " + tolerance;
			
			if(arg > max + tolerance) throw new ArgumentTooBigException(paramName, arg, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void checkMax(String paramName, short max, short arg)
		{
			if(!enabled) return;
			
			requireMax(paramName, max, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void requireMax(String paramName, short max, short arg)
		{
			if(arg > max) throw new ArgumentTooBigException(paramName, arg, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max + tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void checkMax(String paramName, short max, short tolerance, short arg)
		{
			if(!enabled) return;
			
			requireMax(paramName, max, tolerance, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max + tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void requireMax(String paramName, short max, short tolerance, short arg)
		{
			assert tolerance >= 0 : "Tolerance must be non-negative: " + tolerance;
			
			if(arg > max + tolerance) throw new ArgumentTooBigException(paramName, arg, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void checkMax(String paramName, char max, char arg)
		{
			if(!enabled) return;
			
			requireMax(paramName, max, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void requireMax(String paramName, char max, char arg)
		{
			if(arg > max) throw new ArgumentTooBigException(paramName, arg, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max + tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void checkMax(String paramName, char max, char tolerance, char arg)
		{
			if(!enabled) return;
			
			requireMax(paramName, max, tolerance, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max + tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void requireMax(String paramName, char max, char tolerance, char arg)
		{
			assert tolerance >= 0 : "Tolerance must be non-negative: " + tolerance;
			
			if(arg > max + tolerance) throw new ArgumentTooBigException(paramName, arg, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void checkMax(String paramName, int max, int arg)
		{
			if(!enabled) return;
			
			requireMax(paramName, max, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void requireMax(String paramName, int max, int arg)
		{
			if(arg > max) throw new ArgumentTooBigException(paramName, arg, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max + tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void checkMax(String paramName, int max, int tolerance, int arg)
		{
			if(!enabled) return;
			
			requireMax(paramName, max, tolerance, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max + tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void requireMax(String paramName, int max, int tolerance, int arg)
		{
			assert tolerance >= 0 : "Tolerance must be non-negative: " + tolerance;
			
			if(arg > max + tolerance) throw new ArgumentTooBigException(paramName, arg, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void checkMax(String paramName, long max, long arg)
		{
			if(!enabled) return;
			
			requireMax(paramName, max, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void requireMax(String paramName, long max, long arg)
		{
			if(arg > max) throw new ArgumentTooBigException(paramName, arg, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max + tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void checkMax(String paramName, long max, long tolerance, long arg)
		{
			if(!enabled) return;
			
			requireMax(paramName, max, tolerance, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max + tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void requireMax(String paramName, long max, long tolerance, long arg)
		{
			assert tolerance >= 0 : "Tolerance must be non-negative: " + tolerance;
			
			if(arg > max + tolerance) throw new ArgumentTooBigException(paramName, arg, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void checkMax(String paramName, float max, float arg)
		{
			if(!enabled) return;
			
			requireMax(paramName, max, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void requireMax(String paramName, float max, float arg)
		{
			if(arg > max) throw new ArgumentTooBigException(paramName, arg, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max + tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void checkMax(String paramName, float max, float tolerance, float arg)
		{
			if(!enabled) return;
			
			requireMax(paramName, max, tolerance, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max + tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void requireMax(String paramName, float max, float tolerance, float arg)
		{
			assert tolerance >= 0 : "Tolerance must be non-negative: " + tolerance;
			
			if(arg > max + tolerance) throw new ArgumentTooBigException(paramName, arg, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void checkMax(String paramName, double max, double arg)
		{
			if(!enabled) return;
			
			requireMax(paramName, max, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void requireMax(String paramName, double max, double arg)
		{
			if(arg > max) throw new ArgumentTooBigException(paramName, arg, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max + tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void checkMax(String paramName, double max, double tolerance, double arg)
		{
			if(!enabled) return;
			
			requireMax(paramName, max, tolerance, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max + tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void requireMax(String paramName, double max, double tolerance, double arg)
		{
			assert tolerance >= 0 : "Tolerance must be non-negative: " + tolerance;
			
			if(arg > max + tolerance) throw new ArgumentTooBigException(paramName, arg, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void checkMax(String paramName, BigInteger max, BigInteger arg)
		{
			if(!enabled) return;
			
			requireMax(paramName, max, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void requireMax(String paramName, BigInteger max, BigInteger arg)
		{
			if(arg.compareTo(max) > 0) throw new ArgumentTooBigException(paramName, arg, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max + tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void checkMax(String paramName, BigInteger max, BigInteger tolerance, BigInteger arg)
		{
			if(!enabled) return;
			
			requireMax(paramName, max, tolerance, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max + tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void requireMax(String paramName, BigInteger max, BigInteger tolerance, BigInteger arg)
		{
			assert tolerance.compareTo(BigInteger.ZERO) >= 0 : "Tolerance must be non-negative: " + tolerance;
			
			if(arg.compareTo(max.subtract(tolerance)) > 0) throw new ArgumentTooBigException(paramName, arg, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void checkMax(String paramName, BigDecimal max, BigDecimal arg)
		{
			if(!enabled) return;
			
			requireMax(paramName, max, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void requireMax(String paramName, BigDecimal max, BigDecimal arg)
		{
			if(arg.compareTo(max) > 0) throw new ArgumentTooBigException(paramName, arg, max);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max + tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void checkMax(String paramName, BigDecimal max, BigDecimal tolerance, BigDecimal arg)
		{
			if(!enabled) return;
			
			requireMax(paramName, max, tolerance, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} is less than or
		 * equal to {@code max + tolerance}.
		 * If the check fails, the method throws an
		 * {@link ArgumentTooBigException} for the parameter specified by
		 * {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param max The maximum allowable value (inclusive).
		 * @param tolerance The tolerance applied to the validation boundaries.
		 * @param arg The value of the parameter to check.
		 *
		 * @throws ArgumentTooBigException If the check fails.
		 */
		public static void requireMax(String paramName, BigDecimal max, BigDecimal tolerance, BigDecimal arg)
		{
			assert tolerance.compareTo(BigDecimal.ZERO) >= 0 : "Tolerance must be non-negative: " + tolerance;
			
			if(arg.compareTo(max.subtract(tolerance)) > 0) throw new ArgumentTooBigException(paramName, arg, max);
		}

		/**
		 * Checks whether the passed argument {@code arg} has the expected
		 * number of elements {@code expectedSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentUnexpectedSizeException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param <T> The array type.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param expectedSize The expected number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentUnexpectedSizeException If the check fails.
		 */
		public static <T> void checkExpectSize(String paramName, int expectedSize, T[] arg)
		{
			if(!enabled) return;
			
			requireExpectSize(paramName, expectedSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has the expected
		 * number of elements {@code expectedSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentUnexpectedSizeException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param <T> The array type.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param expectedSize The expected number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentUnexpectedSizeException If the check fails.
		 */
		public static <T> void requireExpectSize(String paramName, int expectedSize, T[] arg)
		{
			assert expectedSize >= 0 : "Expected size must be non-negative: " + expectedSize;
			assert arg != null : "Argument must not be null";
			
			if(arg.length != expectedSize) throw new ArgumentSizeUnexpectedException(paramName, arg.length, expectedSize);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has the expected
		 * number of elements {@code expectedSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentUnexpectedSizeException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param expectedSize The expected number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentUnexpectedSizeException If the check fails.
		 */
		public static void checkExpectSize(String paramName, int expectedSize, byte[] arg)
		{
			if(!enabled) return;
			
			requireExpectSize(paramName, expectedSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has the expected
		 * number of elements {@code expectedSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentUnexpectedSizeException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param expectedSize The expected number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentUnexpectedSizeException If the check fails.
		 */
		public static void requireExpectSize(String paramName, int expectedSize, byte[] arg)
		{
			assert expectedSize >= 0 : "Expected size must be non-negative: " + expectedSize;
			assert arg != null : "Argument must not be null";
			
			if(arg.length != expectedSize) throw new ArgumentSizeUnexpectedException(paramName, arg.length, expectedSize);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has the expected
		 * number of elements {@code expectedSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentUnexpectedSizeException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param expectedSize The expected number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentUnexpectedSizeException If the check fails.
		 */
		public static void checkExpectSize(String paramName, int expectedSize, short[] arg)
		{
			if(!enabled) return;
			
			requireExpectSize(paramName, expectedSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has the expected
		 * number of elements {@code expectedSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentUnexpectedSizeException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param expectedSize The expected number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentUnexpectedSizeException If the check fails.
		 */
		public static void requireExpectSize(String paramName, int expectedSize, short[] arg)
		{
			assert expectedSize >= 0 : "Expected size must be non-negative: " + expectedSize;
			assert arg != null : "Argument must not be null";
			
			if(arg.length != expectedSize) throw new ArgumentSizeUnexpectedException(paramName, arg.length, expectedSize);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has the expected
		 * number of elements {@code expectedSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentUnexpectedSizeException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param expectedSize The expected number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentUnexpectedSizeException If the check fails.
		 */
		public static void checkExpectSize(String paramName, int expectedSize, char[] arg)
		{
			if(!enabled) return;
			
			requireExpectSize(paramName, expectedSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has the expected
		 * number of elements {@code expectedSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentUnexpectedSizeException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param expectedSize The expected number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentUnexpectedSizeException If the check fails.
		 */
		public static void requireExpectSize(String paramName, int expectedSize, char[] arg)
		{
			assert expectedSize >= 0 : "Expected size must be non-negative: " + expectedSize;
			assert arg != null : "Argument must not be null";
			
			if(arg.length != expectedSize) throw new ArgumentSizeUnexpectedException(paramName, arg.length, expectedSize);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has the expected
		 * number of elements {@code expectedSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentUnexpectedSizeException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param expectedSize The expected number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentUnexpectedSizeException If the check fails.
		 */
		public static void checkExpectSize(String paramName, int expectedSize, int[] arg)
		{
			if(!enabled) return;
			
			requireExpectSize(paramName, expectedSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has the expected
		 * number of elements {@code expectedSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentUnexpectedSizeException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param expectedSize The expected number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentUnexpectedSizeException If the check fails.
		 */
		public static void requireExpectSize(String paramName, int expectedSize, int[] arg)
		{
			assert expectedSize >= 0 : "Expected size must be non-negative: " + expectedSize;
			assert arg != null : "Argument must not be null";
			
			if(arg.length != expectedSize) throw new ArgumentSizeUnexpectedException(paramName, arg.length, expectedSize);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has the expected
		 * number of elements {@code expectedSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentUnexpectedSizeException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param expectedSize The expected number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentUnexpectedSizeException If the check fails.
		 */
		public static void checkExpectSize(String paramName, int expectedSize, long[] arg)
		{
			if(!enabled) return;
			
			requireExpectSize(paramName, expectedSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has the expected
		 * number of elements {@code expectedSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentUnexpectedSizeException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param expectedSize The expected number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentUnexpectedSizeException If the check fails.
		 */
		public static void requireExpectSize(String paramName, int expectedSize, long[] arg)
		{
			assert expectedSize >= 0 : "Expected size must be non-negative: " + expectedSize;
			assert arg != null : "Argument must not be null";
			
			if(arg.length != expectedSize) throw new ArgumentSizeUnexpectedException(paramName, arg.length, expectedSize);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has the expected
		 * number of elements {@code expectedSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentUnexpectedSizeException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param expectedSize The expected number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentUnexpectedSizeException If the check fails.
		 */
		public static void checkExpectSize(String paramName, int expectedSize, float[] arg)
		{
			if(!enabled) return;
			
			requireExpectSize(paramName, expectedSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has the expected
		 * number of elements {@code expectedSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentUnexpectedSizeException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param expectedSize The expected number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentUnexpectedSizeException If the check fails.
		 */
		public static void requireExpectSize(String paramName, int expectedSize, float[] arg)
		{
			assert expectedSize >= 0 : "Expected size must be non-negative: " + expectedSize;
			assert arg != null : "Argument must not be null";
			
			if(arg.length != expectedSize) throw new ArgumentSizeUnexpectedException(paramName, arg.length, expectedSize);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has the expected
		 * number of elements {@code expectedSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentUnexpectedSizeException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param expectedSize The expected number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentUnexpectedSizeException If the check fails.
		 */
		public static void checkExpectSize(String paramName, int expectedSize, double[] arg)
		{
			if(!enabled) return;
			
			requireExpectSize(paramName, expectedSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has the expected
		 * number of elements {@code expectedSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentUnexpectedSizeException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param expectedSize The expected number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentUnexpectedSizeException If the check fails.
		 */
		public static void requireExpectSize(String paramName, int expectedSize, double[] arg)
		{
			assert expectedSize >= 0 : "Expected size must be non-negative: " + expectedSize;
			assert arg != null : "Argument must not be null";
			
			if(arg.length != expectedSize) throw new ArgumentSizeUnexpectedException(paramName, arg.length, expectedSize);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has the expected
		 * number of elements {@code expectedSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentUnexpectedSizeException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param expectedSize The expected number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentUnexpectedSizeException If the check fails.
		 */
		public static void checkExpectSize(String paramName, int expectedSize, boolean[] arg)
		{
			if(!enabled) return;
			
			requireExpectSize(paramName, expectedSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has the expected
		 * number of elements {@code expectedSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentUnexpectedSizeException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param expectedSize The expected number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentUnexpectedSizeException If the check fails.
		 */
		public static void requireExpectSize(String paramName, int expectedSize, boolean[] arg)
		{
			assert expectedSize >= 0 : "Expected size must be non-negative: " + expectedSize;
			assert arg != null : "Argument must not be null";
			
			if(arg.length != expectedSize) throw new ArgumentSizeUnexpectedException(paramName, arg.length, expectedSize);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has the expected
		 * number of elements {@code expectedSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentUnexpectedSizeException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param <T> The collection type.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param expectedSize The expected number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentUnexpectedSizeException If the check fails.
		 */
		public static void checkExpectSize(String paramName, int expectedSize, Collection<?> arg)
		{
			if(!enabled) return;
			
			requireExpectSize(paramName, expectedSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has the expected
		 * number of elements {@code expectedSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentUnexpectedSizeException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param <T> The collection type.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param expectedSize The expected number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentUnexpectedSizeException If the check fails.
		 */
		public static <T> void requireExpectSize(String paramName, int expectedSize, Collection<T> arg)
		{
			assert expectedSize >= 0 : "Expected size must be non-negative: " + expectedSize;
			assert arg != null : "Argument must not be null";
			
			int size = arg.size();
			
			if(size != expectedSize) throw new ArgumentSizeUnexpectedException(paramName, size, expectedSize);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has the expected
		 * number of elements {@code expectedSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentUnexpectedSizeException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param expectedSize The expected number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentUnexpectedSizeException If the check fails.
		 */
		public static void checkExpectSize(String paramName, int expectedSize, String arg)
		{
			if(!enabled) return;
			
			requireExpectSize(paramName, expectedSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has the expected
		 * number of elements {@code expectedSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentUnexpectedSizeException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param expectedSize The expected number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentUnexpectedSizeException If the check fails.
		 */
		public static void requireExpectSize(String paramName, int expectedSize, String arg)
		{
			assert expectedSize >= 0 : "Expected size must be non-negative: " + expectedSize;
			assert arg != null : "Argument must not be null";
			
			int size = arg.length();
			
			if(size != expectedSize) throw new ArgumentSizeUnexpectedException(paramName, size, expectedSize);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at least the
		 * minimum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooSmallException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param <T> The array type.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param minSize
		 * The minimum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooSmallException If the check fails.
		 */
		public static <T> void checkMinSize(String paramName, int minSize, T[] arg)
		{
			if(!enabled) return;
			
			requireMinSize(paramName, minSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at least the
		 * minimum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooSmallException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param <T> The array type.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param minSize
		 * The minimum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooSmallException If the check fails.
		 */
		public static <T> void requireMinSize(String paramName, int minSize, T[] arg)
		{
			assert minSize >= 0 : "Minimum size must be non-negative: " + minSize;
			assert arg != null : "Argument must not be null";
			
			if(arg.length < minSize) throw new ArgumentSizeTooSmallException(paramName, arg.length, minSize);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at least the
		 * minimum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooSmallException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param minSize
		 * The minimum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooSmallException If the check fails.
		 */
		public static void checkMinSize(String paramName, int minSize, byte[] arg)
		{
			if(!enabled) return;
			
			requireMinSize(paramName, minSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at least the
		 * minimum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooSmallException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param minSize
		 * The minimum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooSmallException If the check fails.
		 */
		public static void requireMinSize(String paramName, int minSize, byte[] arg)
		{
			assert minSize >= 0 : "Minimum size must be non-negative: " + minSize;
			assert arg != null : "Argument must not be null";
			
			if(arg.length < minSize) throw new ArgumentSizeTooSmallException(paramName, arg.length, minSize);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at least the
		 * minimum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooSmallException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param minSize
		 * The minimum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooSmallException If the check fails.
		 */
		public static void checkMinSize(String paramName, int minSize, short[] arg)
		{
			if(!enabled) return;
			
			requireMinSize(paramName, minSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at least the
		 * minimum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooSmallException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param minSize
		 * The minimum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooSmallException If the check fails.
		 */
		public static void requireMinSize(String paramName, int minSize, short[] arg)
		{
			assert minSize >= 0 : "Minimum size must be non-negative: " + minSize;
			assert arg != null : "Argument must not be null";
			
			if(arg.length < minSize) throw new ArgumentSizeTooSmallException(paramName, arg.length, minSize);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at least the
		 * minimum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooSmallException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param minSize
		 * The minimum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooSmallException If the check fails.
		 */
		public static void checkMinSize(String paramName, int minSize, char[] arg)
		{
			if(!enabled) return;
			
			requireMinSize(paramName, minSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at least the
		 * minimum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooSmallException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param minSize
		 * The minimum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooSmallException If the check fails.
		 */
		public static void requireMinSize(String paramName, int minSize, char[] arg)
		{
			assert minSize >= 0 : "Minimum size must be non-negative: " + minSize;
			assert arg != null : "Argument must not be null";
			
			if(arg.length < minSize) throw new ArgumentSizeTooSmallException(paramName, arg.length, minSize);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at least the
		 * minimum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooSmallException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param minSize
		 * The minimum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooSmallException If the check fails.
		 */
		public static void checkMinSize(String paramName, int minSize, int[] arg)
		{
			if(!enabled) return;
			
			requireMinSize(paramName, minSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at least the
		 * minimum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooSmallException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param minSize
		 * The minimum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooSmallException If the check fails.
		 */
		public static void requireMinSize(String paramName, int minSize, int[] arg)
		{
			assert minSize >= 0 : "Minimum size must be non-negative: " + minSize;
			assert arg != null : "Argument must not be null";
			
			if(arg.length < minSize) throw new ArgumentSizeTooSmallException(paramName, arg.length, minSize);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at least the
		 * minimum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooSmallException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param minSize
		 * The minimum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooSmallException If the check fails.
		 */
		public static void checkMinSize(String paramName, int minSize, long[] arg)
		{
			if(!enabled) return;
			
			requireMinSize(paramName, minSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at least the
		 * minimum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooSmallException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param minSize
		 * The minimum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooSmallException If the check fails.
		 */
		public static void requireMinSize(String paramName, int minSize, long[] arg)
		{
			assert minSize >= 0 : "Minimum size must be non-negative: " + minSize;
			assert arg != null : "Argument must not be null";
			
			if(arg.length < minSize) throw new ArgumentSizeTooSmallException(paramName, arg.length, minSize);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at least the
		 * minimum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooSmallException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param minSize
		 * The minimum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooSmallException If the check fails.
		 */
		public static void checkMinSize(String paramName, int minSize, float[] arg)
		{
			if(!enabled) return;
			
			requireMinSize(paramName, minSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at least the
		 * minimum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooSmallException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param minSize
		 * The minimum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooSmallException If the check fails.
		 */
		public static void requireMinSize(String paramName, int minSize, float[] arg)
		{
			assert minSize >= 0 : "Minimum size must be non-negative: " + minSize;
			assert arg != null : "Argument must not be null";
			
			if(arg.length < minSize) throw new ArgumentSizeTooSmallException(paramName, arg.length, minSize);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at least the
		 * minimum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooSmallException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param minSize
		 * The minimum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooSmallException If the check fails.
		 */
		public static void checkMinSize(String paramName, int minSize, double[] arg)
		{
			if(!enabled) return;
			
			requireMinSize(paramName, minSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at least the
		 * minimum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooSmallException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param minSize
		 * The minimum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooSmallException If the check fails.
		 */
		public static void requireMinSize(String paramName, int minSize, double[] arg)
		{
			assert minSize >= 0 : "Minimum size must be non-negative: " + minSize;
			assert arg != null : "Argument must not be null";
			
			if(arg.length < minSize) throw new ArgumentSizeTooSmallException(paramName, arg.length, minSize);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at least the
		 * minimum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooSmallException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param minSize
		 * The minimum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooSmallException If the check fails.
		 */
		public static void checkMinSize(String paramName, int minSize, boolean[] arg)
		{
			if(!enabled) return;
			
			requireMinSize(paramName, minSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at least the
		 * minimum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooSmallException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param minSize
		 * The minimum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooSmallException If the check fails.
		 */
		public static void requireMinSize(String paramName, int minSize, boolean[] arg)
		{
			assert minSize >= 0 : "Minimum size must be non-negative: " + minSize;
			assert arg != null : "Argument must not be null";
			
			if(arg.length < minSize) throw new ArgumentSizeTooSmallException(paramName, arg.length, minSize);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at least the
		 * minimum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooSmallException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param <T> The collection type.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param minSize
		 * The minimum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooSmallException If the check fails.
		 */
		public static <T> void checkMinSize(String paramName, int minSize, Collection<T> arg)
		{
			if(!enabled) return;
			
			requireMinSize(paramName, minSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at least the
		 * minimum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooSmallException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param <T> The collection type.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param minSize
		 * The minimum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooSmallException If the check fails.
		 */
		public static <T> void requireMinSize(String paramName, int minSize, Collection<T> arg)
		{
			assert minSize >= 0 : "Minimum size must be non-negative: " + minSize;
			assert arg != null : "Argument must not be null";
			
			int size = arg.size();
			
			if(size < minSize) throw new ArgumentSizeTooSmallException(paramName, size, minSize);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at least the
		 * minimum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooSmallException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param minSize
		 * The minimum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooSmallException If the check fails.
		 */
		public static void checkMinSize(String paramName, int minSize, String arg)
		{
			if(!enabled) return;
			
			requireMinSize(paramName, minSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at least the
		 * minimum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooSmallException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param minSize
		 * The minimum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooSmallException If the check fails.
		 */
		public static void requireMinSize(String paramName, int minSize, String arg)
		{
			assert minSize >= 0 : "Minimum size must be non-negative: " + minSize;
			assert arg != null : "Argument must not be null";
			
			int size = arg.length();
			
			if(size < minSize) throw new ArgumentSizeTooSmallException(paramName, size, minSize);
		}

		/**
		 * Checks whether the passed argument {@code arg} has at most the
		 * maximum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooBigException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param <T> The array type.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param mmaxSize
		 * The maximum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooBigException If the check fails.
		 */
		public static <T> void checkMaxSize(String paramName, int maxSize, T[] arg)
		{
			if(!enabled) return;
			
			requireMaxSize(paramName, maxSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at most the
		 * maximum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooBigException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param <T> The array type.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param mmaxSize
		 * The maximum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooBigException If the check fails.
		 */
		public static <T> void requireMaxSize(String paramName, int maxSize, T[] arg)
		{
			assert maxSize >= 0 : "Maximum size must be non-negative: " + maxSize;
			assert arg != null : "Argument must not be null";
			
			if(arg.length > maxSize) throw new ArgumentSizeTooBigException(paramName, arg.length, maxSize);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at most the
		 * maximum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooBigException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param mmaxSize
		 * The maximum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooBigException If the check fails.
		 */
		public static void checkMaxSize(String paramName, int maxSize, byte[] arg)
		{
			if(!enabled) return;
			
			requireMaxSize(paramName, maxSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at most the
		 * maximum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooBigException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param mmaxSize
		 * The maximum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooBigException If the check fails.
		 */
		public static void requireMaxSize(String paramName, int maxSize, byte[] arg)
		{
			assert maxSize >= 0 : "Maximum size must be non-negative: " + maxSize;
			assert arg != null : "Argument must not be null";
			
			if(arg.length > maxSize) throw new ArgumentSizeTooBigException(paramName, arg.length, maxSize);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at most the
		 * maximum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooBigException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param mmaxSize
		 * The maximum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooBigException If the check fails.
		 */
		public static void checkMaxSize(String paramName, int maxSize, short[] arg)
		{
			if(!enabled) return;
			
			requireMaxSize(paramName, maxSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at most the
		 * maximum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooBigException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param mmaxSize
		 * The maximum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooBigException If the check fails.
		 */
		public static void requireMaxSize(String paramName, int maxSize, short[] arg)
		{
			assert maxSize >= 0 : "Maximum size must be non-negative: " + maxSize;
			assert arg != null : "Argument must not be null";
			
			if(arg.length > maxSize) throw new ArgumentSizeTooBigException(paramName, arg.length, maxSize);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at most the
		 * maximum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooBigException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param mmaxSize
		 * The maximum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooBigException If the check fails.
		 */
		public static void checkMaxSize(String paramName, int maxSize, char[] arg)
		{
			if(!enabled) return;
			
			requireMaxSize(paramName, maxSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at most the
		 * maximum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooBigException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param mmaxSize
		 * The maximum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooBigException If the check fails.
		 */
		public static void requireMaxSize(String paramName, int maxSize, char[] arg)
		{
			assert maxSize >= 0 : "Maximum size must be non-negative: " + maxSize;
			assert arg != null : "Argument must not be null";
			
			if(arg.length > maxSize) throw new ArgumentSizeTooBigException(paramName, arg.length, maxSize);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at most the
		 * maximum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooBigException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param mmaxSize
		 * The maximum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooBigException If the check fails.
		 */
		public static void checkMaxSize(String paramName, int maxSize, int[] arg)
		{
			if(!enabled) return;
			
			requireMaxSize(paramName, maxSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at most the
		 * maximum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooBigException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param mmaxSize
		 * The maximum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooBigException If the check fails.
		 */
		public static void requireMaxSize(String paramName, int maxSize, int[] arg)
		{
			assert maxSize >= 0 : "Maximum size must be non-negative: " + maxSize;
			assert arg != null : "Argument must not be null";
			
			if(arg.length > maxSize) throw new ArgumentSizeTooBigException(paramName, arg.length, maxSize);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at most the
		 * maximum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooBigException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param mmaxSize
		 * The maximum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooBigException If the check fails.
		 */
		public static void checkMaxSize(String paramName, int maxSize, long[] arg)
		{
			if(!enabled) return;
			
			requireMaxSize(paramName, maxSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at most the
		 * maximum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooBigException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param mmaxSize
		 * The maximum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooBigException If the check fails.
		 */
		public static void requireMaxSize(String paramName, int maxSize, long[] arg)
		{
			assert maxSize >= 0 : "Maximum size must be non-negative: " + maxSize;
			assert arg != null : "Argument must not be null";
			
			if(arg.length > maxSize) throw new ArgumentSizeTooBigException(paramName, arg.length, maxSize);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at most the
		 * maximum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooBigException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param mmaxSize
		 * The maximum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooBigException If the check fails.
		 */
		public static void checkMaxSize(String paramName, int maxSize, float[] arg)
		{
			if(!enabled) return;
			
			requireMaxSize(paramName, maxSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at most the
		 * maximum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooBigException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param mmaxSize
		 * The maximum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooBigException If the check fails.
		 */
		public static void requireMaxSize(String paramName, int maxSize, float[] arg)
		{
			assert maxSize >= 0 : "Maximum size must be non-negative: " + maxSize;
			assert arg != null : "Argument must not be null";
			
			if(arg.length > maxSize) throw new ArgumentSizeTooBigException(paramName, arg.length, maxSize);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at most the
		 * maximum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooBigException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param mmaxSize
		 * The maximum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooBigException If the check fails.
		 */
		public static void checkMaxSize(String paramName, int maxSize, double[] arg)
		{
			if(!enabled) return;
			
			requireMaxSize(paramName, maxSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at most the
		 * maximum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooBigException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param mmaxSize
		 * The maximum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooBigException If the check fails.
		 */
		public static void requireMaxSize(String paramName, int maxSize, double[] arg)
		{
			assert maxSize >= 0 : "Maximum size must be non-negative: " + maxSize;
			assert arg != null : "Argument must not be null";
			
			if(arg.length > maxSize) throw new ArgumentSizeTooBigException(paramName, arg.length, maxSize);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at most the
		 * maximum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooBigException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param mmaxSize
		 * The maximum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooBigException If the check fails.
		 */
		public static void checkMaxSize(String paramName, int maxSize, boolean[] arg)
		{
			if(!enabled) return;
			
			requireMaxSize(paramName, maxSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at most the
		 * maximum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooBigException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param mmaxSize
		 * The maximum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooBigException If the check fails.
		 */
		public static void requireMaxSize(String paramName, int maxSize, boolean[] arg)
		{
			assert maxSize >= 0 : "Maximum size must be non-negative: " + maxSize;
			assert arg != null : "Argument must not be null";
			
			if(arg.length > maxSize) throw new ArgumentSizeTooBigException(paramName, arg.length, maxSize);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at most the
		 * maximum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooBigException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param <T> The collection type.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param mmaxSize
		 * The maximum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooBigException If the check fails.
		 */
		public static <T> void checkMaxSize(String paramName, int maxSize, Collection<T> arg)
		{
			if(!enabled) return;
			
			requireMaxSize(paramName, maxSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at most the
		 * maximum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooBigException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param <T> The collection type.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param mmaxSize
		 * The maximum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooBigException If the check fails.
		 */
		public static <T> void requireMaxSize(String paramName, int maxSize, Collection<T> arg)
		{
			assert maxSize >= 0 : "Maximum size must be non-negative: " + maxSize;
			assert arg != null : "Argument must not be null";
			
			int size = arg.size();
			
			if(size > maxSize) throw new ArgumentSizeTooBigException(paramName, size, maxSize);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at most the
		 * maximum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooBigException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param mmaxSize
		 * The maximum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooBigException If the check fails.
		 */
		public static void checkMaxSize(String paramName, int maxSize, String arg)
		{
			if(!enabled) return;
			
			requireMaxSize(paramName, maxSize, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} has at most the
		 * maximum number of elements {@code minSize}.
		 * If the check fails, the method throws an
		 * {@link ArgumentSizeTooBigException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param mmaxSize
		 * The maximum allowable number of elements in the argument.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentSizeTooBigException If the check fails.
		 */
		public static void requireMaxSize(String paramName, int maxSize, String arg)
		{
			assert maxSize >= 0 : "Maximum size must be non-negative: " + maxSize;
			assert arg != null : "Argument must not be null";
			
			int size = arg.length();
			
			if(size > maxSize) throw new ArgumentSizeTooBigException(paramName, size, maxSize);
		}

		/**
		 * Checks whether the passed argument {@code arg} contains no null
		 * entries.
		 * If the check fails, the method throws an
		 * {@link ArgumentEntryNullException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime. 
		 * 
		 * @param <T> The array type.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentEntryNullException If the check fails.
		 */
		public static <T> void checkEntriesNotNull(String paramName, T[] arg)
		{
			if(!enabled) return;
			
			requireEntriesNotNull(paramName, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} contains no null
		 * entries.
		 * If the check fails, the method throws an
		 * {@link ArgumentEntryNullException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param <T> The array type.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentEntryNullException If the check fails.
		 */
		public static <T> void requireEntriesNotNull(String paramName, T[] arg)
		{
			assert arg != null : "Argument must not be null";
			
			for(int i = 0; i < arg.length; i++)
			{
				if(arg[i] == null) throw new ArgumentEntryNullException(paramName, i);
			}
		}

		/**
		 * Checks whether the passed argument {@code arg} contains no null
		 * entries.
		 * If the check fails, the method throws an
		 * {@link ArgumentEntryNullException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * This check is only performed if argument validation is enabled by
		 * setting {@link BarghosValidationConfiguration#validateArgs} to
		 * {@code true} at application startup.
		 * 
		 * If the argument validation is disabled, the JIT may optimize away
		 * calls to this function at runtime. 
		 * 
		 * @param <T> The collection type.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentEntryNullException If the check fails.
		 */
		public static <T> void checkEntriesNotNull(String paramName, Collection<T> arg)
		{
			if(!enabled) return;
			
			requireEntriesNotNull(paramName, arg);
		}
		
		/**
		 * Checks whether the passed argument {@code arg} contains no null
		 * entries.
		 * If the check fails, the method throws an
		 * {@link ArgumentEntryNullException} for the parameter specified
		 * by {@code paramName}.
		 * 
		 * @param <T> The collection type.
		 * 
		 * @param paramName The name of the parameter to check.
		 * @param arg The value of the parameter to check.
		 * 
		 * @throws ArgumentEntryNullException If the check fails.
		 */
		public static <T> void requireEntriesNotNull(String paramName, Collection<T> arg)
		{
			assert arg != null : "Argument must not be null";
			
			int i = 0;
			for(T element : arg)
			{
				if(element == null) throw new ArgumentEntryNullException(paramName, i);
				i++;
			}

		}
	}
	
	public static class Assert
	{
		
	}
}
