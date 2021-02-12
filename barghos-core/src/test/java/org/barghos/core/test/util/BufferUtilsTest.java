package org.barghos.core.test.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.util.List;

import org.barghos.core.api.tuple2.Tup2fR;

import org.barghos.core.tuple2.Tup2d;
import org.barghos.core.tuple2.Tup2f;
import org.barghos.core.tuple3.Tup3d;
import org.barghos.core.tuple3.Tup3f;
import org.barghos.core.tuple4.Tup4d;
import org.barghos.core.tuple4.Tup4f;
import org.barghos.core.util.BufferUtils;
import org.barghos.core.util.BufferUtilsPrimitives;

/**
 * This class provides componenttests for the class {@link org.barghos.core.util.BufferUtils BufferUtils}.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
class BufferUtilsTest
{
	/**
	 * This test ensures, that the class {@link BufferUtils} extends the class {@link BufferUtilsPrimitives}.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void inheritanceTest()
	{
		BufferUtils ext = new BufferUtils() {};
		
		assertTrue(ext instanceof BufferUtilsPrimitives);
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToTuple2FBuffer(Tup2fR[]) BufferUtils.copyToTuple2FBuffer(Tup2fR...)}
	 * creates a new {@link FloatBuffer}, puts the values in the right order in the buffer
	 * and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToTuple2FBuffer_ArrayTest()
	{
		FloatBuffer buffer = BufferUtils.copyToTuple2FBuffer(new Tup2f(1.1f, 2.2f), new Tup2f(3.3f, 4.4f));
		
		assertNotNull(buffer);
		assertEquals(4, buffer.capacity());
		assertEquals(4, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToTuple2FBuffer(FloatBuffer, Tup2fR[]) BufferUtils.copyToTuple2FBuffer(FloatBuffer, Tup2fR...)}
	 * puts the values in the right order in the buffer and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToTuple2FBuffer_ArrayExternalBufferTest()
	{
		FloatBuffer buffer = BufferUtils.createFloatBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToTuple2FBuffer(buffer, new Tup2f(1.1f, 2.2f), new Tup2f(3.3f, 4.4f)));
		
		assertEquals(10, buffer.capacity());
		assertEquals(4, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToTuple2FBuffer(List) BufferUtils.copyToTuple2FBuffer(List&lt;Tup2fR&gt;)}
	 * creates a new {@link FloatBuffer}, puts the values in the right order in the buffer
	 * and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToTuple2FBuffer_ListTest()
	{
		FloatBuffer buffer = BufferUtils.copyToTuple2FBuffer(List.of(new Tup2f(1.1f, 2.2f), new Tup2f(3.3f, 4.4f)));
		
		assertNotNull(buffer);
		assertEquals(4, buffer.capacity());
		assertEquals(4, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToTuple2FBuffer(FloatBuffer, List) BufferUtils.copyToTuple2FBuffer(FloatBuffer, List&lt;Tup2fR&gt;)}
	 * puts the values in the right order in the buffer and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToTuple2FBuffer_ListExternalBufferTest()
	{
		FloatBuffer buffer = BufferUtils.createFloatBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToTuple2FBuffer(buffer, List.of(new Tup2f(1.1f, 2.2f), new Tup2f(3.3f, 4.4f))));
		
		assertEquals(10, buffer.capacity());
		assertEquals(4, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToTuple2DBuffer(Tup2dR[]) BufferUtils.copyToTuple2DBuffer(Tup2dR...)}
	 * creates a new {@link DoubleBuffer}, puts the values in the right order in the buffer
	 * and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToTuple2DBuffer_ArrayTest()
	{
		DoubleBuffer buffer = BufferUtils.copyToTuple2DBuffer(new Tup2d(1.1, 2.2), new Tup2d(3.3, 4.4));
		
		assertNotNull(buffer);
		assertEquals(4, buffer.capacity());
		assertEquals(4, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1, buffer.get());
		assertEquals(2.2, buffer.get());
		assertEquals(3.3, buffer.get());
		assertEquals(4.4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToTuple2DBuffer(DoubleBuffer, Tup2dR[]) BufferUtils.copyToTuple2DBuffer(DoubleBuffer, Tup2dR...)}
	 * puts the values in the right order in the buffer and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToTuple2DBuffer_ArrayExternalBufferest()
	{
		DoubleBuffer buffer = BufferUtils.createDoubleBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToTuple2DBuffer(buffer, new Tup2d(1.1, 2.2), new Tup2d(3.3, 4.4)));
		
		assertEquals(10, buffer.capacity());
		assertEquals(4, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1, buffer.get());
		assertEquals(2.2, buffer.get());
		assertEquals(3.3, buffer.get());
		assertEquals(4.4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToTuple2DBuffer(List) BufferUtils.copyToTuple2DBuffer(List&lt;Tup2dR&gt;)}
	 * creates a new {@link DoubleBuffer}, puts the values in the right order in the buffer
	 * and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToTuple2DBuffer_ListTest()
	{
		DoubleBuffer buffer = BufferUtils.copyToTuple2DBuffer(List.of(new Tup2d(1.1, 2.2), new Tup2d(3.3, 4.4)));
		
		assertNotNull(buffer);
		assertEquals(4, buffer.capacity());
		assertEquals(4, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1, buffer.get());
		assertEquals(2.2, buffer.get());
		assertEquals(3.3, buffer.get());
		assertEquals(4.4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToTuple2DBuffer(DoubleBuffer, List) BufferUtils.copyToTuple2DBuffer(DoubleBuffer, List&lt;Tup2dR&gt;)}
	 * puts the values in the right order in the buffer and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToTuple2DBuffer_ListExternalBufferTest()
	{
		DoubleBuffer buffer = BufferUtils.createDoubleBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToTuple2DBuffer(buffer, List.of(new Tup2d(1.1, 2.2), new Tup2d(3.3, 4.4))));
		
		assertEquals(10, buffer.capacity());
		assertEquals(4, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1, buffer.get());
		assertEquals(2.2, buffer.get());
		assertEquals(3.3, buffer.get());
		assertEquals(4.4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToTuple3FBuffer(Tup3fR[]) BufferUtils.copyToTuple3FBuffer(Tup3fR...)}
	 * creates a new {@link FloatBuffer}, puts the values in the right order in the buffer
	 * and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToTuple3FBuffer_ArrayTest()
	{
		FloatBuffer buffer = BufferUtils.copyToTuple3FBuffer(new Tup3f(1.1f, 2.2f, 3.3f), new Tup3f(4.4f, 5.5f, 6.6f));
		
		assertNotNull(buffer);
		assertEquals(6, buffer.capacity());
		assertEquals(6, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
		assertEquals(5.5f, buffer.get());
		assertEquals(6.6f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToTuple3FBuffer(FloatBuffer, Tup3fR[]) BufferUtils.copyToTuple3FBuffer(FloatBuffer, Tup3fR...)}
	 * puts the values in the right order in the buffer and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToTuple3FBuffer_ArrayExternalBufferTest()
	{
		FloatBuffer buffer = BufferUtils.createFloatBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToTuple3FBuffer(buffer, new Tup3f(1.1f, 2.2f, 3.3f), new Tup3f(4.4f, 5.5f, 6.6f)));
		
		assertEquals(10, buffer.capacity());
		assertEquals(6, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
		assertEquals(5.5f, buffer.get());
		assertEquals(6.6f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToTuple3FBuffer(List) BufferUtils.copyToTuple3FBuffer(List&lt;Tup3fR&gt;)}
	 * creates a new {@link FloatBuffer}, puts the values in the right order in the buffer
	 * and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToTuple3FBuffer_ListTest()
	{
		FloatBuffer buffer = BufferUtils.copyToTuple3FBuffer(List.of(new Tup3f(1.1f, 2.2f, 3.3f), new Tup3f(4.4f, 5.5f, 6.6f)));
		
		assertNotNull(buffer);
		assertEquals(6, buffer.capacity());
		assertEquals(6, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
		assertEquals(5.5f, buffer.get());
		assertEquals(6.6f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToTuple3FBuffer(FloatBuffer, List) BufferUtils.copyToTuple3FBuffer(FloatBuffer, List&lt;Tup3fR&gt;)}
	 * creates a new {@link FloatBuffer}, puts the values in the right order in the buffer
	 * and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToTuple3FBuffer_ListExternalBufferTest()
	{
		FloatBuffer buffer = BufferUtils.createFloatBuffer(10);
				
		assertSame(buffer, BufferUtils.copyToTuple3FBuffer(buffer, List.of(new Tup3f(1.1f, 2.2f, 3.3f), new Tup3f(4.4f, 5.5f, 6.6f))));
		
		assertEquals(10, buffer.capacity());
		assertEquals(6, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
		assertEquals(5.5f, buffer.get());
		assertEquals(6.6f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToTuple3DBuffer(Tup3dR[]) BufferUtils.copyToTuple3DBuffer(Tup3dR...)}
	 * creates a new {@link DoubleBuffer}, puts the values in the right order in the buffer
	 * and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToTuple3DBuffer_ArrayTest()
	{
		DoubleBuffer buffer = BufferUtils.copyToTuple3DBuffer(new Tup3d(1.1, 2.2, 3.3), new Tup3d(4.4, 5.5, 6.6));
		
		assertNotNull(buffer);
		assertEquals(6, buffer.capacity());
		assertEquals(6, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1, buffer.get());
		assertEquals(2.2, buffer.get());
		assertEquals(3.3, buffer.get());
		assertEquals(4.4, buffer.get());
		assertEquals(5.5, buffer.get());
		assertEquals(6.6, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToTuple3DBuffer(DoubleBuffer, Tup3dR[]) BufferUtils.copyToTuple3DBuffer(DoubleBuffer, Tup3dR...)}
	 * puts the values in the right order in the buffer and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToTuple3DBuffer_ArrayExternalBufferTest()
	{
		DoubleBuffer buffer = BufferUtils.createDoubleBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToTuple3DBuffer(buffer, new Tup3d(1.1, 2.2, 3.3), new Tup3d(4.4, 5.5, 6.6)));
		
		assertEquals(10, buffer.capacity());
		assertEquals(6, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1, buffer.get());
		assertEquals(2.2, buffer.get());
		assertEquals(3.3, buffer.get());
		assertEquals(4.4, buffer.get());
		assertEquals(5.5, buffer.get());
		assertEquals(6.6, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToTuple3DBuffer(List) BufferUtils.copyToTuple3DBuffer(List&lt;Tup3dR&gt;)}
	 * creates a new {@link DoubleBuffer}, puts the values in the right order in the buffer
	 * and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToTuple3DBuffer_ListTest()
	{
		DoubleBuffer buffer = BufferUtils.copyToTuple3DBuffer(List.of(new Tup3d(1.1, 2.2, 3.3), new Tup3d(4.4, 5.5, 6.6)));
		
		assertNotNull(buffer);
		assertEquals(6, buffer.capacity());
		assertEquals(6, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1, buffer.get());
		assertEquals(2.2, buffer.get());
		assertEquals(3.3, buffer.get());
		assertEquals(4.4, buffer.get());
		assertEquals(5.5, buffer.get());
		assertEquals(6.6, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToTuple3DBuffer(DoubleBuffer, List) BufferUtils.copyToTuple3DBuffer(DoubleBuffer, List&lt;Tup3dR&gt;)}
	 * puts the values in the right order in the buffer and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToTuple3DBuffer_ListExternalBufferTest()
	{
		DoubleBuffer buffer = BufferUtils.createDoubleBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToTuple3DBuffer(buffer, List.of(new Tup3d(1.1, 2.2, 3.3), new Tup3d(4.4, 5.5, 6.6))));
		
		assertEquals(10, buffer.capacity());
		assertEquals(6, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1, buffer.get());
		assertEquals(2.2, buffer.get());
		assertEquals(3.3, buffer.get());
		assertEquals(4.4, buffer.get());
		assertEquals(5.5, buffer.get());
		assertEquals(6.6, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToTuple4FBuffer(Tup4fR[]) BufferUtils.copyToTuple4FBuffer(Tup4fR...)}
	 * creates a new {@link FloatBuffer}, puts the values in the right order in the buffer
	 * and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToTuple4FBuffer_ArrayTest()
	{
		FloatBuffer buffer = BufferUtils.copyToTuple4FBuffer(new Tup4f(1.1f, 2.2f, 3.3f, 4.4f), new Tup4f(5.5f, 6.6f, 7.7f, 8.8f));
		
		assertNotNull(buffer);
		assertEquals(8, buffer.capacity());
		assertEquals(8, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
		assertEquals(5.5f, buffer.get());
		assertEquals(6.6f, buffer.get());
		assertEquals(7.7f, buffer.get());
		assertEquals(8.8f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToTuple4FBuffer(FloatBuffer, Tup4fR[]) BufferUtils.copyToTuple4FBuffer(FloatBuffer, Tup4fR...)}
	 * puts the values in the right order in the buffer and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToTuple4FBuffer_ArrayExternalBufferTest()
	{
		FloatBuffer buffer = BufferUtils.createFloatBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToTuple4FBuffer(buffer, new Tup4f(1.1f, 2.2f, 3.3f, 4.4f), new Tup4f(5.5f, 6.6f, 7.7f, 8.8f)));

		assertEquals(10, buffer.capacity());
		assertEquals(8, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
		assertEquals(5.5f, buffer.get());
		assertEquals(6.6f, buffer.get());
		assertEquals(7.7f, buffer.get());
		assertEquals(8.8f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToTuple4FBuffer(List) BufferUtils.copyToTuple4FBuffer(List&lt;Tup4fR&gt;)}
	 * creates a new {@link FloatBuffer}, puts the values in the right order in the buffer
	 * and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToTuple4FBuffer_ListTest()
	{
		FloatBuffer buffer = BufferUtils.copyToTuple4FBuffer(List.of(new Tup4f(1.1f, 2.2f, 3.3f, 4.4f), new Tup4f(5.5f, 6.6f, 7.7f, 8.8f)));
		
		assertNotNull(buffer);
		assertEquals(8, buffer.capacity());
		assertEquals(8, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
		assertEquals(5.5f, buffer.get());
		assertEquals(6.6f, buffer.get());
		assertEquals(7.7f, buffer.get());
		assertEquals(8.8f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToTuple4FBuffer(FloatBuffer, List) BufferUtils.copyToTuple4FBuffer(FloatBuffer, List&lt;Tup4fR&gt;)}
	 * puts the values in the right order in the buffer and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToTuple4FBuffer_ListExternalBufferTest()
	{
		FloatBuffer buffer = BufferUtils.createFloatBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToTuple4FBuffer(buffer, List.of(new Tup4f(1.1f, 2.2f, 3.3f, 4.4f), new Tup4f(5.5f, 6.6f, 7.7f, 8.8f))));
		
		assertEquals(10, buffer.capacity());
		assertEquals(8, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
		assertEquals(5.5f, buffer.get());
		assertEquals(6.6f, buffer.get());
		assertEquals(7.7f, buffer.get());
		assertEquals(8.8f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToTuple4DBuffer(Tup4dR[]) BufferUtils.copyToTuple4DBuffer(Tup4dR...)}
	 * creates a new {@link DoubleBuffer}, puts the values in the right order in the buffer
	 * and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToTuple4DBuffer_ArrayTest()
	{
		DoubleBuffer buffer = BufferUtils.copyToTuple4DBuffer(new Tup4d(1.1, 2.2, 3.3, 4.4), new Tup4d(5.5, 6.6, 7.7, 8.8));
		
		assertNotNull(buffer);
		assertEquals(8, buffer.capacity());
		assertEquals(8, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1, buffer.get());
		assertEquals(2.2, buffer.get());
		assertEquals(3.3, buffer.get());
		assertEquals(4.4, buffer.get());
		assertEquals(5.5, buffer.get());
		assertEquals(6.6, buffer.get());
		assertEquals(7.7, buffer.get());
		assertEquals(8.8, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToTuple4DBuffer(DoubleBuffer, Tup4dR[]) BufferUtils.copyToTuple4DBuffer(DoubleBuffer, Tup4dR...)}
	 * puts the values in the right order in the buffer and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToTuple4DBuffer_ArrayExternalBufferTest()
	{
		DoubleBuffer buffer = BufferUtils.createDoubleBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToTuple4DBuffer(buffer, new Tup4d(1.1, 2.2, 3.3, 4.4), new Tup4d(5.5, 6.6, 7.7, 8.8)));
		
		assertEquals(10, buffer.capacity());
		assertEquals(8, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1, buffer.get());
		assertEquals(2.2, buffer.get());
		assertEquals(3.3, buffer.get());
		assertEquals(4.4, buffer.get());
		assertEquals(5.5, buffer.get());
		assertEquals(6.6, buffer.get());
		assertEquals(7.7, buffer.get());
		assertEquals(8.8, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToTuple4DBuffer(List) BufferUtils.copyToTuple4DBuffer(List&lt;Tup4dR&gt;)}
	 * creates a new {@link DoubleBuffer}, puts the values in the right order in the buffer
	 * and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToTuple4DBuffer_ListTest()
	{
		DoubleBuffer buffer = BufferUtils.copyToTuple4DBuffer(List.of(new Tup4d(1.1, 2.2, 3.3, 4.4), new Tup4d(5.5, 6.6, 7.7, 8.8)));
		
		assertNotNull(buffer);
		assertEquals(8, buffer.capacity());
		assertEquals(8, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1, buffer.get());
		assertEquals(2.2, buffer.get());
		assertEquals(3.3, buffer.get());
		assertEquals(4.4, buffer.get());
		assertEquals(5.5, buffer.get());
		assertEquals(6.6, buffer.get());
		assertEquals(7.7, buffer.get());
		assertEquals(8.8, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToTuple4FBuffer(List) BufferUtils.copyToTuple4FBuffer(List&lt;Tup4fR&gt;)}
	 * puts the values in the right order in the buffer and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToTuple4DBuffer_ListExternalBufferTest()
	{
		DoubleBuffer buffer = BufferUtils.createDoubleBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToTuple4DBuffer(buffer, List.of(new Tup4d(1.1, 2.2, 3.3, 4.4), new Tup4d(5.5, 6.6, 7.7, 8.8))));
		
		assertEquals(10, buffer.capacity());
		assertEquals(8, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1, buffer.get());
		assertEquals(2.2, buffer.get());
		assertEquals(3.3, buffer.get());
		assertEquals(4.4, buffer.get());
		assertEquals(5.5, buffer.get());
		assertEquals(6.6, buffer.get());
		assertEquals(7.7, buffer.get());
		assertEquals(8.8, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToFlippedTuple2FBuffer(Tup2fR[]) BufferUtils.copyToFlippedTuple2FBuffer(Tup2fR...)}
	 * creates a new {@link FloatBuffer}, puts the values in the right order in the buffer
	 * and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedTuple2FBuffer_ArrayTest()
	{
		FloatBuffer buffer = BufferUtils.copyToFlippedTuple2FBuffer(new Tup2f(1.1f, 2.2f), new Tup2f(3.3f, 4.4f));
		
		assertNotNull(buffer);
		assertEquals(4, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToFlippedTuple2FBuffer(FloatBuffer, Tup2fR[]) BufferUtils.copyToFlippedTuple2FBuffer(FloatBuffer, Tup2fR...)}
	 * puts the values in the right order in the buffer and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedTuple2FBuffer_ArrayExternalBufferTest()
	{
		FloatBuffer buffer = BufferUtils.createFloatBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToFlippedTuple2FBuffer(buffer, new Tup2f(1.1f, 2.2f), new Tup2f(3.3f, 4.4f)));
		
		assertEquals(10, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToFlippedTuple2FBuffer(List) BufferUtils.copyToFlippedTuple2FBuffer(List&lt;Tup2fR&gt;)}
	 * creates a new {@link FloatBuffer}, puts the values in the right order in the buffer
	 * and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedTuple2FBuffer_ListTest()
	{
		FloatBuffer buffer = BufferUtils.copyToFlippedTuple2FBuffer(List.of(new Tup2f(1.1f, 2.2f), new Tup2f(3.3f, 4.4f)));
		
		assertNotNull(buffer);
		assertEquals(4, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToFlippedTuple2FBuffer(FloatBuffer, List) BufferUtils.copyToFlippedTuple2FBuffer(FloatBuffer, List&lt;Tup2fR&gt;)}
	 * puts the values in the right order in the buffer and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedTuple2FBuffer_ListExternalBufferTest()
	{
		FloatBuffer buffer = BufferUtils.createFloatBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToFlippedTuple2FBuffer(buffer, List.of(new Tup2f(1.1f, 2.2f), new Tup2f(3.3f, 4.4f))));
		
		assertEquals(10, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToFlippedTuple2DBuffer(Tup2dR[]) BufferUtils.copyToFlippedTuple2DBuffer(Tup2dR...)}
	 * creates a new {@link DoubleBuffer}, puts the values in the right order in the buffer
	 * and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedTuple2DBuffer_ArrayTest()
	{
		DoubleBuffer buffer = BufferUtils.copyToFlippedTuple2DBuffer(new Tup2d(1.1, 2.2), new Tup2d(3.3, 4.4));
		
		assertNotNull(buffer);
		assertEquals(4, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1.1, buffer.get());
		assertEquals(2.2, buffer.get());
		assertEquals(3.3, buffer.get());
		assertEquals(4.4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToFlippedTuple2DBuffer(DoubleBuffer, Tup2dR[]) BufferUtils.copyToFlippedTuple2DBuffer(DoubleBuffer, Tup2dR...)}
	 * puts the values in the right order in the buffer and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedTuple2DBuffer_ArrayExternalBufferTest()
	{
		DoubleBuffer buffer = BufferUtils.createDoubleBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToFlippedTuple2DBuffer(buffer, new Tup2d(1.1, 2.2), new Tup2d(3.3, 4.4)));

		assertEquals(10, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1.1, buffer.get());
		assertEquals(2.2, buffer.get());
		assertEquals(3.3, buffer.get());
		assertEquals(4.4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToFlippedTuple2DBuffer(List) BufferUtils.copyToFlippedTuple2DBuffer(List&lt;Tup2dR&gt;)}
	 * creates a new {@link DoubleBuffer}, puts the values in the right order in the buffer
	 * and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedTuple2DBuffer_ListTest()
	{
		DoubleBuffer buffer = BufferUtils.copyToFlippedTuple2DBuffer(List.of(new Tup2d(1.1, 2.2), new Tup2d(3.3, 4.4)));
		
		assertNotNull(buffer);
		assertEquals(4, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1.1, buffer.get());
		assertEquals(2.2, buffer.get());
		assertEquals(3.3, buffer.get());
		assertEquals(4.4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToFlippedTuple2DBuffer(DoubleBuffer, List) BufferUtils.copyToFlippedTuple2DBuffer(DoubleBuffer, List&lt;Tup2dR&gt;)}
	 * puts the values in the right order in the buffer and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedTuple2DBuffer_ListExternalBufferTest()
	{
		DoubleBuffer buffer = BufferUtils.createDoubleBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToFlippedTuple2DBuffer(buffer, List.of(new Tup2d(1.1, 2.2), new Tup2d(3.3, 4.4))));
		
		assertEquals(10, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1.1, buffer.get());
		assertEquals(2.2, buffer.get());
		assertEquals(3.3, buffer.get());
		assertEquals(4.4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToFlippedTuple3FBuffer(Tup3fR[]) BufferUtils.copyToFlippedTuple3FBuffer(Tup3fR...)}
	 * creates a new {@link FloatBuffer}, puts the values in the right order in the buffer
	 * and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedTuple3FBuffer_ArrayTest()
	{
		FloatBuffer buffer = BufferUtils.copyToFlippedTuple3FBuffer(new Tup3f(1.1f, 2.2f, 3.3f), new Tup3f(4.4f, 5.5f, 6.6f));
		
		assertNotNull(buffer);
		assertEquals(6, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
		assertEquals(5.5f, buffer.get());
		assertEquals(6.6f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToFlippedTuple3FBuffer(FloatBuffer, Tup3fR[]) BufferUtils.copyToFlippedTuple3FBuffer(FloatBuffer, Tup3fR...)}
	 * puts the values in the right order in the buffer and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedTuple3FBuffer_ArrayExternalBufferTest()
	{
		FloatBuffer buffer = BufferUtils.createFloatBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToFlippedTuple3FBuffer(buffer, new Tup3f(1.1f, 2.2f, 3.3f), new Tup3f(4.4f, 5.5f, 6.6f)));
		
		assertEquals(10, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
		assertEquals(5.5f, buffer.get());
		assertEquals(6.6f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToFlippedTuple3FBuffer(List) BufferUtils.copyToFlippedTuple3FBuffer(List&lt;Tup3fR&gt;)}
	 * creates a new {@link FloatBuffer}, puts the values in the right order in the buffer
	 * and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedTuple3FBuffer_ListTest()
	{
		FloatBuffer buffer = BufferUtils.copyToFlippedTuple3FBuffer(List.of(new Tup3f(1.1f, 2.2f, 3.3f), new Tup3f(4.4f, 5.5f, 6.6f)));
		
		assertNotNull(buffer);
		assertEquals(6, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
		assertEquals(5.5f, buffer.get());
		assertEquals(6.6f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToFlippedTuple3FBuffer(FloatBuffer, List) BufferUtils.copyToFlippedTuple3FBuffer(FloatBuffer, List&lt;Tup3fR&gt;)}
	 * puts the values in the right order in the buffer and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedTuple3FBuffer_ListExternalBufferTest()
	{
		FloatBuffer buffer = BufferUtils.createFloatBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToFlippedTuple3FBuffer(buffer, List.of(new Tup3f(1.1f, 2.2f, 3.3f), new Tup3f(4.4f, 5.5f, 6.6f))));
		
		assertNotNull(buffer);
		assertEquals(10, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
		assertEquals(5.5f, buffer.get());
		assertEquals(6.6f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToFlippedTuple3DBuffer(Tup3dR[]) BufferUtils.copyToFlippedTuple3DBuffer(Tup3dR...)}
	 * creates a new {@link DoubleBuffer}, puts the values in the right order in the buffer
	 * and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedTuple3DBuffer_ArrayTest()
	{
		DoubleBuffer buffer = BufferUtils.copyToFlippedTuple3DBuffer(new Tup3d(1.1, 2.2, 3.3), new Tup3d(4.4, 5.5, 6.6));
		
		assertNotNull(buffer);
		assertEquals(6, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1.1, buffer.get());
		assertEquals(2.2, buffer.get());
		assertEquals(3.3, buffer.get());
		assertEquals(4.4, buffer.get());
		assertEquals(5.5, buffer.get());
		assertEquals(6.6, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToFlippedTuple3DBuffer(DoubleBuffer, Tup3dR[]) BufferUtils.copyToFlippedTuple3DBuffer(DoubleBuffer, Tup3dR...)}
	 * puts the values in the right order in the buffer and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedTuple3DBuffer_ArrayExternalBufferTest()
	{
		DoubleBuffer buffer = BufferUtils.createDoubleBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToFlippedTuple3DBuffer(buffer, new Tup3d(1.1, 2.2, 3.3), new Tup3d(4.4, 5.5, 6.6)));

		assertEquals(10, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1.1, buffer.get());
		assertEquals(2.2, buffer.get());
		assertEquals(3.3, buffer.get());
		assertEquals(4.4, buffer.get());
		assertEquals(5.5, buffer.get());
		assertEquals(6.6, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToFlippedTuple3DBuffer(List) BufferUtils.copyToFlippedTuple3DBuffer(List&lt;Tup3dR&gt;)}
	 * creates a new {@link DoubleBuffer}, puts the values in the right order in the buffer
	 * and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedTuple3DBuffer_ListTest()
	{
		DoubleBuffer buffer = BufferUtils.copyToFlippedTuple3DBuffer(List.of(new Tup3d(1.1, 2.2, 3.3), new Tup3d(4.4, 5.5, 6.6)));
		
		assertNotNull(buffer);
		assertEquals(6, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1.1, buffer.get());
		assertEquals(2.2, buffer.get());
		assertEquals(3.3, buffer.get());
		assertEquals(4.4, buffer.get());
		assertEquals(5.5, buffer.get());
		assertEquals(6.6, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToFlippedTuple3DBuffer(DoubleBuffer, List) BufferUtils.copyToFlippedTuple3DBuffer(DoubleBuffer, List&lt;Tup3dR&gt;)}
	 * puts the values in the right order in the buffer and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedTuple3DBuffer_ListExternalBufferTest()
	{
		DoubleBuffer buffer = BufferUtils.createDoubleBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToFlippedTuple3DBuffer(buffer, List.of(new Tup3d(1.1, 2.2, 3.3), new Tup3d(4.4, 5.5, 6.6))));

		assertEquals(10, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1.1, buffer.get());
		assertEquals(2.2, buffer.get());
		assertEquals(3.3, buffer.get());
		assertEquals(4.4, buffer.get());
		assertEquals(5.5, buffer.get());
		assertEquals(6.6, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToFlippedTuple4FBuffer(Tup4fR[]) BufferUtils.copyToFlippedTuple4FBuffer(Tup4fR...)}
	 * creates a new {@link FloatBuffer}, puts the values in the right order in the buffer
	 * and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedTuple4FBuffer_ArrayTest()
	{
		FloatBuffer buffer = BufferUtils.copyToFlippedTuple4FBuffer(new Tup4f(1.1f, 2.2f, 3.3f, 4.4f), new Tup4f(5.5f, 6.6f, 7.7f, 8.8f));
		
		assertNotNull(buffer);
		assertEquals(8, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
		assertEquals(5.5f, buffer.get());
		assertEquals(6.6f, buffer.get());
		assertEquals(7.7f, buffer.get());
		assertEquals(8.8f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToFlippedTuple4FBuffer(FloatBuffer, Tup4fR[]) BufferUtils.copyToFlippedTuple4FBuffer(FloatBuffer, Tup4fR...)}
	 * puts the values in the right order in the buffer and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedTuple4FBuffer_ArrayExternalBufferTest()
	{
		FloatBuffer buffer = BufferUtils.createFloatBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToFlippedTuple4FBuffer(buffer, new Tup4f(1.1f, 2.2f, 3.3f, 4.4f), new Tup4f(5.5f, 6.6f, 7.7f, 8.8f)));
		
		assertEquals(10, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
		assertEquals(5.5f, buffer.get());
		assertEquals(6.6f, buffer.get());
		assertEquals(7.7f, buffer.get());
		assertEquals(8.8f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToFlippedTuple4FBuffer(List) BufferUtils.copyToFlippedTuple4FBuffer(List&lt;Tup4fR&gt;)}
	 * creates a new {@link FloatBuffer}, puts the values in the right order in the buffer
	 * and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedTuple4FBuffer_ListTest()
	{
		FloatBuffer buffer = BufferUtils.copyToFlippedTuple4FBuffer(List.of(new Tup4f(1.1f, 2.2f, 3.3f, 4.4f), new Tup4f(5.5f, 6.6f, 7.7f, 8.8f)));
		
		assertNotNull(buffer);
		assertEquals(8, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
		assertEquals(5.5f, buffer.get());
		assertEquals(6.6f, buffer.get());
		assertEquals(7.7f, buffer.get());
		assertEquals(8.8f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToFlippedTuple4FBuffer(FloatBuffer,List) BufferUtils.copyToFlippedTuple4FBuffer(FloatBuffer, List&lt;Tup4fR&gt;)}
	 * puts the values in the right order in the buffer and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedTuple4FBuffer_ListExternalBufferTest()
	{
		FloatBuffer buffer = BufferUtils.createFloatBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToFlippedTuple4FBuffer(buffer, List.of(new Tup4f(1.1f, 2.2f, 3.3f, 4.4f), new Tup4f(5.5f, 6.6f, 7.7f, 8.8f))));
		
		assertEquals(10, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
		assertEquals(5.5f, buffer.get());
		assertEquals(6.6f, buffer.get());
		assertEquals(7.7f, buffer.get());
		assertEquals(8.8f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToFlippedTuple4DBuffer(Tup4dR[]) BufferUtils.copyToFlippedTuple4DBuffer(Tup4dR...)}
	 * creates a new {@link DoubleBuffer}, puts the values in the right order in the buffer
	 * and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedTuple4DBuffer_ArrayTest()
	{
		DoubleBuffer buffer = BufferUtils.copyToFlippedTuple4DBuffer(new Tup4d(1.1, 2.2, 3.3, 4.4), new Tup4d(5.5, 6.6, 7.7, 8.8));
		
		assertNotNull(buffer);
		assertEquals(8, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1.1, buffer.get());
		assertEquals(2.2, buffer.get());
		assertEquals(3.3, buffer.get());
		assertEquals(4.4, buffer.get());
		assertEquals(5.5, buffer.get());
		assertEquals(6.6, buffer.get());
		assertEquals(7.7, buffer.get());
		assertEquals(8.8, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToFlippedTuple4DBuffer(DoubleBuffer, Tup4dR[]) BufferUtils.copyToFlippedTuple4DBuffer(DoubleBuffer, Tup4dR...)}
	 * puts the values in the right order in the buffer and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedTuple4DBuffer_ArrayExternalBufferTest()
	{
		DoubleBuffer buffer = BufferUtils.createDoubleBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToFlippedTuple4DBuffer(buffer, new Tup4d(1.1, 2.2, 3.3, 4.4), new Tup4d(5.5, 6.6, 7.7, 8.8)));
		
		assertEquals(10, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1.1, buffer.get());
		assertEquals(2.2, buffer.get());
		assertEquals(3.3, buffer.get());
		assertEquals(4.4, buffer.get());
		assertEquals(5.5, buffer.get());
		assertEquals(6.6, buffer.get());
		assertEquals(7.7, buffer.get());
		assertEquals(8.8, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToFlippedTuple4DBuffer(List) BufferUtils.copyToFlippedTuple4FBuffer(List&lt;Tup4dR&gt;)}
	 * creates a new {@link DoubleBuffer}, puts the values in the right order in the buffer
	 * and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedTuple4DBuffer_ListTest()
	{
		DoubleBuffer buffer = BufferUtils.copyToFlippedTuple4DBuffer(List.of(new Tup4d(1.1, 2.2, 3.3, 4.4), new Tup4d(5.5, 6.6, 7.7, 8.8)));
		
		assertNotNull(buffer);
		assertEquals(8, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1.1, buffer.get());
		assertEquals(2.2, buffer.get());
		assertEquals(3.3, buffer.get());
		assertEquals(4.4, buffer.get());
		assertEquals(5.5, buffer.get());
		assertEquals(6.6, buffer.get());
		assertEquals(7.7, buffer.get());
		assertEquals(8.8, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#copyToFlippedTuple4DBuffer(DoubleBuffer, List) BufferUtils.copyToFlippedTuple4FBuffer(DoubleBuffer, List&lt;Tup4dR&gt;)}
	 * puts the values in the right order in the buffer and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedTuple4DBuffer_ListExternalBufferTest()
	{
		DoubleBuffer buffer = BufferUtils.createDoubleBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToFlippedTuple4DBuffer(buffer, List.of(new Tup4d(1.1, 2.2, 3.3, 4.4), new Tup4d(5.5, 6.6, 7.7, 8.8))));
		
		assertEquals(10, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1.1, buffer.get());
		assertEquals(2.2, buffer.get());
		assertEquals(3.3, buffer.get());
		assertEquals(4.4, buffer.get());
		assertEquals(5.5, buffer.get());
		assertEquals(6.6, buffer.get());
		assertEquals(7.7, buffer.get());
		assertEquals(8.8, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#put(FloatBuffer, Tup2fR) BufferUtils.put(FloatBuffer, Tup2fR)}
	 * puts the values in the right order in the buffer.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void put_Tuple2FTest()
	{
		FloatBuffer buffer = BufferUtils.createFloatBuffer(10);
		
		assertSame(buffer, BufferUtils.put(buffer, new Tup2f(1.1f, 2.2f)));
		
		assertEquals(10, buffer.capacity());
		assertEquals(2, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#put(FloatBuffer, Tup2fR[]) BufferUtils.put(FloatBuffer, Tup2fR...)}
	 * puts the values in the right order in the buffer.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void put_Tuple2FArrayTest()
	{
		FloatBuffer buffer = BufferUtils.createFloatBuffer(10);
		
		assertSame(buffer, BufferUtils.put(buffer, new Tup2f(1.1f, 2.2f), new Tup2f(3.3f, 4.4f)));
		
		assertEquals(10, buffer.capacity());
		assertEquals(4, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#put(FloatBuffer, Tup3fR) BufferUtils.put(FloatBuffer, Tup3fR)}
	 * puts the values in the right order in the buffer.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void put_Tuple3FTest()
	{
		FloatBuffer buffer = BufferUtils.createFloatBuffer(10);
		
		assertSame(buffer, BufferUtils.put(buffer, new Tup3f(1.1f, 2.2f, 3.3f)));
		
		assertEquals(10, buffer.capacity());
		assertEquals(3, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#put(FloatBuffer, Tup3fR[]) BufferUtils.put(FloatBuffer, Tup3fR...)}
	 * puts the values in the right order in the buffer.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void put_Tuple3FArrayTest()
	{
		FloatBuffer buffer = BufferUtils.createFloatBuffer(10);
		
		assertSame(buffer, BufferUtils.put(buffer, new Tup3f(1.1f, 2.2f, 3.3f), new Tup3f(4.4f, 5.5f, 6.6f)));
		
		assertEquals(10, buffer.capacity());
		assertEquals(6, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
		assertEquals(5.5f, buffer.get());
		assertEquals(6.6f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#put(FloatBuffer, Tup4fR) BufferUtils.put(FloatBuffer, Tup4fR)}
	 * puts the values in the right order in the buffer.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void put_Tuple4FTest()
	{
		FloatBuffer buffer = BufferUtils.createFloatBuffer(10);
		
		assertSame(buffer, BufferUtils.put(buffer, new Tup4f(1.1f, 2.2f, 3.3f, 4.4f)));
		
		assertEquals(10, buffer.capacity());
		assertEquals(4, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.BufferUtils#put(FloatBuffer, Tup4fR[]) BufferUtils.put(FloatBuffer, Tup4fR...)}
	 * puts the values in the right order in the buffer.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void put_Tuple4FArrayTest()
	{
		FloatBuffer buffer = BufferUtils.createFloatBuffer(10);
		
		assertSame(buffer, BufferUtils.put(buffer, new Tup4f(1.1f, 2.2f, 3.3f, 4.4f), new Tup4f(5.5f, 6.6f, 7.7f, 8.8f)));
		
		assertEquals(10, buffer.capacity());
		assertEquals(8, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
		assertEquals(5.5f, buffer.get());
		assertEquals(6.6f, buffer.get());
		assertEquals(7.7f, buffer.get());
		assertEquals(8.8f, buffer.get());
	}
}