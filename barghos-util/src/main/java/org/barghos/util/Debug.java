package org.barghos.util;

/**
 * This class provides a better way to do <code>System.out.prinln("")</code> for debugging purposes.
 * It can show along with the normal output the exact position of its call.
 * This enables the easy finding of leftover debug outputs as long as one of the print methods is called.
 * The debug output can also be disabled.
 * 
 * @author picatrix1899
 */
public class Debug
{
	/**
	 * By setting this to true, calls to the print methods actually output data to the System.out stream.
	 * Otherwise the output will be suppressed.
	 */
	public static boolean DEBUG_MODE = false;
	
	/**
	 * By setting this to true, the exact location of the print call is appended before the output data as long as
	 * DEBUG_MODE is <code>true</code>.
	 */
	public static boolean PRINT_STACK_ELEMENT = false;
	
	/**
	 * Prints the entire stack of the current thread to the standard error stream if {@link Debug#DEBUG_MODE} is true.
	 */
	public static void printCurrentStack()
	{
		if(!DEBUG_MODE) return;
		
		Thread.dumpStack();
	}
	
	/**
	 * Prints a boolean value to {@link System#out} if {@link Debug#DEBUG_MODE} is true.
	 * This behaves like a call to {@link java.io.PrintStream#print(boolean)}.
	 * If {@link Debug#PRINT_STACK_ELEMENT} is true, the name of the current element in the stack (e.g. current function)
	 * is appended before the value.
	 * 
	 * @param b The boolean to be printed
	 */
	public static void print(boolean b)
	{
		if(!DEBUG_MODE) return;
		
		if(PRINT_STACK_ELEMENT) System.out.print(getCurrentStackElement() + ": ");
		System.out.print(b);
	}
	
	/**
	 * Prints a character to {@link System#out} if {@link Debug#DEBUG_MODE} is true.
	 * This behaves like a call to {@link java.io.PrintStream#print(char)}.
	 * If {@link Debug#PRINT_STACK_ELEMENT} is true, the name of the current element in the stack (e.g. current function)
	 * is appended before the value.
	 * 
	 * @param c The character to be printed
	 */
	public static void print(char c)
	{
		if(!DEBUG_MODE) return;
		
		if(PRINT_STACK_ELEMENT) System.out.print(getCurrentStackElement() + ": ");
		System.out.print(c);
	}
	
	/**
	 * Prints an array of characters to {@link System#out} if {@link Debug#DEBUG_MODE} is true.
	 * This behaves like a call to {@link java.io.PrintStream#print(char[])}.
	 * If {@link Debug#PRINT_STACK_ELEMENT} is true, the name of the current element in the stack (e.g. current function)
	 * is appended before the value.
	 * 
	 * @param c The characters to be printed
	 */
	public static void print(char... c)
	{
		if(!DEBUG_MODE) return;
		
		if(PRINT_STACK_ELEMENT) System.out.print(getCurrentStackElement() + ": ");
		System.out.print(c);
	}
	
	/**
	 * Prints a float value to {@link System#out} if {@link Debug#DEBUG_MODE} is true.
	 * This behaves like a call to {@link java.io.PrintStream#print(float)}.
	 * If {@link Debug#PRINT_STACK_ELEMENT} is true, the name of the current element in the stack (e.g. current function)
	 * is appended before the value.
	 * 
	 * @param f The float to be printed
	 */
	public static void print(float f)
	{
		if(!DEBUG_MODE) return;
		
		if(PRINT_STACK_ELEMENT) System.out.print(getCurrentStackElement() + ": ");
		System.out.print(f);
	}
	
	/**
	 * Prints a double value to {@link System#out} if {@link Debug#DEBUG_MODE} is true.
	 * This behaves like a call to {@link java.io.PrintStream#print(double)}.
	 * If {@link Debug#PRINT_STACK_ELEMENT} is true, the name of the current element in the stack (e.g. current function)
	 * is appended before the value.
	 * 
	 * @param d The double to be printed
	 */
	public static void print(double d)
	{
		if(!DEBUG_MODE) return;
		
		if(PRINT_STACK_ELEMENT) System.out.print(getCurrentStackElement() + ": ");
		System.out.print(d);
	}
	
	/**
	 * Prints an integer to {@link System#out} if {@link Debug#DEBUG_MODE} is true.
	 * This behaves like a call to {@link java.io.PrintStream#print(int)}.
	 * If {@link Debug#PRINT_STACK_ELEMENT} is true, the name of the current element in the stack (e.g. current function)
	 * is appended before the value.
	 * 
	 * @param i The interger to be printed
	 */
	public static void print(int i)
	{
		if(!DEBUG_MODE) return;
		
		if(PRINT_STACK_ELEMENT) System.out.print(getCurrentStackElement() + ": ");
		System.out.print(i);
	}
	
	/**
	 * Prints a long value to {@link System#out} if {@link Debug#DEBUG_MODE} is true.
	 * This behaves like a call to {@link java.io.PrintStream#print(long)}.
	 * If {@link Debug#PRINT_STACK_ELEMENT} is true, the name of the current element in the stack (e.g. current function)
	 * is appended before the value.
	 * 
	 * @param l The long to be printed
	 */
	public static void print(long l)
	{
		if(!DEBUG_MODE) return;
		
		if(PRINT_STACK_ELEMENT) System.out.print(getCurrentStackElement() + ": ");
		System.out.print(l);
	}
	
	/**
	 * Prints an object to {@link System#out} if {@link Debug#DEBUG_MODE} is true.
	 * This behaves like a call to {@link java.io.PrintStream#print(Object)}.
	 * If {@link Debug#PRINT_STACK_ELEMENT} is true, the name of the current element in the stack (e.g. current function)
	 * is appended before the value.
	 * 
	 * @param o The object to be printed
	 */
	public static void print(Object o)
	{
		if(!DEBUG_MODE) return;
		
		if(PRINT_STACK_ELEMENT) System.out.print(getCurrentStackElement() + ": ");
		System.out.print(o);
	}
	
	/**
	 * Prints a string to {@link System#out} if {@link Debug#DEBUG_MODE} is true.
	 * This behaves like a call to {@link java.io.PrintStream#print(String)}.
	 * If {@link Debug#PRINT_STACK_ELEMENT} is true, the name of the current element in the stack (e.g. current function)
	 * is appended before the value.
	 * 
	 * @param s The string to be printed
	 */
	public static void print(String s)
	{
		if(!DEBUG_MODE) return;
		
		if(PRINT_STACK_ELEMENT) System.out.print(getCurrentStackElement() + ": ");
		System.out.print(s);
	}

	/**
	 * Prints a boolean value to {@link System#out} and terminates the line if {@link Debug#DEBUG_MODE} is true.
	 * This behaves like a call to {@link java.io.PrintStream#println(boolean)}.
	 * If {@link Debug#PRINT_STACK_ELEMENT} is true, the name of the current element in the stack (e.g. current function)
	 * is appended before the value.
	 * 
	 * @param b The boolean to be printed
	 */
	public static void println(boolean b)
	{
		if(!DEBUG_MODE) return;
		
		if(PRINT_STACK_ELEMENT) System.out.print(getCurrentStackElement() + ": ");
		System.out.println(b);
	}
	
	/**
	 * Prints a character to {@link System#out} and terminates the line if {@link Debug#DEBUG_MODE} is true.
	 * This behaves like a call to {@link java.io.PrintStream#println(char)}.
	 * If {@link Debug#PRINT_STACK_ELEMENT} is true, the name of the current element in the stack (e.g. current function)
	 * is appended before the value.
	 * 
	 * @param c The character to be printed
	 */
	public static void println(char c)
	{
		if(!DEBUG_MODE) return;
		
		if(PRINT_STACK_ELEMENT) System.out.print(getCurrentStackElement() + ": ");
		System.out.println(c);
	}
	
	/**
	 * Prints an array of characters to {@link System#out} and terminates the line if {@link Debug#DEBUG_MODE} is true.
	 * This behaves like a call to {@link java.io.PrintStream#println(char[])}.
	 * If {@link Debug#PRINT_STACK_ELEMENT} is true, the name of the current element in the stack (e.g. current function)
	 * is appended before the value.
	 * 
	 * @param c The characters to be printed
	 */
	public static void println(char... c)
	{
		if(!DEBUG_MODE) return;
		
		if(PRINT_STACK_ELEMENT) System.out.print(getCurrentStackElement() + ": ");
		System.out.println(c);
	}
	
	/**
	 * Prints a float value to {@link System#out} and terminates the line if {@link Debug#DEBUG_MODE} is true.
	 * This behaves like a call to {@link java.io.PrintStream#println(float)}.
	 * If {@link Debug#PRINT_STACK_ELEMENT} is true, the name of the current element in the stack (e.g. current function)
	 * is appended before the value.
	 * 
	 * @param f The float to be printed
	 */
	public static void println(float f)
	{
		if(!DEBUG_MODE) return;
		
		if(PRINT_STACK_ELEMENT) System.out.print(getCurrentStackElement() + ": ");
		System.out.println(f);
	}
	
	/**
	 * Prints a double value to {@link System#out} and terminates the line if {@link Debug#DEBUG_MODE} is true.
	 * This behaves like a call to {@link java.io.PrintStream#println(double)}.
	 * If {@link Debug#PRINT_STACK_ELEMENT} is true, the name of the current element in the stack (e.g. current function)
	 * is appended before the value.
	 * 
	 * @param d The double to be printed
	 */
	public static void println(double d)
	{
		if(!DEBUG_MODE) return;
		
		if(PRINT_STACK_ELEMENT) System.out.print(getCurrentStackElement() + ": ");
		System.out.println(d);
	}
	
	/**
	 * Prints an integer value to {@link System#out} and terminates the line if {@link Debug#DEBUG_MODE} is true.
	 * This behaves like a call to {@link java.io.PrintStream#println(int)}.
	 * If {@link Debug#PRINT_STACK_ELEMENT} is true, the name of the current element in the stack (e.g. current function)
	 * is appended before the value.
	 * 
	 * @param i The int to be printed
	 */
	public static void println(int i)
	{
		if(!DEBUG_MODE) return;
		
		if(PRINT_STACK_ELEMENT) System.out.print(getCurrentStackElement() + ": ");
		System.out.println(i);
	}
	
	/**
	 * Prints a long value to {@link System#out} and terminates the line if {@link Debug#DEBUG_MODE} is true.
	 * This behaves like a call to {@link java.io.PrintStream#println(long)}.
	 * If {@link Debug#PRINT_STACK_ELEMENT} is true, the name of the current element in the stack (e.g. current function)
	 * is appended before the value.
	 * 
	 * @param l The long to be printed
	 */
	public static void println(long l)
	{
		if(!DEBUG_MODE) return;
		
		if(PRINT_STACK_ELEMENT) System.out.print(getCurrentStackElement() + ": ");
		System.out.println(l);
	}
	
	/**
	 * Prints an object to {@link System#out} and terminates the line if {@link Debug#DEBUG_MODE} is true.
	 * This behaves like a call to {@link java.io.PrintStream#println(Object)}.
	 * If {@link Debug#PRINT_STACK_ELEMENT} is true, the name of the current element in the stack (e.g. current function)
	 * is appended before the value.
	 * 
	 * @param o The object to be printed
	 */
	public static void println(Object o)
	{
		if(!DEBUG_MODE) return;
		
		if(PRINT_STACK_ELEMENT) System.out.print(getCurrentStackElement() + ": ");
		System.out.println(o);
	}
	
	/**
	 * Prints a string to {@link System#out} and terminates the line if {@link Debug#DEBUG_MODE} is true.
	 * This behaves like a call to {@link java.io.PrintStream#println(String)}.
	 * If {@link Debug#PRINT_STACK_ELEMENT} is true, the name of the current element in the stack (e.g. current function)
	 * is appended before the value.
	 * 
	 * @param s The string to be printed
	 */
	public static void println(String s)
	{
		if(!DEBUG_MODE) return;
		
		if(PRINT_STACK_ELEMENT) System.out.print(getCurrentStackElement() + ": ");
		System.out.println(s);
	}
	
	/**
	 * Returns the current stack element as a string consisting of the class name,
	 * the method name, the java file and if present the line number.
	 * 
	 * @return the current stack element
	 */
	private static String getCurrentStackElement()
	{
		StackTraceElement[] elements = Thread.currentThread().getStackTrace();
		
		StackTraceElement element = elements[3];
		
		return element.getClassName() + "." + element.getMethodName() + "(" + element.getFileName() + (element.getLineNumber() >= 0 ? ":" + element.getLineNumber() : "") + ")";
	}
}
