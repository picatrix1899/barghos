package org.barghos.core.test.api.tuple3;

import static org.barghos.testutils.TestObjectFactory.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.nio.ShortBuffer;

import org.barghos.core.api.tuple.TupsR;
import org.barghos.core.api.tuple3.Tup3sR;

/**
 * This class provides component tests for the interface {@link Tup3sR}.
 * 
 * @author picatrix1899
 */
class Tup3sRTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupsR}.
	 */
	@Test
	void inheritance_TupsRTest()
	{
		assertTrue(TupsR.class.isAssignableFrom(Tup3sR.class));
	}

	/**
	 * this test ensures, that the function {@link Tup3sR#getDimensions()} always
	 * returns 3 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(3, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#isExactlyZero()} returns true,
	 * if all of the components are exactly zero.
	 */
	@Test
	void isExactlyZero_ZeroTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(s(0));
		when(t.getY()).thenReturn(s(0));
		when(t.getZ()).thenReturn(s(0));
		
		assertEquals(true, t.isExactlyZero());
		
		verify(t).isExactlyZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#isExactlyZero()} returns false,
	 * if the x component is not zero.
	 */
	@Test
	void isExactlyZero_Fail_XTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(s(1));
		
		assertEquals(false, t.isExactlyZero());
		
		verify(t).isExactlyZero();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#isExactlyZero()} returns false,
	 * if the y component is not zero.
	 */
	@Test
	void isExactlyZero_Fail_YTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(s(0));
		when(t.getY()).thenReturn(s(1));
		
		assertEquals(false, t.isExactlyZero());
		
		verify(t).isExactlyZero();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#isExactlyZero()} returns false,
	 * if the z component is not zero.
	 */
	@Test
	void isExactlyZero_Fail_ZTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(s(0));
		when(t.getY()).thenReturn(s(0));
		when(t.getZ()).thenReturn(s(1));
		
		assertEquals(false, t.isExactlyZero());
		
		verify(t).isExactlyZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#isZero(short)} returns true,
	 * if all components are exactly zero.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.isZero(s(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(s(0));
		when(t.getY()).thenReturn(s(0));
		when(t.getZ()).thenReturn(s(0));
		
		assertEquals(true, t.isZero(s(2)));
		
		verify(t).isZero(s(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#isZero(short)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Extreme_PositiveTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.isZero(s(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(s(2));
		when(t.getY()).thenReturn(s(2));
		when(t.getZ()).thenReturn(s(2));
		
		assertEquals(true, t.isZero(s(2)));
		
		verify(t).isZero(s(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#isZero(short)} returns true,
	 * if all components are at the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Extreme_NegativeTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.isZero(s(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(s(-2));
		when(t.getY()).thenReturn(s(-2));
		when(t.getZ()).thenReturn(s(-2));
		
		assertEquals(true, t.isZero(s(2)));
		
		verify(t).isZero(s(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#isZero(short)} returns false,
	 * if the x component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_X_PositiveTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.isZero(s(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(s(3));
		
		assertEquals(false, t.isZero(s(2)));
		
		verify(t).isZero(s(2));
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#isZero(short)} returns false,
	 * if the x component exceeds the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_X_NegativeTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.isZero(s(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(s(-3));
		
		assertEquals(false, t.isZero(s(2)));
		
		verify(t).isZero(s(2));
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#isZero(short)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_Y_PositiveTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.isZero(s(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(s(0));
		when(t.getY()).thenReturn(s(3));
		
		assertEquals(false, t.isZero(s(2)));
		
		verify(t).isZero(s(2));
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#isZero(short)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_Y_NegativeTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.isZero(s(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(s(0));
		when(t.getY()).thenReturn(s(-3));
		
		assertEquals(false, t.isZero(s(2)));
		
		verify(t).isZero(s(2));
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#isZero(short)} returns false,
	 * if the z component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_Z_PositiveTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.isZero(s(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(s(0));
		when(t.getY()).thenReturn(s(0));
		when(t.getZ()).thenReturn(s(3));
		
		assertEquals(false, t.isZero(s(2)));
		
		verify(t).isZero(s(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#isZero(short)} returns false,
	 * if the z component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_Z_NegativeTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.isZero(s(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(s(0));
		when(t.getY()).thenReturn(s(0));
		when(t.getZ()).thenReturn(s(-3));
		
		assertEquals(false, t.isZero(s(2)));
		
		verify(t).isZero(s(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#toArray(short[])} returns
	 * the given array with the components in the right order.
	 */
	@Test
	void toArray_ExtractParamTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		short[] array = new short[3];
		
		when(t.toArray(array)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(s(1));
		when(t.getY()).thenReturn(s(2));
		when(t.getZ()).thenReturn(s(3));
		
		assertSame(array, t.toArray(array));
		assertArrayEquals(sArray(1, 2, 3), array);
		
		verify(t).toArray(array);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#getByIndex(int)} returns
	 * the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.getByIndex(0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(s(1));
		
		assertEquals(s(1), t.getByIndex(0));

		verify(t).getByIndex(0);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#getByIndex(int)} returns
	 * the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.getByIndex(1)).thenCallRealMethod();
		
		when(t.getY()).thenReturn(s(1));
		
		assertEquals(s(1), t.getByIndex(1));

		verify(t).getByIndex(1);
		
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#getByIndex(int)} returns
	 * the z component for the index 2.
	 */
	@Test
	void getByIndex_ZTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.getByIndex(2)).thenCallRealMethod();
		
		when(t.getZ()).thenReturn(s(1));
		
		assertEquals(s(1), t.getByIndex(2));

		verify(t).getByIndex(2);
		
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#getByIndex(int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1 or 2.
	 */
	@Test
	void getByIndex_ExceptionTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
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
	 * This test ensures, that the function {@link Tup3sR#toBuffer(ShortBuffer)}
	 * puts the components correctly in the buffer.
	 */
	@Test
	void toBufferTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		ShortBuffer buffer = mock(ShortBuffer.class);
		
		when(t.toBuffer(buffer)).thenCallRealMethod();
		when(t.getX()).thenReturn(s(1));
		when(t.getY()).thenReturn(s(2));
		when(t.getZ()).thenReturn(s(3));
		
		assertSame(buffer, t.toBuffer(buffer));
		
		verify(t).toBuffer(buffer);
		verify(t).getX();
		verify(buffer).put(s(1));
		verify(t).getY();
		verify(buffer).put(s(2));
		verify(t).getZ();
		verify(buffer).put(s(3));
		
		verifyNoMoreInteractions(t, buffer);
	}
}