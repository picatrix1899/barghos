package org.barghos.core.test.color;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.color.PLDRColor4;
import org.barghos.core.tuple4.PTup4f;
import org.barghos.core.tuple4.PTup4i;

/**
 * This class provides component tests for the class {@link PLDRColor4}.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
class PLDRColor4Test
{
	/**
	 * This test ensures, that the function
	 * {@link PLDRColor4#gen(org.barghos.core.api.tuple4.Tup4fR) PLDRColor4.gen(Tup4fR)}
	 * adopts the components from the tuple. Also it ensures that the parameters get clamped
	 * in the range of 0.0 to 1.0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_CloneUnitSpaceTest()
	{
		PLDRColor4 color1 = PLDRColor4.gen(PTup4f.gen(0f, 0.6f, 0.8f, 1f));
		
		assertEquals(0f, color1.getUnityR());
		assertEquals(0.6f, color1.getUnityG());
		assertEquals(0.8f, color1.getUnityB());
		assertEquals(1f, color1.getUnityA());
		
		PLDRColor4 color2 = PLDRColor4.gen(PTup4f.gen(1.2f, 3.4f, 5.6f, 7.8f));
		
		assertEquals(1f, color2.getUnityR());
		assertEquals(1f, color2.getUnityG());
		assertEquals(1f, color2.getUnityB());
		assertEquals(1f, color2.getUnityA());
		
		PLDRColor4 color3 = PLDRColor4.gen(PTup4f.gen(-1.2f, -3.4f, -5.6f, -7.8f));
		
		assertEquals(0f, color3.getUnityR());
		assertEquals(0f, color3.getUnityG());
		assertEquals(0f, color3.getUnityB());
		assertEquals(0f, color3.getUnityA());
	}
	
	/**
	 * This test ensures, that the function
	 * {@link PLDRColor4#gen(org.barghos.core.api.tuple4.Tup4iR) PLDRColor4.gen(Tup4iR)}
	 * adopts the components from the tuple. Also it ensures that the parameters get clamped
	 * in the range of 0 to 255.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_CloneColorSpaceTest()
	{
		float epsilon = 0.000001f;
		
		PLDRColor4 color1 = PLDRColor4.gen(PTup4i.gen(0, 153, 204, 255));
		
		assertTrue(Math.abs(0f - color1.getUnityR()) < epsilon);
		assertTrue(Math.abs(0.6f - color1.getUnityG()) < epsilon);
		assertTrue(Math.abs(0.8f - color1.getUnityB()) < epsilon);
		assertTrue(Math.abs(1f - color1.getUnityA()) < epsilon);
		
		PLDRColor4 color2 = PLDRColor4.gen(PTup4i.gen(255 * 2, 255 * 4, 255 * 6, 255 * 8));
		
		assertTrue(Math.abs(1f - color2.getUnityR()) < epsilon);
		assertTrue(Math.abs(1f - color2.getUnityG()) < epsilon);
		assertTrue(Math.abs(1f - color2.getUnityB()) < epsilon);
		assertTrue(Math.abs(1f - color2.getUnityA()) < epsilon);
		
		PLDRColor4 color3 = PLDRColor4.gen(PTup4i.gen(255 * -2, 255 * -4, 255 * -6, 255 * -8));
		
		assertTrue(Math.abs(0f - color3.getUnityR()) < epsilon);
		assertTrue(Math.abs(0f - color3.getUnityG()) < epsilon);
		assertTrue(Math.abs(0f - color3.getUnityB()) < epsilon);
		assertTrue(Math.abs(0f - color3.getUnityA()) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link PLDRColor4#gen(float)}
	 * sets the components to the scalar. Also it ensures that the scalar gets clamped
	 * in the range of 0.0 to 1.0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ScalarUnitSpaceTest()
	{
		PLDRColor4 color1 = PLDRColor4.gen(0.5f);
		
		assertEquals(0.5f, color1.getUnityR());
		assertEquals(0.5f, color1.getUnityG());
		assertEquals(0.5f, color1.getUnityB());
		assertEquals(0.5f, color1.getUnityA());
		
		PLDRColor4 color2 = PLDRColor4.gen(1.2f);
		
		assertEquals(1f, color2.getUnityR());
		assertEquals(1f, color2.getUnityG());
		assertEquals(1f, color2.getUnityB());
		assertEquals(1f, color2.getUnityA());
		
		PLDRColor4 color3 = PLDRColor4.gen(-1.2f);
		
		assertEquals(0f, color3.getUnityR());
		assertEquals(0f, color3.getUnityG());
		assertEquals(0f, color3.getUnityB());
		assertEquals(0f, color3.getUnityA());
	}
	
	/**
	 * This test ensures, that the function {@link PLDRColor4#gen(int)}
	 * sets the components to scalar. Also it ensures that the scalar gets clamped
	 * in the range of 0 to 255.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ScalarColorSpaceTest()
	{
		float epsilon = 0.000001f;
		
		PLDRColor4 color1 = PLDRColor4.gen(153);
		
		assertTrue(Math.abs(0.6f - color1.getUnityR()) < epsilon);
		assertTrue(Math.abs(0.6f - color1.getUnityG()) < epsilon);
		assertTrue(Math.abs(0.6f - color1.getUnityB()) < epsilon);
		assertTrue(Math.abs(0.6f - color1.getUnityA()) < epsilon);
		
		PLDRColor4 color2 = PLDRColor4.gen(255 * 2);
		
		assertTrue(Math.abs(1f - color2.getUnityR()) < epsilon);
		assertTrue(Math.abs(1f - color2.getUnityG()) < epsilon);
		assertTrue(Math.abs(1f - color2.getUnityB()) < epsilon);
		assertTrue(Math.abs(1f - color2.getUnityA()) < epsilon);
		
		PLDRColor4 color3 = PLDRColor4.gen(255 * -2);
		
		assertTrue(Math.abs(0f - color3.getUnityR()) < epsilon);
		assertTrue(Math.abs(0f - color3.getUnityG()) < epsilon);
		assertTrue(Math.abs(0f - color3.getUnityB()) < epsilon);
		assertTrue(Math.abs(0f - color3.getUnityA()) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link PLDRColor4#gen(float, float, float, float)}
	 * sets the components to the corresponding parameters. Also it ensures that the parameters get clamped
	 * in the range of 0.0 to 1.0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ComponentsUnitSpaceTest()
	{
		PLDRColor4 color1 = PLDRColor4.gen(0f, 0.6f, 0.8f, 1f);
		
		assertEquals(0f, color1.getUnityR());
		assertEquals(0.6f, color1.getUnityG());
		assertEquals(0.8f, color1.getUnityB());
		assertEquals(1f, color1.getUnityA());
		
		PLDRColor4 color2 = PLDRColor4.gen(1.2f, 3.4f, 5.6f, 7.8f);
		
		assertEquals(1f, color2.getUnityR());
		assertEquals(1f, color2.getUnityG());
		assertEquals(1f, color2.getUnityB());
		assertEquals(1f, color2.getUnityA());
		
		PLDRColor4 color3 = PLDRColor4.gen(-1.2f, -3.4f, -5.6f, -7.8f);
		
		assertEquals(0f, color3.getUnityR());
		assertEquals(0f, color3.getUnityG());
		assertEquals(0f, color3.getUnityB());
		assertEquals(0f, color3.getUnityA());
	}
	
	/**
	 * This test ensures, that the function {@link PLDRColor4#gen(int, int, int, int)}
	 * sets the components to the corresponding parameters. Also it ensures that the parameters get clamped
	 * in the range of 0 to 255.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ComponentsColorSpaceTest()
	{
		float epsilon = 0.000001f;
		
		PLDRColor4 color1 = PLDRColor4.gen(0, 153, 204, 255);
		
		assertTrue(Math.abs(0f - color1.getUnityR()) < epsilon);
		assertTrue(Math.abs(0.6f - color1.getUnityG()) < epsilon);
		assertTrue(Math.abs(0.8f - color1.getUnityB()) < epsilon);
		assertTrue(Math.abs(1f - color1.getUnityA()) < epsilon);
		
		PLDRColor4 color2 = PLDRColor4.gen(255 * 2, 255 * 4, 255 * 6, 255 * 8);
		
		assertTrue(Math.abs(1f - color2.getUnityR()) < epsilon);
		assertTrue(Math.abs(1f - color2.getUnityG()) < epsilon);
		assertTrue(Math.abs(1f - color2.getUnityB()) < epsilon);
		assertTrue(Math.abs(1f - color2.getUnityA()) < epsilon);
		
		PLDRColor4 color3 = PLDRColor4.gen(255 * -2, 255 * -4, 255 * -6, 255 * -8);
		
		assertTrue(Math.abs(0f - color3.getUnityR()) < epsilon);
		assertTrue(Math.abs(0f - color3.getUnityG()) < epsilon);
		assertTrue(Math.abs(0f - color3.getUnityB()) < epsilon);
		assertTrue(Math.abs(0f - color3.getUnityA()) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link PLDRColor4#getUnityR()}
	 * returns the r component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getUnityRTest()
	{
		float epsilon = 0.000001f;
		
		PLDRColor4 color1 = PLDRColor4.gen(0f, 0.6f, 0.8f, 1f);
		
		assertEquals(0f, color1.getUnityR());
		
		PLDRColor4 color2 = PLDRColor4.gen(0, 153, 204, 255);
		
		assertTrue(Math.abs(0f - color2.getUnityR()) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link PLDRColor4#getUnityG()}
	 * returns the g component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getUnityGTest()
	{
		float epsilon = 0.000001f;
		
		PLDRColor4 color1 = PLDRColor4.gen(0f, 0.6f, 0.8f, 1f);
		
		assertEquals(0.6f, color1.getUnityG());
		
		PLDRColor4 color2 = PLDRColor4.gen(0, 153, 204, 255);
		
		assertTrue(Math.abs(0.6f - color2.getUnityG()) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link PLDRColor4#getUnityB()}
	 * returns the b component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getUnityBTest()
	{
		float epsilon = 0.000001f;
		
		PLDRColor4 color1 = PLDRColor4.gen(0f, 0.6f, 0.8f, 1f);
		
		assertEquals(0.8f, color1.getUnityB());
		
		PLDRColor4 color2 = PLDRColor4.gen(0, 153, 204, 255);
		
		assertTrue(Math.abs(0.8f - color2.getUnityB()) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link PLDRColor4#getUnityA()}
	 * returns the a component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getUnityATest()
	{
		float epsilon = 0.000001f;
		
		PLDRColor4 color1 = PLDRColor4.gen(0f, 0.6f, 0.8f, 1f);
		
		assertEquals(1f, color1.getUnityA());
		
		PLDRColor4 color2 = PLDRColor4.gen(0, 153, 204, 255);
		
		assertTrue(Math.abs(1f - color2.getUnityA()) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link PLDRColor4#getR()}
	 * returns the r component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getRTest()
	{
		float epsilon = 0.000001f;
		
		PLDRColor4 color1 = PLDRColor4.gen(0f, 0.6f, 0.8f, 1f);
		
		assertTrue(Math.abs(0 - color1.getR()) < epsilon);
		
		PLDRColor4 color2 = PLDRColor4.gen(0, 153, 204, 255);
		
		assertEquals(0, color2.getR());
	}
	
	/**
	 * This test ensures, that the function {@link PLDRColor4#getG()}
	 * returns the g component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getGTest()
	{
		float epsilon = 0.000001f;
		
		PLDRColor4 color1 = PLDRColor4.gen(0f, 0.6f, 0.8f, 1f);
		
		assertTrue(Math.abs(153 - color1.getG()) < epsilon);
		
		PLDRColor4 color2 = PLDRColor4.gen(0, 153, 204, 255);
		
		assertEquals(153, color2.getG());
	}
	
	/**
	 * This test ensures, that the function {@link PLDRColor4#getB()}
	 * returns the b component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getBTest()
	{
		float epsilon = 0.000001f;
		
		PLDRColor4 color1 = PLDRColor4.gen(0f, 0.6f, 0.8f, 1f);
		
		assertTrue(Math.abs(204 - color1.getB()) < epsilon);
		
		PLDRColor4 color2 = PLDRColor4.gen(0, 153, 204, 255);
		
		assertEquals(204, color2.getB());
	}
	
	/**
	 * This test ensures, that the function {@link PLDRColor4#getA()}
	 * returns the a component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getATest()
	{
		float epsilon = 0.000001f;
		
		PLDRColor4 color1 = PLDRColor4.gen(0f, 0.6f, 0.8f, 1f);
		
		assertTrue(Math.abs(255 - color1.getA()) < epsilon);
		
		PLDRColor4 color2 = PLDRColor4.gen(0, 153, 204, 255);
		
		assertEquals(255, color2.getA());
	}
}