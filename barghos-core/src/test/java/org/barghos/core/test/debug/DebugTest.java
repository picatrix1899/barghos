package org.barghos.core.test.debug;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.barghos.core.debug.Debug;

/**
 * This class provides component tests for the class {@link Debug}.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
class DebugTest
{
	/**
	 * This test ensures, that the method {@link Debug#print(boolean)}
	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void print_boolean_DebugModeOffTest()
	{
		final boolean value = true;
		
		final ExecutionHelper helper = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(boolean b)
			{
				helper.run();
			}
		});
		
		Debug.DEBUG_MODE = false;
		Debug.print(value);
		
		assertFalse(helper.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#print(boolean)}
	 * only prints the value but not the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void print_boolean_StackModeOffTest()
	{
		final boolean value = true;
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			
			@Override
			public void print(boolean b)
			{
				assertFalse(helperStack.wasExecuted);
				
				assertEquals(value, b);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = false;
		Debug.print(value);
		
		assertFalse(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#print(boolean)}
	 * prints the value and the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void print_boolean_StackModeOnTest()
	{
		final boolean value = true;
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			
			@Override
			public void print(boolean b)
			{
				assertTrue(helperStack.wasExecuted);
				
				assertEquals(value, b);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = true;
		Debug.print(value);
		
		assertTrue(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#print(char)}
	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void print_char_DebugModeOffTest()
	{
		final char value = 'a';
		
		final ExecutionHelper helper = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(char b)
			{
				helper.run();
			}
		});
		
		Debug.DEBUG_MODE = false;
		Debug.print(value);
		
		assertFalse(helper.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#print(char)}
	 * only prints the value but not the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void print_char_StackModeOffTest()
	{
		final char value = 'a';
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			
			@Override
			public void print(char b)
			{
				assertFalse(helperStack.wasExecuted);
				
				assertEquals(value, b);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = false;
		Debug.print(value);
		
		assertFalse(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#print(char)}
	 * prints the value and the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void print_char_StackModeOnTest()
	{
		final char value = 'a';
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			
			@Override
			public void print(char b)
			{
				assertTrue(helperStack.wasExecuted);
				
				assertEquals(value, b);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = true;
		Debug.print(value);
		
		assertTrue(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#print(char[])}
	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void print_charArray_DebugModeOffTest()
	{
		final char[] value = new char[] {'a', 'b'};
		
		final ExecutionHelper helper = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(char[] b)
			{
				helper.run();
			}
		});
		
		Debug.DEBUG_MODE = false;
		Debug.print(value);
		
		assertFalse(helper.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#print(char[])}
	 * only prints the value but not the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void print_charArray_StackModeOffTest()
	{
		final char[] value = new char[] {'a', 'b'};
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			
			@Override
			public void print(char[] b)
			{
				assertFalse(helperStack.wasExecuted);
				
				assertEquals(2, b.length);
				assertEquals(value[0], b[0]);
				assertEquals(value[1], b[1]);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = false;
		Debug.print(value);
		
		assertFalse(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#print(char[])}
	 * prints the value and the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void print_charArray_StackModeOnTest()
	{
		final char[] value = new char[] {'a', 'b'};
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			
			@Override
			public void print(char[] b)
			{
				assertTrue(helperStack.wasExecuted);
				
				assertEquals(2, b.length);
				assertEquals(value[0], b[0]);
				assertEquals(value[1], b[1]);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = true;
		Debug.print(value);
		
		assertTrue(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#print(float)}
	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void print_float_DebugModeOffTest()
	{
		final float value = 1.2f;
		
		final ExecutionHelper helper = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(float b)
			{
				helper.run();
			}
		});
		
		Debug.DEBUG_MODE = false;
		Debug.print(value);
		
		assertFalse(helper.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#print(float)}
	 * only prints the value but not the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void print_float_StackModeOffTest()
	{
		final float value = 1.2f;
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			
			@Override
			public void print(float b)
			{
				assertFalse(helperStack.wasExecuted);
				
				assertEquals(value, b);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = false;
		Debug.print(value);
		
		assertFalse(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#print(float)}
	 * prints the value and the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void print_float_StackModeOnTest()
	{
		final float value = 1.2f;
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			
			@Override
			public void print(float b)
			{
				assertTrue(helperStack.wasExecuted);
				
				assertEquals(value, b);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = true;
		Debug.print(value);
		
		assertTrue(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#print(double)}
	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void print_double_DebugModeOffTest()
	{
		final double value = 1.2;
		
		final ExecutionHelper helper = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(double b)
			{
				helper.run();
			}
		});
		
		Debug.DEBUG_MODE = false;
		Debug.print(value);
		
		assertFalse(helper.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#print(double)}
	 * only prints the value but not the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void print_double_StackModeOffTest()
	{
		final double value = 1.2;
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			
			@Override
			public void print(double b)
			{
				assertFalse(helperStack.wasExecuted);
				
				assertEquals(value, b);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = false;
		Debug.print(value);
		
		assertFalse(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#print(double)}
	 * prints the value and the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void print_double_StackModeOnTest()
	{
		final double value = 1.2;
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			
			@Override
			public void print(double b)
			{
				assertTrue(helperStack.wasExecuted);
				
				assertEquals(value, b);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = true;
		Debug.print(value);
		
		assertTrue(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#print(int)}
	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void print_int_DebugModeOffTest()
	{
		final int value = 2;
		
		final ExecutionHelper helper = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(int b)
			{
				helper.run();
			}
		});
		
		Debug.DEBUG_MODE = false;
		Debug.print(value);
		
		assertFalse(helper.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#print(int)}
	 * only prints the value but not the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void print_int_StackModeOffTest()
	{
		final int value = 2;
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			
			@Override
			public void print(int b)
			{
				assertFalse(helperStack.wasExecuted);
				
				assertEquals(value, b);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = false;
		Debug.print(value);
		
		assertFalse(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#print(int)}
	 * prints the value and the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void print_int_StackModeOnTest()
	{
		final int value = 2;
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			
			@Override
			public void print(int b)
			{
				assertTrue(helperStack.wasExecuted);
				
				assertEquals(value, b);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = true;
		Debug.print(value);
		
		assertTrue(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#print(long)}
	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void print_long_DebugModeOffTest()
	{
		final long value = 2l;
		
		final ExecutionHelper helper = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(long b)
			{
				helper.run();
			}
		});
		
		Debug.DEBUG_MODE = false;
		Debug.print(value);
		
		assertFalse(helper.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#print(long)}
	 * only prints the value but not the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void print_long_StackModeOffTest()
	{
		final long value = 2l;
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			
			@Override
			public void print(long b)
			{
				assertFalse(helperStack.wasExecuted);
				
				assertEquals(value, b);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = false;
		Debug.print(value);
		
		assertFalse(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#print(long)}
	 * prints the value and the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void print_long_StackModeOnTest()
	{
		final long value = 2l;
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			
			@Override
			public void print(long b)
			{
				assertTrue(helperStack.wasExecuted);
				
				assertEquals(value, b);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = true;
		Debug.print(value);
		
		assertTrue(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#print(Object)}
	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void print_Object_DebugModeOffTest()
	{
		final Object value = new Object();
		
		final ExecutionHelper helper = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(Object b)
			{
				helper.run();
			}
		});
		
		Debug.DEBUG_MODE = false;
		Debug.print(value);
		
		assertFalse(helper.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#print(Object)}
	 * only prints the value but not the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void print_Object_StackModeOffTest()
	{
		final Object value = new Object();
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			
			@Override
			public void print(Object b)
			{
				assertFalse(helperStack.wasExecuted);
				
				assertSame(value, b);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = false;
		Debug.print(value);
		
		assertFalse(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#print(Object)}
	 * prints the value and the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void print_Object_StackModeOnTest()
	{
		final Object value = new Object();
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			
			@Override
			public void print(Object b)
			{
				assertTrue(helperStack.wasExecuted);
				
				assertSame(value, b);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = true;
		Debug.print(value);
		
		assertTrue(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#print(String)}
	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void print_String_DebugModeOffTest()
	{
		final String value = "test";
		
		final ExecutionHelper helper = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String b)
			{
				helper.run();
			}
		});
		
		Debug.DEBUG_MODE = false;
		Debug.print(value);
		
		assertFalse(helper.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#print(String)}
	 * only prints the value but not the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void print_String_StackModeOffTest()
	{
		final String value = "test";
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			private int counter = 0;
			
			@Override
			public void print(String s)
			{
				if(counter == 0)
				{
					assertEquals(value, s);
					
					helperValue.run();
					
					counter++;
				}
				else
				{
					fail();
				}
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = false;
		Debug.print(value);
		
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#print(String)}
	 * prints the value and the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void print_String_StackModeOnTest()
	{
		final String value = "test";
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			private int counter = 0;
			
			@Override
			public void print(String s)
			{
				if(counter == 0)
				{
					helperStack.run();
					
					counter++;
				}
				else if(counter == 1)
				{
					assertEquals(value, s);
					
					helperValue.run();
					
					counter++;
				}
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = true;
		Debug.print(value);
		
		assertTrue(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#println(boolean)}
	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void println_boolean_DebugModeOffTest()
	{
		final boolean value = true;
		
		final ExecutionHelper helper = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void println(boolean b)
			{
				helper.run();
			}
		});
		
		Debug.DEBUG_MODE = false;
		Debug.println(value);
		
		assertFalse(helper.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#println(boolean)}
	 * only prints the value but not the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void println_boolean_StackModeOffTest()
	{
		final boolean value = true;
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			
			@Override
			public void println(boolean b)
			{
				assertFalse(helperStack.wasExecuted);
				
				assertEquals(value, b);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = false;
		Debug.println(value);
		
		assertFalse(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#println(boolean)}
	 * prints the value and the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void println_boolean_StackModeOnTest()
	{
		final boolean value = true;
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			
			@Override
			public void println(boolean b)
			{
				assertTrue(helperStack.wasExecuted);
				
				assertEquals(value, b);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = true;
		Debug.println(value);
		
		assertTrue(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#println(char)}
	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void println_char_DebugModeOffTest()
	{
		final char value = 'a';
		
		final ExecutionHelper helper = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void println(char b)
			{
				helper.run();
			}
		});
		
		Debug.DEBUG_MODE = false;
		Debug.println(value);
		
		assertFalse(helper.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#println(char)}
	 * only prints the value but not the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void println_char_StackModeOffTest()
	{
		final char value = 'a';
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			
			@Override
			public void println(char b)
			{
				assertFalse(helperStack.wasExecuted);
				
				assertEquals(value, b);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = false;
		Debug.println(value);
		
		assertFalse(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#println(char)}
	 * prints the value and the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void println_char_StackModeOnTest()
	{
		final char value = 'a';
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			
			@Override
			public void println(char b)
			{
				assertTrue(helperStack.wasExecuted);
				
				assertEquals(value, b);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = true;
		Debug.println(value);
		
		assertTrue(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#println(char[])}
	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void println_charArray_DebugModeOffTest()
	{
		final char[] value = new char[] {'a', 'b'};
		
		final ExecutionHelper helper = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void println(char[] b)
			{
				helper.run();
			}
		});
		
		Debug.DEBUG_MODE = false;
		Debug.println(value);
		
		assertFalse(helper.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#println(char[])}
	 * only prints the value but not the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void println_charArray_StackModeOffTest()
	{
		final char[] value = new char[] {'a', 'b'};
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			
			@Override
			public void println(char[] b)
			{
				assertFalse(helperStack.wasExecuted);
				
				assertEquals(2, b.length);
				assertEquals(value[0], b[0]);
				assertEquals(value[1], b[1]);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = false;
		Debug.println(value);
		
		assertFalse(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#println(char[])}
	 * prints the value and the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void println_charArray_StackModeOnTest()
	{
		final char[] value = new char[] {'a', 'b'};
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			
			@Override
			public void println(char[] b)
			{
				assertTrue(helperStack.wasExecuted);
				
				assertEquals(2, b.length);
				assertEquals(value[0], b[0]);
				assertEquals(value[1], b[1]);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = true;
		Debug.println(value);
		
		assertTrue(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#println(float)}
	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void println_float_DebugModeOffTest()
	{
		final float value = 1.2f;
		
		final ExecutionHelper helper = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void println(float b)
			{
				helper.run();
			}
		});
		
		Debug.DEBUG_MODE = false;
		Debug.println(value);
		
		assertFalse(helper.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#println(float)}
	 * only prints the value but not the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void println_float_StackModeOffTest()
	{
		final float value = 1.2f;
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			
			@Override
			public void println(float b)
			{
				assertFalse(helperStack.wasExecuted);
				
				assertEquals(value, b);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = false;
		Debug.println(value);
		
		assertFalse(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#println(float)}
	 * prints the value and the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void println_float_StackModeOnTest()
	{
		final float value = 1.2f;
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			
			@Override
			public void println(float b)
			{
				assertTrue(helperStack.wasExecuted);
				
				assertEquals(value, b);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = true;
		Debug.println(value);
		
		assertTrue(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#println(double)}
	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void println_double_DebugModeOffTest()
	{
		final double value = 1.2;
		
		final ExecutionHelper helper = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void println(double b)
			{
				helper.run();
			}
		});
		
		Debug.DEBUG_MODE = false;
		Debug.println(value);
		
		assertFalse(helper.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#println(double)}
	 * only prints the value but not the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void println_double_StackModeOffTest()
	{
		final double value = 1.2;
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			
			@Override
			public void println(double b)
			{
				assertFalse(helperStack.wasExecuted);
				
				assertEquals(value, b);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = false;
		Debug.println(value);
		
		assertFalse(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#println(double)}
	 * prints the value and the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void println_double_StackModeOnTest()
	{
		final double value = 1.2;
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			
			@Override
			public void println(double b)
			{
				assertTrue(helperStack.wasExecuted);
				
				assertEquals(value, b);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = true;
		Debug.println(value);
		
		assertTrue(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#println(int)}
	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void println_int_DebugModeOffTest()
	{
		final int value = 2;
		
		final ExecutionHelper helper = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void println(int b)
			{
				helper.run();
			}
		});
		
		Debug.DEBUG_MODE = false;
		Debug.println(value);
		
		assertFalse(helper.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#println(int)}
	 * only prints the value but not the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void println_int_StackModeOffTest()
	{
		final int value = 2;
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			
			@Override
			public void println(int b)
			{
				assertFalse(helperStack.wasExecuted);
				
				assertEquals(value, b);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = false;
		Debug.println(value);
		
		assertFalse(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#println(int)}
	 * prints the value and the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void println_int_StackModeOnTest()
	{
		final int value = 2;
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			
			@Override
			public void println(int b)
			{
				assertTrue(helperStack.wasExecuted);
				
				assertEquals(value, b);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = true;
		Debug.println(value);
		
		assertTrue(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#println(long)}
	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void println_long_DebugModeOffTest()
	{
		final long value = 2l;
		
		final ExecutionHelper helper = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void println(long b)
			{
				helper.run();
			}
		});
		
		Debug.DEBUG_MODE = false;
		Debug.println(value);
		
		assertFalse(helper.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#println(long)}
	 * only prints the value but not the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void println_long_StackModeOffTest()
	{
		final long value = 2l;
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			
			@Override
			public void println(long b)
			{
				assertFalse(helperStack.wasExecuted);
				
				assertEquals(value, b);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = false;
		Debug.println(value);
		
		assertFalse(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#println(long)}
	 * prints the value and the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void println_long_StackModeOnTest()
	{
		final long value = 2l;
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			@Override
			public void println(long b)
			{
				assertTrue(helperStack.wasExecuted);
				
				assertEquals(value, b);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = true;
		Debug.println(value);
		
		assertTrue(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#println(Object)}
	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void println_Object_DebugModeOffTest()
	{
		final Object value = new Object();
		
		final ExecutionHelper helper = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void println(Object b)
			{
				helper.run();
			}
		});
		
		Debug.DEBUG_MODE = false;
		Debug.println(value);
		
		assertFalse(helper.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#println(Object)}
	 * only prints the value but not the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void println_Object_StackModeOffTest()
	{
		final Object value = new Object();
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			
			@Override
			public void println(Object b)
			{
				assertFalse(helperStack.wasExecuted);
				
				assertSame(value, b);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = false;
		Debug.println(value);
		
		assertFalse(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#println(Object)}
	 * prints the value and the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void println_Object_StackModeOnTest()
	{
		final Object value = new Object();
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			@Override
			public void println(Object b)
			{
				assertTrue(helperStack.wasExecuted);
				
				assertSame(value, b);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = true;
		Debug.println(value);
		
		assertTrue(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#println(String)}
	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void println_String_DebugModeOffTest()
	{
		final String value = "test";
		
		final ExecutionHelper helper = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void println(String b)
			{
				helper.run();
			}
		});
		
		Debug.DEBUG_MODE = false;
		Debug.println(value);
		
		assertFalse(helper.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#println(String)}
	 * only prints the value but not the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void println_String_StackModeOffTest()
	{
		final String value = "test";
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			
			@Override
			public void println(String s)
			{
				assertFalse(helperStack.wasExecuted);
				
				assertEquals(value, s);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = false;
		Debug.println(value);
		
		assertFalse(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This test ensures, that the method {@link Debug#println(String)}
	 * prints the value and the current position while
	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void println_String_StackModeOnTest()
	{
		final String value = "test";
		
		final ExecutionHelper helperValue = new ExecutionHelper();
		final ExecutionHelper helperStack = new ExecutionHelper();
		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
			@Override
			public void print(String s)
			{
				helperStack.run();
			}
			
			@Override
			public void println(String s)
			{
				assertTrue(helperStack.wasExecuted);
				
				assertEquals(value, s);
				
				helperValue.run();
			}
		});
		
		Debug.DEBUG_MODE = true;
		Debug.PRINT_STACK_ELEMENT = true;
		Debug.println(value);
		
		assertTrue(helperStack.wasExecuted);
		assertTrue(helperValue.wasExecuted);
	}
	
	/**
	 * This class sets a boolean member variable to true if the {@link ExecutionHelper#run()} method was called.
	 * It is therefore a tool to check if function calls in an anonymous implementation were made.
	 * 
	 * @author picatrix1899
	 * 
	 * @since 1.0.0.0
	 */
	private static class ExecutionHelper implements Runnable
	{
		public boolean wasExecuted = false;
		
		@Override
		public void run()
		{
			wasExecuted = true;
		}
	}
}