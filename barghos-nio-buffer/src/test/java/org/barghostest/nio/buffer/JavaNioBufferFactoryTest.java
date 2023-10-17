package org.barghostest.nio.buffer;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.barghos.nio.buffer.JavaNioBufferFactory;
import org.junit.jupiter.api.Test;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

/**
 * This class provides component tests for the class {@link JavaNioBufferFactory}.
 * 
 * @author picatrix1899
 */
class JavaNioBufferFactoryTest
{
	/**
	 * This test ensures, that the function {@link JavaNioBufferFactory#directByteBuffer(int)}
	 * creates a buffer with the correct capacity.
	 */
	@Test
	void createByteBufferTest()
	{
		JavaNioBufferFactory factory = new JavaNioBufferFactory();
		
		ByteBuffer b = factory.directByteBuffer(10);
		
		assertNotNull(b);
		assertEquals(10, b.capacity());
	}
	
	/**
	 * This test ensures, that the function {@link JavaNioBufferFactory#directShortBuffer(int)}
	 * creates a buffer with the correct capacity.
	 */
	@Test
	void createShortBufferTest()
	{
		JavaNioBufferFactory factory = new JavaNioBufferFactory();
		
		ShortBuffer b = factory.directShortBuffer(10);
		
		assertNotNull(b);
		assertEquals(10, b.capacity());
	}
	
	/**
	 * This test ensures, that the function {@link JavaNioBufferFactory#directIntBuffer(int)}
	 * creates a buffer with the correct capacity.
	 */
	@Test
	void createIntBufferTest()
	{
		JavaNioBufferFactory factory = new JavaNioBufferFactory();
		
		IntBuffer b = factory.directIntBuffer(10);
		
		assertNotNull(b);
		assertEquals(10, b.capacity());
	}
	
	/**
	 * This test ensures, that the function {@link JavaNioBufferFactory#directLongBuffer(int)}
	 * creates a buffer with the correct capacity.
	 */
	@Test
	void createLongBufferTest()
	{
		JavaNioBufferFactory factory = new JavaNioBufferFactory();
		
		LongBuffer b = factory.directLongBuffer(10);
		
		assertNotNull(b);
		assertEquals(10, b.capacity());
	}
	
	/**
	 * This test ensures, that the function {@link JavaNioBufferFactory#directFloatBuffer(int)}
	 * creates a buffer with the correct capacity.
	 */
	@Test
	void createFloatBufferTest()
	{
		JavaNioBufferFactory factory = new JavaNioBufferFactory();
		
		FloatBuffer b = factory.directFloatBuffer(10);
		
		assertNotNull(b);
		assertEquals(10, b.capacity());
	}
	
	/**
	 * This test ensures, that the function {@link JavaNioBufferFactory#directDoubleBuffer(int)}
	 * creates a buffer with the correct capacity.
	 */
	@Test
	void createDoubleBufferTest()
	{
		JavaNioBufferFactory factory = new JavaNioBufferFactory();
		
		DoubleBuffer b = factory.directDoubleBuffer(10);
		
		assertNotNull(b);
		assertEquals(10, b.capacity());
	}
	
	/**
	 * This test ensures, that the function {@link JavaNioBufferFactory#destroy(ByteBuffer)}
	 * does not do anything.
	 */
	@Test
	void destroyBuffer_ByteTest()
	{
		JavaNioBufferFactory factory = new JavaNioBufferFactory();
		
		ByteBuffer b = mock(ByteBuffer.class);
		
		factory.destroy(b);
		
		verifyNoInteractions(b);
	}
	
	/**
	 * This test ensures, that the function {@link JavaNioBufferFactory#destroy(ShortBuffer)}
	 * does not do anything.
	 */
	@Test
	void destroyBuffer_ShortTest()
	{
		JavaNioBufferFactory factory = new JavaNioBufferFactory();
		
		ShortBuffer b = mock(ShortBuffer.class);
		
		factory.destroy(b);
		
		verifyNoInteractions(b);
	}
	
	/**
	 * This test ensures, that the function {@link JavaNioBufferFactory#destroy(IntBuffer)}
	 * does not do anything.
	 */
	@Test
	void destroyBuffer_IntTest()
	{
		JavaNioBufferFactory factory = new JavaNioBufferFactory();
		
		IntBuffer b = mock(IntBuffer.class);
		
		factory.destroy(b);
		
		verifyNoInteractions(b);
	}
	
	/**
	 * This test ensures, that the function {@link JavaNioBufferFactory#destroy(LongBuffer)}
	 * does not do anything.
	 */
	@Test
	void destroyBuffer_LongTest()
	{
		JavaNioBufferFactory factory = new JavaNioBufferFactory();
		
		LongBuffer b = mock(LongBuffer.class);
		
		factory.destroy(b);
		
		verifyNoInteractions(b);
	}
	
	/**
	 * This test ensures, that the function {@link JavaNioBufferFactory#destroy(FloatBuffer)}
	 * does not do anything.
	 */
	@Test
	void destroyBuffer_FloatTest()
	{
		JavaNioBufferFactory factory = new JavaNioBufferFactory();
		
		FloatBuffer b = mock(FloatBuffer.class);
		
		factory.destroy(b);
		
		verifyNoInteractions(b);
	}
	
	/**
	 * This test ensures, that the function {@link JavaNioBufferFactory#destroy(DoubleBuffer)}
	 * does not do anything.
	 */
	@Test
	void destroyBuffer_DoubleTest()
	{
		JavaNioBufferFactory factory = new JavaNioBufferFactory();
		
		DoubleBuffer b = mock(DoubleBuffer.class);
		
		factory.destroy(b);
		
		verifyNoInteractions(b);
	}
}
