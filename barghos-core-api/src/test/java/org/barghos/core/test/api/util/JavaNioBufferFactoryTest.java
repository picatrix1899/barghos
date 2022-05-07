package org.barghos.core.test.api.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

import org.barghos.core.api.util.JavaNioBufferFactory;

/**
 * This class provides component tests for the class {@link JavaNioBufferFactory}.
 * 
 * @author picatrix1899
 */
class JavaNioBufferFactoryTest
{
	/**
	 * This test ensures, that the function {@link JavaNioBufferFactory#createByteBuffer(int)}
	 * creates a buffer with the correct capacity.
	 */
	@Test
	void createByteBufferTest()
	{
		JavaNioBufferFactory factory = new JavaNioBufferFactory();
		
		ByteBuffer b = factory.createByteBuffer(10);
		
		assertNotNull(b);
		assertEquals(10, b.capacity());
	}
	
	/**
	 * This test ensures, that the function {@link JavaNioBufferFactory#createShortBuffer(int)}
	 * creates a buffer with the correct capacity.
	 */
	@Test
	void createShortBufferTest()
	{
		JavaNioBufferFactory factory = new JavaNioBufferFactory();
		
		ShortBuffer b = factory.createShortBuffer(10);
		
		assertNotNull(b);
		assertEquals(10, b.capacity());
	}
	
	/**
	 * This test ensures, that the function {@link JavaNioBufferFactory#createIntBuffer(int)}
	 * creates a buffer with the correct capacity.
	 */
	@Test
	void createIntBufferTest()
	{
		JavaNioBufferFactory factory = new JavaNioBufferFactory();
		
		IntBuffer b = factory.createIntBuffer(10);
		
		assertNotNull(b);
		assertEquals(10, b.capacity());
	}
	
	/**
	 * This test ensures, that the function {@link JavaNioBufferFactory#createLongBuffer(int)}
	 * creates a buffer with the correct capacity.
	 */
	@Test
	void createLongBufferTest()
	{
		JavaNioBufferFactory factory = new JavaNioBufferFactory();
		
		LongBuffer b = factory.createLongBuffer(10);
		
		assertNotNull(b);
		assertEquals(10, b.capacity());
	}
	
	/**
	 * This test ensures, that the function {@link JavaNioBufferFactory#createFloatBuffer(int)}
	 * creates a buffer with the correct capacity.
	 */
	@Test
	void createFloatBufferTest()
	{
		JavaNioBufferFactory factory = new JavaNioBufferFactory();
		
		FloatBuffer b = factory.createFloatBuffer(10);
		
		assertNotNull(b);
		assertEquals(10, b.capacity());
	}
	
	/**
	 * This test ensures, that the function {@link JavaNioBufferFactory#createDoubleBuffer(int)}
	 * creates a buffer with the correct capacity.
	 */
	@Test
	void createDoubleBufferTest()
	{
		JavaNioBufferFactory factory = new JavaNioBufferFactory();
		
		DoubleBuffer b = factory.createDoubleBuffer(10);
		
		assertNotNull(b);
		assertEquals(10, b.capacity());
	}
}
