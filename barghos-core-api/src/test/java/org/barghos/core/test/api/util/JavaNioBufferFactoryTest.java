package org.barghos.core.test.api.util;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

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
	
	/**
	 * This test ensures, that the function {@link JavaNioBufferFactory#destroyBuffer(ByteBuffer)}
	 * does not do anything.
	 */
	@Test
	void destroyBuffer_ByteTest()
	{
		JavaNioBufferFactory factory = new JavaNioBufferFactory();
		
		ByteBuffer b = mock(ByteBuffer.class);
		
		factory.destroyBuffer(b);
		
		verifyNoInteractions(b);
	}
	
	/**
	 * This test ensures, that the function {@link JavaNioBufferFactory#destroyBuffer(ShortBuffer)}
	 * does not do anything.
	 */
	@Test
	void destroyBuffer_ShortTest()
	{
		JavaNioBufferFactory factory = new JavaNioBufferFactory();
		
		ShortBuffer b = mock(ShortBuffer.class);
		
		factory.destroyBuffer(b);
		
		verifyNoInteractions(b);
	}
	
	/**
	 * This test ensures, that the function {@link JavaNioBufferFactory#destroyBuffer(IntBuffer)}
	 * does not do anything.
	 */
	@Test
	void destroyBuffer_IntTest()
	{
		JavaNioBufferFactory factory = new JavaNioBufferFactory();
		
		IntBuffer b = mock(IntBuffer.class);
		
		factory.destroyBuffer(b);
		
		verifyNoInteractions(b);
	}
	
	/**
	 * This test ensures, that the function {@link JavaNioBufferFactory#destroyBuffer(LongBuffer)}
	 * does not do anything.
	 */
	@Test
	void destroyBuffer_LongTest()
	{
		JavaNioBufferFactory factory = new JavaNioBufferFactory();
		
		LongBuffer b = mock(LongBuffer.class);
		
		factory.destroyBuffer(b);
		
		verifyNoInteractions(b);
	}
	
	/**
	 * This test ensures, that the function {@link JavaNioBufferFactory#destroyBuffer(FloatBuffer)}
	 * does not do anything.
	 */
	@Test
	void destroyBuffer_FloatTest()
	{
		JavaNioBufferFactory factory = new JavaNioBufferFactory();
		
		FloatBuffer b = mock(FloatBuffer.class);
		
		factory.destroyBuffer(b);
		
		verifyNoInteractions(b);
	}
	
	/**
	 * This test ensures, that the function {@link JavaNioBufferFactory#destroyBuffer(DoubleBuffer)}
	 * does not do anything.
	 */
	@Test
	void destroyBuffer_DoubleTest()
	{
		JavaNioBufferFactory factory = new JavaNioBufferFactory();
		
		DoubleBuffer b = mock(DoubleBuffer.class);
		
		factory.destroyBuffer(b);
		
		verifyNoInteractions(b);
	}
}
