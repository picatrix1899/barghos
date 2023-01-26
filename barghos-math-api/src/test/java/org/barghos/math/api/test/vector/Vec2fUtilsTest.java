package org.barghos.math.api.test.vector;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.util.function.FloatFunction2;
import org.barghos.math.api.vector.SimpleVec2fC;
import org.barghos.math.api.vector.SimpleVec2fR;
import org.barghos.math.api.vector.Vec2fUtils;

/**
 * This class provides component tests for the class {@link Vec2fUtils}.
 * 
 * @author picatrix1899
 */
public class Vec2fUtilsTest
{
	/**
	 * This test ensures, that the function {@link Vec2fUtils#add(SimpleVec2fR, SimpleVec2fR, float[])}
	 * performs the operation correct.
	 */
	@Test
	void add_vec_vec_return_arr_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.add(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(8.0f, res[0]);
		assertEquals(12.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#add(SimpleVec2fR, float[], float[])}
	 * performs the operation correct.
	 */
	@Test
	void add_vec_arr_return_arr_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float[] v2 = new float[] {6.0f, 8.0f};
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.add(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(8.0f, res[0]);
		assertEquals(12.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#add(SimpleVec2fR, float, float, float[])}
	 * performs the operation correct.
	 */
	@Test
	void add_vec_val_return_arr_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float v2x = 6.0f;
		float v2y = 8.0f;
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.add(v1, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(8.0f, res[0]);
		assertEquals(12.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#add(float[], SimpleVec2fR, float[])}
	 * performs the operation correct.
	 */
	@Test
	void add_arr_vec_return_arr_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.add(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(8.0f, res[0]);
		assertEquals(12.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#add(float[], float[], float[])}
	 * performs the operation correct.
	 */
	@Test
	void add_arr_arr_return_arr_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		float[] v2 = new float[] {6.0f, 8.0f};
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.add(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(8.0f, res[0]);
		assertEquals(12.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#add(float[], float, float, float[])}
	 * performs the operation correct.
	 */
	@Test
	void add_arr_val_return_arr_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		float v2x = 6.0f;
		float v2y = 8.0f;
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.add(v1, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(8.0f, res[0]);
		assertEquals(12.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#add(float, float, SimpleVec2fR, float[])}
	 * performs the operation correct.
	 */
	@Test
	void add_val_vec_return_arr_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.add(v1x, v1y, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(8.0f, res[0]);
		assertEquals(12.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#add(float, float, float[], float[])}
	 * performs the operation correct.
	 */
	@Test
	void add_val_arr_return_arr_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		float[] v2 = new float[] {6.0f, 8.0f};
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.add(v1x, v1y, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(8.0f, res[0]);
		assertEquals(12.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#add(float, float, float, float, float[])}
	 * performs the operation correct.
	 */
	@Test
	void add_val_val_return_arr_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		float v2x = 6.0f;
		float v2y = 8.0f;
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.add(v1x, v1y, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(8.0f, res[0]);
		assertEquals(12.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#add(SimpleVec2fR, SimpleVec2fR, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void add_vec_vec_return_vec_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		when(extractionParam.set(8.0f, 12.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.add(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(8.0f, 12.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#add(SimpleVec2fR, float[], SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void add_vec_arr_return_vec_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float[] v2 = new float[] {6.0f, 8.0f};
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(extractionParam.set(8.0f, 12.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.add(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(8.0f, 12.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#add(SimpleVec2fR, float, float, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void add_vec_val_return_vec_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float v2x = 6.0f;
		float v2y = 8.0f;
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(extractionParam.set(8.0f, 12.0f)).thenReturn(extractionParam);

		SimpleVec2fC res = Vec2fUtils.add(v1, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(8.0f, 12.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#add(float[], SimpleVec2fR, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void add_arr_vec_return_vec_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		when(extractionParam.set(8.0f, 12.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.add(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(8.0f, 12.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#add(float[], float[], SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void add_arr_arr_return_vec_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		float[] v2 = new float[] {6.0f, 8.0f};
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(extractionParam.set(8.0f, 12.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.add(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(8.0f, 12.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#add(float[], float, float, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void add_arr_val_return_vec_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		float v2x = 6.0f;
		float v2y = 8.0f;
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(extractionParam.set(8.0f, 12.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.add(v1, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(8.0f, 12.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#add(float, float, SimpleVec2fR, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void add_val_vec_return_vec_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		when(extractionParam.set(8.0f, 12.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.add(v1x, v1y, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(8.0f, 12.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#add(float, float, float[], SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void add_val_arr_return_vec_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		float[] v2 = new float[] {6.0f, 8.0f};
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(extractionParam.set(8.0f, 12.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.add(v1x, v1y, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(8.0f, 12.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#add(float, float, float, float, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void add_val_val_return_vec_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		float v2x = 6.0f;
		float v2y = 8.0f;
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(extractionParam.set(8.0f, 12.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.add(v1x, v1y, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(8.0f, 12.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#addFunc(SimpleVec2fR, SimpleVec2fR, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void addFunc_vec_vec_return_obj_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		when(func.apply(8.0f, 12.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.addFunc(v1, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(8.0f, 12.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#addFunc(SimpleVec2fR, float[], FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void addFunc_vec_arr_return_obj_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float[] v2 = new float[] {6.0f, 8.0f};
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(func.apply(8.0f, 12.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.addFunc(v1, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(8.0f, 12.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#addFunc(SimpleVec2fR, float, float, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void addFunc_vec_val_return_obj_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float v2x = 6.0f;
		float v2y = 8.0f;
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(func.apply(8.0f, 12.0f)).thenReturn(result);

		Object res = Vec2fUtils.addFunc(v1, v2x, v2y, func);
		
		assertSame(result, res);
		
		verify(func).apply(8.0f, 12.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#addFunc(float[], SimpleVec2fR, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void addFunc_arr_vec_return_obj_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		when(func.apply(8.0f, 12.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.addFunc(v1, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(8.0f, 12.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#addFunc(float[], float[], FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void addFunc_arr_arr_return_obj_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		float[] v2 = new float[] {6.0f, 8.0f};
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(func.apply(8.0f, 12.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.addFunc(v1, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(8.0f, 12.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#addFunc(float[], float, float, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void addFunc_arr_val_return_obj_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		float v2x = 6.0f;
		float v2y = 8.0f;
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(func.apply(8.0f, 12.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.addFunc(v1, v2x, v2y, func);
		
		assertSame(result, res);
		
		verify(func).apply(8.0f, 12.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#addFunc(float, float, SimpleVec2fR, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void addFunc_val_vec_return_obj_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		when(func.apply(8.0f, 12.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.addFunc(v1x, v1y, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(8.0f, 12.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#addFunc(float, float, float[], FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void addFunc_val_arr_return_obj_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		float[] v2 = new float[] {6.0f, 8.0f};
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(func.apply(8.0f, 12.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.addFunc(v1x, v1y, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(8.0f, 12.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#addFunc(float, float, float, float, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void addFunc_val_val_return_obj_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		float v2x = 6.0f;
		float v2y = 8.0f;
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(func.apply(8.0f, 12.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.addFunc(v1x, v1y, v2x, v2y, func);
		
		assertSame(result, res);
		
		verify(func).apply(8.0f, 12.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#sub(SimpleVec2fR, SimpleVec2fR, float[])}
	 * performs the operation correct.
	 */
	@Test
	void sub_vec_vec_return_arr_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(10.0f);
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.sub(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(-4.0f, res[0]);
		assertEquals(-6.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#sub(SimpleVec2fR, float[], float[])}
	 * performs the operation correct.
	 */
	@Test
	void sub_vec_arr_return_arr_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float[] v2 = new float[] {6.0f, 10.0f};
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.sub(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(-4.0f, res[0]);
		assertEquals(-6.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#sub(SimpleVec2fR, float, float, float[])}
	 * performs the operation correct.
	 */
	@Test
	void sub_vec_val_return_arr_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float v2x = 6.0f;
		float v2y = 10.0f;
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.sub(v1, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(-4.0f, res[0]);
		assertEquals(-6.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#sub(float[], SimpleVec2fR, float[])}
	 * performs the operation correct.
	 */
	@Test
	void sub_arr_vec_return_arr_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(10.0f);
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.sub(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(-4.0f, res[0]);
		assertEquals(-6.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#sub(float[], float[], float[])}
	 * performs the operation correct.
	 */
	@Test
	void sub_arr_arr_return_arr_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		float[] v2 = new float[] {6.0f, 10.0f};
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.sub(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(-4.0f, res[0]);
		assertEquals(-6.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#sub(float[], float, float, float[])}
	 * performs the operation correct.
	 */
	@Test
	void sub_arr_val_return_arr_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		float v2x = 6.0f;
		float v2y = 10.0f;
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.sub(v1, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(-4.0f, res[0]);
		assertEquals(-6.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#sub(float, float, SimpleVec2fR, float[])}
	 * performs the operation correct.
	 */
	@Test
	void sub_val_vec_return_arr_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(10.0f);
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.sub(v1x, v1y, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(-4.0f, res[0]);
		assertEquals(-6.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#sub(float, float, float[], float[])}
	 * performs the operation correct.
	 */
	@Test
	void sub_val_arr_return_arr_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		float[] v2 = new float[] {6.0f, 10.0f};
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.sub(v1x, v1y, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(-4.0f, res[0]);
		assertEquals(-6.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#sub(float, float, float, float, float[])}
	 * performs the operation correct.
	 */
	@Test
	void sub_val_val_return_arr_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		float v2x = 6.0f;
		float v2y = 10.0f;
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.sub(v1x, v1y, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(-4.0f, res[0]);
		assertEquals(-6.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#sub(SimpleVec2fR, SimpleVec2fR, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void sub_vec_vec_return_vec_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(10.0f);
		
		when(extractionParam.set(-4.0f, -6.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.sub(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(-4.0f, -6.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#sub(SimpleVec2fR, float[], SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void sub_vec_arr_return_vec_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float[] v2 = new float[] {6.0f, 10.0f};
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(extractionParam.set(-4.0f, -6.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.sub(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(-4.0f, -6.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#sub(SimpleVec2fR, float, float, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void sub_vec_val_return_vec_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float v2x = 6.0f;
		float v2y = 10.0f;
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(extractionParam.set(-4.0f, -6.0f)).thenReturn(extractionParam);

		SimpleVec2fC res = Vec2fUtils.sub(v1, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(-4.0f, -6.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#sub(float[], SimpleVec2fR, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void sub_arr_vec_return_vec_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(10.0f);
		
		when(extractionParam.set(-4.0f, -6.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.sub(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(-4.0f, -6.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#sub(float[], float[], SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void sub_arr_arr_return_vec_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		float[] v2 = new float[] {6.0f, 10.0f};
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(extractionParam.set(-4.0f, -6.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.sub(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(-4.0f, -6.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#sub(float[], float, float, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void sub_arr_val_return_vec_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		float v2x = 6.0f;
		float v2y = 10.0f;
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(extractionParam.set(-4.0f, -6.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.sub(v1, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(-4.0f, -6.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#sub(float, float, SimpleVec2fR, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void sub_val_vec_return_vec_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(10.0f);
		
		when(extractionParam.set(-4.0f, -6.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.sub(v1x, v1y, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(-4.0f, -6.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#sub(float, float, float[], SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void sub_val_arr_return_vec_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		float[] v2 = new float[] {6.0f, 10.0f};
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(extractionParam.set(-4.0f, -6.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.sub(v1x, v1y, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(-4.0f, -6.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#sub(float, float, float, float, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void sub_val_val_return_vec_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		float v2x = 6.0f;
		float v2y = 10.0f;
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(extractionParam.set(-4.0f, -6.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.sub(v1x, v1y, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(-4.0f, -6.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#subFunc(SimpleVec2fR, SimpleVec2fR, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void subFunc_vec_vec_return_obj_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(10.0f);
		
		when(func.apply(-4.0f, -6.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.subFunc(v1, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(-4.0f, -6.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#subFunc(SimpleVec2fR, float[], FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void subFunc_vec_arr_return_obj_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float[] v2 = new float[] {6.0f, 10.0f};
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(func.apply(-4.0f, -6.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.subFunc(v1, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(-4.0f, -6.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#subFunc(SimpleVec2fR, float, float, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void subFunc_vec_val_return_obj_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float v2x = 6.0f;
		float v2y = 10.0f;
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(func.apply(-4.0f, -6.0f)).thenReturn(result);

		Object res = Vec2fUtils.subFunc(v1, v2x, v2y, func);
		
		assertSame(result, res);
		
		verify(func).apply(-4.0f, -6.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#subFunc(float[], SimpleVec2fR, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void subFunc_arr_vec_return_obj_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(10.0f);
		
		when(func.apply(-4.0f, -6.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.subFunc(v1, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(-4.0f, -6.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#subFunc(float[], float[], FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void subFunc_arr_arr_return_obj_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		float[] v2 = new float[] {6.0f, 10.0f};
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(func.apply(-4.0f, -6.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.subFunc(v1, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(-4.0f, -6.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#subFunc(float[], float, float, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void subFunc_arr_val_return_obj_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		float v2x = 6.0f;
		float v2y = 10.0f;
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(func.apply(-4.0f, -6.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.subFunc(v1, v2x, v2y, func);
		
		assertSame(result, res);
		
		verify(func).apply(-4.0f, -6.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#subFunc(float, float, SimpleVec2fR, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void subFunc_val_vec_return_obj_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(10.0f);
		
		when(func.apply(-4.0f, -6.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.subFunc(v1x, v1y, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(-4.0f, -6.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#subFunc(float, float, float[], FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void subFunc_val_arr_return_obj_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		float[] v2 = new float[] {6.0f, 10.0f};
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(func.apply(-4.0f, -6.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.subFunc(v1x, v1y, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(-4.0f, -6.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#subFunc(float, float, float, float, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void subFunc_val_val_return_obj_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		float v2x = 6.0f;
		float v2y = 10.0f;
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(func.apply(-4.0f, -6.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.subFunc(v1x, v1y, v2x, v2y, func);
		
		assertSame(result, res);
		
		verify(func).apply(-4.0f, -6.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revSub(SimpleVec2fR, SimpleVec2fR, float[])}
	 * performs the operation correct.
	 */
	@Test
	void revSub_vec_vec_return_arr_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(10.0f);
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.revSub(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(4.0f, res[0]);
		assertEquals(6.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revSub(SimpleVec2fR, float[], float[])}
	 * performs the operation correct.
	 */
	@Test
	void revSub_vec_arr_return_arr_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float[] v2 = new float[] {6.0f, 10.0f};
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.revSub(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(4.0f, res[0]);
		assertEquals(6.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revSub(SimpleVec2fR, float, float, float[])}
	 * performs the operation correct.
	 */
	@Test
	void revSub_vec_val_return_arr_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float v2x = 6.0f;
		float v2y = 10.0f;
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.revSub(v1, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(4.0f, res[0]);
		assertEquals(6.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revSub(float[], SimpleVec2fR, float[])}
	 * performs the operation correct.
	 */
	@Test
	void revSub_arr_vec_return_arr_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(10.0f);
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.revSub(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(4.0f, res[0]);
		assertEquals(6.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revSub(float[], float[], float[])}
	 * performs the operation correct.
	 */
	@Test
	void revSub_arr_arr_return_arr_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		float[] v2 = new float[] {6.0f, 10.0f};
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.revSub(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(4.0f, res[0]);
		assertEquals(6.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revSub(float[], float, float, float[])}
	 * performs the operation correct.
	 */
	@Test
	void revSub_arr_val_return_arr_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		float v2x = 6.0f;
		float v2y = 10.0f;
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.revSub(v1, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(4.0f, res[0]);
		assertEquals(6.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revSub(float, float, SimpleVec2fR, float[])}
	 * performs the operation correct.
	 */
	@Test
	void revSub_val_vec_return_arr_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(10.0f);
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.revSub(v1x, v1y, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(4.0f, res[0]);
		assertEquals(6.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revSub(float, float, float[], float[])}
	 * performs the operation correct.
	 */
	@Test
	void revSub_val_arr_return_arr_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		float[] v2 = new float[] {6.0f, 10.0f};
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.revSub(v1x, v1y, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(4.0f, res[0]);
		assertEquals(6.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revSub(float, float, float, float, float[])}
	 * performs the operation correct.
	 */
	@Test
	void revSub_val_val_return_arr_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		float v2x = 6.0f;
		float v2y = 10.0f;
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.revSub(v1x, v1y, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(4.0f, res[0]);
		assertEquals(6.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revSub(SimpleVec2fR, SimpleVec2fR, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void revSub_vec_vec_return_vec_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(10.0f);
		
		when(extractionParam.set(4.0f, 6.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.revSub(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(4.0f, 6.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revSub(SimpleVec2fR, float[], SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void revSub_vec_arr_return_vec_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float[] v2 = new float[] {6.0f, 10.0f};
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(extractionParam.set(4.0f, 6.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.revSub(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(4.0f, 6.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revSub(SimpleVec2fR, float, float, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void revSub_vec_val_return_vec_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float v2x = 6.0f;
		float v2y = 10.0f;
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(extractionParam.set(4.0f, 6.0f)).thenReturn(extractionParam);

		SimpleVec2fC res = Vec2fUtils.revSub(v1, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(4.0f, 6.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revSub(float[], SimpleVec2fR, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void revSub_arr_vec_return_vec_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(10.0f);
		
		when(extractionParam.set(4.0f, 6.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.revSub(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(4.0f, 6.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revSub(float[], float[], SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void revSub_arr_arr_return_vec_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		float[] v2 = new float[] {6.0f, 10.0f};
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(extractionParam.set(4.0f, 6.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.revSub(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(4.0f, 6.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revSub(float[], float, float, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void revSub_arr_val_return_vec_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		float v2x = 6.0f;
		float v2y = 10.0f;
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(extractionParam.set(4.0f, 6.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.revSub(v1, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(4.0f, 6.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revSub(float, float, SimpleVec2fR, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void revSub_val_vec_return_vec_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(10.0f);
		
		when(extractionParam.set(4.0f, 6.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.revSub(v1x, v1y, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(4.0f, 6.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revSub(float, float, float[], SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void revSub_val_arr_return_vec_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		float[] v2 = new float[] {6.0f, 10.0f};
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(extractionParam.set(4.0f, 6.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.revSub(v1x, v1y, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(4.0f, 6.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revSub(float, float, float, float, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void revSub_val_val_return_vec_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		float v2x = 6.0f;
		float v2y = 10.0f;
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(extractionParam.set(4.0f, 6.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.revSub(v1x, v1y, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(4.0f, 6.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revSubFunc(SimpleVec2fR, SimpleVec2fR, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void revSubFunc_vec_vec_return_obj_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(10.0f);
		
		when(func.apply(4.0f, 6.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.revSubFunc(v1, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(4.0f, 6.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revSubFunc(SimpleVec2fR, float[], FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void revSubFunc_vec_arr_return_obj_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float[] v2 = new float[] {6.0f, 10.0f};
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(func.apply(4.0f, 6.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.revSubFunc(v1, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(4.0f, 6.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revSubFunc(SimpleVec2fR, float, float, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void revSubFunc_vec_val_return_obj_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float v2x = 6.0f;
		float v2y = 10.0f;
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(func.apply(4.0f, 6.0f)).thenReturn(result);

		Object res = Vec2fUtils.revSubFunc(v1, v2x, v2y, func);
		
		assertSame(result, res);
		
		verify(func).apply(4.0f, 6.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revSubFunc(float[], SimpleVec2fR, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void revSubFunc_arr_vec_return_obj_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(10.0f);
		
		when(func.apply(4.0f, 6.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.revSubFunc(v1, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(4.0f, 6.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revSubFunc(float[], float[], FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void revSubFunc_arr_arr_return_obj_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		float[] v2 = new float[] {6.0f, 10.0f};
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(func.apply(4.0f, 6.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.revSubFunc(v1, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(4.0f, 6.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revSubFunc(float[], float, float, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void revSubFunc_arr_val_return_obj_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		float v2x = 6.0f;
		float v2y = 10.0f;
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(func.apply(4.0f, 6.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.revSubFunc(v1, v2x, v2y, func);
		
		assertSame(result, res);
		
		verify(func).apply(4.0f, 6.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revSubFunc(float, float, SimpleVec2fR, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void revSubFunc_val_vec_return_obj_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(10.0f);
		
		when(func.apply(4.0f, 6.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.revSubFunc(v1x, v1y, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(4.0f, 6.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revSubFunc(float, float, float[], FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void revSubFunc_val_arr_return_obj_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		float[] v2 = new float[] {6.0f, 10.0f};
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(func.apply(4.0f, 6.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.revSubFunc(v1x, v1y, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(4.0f, 6.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revSubFunc(float, float, float, float, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void revSubFunc_val_val_return_obj_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		float v2x = 6.0f;
		float v2y = 10.0f;
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(func.apply(4.0f, 6.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.revSubFunc(v1x, v1y, v2x, v2y, func);
		
		assertSame(result, res);
		
		verify(func).apply(4.0f, 6.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#mul(SimpleVec2fR, SimpleVec2fR, float[])}
	 * performs the operation correct.
	 */
	@Test
	void mul_vec_vec_return_arr_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.mul(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(12.0f, res[0]);
		assertEquals(32.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#mul(SimpleVec2fR, float[], float[])}
	 * performs the operation correct.
	 */
	@Test
	void mul_vec_arr_return_arr_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float[] v2 = new float[] {6.0f, 8.0f};
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.mul(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(12.0f, res[0]);
		assertEquals(32.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#mul(SimpleVec2fR, float, float, float[])}
	 * performs the operation correct.
	 */
	@Test
	void mul_vec_val_return_arr_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float v2x = 6.0f;
		float v2y = 8.0f;
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.mul(v1, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(12.0f, res[0]);
		assertEquals(32.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#mul(float[], SimpleVec2fR, float[])}
	 * performs the operation correct.
	 */
	@Test
	void mul_arr_vec_return_arr_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.mul(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(12.0f, res[0]);
		assertEquals(32.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#mul(float[], float[], float[])}
	 * performs the operation correct.
	 */
	@Test
	void mul_arr_arr_return_arr_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		float[] v2 = new float[] {6.0f, 8.0f};
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.mul(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(12.0f, res[0]);
		assertEquals(32.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#mul(float[], float, float, float[])}
	 * performs the operation correct.
	 */
	@Test
	void mul_arr_val_return_arr_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		float v2x = 6.0f;
		float v2y = 8.0f;
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.mul(v1, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(12.0f, res[0]);
		assertEquals(32.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#mul(float, float, SimpleVec2fR, float[])}
	 * performs the operation correct.
	 */
	@Test
	void mul_val_vec_return_arr_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.mul(v1x, v1y, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(12.0f, res[0]);
		assertEquals(32.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#mul(float, float, float[], float[])}
	 * performs the operation correct.
	 */
	@Test
	void mul_val_arr_return_arr_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		float[] v2 = new float[] {6.0f, 8.0f};
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.mul(v1x, v1y, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(12.0f, res[0]);
		assertEquals(32.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#mul(float, float, float, float, float[])}
	 * performs the operation correct.
	 */
	@Test
	void mul_val_val_return_arr_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		float v2x = 6.0f;
		float v2y = 8.0f;
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.mul(v1x, v1y, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(12.0f, res[0]);
		assertEquals(32.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#mul(SimpleVec2fR, SimpleVec2fR, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void mul_vec_vec_return_vec_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		when(extractionParam.set(12.0f, 32.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.mul(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(12.0f, 32.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#mul(SimpleVec2fR, float[], SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void mul_vec_arr_return_vec_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float[] v2 = new float[] {6.0f, 8.0f};
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(extractionParam.set(12.0f, 32.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.mul(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(12.0f, 32.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#mul(SimpleVec2fR, float, float, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void mul_vec_val_return_vec_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float v2x = 6.0f;
		float v2y = 8.0f;
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(extractionParam.set(12.0f, 32.0f)).thenReturn(extractionParam);

		SimpleVec2fC res = Vec2fUtils.mul(v1, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(12.0f, 32.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#mul(float[], SimpleVec2fR, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void mul_arr_vec_return_vec_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		when(extractionParam.set(12.0f, 32.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.mul(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(12.0f, 32.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#mul(float[], float[], SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void mul_arr_arr_return_vec_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		float[] v2 = new float[] {6.0f, 8.0f};
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(extractionParam.set(12.0f, 32.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.mul(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(12.0f, 32.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#mul(float[], float, float, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void mul_arr_val_return_vec_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		float v2x = 6.0f;
		float v2y = 8.0f;
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(extractionParam.set(12.0f, 32.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.mul(v1, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(12.0f, 32.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#mul(float, float, SimpleVec2fR, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void mul_val_vec_return_vec_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		when(extractionParam.set(12.0f, 32.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.mul(v1x, v1y, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(12.0f, 32.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#mul(float, float, float[], SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void mul_val_arr_return_vec_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		float[] v2 = new float[] {6.0f, 8.0f};
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(extractionParam.set(12.0f, 32.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.mul(v1x, v1y, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(12.0f, 32.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#mul(float, float, float, float, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void mul_val_val_return_vec_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		float v2x = 6.0f;
		float v2y = 8.0f;
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(extractionParam.set(12.0f, 32.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.mul(v1x, v1y, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(12.0f, 32.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#mulFunc(SimpleVec2fR, SimpleVec2fR, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void mulFunc_vec_vec_return_obj_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		when(func.apply(12.0f, 32.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.mulFunc(v1, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(12.0f, 32.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#mulFunc(SimpleVec2fR, float[], FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void mulFunc_vec_arr_return_obj_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float[] v2 = new float[] {6.0f, 8.0f};
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(func.apply(12.0f, 32.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.mulFunc(v1, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(12.0f, 32.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#mulFunc(SimpleVec2fR, float, float, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void mulFunc_vec_val_return_obj_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float v2x = 6.0f;
		float v2y = 8.0f;
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(v1.getX()).thenReturn(2.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(func.apply(12.0f, 32.0f)).thenReturn(result);

		Object res = Vec2fUtils.mulFunc(v1, v2x, v2y, func);
		
		assertSame(result, res);
		
		verify(func).apply(12.0f, 32.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#mulFunc(float[], SimpleVec2fR, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void mulFunc_arr_vec_return_obj_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		when(func.apply(12.0f, 32.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.mulFunc(v1, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(12.0f, 32.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#mulFunc(float[], float[], FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void mulFunc_arr_arr_return_obj_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		float[] v2 = new float[] {6.0f, 8.0f};
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(func.apply(12.0f, 32.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.mulFunc(v1, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(12.0f, 32.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#mulFunc(float[], float, float, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void mulFunc_arr_val_return_obj_test()
	{
		float[] v1 = new float[] {2.0f, 4.0f};
		float v2x = 6.0f;
		float v2y = 8.0f;
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(func.apply(12.0f, 32.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.mulFunc(v1, v2x, v2y, func);
		
		assertSame(result, res);
		
		verify(func).apply(12.0f, 32.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#mulFunc(float, float, SimpleVec2fR, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void mulFunc_val_vec_return_obj_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(v2.getX()).thenReturn(6.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		when(func.apply(12.0f, 32.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.mulFunc(v1x, v1y, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(12.0f, 32.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#mulFunc(float, float, float[], FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void mulFunc_val_arr_return_obj_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		float[] v2 = new float[] {6.0f, 8.0f};
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(func.apply(12.0f, 32.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.mulFunc(v1x, v1y, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(12.0f, 32.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#mulFunc(float, float, float, float, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void mulFunc_val_val_return_obj_test()
	{
		float v1x = 2.0f;
		float v1y = 4.0f;
		float v2x = 6.0f;
		float v2y = 8.0f;
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(func.apply(12.0f, 32.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.mulFunc(v1x, v1y, v2x, v2y, func);
		
		assertSame(result, res);
		
		verify(func).apply(12.0f, 32.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#div(SimpleVec2fR, SimpleVec2fR, float[])}
	 * performs the operation correct.
	 */
	@Test
	void div_vec_vec_return_arr_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		when(v1.getX()).thenReturn(6.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(v2.getX()).thenReturn(3.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.div(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(2.0f, res[0]);
		assertEquals(0.5f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#div(SimpleVec2fR, float[], float[])}
	 * performs the operation correct.
	 */
	@Test
	void div_vec_arr_return_arr_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float[] v2 = new float[] {3.0f, 8.0f};
		
		when(v1.getX()).thenReturn(6.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.div(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(2.0f, res[0]);
		assertEquals(0.5f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#div(SimpleVec2fR, float, float, float[])}
	 * performs the operation correct.
	 */
	@Test
	void div_vec_val_return_arr_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float v2x = 3.0f;
		float v2y = 8.0f;
		
		when(v1.getX()).thenReturn(6.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.div(v1, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(2.0f, res[0]);
		assertEquals(0.5f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#div(float[], SimpleVec2fR, float[])}
	 * performs the operation correct.
	 */
	@Test
	void div_arr_vec_return_arr_test()
	{
		float[] v1 = new float[] {6.0f, 4.0f};
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		when(v2.getX()).thenReturn(3.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.div(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(2.0f, res[0]);
		assertEquals(0.5f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#div(float[], float[], float[])}
	 * performs the operation correct.
	 */
	@Test
	void div_arr_arr_return_arr_test()
	{
		float[] v1 = new float[] {6.0f, 4.0f};
		float[] v2 = new float[] {3.0f, 8.0f};
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.div(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(2.0f, res[0]);
		assertEquals(0.5f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#div(float[], float, float, float[])}
	 * performs the operation correct.
	 */
	@Test
	void div_arr_val_return_arr_test()
	{
		float[] v1 = new float[] {6.0f, 4.0f};
		float v2x = 3.0f;
		float v2y = 8.0f;
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.div(v1, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(2.0f, res[0]);
		assertEquals(0.5f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#div(float, float, SimpleVec2fR, float[])}
	 * performs the operation correct.
	 */
	@Test
	void div_val_vec_return_arr_test()
	{
		float v1x = 6.0f;
		float v1y = 4.0f;
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		when(v2.getX()).thenReturn(3.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.div(v1x, v1y, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(2.0f, res[0]);
		assertEquals(0.5f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#div(float, float, float[], float[])}
	 * performs the operation correct.
	 */
	@Test
	void div_val_arr_return_arr_test()
	{
		float v1x = 6.0f;
		float v1y = 4.0f;
		float[] v2 = new float[] {3.0f, 8.0f};
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.div(v1x, v1y, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(2.0f, res[0]);
		assertEquals(0.5f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#div(float, float, float, float, float[])}
	 * performs the operation correct.
	 */
	@Test
	void div_val_val_return_arr_test()
	{
		float v1x = 6.0f;
		float v1y = 4.0f;
		float v2x = 3.0f;
		float v2y = 8.0f;
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.div(v1x, v1y, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(2.0f, res[0]);
		assertEquals(0.5f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#div(SimpleVec2fR, SimpleVec2fR, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void div_vec_vec_return_vec_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(v1.getX()).thenReturn(6.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(v2.getX()).thenReturn(3.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		when(extractionParam.set(2.0f, 0.5f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.div(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(2.0f, 0.5f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#div(SimpleVec2fR, float[], SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void div_vec_arr_return_vec_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float[] v2 = new float[] {3.0f, 8.0f};
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(v1.getX()).thenReturn(6.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(extractionParam.set(2.0f, 0.5f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.div(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(2.0f, 0.5f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#div(SimpleVec2fR, float, float, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void div_vec_val_return_vec_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float v2x = 3.0f;
		float v2y = 8.0f;
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(v1.getX()).thenReturn(6.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(extractionParam.set(2.0f, 0.5f)).thenReturn(extractionParam);

		SimpleVec2fC res = Vec2fUtils.div(v1, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(2.0f, 0.5f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#div(float[], SimpleVec2fR, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void div_arr_vec_return_vec_test()
	{
		float[] v1 = new float[] {6.0f, 4.0f};
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(v2.getX()).thenReturn(3.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		when(extractionParam.set(2.0f, 0.5f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.div(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(2.0f, 0.5f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#div(float[], float[], SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void div_arr_arr_return_vec_test()
	{
		float[] v1 = new float[] {6.0f, 4.0f};
		float[] v2 = new float[] {3.0f, 8.0f};
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(extractionParam.set(2.0f, 0.5f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.div(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(2.0f, 0.5f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#div(float[], float, float, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void div_arr_val_return_vec_test()
	{
		float[] v1 = new float[] {6.0f, 4.0f};
		float v2x = 3.0f;
		float v2y = 8.0f;
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(extractionParam.set(2.0f, 0.5f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.div(v1, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(2.0f, 0.5f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#div(float, float, SimpleVec2fR, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void div_val_vec_return_vec_test()
	{
		float v1x = 6.0f;
		float v1y = 4.0f;
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(v2.getX()).thenReturn(3.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		when(extractionParam.set(2.0f, 0.5f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.div(v1x, v1y, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(2.0f, 0.5f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#div(float, float, float[], SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void div_val_arr_return_vec_test()
	{
		float v1x = 6.0f;
		float v1y = 4.0f;
		float[] v2 = new float[] {3.0f, 8.0f};
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(extractionParam.set(2.0f, 0.5f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.div(v1x, v1y, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(2.0f, 0.5f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#div(float, float, float, float, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void div_val_val_return_vec_test()
	{
		float v1x = 6.0f;
		float v1y = 4.0f;
		float v2x = 3.0f;
		float v2y = 8.0f;
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(extractionParam.set(2.0f, 0.5f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.div(v1x, v1y, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(2.0f, 0.5f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#divFunc(SimpleVec2fR, SimpleVec2fR, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void divFunc_vec_vec_return_obj_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(v1.getX()).thenReturn(6.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(v2.getX()).thenReturn(3.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		when(func.apply(2.0f, 0.5f)).thenReturn(result);
		
		Object res = Vec2fUtils.divFunc(v1, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(2.0f, 0.5f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#divFunc(SimpleVec2fR, float[], FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void divFunc_vec_arr_return_obj_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float[] v2 = new float[] {3.0f, 8.0f};
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(v1.getX()).thenReturn(6.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(func.apply(2.0f, 0.5f)).thenReturn(result);
		
		Object res = Vec2fUtils.divFunc(v1, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(2.0f, 0.5f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#divFunc(SimpleVec2fR, float, float, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void divFunc_vec_val_return_obj_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float v2x = 3.0f;
		float v2y = 8.0f;
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(v1.getX()).thenReturn(6.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(func.apply(2.0f, 0.5f)).thenReturn(result);

		Object res = Vec2fUtils.divFunc(v1, v2x, v2y, func);
		
		assertSame(result, res);
		
		verify(func).apply(2.0f, 0.5f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#divFunc(float[], SimpleVec2fR, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void divFunc_arr_vec_return_obj_test()
	{
		float[] v1 = new float[] {6.0f, 4.0f};
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(v2.getX()).thenReturn(3.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		when(func.apply(2.0f, 0.5f)).thenReturn(result);
		
		Object res = Vec2fUtils.divFunc(v1, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(2.0f, 0.5f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#divFunc(float[], float[], FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void divFunc_arr_arr_return_obj_test()
	{
		float[] v1 = new float[] {6.0f, 4.0f};
		float[] v2 = new float[] {3.0f, 8.0f};
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(func.apply(2.0f, 0.5f)).thenReturn(result);
		
		Object res = Vec2fUtils.divFunc(v1, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(2.0f, 0.5f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#divFunc(float[], float, float, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void divFunc_arr_val_return_obj_test()
	{
		float[] v1 = new float[] {6.0f, 4.0f};
		float v2x = 3.0f;
		float v2y = 8.0f;
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(func.apply(2.0f, 0.5f)).thenReturn(result);
		
		Object res = Vec2fUtils.divFunc(v1, v2x, v2y, func);
		
		assertSame(result, res);
		
		verify(func).apply(2.0f, 0.5f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#divFunc(float, float, SimpleVec2fR, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void divFunc_val_vec_return_obj_test()
	{
		float v1x = 6.0f;
		float v1y = 4.0f;
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(v2.getX()).thenReturn(3.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		when(func.apply(2.0f, 0.5f)).thenReturn(result);
		
		Object res = Vec2fUtils.divFunc(v1x, v1y, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(2.0f, 0.5f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#divFunc(float, float, float[], FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void divFunc_val_arr_return_obj_test()
	{
		float v1x = 6.0f;
		float v1y = 4.0f;
		float[] v2 = new float[] {3.0f, 8.0f};
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(func.apply(2.0f, 0.5f)).thenReturn(result);
		
		Object res = Vec2fUtils.divFunc(v1x, v1y, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(2.0f, 0.5f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#divFunc(float, float, float, float, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void divFunc_val_val_return_obj_test()
	{
		float v1x = 6.0f;
		float v1y = 4.0f;
		float v2x = 3.0f;
		float v2y = 8.0f;
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(func.apply(2.0f, 0.5f)).thenReturn(result);
		
		Object res = Vec2fUtils.divFunc(v1x, v1y, v2x, v2y, func);
		
		assertSame(result, res);
		
		verify(func).apply(2.0f, 0.5f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revDiv(SimpleVec2fR, SimpleVec2fR, float[])}
	 * performs the operation correct.
	 */
	@Test
	void revDiv_vec_vec_return_arr_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		when(v1.getX()).thenReturn(6.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(v2.getX()).thenReturn(3.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.revDiv(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(0.5f, res[0]);
		assertEquals(2.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revDiv(SimpleVec2fR, float[], float[])}
	 * performs the operation correct.
	 */
	@Test
	void revDiv_vec_arr_return_arr_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float[] v2 = new float[] {3.0f, 8.0f};
		
		when(v1.getX()).thenReturn(6.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.revDiv(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(0.5f, res[0]);
		assertEquals(2.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revDiv(SimpleVec2fR, float, float, float[])}
	 * performs the operation correct.
	 */
	@Test
	void revDiv_vec_val_return_arr_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float v2x = 3.0f;
		float v2y = 8.0f;
		
		when(v1.getX()).thenReturn(6.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.revDiv(v1, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(0.5f, res[0]);
		assertEquals(2.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revDiv(float[], SimpleVec2fR, float[])}
	 * performs the operation correct.
	 */
	@Test
	void revDiv_arr_vec_return_arr_test()
	{
		float[] v1 = new float[] {6.0f, 4.0f};
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		when(v2.getX()).thenReturn(3.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.revDiv(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(0.5f, res[0]);
		assertEquals(2.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revDiv(float[], float[], float[])}
	 * performs the operation correct.
	 */
	@Test
	void revDiv_arr_arr_return_arr_test()
	{
		float[] v1 = new float[] {6.0f, 4.0f};
		float[] v2 = new float[] {3.0f, 8.0f};
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.revDiv(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(0.5f, res[0]);
		assertEquals(2.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revDiv(float[], float, float, float[])}
	 * performs the operation correct.
	 */
	@Test
	void revDiv_arr_val_return_arr_test()
	{
		float[] v1 = new float[] {6.0f, 4.0f};
		float v2x = 3.0f;
		float v2y = 8.0f;
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.revDiv(v1, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(0.5f, res[0]);
		assertEquals(2.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revDiv(float, float, SimpleVec2fR, float[])}
	 * performs the operation correct.
	 */
	@Test
	void revDiv_val_vec_return_arr_test()
	{
		float v1x = 6.0f;
		float v1y = 4.0f;
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		when(v2.getX()).thenReturn(3.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.revDiv(v1x, v1y, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(0.5f, res[0]);
		assertEquals(2.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revDiv(float, float, float[], float[])}
	 * performs the operation correct.
	 */
	@Test
	void revDiv_val_arr_return_arr_test()
	{
		float v1x = 6.0f;
		float v1y = 4.0f;
		float[] v2 = new float[] {3.0f, 8.0f};
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.revDiv(v1x, v1y, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(0.5f, res[0]);
		assertEquals(2.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revDiv(float, float, float, float, float[])}
	 * performs the operation correct.
	 */
	@Test
	void revDiv_val_val_return_arr_test()
	{
		float v1x = 6.0f;
		float v1y = 4.0f;
		float v2x = 3.0f;
		float v2y = 8.0f;
		
		float[] extractionParam = new float[2];
		
		float[] res = Vec2fUtils.revDiv(v1x, v1y, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		assertEquals(0.5f, res[0]);
		assertEquals(2.0f, res[1]);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revDiv(SimpleVec2fR, SimpleVec2fR, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void revDiv_vec_vec_return_vec_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(v1.getX()).thenReturn(6.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(v2.getX()).thenReturn(3.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		when(extractionParam.set(0.5f, 2.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.revDiv(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(0.5f, 2.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revDiv(SimpleVec2fR, float[], SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void revDiv_vec_arr_return_vec_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float[] v2 = new float[] {3.0f, 8.0f};
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(v1.getX()).thenReturn(6.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(extractionParam.set(0.5f, 2.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.revDiv(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(0.5f, 2.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revDiv(SimpleVec2fR, float, float, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void revDiv_vec_val_return_vec_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float v2x = 3.0f;
		float v2y = 8.0f;
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(v1.getX()).thenReturn(6.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(extractionParam.set(0.5f, 2.0f)).thenReturn(extractionParam);

		SimpleVec2fC res = Vec2fUtils.revDiv(v1, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(0.5f, 2.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revDiv(float[], SimpleVec2fR, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void revDiv_arr_vec_return_vec_test()
	{
		float[] v1 = new float[] {6.0f, 4.0f};
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(v2.getX()).thenReturn(3.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		when(extractionParam.set(0.5f, 2.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.revDiv(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(0.5f, 2.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revDiv(float[], float[], SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void revDiv_arr_arr_return_vec_test()
	{
		float[] v1 = new float[] {6.0f, 4.0f};
		float[] v2 = new float[] {3.0f, 8.0f};
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(extractionParam.set(0.5f, 2.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.revDiv(v1, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(0.5f, 2.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revDiv(float[], float, float, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void revDiv_arr_val_return_vec_test()
	{
		float[] v1 = new float[] {6.0f, 4.0f};
		float v2x = 3.0f;
		float v2y = 8.0f;
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(extractionParam.set(0.5f, 2.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.revDiv(v1, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(0.5f, 2.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revDiv(float, float, SimpleVec2fR, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void revDiv_val_vec_return_vec_test()
	{
		float v1x = 6.0f;
		float v1y = 4.0f;
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(v2.getX()).thenReturn(3.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		when(extractionParam.set(0.5f, 2.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.revDiv(v1x, v1y, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(0.5f, 2.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revDiv(float, float, float[], SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void revDiv_val_arr_return_vec_test()
	{
		float v1x = 6.0f;
		float v1y = 4.0f;
		float[] v2 = new float[] {3.0f, 8.0f};
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(extractionParam.set(0.5f, 2.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.revDiv(v1x, v1y, v2, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(0.5f, 2.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revDiv(float, float, float, float, SimpleVec2fC)}
	 * performs the operation correct.
	 */
	@Test
	void revDiv_val_val_return_vec_test()
	{
		float v1x = 6.0f;
		float v1y = 4.0f;
		float v2x = 3.0f;
		float v2y = 8.0f;
		
		SimpleVec2fC extractionParam = mock(SimpleVec2fC.class);
		
		when(extractionParam.set(0.5f, 2.0f)).thenReturn(extractionParam);
		
		SimpleVec2fC res = Vec2fUtils.revDiv(v1x, v1y, v2x, v2y, extractionParam);
		
		assertSame(extractionParam, res);
		
		verify(extractionParam).set(0.5f, 2.0f);
		
		verifyNoMoreInteractions(extractionParam);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revDivFunc(SimpleVec2fR, SimpleVec2fR, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void revDivFunc_vec_vec_return_obj_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(v1.getX()).thenReturn(6.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(v2.getX()).thenReturn(3.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		when(func.apply(0.5f, 2.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.revDivFunc(v1, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(0.5f, 2.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revDivFunc(SimpleVec2fR, float[], FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void revDivFunc_vec_arr_return_obj_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float[] v2 = new float[] {3.0f, 8.0f};
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(v1.getX()).thenReturn(6.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(func.apply(0.5f, 2.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.revDivFunc(v1, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(0.5f, 2.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revDivFunc(SimpleVec2fR, float, float, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void revDivFunc_vec_val_return_obj_test()
	{
		SimpleVec2fR v1 = mock(SimpleVec2fR.class);
		float v2x = 3.0f;
		float v2y = 8.0f;
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(v1.getX()).thenReturn(6.0f);
		when(v1.getY()).thenReturn(4.0f);
		
		when(func.apply(0.5f, 2.0f)).thenReturn(result);

		Object res = Vec2fUtils.revDivFunc(v1, v2x, v2y, func);
		
		assertSame(result, res);
		
		verify(func).apply(0.5f, 2.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revDivFunc(float[], SimpleVec2fR, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void revDivFunc_arr_vec_return_obj_test()
	{
		float[] v1 = new float[] {6.0f, 4.0f};
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(v2.getX()).thenReturn(3.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		when(func.apply(0.5f, 2.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.revDivFunc(v1, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(0.5f, 2.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revDivFunc(float[], float[], FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void revDivFunc_arr_arr_return_obj_test()
	{
		float[] v1 = new float[] {6.0f, 4.0f};
		float[] v2 = new float[] {3.0f, 8.0f};
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(func.apply(0.5f, 2.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.revDivFunc(v1, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(0.5f, 2.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revDivFunc(float[], float, float, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void revDivFunc_arr_val_return_obj_test()
	{
		float[] v1 = new float[] {6.0f, 4.0f};
		float v2x = 3.0f;
		float v2y = 8.0f;
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(func.apply(0.5f, 2.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.revDivFunc(v1, v2x, v2y, func);
		
		assertSame(result, res);
		
		verify(func).apply(0.5f, 2.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revDivFunc(float, float, SimpleVec2fR, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void revDivFunc_val_vec_return_obj_test()
	{
		float v1x = 6.0f;
		float v1y = 4.0f;
		SimpleVec2fR v2 = mock(SimpleVec2fR.class);
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(v2.getX()).thenReturn(3.0f);
		when(v2.getY()).thenReturn(8.0f);
		
		when(func.apply(0.5f, 2.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.revDivFunc(v1x, v1y, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(0.5f, 2.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revDivFunc(float, float, float[], FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void revDivFunc_val_arr_return_obj_test()
	{
		float v1x = 6.0f;
		float v1y = 4.0f;
		float[] v2 = new float[] {3.0f, 8.0f};
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(func.apply(0.5f, 2.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.revDivFunc(v1x, v1y, v2, func);
		
		assertSame(result, res);
		
		verify(func).apply(0.5f, 2.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fUtils#revDivFunc(float, float, float, float, FloatFunction2)}
	 * performs the operation correct.
	 */
	@Test
	void revDivFunc_val_val_return_obj_test()
	{
		float v1x = 6.0f;
		float v1y = 4.0f;
		float v2x = 3.0f;
		float v2y = 8.0f;
		
		Object result = new Object();
		
		@SuppressWarnings("unchecked")
		FloatFunction2<Object> func = (FloatFunction2<Object>)mock(FloatFunction2.class);
		
		when(func.apply(0.5f, 2.0f)).thenReturn(result);
		
		Object res = Vec2fUtils.revDivFunc(v1x, v1y, v2x, v2y, func);
		
		assertSame(result, res);
		
		verify(func).apply(0.5f, 2.0f);
		
		verifyNoMoreInteractions(func);
	}
	
	
}
