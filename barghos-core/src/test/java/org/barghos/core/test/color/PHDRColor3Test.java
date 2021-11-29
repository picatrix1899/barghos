//package org.barghos.core.test.color;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Test;
//
//import org.barghos.core.color.PHDRColor3;
//import org.barghos.core.tuple3.PTup3f;
//import org.barghos.core.tuple3.PTup3i;
//
///**
// * This class provides component tests for the class {@link PHDRColor3}.
// * 
// * @author picatrix1899
// * 
// * @since 1.0.0.0
// */
//class PHDRColor3Test
//{
//	/**
//	 * This test ensures, that the function
//	 * {@link PHDRColor3#gen(org.barghos.core.api.tuple3.Tup3fR) PHDRColor3.gen(Tup3fR)}
//	 * adopts the components from the tuple. Also it ensures that the parameters don't get
//	 * clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void gen_CloneUnitSpaceTest()
//	{
//		PHDRColor3 color1 = PHDRColor3.gen(PTup3f.gen(1.2f, 3.4f, 5.6f));
//		
//		assertEquals(1.2f, color1.getUnityR());
//		assertEquals(3.4f, color1.getUnityG());
//		assertEquals(5.6f, color1.getUnityB());
//		
//		PHDRColor3 color2 = PHDRColor3.gen(PTup3f.gen(-1.2f, -3.4f, -5.6f));
//		
//		assertEquals(-1.2f, color2.getUnityR());
//		assertEquals(-3.4f, color2.getUnityG());
//		assertEquals(-5.6f, color2.getUnityB());
//	}
//	
//	/**
//	 * This test ensures, that the function
//	 * {@link PHDRColor3#gen(org.barghos.core.api.tuple3.Tup3iR) PHDRColor3.gen(Tup3iR)}
//	 * adopts the components from the tuple. Also it ensures that the parameters don't get
//	 * clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void gen_CloneColorSpaceTest()
//	{
//		float epsilon = 0.000001f;
//		
//		PHDRColor3 color1 = PHDRColor3.gen(PTup3i.gen(255 * 2, 255 * 4, 255 * 6));
//		
//		assertTrue(Math.abs(2f - color1.getUnityR()) < epsilon);
//		assertTrue(Math.abs(4f - color1.getUnityG()) < epsilon);
//		assertTrue(Math.abs(6f - color1.getUnityB()) < epsilon);
//		
//		PHDRColor3 color2 = PHDRColor3.gen(PTup3i.gen(255 * -2, 255 * -4, 255 * -6));
//		
//		assertTrue(Math.abs(-2f - color2.getUnityR()) < epsilon);
//		assertTrue(Math.abs(-4f - color2.getUnityG()) < epsilon);
//		assertTrue(Math.abs(-6f - color2.getUnityB()) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link PHDRColor3#gen(float)}
//	 * sets the components to the scalar. Also it ensures that the scalar doesn't get
//	 * clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void gen_ScalarUnitSpaceTest()
//	{
//		PHDRColor3 color1 = PHDRColor3.gen(1.2f);
//		
//		assertEquals(1.2f, color1.getUnityR());
//		assertEquals(1.2f, color1.getUnityG());
//		assertEquals(1.2f, color1.getUnityB());
//		
//		PHDRColor3 color2 = PHDRColor3.gen(-1.2f);
//		
//		assertEquals(-1.2f, color2.getUnityR());
//		assertEquals(-1.2f, color2.getUnityG());
//		assertEquals(-1.2f, color2.getUnityB());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link PHDRColor3#gen(int)}
//	 * sets the components to scalar. Also it ensures that the scalar doesn't get
//	 * clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void gen_ScalarColorSpaceTest()
//	{
//		float epsilon = 0.000001f;
//		
//		PHDRColor3 color1 = PHDRColor3.gen(255 * 2);
//		
//		assertTrue(Math.abs(2f - color1.getUnityR()) < epsilon);
//		assertTrue(Math.abs(2f - color1.getUnityG()) < epsilon);
//		assertTrue(Math.abs(2f - color1.getUnityB()) < epsilon);
//		
//		PHDRColor3 color2 = PHDRColor3.gen(255 * -2);
//		
//		assertTrue(Math.abs(-2f - color2.getUnityR()) < epsilon);
//		assertTrue(Math.abs(-2f - color2.getUnityG()) < epsilon);
//		assertTrue(Math.abs(-2f - color2.getUnityB()) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link PHDRColor3#gen(float, float, float)}
//	 * sets the components to the corresponding parameters. Also it ensures that the parameters don't get
//	 * clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void gen_ComponentsUnitSpaceTest()
//	{
//		PHDRColor3 color1 = PHDRColor3.gen(1.2f, 3.4f, 5.6f);
//		
//		assertEquals(1.2f, color1.getUnityR());
//		assertEquals(3.4f, color1.getUnityG());
//		assertEquals(5.6f, color1.getUnityB());
//		
//		PHDRColor3 color2 = PHDRColor3.gen(-1.2f, -3.4f, -5.6f);
//		
//		assertEquals(-1.2f, color2.getUnityR());
//		assertEquals(-3.4f, color2.getUnityG());
//		assertEquals(-5.6f, color2.getUnityB());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link PHDRColor3#gen(int, int, int)}
//	 * sets the components to the corresponding parameters. Also it ensures that the parameters don't get
//	 * clamped.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void gen_ComponentsColorSpaceTest()
//	{
//		float epsilon = 0.000001f;
//		
//		PHDRColor3 color1 = PHDRColor3.gen(255 * 2, 255 * 4, 255 * 6);
//		
//		assertTrue(Math.abs(2f - color1.getUnityR()) < epsilon);
//		assertTrue(Math.abs(4f - color1.getUnityG()) < epsilon);
//		assertTrue(Math.abs(6f - color1.getUnityB()) < epsilon);
//		
//		PHDRColor3 color2 = PHDRColor3.gen(255 * -2, 255 * -4, 255 * -6);
//		
//		assertTrue(Math.abs(-2f - color2.getUnityR()) < epsilon);
//		assertTrue(Math.abs(-4f - color2.getUnityG()) < epsilon);
//		assertTrue(Math.abs(-6f - color2.getUnityB()) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link PHDRColor3#getUnityR()}
//	 * returns the r component.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void getUnityRTest()
//	{
//		float epsilon = 0.000001f;
//		
//		PHDRColor3 color1 = PHDRColor3.gen(2f, 4f, 6f);
//		
//		assertEquals(2f, color1.getUnityR());
//		
//		PHDRColor3 color2 = PHDRColor3.gen(255 * 2, 255 * 4, 255 * 6);
//		
//		assertTrue(Math.abs(2f - color2.getUnityR()) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link PHDRColor3#getUnityG()}
//	 * returns the g component.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void getUnityGTest()
//	{
//		float epsilon = 0.000001f;
//		
//		PHDRColor3 color1 = PHDRColor3.gen(2f, 4f, 6f);
//		
//		assertEquals(4f, color1.getUnityG());
//		
//		PHDRColor3 color2 = PHDRColor3.gen(255 * 2, 255 * 4, 255 * 6);
//		
//		assertTrue(Math.abs(4f - color2.getUnityG()) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link PHDRColor3#getUnityB()}
//	 * returns the b component.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void getUnityBTest()
//	{
//		float epsilon = 0.000001f;
//		
//		PHDRColor3 color1 = PHDRColor3.gen(2f, 4f, 6f);
//		
//		assertEquals(6f, color1.getUnityB());
//		
//		PHDRColor3 color2 = PHDRColor3.gen(255 * 2, 255 * 4, 255 * 6);
//		
//		assertTrue(Math.abs(6f - color2.getUnityB()) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link PHDRColor3#getR()}
//	 * returns the r component.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void getRTest()
//	{
//		float epsilon = 0.000001f;
//		
//		PHDRColor3 color1 = PHDRColor3.gen(2f, 4f, 6f);
//		
//		assertTrue(Math.abs(2 * 255 - color1.getR()) < epsilon);
//		
//		PHDRColor3 color2 = PHDRColor3.gen(255 * 2, 255 * 4,  255 * 6);
//		
//		assertEquals(2 * 255, color2.getR());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link PHDRColor3#getG()}
//	 * returns the g component.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void getGTest()
//	{
//		float epsilon = 0.000001f;
//		
//		PHDRColor3 color1 = PHDRColor3.gen(2f, 4f, 6f);
//		
//		assertTrue(Math.abs(4 * 255 - color1.getG()) < epsilon);
//		
//		PHDRColor3 color2 = PHDRColor3.gen(255 * 2, 255 * 4,  255 * 6);
//		
//		assertEquals(4 * 255, color2.getG());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link PHDRColor3#getB()}
//	 * returns the b component.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void getBTest()
//	{
//		float epsilon = 0.000001f;
//		
//		PHDRColor3 color1 = PHDRColor3.gen(2f, 4f, 6f);
//		
//		assertTrue(Math.abs(6 * 255 - color1.getB()) < epsilon);
//		
//		PHDRColor3 color2 = PHDRColor3.gen(255 * 2, 255 * 4,  255 * 6);
//		
//		assertEquals(6 * 255, color2.getB());
//	}
//}