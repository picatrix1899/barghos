package org.barghos.math.api.test;
//package org.barghos.math.api;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//import org.barghos.math.api.vector.Vec3fC;
//import org.barghos.math.api.vector.Vec3fR;
//import org.barghos.math.api.vector.Vec3fUtil;
//import org.junit.jupiter.api.Test;
//
///**
// * This class provides component tests for the arithmetic functions of the class {@link Vec3fUtil}.
// * 
// * This contains the functions for the operations:
// * - add
// * - sub
// * - revSub
// * - mul
// * - div
// * - revDiv
// * - mulAdd
// * 
// * @author picatrix1899
// *
// */
//class Vec3fUtil_Arithm
//{
//	/**
//	 * This test ensures that the function {@link Vec3fUtil#add(Vec3fR, Vec3fR, float[])}
//	 * returns the correct result.
//	 */
//	@Test
//	void add_vector_vector_resArray_test()
//	{
//		final float v1x = 1.1f, v1y = 2.2f, v1z = 3.3f;
//		final float v2x = 4.4f, v2y = 5.5f, v2z = 6.6f;
//		
//		Vec3fR v1 = mock(Vec3fR.class);
//		Vec3fR v2 = mock(Vec3fR.class);
//
//		when(v1.getX()).thenReturn(v1x);
//		when(v1.getY()).thenReturn(v1y);
//		when(v1.getZ()).thenReturn(v1z);
//		
//		when(v2.getX()).thenReturn(v2x);
//		when(v2.getY()).thenReturn(v2y);
//		when(v2.getZ()).thenReturn(v2z);
//		
//		float[] result = new float[3];
//		
//		assertSame(result, Vec3fUtil.add(v1, v2, result));
//		assertEquals(v1x + v2x, result[0]);
//		assertEquals(v1y + v2y, result[1]);
//		assertEquals(v1z + v2z, result[2]);
//		
//		verify(v1).getX();
//		verify(v1).getY();
//		verify(v1).getZ();
//		
//		verify(v2).getX();
//		verify(v2).getY();
//		verify(v2).getZ();
//	}
//	
//	/**
//	 * This test ensures that the function {@link Vec3fUtil#add(Vec3fR, float[], float[])}
//	 * returns the correct result.
//	 */
//	@Test
//	void add_vector_array_resArray_test()
//	{
//		final float v1x = 1.1f, v1y = 2.2f, v1z = 3.3f;
//		final float[] v2 = new float[] {4.4f, 5.5f, 6.6f};
//		
//		Vec3fR v1 = mock(Vec3fR.class);
//
//		when(v1.getX()).thenReturn(v1x);
//		when(v1.getY()).thenReturn(v1y);
//		when(v1.getZ()).thenReturn(v1z);
//		
//		float[] result = new float[3];
//		
//		assertSame(result, Vec3fUtil.add(v1, v2, result));
//		assertEquals(v1x + v2[0], result[0]);
//		assertEquals(v1y + v2[1], result[1]);
//		assertEquals(v1z + v2[2], result[2]);
//		
//		verify(v1).getX();
//		verify(v1).getY();
//		verify(v1).getZ();
//	}
//	
//	/**
//	 * This test ensures that the function {@link Vec3fUtil#add(Vec3fR, float, float, float, float[])}
//	 * returns the correct result.
//	 */
//	@Test
//	void add_vector_components_resArray_test()
//	{
//		final float v1x = 1.1f, v1y = 2.2f, v1z = 3.3f;
//		final float v2x = 4.4f, v2y = 5.5f, v2z = 6.6f;
//
//		Vec3fR v1 = mock(Vec3fR.class);
//
//		when(v1.getX()).thenReturn(v1x);
//		when(v1.getY()).thenReturn(v1y);
//		when(v1.getZ()).thenReturn(v1z);
//		
//		float[] result = new float[3];
//		
//		assertSame(result, Vec3fUtil.add(v1, v2x, v2y, v2z, result));
//		assertEquals(v1x + v2x, result[0]);
//		assertEquals(v1y + v2y, result[1]);
//		assertEquals(v1z + v2z, result[2]);
//		
//		verify(v1).getX();
//		verify(v1).getY();
//		verify(v1).getZ();
//	}
//	
//	/**
//	 * This test ensures that the function {@link Vec3fUtil#add(float[], Vec3fR, float[])}
//	 * returns the correct result.
//	 */
//	@Test
//	void add_array_vector_resArray_test()
//	{
//		final float[] v1 = new float[] {1.1f, 2.2f, 3.3f};
//		final float v2x = 4.4f, v2y = 5.5f, v2z = 6.6f;
//		
//		Vec3fR v2 = mock(Vec3fR.class);
//		
//		when(v2.getX()).thenReturn(v2x);
//		when(v2.getY()).thenReturn(v2y);
//		when(v2.getZ()).thenReturn(v2z);
//		
//		float[] result = new float[3];
//		
//		assertSame(result, Vec3fUtil.add(v1, v2, result));
//		assertEquals(v1[0] + v2x, result[0]);
//		assertEquals(v1[1] + v2y, result[1]);
//		assertEquals(v1[2] + v2z, result[2]);
//		
//		verify(v2).getX();
//		verify(v2).getY();
//		verify(v2).getZ();
//	}
//	
//	/**
//	 * This test ensures that the function {@link Vec3fUtil#add(float[], float[], float[])}
//	 * returns the correct result.
//	 */
//	@Test
//	void add_array_array_resArray_test()
//	{
//		final float[] v1 = new float[] {1.1f, 2.2f, 3.3f};
//		final float[] v2 = new float[] {4.4f, 5.5f, 6.6f};
//		
//		float[] result = new float[3];
//		
//		assertSame(result, Vec3fUtil.add(v1, v2, result));
//		assertEquals(v1[0] + v2[0], result[0]);
//		assertEquals(v1[1] + v2[1], result[1]);
//		assertEquals(v1[2] + v2[2], result[2]);
//	}
//	
//	/**
//	 * This test ensures that the function {@link Vec3fUtil#add(float[], float, float, float, float[])}
//	 * returns the correct result.
//	 */
//	@Test
//	void add_array_components_resArray_test()
//	{
//		final float[] v1 = new float[] {1.1f, 2.2f, 3.3f};
//		final float v2x = 4.4f, v2y = 5.5f, v2z = 6.6f;
//		
//		float[] result = new float[3];
//		
//		assertSame(result, Vec3fUtil.add(v1, v2x, v2y, v2z, result));
//		assertEquals(v1[0] + v2x, result[0]);
//		assertEquals(v1[1] + v2y, result[1]);
//		assertEquals(v1[2] + v2z, result[2]);
//	}
//	
//	/**
//	 * This test ensures that the function {@link Vec3fUtil#add(float, float, float, Vec3fR, float[])}
//	 * returns the correct result.
//	 */
//	@Test
//	void add_components_vector_resArray_test()
//	{
//		final float v1x = 1.1f, v1y = 2.2f, v1z = 3.3f;
//		final float v2x = 4.4f, v2y = 5.5f, v2z = 6.6f;
//		
//		Vec3fR v2 = mock(Vec3fR.class);
//		
//		when(v2.getX()).thenReturn(v2x);
//		when(v2.getY()).thenReturn(v2y);
//		when(v2.getZ()).thenReturn(v2z);
//		
//		float[] result = new float[3];
//		
//		assertSame(result, Vec3fUtil.add(v1x, v1y, v1z, v2, result));
//		assertEquals(v1x + v2x, result[0]);
//		assertEquals(v1y + v2y, result[1]);
//		assertEquals(v1z + v2z, result[2]);
//		
//		verify(v2).getX();
//		verify(v2).getY();
//		verify(v2).getZ();
//	}
//	
//	/**
//	 * This test ensures that the function {@link Vec3fUtil#add(float, float, float, float[], float[])}
//	 * returns the correct result.
//	 */
//	@Test
//	void add_components_array_resArray_test()
//	{
//		final float v1x = 1.1f, v1y = 2.2f, v1z = 3.3f;
//		final float[] v2 = new float[] {4.4f, 5.5f, 6.6f};
//		
//		float[] result = new float[3];
//		
//		assertSame(result, Vec3fUtil.add(v1x, v1y, v1z, v2, result));
//		assertEquals(v1x + v2[0], result[0]);
//		assertEquals(v1y + v2[1], result[1]);
//		assertEquals(v1z + v2[2], result[2]);
//	}
//	
//	/**
//	 * This test ensures that the function {@link Vec3fUtil#add(float, float, float, float, float, float, float[])}
//	 * returns the correct result.
//	 */
//	@Test
//	void add_components_components_resArray_test()
//	{
//		final float v1x = 1.1f, v1y = 2.2f, v1z = 3.3f;
//		final float v2x = 4.4f, v2y = 5.5f, v2z = 6.6f;
//		
//		float[] result = new float[3];
//		
//		assertSame(result, Vec3fUtil.add(v1x, v1y, v1z, v2x, v2y, v2z, result));
//		assertEquals(v1x + v2x, result[0]);
//		assertEquals(v1y + v2y, result[1]);
//		assertEquals(v1z + v2z, result[2]);
//	}
//	
//	/**
//	 * This test ensures that the function {@link Vec3fUtil#add(Vec3fR, Vec3fR, Vec3fC)}
//	 * returns the correct result.
//	 */
//	@Test
//	void add_vector_vector_resObject_test()
//	{
//		final float v1x = 1.1f, v1y = 2.2f, v1z = 3.3f;
//		final float v2x = 4.4f, v2y = 5.5f, v2z = 6.6f;
//		
//		Vec3fR v1 = mock(Vec3fR.class);
//		Vec3fR v2 = mock(Vec3fR.class);
//		Vec3fC result = mock(Vec3fC.class);
//
//		when(v1.getX()).thenReturn(v1x);
//		when(v1.getY()).thenReturn(v1y);
//		when(v1.getZ()).thenReturn(v1z);
//		
//		when(v2.getX()).thenReturn(v2x);
//		when(v2.getY()).thenReturn(v2y);
//		when(v2.getZ()).thenReturn(v2z);
//		
//		assertSame(result, Vec3fUtil.add(v1, v2, result));
//		
//		verify(v1).getX();
//		verify(v1).getY();
//		verify(v1).getZ();
//		
//		verify(v2).getX();
//		verify(v2).getY();
//		verify(v2).getZ();
//		
//		verify(result).set(v1x + v2x, v1y + v2y, v1z + v2z);
//	}
//	
//	/**
//	 * This test ensures that the function {@link Vec3fUtil#add(Vec3fR, float[], Vec3fC)}
//	 * returns the correct result.
//	 */
//	@Test
//	void add_vector_array_resObject_test()
//	{
//		final float v1x = 1.1f, v1y = 2.2f, v1z = 3.3f;
//		final float[] v2 = new float[] {4.4f, 5.5f, 6.6f};
//		
//		Vec3fR v1 = mock(Vec3fR.class);
//		Vec3fC result = mock(Vec3fC.class);
//		
//		when(v1.getX()).thenReturn(v1x);
//		when(v1.getY()).thenReturn(v1y);
//		when(v1.getZ()).thenReturn(v1z);
//		
//		assertSame(result, Vec3fUtil.add(v1, v2, result));
//		
//		verify(v1).getX();
//		verify(v1).getY();
//		verify(v1).getZ();
//		
//		verify(result).set(v1x + v2[0], v1y + v2[1], v1z + v2[2]);
//	}
//	
//	/**
//	 * This test ensures that the function {@link Vec3fUtil#add(Vec3fR, float, float, float, Vec3fC)}
//	 * returns the correct result.
//	 */
//	@Test
//	void add_vector_components_resObject_test()
//	{
//		final float v1x = 1.1f, v1y = 2.2f, v1z = 3.3f;
//		final float v2x = 4.4f, v2y = 5.5f, v2z = 6.6f;
//
//		Vec3fR v1 = mock(Vec3fR.class);
//		Vec3fC result = mock(Vec3fC.class);
//		
//		when(v1.getX()).thenReturn(v1x);
//		when(v1.getY()).thenReturn(v1y);
//		when(v1.getZ()).thenReturn(v1z);
//
//		assertSame(result, Vec3fUtil.add(v1, v2x, v2y, v2z, result));
//		
//		verify(v1).getX();
//		verify(v1).getY();
//		verify(v1).getZ();
//		
//		verify(result).set(v1x + v2x, v1y + v2y, v1z + v2z);
//	}
//	
//	/**
//	 * This test ensures that the function {@link Vec3fUtil#add(float[], Vec3fR, Vec3fC)}
//	 * returns the correct result.
//	 */
//	@Test
//	void add_array_vector_resObject_test()
//	{
//		final float[] v1 = new float[] {1.1f, 2.2f, 3.3f};
//		final float v2x = 4.4f, v2y = 5.5f, v2z = 6.6f;
//		
//		Vec3fR v2 = mock(Vec3fR.class);
//		Vec3fC result = mock(Vec3fC.class);
//		
//		when(v2.getX()).thenReturn(v2x);
//		when(v2.getY()).thenReturn(v2y);
//		when(v2.getZ()).thenReturn(v2z);
//		
//		assertSame(result, Vec3fUtil.add(v1, v2, result));
//		
//		verify(v2).getX();
//		verify(v2).getY();
//		verify(v2).getZ();
//		
//		verify(result).set(v1[0] + v2x, v1[1] + v2y, v1[2] + v2z);
//	}
//	
//	/**
//	 * This test ensures that the function {@link Vec3fUtil#add(float[], float[], Vec3fC)}
//	 * returns the correct result.
//	 */
//	@Test
//	void add_array_array_resObject_test()
//	{
//		final float[] v1 = new float[] {1.1f, 2.2f, 3.3f};
//		final float[] v2 = new float[] {4.4f, 5.5f, 6.6f};
//		
//		Vec3fC result = mock(Vec3fC.class);
//		
//		assertSame(result, Vec3fUtil.add(v1, v2, result));
//
//		verify(result).set(v1[0] + v2[0], v1[1] + v2[1], v1[2] + v2[2]);
//	}
//	
//	/**
//	 * This test ensures that the function {@link Vec3fUtil#add(float[], float, float, float, Vec3fC)}
//	 * returns the correct result.
//	 */
//	@Test
//	void add_array_components_resObject_test()
//	{
//		final float[] v1 = new float[] {1.1f, 2.2f, 3.3f};
//		final float v2x = 4.4f, v2y = 5.5f, v2z = 6.6f;
//		
//		Vec3fC result = mock(Vec3fC.class);
//		
//		assertSame(result, Vec3fUtil.add(v1, v2x, v2y, v2z, result));
//
//		verify(result).set(v1[0] + v2x, v1[1] + v2y, v1[2] + v2z);
//	}
//	
//	/**
//	 * This test ensures that the function {@link Vec3fUtil#add(float, float, float, Vec3fR, Vec3fC)}
//	 * returns the correct result.
//	 */
//	@Test
//	void add_components_vector_resObject_test()
//	{
//		final float v1x = 1.1f, v1y = 2.2f, v1z = 3.3f;
//		final float v2x = 4.4f, v2y = 5.5f, v2z = 6.6f;
//		
//		Vec3fR v2 = mock(Vec3fR.class);
//		Vec3fC result = mock(Vec3fC.class);
//		
//		when(v2.getX()).thenReturn(v2x);
//		when(v2.getY()).thenReturn(v2y);
//		when(v2.getZ()).thenReturn(v2z);
//		
//		assertSame(result, Vec3fUtil.add(v1x, v1y, v1z, v2, result));
//		
//		verify(v2).getX();
//		verify(v2).getY();
//		verify(v2).getZ();
//		
//		verify(result).set(v1x + v2x, v1y + v2y, v1z + v2z);
//	}
//	
//	/**
//	 * This test ensures that the function {@link Vec3fUtil#add(float, float, float, float[], Vec3fC)}
//	 * returns the correct result.
//	 */
//	@Test
//	void add_components_array_resObject_test()
//	{
//		final float v1x = 1.1f, v1y = 2.2f, v1z = 3.3f;
//		final float[] v2 = new float[] {4.4f, 5.5f, 6.6f};
//		
//		Vec3fC result = mock(Vec3fC.class);
//		
//		assertSame(result, Vec3fUtil.add(v1x, v1y, v1z, v2, result));
//		
//		verify(result).set(v1x + v2[0], v1y + v2[1], v1z + v2[2]);
//	}
//	
//	/**
//	 * This test ensures that the function {@link Vec3fUtil#add(float, float, float, float, float, float, Vec3fC)}
//	 * returns the correct result.
//	 */
//	@Test
//	void add_components_components_resObject_test()
//	{
//		final float v1x = 1.1f, v1y = 2.2f, v1z = 3.3f;
//		final float v2x = 4.4f, v2y = 5.5f, v2z = 6.6f;
//
//		Vec3fC result = mock(Vec3fC.class);
//		
//		assertSame(result, Vec3fUtil.add(v1x, v1y, v1z, v2x, v2y, v2z, result));
//		
//		verify(result).set(v1x + v2x, v1y + v2y, v1z + v2z);
//	}
//}