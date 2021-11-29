//package org.barghos.core.test.color;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Test;
//
//import org.barghos.core.color.PLDRColor3;
//import org.barghos.core.tuple3.PTup3f;
//import org.barghos.core.tuple3.PTup3i;
//
///**
// * This class provides component tests for the class {@link PLDRColor3}.
// * 
// * @author picatrix1899
// * 
// * @since 1.0.0.0
// */
//class PLDRColor3Test
//{
//	/**
//	 * This test ensures, that the function
//	 * {@link PLDRColor3#gen(org.barghos.core.api.tuple3.Tup3fR) PLDRColor3.gen(Tup3fR)}
//	 * adopts the components from the tuple. Also it ensures that the parameters get clamped
//	 * in the range of 0.0 to 1.0.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void gen_CloneUnitSpaceTest()
//	{
//		float epsilon = 0.000001f;
//		
//		PLDRColor3 color1 = PLDRColor3.gen(PTup3f.gen(0f, 0.6f, 1f));
//		
//		assertEquals(0f, color1.getUnityR());
//		assertEquals(0.6f, color1.getUnityG());
//		assertEquals(1f, color1.getUnityB());
//		
//		assertTrue(Math.abs(0 - color1.getR()) < epsilon);
//		assertTrue(Math.abs(153 - color1.getG()) < epsilon);
//		assertTrue(Math.abs(255 - color1.getB()) < epsilon);
//		
//		PLDRColor3 color2 = PLDRColor3.gen(PTup3f.gen(1.2f, 3.4f, 5.6f));
//		
//		assertEquals(1f, color2.getUnityR());
//		assertEquals(1f, color2.getUnityG());
//		assertEquals(1f, color2.getUnityB());
//		
//		assertTrue(Math.abs(255 - color2.getR()) < epsilon);
//		assertTrue(Math.abs(255 - color2.getG()) < epsilon);
//		assertTrue(Math.abs(255 - color2.getB()) < epsilon);
//		
//		PLDRColor3 color3 = PLDRColor3.gen(PTup3f.gen(-1.2f, -3.4f, -5.6f));
//		
//		assertEquals(0f, color3.getUnityR());
//		assertEquals(0f, color3.getUnityG());
//		assertEquals(0f, color3.getUnityB());
//		
//		assertTrue(Math.abs(0 - color3.getR()) < epsilon);
//		assertTrue(Math.abs(0 - color3.getG()) < epsilon);
//		assertTrue(Math.abs(0 - color3.getB()) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function
//	 * {@link PLDRColor3#gen(org.barghos.core.api.tuple3.Tup3iR) PLDRColor3.gen(Tup3iR)}
//	 * adopts the components from the tuple. Also it ensures that the parameters get clamped
//	 * in the range of 0 to 255.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void gen_CloneColorSpaceTest()
//	{
//		float epsilon = 0.000001f;
//		
//		PLDRColor3 color1 = PLDRColor3.gen(PTup3i.gen(0, 153, 255));
//		
//		assertTrue(Math.abs(0f - color1.getUnityR()) < epsilon);
//		assertTrue(Math.abs(0.6f - color1.getUnityG()) < epsilon);
//		assertTrue(Math.abs(1f - color1.getUnityB()) < epsilon);
//		
//		PLDRColor3 color2 = PLDRColor3.gen(PTup3i.gen(255 * 2, 255 * 4, 255 * 6));
//		
//		assertTrue(Math.abs(1f - color2.getUnityR()) < epsilon);
//		assertTrue(Math.abs(1f - color2.getUnityG()) < epsilon);
//		assertTrue(Math.abs(1f - color2.getUnityB()) < epsilon);
//		
//		PLDRColor3 color3 = PLDRColor3.gen(PTup3i.gen(255 * -2, 255 * -4, 255 * -6));
//		
//		assertTrue(Math.abs(0f - color3.getUnityR()) < epsilon);
//		assertTrue(Math.abs(0f - color3.getUnityG()) < epsilon);
//		assertTrue(Math.abs(0f - color3.getUnityB()) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link PLDRColor3#gen(float)}
//	 * sets the components to the scalar. Also it ensures that the scalar gets clamped
//	 * in the range of 0.0 to 1.0.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void gen_ScalarUnitSpaceTest()
//	{
//		PLDRColor3 color1 = PLDRColor3.gen(0.5f);
//		
//		assertEquals(0.5f, color1.getUnityR());
//		assertEquals(0.5f, color1.getUnityG());
//		assertEquals(0.5f, color1.getUnityB());
//		
//		PLDRColor3 color2 = PLDRColor3.gen(1.2f);
//		
//		assertEquals(1f, color2.getUnityR());
//		assertEquals(1f, color2.getUnityG());
//		assertEquals(1f, color2.getUnityB());
//		
//		PLDRColor3 color3 = PLDRColor3.gen(-1.2f);
//		
//		assertEquals(0f, color3.getUnityR());
//		assertEquals(0f, color3.getUnityG());
//		assertEquals(0f, color3.getUnityB());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link PLDRColor3#gen(int)}
//	 * sets the components to scalar. Also it ensures that the scalar gets clamped
//	 * in the range of 0 to 255.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void gen_ScalarColorSpaceTest()
//	{
//		float epsilon = 0.000001f;
//		
//		PLDRColor3 color1 = PLDRColor3.gen(153);
//		
//		assertTrue(Math.abs(0.6f - color1.getUnityR()) < epsilon);
//		assertTrue(Math.abs(0.6f - color1.getUnityG()) < epsilon);
//		assertTrue(Math.abs(0.6f - color1.getUnityB()) < epsilon);
//		
//		PLDRColor3 color2 = PLDRColor3.gen(255 * 2);
//		
//		assertTrue(Math.abs(1f - color2.getUnityR()) < epsilon);
//		assertTrue(Math.abs(1f - color2.getUnityG()) < epsilon);
//		assertTrue(Math.abs(1f - color2.getUnityB()) < epsilon);
//		
//		PLDRColor3 color3 = PLDRColor3.gen(255 * -2);
//		
//		assertTrue(Math.abs(0f - color3.getUnityR()) < epsilon);
//		assertTrue(Math.abs(0f - color3.getUnityG()) < epsilon);
//		assertTrue(Math.abs(0f - color3.getUnityB()) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link PLDRColor3#gen(float, float, float)}
//	 * sets the components to the corresponding parameters. Also it ensures that the parameters get clamped
//	 * in the range of 0.0 to 1.0.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void gen_ComponentsUnitSpaceTest()
//	{
//		PLDRColor3 color1 = PLDRColor3.gen(0f, 0.5f, 1f);
//		
//		assertEquals(0f, color1.getUnityR());
//		assertEquals(0.5f, color1.getUnityG());
//		assertEquals(1f, color1.getUnityB());
//		
//		PLDRColor3 color2 = PLDRColor3.gen(1.2f, 3.4f, 5.6f);
//		
//		assertEquals(1f, color2.getUnityR());
//		assertEquals(1f, color2.getUnityG());
//		assertEquals(1f, color2.getUnityB());
//		
//		PLDRColor3 color3 = PLDRColor3.gen(-1.2f, -3.4f, -5.6f);
//		
//		assertEquals(0f, color3.getUnityR());
//		assertEquals(0f, color3.getUnityG());
//		assertEquals(0f, color3.getUnityB());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link PLDRColor3#gen(int, int, int)}
//	 * sets the components to the corresponding parameters. Also it ensures that the parameters get clamped
//	 * in the range of 0 to 255.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void gen_ComponentsColorSpaceTest()
//	{
//		float epsilon = 0.000001f;
//		
//		PLDRColor3 color1 = PLDRColor3.gen(0, 153, 255);
//		
//		assertTrue(Math.abs(0f - color1.getUnityR()) < epsilon);
//		assertTrue(Math.abs(0.6f - color1.getUnityG()) < epsilon);
//		assertTrue(Math.abs(1f - color1.getUnityB()) < epsilon);
//		
//		PLDRColor3 color2 = PLDRColor3.gen(255 * 2, 255 * 4, 255 * 6);
//		
//		assertTrue(Math.abs(1f - color2.getUnityR()) < epsilon);
//		assertTrue(Math.abs(1f - color2.getUnityG()) < epsilon);
//		assertTrue(Math.abs(1f - color2.getUnityB()) < epsilon);
//		
//		PLDRColor3 color3 = PLDRColor3.gen(255 * -2, 255 * -4, 255 * -6);
//		
//		assertTrue(Math.abs(0f - color3.getUnityR()) < epsilon);
//		assertTrue(Math.abs(0f - color3.getUnityG()) < epsilon);
//		assertTrue(Math.abs(0f - color3.getUnityB()) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link PLDRColor3#getUnityR()}
//	 * returns the r component.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void getUnityRTest()
//	{
//		float epsilon = 0.000001f;
//		
//		PLDRColor3 color1 = PLDRColor3.gen(0f, 0.6f, 1f);
//		
//		assertEquals(0f, color1.getUnityR());
//		
//		PLDRColor3 color2 = PLDRColor3.gen(0, 153, 255);
//		
//		assertTrue(Math.abs(0f - color2.getUnityR()) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link PLDRColor3#getUnityG()}
//	 * returns the g component.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void getUnityGTest()
//	{
//		float epsilon = 0.000001f;
//		
//		PLDRColor3 color1 = PLDRColor3.gen(0f, 0.6f, 1f);
//		
//		assertEquals(0.6f, color1.getUnityG());
//		
//		PLDRColor3 color2 = PLDRColor3.gen(0, 153, 255);
//		
//		assertTrue(Math.abs(0.6f - color2.getUnityG()) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link PLDRColor3#getUnityB()}
//	 * returns the b component.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void getUnityBTest()
//	{
//		float epsilon = 0.000001f;
//		
//		PLDRColor3 color1 = PLDRColor3.gen(0f, 0.6f, 1f);
//		
//		assertEquals(1f, color1.getUnityB());
//		
//		PLDRColor3 color2 = PLDRColor3.gen(0, 153, 255);
//		
//		assertTrue(Math.abs(1f - color2.getUnityB()) < epsilon);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link PLDRColor3#getR()}
//	 * returns the r component.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void getRTest()
//	{
//		float epsilon = 0.000001f;
//		
//		PLDRColor3 color1 = PLDRColor3.gen(0f, 0.6f, 1f);
//		
//		assertTrue(Math.abs(0 - color1.getR()) < epsilon);
//		
//		PLDRColor3 color2 = PLDRColor3.gen(0, 153, 255);
//		
//		assertEquals(0, color2.getR());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link PLDRColor3#getG()}
//	 * returns the g component.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void getGTest()
//	{
//		float epsilon = 0.000001f;
//		
//		PLDRColor3 color1 = PLDRColor3.gen(0f, 0.6f, 1f);
//		
//		assertTrue(Math.abs(153 - color1.getG()) < epsilon);
//		
//		PLDRColor3 color2 = PLDRColor3.gen(0, 153, 255);
//		
//		assertEquals(153, color2.getG());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link PLDRColor3#getB()}
//	 * returns the b component.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void getBTest()
//	{
//		float epsilon = 0.000001f;
//		
//		PLDRColor3 color1 = PLDRColor3.gen(0f, 0.6f, 1f);
//		
//		assertTrue(Math.abs(255 - color1.getB()) < epsilon);
//		
//		PLDRColor3 color2 = PLDRColor3.gen(0, 153, 255);
//		
//		assertEquals(255, color2.getB());
//	}
//}