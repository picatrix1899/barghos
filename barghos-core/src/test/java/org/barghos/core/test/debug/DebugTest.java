//package org.barghos.core.test.debug;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.Test;
//
//import org.barghos.core.api.testing.ValueRelay;
//
//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;
//
//import org.barghos.core.debug.Debug;
//
///**
// * This class provides component tests for the class {@link Debug}.
// * 
// * @author picatrix1899
// * 
// * @since 1.0.0.0
// */
//class DebugTest
//{
//	/**
//	 * This method is called after each test in this class.
//	 */
//	@AfterEach
//	void cleanup()
//	{
//		ValueRelay.clear();
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#print(boolean)}
//	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void print_boolean_DebugModeOffTest()
//	{
//		final boolean value = true;
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(boolean b)
//			{
//				ValueRelay.relayCall("print");
//			}
//		});
//		
//		Debug.DEBUG_MODE = false;
//		Debug.print(value);
//		
//		assertEquals(false, ValueRelay.get("print", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#print(boolean)}
//	 * only prints the value but not the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void print_boolean_StackModeOffTest()
//	{
//		final boolean value = true;
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			
//			@Override
//			public void print(boolean b)
//			{
//				assertEquals(false, ValueRelay.get("printString", false));
//				
//				assertEquals(value, b);
//				
//				ValueRelay.relayCall("printBoolean");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = false;
//		Debug.print(value);
//		
//		assertEquals(false, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printBoolean", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#print(boolean)}
//	 * prints the value and the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void print_boolean_StackModeOnTest()
//	{
//		final boolean value = true;
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			
//			@Override
//			public void print(boolean b)
//			{
//				assertEquals(true, ValueRelay.get("printString", false));
//
//				assertEquals(value, b);
//				
//				ValueRelay.relayCall("printBoolean");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = true;
//		Debug.print(value);
//		
//		assertEquals(true, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printBoolean", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#print(char)}
//	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void print_char_DebugModeOffTest()
//	{
//		final char value = 'a';
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(char b)
//			{
//				ValueRelay.relayCall("print");
//			}
//		});
//		
//		Debug.DEBUG_MODE = false;
//		Debug.print(value);
//		
//		assertEquals(false, ValueRelay.get("print", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#print(char)}
//	 * only prints the value but not the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void print_char_StackModeOffTest()
//	{
//		final char value = 'a';
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			
//			@Override
//			public void print(char b)
//			{
//				assertEquals(false, ValueRelay.get("printString", false));
//				
//				assertEquals(value, b);
//				
//				ValueRelay.relayCall("printChar");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = false;
//		Debug.print(value);
//		
//		assertEquals(false, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printChar", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#print(char)}
//	 * prints the value and the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void print_char_StackModeOnTest()
//	{
//		final char value = 'a';
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			
//			@Override
//			public void print(char b)
//			{
//				assertEquals(true, ValueRelay.get("printString", false));
//
//				assertEquals(value, b);
//				
//				ValueRelay.relayCall("printChar");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = true;
//		Debug.print(value);
//		
//		assertEquals(true, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printChar", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#print(char[])}
//	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void print_charArray_DebugModeOffTest()
//	{
//		final char[] value = new char[] {'a', 'b'};
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(char[] b)
//			{
//				ValueRelay.relayCall("print");
//			}
//		});
//		
//		Debug.DEBUG_MODE = false;
//		Debug.print(value);
//		
//		assertEquals(false, ValueRelay.get("print", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#print(char[])}
//	 * only prints the value but not the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void print_charArray_StackModeOffTest()
//	{
//		final char[] value = new char[] {'a', 'b'};
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			
//			@Override
//			public void print(char[] b)
//			{
//				assertEquals(false, ValueRelay.get("printString", false));
//				
//				assertEquals(2, b.length);
//				assertEquals(value[0], b[0]);
//				assertEquals(value[1], b[1]);
//				
//				ValueRelay.relayCall("printCharArray");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = false;
//		Debug.print(value);
//		
//		assertEquals(false, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printCharArray", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#print(char[])}
//	 * prints the value and the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void print_charArray_StackModeOnTest()
//	{
//		final char[] value = new char[] {'a', 'b'};
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			
//			@Override
//			public void print(char[] b)
//			{
//				assertEquals(true, ValueRelay.get("printString", false));
//				
//				assertEquals(2, b.length);
//				assertEquals(value[0], b[0]);
//				assertEquals(value[1], b[1]);
//				
//				ValueRelay.relayCall("printCharArray");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = true;
//		Debug.print(value);
//		
//		assertEquals(true, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printCharArray", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#print(float)}
//	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void print_float_DebugModeOffTest()
//	{
//		final float value = 1.2f;
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(float b)
//			{
//				ValueRelay.relayCall("print");
//			}
//		});
//		
//		Debug.DEBUG_MODE = false;
//		Debug.print(value);
//		
//		assertEquals(false, ValueRelay.get("print", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#print(float)}
//	 * only prints the value but not the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void print_float_StackModeOffTest()
//	{
//		final float value = 1.2f;
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			
//			@Override
//			public void print(float b)
//			{
//				assertEquals(false, ValueRelay.get("printString", false));
//
//				assertEquals(value, b);
//				
//				ValueRelay.relayCall("printFloat");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = false;
//		Debug.print(value);
//		
//		assertEquals(false, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printFloat", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#print(float)}
//	 * prints the value and the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void print_float_StackModeOnTest()
//	{
//		final float value = 1.2f;
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			
//			@Override
//			public void print(float b)
//			{
//				assertEquals(true, ValueRelay.get("printString", false));
//				
//				assertEquals(value, b);
//				
//				ValueRelay.relayCall("printFloat");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = true;
//		Debug.print(value);
//		
//		assertEquals(true, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printFloat", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#print(double)}
//	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void print_double_DebugModeOffTest()
//	{
//		final double value = 1.2;
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(double b)
//			{
//				ValueRelay.relayCall("print");
//			}
//		});
//		
//		Debug.DEBUG_MODE = false;
//		Debug.print(value);
//		
//		assertEquals(false, ValueRelay.get("print", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#print(double)}
//	 * only prints the value but not the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void print_double_StackModeOffTest()
//	{
//		final double value = 1.2;
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			
//			@Override
//			public void print(double b)
//			{
//				assertEquals(false, ValueRelay.get("printString", false));
//				
//				assertEquals(value, b);
//				
//				ValueRelay.relayCall("printDouble");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = false;
//		Debug.print(value);
//		
//		assertEquals(false, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printDouble", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#print(double)}
//	 * prints the value and the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void print_double_StackModeOnTest()
//	{
//		final double value = 1.2;
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			
//			@Override
//			public void print(double b)
//			{
//				assertEquals(true, ValueRelay.get("printString", false));
//				
//				assertEquals(value, b);
//				
//				ValueRelay.relayCall("printDouble");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = true;
//		Debug.print(value);
//		
//		assertEquals(true, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printDouble", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#print(int)}
//	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void print_int_DebugModeOffTest()
//	{
//		final int value = 2;
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(int b)
//			{
//				ValueRelay.relayCall("print");
//			}
//		});
//		
//		Debug.DEBUG_MODE = false;
//		Debug.print(value);
//		
//		assertEquals(false, ValueRelay.get("print", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#print(int)}
//	 * only prints the value but not the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void print_int_StackModeOffTest()
//	{
//		final int value = 2;
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			
//			@Override
//			public void print(int b)
//			{
//				assertEquals(false, ValueRelay.get("printString", false));
//				
//				assertEquals(value, b);
//				
//				ValueRelay.relayCall("printInt");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = false;
//		Debug.print(value);
//		
//		assertEquals(false, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printInt", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#print(int)}
//	 * prints the value and the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void print_int_StackModeOnTest()
//	{
//		final int value = 2;
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			
//			@Override
//			public void print(int b)
//			{
//				assertEquals(true, ValueRelay.get("printString", false));
//				
//				assertEquals(value, b);
//				
//				ValueRelay.relayCall("printInt");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = true;
//		Debug.print(value);
//		
//		assertEquals(true, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printInt", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#print(long)}
//	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void print_long_DebugModeOffTest()
//	{
//		final long value = 2l;
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(long b)
//			{
//				ValueRelay.relayCall("print");
//			}
//		});
//		
//		Debug.DEBUG_MODE = false;
//		Debug.print(value);
//		
//		assertEquals(false, ValueRelay.get("print", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#print(long)}
//	 * only prints the value but not the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void print_long_StackModeOffTest()
//	{
//		final long value = 2l;
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			
//			@Override
//			public void print(long b)
//			{
//				assertEquals(false, ValueRelay.get("printString", false));
//				
//				assertEquals(value, b);
//				
//				ValueRelay.relayCall("printLong");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = false;
//		Debug.print(value);
//		
//		assertEquals(false, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printLong", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#print(long)}
//	 * prints the value and the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void print_long_StackModeOnTest()
//	{
//		final long value = 2l;
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			
//			@Override
//			public void print(long b)
//			{
//				assertEquals(true, ValueRelay.get("printString", false));
//				
//				assertEquals(value, b);
//				
//				ValueRelay.relayCall("printLong");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = true;
//		Debug.print(value);
//		
//		assertEquals(true, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printLong", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#print(Object)}
//	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void print_Object_DebugModeOffTest()
//	{
//		final Object value = new Object();
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(Object b)
//			{
//				ValueRelay.relayCall("print");
//			}
//		});
//		
//		Debug.DEBUG_MODE = false;
//		Debug.print(value);
//		
//		assertEquals(false, ValueRelay.get("print", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#print(Object)}
//	 * only prints the value but not the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void print_Object_StackModeOffTest()
//	{
//		final Object value = new Object();
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			
//			@Override
//			public void print(Object b)
//			{
//				assertEquals(false, ValueRelay.get("printString", false));
//				
//				assertSame(value, b);
//				
//				ValueRelay.relayCall("printObject");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = false;
//		Debug.print(value);
//		
//		assertEquals(false, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printObject", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#print(Object)}
//	 * prints the value and the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void print_Object_StackModeOnTest()
//	{
//		final Object value = new Object();
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			
//			@Override
//			public void print(Object b)
//			{
//				assertEquals(true, ValueRelay.get("printString", false));
//				
//				assertSame(value, b);
//				
//				ValueRelay.relayCall("printObject");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = true;
//		Debug.print(value);
//		
//		assertEquals(true, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printObject", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#print(String)}
//	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void print_String_DebugModeOffTest()
//	{
//		final String value = "test";
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String b)
//			{
//				ValueRelay.relayCall("print");
//			}
//		});
//		
//		Debug.DEBUG_MODE = false;
//		Debug.print(value);
//		
//		assertEquals(false, ValueRelay.get("print", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#print(String)}
//	 * only prints the value but not the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void print_String_StackModeOffTest()
//	{
//		final String value = "test";
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCounterIncrease("printString");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = false;
//		Debug.print(value);
//		
//		assertEquals(1, ValueRelay.get("printString", 0));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#print(String)}
//	 * prints the value and the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void print_String_StackModeOnTest()
//	{
//		final String value = "test";
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCounterIncrease("printString");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = true;
//		Debug.print(value);
//		
//		assertEquals(2, ValueRelay.get("printString", 0));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#println(boolean)}
//	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void println_boolean_DebugModeOffTest()
//	{
//		final boolean value = true;
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void println(boolean b)
//			{
//				ValueRelay.relayCall("println");
//			}
//		});
//		
//		Debug.DEBUG_MODE = false;
//		Debug.println(value);
//		
//		assertEquals(false, ValueRelay.get("println", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#println(boolean)}
//	 * only prints the value but not the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void println_boolean_StackModeOffTest()
//	{
//		final boolean value = true;
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			
//			@Override
//			public void println(boolean b)
//			{
//				assertEquals(false, ValueRelay.get("printlnString", false));
//				
//				assertEquals(value, b);
//				
//				ValueRelay.relayCall("printlnBoolean");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = false;
//		Debug.println(value);
//		
//		assertEquals(false, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printlnBoolean", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#println(boolean)}
//	 * prints the value and the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void println_boolean_StackModeOnTest()
//	{
//		final boolean value = true;
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			
//			@Override
//			public void println(boolean b)
//			{
//				assertEquals(true, ValueRelay.get("printString", false));
//				
//				assertEquals(value, b);
//				
//				ValueRelay.relayCall("printlnBoolean");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = true;
//		Debug.println(value);
//		
//		assertEquals(true, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printlnBoolean", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#println(char)}
//	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void println_char_DebugModeOffTest()
//	{
//		final char value = 'a';
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void println(char b)
//			{
//				ValueRelay.relayCall("println");
//			}
//		});
//		
//		Debug.DEBUG_MODE = false;
//		Debug.println(value);
//		
//		assertEquals(false, ValueRelay.get("println", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#println(char)}
//	 * only prints the value but not the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void println_char_StackModeOffTest()
//	{
//		final char value = 'a';
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			
//			@Override
//			public void println(char b)
//			{
//				assertEquals(false, ValueRelay.get("printlnString", false));
//				
//				assertEquals(value, b);
//				
//				ValueRelay.relayCall("printlnChar");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = false;
//		Debug.println(value);
//		
//		assertEquals(false, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printlnChar", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#println(char)}
//	 * prints the value and the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void println_char_StackModeOnTest()
//	{
//		final char value = 'a';
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			
//			@Override
//			public void println(char b)
//			{
//				assertEquals(true, ValueRelay.get("printString", false));
//				
//				assertEquals(value, b);
//				
//				ValueRelay.relayCall("printlnChar");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = true;
//		Debug.println(value);
//		
//		assertEquals(true, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printlnChar", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#println(char[])}
//	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void println_charArray_DebugModeOffTest()
//	{
//		final char[] value = new char[] {'a', 'b'};
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void println(char[] b)
//			{
//				ValueRelay.relayCall("println");
//			}
//		});
//		
//		Debug.DEBUG_MODE = false;
//		Debug.println(value);
//		
//		assertEquals(false, ValueRelay.get("println", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#println(char[])}
//	 * only prints the value but not the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void println_charArray_StackModeOffTest()
//	{
//		final char[] value = new char[] {'a', 'b'};
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			
//			@Override
//			public void println(char[] b)
//			{
//				assertEquals(false, ValueRelay.get("printlnString", false));
//				
//				assertEquals(2, b.length);
//				assertEquals(value[0], b[0]);
//				assertEquals(value[1], b[1]);
//				
//				ValueRelay.relayCall("printCharArray");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = false;
//		Debug.println(value);
//		
//		assertEquals(false, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printCharArray", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#println(char[])}
//	 * prints the value and the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void println_charArray_StackModeOnTest()
//	{
//		final char[] value = new char[] {'a', 'b'};
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			
//			@Override
//			public void println(char[] b)
//			{
//				assertEquals(true, ValueRelay.get("printString", false));
//				
//				assertEquals(2, b.length);
//				assertEquals(value[0], b[0]);
//				assertEquals(value[1], b[1]);
//				
//				ValueRelay.relayCall("printCharArray");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = true;
//		Debug.println(value);
//		
//		assertEquals(true, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printCharArray", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#println(float)}
//	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void println_float_DebugModeOffTest()
//	{
//		final float value = 1.2f;
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void println(float b)
//			{
//				ValueRelay.relayCall("println");
//			}
//		});
//		
//		Debug.DEBUG_MODE = false;
//		Debug.println(value);
//		
//		assertEquals(false, ValueRelay.get("println", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#println(float)}
//	 * only prints the value but not the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void println_float_StackModeOffTest()
//	{
//		final float value = 1.2f;
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			
//			@Override
//			public void println(float b)
//			{
//				assertEquals(false, ValueRelay.get("printlnString", false));
//				
//				assertEquals(value, b);
//				
//				ValueRelay.relayCall("printlnFloat");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = false;
//		Debug.println(value);
//		
//		assertEquals(false, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printlnFloat", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#println(float)}
//	 * prints the value and the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void println_float_StackModeOnTest()
//	{
//		final float value = 1.2f;
//
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			
//			@Override
//			public void println(float b)
//			{
//				assertEquals(true, ValueRelay.get("printString", false));
//				
//				assertEquals(value, b);
//				
//				ValueRelay.relayCall("printlnFloat");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = true;
//		Debug.println(value);
//		
//		assertEquals(true, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printlnFloat", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#println(double)}
//	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void println_double_DebugModeOffTest()
//	{
//		final double value = 1.2;
//
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void println(double b)
//			{
//				ValueRelay.relayCall("println");
//			}
//		});
//		
//		Debug.DEBUG_MODE = false;
//		Debug.println(value);
//		
//		assertEquals(false, ValueRelay.get("println", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#println(double)}
//	 * only prints the value but not the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void println_double_StackModeOffTest()
//	{
//		final double value = 1.2;
//
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			
//			@Override
//			public void println(double b)
//			{
//				assertEquals(false, ValueRelay.get("printlnString", false));
//				
//				assertEquals(value, b);
//				
//				ValueRelay.relayCall("printlnDouble");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = false;
//		Debug.println(value);
//		
//		assertEquals(false, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printlnDouble", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#println(double)}
//	 * prints the value and the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void println_double_StackModeOnTest()
//	{
//		final double value = 1.2;
//
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			
//			@Override
//			public void println(double b)
//			{
//				assertEquals(true, ValueRelay.get("printString", false));
//				
//				assertEquals(value, b);
//				
//				ValueRelay.relayCall("printlnDouble");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = true;
//		Debug.println(value);
//		
//		assertEquals(true, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printlnDouble", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#println(int)}
//	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void println_int_DebugModeOffTest()
//	{
//		final int value = 2;
//
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void println(int b)
//			{
//				ValueRelay.relayCall("println");
//			}
//		});
//		
//		Debug.DEBUG_MODE = false;
//		Debug.println(value);
//		
//		assertEquals(false, ValueRelay.get("println", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#println(int)}
//	 * only prints the value but not the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void println_int_StackModeOffTest()
//	{
//		final int value = 2;
//
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			
//			@Override
//			public void println(int b)
//			{
//				assertEquals(false, ValueRelay.get("printlnString", false));
//				
//				assertEquals(value, b);
//				
//				ValueRelay.relayCall("printlnInt");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = false;
//		Debug.println(value);
//		
//		assertEquals(false, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printlnInt", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#println(int)}
//	 * prints the value and the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void println_int_StackModeOnTest()
//	{
//		final int value = 2;
//
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			
//			@Override
//			public void println(int b)
//			{
//				assertEquals(true, ValueRelay.get("printString", false));
//				
//				assertEquals(value, b);
//				
//				ValueRelay.relayCall("printlnInt");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = true;
//		Debug.println(value);
//		
//		assertEquals(true, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printlnInt", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#println(long)}
//	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void println_long_DebugModeOffTest()
//	{
//		final long value = 2l;
//
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void println(long b)
//			{
//				ValueRelay.relayCall("println");
//			}
//		});
//		
//		Debug.DEBUG_MODE = false;
//		Debug.println(value);
//		
//		assertEquals(false, ValueRelay.get("println", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#println(long)}
//	 * only prints the value but not the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void println_long_StackModeOffTest()
//	{
//		final long value = 2l;
//
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			
//			@Override
//			public void println(long b)
//			{
//				assertEquals(false, ValueRelay.get("printlnString", false));
//				
//				assertEquals(value, b);
//				
//				ValueRelay.relayCall("printlnLong");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = false;
//		Debug.println(value);
//		
//		assertEquals(false, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printlnLong", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#println(long)}
//	 * prints the value and the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void println_long_StackModeOnTest()
//	{
//		final long value = 2l;
//
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			@Override
//			public void println(long b)
//			{
//				assertEquals(false, ValueRelay.get("printlnString", false));
//				
//				assertEquals(value, b);
//				
//				ValueRelay.relayCall("printlnLong");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = true;
//		Debug.println(value);
//		
//		assertEquals(true, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printlnLong", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#println(Object)}
//	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void println_Object_DebugModeOffTest()
//	{
//		final Object value = new Object();
//		
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void println(Object b)
//			{
//				ValueRelay.relayCall("println");
//			}
//		});
//		
//		Debug.DEBUG_MODE = false;
//		Debug.println(value);
//		
//		assertEquals(false, ValueRelay.get("println", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#println(Object)}
//	 * only prints the value but not the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void println_Object_StackModeOffTest()
//	{
//		final Object value = new Object();
//
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			
//			@Override
//			public void println(Object b)
//			{
//				assertEquals(false, ValueRelay.get("printlnString", false));
//				
//				assertSame(value, b);
//				
//				ValueRelay.relayCall("printlnObject");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = false;
//		Debug.println(value);
//		
//		assertEquals(false, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printlnObject", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#println(Object)}
//	 * prints the value and the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void println_Object_StackModeOnTest()
//	{
//		final Object value = new Object();
//
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			@Override
//			public void println(Object b)
//			{
//				assertEquals(true, ValueRelay.get("printString", false));
//				
//				assertSame(value, b);
//				
//				ValueRelay.relayCall("printlnObject");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = true;
//		Debug.println(value);
//		
//		assertEquals(true, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printlnObject", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#println(String)}
//	 * doesn't print anything while {@link Debug#DEBUG_MODE} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void println_String_DebugModeOffTest()
//	{
//		final String value = "test";
//
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void println(String b)
//			{
//				ValueRelay.relayCall("println");
//			}
//		});
//		
//		Debug.DEBUG_MODE = false;
//		Debug.println(value);
//		
//		assertEquals(false, ValueRelay.get("println", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#println(String)}
//	 * only prints the value but not the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>false</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void println_String_StackModeOffTest()
//	{
//		final String value = "test";
//
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			
//			@Override
//			public void println(String s)
//			{
//				assertEquals(false, ValueRelay.get("printString", false));
//				
//				assertEquals(value, s);
//				
//				ValueRelay.relayCall("printlnString");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = false;
//		Debug.println(value);
//		
//		assertEquals(false, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printlnString", false));
//	}
//	
//	/**
//	 * This test ensures, that the method {@link Debug#println(String)}
//	 * prints the value and the current position while
//	 * {@link Debug#DEBUG_MODE} is <code>true</code> and
//	 * {@link Debug#PRINT_STACK_ELEMENT} is <code>true</code>.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void println_String_StackModeOnTest()
//	{
//		final String value = "test";
//
//		System.setOut(new PrintStream(new ByteArrayOutputStream()) {
//			@Override
//			public void print(String s)
//			{
//				ValueRelay.relayCall("printString");
//			}
//			
//			@Override
//			public void println(String s)
//			{
//				assertEquals(true, ValueRelay.get("printString", false));
//				
//				assertEquals(value, s);
//				
//				ValueRelay.relayCall("printlnString");
//			}
//		});
//		
//		Debug.DEBUG_MODE = true;
//		Debug.PRINT_STACK_ELEMENT = true;
//		Debug.println(value);
//		
//		assertEquals(true, ValueRelay.get("printString", false));
//		assertEquals(true, ValueRelay.get("printlnString", false));
//	}
//}