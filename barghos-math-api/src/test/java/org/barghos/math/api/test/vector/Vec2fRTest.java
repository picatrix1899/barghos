package org.barghos.math.api.test.vector;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.math.api.vector.SimpleVec2fR;
import org.barghos.math.api.vector.Vec2fR;

/**
 * This class provides component tests for the interface {@link Vec2fR}
 * 
 * @author picatrix1899
 *
 */
public class Vec2fRTest
{
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#distanceTo(SimpleVec2fR)}
	 * is calling and returning the result of the function {@link Vec2fR#distanceTo(float, float)}.
	 */
	@Test
	void distanceTo_vectorTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		when(v.distanceTo(v2)).thenCallRealMethod();
		
		when(v2.getX()).thenReturn(1.0f);
		when(v2.getY()).thenReturn(2.0f);
		
		when(v.distanceTo(1.0f, 2.0f)).thenReturn(3.0f);
		
		assertEquals(3.0f, v.distanceTo(v2));
		
		verify(v).distanceTo(v2);
		
		verify(v2).getX();
		verify(v2).getY();
		
		verify(v).distanceTo(1.0f, 2.0f);
		
		verifyNoMoreInteractions(v, v2);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#distanceTo(float[])}
	 * is calling and returning the result of the function {@link Vec2fR#distanceTo(float, float)}.
	 */
	@Test
	void distanceTo_arrayTest()
	{
		Vec2fR v = mock(Vec2fR.class);

		when(v.distanceTo(new float[] {1.0f, 2.0f})).thenCallRealMethod();

		when(v.distanceTo(1.0f, 2.0f)).thenReturn(3.0f);
		
		assertEquals(3.0f, v.distanceTo(new float[] {1.0f, 2.0f}));
		
		verify(v).distanceTo(new float[] {1.0f, 2.0f});

		verify(v).distanceTo(1.0f, 2.0f);
		
		verifyNoMoreInteractions(v);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#distanceTo(SimpleVec2fR, float)}
	 * is calling and returning the result of the function {@link Vec2fR#distanceTo(float, float, float)}.
	 */
	@Test
	void distanceToWithTolerance_vectorTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		when(v.distanceTo(v2, 4.0f)).thenCallRealMethod();
		
		when(v2.getX()).thenReturn(1.0f);
		when(v2.getY()).thenReturn(2.0f);
		
		when(v.distanceTo(1.0f, 2.0f, 4.0f)).thenReturn(3.0f);
		
		assertEquals(3.0f, v.distanceTo(v2, 4.0f));
		
		verify(v).distanceTo(v2, 4.0f);
		
		verify(v2).getX();
		verify(v2).getY();
		
		verify(v).distanceTo(1.0f, 2.0f, 4.0f);
		
		verifyNoMoreInteractions(v, v2);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#distanceTo(float[], float)}
	 * is calling and returning the result of the function {@link Vec2fR#distanceTo(float, float, float)}.
	 */
	@Test
	void distanceToWithTolerance_arrayTest()
	{
		Vec2fR v = mock(Vec2fR.class);

		when(v.distanceTo(new float[] {1.0f, 2.0f}, 4.0f)).thenCallRealMethod();

		when(v.distanceTo(1.0f, 2.0f, 4.0f)).thenReturn(3.0f);
		
		assertEquals(3.0f, v.distanceTo(new float[] {1.0f, 2.0f}, 4.0f));
		
		verify(v).distanceTo(new float[] {1.0f, 2.0f}, 4.0f);

		verify(v).distanceTo(1.0f, 2.0f, 4.0f);
		
		verifyNoMoreInteractions(v);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#inverseDistanceTo(SimpleVec2fR)}
	 * is calling and returning the result of the function {@link Vec2fR#inverseDistanceTo(float, float)}.
	 */
	@Test
	void inverseDistanceTo_vectorTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		when(v.inverseDistanceTo(v2)).thenCallRealMethod();
		
		when(v2.getX()).thenReturn(1.0f);
		when(v2.getY()).thenReturn(2.0f);
		
		when(v.inverseDistanceTo(1.0f, 2.0f)).thenReturn(3.0f);
		
		assertEquals(3.0f, v.inverseDistanceTo(v2));
		
		verify(v).inverseDistanceTo(v2);
		
		verify(v2).getX();
		verify(v2).getY();
		
		verify(v).inverseDistanceTo(1.0f, 2.0f);
		
		verifyNoMoreInteractions(v, v2);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#inverseDistanceTo(float[])}
	 * is calling and returning the result of the function {@link Vec2fR#inverseDistanceTo(float, float)}.
	 */
	@Test
	void inverseDistanceTo_arrayTest()
	{
		Vec2fR v = mock(Vec2fR.class);

		when(v.inverseDistanceTo(new float[] {1.0f, 2.0f})).thenCallRealMethod();

		when(v.inverseDistanceTo(1.0f, 2.0f)).thenReturn(3.0f);
		
		assertEquals(3.0f, v.inverseDistanceTo(new float[] {1.0f, 2.0f}));
		
		verify(v).inverseDistanceTo(new float[] {1.0f, 2.0f});

		verify(v).inverseDistanceTo(1.0f, 2.0f);
		
		verifyNoMoreInteractions(v);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#squaredDistanceTo(SimpleVec2fR)}
	 * is calling and returning the result of the function {@link Vec2fR#squaredDistanceTo(float, float)}.
	 */
	@Test
	void squaredDistanceTo_vectorTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		when(v.squaredDistanceTo(v2)).thenCallRealMethod();
		
		when(v2.getX()).thenReturn(1.0f);
		when(v2.getY()).thenReturn(2.0f);
		
		when(v.squaredDistanceTo(1.0f, 2.0f)).thenReturn(3.0f);
		
		assertEquals(3.0f, v.squaredDistanceTo(v2));
		
		verify(v).squaredDistanceTo(v2);
		
		verify(v2).getX();
		verify(v2).getY();
		
		verify(v).squaredDistanceTo(1.0f, 2.0f);
		
		verifyNoMoreInteractions(v, v2);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#squaredDistanceTo(float[])}
	 * is calling and returning the result of the function {@link Vec2fR#squaredDistanceTo(float, float)}.
	 */
	@Test
	void squaredDistanceTo_arrayTest()
	{
		Vec2fR v = mock(Vec2fR.class);

		when(v.squaredDistanceTo(new float[] {1.0f, 2.0f})).thenCallRealMethod();

		when(v.squaredDistanceTo(1.0f, 2.0f)).thenReturn(3.0f);
		
		assertEquals(3.0f, v.squaredDistanceTo(new float[] {1.0f, 2.0f}));
		
		verify(v).squaredDistanceTo(new float[] {1.0f, 2.0f});

		verify(v).squaredDistanceTo(1.0f, 2.0f);
		
		verifyNoMoreInteractions(v);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#squaredDistanceTo(SimpleVec2fR, float)}
	 * is calling and returning the result of the function {@link Vec2fR#squaredDistanceTo(float, float, float)}.
	 */
	@Test
	void squaredDistanceToWithTolerance_vectorTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		when(v.squaredDistanceTo(v2, 4.0f)).thenCallRealMethod();
		
		when(v2.getX()).thenReturn(1.0f);
		when(v2.getY()).thenReturn(2.0f);
		
		when(v.squaredDistanceTo(1.0f, 2.0f, 4.0f)).thenReturn(3.0f);
		
		assertEquals(3.0f, v.squaredDistanceTo(v2, 4.0f));
		
		verify(v).squaredDistanceTo(v2, 4.0f);
		
		verify(v2).getX();
		verify(v2).getY();
		
		verify(v).squaredDistanceTo(1.0f, 2.0f, 4.0f);
		
		verifyNoMoreInteractions(v, v2);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#squaredDistanceTo(float[], float)}
	 * is calling and returning the result of the function {@link Vec2fR#squaredDistanceTo(float, float, float)}.
	 */
	@Test
	void squaredDistanceToWithTolerance_arrayTest()
	{
		Vec2fR v = mock(Vec2fR.class);

		when(v.squaredDistanceTo(new float[] {1.0f, 2.0f}, 4.0f)).thenCallRealMethod();

		when(v.squaredDistanceTo(1.0f, 2.0f, 4.0f)).thenReturn(3.0f);
		
		assertEquals(3.0f, v.squaredDistanceTo(new float[] {1.0f, 2.0f}, 4.0f));
		
		verify(v).squaredDistanceTo(new float[] {1.0f, 2.0f}, 4.0f);

		verify(v).squaredDistanceTo(1.0f, 2.0f, 4.0f);
		
		verifyNoMoreInteractions(v);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#dot(SimpleVec2fR)}
	 * is calling and returning the result of the function {@link Vec2fR#dot(float, float)}.
	 */
	@Test
	void dot_vectorTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		when(v.dot(v2)).thenCallRealMethod();
		
		when(v2.getX()).thenReturn(1.0f);
		when(v2.getY()).thenReturn(2.0f);
		
		when(v.dot(1.0f, 2.0f)).thenReturn(3.0f);
		
		assertEquals(3.0f, v.dot(v2));
		
		verify(v).dot(v2);
		
		verify(v2).getX();
		verify(v2).getY();
		
		verify(v).dot(1.0f, 2.0f);
		
		verifyNoMoreInteractions(v, v2);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#dot(float[])}
	 * is calling and returning the result of the function {@link Vec2fR#dot(float, float)}.
	 */
	@Test
	void dot_arrayTest()
	{
		Vec2fR v = mock(Vec2fR.class);

		when(v.dot(new float[] {1.0f, 2.0f})).thenCallRealMethod();

		when(v.dot(1.0f, 2.0f)).thenReturn(3.0f);
		
		assertEquals(3.0f, v.dot(new float[] {1.0f, 2.0f}));
		
		verify(v).dot(new float[] {1.0f, 2.0f});

		verify(v).dot(1.0f, 2.0f);
		
		verifyNoMoreInteractions(v);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#addN(SimpleVec2fR)}
	 * is calling and returning the result of the function {@link Vec2fR#addN(float, float)}.
	 */
	@Test
	void addN_vectorTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		Vec2fR result = mock(Vec2fR.class);
		
		when(v.addN(v2)).thenCallRealMethod();
		
		when(v2.getX()).thenReturn(1.0f);
		when(v2.getY()).thenReturn(2.0f);
		
		when(v.addN(1.0f, 2.0f)).thenReturn(result);
		
		assertSame(result, v.addN(v2));
		
		verify(v).addN(v2);
		
		verify(v2).getX();
		verify(v2).getY();
		
		verify(v).addN(1.0f, 2.0f);
		
		verifyNoMoreInteractions(v, v2);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#addN(float)}
	 * is calling and returning the result of the function {@link Vec2fR#addN(float, float)}.
	 */
	@Test
	void addN_valueTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		Vec2fR result = mock(Vec2fR.class);
		
		when(v.addN(1.0f)).thenCallRealMethod();

		when(v.addN(1.0f, 1.0f)).thenReturn(result);
		
		assertSame(result, v.addN(1.0f));
		
		verify(v).addN(1.0f);

		verify(v).addN(1.0f, 1.0f);
		
		verifyNoMoreInteractions(v);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#addN(float[])}
	 * is calling and returning the result of the function {@link Vec2fR#addN(float, float)}.
	 */
	@Test
	void addN_arrayTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		Vec2fR result = mock(Vec2fR.class);
		
		when(v.addN(new float[] {1.0f, 2.0f})).thenCallRealMethod();

		when(v.addN(1.0f, 2.0f)).thenReturn(result);
		
		assertSame(result, v.addN(new float[] {1.0f, 2.0f}));
		
		verify(v).addN(new float[] {1.0f, 2.0f});

		verify(v).addN(1.0f, 2.0f);
		
		verifyNoMoreInteractions(v);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#subN(SimpleVec2fR)}
	 * is calling and returning the result of the function {@link Vec2fR#subN(float, float)}.
	 */
	@Test
	void subN_vectorTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		Vec2fR result = mock(Vec2fR.class);
		
		when(v.subN(v2)).thenCallRealMethod();
		
		when(v2.getX()).thenReturn(1.0f);
		when(v2.getY()).thenReturn(2.0f);
		
		when(v.subN(1.0f, 2.0f)).thenReturn(result);
		
		assertSame(result, v.subN(v2));
		
		verify(v).subN(v2);
		
		verify(v2).getX();
		verify(v2).getY();
		
		verify(v).subN(1.0f, 2.0f);
		
		verifyNoMoreInteractions(v, v2);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#subN(float)}
	 * is calling and returning the result of the function {@link Vec2fR#subN(float, float)}.
	 */
	@Test
	void subN_valueTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		Vec2fR result = mock(Vec2fR.class);
		
		when(v.subN(1.0f)).thenCallRealMethod();

		when(v.subN(1.0f, 1.0f)).thenReturn(result);
		
		assertSame(result, v.subN(1.0f));
		
		verify(v).subN(1.0f);

		verify(v).subN(1.0f, 1.0f);
		
		verifyNoMoreInteractions(v);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#subN(float[])}
	 * is calling and returning the result of the function {@link Vec2fR#subN(float, float)}.
	 */
	@Test
	void subN_arrayTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		Vec2fR result = mock(Vec2fR.class);
		
		when(v.subN(new float[] {1.0f, 2.0f})).thenCallRealMethod();

		when(v.subN(1.0f, 2.0f)).thenReturn(result);
		
		assertSame(result, v.subN(new float[] {1.0f, 2.0f}));
		
		verify(v).subN(new float[] {1.0f, 2.0f});

		verify(v).subN(1.0f, 2.0f);
		
		verifyNoMoreInteractions(v);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#revSubN(SimpleVec2fR)}
	 * is calling and returning the result of the function {@link Vec2fR#revSubN(float, float)}.
	 */
	@Test
	void revSubN_vectorTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		Vec2fR result = mock(Vec2fR.class);
		
		when(v.revSubN(v2)).thenCallRealMethod();
		
		when(v2.getX()).thenReturn(1.0f);
		when(v2.getY()).thenReturn(2.0f);
		
		when(v.revSubN(1.0f, 2.0f)).thenReturn(result);
		
		assertSame(result, v.revSubN(v2));
		
		verify(v).revSubN(v2);
		
		verify(v2).getX();
		verify(v2).getY();
		
		verify(v).revSubN(1.0f, 2.0f);
		
		verifyNoMoreInteractions(v, v2);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#revSubN(float)}
	 * is calling and returning the result of the function {@link Vec2fR#revSubN(float, float)}.
	 */
	@Test
	void revSubN_valueTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		Vec2fR result = mock(Vec2fR.class);
		
		when(v.revSubN(1.0f)).thenCallRealMethod();

		when(v.revSubN(1.0f, 1.0f)).thenReturn(result);
		
		assertSame(result, v.revSubN(1.0f));
		
		verify(v).revSubN(1.0f);

		verify(v).revSubN(1.0f, 1.0f);
		
		verifyNoMoreInteractions(v);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#revSubN(float[])}
	 * is calling and returning the result of the function {@link Vec2fR#revSubN(float, float)}.
	 */
	@Test
	void revSubN_arrayTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		Vec2fR result = mock(Vec2fR.class);
		
		when(v.revSubN(new float[] {1.0f, 2.0f})).thenCallRealMethod();

		when(v.revSubN(1.0f, 2.0f)).thenReturn(result);
		
		assertSame(result, v.revSubN(new float[] {1.0f, 2.0f}));
		
		verify(v).revSubN(new float[] {1.0f, 2.0f});

		verify(v).revSubN(1.0f, 2.0f);
		
		verifyNoMoreInteractions(v);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#mulN(SimpleVec2fR)}
	 * is calling and returning the result of the function {@link Vec2fR#mulN(float, float)}.
	 */
	@Test
	void mulN_vectorTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		Vec2fR result = mock(Vec2fR.class);
		
		when(v.mulN(v2)).thenCallRealMethod();
		
		when(v2.getX()).thenReturn(1.0f);
		when(v2.getY()).thenReturn(2.0f);
		
		when(v.mulN(1.0f, 2.0f)).thenReturn(result);
		
		assertSame(result, v.mulN(v2));
		
		verify(v).mulN(v2);
		
		verify(v2).getX();
		verify(v2).getY();
		
		verify(v).mulN(1.0f, 2.0f);
		
		verifyNoMoreInteractions(v, v2);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#mulN(float)}
	 * is calling and returning the result of the function {@link Vec2fR#mulN(float, float)}.
	 */
	@Test
	void mulN_valueTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		Vec2fR result = mock(Vec2fR.class);
		
		when(v.mulN(1.0f)).thenCallRealMethod();

		when(v.mulN(1.0f, 1.0f)).thenReturn(result);
		
		assertSame(result, v.mulN(1.0f));
		
		verify(v).mulN(1.0f);

		verify(v).mulN(1.0f, 1.0f);
		
		verifyNoMoreInteractions(v);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#mulN(float[])}
	 * is calling and returning the result of the function {@link Vec2fR#mulN(float, float)}.
	 */
	@Test
	void mulN_arrayTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		Vec2fR result = mock(Vec2fR.class);
		
		when(v.mulN(new float[] {1.0f, 2.0f})).thenCallRealMethod();

		when(v.mulN(1.0f, 2.0f)).thenReturn(result);
		
		assertSame(result, v.mulN(new float[] {1.0f, 2.0f}));
		
		verify(v).mulN(new float[] {1.0f, 2.0f});

		verify(v).mulN(1.0f, 2.0f);
		
		verifyNoMoreInteractions(v);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#divN(SimpleVec2fR)}
	 * is calling and returning the result of the function {@link Vec2fR#divN(float, float)}.
	 */
	@Test
	void divN_vectorTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		Vec2fR result = mock(Vec2fR.class);
		
		when(v.divN(v2)).thenCallRealMethod();
		
		when(v2.getX()).thenReturn(1.0f);
		when(v2.getY()).thenReturn(2.0f);
		
		when(v.divN(1.0f, 2.0f)).thenReturn(result);
		
		assertSame(result, v.divN(v2));
		
		verify(v).divN(v2);
		
		verify(v2).getX();
		verify(v2).getY();
		
		verify(v).divN(1.0f, 2.0f);
		
		verifyNoMoreInteractions(v, v2);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#divN(float)}
	 * is calling and returning the result of the function {@link Vec2fR#divN(float, float)}.
	 */
	@Test
	void divN_valueTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		Vec2fR result = mock(Vec2fR.class);
		
		when(v.divN(1.0f)).thenCallRealMethod();

		when(v.divN(1.0f, 1.0f)).thenReturn(result);
		
		assertSame(result, v.divN(1.0f));
		
		verify(v).divN(1.0f);

		verify(v).divN(1.0f, 1.0f);
		
		verifyNoMoreInteractions(v);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#divN(float[])}
	 * is calling and returning the result of the function {@link Vec2fR#divN(float, float)}.
	 */
	@Test
	void divN_arrayTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		Vec2fR result = mock(Vec2fR.class);
		
		when(v.divN(new float[] {1.0f, 2.0f})).thenCallRealMethod();

		when(v.divN(1.0f, 2.0f)).thenReturn(result);
		
		assertSame(result, v.divN(new float[] {1.0f, 2.0f}));
		
		verify(v).divN(new float[] {1.0f, 2.0f});

		verify(v).divN(1.0f, 2.0f);
		
		verifyNoMoreInteractions(v);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#revDivN(SimpleVec2fR)}
	 * is calling and returning the result of the function {@link Vec2fR#revDivN(float, float)}.
	 */
	@Test
	void revDivN_vectorTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		Vec2fR result = mock(Vec2fR.class);
		
		when(v.revDivN(v2)).thenCallRealMethod();
		
		when(v2.getX()).thenReturn(1.0f);
		when(v2.getY()).thenReturn(2.0f);
		
		when(v.revDivN(1.0f, 2.0f)).thenReturn(result);
		
		assertSame(result, v.revDivN(v2));
		
		verify(v).revDivN(v2);
		
		verify(v2).getX();
		verify(v2).getY();
		
		verify(v).revDivN(1.0f, 2.0f);
		
		verifyNoMoreInteractions(v, v2);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#revDivN(float)}
	 * is calling and returning the result of the function {@link Vec2fR#revDivN(float, float)}.
	 */
	@Test
	void revDivN_valueTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		Vec2fR result = mock(Vec2fR.class);
		
		when(v.revDivN(1.0f)).thenCallRealMethod();

		when(v.revDivN(1.0f, 1.0f)).thenReturn(result);
		
		assertSame(result, v.revDivN(1.0f));
		
		verify(v).revDivN(1.0f);

		verify(v).revDivN(1.0f, 1.0f);
		
		verifyNoMoreInteractions(v);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#revDivN(float[])}
	 * is calling and returning the result of the function {@link Vec2fR#revDivN(float, float)}.
	 */
	@Test
	void revDivN_arrayTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		Vec2fR result = mock(Vec2fR.class);
		
		when(v.revDivN(new float[] {1.0f, 2.0f})).thenCallRealMethod();

		when(v.revDivN(1.0f, 2.0f)).thenReturn(result);
		
		assertSame(result, v.revDivN(new float[] {1.0f, 2.0f}));
		
		verify(v).revDivN(new float[] {1.0f, 2.0f});

		verify(v).revDivN(1.0f, 2.0f);
		
		verifyNoMoreInteractions(v);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#vectorToN(SimpleVec2fR)}
	 * is calling and returning the result of the function {@link Vec2fR#vectorToN(float, float)}.
	 */
	@Test
	void vectorToN_vectorTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		Vec2fR result = mock(Vec2fR.class);
		
		when(v.vectorToN(v2)).thenCallRealMethod();
		
		when(v2.getX()).thenReturn(1.0f);
		when(v2.getY()).thenReturn(2.0f);
		
		when(v.vectorToN(1.0f, 2.0f)).thenReturn(result);
		
		assertSame(result, v.vectorToN(v2));
		
		verify(v).vectorToN(v2);
		
		verify(v2).getX();
		verify(v2).getY();
		
		verify(v).vectorToN(1.0f, 2.0f);
		
		verifyNoMoreInteractions(v, v2);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#vectorToN(float[])}
	 * is calling and returning the result of the function {@link Vec2fR#vectorToN(float, float)}.
	 */
	@Test
	void vectorToN_arrayTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		Vec2fR result = mock(Vec2fR.class);
		
		when(v.vectorToN(new float[] {1.0f, 2.0f})).thenCallRealMethod();

		when(v.vectorToN(1.0f, 2.0f)).thenReturn(result);
		
		assertSame(result, v.vectorToN(new float[] {1.0f, 2.0f}));
		
		verify(v).vectorToN(new float[] {1.0f, 2.0f});

		verify(v).vectorToN(1.0f, 2.0f);
		
		verifyNoMoreInteractions(v);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#halfVectorToN(SimpleVec2fR)}
	 * is calling and returning the result of the function {@link Vec2fR#halfVectorToN(float, float)}.
	 */
	@Test
	void halfVectorToN_vectorTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		Vec2fR result = mock(Vec2fR.class);
		
		when(v.halfVectorToN(v2)).thenCallRealMethod();
		
		when(v2.getX()).thenReturn(1.0f);
		when(v2.getY()).thenReturn(2.0f);
		
		when(v.halfVectorToN(1.0f, 2.0f)).thenReturn(result);
		
		assertSame(result, v.halfVectorToN(v2));
		
		verify(v).halfVectorToN(v2);
		
		verify(v2).getX();
		verify(v2).getY();
		
		verify(v).halfVectorToN(1.0f, 2.0f);
		
		verifyNoMoreInteractions(v, v2);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#halfVectorToN(float[])}
	 * is calling and returning the result of the function {@link Vec2fR#halfVectorToN(float, float)}.
	 */
	@Test
	void halfVectorToN_arrayTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		Vec2fR result = mock(Vec2fR.class);
		
		when(v.halfVectorToN(new float[] {1.0f, 2.0f})).thenCallRealMethod();

		when(v.halfVectorToN(1.0f, 2.0f)).thenReturn(result);
		
		assertSame(result, v.halfVectorToN(new float[] {1.0f, 2.0f}));
		
		verify(v).halfVectorToN(new float[] {1.0f, 2.0f});

		verify(v).halfVectorToN(1.0f, 2.0f);
		
		verifyNoMoreInteractions(v);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#halfPointN(SimpleVec2fR)}
	 * is calling and returning the result of the function {@link Vec2fR#halfPointN(float, float)}.
	 */
	@Test
	void halfPointN_vectorTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		Vec2fR result = mock(Vec2fR.class);
		
		when(v.halfPointN(v2)).thenCallRealMethod();
		
		when(v2.getX()).thenReturn(1.0f);
		when(v2.getY()).thenReturn(2.0f);
		
		when(v.halfPointN(1.0f, 2.0f)).thenReturn(result);
		
		assertSame(result, v.halfPointN(v2));
		
		verify(v).halfPointN(v2);
		
		verify(v2).getX();
		verify(v2).getY();
		
		verify(v).halfPointN(1.0f, 2.0f);
		
		verifyNoMoreInteractions(v, v2);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#halfPointN(float[])}
	 * is calling and returning the result of the function {@link Vec2fR#halfPointN(float, float)}.
	 */
	@Test
	void halfPointN_arrayTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		Vec2fR result = mock(Vec2fR.class);
		
		when(v.halfPointN(new float[] {1.0f, 2.0f})).thenCallRealMethod();

		when(v.halfPointN(1.0f, 2.0f)).thenReturn(result);
		
		assertSame(result, v.halfPointN(new float[] {1.0f, 2.0f}));
		
		verify(v).halfPointN(new float[] {1.0f, 2.0f});

		verify(v).halfPointN(1.0f, 2.0f);
		
		verifyNoMoreInteractions(v);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#minVectorN(SimpleVec2fR)}
	 * is calling and returning the result of the function {@link Vec2fR#minVectorN(float, float)}.
	 */
	@Test
	void minVectorN_vectorTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		Vec2fR result = mock(Vec2fR.class);
		
		when(v.minVectorN(v2)).thenCallRealMethod();
		
		when(v2.getX()).thenReturn(1.0f);
		when(v2.getY()).thenReturn(2.0f);
		
		when(v.minVectorN(1.0f, 2.0f)).thenReturn(result);
		
		assertSame(result, v.minVectorN(v2));
		
		verify(v).minVectorN(v2);
		
		verify(v2).getX();
		verify(v2).getY();
		
		verify(v).minVectorN(1.0f, 2.0f);
		
		verifyNoMoreInteractions(v, v2);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#minVectorN(float[])}
	 * is calling and returning the result of the function {@link Vec2fR#minVectorN(float, float)}.
	 */
	@Test
	void minVectorN_arrayTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		Vec2fR result = mock(Vec2fR.class);
		
		when(v.minVectorN(new float[] {1.0f, 2.0f})).thenCallRealMethod();

		when(v.minVectorN(1.0f, 2.0f)).thenReturn(result);
		
		assertSame(result, v.minVectorN(new float[] {1.0f, 2.0f}));
		
		verify(v).minVectorN(new float[] {1.0f, 2.0f});

		verify(v).minVectorN(1.0f, 2.0f);
		
		verifyNoMoreInteractions(v);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#maxVectorN(SimpleVec2fR)}
	 * is calling and returning the result of the function {@link Vec2fR#maxVectorN(float, float)}.
	 */
	@Test
	void maxVectorN_vectorTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		Vec2fR result = mock(Vec2fR.class);
		
		when(v.maxVectorN(v2)).thenCallRealMethod();
		
		when(v2.getX()).thenReturn(1.0f);
		when(v2.getY()).thenReturn(2.0f);
		
		when(v.maxVectorN(1.0f, 2.0f)).thenReturn(result);
		
		assertSame(result, v.maxVectorN(v2));
		
		verify(v).maxVectorN(v2);
		
		verify(v2).getX();
		verify(v2).getY();
		
		verify(v).maxVectorN(1.0f, 2.0f);
		
		verifyNoMoreInteractions(v, v2);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Vec2fR#maxVectorN(float[])}
	 * is calling and returning the result of the function {@link Vec2fR#maxVectorN(float, float)}.
	 */
	@Test
	void maxVectorN_arrayTest()
	{
		Vec2fR v = mock(Vec2fR.class);
		Vec2fR result = mock(Vec2fR.class);
		
		when(v.maxVectorN(new float[] {1.0f, 2.0f})).thenCallRealMethod();

		when(v.maxVectorN(1.0f, 2.0f)).thenReturn(result);
		
		assertSame(result, v.maxVectorN(new float[] {1.0f, 2.0f}));
		
		verify(v).maxVectorN(new float[] {1.0f, 2.0f});

		verify(v).maxVectorN(1.0f, 2.0f);
		
		verifyNoMoreInteractions(v);
	}
}
