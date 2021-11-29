//package org.barghos.core.test.color;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Test;
//
//import org.barghos.core.color.HDRColor4;
//import org.barghos.core.tuple4.PTup4f;
//import org.barghos.core.tuple4.PTup4i;
//
///**
// * This class provides component tests for the class {@link HDRColor4}.
// * 
// * @author picatrix1899
// * 
// * @since 1.0.0.0
// */
//class HDRColor4Test
//{
//	/**
//	 * This test ensures, that the constructor {@link HDRColor4#HDRColor4()} aktually works and
//	 * that the components are set to 0.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void ctorEmptyTest()
//	{
//		HDRColor4 color = new HDRColor4();
//		
//		assertEquals(0, color.r);
//		assertEquals(0, color.g);
//		assertEquals(0, color.b);
//		assertEquals(0, color.a);
//	}
//	
//	/**
//	 * This test ensures, that the constructor
//	 * {@link HDRColor4#HDRColor4(org.barghos.core.api.tuple4.Tup4fR) HDRColor4.HDRColor4(Tup4fR)}
//	 * aktually works and that the components are adopted from the tuple in unit space (0.0 - 1.0). Also it ensures,
//	 * that the adopted values are not clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void ctorCloneUnitSpaceTest()
//	{
//		HDRColor4 color1 = new HDRColor4(PTup4f.gen(1.2f, 3.4f, 5.6f, 1f));
//		
//		assertEquals(1.2f, color1.r);
//		assertEquals(3.4f, color1.g);
//		assertEquals(5.6f, color1.b);
//		assertEquals(1f, color1.a);
//		
//		HDRColor4 color2 = new HDRColor4(PTup4f.gen(-1.2f, -3.4f, -5.6f, 0f));
//		
//		assertEquals(-1.2f, color2.r);
//		assertEquals(-3.4f, color2.g);
//		assertEquals(-5.6f, color2.b);
//		assertEquals(0f, color2.a);
//	}
//	
//	/**
//	 * This test ensures, that the constructor
//	 * {@link HDRColor4#HDRColor4(org.barghos.core.api.tuple4.Tup4iR) HDRColor4.HDRColor4(Tup4iR)}
//	 * aktually works and that the components are adopted from the tuple in color space (0 - 255). Also it ensures,
//	 * that the adopted values are not clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void ctorCloneColorSpaceTest()
//	{
//		float epsilon = 0.000001f;
//		
//		HDRColor4 color1 = new HDRColor4(PTup4i.gen(255 * 2, 255 * 4, 255 * 6, 255));
//		
//		assertTrue(Math.abs(2f - color1.r) < epsilon);
//		assertTrue(Math.abs(4f - color1.g) < epsilon);
//		assertTrue(Math.abs(6f - color1.b) < epsilon);
//		assertTrue(Math.abs(1f - color1.a) < epsilon);
//		
//		HDRColor4 color2 = new HDRColor4(PTup4i.gen(255 * -2, 255 * -4, 255 * -6, 0));
//		
//		assertTrue(Math.abs(-2f - color2.r) < epsilon);
//		assertTrue(Math.abs(-4f - color2.g) < epsilon);
//		assertTrue(Math.abs(-6f - color2.b) < epsilon);
//		assertTrue(Math.abs(0f - color2.a) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the constructor {@link HDRColor4#HDRColor4(float)} aktually works
//	 * and that the components are set to the scalar in unit space (0.0 - 1.0). Also it ensures,
//	 * that the scalar doesn't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void ctorScalarUnitSpaceTest()
//	{
//		HDRColor4 color1 = new HDRColor4(3.4f);
//		
//		assertEquals(3.4f, color1.r);
//		assertEquals(3.4f, color1.g);
//		assertEquals(3.4f, color1.b);
//		assertEquals(3.4f, color1.a);
//		
//		HDRColor4 color2 = new HDRColor4(-3.4f);
//		
//		assertEquals(-3.4f, color2.r);
//		assertEquals(-3.4f, color2.g);
//		assertEquals(-3.4f, color2.b);
//		assertEquals(-3.4f, color2.a);
//	}
//	
//	/**
//	 * This test ensures, that the constructor {@link HDRColor4#HDRColor4(int)} aktually works
//	 * and that the components are set to the scalar in color space (0 - 255). Also it ensures,
//	 * that the scalar doesn't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void ctorScalarColorSpaceTest()
//	{
//		float epsilon = 0.000001f;
//		
//		HDRColor4 color1 = new HDRColor4(255 * 4);
//		
//		assertTrue(Math.abs(4f - color1.r) < epsilon);
//		assertTrue(Math.abs(4f - color1.g) < epsilon);
//		assertTrue(Math.abs(4f - color1.b) < epsilon);
//		assertTrue(Math.abs(4f - color1.a) < epsilon);
//		
//		HDRColor4 color2 = new HDRColor4(255 * -4);
//		
//		assertTrue(Math.abs(-4f - color2.r) < epsilon);
//		assertTrue(Math.abs(-4f - color2.g) < epsilon);
//		assertTrue(Math.abs(-4f - color2.b) < epsilon);
//		assertTrue(Math.abs(-4f - color2.a) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the constructor {@link HDRColor4#HDRColor4(float, float, float, float)} aktually works
//	 * and that the components are set to the respective parameters in unit space (0.0 - 1.0). Also it ensures,
//	 * that the parameters don't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void ctorComponentsUnitSpaceTest()
//	{
//		HDRColor4 color1 = new HDRColor4(1.2f, 3.4f, 5.6f, 1f);
//		
//		assertEquals(1.2f, color1.r);
//		assertEquals(3.4f, color1.g);
//		assertEquals(5.6f, color1.b);
//		assertEquals(1f, color1.a);
//		
//		HDRColor4 color2 = new HDRColor4(-1.2f, -3.4f, -5.6f, 0f);
//		
//		assertEquals(-1.2f, color2.r);
//		assertEquals(-3.4f, color2.g);
//		assertEquals(-5.6f, color2.b);
//		assertEquals(0f, color2.a);
//	}
//	
//	/**
//	 * This test ensures, that the constructor {@link HDRColor4#HDRColor4(int, int, int, int)} aktually works
//	 * and that the components are set to the respective parameters in color space (0 - 255). Also it ensures,
//	 * that the parameters don't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void ctorComponentsColorSpaceTest()
//	{
//		float epsilon = 0.000001f;
//		
//		HDRColor4 color1 = new HDRColor4(255 * 2, 255 * 4, 255 * 6, 255);
//		
//		assertTrue(Math.abs(2f - color1.r) < epsilon);
//		assertTrue(Math.abs(4f - color1.g) < epsilon);
//		assertTrue(Math.abs(6f - color1.b) < epsilon);
//		assertTrue(Math.abs(1f - color1.a) < epsilon);
//		
//		HDRColor4 color2 = new HDRColor4(255 * -2, 255 * -4, 255 * -6, 0);
//		
//		assertTrue(Math.abs(-2f - color2.r) < epsilon);
//		assertTrue(Math.abs(-4f - color2.g) < epsilon);
//		assertTrue(Math.abs(-6f - color2.b) < epsilon);
//		assertTrue(Math.abs(0f - color2.a) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor4#setX(float)} sets the r component to the value
//	 * in unit space (0.0 - 1.0). Also it ensures, that the value doesn't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void setXTest()
//	{
//		HDRColor4 color1 = new HDRColor4();
//		
//		assertSame(color1, color1.setX(3.4f));
//		assertEquals(3.4f, color1.r);
//		
//		HDRColor4 color2 = new HDRColor4();
//		
//		assertSame(color2, color2.setX(-3.4f));
//		assertEquals(-3.4f, color2.r);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor4#setY(float)} sets the g component to the value
//	 * in unit space (0.0 - 1.0). Also it ensures, that the value doesn't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void setYTest()
//	{
//		HDRColor4 color1 = new HDRColor4();
//		
//		assertSame(color1, color1.setY(3.4f));
//		assertEquals(3.4f, color1.g);
//		
//		HDRColor4 color2 = new HDRColor4();
//		
//		assertSame(color2, color2.setY(-3.4f));
//		assertEquals(-3.4f, color2.g);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor4#setZ(float)} sets the b component to the value
//	 * in unit space (0.0 - 1.0). Also it ensures, that the value doesn't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void setZTest()
//	{
//		HDRColor4 color1 = new HDRColor4();
//		
//		assertSame(color1, color1.setZ(3.4f));
//		assertEquals(3.4f, color1.b);
//		
//		HDRColor4 color2 = new HDRColor4();
//		
//		assertSame(color2, color2.setZ(-3.4f));
//		assertEquals(-3.4f, color2.b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor4#setW(float)} sets the b component to the value
//	 * in unit space (0.0 - 1.0). Also it ensures, that the value doesn't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void setWTest()
//	{
//		HDRColor4 color1 = new HDRColor4();
//		
//		assertSame(color1, color1.setW(1f));
//		assertEquals(1f, color1.a);
//		
//		HDRColor4 color2 = new HDRColor4();
//		
//		assertSame(color2, color2.setW(0f));
//		assertEquals(0f, color2.a);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor4#setUnityR(float)} sets the r component to the value
//	 * in unit space (0.0 - 1.0). Also it ensures, that the value doesn't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void setUnityRTest()
//	{
//		HDRColor4 color1 = new HDRColor4();
//		
//		assertSame(color1, color1.setUnityR(3.4f));
//		assertEquals(3.4f, color1.r);
//		
//		HDRColor4 color2 = new HDRColor4();
//		
//		assertSame(color2, color2.setUnityR(-3.4f));
//		assertEquals(-3.4f, color2.r);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor4#setUnityG(float)} sets the g component to the value
//	 * in unit space (0.0 - 1.0). Also it ensures, that the value doesn't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void setUnityGTest()
//	{
//		HDRColor4 color1 = new HDRColor4();
//		
//		assertSame(color1, color1.setUnityG(3.4f));
//		assertEquals(3.4f, color1.g);
//		
//		HDRColor4 color2 = new HDRColor4();
//		
//		assertSame(color2, color2.setUnityG(-3.4f));
//		assertEquals(-3.4f, color2.g);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor4#setUnityB(float)} sets the b component to the value
//	 * in unit space (0.0 - 1.0). Also it ensures, that the value doesn't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void setUnityBTest()
//	{
//		HDRColor4 color1 = new HDRColor4();
//		
//		assertSame(color1, color1.setUnityB(3.4f));
//		assertEquals(3.4f, color1.b);
//		
//		HDRColor4 color2 = new HDRColor4();
//		
//		assertSame(color2, color2.setUnityB(-3.4f));
//		assertEquals(-3.4f, color2.b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor4#setUnityB(float)} sets the b component to the value
//	 * in unit space (0.0 - 1.0). Also it ensures, that the value doesn't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void setUnityATest()
//	{
//		HDRColor4 color1 = new HDRColor4();
//		
//		assertSame(color1, color1.setUnityA(1f));
//		assertEquals(1f, color1.a);
//		
//		HDRColor4 color2 = new HDRColor4();
//		
//		assertSame(color2, color2.setUnityA(0f));
//		assertEquals(0f, color2.a);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor4#setR(int)} sets the r component to the value
//	 * in color space (0 - 255). Also it ensures, that the value doesn't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void setRTest()
//	{
//		float epsilon = 0.000001f;
//		
//		HDRColor4 color1 = new HDRColor4();
//
//		assertSame(color1, color1.setR(255 * 4));
//		assertTrue(Math.abs(4f - color1.r) < epsilon);
//		
//		HDRColor4 color2 = new HDRColor4();
//		
//		assertSame(color2, color2.setR(255 * -4));
//		assertTrue(Math.abs(-4f - color2.r) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor4#setG(int)} sets the g component to the value
//	 * in color space (0 - 255). Also it ensures, that the value doesn't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void setGTest()
//	{
//		float epsilon = 0.000001f;
//		
//		HDRColor4 color1 = new HDRColor4();
//
//		assertSame(color1, color1.setG(255 * 4));
//		assertTrue(Math.abs(4f - color1.g) < epsilon);
//		
//		HDRColor4 color2 = new HDRColor4();
//		
//		assertSame(color2, color2.setG(255 * -4));
//		assertTrue(Math.abs(-4f - color2.g) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor4#setB(int)} sets the b component to the value
//	 * in color space (0 - 255). Also it ensures, that the value doesn't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void setBTest()
//	{
//		float epsilon = 0.000001f;
//		
//		HDRColor4 color1 = new HDRColor4();
//
//		assertSame(color1, color1.setB(255 * 4));
//		assertTrue(Math.abs(4f - color1.b) < epsilon);
//		
//		HDRColor4 color2 = new HDRColor4();
//		
//		assertSame(color2, color2.setB(255 * -4));
//		assertTrue(Math.abs(-4f - color2.b) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor4#setA(int)} sets the a component to the value
//	 * in color space (0 - 255). Also it ensures, that the value doesn't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void setATest()
//	{
//		float epsilon = 0.000001f;
//		
//		HDRColor4 color1 = new HDRColor4();
//
//		assertSame(color1, color1.setA(255));
//		assertTrue(Math.abs(1f - color1.a) < epsilon);
//		
//		HDRColor4 color2 = new HDRColor4();
//		
//		assertSame(color2, color2.setA(0));
//		assertTrue(Math.abs(0f - color2.a) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function
//	 * {@link HDRColor4#set(org.barghos.core.api.tuple4.Tup4fR) HDRColor4.set(Tup4fR)}
//	 * adopts the components from the tuple in unit space (0.0 - 1.0). Also it ensures,
//	 * that the adopted values are not clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void set_cloneUnitSpaceTest()
//	{
//		HDRColor4 color1 = new HDRColor4();
//		
//		assertSame(color1, color1.set(PTup4f.gen(1.2f, 3.4f, 5.6f, 1f)));
//		assertEquals(1.2f, color1.r);
//		assertEquals(3.4f, color1.g);
//		assertEquals(5.6f, color1.b);
//		assertEquals(1f, color1.a);
//		
//		HDRColor4 color2 = new HDRColor4();
//		
//		assertSame(color2, color2.set(PTup4f.gen(-1.2f, -3.4f, -5.6f, 0f)));
//		assertEquals(-1.2f, color2.r);
//		assertEquals(-3.4f, color2.g);
//		assertEquals(-5.6f, color2.b);
//		assertEquals(0f, color2.a);
//	}
//	
//	/**
//	 * This test ensures, that the function
//	 * {@link HDRColor4#set(org.barghos.core.api.tuple4.Tup4iR) HDRColor4.set(Tup4iR)}
//	 * adopts the components from the tuple in color space (0 - 255). Also it ensures,
//	 * that the adopted values are not clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void set_cloneColorSpaceTest()
//	{
//		float epsilon = 0.000001f;
//		
//		HDRColor4 color1 = new HDRColor4();
//		
//		assertSame(color1, color1.set(PTup4i.gen(255 * 2, 255 * 4, 255 * 6, 255)));
//		assertTrue(Math.abs(2f - color1.r) < epsilon);
//		assertTrue(Math.abs(4f - color1.g) < epsilon);
//		assertTrue(Math.abs(6f - color1.b) < epsilon);
//		assertTrue(Math.abs(1f - color1.a) < epsilon);
//		
//		HDRColor4 color2 = new HDRColor4();
//		
//		assertSame(color2, color2.set(PTup4i.gen(255 * -2, 255 * -4, 255 * -6, 0)));
//		assertTrue(Math.abs(-2f - color2.r) < epsilon);
//		assertTrue(Math.abs(-4f - color2.g) < epsilon);
//		assertTrue(Math.abs(-6f - color2.b) < epsilon);
//		assertTrue(Math.abs(0f - color2.a) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor4#set(float)} sets the components to the scalar
//	 * in unit space (0.0 - 1.0). Also it ensures, that the scalar doesn't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void set_scalarUnitSpaceTest()
//	{
//		HDRColor4 color1 = new HDRColor4();
//		
//		assertSame(color1, color1.set(3.4f));
//		assertEquals(3.4f, color1.r);
//		assertEquals(3.4f, color1.g);
//		assertEquals(3.4f, color1.b);
//		assertEquals(3.4f, color1.a);
//		
//		HDRColor4 color2 = new HDRColor4();
//		
//		assertSame(color2, color2.set(-3.4f));
//		assertEquals(-3.4f, color2.r);
//		assertEquals(-3.4f, color2.g);
//		assertEquals(-3.4f, color2.b);
//		assertEquals(-3.4f, color2.a);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor4#set(int)} sets the components to the scalar
//	 * in color space (0 - 255). Also it ensures, that the scalar doesn't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void set_scalarColorSpaceTest()
//	{
//		float epsilon = 0.000001f;
//		
//		HDRColor4 color1 = new HDRColor4();
//		
//		assertSame(color1, color1.set(255 * 4));
//		assertTrue(Math.abs(4f - color1.r) < epsilon);
//		assertTrue(Math.abs(4f - color1.g) < epsilon);
//		assertTrue(Math.abs(4f - color1.b) < epsilon);
//		assertTrue(Math.abs(4f - color1.a) < epsilon);
//		
//		HDRColor4 color2 = new HDRColor4();
//		
//		assertSame(color2, color2.set(255 * -4));
//		assertTrue(Math.abs(-4f - color2.r) < epsilon);
//		assertTrue(Math.abs(-4f - color2.g) < epsilon);
//		assertTrue(Math.abs(-4f - color2.b) < epsilon);
//		assertTrue(Math.abs(-4f - color2.a) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor4#set(float, float, float, float)} sets the components to
//	 * the respective parameters in unit space (0.0 - 1.0). Also it ensures, that the parameters don't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void set_componentsUnitSpaceTest()
//	{
//		HDRColor4 color1 = new HDRColor4();
//		
//		assertSame(color1, color1.set(1.2f, 3.4f, 5.6f, 1f));
//		assertEquals(1.2f, color1.r);
//		assertEquals(3.4f, color1.g);
//		assertEquals(5.6f, color1.b);
//		assertEquals(1f, color1.a);
//		
//		HDRColor4 color2 = new HDRColor4();
//		
//		assertSame(color2, color2.set(-1.2f, -3.4f, -5.6f, 0f));
//		assertEquals(-1.2f, color2.r);
//		assertEquals(-3.4f, color2.g);
//		assertEquals(-5.6f, color2.b);
//		assertEquals(0f, color2.a);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor4#set(int, int, int, int)} sets the components to
//	 * the respective parameters in unit space (0 - 255). Also it ensures, that the parameters don't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void set_componentsColorSpaceTest()
//	{
//		float epsilon = 0.000001f;
//		
//		HDRColor4 color1 = new HDRColor4();
//		
//		assertSame(color1, color1.set(255 * 2, 255 * 4, 255 * 6, 255));
//		assertTrue(Math.abs(2f - color1.r) < epsilon);
//		assertTrue(Math.abs(4f - color1.g) < epsilon);
//		assertTrue(Math.abs(6f - color1.b) < epsilon);
//		assertTrue(Math.abs(1f - color1.a) < epsilon);
//		
//		HDRColor4 color2 = new HDRColor4();
//		
//		assertSame(color2, color2.set(255 * -2, 255 * -4, 255 * -6, 0));
//		assertTrue(Math.abs(-2f - color2.r) < epsilon);
//		assertTrue(Math.abs(-4f - color2.g) < epsilon);
//		assertTrue(Math.abs(-6f - color2.b) < epsilon);
//		assertTrue(Math.abs(0f - color2.a) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor4#getR()} returns the r component.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void getRTest()
//	{
//		float epsilon = 0.000001f;
//		
//		HDRColor4 color = new HDRColor4(255 * 2, 255 * 4, 255 * 6, 255);
//		
//		assertTrue(Math.abs(255 * 2 - color.getR()) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor4#getG()} returns the g component.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void getGTest()
//	{
//		float epsilon = 0.000001f;
//		
//		HDRColor4 color = new HDRColor4(255 * 2, 255 * 4, 255 * 6, 255);
//		
//		assertTrue(Math.abs(255 * 4 - color.getG()) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor4#getB()} returns the b component.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void getBTest()
//	{
//		float epsilon = 0.000001f;
//		
//		HDRColor4 color = new HDRColor4(255 * 2, 255 * 4, 255 * 6, 255);
//		
//		assertTrue(Math.abs(255 * 6 - color.getB()) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor4#getA()} returns the a component.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void getATest()
//	{
//		float epsilon = 0.000001f;
//		
//		HDRColor4 color = new HDRColor4(255 * 2, 255 * 4, 255 * 6, 255);
//		
//		assertTrue(Math.abs(255 - color.getA()) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor4#getUnityR()} returns the r component.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void getUnityRTest()
//	{
//		HDRColor4 color = new HDRColor4(1.2f, 3.4f, 5.6f, 7.8f);
//		
//		assertEquals(1.2f, color.getUnityR());
//		assertEquals(color.r, color.getUnityR());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor4#getUnityG()} returns the g component.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void getUnityGTest()
//	{
//		HDRColor4 color = new HDRColor4(1.2f, 3.4f, 5.6f, 7.8f);
//		
//		assertEquals(3.4f, color.getUnityG());
//		assertEquals(color.g, color.getUnityG());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor4#getUnityB()} returns the b component.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void getUnityBTest()
//	{
//		HDRColor4 color = new HDRColor4(1.2f, 3.4f, 5.6f, 7.8f);
//		
//		assertEquals(5.6f, color.getUnityB());
//		assertEquals(color.b, color.getUnityB());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor4#getUnityA()} returns the a component.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void getUnityATest()
//	{
//		HDRColor4 color = new HDRColor4(1.2f, 3.4f, 5.6f, 1f);
//		
//		assertEquals(1f, color.getUnityA());
//		assertEquals(color.a, color.getUnityA());
//	}
//}