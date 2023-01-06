package org.barghos.math.api.test.vector;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

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
}
