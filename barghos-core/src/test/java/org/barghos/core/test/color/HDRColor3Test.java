//package org.barghos.core.test.color;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Test;
//
//import org.barghos.core.color.HDRColor3;
//import org.barghos.core.tuple3.PTup3f;
//import org.barghos.core.tuple3.PTup3i;
//
///**
// * This class provides component tests for the class {@link HDRColor3}.
// * 
// * @author picatrix1899
// * 
// * @since 1.0.0.0
// */
//class HDRColor3Test
//{
//	/**
//	 * This test ensures, that the constructor {@link HDRColor3#HDRColor3()} aktually works and
//	 * that the components are set to 0.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void ctorEmptyTest()
//	{
//		HDRColor3 color = new HDRColor3();
//		
//		assertEquals(0, color.r);
//		assertEquals(0, color.g);
//		assertEquals(0, color.b);
//	}
//	
//	/**
//	 * This test ensures, that the constructor
//	 * {@link HDRColor3#HDRColor3(org.barghos.core.api.tuple3.Tup3fR) HDRColor3.HDRColor3(Tup3fR)}
//	 * aktually works and that the components are adopted from the tuple in unit space (0.0 - 1.0). Also it ensures,
//	 * that the adopted values are not clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void ctorCloneUnitSpaceTest()
//	{
//		HDRColor3 color1 = new HDRColor3(PTup3f.gen(1.2f, 3.4f, 5.6f));
//		
//		assertEquals(1.2f, color1.r);
//		assertEquals(3.4f, color1.g);
//		assertEquals(5.6f, color1.b);
//		
//		HDRColor3 color2 = new HDRColor3(PTup3f.gen(-1.2f, -3.4f, -5.6f));
//		
//		assertEquals(-1.2f, color2.r);
//		assertEquals(-3.4f, color2.g);
//		assertEquals(-5.6f, color2.b);
//	}
//	
//	/**
//	 * This test ensures, that the constructor
//	 * {@link HDRColor3#HDRColor3(org.barghos.core.api.tuple3.Tup3iR) HDRColor3.HDRColor3(Tup3iR)}
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
//		HDRColor3 color1 = new HDRColor3(PTup3i.gen(255 * 2, 255 * 4, 255 * 6));
//		
//		assertTrue(Math.abs(2f - color1.r) < epsilon);
//		assertTrue(Math.abs(4f - color1.g) < epsilon);
//		assertTrue(Math.abs(6f - color1.b) < epsilon);
//		
//		HDRColor3 color2 = new HDRColor3(PTup3i.gen(255 * -2, 255 * -4, 255 * -6));
//		
//		assertTrue(Math.abs(-2f - color2.r) < epsilon);
//		assertTrue(Math.abs(-4f - color2.g) < epsilon);
//		assertTrue(Math.abs(-6f - color2.b) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the constructor {@link HDRColor3#HDRColor3(float)} aktually works
//	 * and that the components are set to the scalar in unit space (0.0 - 1.0). Also it ensures,
//	 * that the scalar doesn't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void ctorScalarUnitSpaceTest()
//	{
//		HDRColor3 color1 = new HDRColor3(3.4f);
//		
//		assertEquals(3.4f, color1.r);
//		assertEquals(3.4f, color1.g);
//		assertEquals(3.4f, color1.b);
//		
//		HDRColor3 color2 = new HDRColor3(-3.4f);
//		
//		assertEquals(-3.4f, color2.r);
//		assertEquals(-3.4f, color2.g);
//		assertEquals(-3.4f, color2.b);
//	}
//	
//	/**
//	 * This test ensures, that the constructor {@link HDRColor3#HDRColor3(int)} aktually works
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
//		HDRColor3 color1 = new HDRColor3(255 * 4);
//		
//		assertTrue(Math.abs(4f - color1.r) < epsilon);
//		assertTrue(Math.abs(4f - color1.g) < epsilon);
//		assertTrue(Math.abs(4f - color1.b) < epsilon);
//		
//		HDRColor3 color2 = new HDRColor3(255 * -4);
//		
//		assertTrue(Math.abs(-4f - color2.r) < epsilon);
//		assertTrue(Math.abs(-4f - color2.g) < epsilon);
//		assertTrue(Math.abs(-4f - color2.b) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the constructor {@link HDRColor3#HDRColor3(float, float, float)} aktually works
//	 * and that the components are set to the respective parameters in unit space (0.0 - 1.0). Also it ensures,
//	 * that the parameters don't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void ctorComponentsUnitSpaceTest()
//	{
//		HDRColor3 color1 = new HDRColor3(1.2f, 3.4f, 5.6f);
//		
//		assertEquals(1.2f, color1.r);
//		assertEquals(3.4f, color1.g);
//		assertEquals(5.6f, color1.b);
//		
//		HDRColor3 color2 = new HDRColor3(-1.2f, -3.4f, -5.6f);
//		
//		assertEquals(-1.2f, color2.r);
//		assertEquals(-3.4f, color2.g);
//		assertEquals(-5.6f, color2.b);
//	}
//	
//	/**
//	 * This test ensures, that the constructor {@link HDRColor3#HDRColor3(int, int, int)} aktually works
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
//		HDRColor3 color1 = new HDRColor3(255 * 2, 255 * 4, 255 * 6);
//		
//		assertTrue(Math.abs(2f - color1.r) < epsilon);
//		assertTrue(Math.abs(4f - color1.g) < epsilon);
//		assertTrue(Math.abs(6f - color1.b) < epsilon);
//		
//		HDRColor3 color2 = new HDRColor3(255 * -2, 255 * -4, 255 * -6);
//		
//		assertTrue(Math.abs(-2f - color2.r) < epsilon);
//		assertTrue(Math.abs(-4f - color2.g) < epsilon);
//		assertTrue(Math.abs(-6f - color2.b) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor3#setX(float)} sets the r component to the value
//	 * in unit space (0.0 - 1.0). Also it ensures, that the value doesn't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void setXTest()
//	{
//		HDRColor3 color1 = new HDRColor3();
//		
//		assertSame(color1, color1.setX(3.4f));
//		assertEquals(3.4f, color1.r);
//		
//		HDRColor3 color2 = new HDRColor3();
//		
//		assertSame(color2, color2.setX(-3.4f));
//		assertEquals(-3.4f, color2.r);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor3#setY(float)} sets the g component to the value
//	 * in unit space (0.0 - 1.0). Also it ensures, that the value doesn't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void setYTest()
//	{
//		HDRColor3 color1 = new HDRColor3();
//		
//		assertSame(color1, color1.setY(3.4f));
//		assertEquals(3.4f, color1.g);
//		
//		HDRColor3 color2 = new HDRColor3();
//		
//		assertSame(color2, color2.setY(-3.4f));
//		assertEquals(-3.4f, color2.g);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor3#setZ(float)} sets the b component to the value
//	 * in unit space (0.0 - 1.0). Also it ensures, that the value doesn't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void setZTest()
//	{
//		HDRColor3 color1 = new HDRColor3();
//		
//		assertSame(color1, color1.setZ(3.4f));
//		assertEquals(3.4f, color1.b);
//		
//		HDRColor3 color2 = new HDRColor3();
//		
//		assertSame(color2, color2.setZ(-3.4f));
//		assertEquals(-3.4f, color2.b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor3#setUnityR(float)} sets the r component to the value
//	 * in unit space (0.0 - 1.0). Also it ensures, that the value doesn't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void setUnityRTest()
//	{
//		HDRColor3 color1 = new HDRColor3();
//		
//		assertSame(color1, color1.setUnityR(3.4f));
//		assertEquals(3.4f, color1.r);
//		
//		HDRColor3 color2 = new HDRColor3();
//		
//		assertSame(color2, color2.setUnityR(-3.4f));
//		assertEquals(-3.4f, color2.r);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor3#setUnityG(float)} sets the g component to the value
//	 * in unit space (0.0 - 1.0). Also it ensures, that the value doesn't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void setUnityGTest()
//	{
//		HDRColor3 color1 = new HDRColor3();
//		
//		assertSame(color1, color1.setUnityG(3.4f));
//		assertEquals(3.4f, color1.g);
//		
//		HDRColor3 color2 = new HDRColor3();
//		
//		assertSame(color2, color2.setUnityG(-3.4f));
//		assertEquals(-3.4f, color2.g);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor3#setUnityB(float)} sets the b component to the value
//	 * in unit space (0.0 - 1.0). Also it ensures, that the value doesn't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void setUnityBTest()
//	{
//		HDRColor3 color1 = new HDRColor3();
//		
//		assertSame(color1, color1.setUnityB(3.4f));
//		assertEquals(3.4f, color1.b);
//		
//		HDRColor3 color2 = new HDRColor3();
//		
//		assertSame(color2, color2.setUnityB(-3.4f));
//		assertEquals(-3.4f, color2.b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor3#setR(int)} sets the r component to the value
//	 * in color space (0 - 255). Also it ensures, that the value doesn't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void setRTest()
//	{
//		float epsilon = 0.000001f;
//		
//		HDRColor3 color1 = new HDRColor3();
//
//		assertSame(color1, color1.setR(255 * 4));
//		assertTrue(Math.abs(4f - color1.r) < epsilon);
//		
//		HDRColor3 color2 = new HDRColor3();
//		
//		assertSame(color2, color2.setR(255 * -4));
//		assertTrue(Math.abs(-4f - color2.r) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor3#setG(int)} sets the g component to the value
//	 * in color space (0 - 255). Also it ensures, that the value doesn't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void setGTest()
//	{
//		float epsilon = 0.000001f;
//		
//		HDRColor3 color1 = new HDRColor3();
//
//		assertSame(color1, color1.setG(255 * 4));
//		assertTrue(Math.abs(4f - color1.g) < epsilon);
//		
//		HDRColor3 color2 = new HDRColor3();
//		
//		assertSame(color2, color2.setG(255 * -4));
//		assertTrue(Math.abs(-4f - color2.g) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor3#setB(int)} sets the b component to the value
//	 * in color space (0 - 255). Also it ensures, that the value doesn't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void setBTest()
//	{
//		float epsilon = 0.000001f;
//		
//		HDRColor3 color1 = new HDRColor3();
//
//		assertSame(color1, color1.setB(255 * 4));
//		assertTrue(Math.abs(4f - color1.b) < epsilon);
//		
//		HDRColor3 color2 = new HDRColor3();
//		
//		assertSame(color2, color2.setB(255 * -4));
//		assertTrue(Math.abs(-4f - color2.b) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function
//	 * {@link HDRColor3#set(org.barghos.core.api.tuple3.Tup3fR) HDRColor3.set(Tup3fR)}
//	 * adopts the components from the tuple in unit space (0.0 - 1.0). Also it ensures,
//	 * that the adopted values are not clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void set_cloneUnitSpaceTest()
//	{
//		HDRColor3 color1 = new HDRColor3();
//		
//		assertSame(color1, color1.set(PTup3f.gen(1.2f, 3.4f, 5.6f)));
//		assertEquals(1.2f, color1.r);
//		assertEquals(3.4f, color1.g);
//		assertEquals(5.6f, color1.b);
//		
//		HDRColor3 color2 = new HDRColor3();
//		
//		assertSame(color2, color2.set(PTup3f.gen(-1.2f, -3.4f, -5.6f)));
//		assertEquals(-1.2f, color2.r);
//		assertEquals(-3.4f, color2.g);
//		assertEquals(-5.6f, color2.b);
//	}
//	
//	/**
//	 * This test ensures, that the function
//	 * {@link HDRColor3#set(org.barghos.core.api.tuple3.Tup3iR) HDRColor3.set(Tup3iR)}
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
//		HDRColor3 color1 = new HDRColor3();
//		
//		assertSame(color1, color1.set(PTup3i.gen(255 * 2, 255 * 4, 255 * 6)));
//		assertTrue(Math.abs(2f - color1.r) < epsilon);
//		assertTrue(Math.abs(4f - color1.g) < epsilon);
//		assertTrue(Math.abs(6f - color1.b) < epsilon);
//		
//		HDRColor3 color2 = new HDRColor3();
//		
//		assertSame(color2, color2.set(PTup3i.gen(255 * -2, 255 * -4, 255 * -6)));
//		assertTrue(Math.abs(-2f - color2.r) < epsilon);
//		assertTrue(Math.abs(-4f - color2.g) < epsilon);
//		assertTrue(Math.abs(-6f - color2.b) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor3#set(float)} sets the components to the scalar
//	 * in unit space (0.0 - 1.0). Also it ensures, that the scalar doesn't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void set_scalarUnitSpaceTest()
//	{
//		HDRColor3 color1 = new HDRColor3();
//		
//		assertSame(color1, color1.set(3.4f));
//		assertEquals(3.4f, color1.r);
//		assertEquals(3.4f, color1.g);
//		assertEquals(3.4f, color1.b);
//		
//		HDRColor3 color2 = new HDRColor3();
//		
//		assertSame(color2, color2.set(-3.4f));
//		assertEquals(-3.4f, color2.r);
//		assertEquals(-3.4f, color2.g);
//		assertEquals(-3.4f, color2.b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor3#set(int)} sets the components to the scalar
//	 * in color space (0 - 255). Also it ensures, that the scalar doesn't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void set_scalarColorSpaceTest()
//	{
//		float epsilon = 0.000001f;
//		
//		HDRColor3 color1 = new HDRColor3();
//		
//		assertSame(color1, color1.set(255 * 4));
//		assertTrue(Math.abs(4f - color1.r) < epsilon);
//		assertTrue(Math.abs(4f - color1.g) < epsilon);
//		assertTrue(Math.abs(4f - color1.b) < epsilon);
//		
//		HDRColor3 color2 = new HDRColor3();
//		
//		assertSame(color2, color2.set(255 * -4));
//		assertTrue(Math.abs(-4f - color2.r) < epsilon);
//		assertTrue(Math.abs(-4f - color2.g) < epsilon);
//		assertTrue(Math.abs(-4f - color2.b) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor3#set(float, float, float)} sets the components to
//	 * the respective parameters in unit space (0.0 - 1.0). Also it ensures, that the parameters don't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void set_componentsUnitSpaceTest()
//	{
//		HDRColor3 color1 = new HDRColor3();
//		
//		assertSame(color1, color1.set(1.2f, 3.4f, 5.6f));
//		assertEquals(1.2f, color1.r);
//		assertEquals(3.4f, color1.g);
//		assertEquals(5.6f, color1.b);
//		
//		HDRColor3 color2 = new HDRColor3();
//		
//		assertSame(color2, color2.set(-1.2f, -3.4f, -5.6f));
//		assertEquals(-1.2f, color2.r);
//		assertEquals(-3.4f, color2.g);
//		assertEquals(-5.6f, color2.b);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor3#set(int, int, int)} sets the components to
//	 * the respective parameters in unit space (0 - 255). Also it ensures, that the parameters don't get clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void set_componentsColorSpaceTest()
//	{
//		float epsilon = 0.000001f;
//		
//		HDRColor3 color1 = new HDRColor3();
//		
//		assertSame(color1, color1.set(255 * 2, 255 * 4, 255 * 6));
//		assertTrue(Math.abs(2f - color1.r) < epsilon);
//		assertTrue(Math.abs(4f - color1.g) < epsilon);
//		assertTrue(Math.abs(6f - color1.b) < epsilon);
//		
//		HDRColor3 color2 = new HDRColor3();
//		
//		assertSame(color2, color2.set(255 * -2, 255 * -4, 255 * -6));
//		assertTrue(Math.abs(-2f - color2.r) < epsilon);
//		assertTrue(Math.abs(-4f - color2.g) < epsilon);
//		assertTrue(Math.abs(-6f - color2.b) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor3#getR()} returns the r component.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void getRTest()
//	{
//		float epsilon = 0.000001f;
//		
//		HDRColor3 color = new HDRColor3(255 * 2, 255 * 4, 255 * 6);
//		
//		assertTrue(Math.abs(255 * 2 - color.getR()) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor3#getG()} returns the g component.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void getGTest()
//	{
//		float epsilon = 0.000001f;
//		
//		HDRColor3 color = new HDRColor3(255 * 2, 255 * 4, 255 * 6);
//		
//		assertTrue(Math.abs(255 * 4 - color.getG()) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor3#getB()} returns the b component.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void getBTest()
//	{
//		float epsilon = 0.000001f;
//		
//		HDRColor3 color = new HDRColor3(255 * 2, 255 * 4, 255 * 6);
//		
//		assertTrue(Math.abs(255 * 6 - color.getB()) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor3#getUnityR()} returns the r component.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void getUnityRTest()
//	{
//		HDRColor3 color = new HDRColor3(1.2f, 3.4f, 5.6f);
//		
//		assertEquals(1.2f, color.getUnityR());
//		assertEquals(color.r, color.getUnityR());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor3#getUnityG()} returns the g component.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void getUnityGTest()
//	{
//		HDRColor3 color = new HDRColor3(1.2f, 3.4f, 5.6f);
//		
//		assertEquals(3.4f, color.getUnityG());
//		assertEquals(color.g, color.getUnityG());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link HDRColor3#getUnityB()} returns the b component.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void getUnityBTest()
//	{
//		HDRColor3 color = new HDRColor3(1.2f, 3.4f, 5.6f);
//		
//		assertEquals(5.6f, color.getUnityB());
//		assertEquals(color.b, color.getUnityB());
//	}
//}