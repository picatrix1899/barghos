/*******************************************************************************
 * Copyright (C) 2021 picatrix1899 (Florian Zilkenat)
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/

package org.barghos.core.test.api.util;

import static org.junit.jupiter.api.Assertions.*;

import org.barghos.core.api.util.BufferUtils;
import org.junit.jupiter.api.Test;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.List;

/**
 * This class provides component tests for the class {@link org.barghos.core.api.util.BufferUtilsPrimitives BufferUtilsPrimitives}.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
class BufferUtilsPrimitivesTest
{
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#createByteBuffer(int) BufferUtilsPrimitives.createByteBuffer(int)}
	 * correctly creates a {@link ByteBuffer} with the spezified capacity of values.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void createByteBufferTest()
	{
		ByteBuffer buffer = BufferUtils.createByteBuffer(14);
		
		assertNotNull(buffer);
		assertEquals(14, buffer.capacity());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#createShortBuffer(int) BufferUtilsPrimitives.createShortBuffer(int)}
	 * correctly creates a {@link ShortBuffer} with the spezified capacity of values.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void createShortBufferTest()
	{
		ShortBuffer buffer = BufferUtils.createShortBuffer(14);
		
		assertNotNull(buffer);
		assertEquals(14, buffer.capacity());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#createIntBuffer(int) BufferUtilsPrimitives.createIntBuffer(int)}
	 * correctly creates a {@link IntBuffer} with the spezified capacity of values.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void createIntBufferTest()
	{
		IntBuffer buffer = BufferUtils.createIntBuffer(14);
		
		assertNotNull(buffer);
		assertEquals(14, buffer.capacity());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#createLongBuffer(int) BufferUtilsPrimitives.createLongBuffer(int)}
	 * correctly creates a {@link LongBuffer} with the spezified capacity of values.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void createLongBufferTest()
	{
		LongBuffer buffer = BufferUtils.createLongBuffer(14);
		
		assertNotNull(buffer);
		assertEquals(14, buffer.capacity());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#createFloatBuffer(int) BufferUtilsPrimitives.createFloatBuffer(int)}
	 * correctly creates a {@link FloatBuffer} with the spezified capacity of values.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void createFloatBufferTest()
	{
		FloatBuffer buffer = BufferUtils.createFloatBuffer(14);
		
		assertNotNull(buffer);
		assertEquals(14, buffer.capacity());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#createDoubleBuffer(int) BufferUtilsPrimitives.createDoubleBuffer(int)}
	 * correctly creates a {@link DoubleBuffer} with the spezified capacity of values.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void createDoubleBufferTest()
	{
		DoubleBuffer buffer = BufferUtils.createDoubleBuffer(14);
		
		assertNotNull(buffer);
		assertEquals(14, buffer.capacity());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToByteBuffer(byte[]) BufferUtilsPrimitives.copyToByteBuffer(byte...)}
	 * creates a new {@link ByteBuffer}, puts the values in the right order in the buffer
	 * and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToByteBuffer_ArrayTest()
	{
		ByteBuffer buffer = BufferUtils.copyToByteBuffer((byte)1, (byte)2, (byte)3, (byte)4);
		
		assertNotNull(buffer);
		assertEquals(4, buffer.capacity());
		assertEquals(4, buffer.position());
		
		buffer.flip();
		
		assertEquals((byte)1, buffer.get());
		assertEquals((byte)2, buffer.get());
		assertEquals((byte)3, buffer.get());
		assertEquals((byte)4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToByteBuffer(ByteBuffer, byte[]) BufferUtilsPrimitives.copyToByteBuffer(ByteBuffer, byte...)}
	 * puts the values in the right order in the buffer and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToByteBuffer_ArrayExternalBufferTest()
	{
		ByteBuffer buffer = BufferUtils.createByteBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToByteBuffer(buffer, (byte)1, (byte)2, (byte)3, (byte)4));
		
		assertEquals(10, buffer.capacity());
		assertEquals(4, buffer.position());
		
		buffer.flip();
		
		assertEquals((byte)1, buffer.get());
		assertEquals((byte)2, buffer.get());
		assertEquals((byte)3, buffer.get());
		assertEquals((byte)4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToByteBuffer(List) BufferUtilsPrimitives.copyToByteBuffer(List&lt;Byte&gt;)}
	 * creates a new {@link ByteBuffer}, puts the values in the right order in the buffer
	 * and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToByteBuffer_ListTest()
	{
		ByteBuffer buffer = BufferUtils.copyToByteBuffer(List.of((byte)1, (byte)2, (byte)3, (byte)4));
		
		assertNotNull(buffer);
		assertEquals(4, buffer.capacity());
		assertEquals(4, buffer.position());
		
		buffer.flip();
		
		assertEquals((byte)1, buffer.get());
		assertEquals((byte)2, buffer.get());
		assertEquals((byte)3, buffer.get());
		assertEquals((byte)4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToByteBuffer(ByteBuffer, List) BufferUtilsPrimitives.copyToByteBuffer(ByteBuffer, List&lt;Byte&gt;)}
	 * puts the values in the right order in the buffer and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToByteBuffer_ListExternalBufferTest()
	{
		ByteBuffer buffer = BufferUtils.createByteBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToByteBuffer(buffer, List.of((byte)1, (byte)2, (byte)3, (byte)4)));
		
		assertEquals(10, buffer.capacity());
		assertEquals(4, buffer.position());
		
		buffer.flip();
		
		assertEquals((byte)1, buffer.get());
		assertEquals((byte)2, buffer.get());
		assertEquals((byte)3, buffer.get());
		assertEquals((byte)4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToShortBuffer(short[]) BufferUtilsPrimitives.copyToShortBuffer(short...)}
	 * creates a new {@link ShortBuffer}, puts the values in the right order in the buffer
	 * and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToShortBuffer_ArrayTest()
	{
		ShortBuffer buffer = BufferUtils.copyToShortBuffer((short)1, (short)2, (short)3, (short)4);
		
		assertNotNull(buffer);
		assertEquals(4, buffer.capacity());
		assertEquals(4, buffer.position());
		
		buffer.flip();
		
		assertEquals((short)1, buffer.get());
		assertEquals((short)2, buffer.get());
		assertEquals((short)3, buffer.get());
		assertEquals((short)4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToShortBuffer(ShortBuffer, short[]) BufferUtilsPrimitives.copyToShortBuffer(ShortBuffer, short...)}
	 * puts the values in the right order in the buffer and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToShortBuffer_ArrayExternalBufferTest()
	{
		ShortBuffer buffer = BufferUtils.createShortBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToShortBuffer(buffer, (short)1, (short)2, (short)3, (short)4));
		
		assertEquals(10, buffer.capacity());
		assertEquals(4, buffer.position());
		
		buffer.flip();
		
		assertEquals((short)1, buffer.get());
		assertEquals((short)2, buffer.get());
		assertEquals((short)3, buffer.get());
		assertEquals((short)4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToShortBuffer(List) BufferUtilsPrimitives.copyToShortBuffer(List&lt;Short&gt;)}
	 * creates a new {@link ShortBuffer}, puts the values in the right order in the buffer
	 * and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToShortBuffer_ListTest()
	{
		ShortBuffer buffer = BufferUtils.copyToShortBuffer(List.of((short)1, (short)2, (short)3, (short)4));
		
		assertNotNull(buffer);
		assertEquals(4, buffer.capacity());
		assertEquals(4, buffer.position());
		
		buffer.flip();
		
		assertEquals((short)1, buffer.get());
		assertEquals((short)2, buffer.get());
		assertEquals((short)3, buffer.get());
		assertEquals((short)4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToShortBuffer(ShortBuffer, List) BufferUtilsPrimitives.copyToShortBuffer(ShortBuffer, List&lt;Short&gt;)}
	 * puts the values in the right order in the buffer and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToShortBuffer_ListExternalBufferTest()
	{
		ShortBuffer buffer = BufferUtils.createShortBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToShortBuffer(buffer, List.of((short)1, (short)2, (short)3, (short)4)));
		
		assertEquals(10, buffer.capacity());
		assertEquals(4, buffer.position());
		
		buffer.flip();
		
		assertEquals((short)1, buffer.get());
		assertEquals((short)2, buffer.get());
		assertEquals((short)3, buffer.get());
		assertEquals((short)4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToIntBuffer(int[]) BufferUtilsPrimitives.copyToIntBuffer(int...)}
	 * creates a new {@link IntBuffer}, puts the values in the right order in the buffer
	 * and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToIntBuffer_ArrayTest()
	{
		IntBuffer buffer = BufferUtils.copyToIntBuffer(1, 2, 3, 4);
		
		assertNotNull(buffer);
		assertEquals(4, buffer.capacity());
		assertEquals(4, buffer.position());
		
		buffer.flip();
		
		assertEquals(1, buffer.get());
		assertEquals(2, buffer.get());
		assertEquals(3, buffer.get());
		assertEquals(4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToIntBuffer(IntBuffer, int[]) BufferUtilsPrimitives.copyToIntBuffer(IntBuffer, int...)}
	 * puts the values in the right order in the buffer and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToIntBuffer_ArrayExternalBufferTest()
	{
		IntBuffer buffer = BufferUtils.createIntBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToIntBuffer(buffer, 1, 2, 3, 4));
		
		assertEquals(10, buffer.capacity());
		assertEquals(4, buffer.position());
		
		buffer.flip();
		
		assertEquals(1, buffer.get());
		assertEquals(2, buffer.get());
		assertEquals(3, buffer.get());
		assertEquals(4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToIntBuffer(List) BufferUtilsPrimitives.copyToIntBuffer(List&lt;Integer&gt;)}
	 * creates a new {@link IntBuffer}, puts the values in the right order in the buffer
	 * and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToIntBuffer_ListTest()
	{
		IntBuffer buffer = BufferUtils.copyToIntBuffer(List.of(1, 2, 3, 4));
		
		assertNotNull(buffer);
		assertEquals(4, buffer.capacity());
		assertEquals(4, buffer.position());
		
		buffer.flip();
		
		assertEquals(1, buffer.get());
		assertEquals(2, buffer.get());
		assertEquals(3, buffer.get());
		assertEquals(4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToIntBuffer(IntBuffer, List) BufferUtilsPrimitives.copyToIntBuffer(IntBuffer, List&lt;Integer&gt;)}
	 * puts the values in the right order in the buffer and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToIntBuffer_ListExternalBufferTest()
	{
		IntBuffer buffer = BufferUtils.createIntBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToIntBuffer(buffer, List.of(1, 2, 3, 4)));
		
		assertEquals(10, buffer.capacity());
		assertEquals(4, buffer.position());
		
		buffer.flip();
		
		assertEquals(1, buffer.get());
		assertEquals(2, buffer.get());
		assertEquals(3, buffer.get());
		assertEquals(4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToLongBuffer(long[]) BufferUtilsPrimitives.copyToLongBuffer(long...)}
	 * creates a new {@link LongBuffer}, puts the values in the right order in the buffer
	 * and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToLongBuffer_ArrayTest()
	{
		LongBuffer buffer = BufferUtils.copyToLongBuffer(1l, 2l, 3l, 4l);
		
		assertNotNull(buffer);
		assertEquals(4, buffer.capacity());
		assertEquals(4, buffer.position());
		
		buffer.flip();
		
		assertEquals(1l, buffer.get());
		assertEquals(2l, buffer.get());
		assertEquals(3l, buffer.get());
		assertEquals(4l, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToLongBuffer(LongBuffer, long[]) BufferUtilsPrimitives.copyToLongBuffer(LongBuffer, long...)}
	 * puts the values in the right order in the buffer and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToLongBuffer_ArrayExternalBufferTest()
	{
		LongBuffer buffer = BufferUtils.createLongBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToLongBuffer(buffer, 1l, 2l, 3l, 4l));
		
		assertEquals(10, buffer.capacity());
		assertEquals(4, buffer.position());
		
		buffer.flip();
		
		assertEquals(1l, buffer.get());
		assertEquals(2l, buffer.get());
		assertEquals(3l, buffer.get());
		assertEquals(4l, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToLongBuffer(List) BufferUtilsPrimitives.copyToLongBuffer(List&lt;Long&gt;)}
	 * creates a new {@link LongBuffer}, puts the values in the right order in the buffer
	 * and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToLongBuffer_ListTest()
	{
		LongBuffer buffer = BufferUtils.copyToLongBuffer(List.of(1l, 2l, 3l, 4l));
		
		assertNotNull(buffer);
		assertEquals(4, buffer.capacity());
		assertEquals(4, buffer.position());
		
		buffer.flip();
		
		assertEquals(1l, buffer.get());
		assertEquals(2l, buffer.get());
		assertEquals(3l, buffer.get());
		assertEquals(4l, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToLongBuffer(LongBuffer, List) BufferUtilsPrimitives.copyToLongBuffer(LongBuffer, List&lt;Long&gt;)}
	 * puts the values in the right order in the buffer and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToLongBuffer_ListExternalBufferTest()
	{
		LongBuffer buffer = BufferUtils.createLongBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToLongBuffer(buffer, List.of(1l, 2l, 3l, 4l)));
		
		assertEquals(10, buffer.capacity());
		assertEquals(4, buffer.position());
		
		buffer.flip();
		
		assertEquals(1l, buffer.get());
		assertEquals(2l, buffer.get());
		assertEquals(3l, buffer.get());
		assertEquals(4l, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToFloatBuffer(float[]) BufferUtilsPrimitives.copyToFloatBuffer(float...)}
	 * creates a new {@link FloatBuffer}, puts the values in the right order in the buffer
	 * and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFloatBuffer_ArrayTest()
	{
		FloatBuffer buffer = BufferUtils.copyToFloatBuffer(1.1f, 2.2f, 3.3f, 4.4f);
		
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
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToFloatBuffer(FloatBuffer, float[]) BufferUtilsPrimitives.copyToFloatBuffer(FloatBuffer, float...)}
	 * puts the values in the right order in the buffer and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFloatBuffer_ArrayExternalBufferTest()
	{
		FloatBuffer buffer = BufferUtils.createFloatBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToFloatBuffer(buffer, 1.1f, 2.2f, 3.3f, 4.4f));
		
		assertEquals(10, buffer.capacity());
		assertEquals(4, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToFloatBuffer(List) BufferUtilsPrimitives.copyToFloatBuffer(List&lt;Float&gt;)}
	 * creates a new {@link FloatBuffer}, puts the values in the right order in the buffer
	 * and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFloatBuffer_ListTest()
	{
		FloatBuffer buffer = BufferUtils.copyToFloatBuffer(List.of(1.1f, 2.2f, 3.3f, 4.4f));
		
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
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToFloatBuffer(FloatBuffer, List) BufferUtilsPrimitives.copyToFloatBuffer(FloatBuffer, List&lt;Float&gt;)}
	 * puts the values in the right order in the buffer and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFloatBuffer_ListExternalBufferTest()
	{
		FloatBuffer buffer = BufferUtils.createFloatBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToFloatBuffer(buffer, List.of(1.1f, 2.2f, 3.3f, 4.4f)));
		
		assertEquals(10, buffer.capacity());
		assertEquals(4, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToDoubleBuffer(double[]) BufferUtilsPrimitives.copyToDoubleBuffer(double...)}
	 * creates a new {@link DoubleBuffer}, puts the values in the right order in the buffer
	 * and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToDoubleBuffer_ArrayTest()
	{
		DoubleBuffer buffer = BufferUtils.copyToDoubleBuffer(1.1, 2.2, 3.3, 4.4);
		
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
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToDoubleBuffer(DoubleBuffer, double[]) BufferUtilsPrimitives.copyToDoubleBuffer(DoubleBuffer, double...)}
	 * puts the values in the right order in the buffer and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToDoubleBuffer_ArrayExternalBufferTest()
	{
		DoubleBuffer buffer = BufferUtils.createDoubleBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToDoubleBuffer(buffer, 1.1, 2.2, 3.3, 4.4));
		
		assertEquals(10, buffer.capacity());
		assertEquals(4, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1, buffer.get());
		assertEquals(2.2, buffer.get());
		assertEquals(3.3, buffer.get());
		assertEquals(4.4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToDoubleBuffer(List) BufferUtilsPrimitives.copyToDoubleBuffer(List&lt;Double&gt;)}
	 * creates a new {@link DoubleBuffer}, puts the values in the right order in the buffer
	 * and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToDoubleBuffer_ListTest()
	{
		DoubleBuffer buffer = BufferUtils.copyToDoubleBuffer(List.of(1.1, 2.2, 3.3, 4.4));
		
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
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToDoubleBuffer(DoubleBuffer, List) BufferUtilsPrimitives.copyToDoubleBuffer(DoubleBuffer, List&lt;Double&gt;)}
	 * puts the values in the right order in the buffer and advances the position.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToDoubleBuffer_ListExternalBufferTest()
	{
		DoubleBuffer buffer = BufferUtils.createDoubleBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToDoubleBuffer(buffer, List.of(1.1, 2.2, 3.3, 4.4)));
		
		assertEquals(10, buffer.capacity());
		assertEquals(4, buffer.position());
		
		buffer.flip();
		
		assertEquals(1.1, buffer.get());
		assertEquals(2.2, buffer.get());
		assertEquals(3.3, buffer.get());
		assertEquals(4.4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToFlippedByteBuffer(byte[]) BufferUtilsPrimitives.copyToFlippedByteBuffer(byte...)}
	 * creates a new {@link ByteBuffer}, puts the values in the right order in the buffer
	 * and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedByteBuffer_ArrayTest()
	{
		ByteBuffer buffer = BufferUtils.copyToFlippedByteBuffer((byte)1, (byte)2, (byte)3, (byte)4);
		
		assertNotNull(buffer);
		assertEquals(4, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals((byte)1, buffer.get());
		assertEquals((byte)2, buffer.get());
		assertEquals((byte)3, buffer.get());
		assertEquals((byte)4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToFlippedByteBuffer(ByteBuffer, byte[]) BufferUtilsPrimitives.copyToFlippedByteBuffer(ByteBuffer, byte...)}
	 * puts the values in the right order in the buffer and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedByteBuffer_ArrayExternalBufferTest()
	{
		ByteBuffer buffer = BufferUtils.createByteBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToFlippedByteBuffer(buffer, (byte)1, (byte)2, (byte)3, (byte)4));
		
		assertEquals(10, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals((byte)1, buffer.get());
		assertEquals((byte)2, buffer.get());
		assertEquals((byte)3, buffer.get());
		assertEquals((byte)4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToFlippedByteBuffer(List) BufferUtilsPrimitives.copyToFlippedByteBuffer(List&lt;Byte&gt;)}
	 * creates a new {@link ByteBuffer}, puts the values in the right order in the buffer
	 * and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedByteBuffer_ListTest()
	{
		ByteBuffer buffer = BufferUtils.copyToFlippedByteBuffer(List.of((byte)1, (byte)2, (byte)3, (byte)4));
		
		assertNotNull(buffer);
		assertEquals(4, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals((byte)1, buffer.get());
		assertEquals((byte)2, buffer.get());
		assertEquals((byte)3, buffer.get());
		assertEquals((byte)4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToFlippedByteBuffer(ByteBuffer, List) BufferUtilsPrimitives.copyToFlippedByteBuffer(ByteBuffer, List&lt;Byte&gt;)}
	 * puts the values in the right order in the buffer and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedByteBuffer_ListExternalBufferTest()
	{
		ByteBuffer buffer = BufferUtils.createByteBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToFlippedByteBuffer(buffer, List.of((byte)1, (byte)2, (byte)3, (byte)4)));
		
		assertEquals(10, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals((byte)1, buffer.get());
		assertEquals((byte)2, buffer.get());
		assertEquals((byte)3, buffer.get());
		assertEquals((byte)4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToFlippedShortBuffer(short[]) BufferUtilsPrimitives.copyToFlippedShortBuffer(short...)}
	 * creates a new {@link ShortBuffer}, puts the values in the right order in the buffer
	 * and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedShortBuffer_ArrayTest()
	{
		ShortBuffer buffer = BufferUtils.copyToFlippedShortBuffer((short)1, (short)2, (short)3, (short)4);
		
		assertNotNull(buffer);
		assertEquals(4, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals((short)1, buffer.get());
		assertEquals((short)2, buffer.get());
		assertEquals((short)3, buffer.get());
		assertEquals((short)4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToFlippedShortBuffer(ShortBuffer, short[]) BufferUtilsPrimitives.copyToFlippedShortBuffer(ShortBuffer, short...)}
	 * puts the values in the right order in the buffer and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedShortBuffer_ArrayExternalBufferTest()
	{
		ShortBuffer buffer = BufferUtils.createShortBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToFlippedShortBuffer(buffer, (short)1, (short)2, (short)3, (short)4));
		
		assertEquals(10, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals((short)1, buffer.get());
		assertEquals((short)2, buffer.get());
		assertEquals((short)3, buffer.get());
		assertEquals((short)4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToFlippedShortBuffer(List) BufferUtilsPrimitives.copyToFlippedShortBuffer(List&lt;Short&gt;)}
	 * creates a new {@link ShortBuffer}, puts the values in the right order in the buffer
	 * and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedShortBuffer_ListTest()
	{
		ShortBuffer buffer = BufferUtils.copyToFlippedShortBuffer(List.of((short)1, (short)2, (short)3, (short)4));
		
		assertNotNull(buffer);
		assertEquals(4, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals((short)1, buffer.get());
		assertEquals((short)2, buffer.get());
		assertEquals((short)3, buffer.get());
		assertEquals((short)4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToFlippedShortBuffer(ShortBuffer, List) BufferUtilsPrimitives.copyToFlippedShortBuffer(ShortBuffer, List&lt;Short&gt;)}
	 * puts the values in the right order in the buffer and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedShortBuffer_ListExternalBufferTest()
	{
		ShortBuffer buffer = BufferUtils.createShortBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToFlippedShortBuffer(buffer, List.of((short)1, (short)2, (short)3, (short)4)));
		
		assertEquals(10, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals((short)1, buffer.get());
		assertEquals((short)2, buffer.get());
		assertEquals((short)3, buffer.get());
		assertEquals((short)4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToFlippedIntBuffer(int[]) BufferUtilsPrimitives.copyToFlippedIntBuffer(int...)}
	 * creates a new {@link IntBuffer}, puts the values in the right order in the buffer
	 * and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedIntBuffer_ArrayTest()
	{
		IntBuffer buffer = BufferUtils.copyToFlippedIntBuffer(1, 2, 3, 4);
		
		assertNotNull(buffer);
		assertEquals(4, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1, buffer.get());
		assertEquals(2, buffer.get());
		assertEquals(3, buffer.get());
		assertEquals(4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToFlippedIntBuffer(IntBuffer, int[]) BufferUtilsPrimitives.copyToFlippedIntBuffer(IntBuffer, int...)}
	 * puts the values in the right order in the buffer and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedIntBuffer_ArrayExternalBufferTest()
	{
		IntBuffer buffer = BufferUtils.createIntBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToFlippedIntBuffer(buffer, 1, 2, 3, 4));
		
		assertEquals(10, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1, buffer.get());
		assertEquals(2, buffer.get());
		assertEquals(3, buffer.get());
		assertEquals(4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToFlippedIntBuffer(List) BufferUtilsPrimitives.copyToFlippedIntBuffer(List&lt;Integer&gt;)}
	 * creates a new {@link IntBuffer}, puts the values in the right order in the buffer
	 * and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedIntBuffer_ListTest()
	{
		IntBuffer buffer = BufferUtils.copyToFlippedIntBuffer(List.of(1, 2, 3, 4));
		
		assertNotNull(buffer);
		assertEquals(4, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1, buffer.get());
		assertEquals(2, buffer.get());
		assertEquals(3, buffer.get());
		assertEquals(4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToFlippedIntBuffer(IntBuffer, List) BufferUtilsPrimitives.copyToFlippedIntBuffer(IntBuffer, List&lt;Integer&gt;)}
	 * puts the values in the right order in the bufferand resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedIntBuffer_ListExternalBufferTest()
	{
		IntBuffer buffer = BufferUtils.createIntBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToFlippedIntBuffer(buffer, List.of(1, 2, 3, 4)));
		
		assertEquals(10, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1, buffer.get());
		assertEquals(2, buffer.get());
		assertEquals(3, buffer.get());
		assertEquals(4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToFlippedLongBuffer(long[]) BufferUtilsPrimitives.copyToFlippedLongBuffer(long...)}
	 * creates a new {@link LongBuffer}, puts the values in the right order in the buffer
	 * and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedLongBuffer_ArrayTest()
	{
		LongBuffer buffer = BufferUtils.copyToFlippedLongBuffer(1l, 2l, 3l, 4l);
		
		assertNotNull(buffer);
		assertEquals(4, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1l, buffer.get());
		assertEquals(2l, buffer.get());
		assertEquals(3l, buffer.get());
		assertEquals(4l, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToFlippedLongBuffer(LongBuffer, long[]) BufferUtilsPrimitives.copyToFlippedLongBuffer(LongBuffer, long...)}
	 * puts the values in the right order in the buffer and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedLongBuffer_ArrayExternalBufferTest()
	{
		LongBuffer buffer = BufferUtils.createLongBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToFlippedLongBuffer(buffer, 1l, 2l, 3l, 4l));
		
		assertEquals(10, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1l, buffer.get());
		assertEquals(2l, buffer.get());
		assertEquals(3l, buffer.get());
		assertEquals(4l, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToFlippedLongBuffer(List) BufferUtilsPrimitives.copyToFlippedLongBuffer(List&lt;Long&gt;)}
	 * creates a new {@link LongBuffer}, puts the values in the right order in the buffer
	 * and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedLongBuffer_ListTest()
	{
		LongBuffer buffer = BufferUtils.copyToFlippedLongBuffer(List.of(1l, 2l, 3l, 4l));
		
		assertNotNull(buffer);
		assertEquals(4, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1l, buffer.get());
		assertEquals(2l, buffer.get());
		assertEquals(3l, buffer.get());
		assertEquals(4l, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToFlippedLongBuffer(LongBuffer, List) BufferUtilsPrimitives.copyToFlippedLongBuffer(LongBuffer, List&lt;Long&gt;)}
	 * puts the values in the right order in the buffer and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedLongBuffer_ListExternalBufferTest()
	{
		LongBuffer buffer = BufferUtils.createLongBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToFlippedLongBuffer(buffer, List.of(1l, 2l, 3l, 4l)));
		
		assertEquals(10, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1l, buffer.get());
		assertEquals(2l, buffer.get());
		assertEquals(3l, buffer.get());
		assertEquals(4l, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToFlippedFloatBuffer(float[]) BufferUtilsPrimitives.copyToFlippedFloatBuffer(float...)}
	 * creates a new {@link FloatBuffer}, puts the values in the right order in the buffer
	 * and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedFloatBuffer_ArrayTest()
	{
		FloatBuffer buffer = BufferUtils.copyToFlippedFloatBuffer(1.1f, 2.2f, 3.3f, 4.4f);
		
		assertNotNull(buffer);
		assertEquals(4, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToFlippedFloatBuffer(FloatBuffer, float[]) BufferUtilsPrimitives.copyToFlippedFloatBuffer(FloatBuffer, float...)}
	 * puts the values in the right order in the buffern and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedFloatBuffer_ArrayExternalBufferTest()
	{
		FloatBuffer buffer = BufferUtils.createFloatBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToFlippedFloatBuffer(buffer, 1.1f, 2.2f, 3.3f, 4.4f));
		
		assertEquals(10, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToFlippedFloatBuffer(List) BufferUtilsPrimitives.copyToFlippedFloatBuffer(List&lt;Float&gt;)}
	 * creates a new {@link FloatBuffer}, puts the values in the right order in the buffer
	 * and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedFloatBuffer_ListTest()
	{
		FloatBuffer buffer = BufferUtils.copyToFlippedFloatBuffer(List.of(1.1f, 2.2f, 3.3f, 4.4f));
		
		assertNotNull(buffer);
		assertEquals(4, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToFlippedFloatBuffer(FloatBuffer, List) BufferUtilsPrimitives.copyToFlippedFloatBuffer(FloatBuffer, List&lt;Float&gt;)}
	 * puts the values in the right order in the buffer and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedFloatBuffer_ListExternalBufferTest()
	{
		FloatBuffer buffer = BufferUtils.createFloatBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToFlippedFloatBuffer(buffer, List.of(1.1f, 2.2f, 3.3f, 4.4f)));

		assertEquals(10, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1.1f, buffer.get());
		assertEquals(2.2f, buffer.get());
		assertEquals(3.3f, buffer.get());
		assertEquals(4.4f, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToFlippedDoubleBuffer(double[]) BufferUtilsPrimitives.copyToFlippedDoubleBuffer(double...)}
	 * creates a new {@link DoubleBuffer}, puts the values in the right order in the buffer
	 * and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedDoubleBuffer_ArrayTest()
	{
		DoubleBuffer buffer = BufferUtils.copyToFlippedDoubleBuffer(1.1, 2.2, 3.3, 4.4);
		
		assertNotNull(buffer);
		assertEquals(4, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1.1, buffer.get());
		assertEquals(2.2, buffer.get());
		assertEquals(3.3, buffer.get());
		assertEquals(4.4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToFlippedDoubleBuffer(DoubleBuffer, double[]) BufferUtilsPrimitives.copyToFlippedDoubleBuffer(DoubleBuffer, double...)}
	 * puts the values in the right order in the buffer and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedDoubleBuffer_ArrayExternalBufferTest()
	{
		DoubleBuffer buffer = BufferUtils.createDoubleBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToFlippedDoubleBuffer(buffer, 1.1, 2.2, 3.3, 4.4));

		assertEquals(10, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1.1, buffer.get());
		assertEquals(2.2, buffer.get());
		assertEquals(3.3, buffer.get());
		assertEquals(4.4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToFlippedDoubleBuffer(List) BufferUtilsPrimitives.copyToFlippedDoubleBuffer(List&lt;Double&gt;)}
	 * creates a new {@link DoubleBuffer}, puts the values in the right order in the buffer
	 * and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedDoubleBuffer_ListTest()
	{
		DoubleBuffer buffer = BufferUtils.copyToFlippedDoubleBuffer(List.of(1.1, 2.2, 3.3, 4.4));
		
		assertNotNull(buffer);
		assertEquals(4, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1.1, buffer.get());
		assertEquals(2.2, buffer.get());
		assertEquals(3.3, buffer.get());
		assertEquals(4.4, buffer.get());
	}
	
	/**
	 * This test ensures, that the function {@link org.barghos.core.api.util.BufferUtilsPrimitives#copyToFlippedDoubleBuffer(DoubleBuffer, List) BufferUtilsPrimitives.copyToFlippedDoubleBuffer(DoubleBuffer, List&lt;Double&gt;)}
	 * puts the values in the right order in the buffer and resets the position to 0 by flipping.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void copyToFlippedDoubleBuffer_ListExternalBufferTest()
	{
		DoubleBuffer buffer = BufferUtils.createDoubleBuffer(10);
		
		assertSame(buffer, BufferUtils.copyToFlippedDoubleBuffer(buffer, List.of(1.1, 2.2, 3.3, 4.4)));
		
		assertEquals(10, buffer.capacity());
		assertEquals(0, buffer.position());
		
		assertEquals(1.1, buffer.get());
		assertEquals(2.2, buffer.get());
		assertEquals(3.3, buffer.get());
		assertEquals(4.4, buffer.get());
	}
}