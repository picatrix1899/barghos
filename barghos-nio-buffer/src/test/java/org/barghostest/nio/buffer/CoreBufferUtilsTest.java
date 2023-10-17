//package org.barghos.core.api.test.nio.buffer;
//
//import static org.barghos.testutils.TestObjectFactory.*;
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//import org.junit.jupiter.api.Test;
//import org.mockito.invocation.InvocationOnMock;
//import org.mockito.stubbing.Answer;
//
//import java.nio.ByteBuffer;
//import java.nio.ByteOrder;
//import java.nio.DoubleBuffer;
//import java.nio.FloatBuffer;
//import java.nio.IntBuffer;
//import java.nio.LongBuffer;
//import java.nio.ShortBuffer;
//import java.util.List;
//
//import org.barghos.core.api.nio.buffer.NioBufferFactory;
//import org.barghos.core.api.tuple2.Tup2bR;
//import org.barghos.core.api.tuple2.Tup2dR;
//import org.barghos.core.api.tuple2.Tup2fR;
//import org.barghos.core.api.tuple2.Tup2iR;
//import org.barghos.core.api.tuple2.Tup2lR;
//import org.barghos.core.api.tuple2.Tup2sR;
//import org.barghos.core.api.tuple3.Tup3bR;
//import org.barghos.core.api.tuple3.Tup3dR;
//import org.barghos.core.api.tuple3.Tup3fR;
//import org.barghos.core.api.tuple3.Tup3iR;
//import org.barghos.core.api.tuple3.Tup3lR;
//import org.barghos.core.api.tuple3.Tup3sR;
//import org.barghos.core.api.tuple4.Tup4bR;
//import org.barghos.core.api.tuple4.Tup4dR;
//import org.barghos.core.api.tuple4.Tup4fR;
//import org.barghos.core.api.tuple4.Tup4iR;
//import org.barghos.core.api.tuple4.Tup4lR;
//import org.barghos.core.api.tuple4.Tup4sR;
//import org.barghos.core.api.util.CoreBufferUtil;
//
///**
// * This class provides component tests for the class {@link CoreBufferUtil}.
// * 
// * @author picatrix1899
// */
//class CoreBufferUtilsTest
//{
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createByteBuffer(int)}
//	 * correctly relays the call to the factory.
//	 */
//	@Test
//	void createByteBufferTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		ByteBuffer b = mock(ByteBuffer.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createByteBuffer(14)).thenReturn(b);
//		
//		assertSame(b, CoreBufferUtil.createByteBuffer(14));
//		
//		verify(factory).createByteBuffer(14);
//		
//		verifyNoMoreInteractions(factory, b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createShortBuffer(int)}
//	 * correctly relays the call to the factory.
//	 */
//	@Test
//	void createShortBufferTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		ShortBuffer b = mock(ShortBuffer.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createShortBuffer(14)).thenReturn(b);
//		
//		assertSame(b, CoreBufferUtil.createShortBuffer(14));
//		
//		verify(factory).createShortBuffer(14);
//		
//		verifyNoMoreInteractions(factory, b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createIntBuffer(int)}
//	 * correctly relays the call to the factory.
//	 */
//	@Test
//	void createIntBufferTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		IntBuffer b = mock(IntBuffer.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createIntBuffer(14)).thenReturn(b);
//		
//		assertSame(b, CoreBufferUtil.createIntBuffer(14));
//		
//		verify(factory).createIntBuffer(14);
//		
//		verifyNoMoreInteractions(factory, b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createLongBuffer(int)}
//	 * correctly relays the call to the factory.
//	 */
//	@Test
//	void createLongBufferTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		LongBuffer b = mock(LongBuffer.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createLongBuffer(14)).thenReturn(b);
//		
//		assertSame(b, CoreBufferUtil.createLongBuffer(14));
//		
//		verify(factory).createLongBuffer(14);
//		
//		verifyNoMoreInteractions(factory, b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFloatBuffer(int)}
//	 * correctly relays the call to the factory.
//	 */
//	@Test
//	void createFloatBufferTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		FloatBuffer b = mock(FloatBuffer.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createFloatBuffer(14)).thenReturn(b);
//		
//		assertSame(b, CoreBufferUtil.createFloatBuffer(14));
//		
//		verify(factory).createFloatBuffer(14);
//		
//		verifyNoMoreInteractions(factory, b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createDoubleBuffer(int)}
//	 * correctly relays the call to the factory.
//	 */
//	@Test
//	void createDoubleBufferTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		DoubleBuffer b = mock(DoubleBuffer.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createDoubleBuffer(14)).thenReturn(b);
//		
//		assertSame(b, CoreBufferUtil.createDoubleBuffer(14));
//		
//		verify(factory).createDoubleBuffer(14);
//		
//		verifyNoMoreInteractions(factory, b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#destroyBuffer(ByteBuffer)}
//	 * correctly relays the call to the factory.
//	 */
//	@Test
//	void destroyBuffer_ByteTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		ByteBuffer b = mock(ByteBuffer.class);
//
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		CoreBufferUtil.destroyBuffer(b);
//		
//		verify(factory).destroyBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#destroyBuffer(ShortBuffer)}
//	 * correctly relays the call to the factory.
//	 */
//	@Test
//	void destroyBuffer_ShortTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		ShortBuffer b = mock(ShortBuffer.class);
//
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		CoreBufferUtil.destroyBuffer(b);
//		
//		verify(factory).destroyBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#destroyBuffer(IntBuffer)}
//	 * correctly relays the call to the factory.
//	 */
//	@Test
//	void destroyBuffer_IntTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		IntBuffer b = mock(IntBuffer.class);
//
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		CoreBufferUtil.destroyBuffer(b);
//		
//		verify(factory).destroyBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#destroyBuffer(LongBuffer)}
//	 * correctly relays the call to the factory.
//	 */
//	@Test
//	void destroyBuffer_LongTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		LongBuffer b = mock(LongBuffer.class);
//
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		CoreBufferUtil.destroyBuffer(b);
//		
//		verify(factory).destroyBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#destroyBuffer(FloatBuffer)}
//	 * correctly relays the call to the factory.
//	 */
//	@Test
//	void destroyBuffer_FloatTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		FloatBuffer b = mock(FloatBuffer.class);
//
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		CoreBufferUtil.destroyBuffer(b);
//		
//		verify(factory).destroyBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#destroyBuffer(DoubleBuffer)}
//	 * correctly relays the call to the factory.
//	 */
//	@Test
//	void destroyBuffer_DoubleTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		DoubleBuffer b = mock(DoubleBuffer.class);
//
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		CoreBufferUtil.destroyBuffer(b);
//		
//		verify(factory).destroyBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromByte(byte[])}
//	 * correctly creates a {@link ByteBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromByte_ArrayTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		ByteBuffer b = mock(ByteBuffer.class);
//
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createByteBuffer(4)).thenReturn(b);
//		when(b.put(bArray(1, 2, 3, 4))).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromByte(bArray(1, 2, 3, 4)));
//
//		verify(factory).createByteBuffer(4);
//		verify(b).put(bArray(1, 2, 3, 4));
//		
//		verifyNoMoreInteractions(factory, b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromByte(List)}
//	 * correctly creates a {@link ByteBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromByte_ListTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		ByteBuffer b = mock(ByteBuffer.class);
//
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createByteBuffer(4)).thenReturn(b);
//		
//		when(b.put(b(1))).thenReturn(b);
//		when(b.put(b(2))).thenReturn(b);
//		when(b.put(b(3))).thenReturn(b);
//		when(b.put(b(4))).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromByte(List.of(b(1), b(2), b(3), b(4))));
//
//		verify(factory).createByteBuffer(4);
//		verify(b).put(b(1));
//		verify(b).put(b(2));
//		verify(b).put(b(3));
//		verify(b).put(b(4));
//		
//		verifyNoMoreInteractions(factory, b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromShort(short[])}
//	 * correctly creates a {@link ShortBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromShort_ArrayTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		ShortBuffer b = mock(ShortBuffer.class);
//
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createShortBuffer(4)).thenReturn(b);
//		when(b.put(sArray(1, 2, 3, 4))).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromShort(sArray(1, 2, 3, 4)));
//
//		verify(factory).createShortBuffer(4);
//		verify(b).put(sArray(1, 2, 3, 4));
//		
//		verifyNoMoreInteractions(factory, b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromShort(List)}
//	 * correctly creates a {@link ShortBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromShort_ListTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		ShortBuffer b = mock(ShortBuffer.class);
//
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createShortBuffer(4)).thenReturn(b);
//		
//		when(b.put(s(1))).thenReturn(b);
//		when(b.put(s(2))).thenReturn(b);
//		when(b.put(s(3))).thenReturn(b);
//		when(b.put(s(4))).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromShort(List.of(s(1), s(2), s(3), s(4))));
//
//		verify(factory).createShortBuffer(4);
//		verify(b).put(s(1));
//		verify(b).put(s(2));
//		verify(b).put(s(3));
//		verify(b).put(s(4));
//		
//		verifyNoMoreInteractions(factory, b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromInt(int[])}
//	 * correctly creates a {@link IntBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromInt_ArrayTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		IntBuffer b = mock(IntBuffer.class);
//
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createIntBuffer(4)).thenReturn(b);
//		when(b.put(new int[] {1, 2, 3, 4})).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromInt(new int[] {1, 2, 3, 4}));
//
//		verify(factory).createIntBuffer(4);
//		verify(b).put(new int[] {1, 2, 3, 4});
//		
//		verifyNoMoreInteractions(factory, b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromInt(List)}
//	 * correctly creates a {@link IntBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromInt_ListTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		IntBuffer b = mock(IntBuffer.class);
//
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createIntBuffer(4)).thenReturn(b);
//		
//		when(b.put(1)).thenReturn(b);
//		when(b.put(2)).thenReturn(b);
//		when(b.put(3)).thenReturn(b);
//		when(b.put(4)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromInt(List.of(1, 2, 3, 4)));
//
//		verify(factory).createIntBuffer(4);
//		verify(b).put(1);
//		verify(b).put(2);
//		verify(b).put(3);
//		verify(b).put(4);
//		
//		verifyNoMoreInteractions(factory, b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromLong(long[])}
//	 * correctly creates a {@link LongBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromLong_ArrayTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		LongBuffer b = mock(LongBuffer.class);
//
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createLongBuffer(4)).thenReturn(b);
//		when(b.put(new long[] {1l, 2l, 3l, 4l})).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromLong(new long[] {1l, 2l, 3l, 4l}));
//
//		verify(factory).createLongBuffer(4);
//		verify(b).put(new long[] {1l, 2l, 3l, 4l});
//		
//		verifyNoMoreInteractions(factory, b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromLong(List)}
//	 * correctly creates a {@link LongBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromLong_ListTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		LongBuffer b = mock(LongBuffer.class);
//
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createLongBuffer(4)).thenReturn(b);
//		
//		when(b.put(1l)).thenReturn(b);
//		when(b.put(2l)).thenReturn(b);
//		when(b.put(3l)).thenReturn(b);
//		when(b.put(4l)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromLong(List.of(1l, 2l, 3l, 4l)));
//
//		verify(factory).createLongBuffer(4);
//		verify(b).put(1l);
//		verify(b).put(2l);
//		verify(b).put(3l);
//		verify(b).put(4l);
//		
//		verifyNoMoreInteractions(factory, b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromFloat(float[])}
//	 * correctly creates a {@link FloatBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromFloat_ArrayTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		FloatBuffer b = mock(FloatBuffer.class);
//
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createFloatBuffer(4)).thenReturn(b);
//		when(b.put(new float[] {1.0f, 2.0f, 3.0f, 4.0f})).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromFloat(new float[] {1.0f, 2.0f, 3.0f, 4.0f}));
//
//		verify(factory).createFloatBuffer(4);
//		verify(b).put(new float[] {1.0f, 2.0f, 3.0f, 4.0f});
//		
//		verifyNoMoreInteractions(factory, b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromFloat(List)}
//	 * correctly creates a {@link FloatBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromFloat_ListTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		FloatBuffer b = mock(FloatBuffer.class);
//
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createFloatBuffer(4)).thenReturn(b);
//		
//		when(b.put(1.0f)).thenReturn(b);
//		when(b.put(2.0f)).thenReturn(b);
//		when(b.put(3.0f)).thenReturn(b);
//		when(b.put(4.0f)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromFloat(List.of(1.0f, 2.0f, 3.0f, 4.0f)));
//
//		verify(factory).createFloatBuffer(4);
//		verify(b).put(1.0f);
//		verify(b).put(2.0f);
//		verify(b).put(3.0f);
//		verify(b).put(4.0f);
//		
//		verifyNoMoreInteractions(factory, b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromDouble(double[])}
//	 * correctly creates a {@link DoubleBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromDouble_ArrayTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		DoubleBuffer b = mock(DoubleBuffer.class);
//
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createDoubleBuffer(4)).thenReturn(b);
//		when(b.put(new double[] {1.0, 2.0, 3.0, 4.0})).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromDouble(new double[] {1.0, 2.0, 3.0, 4.0}));
//
//		verify(factory).createDoubleBuffer(4);
//		verify(b).put(new double[] {1.0, 2.0, 3.0, 4.0});
//		
//		verifyNoMoreInteractions(factory, b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromDouble(List)}
//	 * correctly creates a {@link DoubleBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromDouble_ListTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		DoubleBuffer b = mock(DoubleBuffer.class);
//
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createDoubleBuffer(4)).thenReturn(b);
//		
//		when(b.put(1.0)).thenReturn(b);
//		when(b.put(2.0)).thenReturn(b);
//		when(b.put(3.0)).thenReturn(b);
//		when(b.put(4.0)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromDouble(List.of(1.0, 2.0, 3.0, 4.0)));
//
//		verify(factory).createDoubleBuffer(4);
//		verify(b).put(1.0);
//		verify(b).put(2.0);
//		verify(b).put(3.0);
//		verify(b).put(4.0);
//		
//		verifyNoMoreInteractions(factory, b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple2b(Tup2bR[])}
//	 * correctly creates a {@link ByteBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple2b_ArrayTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		ByteBuffer b = mock(ByteBuffer.class);
//		Tup2bR t1 = mock(Tup2bR.class);
//		Tup2bR t2 = mock(Tup2bR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createByteBuffer(4)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple2b(t1, t2));
//
//		verify(factory).createByteBuffer(4);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple2b(List)}
//	 * correctly creates a {@link ByteBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple2b_ListTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		ByteBuffer b = mock(ByteBuffer.class);
//		Tup2bR t1 = mock(Tup2bR.class);
//		Tup2bR t2 = mock(Tup2bR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createByteBuffer(4)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple2b(List.of(t1, t2)));
//
//		verify(factory).createByteBuffer(4);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple3b(Tup3bR[])}
//	 * correctly creates a {@link ByteBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple3b_ArrayTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		ByteBuffer b = mock(ByteBuffer.class);
//		Tup3bR t1 = mock(Tup3bR.class);
//		Tup3bR t2 = mock(Tup3bR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createByteBuffer(6)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple3b(t1, t2));
//
//		verify(factory).createByteBuffer(6);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple3b(List)}
//	 * correctly creates a {@link ByteBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple3b_ListTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		ByteBuffer b = mock(ByteBuffer.class);
//		Tup3bR t1 = mock(Tup3bR.class);
//		Tup3bR t2 = mock(Tup3bR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createByteBuffer(6)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple3b(List.of(t1, t2)));
//
//		verify(factory).createByteBuffer(6);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple4b(Tup4bR[])}
//	 * correctly creates a {@link ByteBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple4b_ArrayTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		ByteBuffer b = mock(ByteBuffer.class);
//		Tup4bR t1 = mock(Tup4bR.class);
//		Tup4bR t2 = mock(Tup4bR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createByteBuffer(8)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple4b(t1, t2));
//
//		verify(factory).createByteBuffer(8);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple4b(List)}
//	 * correctly creates a {@link ByteBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple4b_ListTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		ByteBuffer b = mock(ByteBuffer.class);
//		Tup4bR t1 = mock(Tup4bR.class);
//		Tup4bR t2 = mock(Tup4bR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createByteBuffer(8)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple4b(List.of(t1, t2)));
//
//		verify(factory).createByteBuffer(8);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple2s(Tup2sR[])}
//	 * correctly creates a {@link ShortBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple2s_ArrayTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		ShortBuffer b = mock(ShortBuffer.class);
//		Tup2sR t1 = mock(Tup2sR.class);
//		Tup2sR t2 = mock(Tup2sR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createShortBuffer(4)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple2s(t1, t2));
//
//		verify(factory).createShortBuffer(4);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple2s(List)}
//	 * correctly creates a {@link ShortBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple2s_ListTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		ShortBuffer b = mock(ShortBuffer.class);
//		Tup2sR t1 = mock(Tup2sR.class);
//		Tup2sR t2 = mock(Tup2sR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createShortBuffer(4)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple2s(List.of(t1, t2)));
//
//		verify(factory).createShortBuffer(4);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple3s(Tup3sR[])}
//	 * correctly creates a {@link ShortBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple3s_ArrayTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		ShortBuffer b = mock(ShortBuffer.class);
//		Tup3sR t1 = mock(Tup3sR.class);
//		Tup3sR t2 = mock(Tup3sR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createShortBuffer(6)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple3s(t1, t2));
//
//		verify(factory).createShortBuffer(6);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple3s(List)}
//	 * correctly creates a {@link ShortBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple3s_ListTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		ShortBuffer b = mock(ShortBuffer.class);
//		Tup3sR t1 = mock(Tup3sR.class);
//		Tup3sR t2 = mock(Tup3sR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createShortBuffer(6)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple3s(List.of(t1, t2)));
//
//		verify(factory).createShortBuffer(6);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple4s(Tup4sR[])}
//	 * correctly creates a {@link ShortBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple4s_ArrayTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		ShortBuffer b = mock(ShortBuffer.class);
//		Tup4sR t1 = mock(Tup4sR.class);
//		Tup4sR t2 = mock(Tup4sR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createShortBuffer(8)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple4s(t1, t2));
//
//		verify(factory).createShortBuffer(8);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple4s(List)}
//	 * correctly creates a {@link ShortBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple4s_ListTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		ShortBuffer b = mock(ShortBuffer.class);
//		Tup4sR t1 = mock(Tup4sR.class);
//		Tup4sR t2 = mock(Tup4sR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createShortBuffer(8)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple4s(List.of(t1, t2)));
//
//		verify(factory).createShortBuffer(8);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple2i(Tup2iR[])}
//	 * correctly creates a {@link IntBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple2i_ArrayTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		IntBuffer b = mock(IntBuffer.class);
//		Tup2iR t1 = mock(Tup2iR.class);
//		Tup2iR t2 = mock(Tup2iR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createIntBuffer(4)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple2i(t1, t2));
//
//		verify(factory).createIntBuffer(4);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple2i(List)}
//	 * correctly creates a {@link IntBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple2i_ListTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		IntBuffer b = mock(IntBuffer.class);
//		Tup2iR t1 = mock(Tup2iR.class);
//		Tup2iR t2 = mock(Tup2iR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createIntBuffer(4)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple2i(List.of(t1, t2)));
//
//		verify(factory).createIntBuffer(4);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple3i(Tup3iR[])}
//	 * correctly creates a {@link IntBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple3i_ArrayTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		IntBuffer b = mock(IntBuffer.class);
//		Tup3iR t1 = mock(Tup3iR.class);
//		Tup3iR t2 = mock(Tup3iR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createIntBuffer(6)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple3i(t1, t2));
//
//		verify(factory).createIntBuffer(6);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple3i(List)}
//	 * correctly creates a {@link IntBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple3i_ListTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		IntBuffer b = mock(IntBuffer.class);
//		Tup3iR t1 = mock(Tup3iR.class);
//		Tup3iR t2 = mock(Tup3iR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createIntBuffer(6)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple3i(List.of(t1, t2)));
//
//		verify(factory).createIntBuffer(6);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple4i(Tup4iR[])}
//	 * correctly creates a {@link IntBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple4i_ArrayTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		IntBuffer b = mock(IntBuffer.class);
//		Tup4iR t1 = mock(Tup4iR.class);
//		Tup4iR t2 = mock(Tup4iR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createIntBuffer(8)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple4i(t1, t2));
//
//		verify(factory).createIntBuffer(8);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple4i(List)}
//	 * correctly creates a {@link IntBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple4i_ListTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		IntBuffer b = mock(IntBuffer.class);
//		Tup4iR t1 = mock(Tup4iR.class);
//		Tup4iR t2 = mock(Tup4iR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createIntBuffer(8)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple4i(List.of(t1, t2)));
//
//		verify(factory).createIntBuffer(8);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple2l(Tup2lR[])}
//	 * correctly creates a {@link LongBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple2l_ArrayTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		LongBuffer b = mock(LongBuffer.class);
//		Tup2lR t1 = mock(Tup2lR.class);
//		Tup2lR t2 = mock(Tup2lR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createLongBuffer(4)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple2l(t1, t2));
//
//		verify(factory).createLongBuffer(4);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple2l(List)}
//	 * correctly creates a {@link LongBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple2l_ListTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		LongBuffer b = mock(LongBuffer.class);
//		Tup2lR t1 = mock(Tup2lR.class);
//		Tup2lR t2 = mock(Tup2lR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createLongBuffer(4)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple2l(List.of(t1, t2)));
//
//		verify(factory).createLongBuffer(4);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple3l(Tup3lR[])}
//	 * correctly creates a {@link LongBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple3l_ArrayTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		LongBuffer b = mock(LongBuffer.class);
//		Tup3lR t1 = mock(Tup3lR.class);
//		Tup3lR t2 = mock(Tup3lR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createLongBuffer(6)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple3l(t1, t2));
//
//		verify(factory).createLongBuffer(6);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple3l(List)}
//	 * correctly creates a {@link LongBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple3l_ListTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		LongBuffer b = mock(LongBuffer.class);
//		Tup3lR t1 = mock(Tup3lR.class);
//		Tup3lR t2 = mock(Tup3lR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createLongBuffer(6)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple3l(List.of(t1, t2)));
//
//		verify(factory).createLongBuffer(6);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple4l(Tup4lR[])}
//	 * correctly creates a {@link LongBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple4l_ArrayTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		LongBuffer b = mock(LongBuffer.class);
//		Tup4lR t1 = mock(Tup4lR.class);
//		Tup4lR t2 = mock(Tup4lR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createLongBuffer(8)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple4l(t1, t2));
//
//		verify(factory).createLongBuffer(8);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple4l(List)}
//	 * correctly creates a {@link LongBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple4l_ListTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		LongBuffer b = mock(LongBuffer.class);
//		Tup4lR t1 = mock(Tup4lR.class);
//		Tup4lR t2 = mock(Tup4lR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createLongBuffer(8)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple4l(List.of(t1, t2)));
//
//		verify(factory).createLongBuffer(8);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple2f(Tup2fR[])}
//	 * correctly creates a {@link FloatBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple2f_ArrayTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		FloatBuffer b = mock(FloatBuffer.class);
//		Tup2fR t1 = mock(Tup2fR.class);
//		Tup2fR t2 = mock(Tup2fR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createFloatBuffer(4)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple2f(t1, t2));
//
//		verify(factory).createFloatBuffer(4);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple2f(List)}
//	 * correctly creates a {@link FloatBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple2f_ListTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		FloatBuffer b = mock(FloatBuffer.class);
//		Tup2fR t1 = mock(Tup2fR.class);
//		Tup2fR t2 = mock(Tup2fR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createFloatBuffer(4)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple2f(List.of(t1, t2)));
//
//		verify(factory).createFloatBuffer(4);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple3f(Tup3fR[])}
//	 * correctly creates a {@link FloatBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple3f_ArrayTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		FloatBuffer b = mock(FloatBuffer.class);
//		Tup3fR t1 = mock(Tup3fR.class);
//		Tup3fR t2 = mock(Tup3fR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createFloatBuffer(6)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple3f(t1, t2));
//
//		verify(factory).createFloatBuffer(6);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple3f(List)}
//	 * correctly creates a {@link FloatBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple3f_ListTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		FloatBuffer b = mock(FloatBuffer.class);
//		Tup3fR t1 = mock(Tup3fR.class);
//		Tup3fR t2 = mock(Tup3fR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createFloatBuffer(6)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple3f(List.of(t1, t2)));
//
//		verify(factory).createFloatBuffer(6);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple4f(Tup4fR[])}
//	 * correctly creates a {@link FloatBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple4f_ArrayTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		FloatBuffer b = mock(FloatBuffer.class);
//		Tup4fR t1 = mock(Tup4fR.class);
//		Tup4fR t2 = mock(Tup4fR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createFloatBuffer(8)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple4f(t1, t2));
//
//		verify(factory).createFloatBuffer(8);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple4f(List)}
//	 * correctly creates a {@link FloatBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple4f_ListTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		FloatBuffer b = mock(FloatBuffer.class);
//		Tup4fR t1 = mock(Tup4fR.class);
//		Tup4fR t2 = mock(Tup4fR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createFloatBuffer(8)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple4f(List.of(t1, t2)));
//
//		verify(factory).createFloatBuffer(8);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple2d(Tup2dR[])}
//	 * correctly creates a {@link DoubleBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple2d_ArrayTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		DoubleBuffer b = mock(DoubleBuffer.class);
//		Tup2dR t1 = mock(Tup2dR.class);
//		Tup2dR t2 = mock(Tup2dR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createDoubleBuffer(4)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple2d(t1, t2));
//
//		verify(factory).createDoubleBuffer(4);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple2d(List)}
//	 * correctly creates a {@link DoubleBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple2d_ListTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		DoubleBuffer b = mock(DoubleBuffer.class);
//		Tup2dR t1 = mock(Tup2dR.class);
//		Tup2dR t2 = mock(Tup2dR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createDoubleBuffer(4)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple2d(List.of(t1, t2)));
//
//		verify(factory).createDoubleBuffer(4);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple3d(Tup3dR[])}
//	 * correctly creates a {@link DoubleBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple3d_ArrayTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		DoubleBuffer b = mock(DoubleBuffer.class);
//		Tup3dR t1 = mock(Tup3dR.class);
//		Tup3dR t2 = mock(Tup3dR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createDoubleBuffer(6)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple3d(t1, t2));
//
//		verify(factory).createDoubleBuffer(6);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple3d(List)}
//	 * correctly creates a {@link DoubleBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple3d_ListTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		DoubleBuffer b = mock(DoubleBuffer.class);
//		Tup3dR t1 = mock(Tup3dR.class);
//		Tup3dR t2 = mock(Tup3dR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createDoubleBuffer(6)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple3d(List.of(t1, t2)));
//
//		verify(factory).createDoubleBuffer(6);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple4d(Tup4dR[])}
//	 * correctly creates a {@link DoubleBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple4d_ArrayTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		DoubleBuffer b = mock(DoubleBuffer.class);
//		Tup4dR t1 = mock(Tup4dR.class);
//		Tup4dR t2 = mock(Tup4dR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createDoubleBuffer(8)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple4d(t1, t2));
//
//		verify(factory).createDoubleBuffer(8);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromTuple4d(List)}
//	 * correctly creates a {@link DoubleBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromTuple4d_ListTest()
//	{
//		NioBufferFactory factory = mock(NioBufferFactory.class);
//		DoubleBuffer b = mock(DoubleBuffer.class);
//		Tup4dR t1 = mock(Tup4dR.class);
//		Tup4dR t2 = mock(Tup4dR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createDoubleBuffer(8)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.createFromTuple4d(List.of(t1, t2)));
//
//		verify(factory).createDoubleBuffer(8);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, b, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipByte(byte[])}
//	 * correctly creates a {@link ByteBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipByte_ArrayTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createByteBuffer(4)).thenCallRealMethod();
//		
//		ByteBuffer b = CoreBufferUtil.createFromAndFlipByte(bArray(1, 2, 3, 4));
//
//		assertNotNull(b);
//		assertEquals(4, b.capacity());
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createByteBuffer(4);
//			
//		verifyNoMoreInteractions(factory);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipByte(List)}
//	 * correctly creates a {@link ByteBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipByte_ListTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createByteBuffer(4)).thenCallRealMethod();
//		
//		ByteBuffer b = CoreBufferUtil.createFromAndFlipByte(List.of(b(1), b(2), b(3), b(4)));
//
//		assertEquals(4, b.capacity());
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//		 
//		verify(factory).createByteBuffer(4);
//		
//		verifyNoMoreInteractions(factory);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipShort(short[])}
//	 * correctly creates a {@link ShortBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipShort_ArrayTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createShortBuffer(4)).thenCallRealMethod();
//		
//		ShortBuffer b = CoreBufferUtil.createFromAndFlipShort(sArray(1, 2, 3, 4));
//
//		assertEquals(4, b.capacity());
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createShortBuffer(4);
//		
//		verifyNoMoreInteractions(factory);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipShort(List)}
//	 * correctly creates a {@link ShortBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipShort_ListTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createShortBuffer(4)).thenCallRealMethod();
//		
//		ShortBuffer b = CoreBufferUtil.createFromAndFlipShort(List.of(s(1), s(2), s(3), s(4)));
//
//		assertEquals(4, b.capacity());
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createShortBuffer(4);
//		
//		verifyNoMoreInteractions(factory);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipInt(int[])}
//	 * correctly creates a {@link IntBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipInt_ArrayTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createIntBuffer(4)).thenCallRealMethod();
//		
//		IntBuffer b = CoreBufferUtil.createFromAndFlipInt(new int[] {1, 2, 3, 4});
//
//		assertEquals(4, b.capacity());
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createIntBuffer(4);
//		
//		verifyNoMoreInteractions(factory);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipInt(List)}
//	 * correctly creates a {@link IntBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipInt_ListTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createIntBuffer(4)).thenCallRealMethod();
//		
//		IntBuffer b = CoreBufferUtil.createFromAndFlipInt(List.of(1, 2, 3, 4));
//
//		assertEquals(4, b.capacity());
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createIntBuffer(4);
//		
//		verifyNoMoreInteractions(factory);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipLong(long[])}
//	 * correctly creates a {@link LongBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipLong_ArrayTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createLongBuffer(4)).thenCallRealMethod();
//		
//		LongBuffer b = CoreBufferUtil.createFromAndFlipLong(new long[] {1l, 2l, 3l, 4l});
//
//		assertEquals(4, b.capacity());
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createLongBuffer(4);
//		
//		verifyNoMoreInteractions(factory);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipLong(List)}
//	 * correctly creates a {@link LongBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipLong_ListTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createLongBuffer(4)).thenCallRealMethod();
//		
//		LongBuffer b = CoreBufferUtil.createFromAndFlipLong(List.of(1l, 2l, 3l, 4l));
//
//		assertEquals(4, b.capacity());
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createLongBuffer(4);
//		
//		verifyNoMoreInteractions(factory);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipFloat(float[])}
//	 * correctly creates a {@link FloatBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipFloat_ArrayTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createFloatBuffer(4)).thenCallRealMethod();
//		
//		FloatBuffer b = CoreBufferUtil.createFromAndFlipFloat(new float[] {1.0f, 2.0f, 3.0f, 4.0f});
//
//		assertEquals(4, b.capacity());
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createFloatBuffer(4);
//		
//		verifyNoMoreInteractions(factory);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipFloat(List)}
//	 * correctly creates a {@link FloatBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipFloat_ListTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createFloatBuffer(4)).thenCallRealMethod();
//		
//		FloatBuffer b = CoreBufferUtil.createFromAndFlipFloat(List.of(1.0f, 2.0f, 3.0f, 4.0f));
//
//		assertEquals(4, b.capacity());
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createFloatBuffer(4);
//		
//		verifyNoMoreInteractions(factory);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipDouble(double[])}
//	 * correctly creates a {@link DoubleBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipDouble_ArrayTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createDoubleBuffer(4)).thenCallRealMethod();
//		
//		DoubleBuffer b = CoreBufferUtil.createFromAndFlipDouble(new double[] {1.0, 2.0, 3.0, 4.0});
//
//		assertEquals(4, b.capacity());
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createDoubleBuffer(4);
//		
//		verifyNoMoreInteractions(factory);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipDouble(List)}
//	 * correctly creates a {@link DoubleBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipDouble_ListTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createDoubleBuffer(4)).thenCallRealMethod();
//		
//		DoubleBuffer b = CoreBufferUtil.createFromAndFlipDouble(List.of(1.0, 2.0, 3.0, 4.0));
//
//		assertEquals(4, b.capacity());
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createDoubleBuffer(4);
//		
//		verifyNoMoreInteractions(factory);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple2b(Tup2bR[])}
//	 * correctly creates a {@link ByteBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple2b_ArrayTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup2bR t1 = mock(Tup2bR.class);
//		Tup2bR t2 = mock(Tup2bR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createByteBuffer(4)).thenCallRealMethod();
//		when(t1.toBuffer(any(ByteBuffer.class))).then(new Answer<ByteBuffer>() {
//			public ByteBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ByteBuffer b = invocation.getArgument(0);
//				return b.put(b(1)).put(b(2));
//			}
//		});
//		when(t2.toBuffer(any(ByteBuffer.class))).then(new Answer<ByteBuffer>() {
//			public ByteBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ByteBuffer b = invocation.getArgument(0);
//				return b.put(b(3)).put(b(4));
//			}
//		});
//		
//		ByteBuffer b = CoreBufferUtil.createFromAndFlipTuple2b(t1, t2);
//
//		assertEquals(4, b.capacity());
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createByteBuffer(4);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple2b(List)}
//	 * correctly creates a {@link ByteBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple2b_ListTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup2bR t1 = mock(Tup2bR.class);
//		Tup2bR t2 = mock(Tup2bR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createByteBuffer(4)).thenCallRealMethod();
//		when(t1.toBuffer(any(ByteBuffer.class))).then(new Answer<ByteBuffer>() {
//			public ByteBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ByteBuffer b = invocation.getArgument(0);
//				return b.put(b(1)).put(b(2));
//			}
//		});
//		when(t2.toBuffer(any(ByteBuffer.class))).then(new Answer<ByteBuffer>() {
//			public ByteBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ByteBuffer b = invocation.getArgument(0);
//				return b.put(b(3)).put(b(4));
//			}
//		});
//		
//		ByteBuffer b = CoreBufferUtil.createFromAndFlipTuple2b(List.of(t1, t2));
//
//		assertEquals(4, b.capacity());
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createByteBuffer(4);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple3b(Tup3bR[])}
//	 * correctly creates a {@link ByteBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple3b_ArrayTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup3bR t1 = mock(Tup3bR.class);
//		Tup3bR t2 = mock(Tup3bR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createByteBuffer(6)).thenCallRealMethod();
//		when(t1.toBuffer(any(ByteBuffer.class))).then(new Answer<ByteBuffer>() {
//			public ByteBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ByteBuffer b = invocation.getArgument(0);
//				return b.put(b(1)).put(b(2)).put(b(3));
//			}
//		});
//		when(t2.toBuffer(any(ByteBuffer.class))).then(new Answer<ByteBuffer>() {
//			public ByteBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ByteBuffer b = invocation.getArgument(0);
//				return b.put(b(4)).put(b(5)).put(b(6));
//			}
//		});
//		
//		ByteBuffer b = CoreBufferUtil.createFromAndFlipTuple3b(t1, t2);
//
//		assertEquals(6, b.capacity());
//		assertEquals(6, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createByteBuffer(6);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple3b(List)}
//	 * correctly creates a {@link ByteBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple3b_ListTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup3bR t1 = mock(Tup3bR.class);
//		Tup3bR t2 = mock(Tup3bR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createByteBuffer(6)).thenCallRealMethod();
//		when(t1.toBuffer(any(ByteBuffer.class))).then(new Answer<ByteBuffer>() {
//			public ByteBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ByteBuffer b = invocation.getArgument(0);
//				return b.put(b(1)).put(b(2)).put(b(3));
//			}
//		});
//		when(t2.toBuffer(any(ByteBuffer.class))).then(new Answer<ByteBuffer>() {
//			public ByteBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ByteBuffer b = invocation.getArgument(0);
//				return b.put(b(4)).put(b(5)).put(b(6));
//			}
//		});
//		
//		ByteBuffer b = CoreBufferUtil.createFromAndFlipTuple3b(List.of(t1, t2));
//
//		assertEquals(6, b.capacity());
//		assertEquals(6, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createByteBuffer(6);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple4b(Tup4bR[])}
//	 * correctly creates a {@link ByteBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple4b_ArrayTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup4bR t1 = mock(Tup4bR.class);
//		Tup4bR t2 = mock(Tup4bR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createByteBuffer(8)).thenCallRealMethod();
//		when(t1.toBuffer(any(ByteBuffer.class))).then(new Answer<ByteBuffer>() {
//			public ByteBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ByteBuffer b = invocation.getArgument(0);
//				return b.put(b(1)).put(b(2)).put(b(3)).put(b(4));
//			}
//		});
//		when(t2.toBuffer(any(ByteBuffer.class))).then(new Answer<ByteBuffer>() {
//			public ByteBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ByteBuffer b = invocation.getArgument(0);
//				return b.put(b(5)).put(b(6)).put(b(7)).put(b(8));
//			}
//		});
//		
//		ByteBuffer b = CoreBufferUtil.createFromAndFlipTuple4b(t1, t2);
//
//		assertEquals(8, b.capacity());
//		assertEquals(8, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createByteBuffer(8);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple4b(List)}
//	 * correctly creates a {@link ByteBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple4b_ListTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup4bR t1 = mock(Tup4bR.class);
//		Tup4bR t2 = mock(Tup4bR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createByteBuffer(8)).thenCallRealMethod();
//		when(t1.toBuffer(any(ByteBuffer.class))).then(new Answer<ByteBuffer>() {
//			public ByteBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ByteBuffer b = invocation.getArgument(0);
//				return b.put(b(1)).put(b(2)).put(b(3)).put(b(4));
//			}
//		});
//		when(t2.toBuffer(any(ByteBuffer.class))).then(new Answer<ByteBuffer>() {
//			public ByteBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ByteBuffer b = invocation.getArgument(0);
//				return b.put(b(5)).put(b(6)).put(b(7)).put(b(8));
//			}
//		});
//		
//		ByteBuffer b = CoreBufferUtil.createFromAndFlipTuple4b(List.of(t1, t2));
//
//		assertEquals(8, b.capacity());
//		assertEquals(8, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createByteBuffer(8);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple2s(Tup2sR[])}
//	 * correctly creates a {@link ShortBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple2s_ArrayTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup2sR t1 = mock(Tup2sR.class);
//		Tup2sR t2 = mock(Tup2sR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createShortBuffer(4)).thenCallRealMethod();
//		when(t1.toBuffer(any(ShortBuffer.class))).then(new Answer<ShortBuffer>() {
//			public ShortBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ShortBuffer b = invocation.getArgument(0);
//				return b.put(s(1)).put(s(2));
//			}
//		});
//		when(t2.toBuffer(any(ShortBuffer.class))).then(new Answer<ShortBuffer>() {
//			public ShortBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ShortBuffer b = invocation.getArgument(0);
//				return b.put(s(3)).put(s(4));
//			}
//		});
//		
//		ShortBuffer b = CoreBufferUtil.createFromAndFlipTuple2s(t1, t2);
//
//		assertEquals(4, b.capacity());
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createShortBuffer(4);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple2s(List)}
//	 * correctly creates a {@link ShortBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple2s_ListTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup2sR t1 = mock(Tup2sR.class);
//		Tup2sR t2 = mock(Tup2sR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createShortBuffer(4)).thenCallRealMethod();
//		when(t1.toBuffer(any(ShortBuffer.class))).then(new Answer<ShortBuffer>() {
//			public ShortBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ShortBuffer b = invocation.getArgument(0);
//				return b.put(s(1)).put(s(2));
//			}
//		});
//		when(t2.toBuffer(any(ShortBuffer.class))).then(new Answer<ShortBuffer>() {
//			public ShortBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ShortBuffer b = invocation.getArgument(0);
//				return b.put(s(3)).put(s(4));
//			}
//		});
//		
//		ShortBuffer b = CoreBufferUtil.createFromAndFlipTuple2s(List.of(t1, t2));
//
//		assertEquals(4, b.capacity());
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createShortBuffer(4);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple3s(Tup3sR[])}
//	 * correctly creates a {@link ShortBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple3s_ArrayTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup3sR t1 = mock(Tup3sR.class);
//		Tup3sR t2 = mock(Tup3sR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createShortBuffer(6)).thenCallRealMethod();
//		when(t1.toBuffer(any(ShortBuffer.class))).then(new Answer<ShortBuffer>() {
//			public ShortBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ShortBuffer b = invocation.getArgument(0);
//				return b.put(s(1)).put(s(2)).put(s(3));
//			}
//		});
//		when(t2.toBuffer(any(ShortBuffer.class))).then(new Answer<ShortBuffer>() {
//			public ShortBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ShortBuffer b = invocation.getArgument(0);
//				return b.put(s(4)).put(s(5)).put(s(6));
//			}
//		});
//		
//		ShortBuffer b = CoreBufferUtil.createFromAndFlipTuple3s(t1, t2);
//
//		assertEquals(6, b.capacity());
//		assertEquals(6, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createShortBuffer(6);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple3s(List)}
//	 * correctly creates a {@link ShortBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple3s_ListTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup3sR t1 = mock(Tup3sR.class);
//		Tup3sR t2 = mock(Tup3sR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createShortBuffer(6)).thenCallRealMethod();
//		when(t1.toBuffer(any(ShortBuffer.class))).then(new Answer<ShortBuffer>() {
//			public ShortBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ShortBuffer b = invocation.getArgument(0);
//				return b.put(s(1)).put(s(2)).put(s(3));
//			}
//		});
//		when(t2.toBuffer(any(ShortBuffer.class))).then(new Answer<ShortBuffer>() {
//			public ShortBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ShortBuffer b = invocation.getArgument(0);
//				return b.put(s(4)).put(s(5)).put(s(6));
//			}
//		});
//		
//		ShortBuffer b = CoreBufferUtil.createFromAndFlipTuple3s(List.of(t1, t2));
//
//		assertEquals(6, b.capacity());
//		assertEquals(6, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createShortBuffer(6);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple4s(Tup4sR[])}
//	 * correctly creates a {@link ShortBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple4s_ArrayTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup4sR t1 = mock(Tup4sR.class);
//		Tup4sR t2 = mock(Tup4sR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createShortBuffer(8)).thenCallRealMethod();
//		when(t1.toBuffer(any(ShortBuffer.class))).then(new Answer<ShortBuffer>() {
//			public ShortBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ShortBuffer b = invocation.getArgument(0);
//				return b.put(s(1)).put(s(2)).put(s(3)).put(s(4));
//			}
//		});
//		when(t2.toBuffer(any(ShortBuffer.class))).then(new Answer<ShortBuffer>() {
//			public ShortBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ShortBuffer b = invocation.getArgument(0);
//				return b.put(s(5)).put(s(6)).put(s(7)).put(s(8));
//			}
//		});
//		
//		ShortBuffer b = CoreBufferUtil.createFromAndFlipTuple4s(t1, t2);
//
//		assertEquals(8, b.capacity());
//		assertEquals(8, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createShortBuffer(8);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple4s(List)}
//	 * correctly creates a {@link ShortBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple4s_ListTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup4sR t1 = mock(Tup4sR.class);
//		Tup4sR t2 = mock(Tup4sR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createShortBuffer(8)).thenCallRealMethod();
//		when(t1.toBuffer(any(ShortBuffer.class))).then(new Answer<ShortBuffer>() {
//			public ShortBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ShortBuffer b = invocation.getArgument(0);
//				return b.put(s(1)).put(s(2)).put(s(3)).put(s(4));
//			}
//		});
//		when(t2.toBuffer(any(ShortBuffer.class))).then(new Answer<ShortBuffer>() {
//			public ShortBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ShortBuffer b = invocation.getArgument(0);
//				return b.put(s(5)).put(s(6)).put(s(7)).put(s(8));
//			}
//		});
//		
//		ShortBuffer b = CoreBufferUtil.createFromAndFlipTuple4s(List.of(t1, t2));
//
//		assertEquals(8, b.capacity());
//		assertEquals(8, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createShortBuffer(8);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple2i(Tup2iR[])}
//	 * correctly creates a {@link IntBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple2i_ArrayTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup2iR t1 = mock(Tup2iR.class);
//		Tup2iR t2 = mock(Tup2iR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createIntBuffer(4)).thenCallRealMethod();
//		when(t1.toBuffer(any(IntBuffer.class))).then(new Answer<IntBuffer>() {
//			public IntBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				IntBuffer b = invocation.getArgument(0);
//				return b.put(1).put(2);
//			}
//		});
//		when(t2.toBuffer(any(IntBuffer.class))).then(new Answer<IntBuffer>() {
//			public IntBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				IntBuffer b = invocation.getArgument(0);
//				return b.put(3).put(4);
//			}
//		});
//		
//		IntBuffer b = CoreBufferUtil.createFromAndFlipTuple2i(t1, t2);
//
//		assertEquals(4, b.capacity());
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createIntBuffer(4);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple2i(List)}
//	 * correctly creates a {@link IntBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple2i_ListTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup2iR t1 = mock(Tup2iR.class);
//		Tup2iR t2 = mock(Tup2iR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createIntBuffer(4)).thenCallRealMethod();
//		when(t1.toBuffer(any(IntBuffer.class))).then(new Answer<IntBuffer>() {
//			public IntBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				IntBuffer b = invocation.getArgument(0);
//				return b.put(1).put(2);
//			}
//		});
//		when(t2.toBuffer(any(IntBuffer.class))).then(new Answer<IntBuffer>() {
//			public IntBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				IntBuffer b = invocation.getArgument(0);
//				return b.put(3).put(4);
//			}
//		});
//		
//		IntBuffer b = CoreBufferUtil.createFromAndFlipTuple2i(List.of(t1, t2));
//
//		assertEquals(4, b.capacity());
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createIntBuffer(4);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple3i(Tup3iR[])}
//	 * correctly creates a {@link IntBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple3i_ArrayTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup3iR t1 = mock(Tup3iR.class);
//		Tup3iR t2 = mock(Tup3iR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createIntBuffer(6)).thenCallRealMethod();
//		when(t1.toBuffer(any(IntBuffer.class))).then(new Answer<IntBuffer>() {
//			public IntBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				IntBuffer b = invocation.getArgument(0);
//				return b.put(1).put(2).put(3);
//			}
//		});
//		when(t2.toBuffer(any(IntBuffer.class))).then(new Answer<IntBuffer>() {
//			public IntBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				IntBuffer b = invocation.getArgument(0);
//				return b.put(4).put(5).put(6);
//			}
//		});
//		
//		IntBuffer b = CoreBufferUtil.createFromAndFlipTuple3i(t1, t2);
//
//		assertEquals(6, b.capacity());
//		assertEquals(6, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createIntBuffer(6);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple3i(List)}
//	 * correctly creates a {@link IntBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple3i_ListTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup3iR t1 = mock(Tup3iR.class);
//		Tup3iR t2 = mock(Tup3iR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createIntBuffer(6)).thenCallRealMethod();
//		when(t1.toBuffer(any(IntBuffer.class))).then(new Answer<IntBuffer>() {
//			public IntBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				IntBuffer b = invocation.getArgument(0);
//				return b.put(1).put(2).put(3);
//			}
//		});
//		when(t2.toBuffer(any(IntBuffer.class))).then(new Answer<IntBuffer>() {
//			public IntBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				IntBuffer b = invocation.getArgument(0);
//				return b.put(4).put(5).put(6);
//			}
//		});
//		
//		IntBuffer b = CoreBufferUtil.createFromAndFlipTuple3i(List.of(t1, t2));
//
//		assertEquals(6, b.capacity());
//		assertEquals(6, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createIntBuffer(6);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple4i(Tup4iR[])}
//	 * correctly creates a {@link IntBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple4i_ArrayTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup4iR t1 = mock(Tup4iR.class);
//		Tup4iR t2 = mock(Tup4iR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createIntBuffer(8)).thenCallRealMethod();
//		when(t1.toBuffer(any(IntBuffer.class))).then(new Answer<IntBuffer>() {
//			public IntBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				IntBuffer b = invocation.getArgument(0);
//				return b.put(1).put(2).put(3).put(4);
//			}
//		});
//		when(t2.toBuffer(any(IntBuffer.class))).then(new Answer<IntBuffer>() {
//			public IntBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				IntBuffer b = invocation.getArgument(0);
//				return b.put(5).put(6).put(7).put(8);
//			}
//		});
//		
//		IntBuffer b = CoreBufferUtil.createFromAndFlipTuple4i(t1, t2);
//
//		assertEquals(8, b.capacity());
//		assertEquals(8, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createIntBuffer(8);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple4i(List)}
//	 * correctly creates a {@link IntBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple4i_ListTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup4iR t1 = mock(Tup4iR.class);
//		Tup4iR t2 = mock(Tup4iR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createIntBuffer(8)).thenCallRealMethod();
//		when(t1.toBuffer(any(IntBuffer.class))).then(new Answer<IntBuffer>() {
//			public IntBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				IntBuffer b = invocation.getArgument(0);
//				return b.put(1).put(2).put(3).put(4);
//			}
//		});
//		when(t2.toBuffer(any(IntBuffer.class))).then(new Answer<IntBuffer>() {
//			public IntBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				IntBuffer b = invocation.getArgument(0);
//				return b.put(5).put(6).put(7).put(8);
//			}
//		});
//		
//		IntBuffer b = CoreBufferUtil.createFromAndFlipTuple4i(List.of(t1, t2));
//
//		assertEquals(8, b.capacity());
//		assertEquals(8, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createIntBuffer(8);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple2l(Tup2lR[])}
//	 * correctly creates a {@link LongBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple2l_ArrayTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup2lR t1 = mock(Tup2lR.class);
//		Tup2lR t2 = mock(Tup2lR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createLongBuffer(4)).thenCallRealMethod();
//		when(t1.toBuffer(any(LongBuffer.class))).then(new Answer<LongBuffer>() {
//			public LongBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				LongBuffer b = invocation.getArgument(0);
//				return b.put(1).put(2);
//			}
//		});
//		when(t2.toBuffer(any(LongBuffer.class))).then(new Answer<LongBuffer>() {
//			public LongBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				LongBuffer b = invocation.getArgument(0);
//				return b.put(3).put(4);
//			}
//		});
//		
//		LongBuffer b = CoreBufferUtil.createFromAndFlipTuple2l(t1, t2);
//
//		assertEquals(4, b.capacity());
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createLongBuffer(4);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple2l(List)}
//	 * correctly creates a {@link LongBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple2l_ListTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup2lR t1 = mock(Tup2lR.class);
//		Tup2lR t2 = mock(Tup2lR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createLongBuffer(4)).thenCallRealMethod();
//		when(t1.toBuffer(any(LongBuffer.class))).then(new Answer<LongBuffer>() {
//			public LongBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				LongBuffer b = invocation.getArgument(0);
//				return b.put(1).put(2);
//			}
//		});
//		when(t2.toBuffer(any(LongBuffer.class))).then(new Answer<LongBuffer>() {
//			public LongBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				LongBuffer b = invocation.getArgument(0);
//				return b.put(3).put(4);
//			}
//		});
//		
//		LongBuffer b = CoreBufferUtil.createFromAndFlipTuple2l(List.of(t1, t2));
//
//		assertEquals(4, b.capacity());
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createLongBuffer(4);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple3l(Tup3lR[])}
//	 * correctly creates a {@link LongBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple3l_ArrayTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup3lR t1 = mock(Tup3lR.class);
//		Tup3lR t2 = mock(Tup3lR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createLongBuffer(6)).thenCallRealMethod();
//		when(t1.toBuffer(any(LongBuffer.class))).then(new Answer<LongBuffer>() {
//			public LongBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				LongBuffer b = invocation.getArgument(0);
//				return b.put(1).put(2).put(3);
//			}
//		});
//		when(t2.toBuffer(any(LongBuffer.class))).then(new Answer<LongBuffer>() {
//			public LongBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				LongBuffer b = invocation.getArgument(0);
//				return b.put(4).put(5).put(6);
//			}
//		});
//		
//		LongBuffer b = CoreBufferUtil.createFromAndFlipTuple3l(t1, t2);
//
//		assertEquals(6, b.capacity());
//		assertEquals(6, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createLongBuffer(6);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple3l(List)}
//	 * correctly creates a {@link LongBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple3l_ListTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup3lR t1 = mock(Tup3lR.class);
//		Tup3lR t2 = mock(Tup3lR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createLongBuffer(6)).thenCallRealMethod();
//		when(t1.toBuffer(any(LongBuffer.class))).then(new Answer<LongBuffer>() {
//			public LongBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				LongBuffer b = invocation.getArgument(0);
//				return b.put(1).put(2).put(3);
//			}
//		});
//		when(t2.toBuffer(any(LongBuffer.class))).then(new Answer<LongBuffer>() {
//			public LongBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				LongBuffer b = invocation.getArgument(0);
//				return b.put(4).put(5).put(6);
//			}
//		});
//		
//		LongBuffer b = CoreBufferUtil.createFromAndFlipTuple3l(List.of(t1, t2));
//
//		assertEquals(6, b.capacity());
//		assertEquals(6, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createLongBuffer(6);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple4l(Tup4lR[])}
//	 * correctly creates a {@link LongBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple4l_ArrayTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup4lR t1 = mock(Tup4lR.class);
//		Tup4lR t2 = mock(Tup4lR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createLongBuffer(8)).thenCallRealMethod();
//		when(t1.toBuffer(any(LongBuffer.class))).then(new Answer<LongBuffer>() {
//			public LongBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				LongBuffer b = invocation.getArgument(0);
//				return b.put(1).put(2).put(3).put(4);
//			}
//		});
//		when(t2.toBuffer(any(LongBuffer.class))).then(new Answer<LongBuffer>() {
//			public LongBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				LongBuffer b = invocation.getArgument(0);
//				return b.put(5).put(6).put(7).put(8);
//			}
//		});
//		
//		LongBuffer b = CoreBufferUtil.createFromAndFlipTuple4l(t1, t2);
//
//		assertEquals(8, b.capacity());
//		assertEquals(8, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createLongBuffer(8);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple4l(List)}
//	 * correctly creates a {@link LongBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple4l_ListTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup4lR t1 = mock(Tup4lR.class);
//		Tup4lR t2 = mock(Tup4lR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createLongBuffer(8)).thenCallRealMethod();
//		when(t1.toBuffer(any(LongBuffer.class))).then(new Answer<LongBuffer>() {
//			public LongBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				LongBuffer b = invocation.getArgument(0);
//				return b.put(1).put(2).put(3).put(4);
//			}
//		});
//		when(t2.toBuffer(any(LongBuffer.class))).then(new Answer<LongBuffer>() {
//			public LongBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				LongBuffer b = invocation.getArgument(0);
//				return b.put(5).put(6).put(7).put(8);
//			}
//		});
//		
//		LongBuffer b = CoreBufferUtil.createFromAndFlipTuple4l(List.of(t1, t2));
//
//		assertEquals(8, b.capacity());
//		assertEquals(8, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createLongBuffer(8);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple2f(Tup2fR[])}
//	 * correctly creates a {@link FloatBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple2f_ArrayTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup2fR t1 = mock(Tup2fR.class);
//		Tup2fR t2 = mock(Tup2fR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createFloatBuffer(4)).thenCallRealMethod();
//		when(t1.toBuffer(any(FloatBuffer.class))).then(new Answer<FloatBuffer>() {
//			public FloatBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				FloatBuffer b = invocation.getArgument(0);
//				return b.put(1.0f).put(2.0f);
//			}
//		});
//		when(t2.toBuffer(any(FloatBuffer.class))).then(new Answer<FloatBuffer>() {
//			public FloatBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				FloatBuffer b = invocation.getArgument(0);
//				return b.put(3.0f).put(4.0f);
//			}
//		});
//		
//		FloatBuffer b = CoreBufferUtil.createFromAndFlipTuple2f(t1, t2);
//
//		assertEquals(4, b.capacity());
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createFloatBuffer(4);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple2f(List)}
//	 * correctly creates a {@link FloatBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple2f_ListTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup2fR t1 = mock(Tup2fR.class);
//		Tup2fR t2 = mock(Tup2fR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createFloatBuffer(4)).thenCallRealMethod();
//		when(t1.toBuffer(any(FloatBuffer.class))).then(new Answer<FloatBuffer>() {
//			public FloatBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				FloatBuffer b = invocation.getArgument(0);
//				return b.put(1.0f).put(2.0f);
//			}
//		});
//		when(t2.toBuffer(any(FloatBuffer.class))).then(new Answer<FloatBuffer>() {
//			public FloatBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				FloatBuffer b = invocation.getArgument(0);
//				return b.put(3.0f).put(4.0f);
//			}
//		});
//		
//		FloatBuffer b = CoreBufferUtil.createFromAndFlipTuple2f(List.of(t1, t2));
//
//		assertEquals(4, b.capacity());
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createFloatBuffer(4);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple3f(Tup3fR[])}
//	 * correctly creates a {@link FloatBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple3f_ArrayTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup3fR t1 = mock(Tup3fR.class);
//		Tup3fR t2 = mock(Tup3fR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createFloatBuffer(6)).thenCallRealMethod();
//		when(t1.toBuffer(any(FloatBuffer.class))).then(new Answer<FloatBuffer>() {
//			public FloatBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				FloatBuffer b = invocation.getArgument(0);
//				return b.put(1.0f).put(2.0f).put(3.0f);
//			}
//		});
//		when(t2.toBuffer(any(FloatBuffer.class))).then(new Answer<FloatBuffer>() {
//			public FloatBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				FloatBuffer b = invocation.getArgument(0);
//				return b.put(4.0f).put(5.0f).put(6.0f);
//			}
//		});
//		
//		FloatBuffer b = CoreBufferUtil.createFromAndFlipTuple3f(t1, t2);
//
//		assertEquals(6, b.capacity());
//		assertEquals(6, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createFloatBuffer(6);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple3f(List)}
//	 * correctly creates a {@link FloatBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple3f_ListTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup3fR t1 = mock(Tup3fR.class);
//		Tup3fR t2 = mock(Tup3fR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createFloatBuffer(6)).thenCallRealMethod();
//		when(t1.toBuffer(any(FloatBuffer.class))).then(new Answer<FloatBuffer>() {
//			public FloatBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				FloatBuffer b = invocation.getArgument(0);
//				return b.put(1.0f).put(2.0f).put(3.0f);
//			}
//		});
//		when(t2.toBuffer(any(FloatBuffer.class))).then(new Answer<FloatBuffer>() {
//			public FloatBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				FloatBuffer b = invocation.getArgument(0);
//				return b.put(4.0f).put(5.0f).put(6.0f);
//			}
//		});
//		
//		FloatBuffer b = CoreBufferUtil.createFromAndFlipTuple3f(List.of(t1, t2));
//
//		assertEquals(6, b.capacity());
//		assertEquals(6, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createFloatBuffer(6);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple4f(Tup4fR[])}
//	 * correctly creates a {@link FloatBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple4f_ArrayTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup4fR t1 = mock(Tup4fR.class);
//		Tup4fR t2 = mock(Tup4fR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createFloatBuffer(8)).thenCallRealMethod();
//		when(t1.toBuffer(any(FloatBuffer.class))).then(new Answer<FloatBuffer>() {
//			public FloatBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				FloatBuffer b = invocation.getArgument(0);
//				return b.put(1.0f).put(2.0f).put(3.0f).put(4.0f);
//			}
//		});
//		when(t2.toBuffer(any(FloatBuffer.class))).then(new Answer<FloatBuffer>() {
//			public FloatBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				FloatBuffer b = invocation.getArgument(0);
//				return b.put(5.0f).put(6.0f).put(7.0f).put(8.0f);
//			}
//		});
//		
//		FloatBuffer b = CoreBufferUtil.createFromAndFlipTuple4f(t1, t2);
//
//		assertEquals(8, b.capacity());
//		assertEquals(8, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createFloatBuffer(8);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple4f(List)}
//	 * correctly creates a {@link FloatBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple4f_ListTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup4fR t1 = mock(Tup4fR.class);
//		Tup4fR t2 = mock(Tup4fR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createFloatBuffer(8)).thenCallRealMethod();
//		when(t1.toBuffer(any(FloatBuffer.class))).then(new Answer<FloatBuffer>() {
//			public FloatBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				FloatBuffer b = invocation.getArgument(0);
//				return b.put(1.0f).put(2.0f).put(3.0f).put(4.0f);
//			}
//		});
//		when(t2.toBuffer(any(FloatBuffer.class))).then(new Answer<FloatBuffer>() {
//			public FloatBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				FloatBuffer b = invocation.getArgument(0);
//				return b.put(5.0f).put(6.0f).put(7.0f).put(8.0f);
//			}
//		});
//		
//		FloatBuffer b = CoreBufferUtil.createFromAndFlipTuple4f(List.of(t1, t2));
//
//		assertEquals(8, b.capacity());
//		assertEquals(8, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createFloatBuffer(8);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple2d(Tup2dR[])}
//	 * correctly creates a {@link DoubleBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple2d_ArrayTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup2dR t1 = mock(Tup2dR.class);
//		Tup2dR t2 = mock(Tup2dR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createDoubleBuffer(4)).thenCallRealMethod();
//		when(t1.toBuffer(any(DoubleBuffer.class))).then(new Answer<DoubleBuffer>() {
//			public DoubleBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				DoubleBuffer b = invocation.getArgument(0);
//				return b.put(1.0).put(2.0);
//			}
//		});
//		when(t2.toBuffer(any(DoubleBuffer.class))).then(new Answer<DoubleBuffer>() {
//			public DoubleBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				DoubleBuffer b = invocation.getArgument(0);
//				return b.put(3.0).put(4.0);
//			}
//		});
//		
//		DoubleBuffer b = CoreBufferUtil.createFromAndFlipTuple2d(t1, t2);
//
//		assertEquals(4, b.capacity());
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createDoubleBuffer(4);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple2d(List)}
//	 * correctly creates a {@link DoubleBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple2d_ListTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup2dR t1 = mock(Tup2dR.class);
//		Tup2dR t2 = mock(Tup2dR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createDoubleBuffer(4)).thenCallRealMethod();
//		when(t1.toBuffer(any(DoubleBuffer.class))).then(new Answer<DoubleBuffer>() {
//			public DoubleBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				DoubleBuffer b = invocation.getArgument(0);
//				return b.put(1.0).put(2.0);
//			}
//		});
//		when(t2.toBuffer(any(DoubleBuffer.class))).then(new Answer<DoubleBuffer>() {
//			public DoubleBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				DoubleBuffer b = invocation.getArgument(0);
//				return b.put(3.0).put(4.0);
//			}
//		});
//		
//		DoubleBuffer b = CoreBufferUtil.createFromAndFlipTuple2d(List.of(t1, t2));
//
//		assertEquals(4, b.capacity());
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createDoubleBuffer(4);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple3d(Tup3dR[])}
//	 * correctly creates a {@link DoubleBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple3d_ArrayTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup3dR t1 = mock(Tup3dR.class);
//		Tup3dR t2 = mock(Tup3dR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createDoubleBuffer(6)).thenCallRealMethod();
//		when(t1.toBuffer(any(DoubleBuffer.class))).then(new Answer<DoubleBuffer>() {
//			public DoubleBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				DoubleBuffer b = invocation.getArgument(0);
//				return b.put(1.0).put(2.0).put(3.0);
//			}
//		});
//		when(t2.toBuffer(any(DoubleBuffer.class))).then(new Answer<DoubleBuffer>() {
//			public DoubleBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				DoubleBuffer b = invocation.getArgument(0);
//				return b.put(4.0).put(5.0).put(6.0);
//			}
//		});
//		
//		DoubleBuffer b = CoreBufferUtil.createFromAndFlipTuple3d(t1, t2);
//
//		assertEquals(6, b.capacity());
//		assertEquals(6, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createDoubleBuffer(6);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple3d(List)}
//	 * correctly creates a {@link DoubleBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple3d_ListTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup3dR t1 = mock(Tup3dR.class);
//		Tup3dR t2 = mock(Tup3dR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createDoubleBuffer(6)).thenCallRealMethod();
//		when(t1.toBuffer(any(DoubleBuffer.class))).then(new Answer<DoubleBuffer>() {
//			public DoubleBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				DoubleBuffer b = invocation.getArgument(0);
//				return b.put(1.0).put(2.0).put(3.0);
//			}
//		});
//		when(t2.toBuffer(any(DoubleBuffer.class))).then(new Answer<DoubleBuffer>() {
//			public DoubleBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				DoubleBuffer b = invocation.getArgument(0);
//				return b.put(4.0).put(5.0).put(6.0);
//			}
//		});
//		
//		DoubleBuffer b = CoreBufferUtil.createFromAndFlipTuple3d(List.of(t1, t2));
//
//		assertEquals(6, b.capacity());
//		assertEquals(6, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createDoubleBuffer(6);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple4d(Tup4dR[])}
//	 * correctly creates a {@link DoubleBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple4d_ArrayTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup4dR t1 = mock(Tup4dR.class);
//		Tup4dR t2 = mock(Tup4dR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createDoubleBuffer(8)).thenCallRealMethod();
//		when(t1.toBuffer(any(DoubleBuffer.class))).then(new Answer<DoubleBuffer>() {
//			public DoubleBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				DoubleBuffer b = invocation.getArgument(0);
//				return b.put(1.0).put(2.0).put(3.0).put(4.0);
//			}
//		});
//		when(t2.toBuffer(any(DoubleBuffer.class))).then(new Answer<DoubleBuffer>() {
//			public DoubleBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				DoubleBuffer b = invocation.getArgument(0);
//				return b.put(5.0).put(6.0).put(7.0).put(8.0);
//			}
//		});
//		
//		DoubleBuffer b = CoreBufferUtil.createFromAndFlipTuple4d(t1, t2);
//
//		assertEquals(8, b.capacity());
//		assertEquals(8, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createDoubleBuffer(8);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#createFromAndFlipTuple4d(List)}
//	 * correctly creates a {@link DoubleBuffer} via the factory and puts the entries in it.
//	 */
//	@Test
//	void createFromAndFlipTuple4d_ListTest()
//	{
//		TestBufferFactory factory = mock(TestBufferFactory.class);
//		
//		Tup4dR t1 = mock(Tup4dR.class);
//		Tup4dR t2 = mock(Tup4dR.class);
//		
//		CoreBufferUtil.BUFFER_FACTORY = factory;
//		
//		when(factory.createDoubleBuffer(8)).thenCallRealMethod();
//		when(t1.toBuffer(any(DoubleBuffer.class))).then(new Answer<DoubleBuffer>() {
//			public DoubleBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				DoubleBuffer b = invocation.getArgument(0);
//				return b.put(1.0).put(2.0).put(3.0).put(4.0);
//			}
//		});
//		when(t2.toBuffer(any(DoubleBuffer.class))).then(new Answer<DoubleBuffer>() {
//			public DoubleBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				DoubleBuffer b = invocation.getArgument(0);
//				return b.put(5.0).put(6.0).put(7.0).put(8.0);
//			}
//		});
//		
//		DoubleBuffer b = CoreBufferUtil.createFromAndFlipTuple4d(List.of(t1, t2));
//
//		assertEquals(8, b.capacity());
//		assertEquals(8, b.limit());
//		assertEquals(0, b.position());
//		
//		verify(factory).createDoubleBuffer(8);
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(factory, t1, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putByte(ByteBuffer, byte[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putByte_ArrayTest()
//	{
//		ByteBuffer b = mock(ByteBuffer.class);
//
//		when(b.put(bArray(1, 2, 3, 4))).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putByte(b, bArray(1, 2, 3, 4)));
//
//		verify(b).put(bArray(1, 2, 3, 4));
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putByte(ByteBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putByte_ListTest()
//	{
//		ByteBuffer b = mock(ByteBuffer.class);
//		
//		when(b.put(b(1))).thenReturn(b);
//		when(b.put(b(2))).thenReturn(b);
//		when(b.put(b(3))).thenReturn(b);
//		when(b.put(b(4))).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putByte(b, List.of(b(1), b(2), b(3), b(4))));
//
//		verify(b).put(b(1));
//		verify(b).put(b(2));
//		verify(b).put(b(3));
//		verify(b).put(b(4));
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putShort(ShortBuffer, short[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putShort_ArrayTest()
//	{
//		ShortBuffer b = mock(ShortBuffer.class);
//
//		when(b.put(sArray(1, 2, 3, 4))).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putShort(b, sArray(1, 2, 3, 4)));
//
//		verify(b).put(sArray(1, 2, 3, 4));
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putShort(ShortBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putShort_ListTest()
//	{
//		ShortBuffer b = mock(ShortBuffer.class);
//		
//		when(b.put(s(1))).thenReturn(b);
//		when(b.put(s(2))).thenReturn(b);
//		when(b.put(s(3))).thenReturn(b);
//		when(b.put(s(4))).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putShort(b, List.of(s(1), s(2), s(3), s(4))));
//
//		verify(b).put(s(1));
//		verify(b).put(s(2));
//		verify(b).put(s(3));
//		verify(b).put(s(4));
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putInt(IntBuffer, int[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putInt_ArrayTest()
//	{
//		IntBuffer b = mock(IntBuffer.class);
//
//		when(b.put(new int[] {1, 2, 3, 4})).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putInt(b, new int[] {1, 2, 3, 4}));
//
//		verify(b).put(new int[] {1, 2, 3, 4});
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putInt(IntBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putInt_ListTest()
//	{
//		IntBuffer b = mock(IntBuffer.class);
//		
//		when(b.put(1)).thenReturn(b);
//		when(b.put(2)).thenReturn(b);
//		when(b.put(3)).thenReturn(b);
//		when(b.put(4)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putInt(b, List.of(1, 2, 3, 4)));
//
//		verify(b).put(1);
//		verify(b).put(2);
//		verify(b).put(3);
//		verify(b).put(4);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putLong(LongBuffer, long[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putLong_ArrayTest()
//	{
//		LongBuffer b = mock(LongBuffer.class);
//
//		when(b.put(new long[] {1l, 2l, 3l, 4l})).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putLong(b, new long[] {1l, 2l, 3l, 4l}));
//
//		verify(b).put(new long[] {1l, 2l, 3l, 4l});
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putLong(LongBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putLong_ListTest()
//	{
//		LongBuffer b = mock(LongBuffer.class);
//		
//		when(b.put(1l)).thenReturn(b);
//		when(b.put(2l)).thenReturn(b);
//		when(b.put(3l)).thenReturn(b);
//		when(b.put(4l)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putLong(b, List.of(1l, 2l, 3l, 4l)));
//
//		verify(b).put(1l);
//		verify(b).put(2l);
//		verify(b).put(3l);
//		verify(b).put(4l);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putFloat(FloatBuffer, float[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putFloat_ArrayTest()
//	{
//		FloatBuffer b = mock(FloatBuffer.class);
//
//		when(b.put(new float[] {1.0f, 2.0f, 3.0f, 4.0f})).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putFloat(b, new float[] {1.0f, 2.0f, 3.0f, 4.0f}));
//
//		verify(b).put(new float[] {1.0f, 2.0f, 3.0f, 4.0f});
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putFloat(FloatBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putFloat_ListTest()
//	{
//		FloatBuffer b = mock(FloatBuffer.class);
//		
//		when(b.put(1.0f)).thenReturn(b);
//		when(b.put(2.0f)).thenReturn(b);
//		when(b.put(3.0f)).thenReturn(b);
//		when(b.put(4.0f)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putFloat(b, List.of(1.0f, 2.0f, 3.0f, 4.0f)));
//
//		verify(b).put(1.0f);
//		verify(b).put(2.0f);
//		verify(b).put(3.0f);
//		verify(b).put(4.0f);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putDouble(DoubleBuffer, double[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putDouble_ArrayTest()
//	{
//		DoubleBuffer b = mock(DoubleBuffer.class);
//
//		when(b.put(new double[] {1.0, 2.0, 3.0, 4.0})).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putDouble(b, new double[] {1.0, 2.0, 3.0, 4.0}));
//
//		verify(b).put(new double[] {1.0, 2.0, 3.0, 4.0});
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putDouble(DoubleBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putDouble_ListTest()
//	{
//		DoubleBuffer b = mock(DoubleBuffer.class);
//		
//		when(b.put(1.0)).thenReturn(b);
//		when(b.put(2.0)).thenReturn(b);
//		when(b.put(3.0)).thenReturn(b);
//		when(b.put(4.0)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putDouble(b, List.of(1.0, 2.0, 3.0, 4.0)));
//
//		verify(b).put(1.0);
//		verify(b).put(2.0);
//		verify(b).put(3.0);
//		verify(b).put(4.0);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple2b(ByteBuffer, Tup2bR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple2b_ArrayTest()
//	{
//		ByteBuffer b = mock(ByteBuffer.class);
//		Tup2bR t1 = mock(Tup2bR.class);
//		Tup2bR t2 = mock(Tup2bR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple2b(b, t1, t2));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple2b(ByteBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple2b_ListTest()
//	{
//		ByteBuffer b = mock(ByteBuffer.class);
//		Tup2bR t1 = mock(Tup2bR.class);
//		Tup2bR t2 = mock(Tup2bR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple2b(b, List.of(t1, t2)));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple3b(ByteBuffer, Tup3bR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple3b_ArrayTest()
//	{
//		ByteBuffer b = mock(ByteBuffer.class);
//		Tup3bR t1 = mock(Tup3bR.class);
//		Tup3bR t2 = mock(Tup3bR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple3b(b, t1, t2));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple3b(ByteBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple3b_ListTest()
//	{
//		ByteBuffer b = mock(ByteBuffer.class);
//		Tup3bR t1 = mock(Tup3bR.class);
//		Tup3bR t2 = mock(Tup3bR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple3b(b, List.of(t1, t2)));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple4b(ByteBuffer, Tup4bR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple4b_ArrayTest()
//	{
//		ByteBuffer b = mock(ByteBuffer.class);
//		Tup4bR t1 = mock(Tup4bR.class);
//		Tup4bR t2 = mock(Tup4bR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple4b(b, t1, t2));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple4b(ByteBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple4b_ListTest()
//	{
//		ByteBuffer b = mock(ByteBuffer.class);
//		Tup4bR t1 = mock(Tup4bR.class);
//		Tup4bR t2 = mock(Tup4bR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple4b(b, List.of(t1, t2)));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple2s(ShortBuffer, Tup2sR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple2s_ArrayTest()
//	{
//		ShortBuffer b = mock(ShortBuffer.class);
//		Tup2sR t1 = mock(Tup2sR.class);
//		Tup2sR t2 = mock(Tup2sR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple2s(b, t1, t2));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple2s(ShortBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple2s_ListTest()
//	{
//		ShortBuffer b = mock(ShortBuffer.class);
//		Tup2sR t1 = mock(Tup2sR.class);
//		Tup2sR t2 = mock(Tup2sR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple2s(b, List.of(t1, t2)));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple3s(ShortBuffer, Tup3sR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple3s_ArrayTest()
//	{
//		ShortBuffer b = mock(ShortBuffer.class);
//		Tup3sR t1 = mock(Tup3sR.class);
//		Tup3sR t2 = mock(Tup3sR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple3s(b, t1, t2));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple3s(ShortBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple3s_ListTest()
//	{
//		ShortBuffer b = mock(ShortBuffer.class);
//		Tup3sR t1 = mock(Tup3sR.class);
//		Tup3sR t2 = mock(Tup3sR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple3s(b, List.of(t1, t2)));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple4s(ShortBuffer, Tup4sR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple4s_ArrayTest()
//	{
//		ShortBuffer b = mock(ShortBuffer.class);
//		Tup4sR t1 = mock(Tup4sR.class);
//		Tup4sR t2 = mock(Tup4sR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple4s(b, t1, t2));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple4s(ShortBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple4s_ListTest()
//	{
//		ShortBuffer b = mock(ShortBuffer.class);
//		Tup4sR t1 = mock(Tup4sR.class);
//		Tup4sR t2 = mock(Tup4sR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple4s(b, List.of(t1, t2)));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple2i(IntBuffer, Tup2iR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple2i_ArrayTest()
//	{
//		IntBuffer b = mock(IntBuffer.class);
//		Tup2iR t1 = mock(Tup2iR.class);
//		Tup2iR t2 = mock(Tup2iR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple2i(b, t1, t2));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple2i(IntBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple2i_ListTest()
//	{
//		IntBuffer b = mock(IntBuffer.class);
//		Tup2iR t1 = mock(Tup2iR.class);
//		Tup2iR t2 = mock(Tup2iR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple2i(b, List.of(t1, t2)));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple3i(IntBuffer, Tup3iR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple3i_ArrayTest()
//	{
//		IntBuffer b = mock(IntBuffer.class);
//		Tup3iR t1 = mock(Tup3iR.class);
//		Tup3iR t2 = mock(Tup3iR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple3i(b, t1, t2));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple3i(IntBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple3i_ListTest()
//	{
//		IntBuffer b = mock(IntBuffer.class);
//		Tup3iR t1 = mock(Tup3iR.class);
//		Tup3iR t2 = mock(Tup3iR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple3i(b, List.of(t1, t2)));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple4i(IntBuffer, Tup4iR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple4i_ArrayTest()
//	{
//		IntBuffer b = mock(IntBuffer.class);
//		Tup4iR t1 = mock(Tup4iR.class);
//		Tup4iR t2 = mock(Tup4iR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple4i(b, t1, t2));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple4i(IntBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple4i_ListTest()
//	{
//		IntBuffer b = mock(IntBuffer.class);
//		Tup4iR t1 = mock(Tup4iR.class);
//		Tup4iR t2 = mock(Tup4iR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple4i(b, List.of(t1, t2)));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple2l(LongBuffer, Tup2lR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple2l_ArrayTest()
//	{
//		LongBuffer b = mock(LongBuffer.class);
//		Tup2lR t1 = mock(Tup2lR.class);
//		Tup2lR t2 = mock(Tup2lR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple2l(b, t1, t2));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple2l(LongBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple2l_ListTest()
//	{
//		LongBuffer b = mock(LongBuffer.class);
//		Tup2lR t1 = mock(Tup2lR.class);
//		Tup2lR t2 = mock(Tup2lR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple2l(b, List.of(t1, t2)));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple3l(LongBuffer, Tup3lR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple3l_ArrayTest()
//	{
//		LongBuffer b = mock(LongBuffer.class);
//		Tup3lR t1 = mock(Tup3lR.class);
//		Tup3lR t2 = mock(Tup3lR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple3l(b, t1, t2));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple3l(LongBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple3l_ListTest()
//	{
//		LongBuffer b = mock(LongBuffer.class);
//		Tup3lR t1 = mock(Tup3lR.class);
//		Tup3lR t2 = mock(Tup3lR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple3l(b, List.of(t1, t2)));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple4l(LongBuffer, Tup4lR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple4l_ArrayTest()
//	{
//		LongBuffer b = mock(LongBuffer.class);
//		Tup4lR t1 = mock(Tup4lR.class);
//		Tup4lR t2 = mock(Tup4lR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple4l(b, t1, t2));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple4l(LongBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple4l_ListTest()
//	{
//		LongBuffer b = mock(LongBuffer.class);
//		Tup4lR t1 = mock(Tup4lR.class);
//		Tup4lR t2 = mock(Tup4lR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple4l(b, List.of(t1, t2)));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple2f(FloatBuffer, Tup2fR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple2f_ArrayTest()
//	{
//		FloatBuffer b = mock(FloatBuffer.class);
//		Tup2fR t1 = mock(Tup2fR.class);
//		Tup2fR t2 = mock(Tup2fR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple2f(b, t1, t2));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple2f(FloatBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple2f_ListTest()
//	{
//		FloatBuffer b = mock(FloatBuffer.class);
//		Tup2fR t1 = mock(Tup2fR.class);
//		Tup2fR t2 = mock(Tup2fR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple2f(b, List.of(t1, t2)));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple3f(FloatBuffer, Tup3fR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple3f_ArrayTest()
//	{
//		FloatBuffer b = mock(FloatBuffer.class);
//		Tup3fR t1 = mock(Tup3fR.class);
//		Tup3fR t2 = mock(Tup3fR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple3f(b, t1, t2));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple3f(FloatBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple3f_ListTest()
//	{
//		FloatBuffer b = mock(FloatBuffer.class);
//		Tup3fR t1 = mock(Tup3fR.class);
//		Tup3fR t2 = mock(Tup3fR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple3f(b, List.of(t1, t2)));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple4f(FloatBuffer, Tup4fR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple4f_ArrayTest()
//	{
//		FloatBuffer b = mock(FloatBuffer.class);
//		Tup4fR t1 = mock(Tup4fR.class);
//		Tup4fR t2 = mock(Tup4fR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple4f(b, t1, t2));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple4f(FloatBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple4f_ListTest()
//	{
//		FloatBuffer b = mock(FloatBuffer.class);
//		Tup4fR t1 = mock(Tup4fR.class);
//		Tup4fR t2 = mock(Tup4fR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple4f(b, List.of(t1, t2)));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple2d(DoubleBuffer, Tup2dR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple2d_ArrayTest()
//	{
//		DoubleBuffer b = mock(DoubleBuffer.class);
//		Tup2dR t1 = mock(Tup2dR.class);
//		Tup2dR t2 = mock(Tup2dR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple2d(b, t1, t2));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple2d(DoubleBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple2d_ListTest()
//	{
//		DoubleBuffer b = mock(DoubleBuffer.class);
//		Tup2dR t1 = mock(Tup2dR.class);
//		Tup2dR t2 = mock(Tup2dR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple2d(b, List.of(t1, t2)));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple3d(DoubleBuffer, Tup3dR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple3d_ArrayTest()
//	{
//		DoubleBuffer b = mock(DoubleBuffer.class);
//		Tup3dR t1 = mock(Tup3dR.class);
//		Tup3dR t2 = mock(Tup3dR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple3d(b, t1, t2));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple3d(DoubleBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple3d_ListTest()
//	{
//		DoubleBuffer b = mock(DoubleBuffer.class);
//		Tup3dR t1 = mock(Tup3dR.class);
//		Tup3dR t2 = mock(Tup3dR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple3d(b, List.of(t1, t2)));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple4d(DoubleBuffer, Tup4dR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple4d_ArrayTest()
//	{
//		DoubleBuffer b = mock(DoubleBuffer.class);
//		Tup4dR t1 = mock(Tup4dR.class);
//		Tup4dR t2 = mock(Tup4dR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple4d(b, t1, t2));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putTuple4d(DoubleBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putTuple4d_ListTest()
//	{
//		DoubleBuffer b = mock(DoubleBuffer.class);
//		Tup4dR t1 = mock(Tup4dR.class);
//		Tup4dR t2 = mock(Tup4dR.class);
//		
//		when(t1.toBuffer(b)).thenReturn(b);
//		when(t2.toBuffer(b)).thenReturn(b);
//		
//		assertEquals(b, CoreBufferUtil.putTuple4d(b, List.of(t1, t2)));
//
//		verify(t1).toBuffer(b);
//		verify(t2).toBuffer(b);
//		
//		verifyNoMoreInteractions(b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipByte(ByteBuffer, byte[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipByte_ArrayTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		ByteBuffer b = factory.createByteBuffer(8);
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipByte(b, bArray(1, 2, 3, 4)));
//
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipByte(ByteBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipByte_ListTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		ByteBuffer b = factory.createByteBuffer(8);
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipByte(b, List.of(b(1), b(2), b(3), b(4))));
//
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipShort(ShortBuffer, short[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipShort_ArrayTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		ShortBuffer b = factory.createShortBuffer(8);
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipShort(b, sArray(1, 2, 3, 4)));
//
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipShort(ShortBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipShort_ListTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		ShortBuffer b = factory.createShortBuffer(8);
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipShort(b, List.of(s(1), s(2), s(3), s(4))));
//
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipInt(IntBuffer, int[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipInt_ArrayTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		IntBuffer b = factory.createIntBuffer(8);
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipInt(b, 1, 2, 3, 4));
//
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipInt(IntBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipInt_ListTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		IntBuffer b = factory.createIntBuffer(8);
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipInt(b, List.of(1, 2, 3, 4)));
//
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipLong(LongBuffer, long[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipLong_ArrayTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		LongBuffer b = factory.createLongBuffer(8);
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipLong(b, 1l, 2l, 3l, 4l));
//
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipLong(LongBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipLong_ListTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		LongBuffer b = factory.createLongBuffer(8);
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipLong(b, List.of(1l, 2l, 3l, 4l)));
//
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipFloat(FloatBuffer, float[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipFloat_ArrayTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		FloatBuffer b = factory.createFloatBuffer(8);
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipFloat(b, 1.0f, 2.0f, 3.0f, 4.0f));
//
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipFloat(FloatBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipFloat_ListTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		FloatBuffer b = factory.createFloatBuffer(8);
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipFloat(b, List.of(1.0f, 2.0f, 3.0f, 4.0f)));
//
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipDouble(DoubleBuffer, double[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipDouble_ArrayTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		DoubleBuffer b = factory.createDoubleBuffer(8);
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipDouble(b, 1.0, 2.0, 3.0, 4.0));
//
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipDouble(DoubleBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipDouble_ListTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		DoubleBuffer b = factory.createDoubleBuffer(8);
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipDouble(b, List.of(1.0, 2.0, 3.0, 4.0)));
//
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple2b(ByteBuffer, Tup2bR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple2b_ArrayTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup2bR t1 = mock(Tup2bR.class);
//		Tup2bR t2 = mock(Tup2bR.class);
//
//		ByteBuffer b = factory.createByteBuffer(8);
//		
//		when(t1.toBuffer(any(ByteBuffer.class))).then(new Answer<ByteBuffer>() {
//			public ByteBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ByteBuffer b = invocation.getArgument(0);
//				return b.put(b(1)).put(b(2));
//			}
//		});
//		when(t2.toBuffer(any(ByteBuffer.class))).then(new Answer<ByteBuffer>() {
//			public ByteBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ByteBuffer b = invocation.getArgument(0);
//				return b.put(b(3)).put(b(4));
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple2b(b, t1, t2));
//
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple2b(ByteBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple2b_ListTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup2bR t1 = mock(Tup2bR.class);
//		Tup2bR t2 = mock(Tup2bR.class);
//
//		ByteBuffer b = factory.createByteBuffer(8);
//		
//		when(t1.toBuffer(any(ByteBuffer.class))).then(new Answer<ByteBuffer>() {
//			public ByteBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ByteBuffer b = invocation.getArgument(0);
//				return b.put(b(1)).put(b(2));
//			}
//		});
//		when(t2.toBuffer(any(ByteBuffer.class))).then(new Answer<ByteBuffer>() {
//			public ByteBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ByteBuffer b = invocation.getArgument(0);
//				return b.put(b(3)).put(b(4));
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple2b(b, List.of(t1, t2)));
//
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple3b(ByteBuffer, Tup3bR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple3b_ArrayTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup3bR t1 = mock(Tup3bR.class);
//		Tup3bR t2 = mock(Tup3bR.class);
//
//		ByteBuffer b = factory.createByteBuffer(8);
//		
//		when(t1.toBuffer(any(ByteBuffer.class))).then(new Answer<ByteBuffer>() {
//			public ByteBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ByteBuffer b = invocation.getArgument(0);
//				return b.put(b(1)).put(b(2)).put(b(3));
//			}
//		});
//		when(t2.toBuffer(any(ByteBuffer.class))).then(new Answer<ByteBuffer>() {
//			public ByteBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ByteBuffer b = invocation.getArgument(0);
//				return b.put(b(4)).put(b(5)).put(b(6));
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple3b(b, t1, t2));
//
//		assertEquals(6, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple3b(ByteBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple3b_ListTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup3bR t1 = mock(Tup3bR.class);
//		Tup3bR t2 = mock(Tup3bR.class);
//
//		ByteBuffer b = factory.createByteBuffer(8);
//		
//		when(t1.toBuffer(any(ByteBuffer.class))).then(new Answer<ByteBuffer>() {
//			public ByteBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ByteBuffer b = invocation.getArgument(0);
//				return b.put(b(1)).put(b(2)).put(b(3));
//			}
//		});
//		when(t2.toBuffer(any(ByteBuffer.class))).then(new Answer<ByteBuffer>() {
//			public ByteBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ByteBuffer b = invocation.getArgument(0);
//				return b.put(b(4)).put(b(5)).put(b(6));
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple3b(b, List.of(t1, t2)));
//
//		assertEquals(6, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple4b(ByteBuffer, Tup4bR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple4b_ArrayTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup4bR t1 = mock(Tup4bR.class);
//		Tup4bR t2 = mock(Tup4bR.class);
//
//		ByteBuffer b = factory.createByteBuffer(8);
//		
//		when(t1.toBuffer(any(ByteBuffer.class))).then(new Answer<ByteBuffer>() {
//			public ByteBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ByteBuffer b = invocation.getArgument(0);
//				return b.put(b(1)).put(b(2)).put(b(3)).put(b(4));
//			}
//		});
//		when(t2.toBuffer(any(ByteBuffer.class))).then(new Answer<ByteBuffer>() {
//			public ByteBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ByteBuffer b = invocation.getArgument(0);
//				return b.put(b(5)).put(b(6)).put(b(7)).put(b(8));
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple4b(b, t1, t2));
//
//		assertEquals(8, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple4b(ByteBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple4b_ListTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup4bR t1 = mock(Tup4bR.class);
//		Tup4bR t2 = mock(Tup4bR.class);
//
//		ByteBuffer b = factory.createByteBuffer(8);
//		
//		when(t1.toBuffer(any(ByteBuffer.class))).then(new Answer<ByteBuffer>() {
//			public ByteBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ByteBuffer b = invocation.getArgument(0);
//				return b.put(b(1)).put(b(2)).put(b(3)).put(b(4));
//			}
//		});
//		when(t2.toBuffer(any(ByteBuffer.class))).then(new Answer<ByteBuffer>() {
//			public ByteBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ByteBuffer b = invocation.getArgument(0);
//				return b.put(b(5)).put(b(6)).put(b(7)).put(b(8));
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple4b(b, List.of(t1, t2)));
//
//		assertEquals(8, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple2s(ShortBuffer, Tup2sR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple2s_ArrayTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup2sR t1 = mock(Tup2sR.class);
//		Tup2sR t2 = mock(Tup2sR.class);
//
//		ShortBuffer b = factory.createShortBuffer(8);
//		
//		when(t1.toBuffer(any(ShortBuffer.class))).then(new Answer<ShortBuffer>() {
//			public ShortBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ShortBuffer b = invocation.getArgument(0);
//				return b.put(s(1)).put(s(2));
//			}
//		});
//		when(t2.toBuffer(any(ShortBuffer.class))).then(new Answer<ShortBuffer>() {
//			public ShortBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ShortBuffer b = invocation.getArgument(0);
//				return b.put(s(3)).put(s(4));
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple2s(b, t1, t2));
//
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple2s(ShortBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple2s_ListTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup2sR t1 = mock(Tup2sR.class);
//		Tup2sR t2 = mock(Tup2sR.class);
//
//		ShortBuffer b = factory.createShortBuffer(8);
//		
//		when(t1.toBuffer(any(ShortBuffer.class))).then(new Answer<ShortBuffer>() {
//			public ShortBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ShortBuffer b = invocation.getArgument(0);
//				return b.put(s(1)).put(s(2));
//			}
//		});
//		when(t2.toBuffer(any(ShortBuffer.class))).then(new Answer<ShortBuffer>() {
//			public ShortBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ShortBuffer b = invocation.getArgument(0);
//				return b.put(s(3)).put(s(4));
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple2s(b, List.of(t1, t2)));
//
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple3s(ShortBuffer, Tup3sR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple3s_ArrayTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup3sR t1 = mock(Tup3sR.class);
//		Tup3sR t2 = mock(Tup3sR.class);
//
//		ShortBuffer b = factory.createShortBuffer(8);
//		
//		when(t1.toBuffer(any(ShortBuffer.class))).then(new Answer<ShortBuffer>() {
//			public ShortBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ShortBuffer b = invocation.getArgument(0);
//				return b.put(s(1)).put(s(2)).put(s(3));
//			}
//		});
//		when(t2.toBuffer(any(ShortBuffer.class))).then(new Answer<ShortBuffer>() {
//			public ShortBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ShortBuffer b = invocation.getArgument(0);
//				return b.put(s(4)).put(s(5)).put(s(6));
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple3s(b, t1, t2));
//
//		assertEquals(6, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple3s(ShortBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple3s_ListTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup3sR t1 = mock(Tup3sR.class);
//		Tup3sR t2 = mock(Tup3sR.class);
//
//		ShortBuffer b = factory.createShortBuffer(8);
//		
//		when(t1.toBuffer(any(ShortBuffer.class))).then(new Answer<ShortBuffer>() {
//			public ShortBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ShortBuffer b = invocation.getArgument(0);
//				return b.put(s(1)).put(s(2)).put(s(3));
//			}
//		});
//		when(t2.toBuffer(any(ShortBuffer.class))).then(new Answer<ShortBuffer>() {
//			public ShortBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ShortBuffer b = invocation.getArgument(0);
//				return b.put(s(4)).put(s(5)).put(s(6));
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple3s(b, List.of(t1, t2)));
//
//		assertEquals(6, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple4s(ShortBuffer, Tup4sR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple4s_ArrayTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup4sR t1 = mock(Tup4sR.class);
//		Tup4sR t2 = mock(Tup4sR.class);
//
//		ShortBuffer b = factory.createShortBuffer(8);
//		
//		when(t1.toBuffer(any(ShortBuffer.class))).then(new Answer<ShortBuffer>() {
//			public ShortBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ShortBuffer b = invocation.getArgument(0);
//				return b.put(s(1)).put(s(2)).put(s(3)).put(s(4));
//			}
//		});
//		when(t2.toBuffer(any(ShortBuffer.class))).then(new Answer<ShortBuffer>() {
//			public ShortBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ShortBuffer b = invocation.getArgument(0);
//				return b.put(s(5)).put(s(6)).put(s(7)).put(s(8));
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple4s(b, t1, t2));
//
//		assertEquals(8, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple4s(ShortBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple4s_ListTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup4sR t1 = mock(Tup4sR.class);
//		Tup4sR t2 = mock(Tup4sR.class);
//
//		ShortBuffer b = factory.createShortBuffer(8);
//		
//		when(t1.toBuffer(any(ShortBuffer.class))).then(new Answer<ShortBuffer>() {
//			public ShortBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ShortBuffer b = invocation.getArgument(0);
//				return b.put(s(1)).put(s(2)).put(s(3)).put(s(4));
//			}
//		});
//		when(t2.toBuffer(any(ShortBuffer.class))).then(new Answer<ShortBuffer>() {
//			public ShortBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				ShortBuffer b = invocation.getArgument(0);
//				return b.put(s(5)).put(s(6)).put(s(7)).put(s(8));
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple4s(b, List.of(t1, t2)));
//
//		assertEquals(8, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple2i(IntBuffer, Tup2iR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple2i_ArrayTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup2iR t1 = mock(Tup2iR.class);
//		Tup2iR t2 = mock(Tup2iR.class);
//
//		IntBuffer b = factory.createIntBuffer(8);
//		
//		when(t1.toBuffer(any(IntBuffer.class))).then(new Answer<IntBuffer>() {
//			public IntBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				IntBuffer b = invocation.getArgument(0);
//				return b.put(1).put(2);
//			}
//		});
//		when(t2.toBuffer(any(IntBuffer.class))).then(new Answer<IntBuffer>() {
//			public IntBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				IntBuffer b = invocation.getArgument(0);
//				return b.put(3).put(4);
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple2i(b, t1, t2));
//
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple2i(IntBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple2i_ListTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup2iR t1 = mock(Tup2iR.class);
//		Tup2iR t2 = mock(Tup2iR.class);
//
//		IntBuffer b = factory.createIntBuffer(8);
//		
//		when(t1.toBuffer(any(IntBuffer.class))).then(new Answer<IntBuffer>() {
//			public IntBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				IntBuffer b = invocation.getArgument(0);
//				return b.put(1).put(2);
//			}
//		});
//		when(t2.toBuffer(any(IntBuffer.class))).then(new Answer<IntBuffer>() {
//			public IntBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				IntBuffer b = invocation.getArgument(0);
//				return b.put(3).put(4);
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple2i(b, List.of(t1, t2)));
//
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple3i(IntBuffer, Tup3iR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple3i_ArrayTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup3iR t1 = mock(Tup3iR.class);
//		Tup3iR t2 = mock(Tup3iR.class);
//
//		IntBuffer b = factory.createIntBuffer(8);
//		
//		when(t1.toBuffer(any(IntBuffer.class))).then(new Answer<IntBuffer>() {
//			public IntBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				IntBuffer b = invocation.getArgument(0);
//				return b.put(1).put(2).put(3);
//			}
//		});
//		when(t2.toBuffer(any(IntBuffer.class))).then(new Answer<IntBuffer>() {
//			public IntBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				IntBuffer b = invocation.getArgument(0);
//				return b.put(4).put(5).put(6);
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple3i(b, t1, t2));
//
//		assertEquals(6, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple3i(IntBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple3i_ListTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup3iR t1 = mock(Tup3iR.class);
//		Tup3iR t2 = mock(Tup3iR.class);
//
//		IntBuffer b = factory.createIntBuffer(8);
//		
//		when(t1.toBuffer(any(IntBuffer.class))).then(new Answer<IntBuffer>() {
//			public IntBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				IntBuffer b = invocation.getArgument(0);
//				return b.put(1).put(2).put(3);
//			}
//		});
//		when(t2.toBuffer(any(IntBuffer.class))).then(new Answer<IntBuffer>() {
//			public IntBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				IntBuffer b = invocation.getArgument(0);
//				return b.put(4).put(5).put(6);
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple3i(b, List.of(t1, t2)));
//
//		assertEquals(6, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple4i(IntBuffer, Tup4iR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple4i_ArrayTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup4iR t1 = mock(Tup4iR.class);
//		Tup4iR t2 = mock(Tup4iR.class);
//
//		IntBuffer b = factory.createIntBuffer(8);
//		
//		when(t1.toBuffer(any(IntBuffer.class))).then(new Answer<IntBuffer>() {
//			public IntBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				IntBuffer b = invocation.getArgument(0);
//				return b.put(1).put(2).put(3).put(4);
//			}
//		});
//		when(t2.toBuffer(any(IntBuffer.class))).then(new Answer<IntBuffer>() {
//			public IntBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				IntBuffer b = invocation.getArgument(0);
//				return b.put(5).put(6).put(7).put(8);
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple4i(b, t1, t2));
//
//		assertEquals(8, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple4i(IntBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple4i_ListTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup4iR t1 = mock(Tup4iR.class);
//		Tup4iR t2 = mock(Tup4iR.class);
//
//		IntBuffer b = factory.createIntBuffer(8);
//		
//		when(t1.toBuffer(any(IntBuffer.class))).then(new Answer<IntBuffer>() {
//			public IntBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				IntBuffer b = invocation.getArgument(0);
//				return b.put(1).put(2).put(3).put(4);
//			}
//		});
//		when(t2.toBuffer(any(IntBuffer.class))).then(new Answer<IntBuffer>() {
//			public IntBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				IntBuffer b = invocation.getArgument(0);
//				return b.put(5).put(6).put(7).put(8);
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple4i(b, List.of(t1, t2)));
//
//		assertEquals(8, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple2l(LongBuffer, Tup2lR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple2l_ArrayTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup2lR t1 = mock(Tup2lR.class);
//		Tup2lR t2 = mock(Tup2lR.class);
//
//		LongBuffer b = factory.createLongBuffer(8);
//		
//		when(t1.toBuffer(any(LongBuffer.class))).then(new Answer<LongBuffer>() {
//			public LongBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				LongBuffer b = invocation.getArgument(0);
//				return b.put(1l).put(2l);
//			}
//		});
//		when(t2.toBuffer(any(LongBuffer.class))).then(new Answer<LongBuffer>() {
//			public LongBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				LongBuffer b = invocation.getArgument(0);
//				return b.put(3l).put(4l);
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple2l(b, t1, t2));
//
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple2l(LongBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple2l_ListTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup2lR t1 = mock(Tup2lR.class);
//		Tup2lR t2 = mock(Tup2lR.class);
//
//		LongBuffer b = factory.createLongBuffer(8);
//		
//		when(t1.toBuffer(any(LongBuffer.class))).then(new Answer<LongBuffer>() {
//			public LongBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				LongBuffer b = invocation.getArgument(0);
//				return b.put(1l).put(2l);
//			}
//		});
//		when(t2.toBuffer(any(LongBuffer.class))).then(new Answer<LongBuffer>() {
//			public LongBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				LongBuffer b = invocation.getArgument(0);
//				return b.put(3l).put(4l);
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple2l(b, List.of(t1, t2)));
//
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple3l(LongBuffer, Tup3lR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple3l_ArrayTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup3lR t1 = mock(Tup3lR.class);
//		Tup3lR t2 = mock(Tup3lR.class);
//
//		LongBuffer b = factory.createLongBuffer(8);
//		
//		when(t1.toBuffer(any(LongBuffer.class))).then(new Answer<LongBuffer>() {
//			public LongBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				LongBuffer b = invocation.getArgument(0);
//				return b.put(1l).put(2l).put(3l);
//			}
//		});
//		when(t2.toBuffer(any(LongBuffer.class))).then(new Answer<LongBuffer>() {
//			public LongBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				LongBuffer b = invocation.getArgument(0);
//				return b.put(4l).put(5l).put(6l);
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple3l(b, t1, t2));
//
//		assertEquals(6, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple3l(LongBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple3l_ListTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup3lR t1 = mock(Tup3lR.class);
//		Tup3lR t2 = mock(Tup3lR.class);
//
//		LongBuffer b = factory.createLongBuffer(8);
//		
//		when(t1.toBuffer(any(LongBuffer.class))).then(new Answer<LongBuffer>() {
//			public LongBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				LongBuffer b = invocation.getArgument(0);
//				return b.put(1l).put(2l).put(3l);
//			}
//		});
//		when(t2.toBuffer(any(LongBuffer.class))).then(new Answer<LongBuffer>() {
//			public LongBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				LongBuffer b = invocation.getArgument(0);
//				return b.put(4l).put(5l).put(6l);
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple3l(b, List.of(t1, t2)));
//
//		assertEquals(6, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple4l(LongBuffer, Tup4lR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple4l_ArrayTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup4lR t1 = mock(Tup4lR.class);
//		Tup4lR t2 = mock(Tup4lR.class);
//
//		LongBuffer b = factory.createLongBuffer(8);
//		
//		when(t1.toBuffer(any(LongBuffer.class))).then(new Answer<LongBuffer>() {
//			public LongBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				LongBuffer b = invocation.getArgument(0);
//				return b.put(1l).put(2l).put(3l).put(4l);
//			}
//		});
//		when(t2.toBuffer(any(LongBuffer.class))).then(new Answer<LongBuffer>() {
//			public LongBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				LongBuffer b = invocation.getArgument(0);
//				return b.put(5l).put(6l).put(7l).put(8l);
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple4l(b, t1, t2));
//
//		assertEquals(8, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple4l(LongBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple4l_ListTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup4lR t1 = mock(Tup4lR.class);
//		Tup4lR t2 = mock(Tup4lR.class);
//
//		LongBuffer b = factory.createLongBuffer(8);
//		
//		when(t1.toBuffer(any(LongBuffer.class))).then(new Answer<LongBuffer>() {
//			public LongBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				LongBuffer b = invocation.getArgument(0);
//				return b.put(1l).put(2l).put(3l).put(4l);
//			}
//		});
//		when(t2.toBuffer(any(LongBuffer.class))).then(new Answer<LongBuffer>() {
//			public LongBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				LongBuffer b = invocation.getArgument(0);
//				return b.put(5l).put(6l).put(7l).put(8l);
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple4l(b, List.of(t1, t2)));
//
//		assertEquals(8, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple2f(FloatBuffer, Tup2fR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple2f_ArrayTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup2fR t1 = mock(Tup2fR.class);
//		Tup2fR t2 = mock(Tup2fR.class);
//
//		FloatBuffer b = factory.createFloatBuffer(8);
//		
//		when(t1.toBuffer(any(FloatBuffer.class))).then(new Answer<FloatBuffer>() {
//			public FloatBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				FloatBuffer b = invocation.getArgument(0);
//				return b.put(1.0f).put(2.0f);
//			}
//		});
//		when(t2.toBuffer(any(FloatBuffer.class))).then(new Answer<FloatBuffer>() {
//			public FloatBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				FloatBuffer b = invocation.getArgument(0);
//				return b.put(3.0f).put(4.0f);
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple2f(b, t1, t2));
//
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple2f(FloatBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple2f_ListTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup2fR t1 = mock(Tup2fR.class);
//		Tup2fR t2 = mock(Tup2fR.class);
//
//		FloatBuffer b = factory.createFloatBuffer(8);
//		
//		when(t1.toBuffer(any(FloatBuffer.class))).then(new Answer<FloatBuffer>() {
//			public FloatBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				FloatBuffer b = invocation.getArgument(0);
//				return b.put(1.0f).put(2.0f);
//			}
//		});
//		when(t2.toBuffer(any(FloatBuffer.class))).then(new Answer<FloatBuffer>() {
//			public FloatBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				FloatBuffer b = invocation.getArgument(0);
//				return b.put(3.0f).put(4.0f);
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple2f(b, List.of(t1, t2)));
//
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple3f(FloatBuffer, Tup3fR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple3f_ArrayTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup3fR t1 = mock(Tup3fR.class);
//		Tup3fR t2 = mock(Tup3fR.class);
//
//		FloatBuffer b = factory.createFloatBuffer(8);
//		
//		when(t1.toBuffer(any(FloatBuffer.class))).then(new Answer<FloatBuffer>() {
//			public FloatBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				FloatBuffer b = invocation.getArgument(0);
//				return b.put(1.0f).put(2.0f).put(3.0f);
//			}
//		});
//		when(t2.toBuffer(any(FloatBuffer.class))).then(new Answer<FloatBuffer>() {
//			public FloatBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				FloatBuffer b = invocation.getArgument(0);
//				return b.put(4.0f).put(5.0f).put(6.0f);
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple3f(b, t1, t2));
//
//		assertEquals(6, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple3f(FloatBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple3f_ListTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup3fR t1 = mock(Tup3fR.class);
//		Tup3fR t2 = mock(Tup3fR.class);
//
//		FloatBuffer b = factory.createFloatBuffer(8);
//		
//		when(t1.toBuffer(any(FloatBuffer.class))).then(new Answer<FloatBuffer>() {
//			public FloatBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				FloatBuffer b = invocation.getArgument(0);
//				return b.put(1.0f).put(2.0f).put(3.0f);
//			}
//		});
//		when(t2.toBuffer(any(FloatBuffer.class))).then(new Answer<FloatBuffer>() {
//			public FloatBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				FloatBuffer b = invocation.getArgument(0);
//				return b.put(4.0f).put(5.0f).put(6.0f);
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple3f(b, List.of(t1, t2)));
//
//		assertEquals(6, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple4f(FloatBuffer, Tup4fR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple4f_ArrayTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup4fR t1 = mock(Tup4fR.class);
//		Tup4fR t2 = mock(Tup4fR.class);
//
//		FloatBuffer b = factory.createFloatBuffer(8);
//		
//		when(t1.toBuffer(any(FloatBuffer.class))).then(new Answer<FloatBuffer>() {
//			public FloatBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				FloatBuffer b = invocation.getArgument(0);
//				return b.put(1.0f).put(2.0f).put(3.0f).put(4.0f);
//			}
//		});
//		when(t2.toBuffer(any(FloatBuffer.class))).then(new Answer<FloatBuffer>() {
//			public FloatBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				FloatBuffer b = invocation.getArgument(0);
//				return b.put(5.0f).put(6.0f).put(7.0f).put(8.0f);
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple4f(b, t1, t2));
//
//		assertEquals(8, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple4f(FloatBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple4f_ListTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup4fR t1 = mock(Tup4fR.class);
//		Tup4fR t2 = mock(Tup4fR.class);
//
//		FloatBuffer b = factory.createFloatBuffer(8);
//		
//		when(t1.toBuffer(any(FloatBuffer.class))).then(new Answer<FloatBuffer>() {
//			public FloatBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				FloatBuffer b = invocation.getArgument(0);
//				return b.put(1.0f).put(2.0f).put(3.0f).put(4.0f);
//			}
//		});
//		when(t2.toBuffer(any(FloatBuffer.class))).then(new Answer<FloatBuffer>() {
//			public FloatBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				FloatBuffer b = invocation.getArgument(0);
//				return b.put(5.0f).put(6.0f).put(7.0f).put(8.0f);
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple4f(b, List.of(t1, t2)));
//
//		assertEquals(8, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple2d(DoubleBuffer, Tup2dR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple2d_ArrayTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup2dR t1 = mock(Tup2dR.class);
//		Tup2dR t2 = mock(Tup2dR.class);
//
//		DoubleBuffer b = factory.createDoubleBuffer(8);
//		
//		when(t1.toBuffer(any(DoubleBuffer.class))).then(new Answer<DoubleBuffer>() {
//			public DoubleBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				DoubleBuffer b = invocation.getArgument(0);
//				return b.put(1.0).put(2.0);
//			}
//		});
//		when(t2.toBuffer(any(DoubleBuffer.class))).then(new Answer<DoubleBuffer>() {
//			public DoubleBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				DoubleBuffer b = invocation.getArgument(0);
//				return b.put(3.0).put(4.0);
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple2d(b, t1, t2));
//
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple2d(DoubleBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple2d_ListTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup2dR t1 = mock(Tup2dR.class);
//		Tup2dR t2 = mock(Tup2dR.class);
//
//		DoubleBuffer b = factory.createDoubleBuffer(8);
//		
//		when(t1.toBuffer(any(DoubleBuffer.class))).then(new Answer<DoubleBuffer>() {
//			public DoubleBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				DoubleBuffer b = invocation.getArgument(0);
//				return b.put(1.0).put(2.0);
//			}
//		});
//		when(t2.toBuffer(any(DoubleBuffer.class))).then(new Answer<DoubleBuffer>() {
//			public DoubleBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				DoubleBuffer b = invocation.getArgument(0);
//				return b.put(3.0).put(4.0);
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple2d(b, List.of(t1, t2)));
//
//		assertEquals(4, b.limit());
//		assertEquals(0, b.position());
//	}
//
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple3d(DoubleBuffer, Tup3dR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple3d_ArrayTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup3dR t1 = mock(Tup3dR.class);
//		Tup3dR t2 = mock(Tup3dR.class);
//
//		DoubleBuffer b = factory.createDoubleBuffer(8);
//		
//		when(t1.toBuffer(any(DoubleBuffer.class))).then(new Answer<DoubleBuffer>() {
//			public DoubleBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				DoubleBuffer b = invocation.getArgument(0);
//				return b.put(1.0).put(2.0).put(3.0);
//			}
//		});
//		when(t2.toBuffer(any(DoubleBuffer.class))).then(new Answer<DoubleBuffer>() {
//			public DoubleBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				DoubleBuffer b = invocation.getArgument(0);
//				return b.put(4.0).put(5.0).put(6.0);
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple3d(b, t1, t2));
//
//		assertEquals(6, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple3d(DoubleBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple3d_ListTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup3dR t1 = mock(Tup3dR.class);
//		Tup3dR t2 = mock(Tup3dR.class);
//
//		DoubleBuffer b = factory.createDoubleBuffer(8);
//		
//		when(t1.toBuffer(any(DoubleBuffer.class))).then(new Answer<DoubleBuffer>() {
//			public DoubleBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				DoubleBuffer b = invocation.getArgument(0);
//				return b.put(1.0).put(2.0).put(3.0);
//			}
//		});
//		when(t2.toBuffer(any(DoubleBuffer.class))).then(new Answer<DoubleBuffer>() {
//			public DoubleBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				DoubleBuffer b = invocation.getArgument(0);
//				return b.put(4.0).put(5.0).put(6.0);
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple3d(b, List.of(t1, t2)));
//
//		assertEquals(6, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple4d(DoubleBuffer, Tup4dR[])}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple4d_ArrayTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup4dR t1 = mock(Tup4dR.class);
//		Tup4dR t2 = mock(Tup4dR.class);
//
//		DoubleBuffer b = factory.createDoubleBuffer(8);
//		
//		when(t1.toBuffer(any(DoubleBuffer.class))).then(new Answer<DoubleBuffer>() {
//			public DoubleBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				DoubleBuffer b = invocation.getArgument(0);
//				return b.put(1.0).put(2.0).put(3.0).put(4.0);
//			}
//		});
//		when(t2.toBuffer(any(DoubleBuffer.class))).then(new Answer<DoubleBuffer>() {
//			public DoubleBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				DoubleBuffer b = invocation.getArgument(0);
//				return b.put(5.0).put(6.0).put(7.0).put(8.0);
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple4d(b, t1, t2));
//
//		assertEquals(8, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link CoreBufferUtil#putAndFlipTuple4d(DoubleBuffer, List)}
//	 * correctly puts the entries in the buffer.
//	 */
//	@Test
//	void putAndFlipTuple4d_ListTest()
//	{
//		TestBufferFactory factory = new TestBufferFactory();
//		
//		Tup4dR t1 = mock(Tup4dR.class);
//		Tup4dR t2 = mock(Tup4dR.class);
//
//		DoubleBuffer b = factory.createDoubleBuffer(8);
//		
//		when(t1.toBuffer(any(DoubleBuffer.class))).then(new Answer<DoubleBuffer>() {
//			public DoubleBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				DoubleBuffer b = invocation.getArgument(0);
//				return b.put(1.0).put(2.0).put(3.0).put(4.0);
//			}
//		});
//		when(t2.toBuffer(any(DoubleBuffer.class))).then(new Answer<DoubleBuffer>() {
//			public DoubleBuffer answer(InvocationOnMock invocation) throws Throwable
//			{
//				DoubleBuffer b = invocation.getArgument(0);
//				return b.put(5.0).put(6.0).put(7.0).put(8.0);
//			}
//		});
//		
//		assertEquals(b, CoreBufferUtil.putAndFlipTuple4d(b, List.of(t1, t2)));
//
//		assertEquals(8, b.limit());
//		assertEquals(0, b.position());
//	}
//	
//	/**
//	 * This class is a test implementation of the interface {@link NioBufferFactory}.
//	 */
//	static class TestBufferFactory implements NioBufferFactory
//	{
//	/** 
//		 * Contains the byte order used in creating buffers.
//		 */
//		public static final ByteOrder BYTE_ORDER = ByteOrder.nativeOrder();
//		
//		/** {@inheritDoc} */
//		@Override
//		public ByteBuffer createByteBuffer(int capacity)
//		{
//			return ByteBuffer.allocateDirect(capacity).order(BYTE_ORDER);
//		}
//		
//		/** {@inheritDoc} */
//		@Override
//		public ShortBuffer createShortBuffer(int capacity)
//		{
//			return ByteBuffer.allocateDirect(capacity << 1).order(BYTE_ORDER).asShortBuffer();
//		}
//		
//		/** {@inheritDoc} */
//		@Override
//		public IntBuffer createIntBuffer(int capacity)
//		{
//			return ByteBuffer.allocateDirect(capacity << 2).order(BYTE_ORDER).asIntBuffer();
//		}
//		
//		/** {@inheritDoc} */
//		@Override
//		public LongBuffer createLongBuffer(int capacity)
//		{
//			return ByteBuffer.allocateDirect(capacity << 3).order(BYTE_ORDER).asLongBuffer();
//		}	
//		
//		/** {@inheritDoc} */
//		@Override
//		public FloatBuffer createFloatBuffer(int capacity)
//		{
//			return ByteBuffer.allocateDirect(capacity << 2).order(BYTE_ORDER).asFloatBuffer();
//		}		
//		
//		/** {@inheritDoc} */
//		@Override
//		public DoubleBuffer createDoubleBuffer(int capacity)
//		{
//			return ByteBuffer.allocateDirect(capacity << 3).order(BYTE_ORDER).asDoubleBuffer();
//		}
//	
//		/** {@inheritDoc} */
//		@Override
//		public void destroyBuffer(ByteBuffer buffer) { }
//	
//		/** {@inheritDoc} */
//		@Override
//		public void destroyBuffer(ShortBuffer buffer) { }
//	
//		/** {@inheritDoc} */
//		@Override
//		public void destroyBuffer(IntBuffer buffer) { }
//	
//		/** {@inheritDoc} */
//		@Override
//		public void destroyBuffer(LongBuffer buffer) { }
//	
//		/** {@inheritDoc} */
//		@Override
//		public void destroyBuffer(FloatBuffer buffer) { }
//	
//		/** {@inheritDoc} */
//		@Override
//		public void destroyBuffer(DoubleBuffer buffer) { }
//	}
//}
package org.barghostest.nio.buffer;

