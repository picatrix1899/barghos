package org.barghos.core.test.api.tuple3;

import static org.barghos.testutils.TestObjectFactory.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.nio.ByteBuffer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.barghos.core.api.tuple.TupbR;
import org.barghos.core.api.tuple3.Tup3bR;

/**
 * This class provides component tests for the interface {@link Tup3bR}.
 * 
 * @author picatrix1899
 */
class Tup3bRTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupbR}.
	 */
	@Test
	void inheritance_TupbRTest()
	{
		assertTrue(TupbR.class.isAssignableFrom(Tup3bR.class));
	}
	
	/**
	 * this test ensures, that the function {@link Tup3bR#getDimensions()} always
	 * returns 3 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup3bR t = mock(Tup3bR.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(3, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bR#isExactlyZero()} returns true,
	 * if all of the components are exactly zero.
	 */
	@Test
	void isExactlyZero_ZeroTest()
	{
		Tup3bR t = mock(Tup3bR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(b(0));
		when(t.getY()).thenReturn(b(0));
		when(t.getZ()).thenReturn(b(0));
		
		assertEquals(true, t.isExactlyZero());
		
		verify(t).isExactlyZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bR#isExactlyZero()} returns false,
	 * if the x component is not zero.
	 */
	@Test
	void isExactlyZero_Fail_XTest()
	{
		Tup3bR t = mock(Tup3bR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(b(1));
		
		assertEquals(false, t.isExactlyZero());
		
		verify(t).isExactlyZero();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bR#isExactlyZero()} returns false,
	 * if the y component is not zero.
	 */
	@Test
	void isExactlyZero_Fail_YTest()
	{
		Tup3bR t = mock(Tup3bR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(b(0));
		when(t.getY()).thenReturn(b(1));
		
		assertEquals(false, t.isExactlyZero());
		
		verify(t).isExactlyZero();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bR#isExactlyZero()} returns false,
	 * if the z component is not zero.
	 */
	@Test
	void isExactlyZero_Fail_ZTest()
	{
		Tup3bR t = mock(Tup3bR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(b(0));
		when(t.getY()).thenReturn(b(0));
		when(t.getZ()).thenReturn(b(1));
		
		assertEquals(false, t.isExactlyZero());
		
		verify(t).isExactlyZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bR#isZero(byte)} returns true,
	 * if all components are exactly zero.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup3bR t = mock(Tup3bR.class);
		
		when(t.isZero(b(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(b(0));
		when(t.getY()).thenReturn(b(0));
		when(t.getZ()).thenReturn(b(0));
		
		assertEquals(true, t.isZero(b(2)));
		
		verify(t).isZero(b(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bR#isZero(byte)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Extreme_PositiveTest()
	{
		Tup3bR t = mock(Tup3bR.class);
		
		when(t.isZero(b(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(b(2));
		when(t.getY()).thenReturn(b(2));
		when(t.getZ()).thenReturn(b(2));
		
		assertEquals(true, t.isZero(b(2)));
		
		verify(t).isZero(b(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bR#isZero(byte)} returns true,
	 * if all components are at the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Extreme_NegativeTest()
	{
		Tup3bR t = mock(Tup3bR.class);
		
		when(t.isZero(b(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(b(-2));
		when(t.getY()).thenReturn(b(-2));
		when(t.getZ()).thenReturn(b(-2));
		
		assertEquals(true, t.isZero(b(2)));
		
		verify(t).isZero(b(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bR#isZero(byte)} returns false,
	 * if the x component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_X_PositiveTest()
	{
		Tup3bR t = mock(Tup3bR.class);
		
		when(t.isZero(b(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(b(3));
		
		assertEquals(false, t.isZero(b(2)));
		
		verify(t).isZero(b(2));
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bR#isZero(byte)} returns false,
	 * if the x component exceeds the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_X_NegativeTest()
	{
		Tup3bR t = mock(Tup3bR.class);
		
		when(t.isZero(b(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(b(-3));
		
		assertEquals(false, t.isZero(b(2)));
		
		verify(t).isZero(b(2));
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bR#isZero(byte)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_Y_PositiveTest()
	{
		Tup3bR t = mock(Tup3bR.class);
		
		when(t.isZero(b(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(b(0));
		when(t.getY()).thenReturn(b(3));
		
		assertEquals(false, t.isZero(b(2)));
		
		verify(t).isZero(b(2));
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bR#isZero(byte)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_Y_NegativeTest()
	{
		Tup3bR t = mock(Tup3bR.class);
		
		when(t.isZero(b(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(b(0));
		when(t.getY()).thenReturn(b(-3));
		
		assertEquals(false, t.isZero(b(2)));
		
		verify(t).isZero(b(2));
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bR#isZero(byte)} returns false,
	 * if the z component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_Z_PositiveTest()
	{
		Tup3bR t = mock(Tup3bR.class);
		
		when(t.isZero(b(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(b(0));
		when(t.getY()).thenReturn(b(0));
		when(t.getZ()).thenReturn(b(3));
		
		assertEquals(false, t.isZero(b(2)));
		
		verify(t).isZero(b(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bR#isZero(byte)} returns false,
	 * if the z component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_Z_NegativeTest()
	{
		Tup3bR t = mock(Tup3bR.class);
		
		when(t.isZero(b(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(b(0));
		when(t.getY()).thenReturn(b(0));
		when(t.getZ()).thenReturn(b(-3));
		
		assertEquals(false, t.isZero(b(2)));
		
		verify(t).isZero(b(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bR#toArray(byte[])} returns
	 * the given array with the components in the right order.
	 */
	@Test
	void toArray_ExtractParamTest()
	{
		Tup3bR t = mock(Tup3bR.class);
		
		byte[] array = new byte[3];
		
		when(t.toArray(array)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(b(1));
		when(t.getY()).thenReturn(b(2));
		when(t.getZ()).thenReturn(b(3));
		
		assertSame(array, t.toArray(array));
		assertArrayEquals(bArray(1, 2, 3), array);
		
		verify(t).toArray(array);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bR#getByIndex(int)} returns
	 * the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup3bR t = mock(Tup3bR.class);
		
		when(t.getByIndex(0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(b(1));
		
		assertEquals(b(1), t.getByIndex(0));

		verify(t).getByIndex(0);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bR#getByIndex(int)} returns
	 * the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup3bR t = mock(Tup3bR.class);
		
		when(t.getByIndex(1)).thenCallRealMethod();
		
		when(t.getY()).thenReturn(b(1));
		
		assertEquals(b(1), t.getByIndex(1));

		verify(t).getByIndex(1);
		
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bR#getByIndex(int)} returns
	 * the z component for the index 2.
	 */
	@Test
	void getByIndex_ZTest()
	{
		Tup3bR t = mock(Tup3bR.class);
		
		when(t.getByIndex(2)).thenCallRealMethod();
		
		when(t.getZ()).thenReturn(b(1));
		
		assertEquals(b(1), t.getByIndex(2));

		verify(t).getByIndex(2);
		
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bR#getByIndex(int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1 or 2.
	 */
	@Test
	void getByIndex_ExceptionTest()
	{
		Tup3bR t = mock(Tup3bR.class);
		
		when(t.getByIndex(3)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.getByIndex(3);
			}
		});

		verify(t).getByIndex(3);

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bR#toBuffer(ByteBuffer)}
	 * puts the components correctly in the buffer.
	 */
	@Test
	void toBufferTest()
	{
		Tup3bR t = mock(Tup3bR.class);
		
		ByteBuffer buffer = mock(ByteBuffer.class);
		
		when(t.toBuffer(buffer)).thenCallRealMethod();
		when(t.getX()).thenReturn(b(1));
		when(t.getY()).thenReturn(b(2));
		when(t.getZ()).thenReturn(b(3));
		
		assertSame(buffer, t.toBuffer(buffer));
		
		verify(t).toBuffer(buffer);
		verify(t).getX();
		verify(buffer).put(b(1));
		verify(t).getY();
		verify(buffer).put(b(2));
		verify(t).getZ();
		verify(buffer).put(b(3));
		
		verifyNoMoreInteractions(t, buffer);
	}
}
