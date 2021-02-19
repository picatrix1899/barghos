package org.barghos.core.test.color;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.color.PHDRColor4;
import org.barghos.core.tuple4.PTup4f;
import org.barghos.core.tuple4.PTup4i;

/**
 * This class provides component tests for the class {@link PHDRColor4}.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
class PHDRColor4Test
{
	/**
	 * This test ensures, that the function
	 * {@link PHDRColor4#gen(org.barghos.core.api.tuple4.Tup4fR) PHDRColor4.gen(Tup4fR)}
	 * adopts the components from the tuple. Also it ensures that the parameters don't get
	 * clamped.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_CloneUnitSpaceTest()
	{
		PHDRColor4 color1 = PHDRColor4.gen(PTup4f.gen(1.2f, 3.4f, 5.6f, 7.8f));
		
		assertEquals(1.2f, color1.getUnityR());
		assertEquals(3.4f, color1.getUnityG());
		assertEquals(5.6f, color1.getUnityB());
		assertEquals(7.8f, color1.getUnityA());
		
		PHDRColor4 color2 = PHDRColor4.gen(PTup4f.gen(-1.2f, -3.4f, -5.6f, -7.8f));
		
		assertEquals(-1.2f, color2.getUnityR());
		assertEquals(-3.4f, color2.getUnityG());
		assertEquals(-5.6f, color2.getUnityB());
		assertEquals(-7.8f, color2.getUnityA());
	}
	
	/**
	 * This test ensures, that the function
	 * {@link PHDRColor4#gen(org.barghos.core.api.tuple4.Tup4iR) PHDRColor4.gen(Tup4iR)}
	 * adopts the components from the tuple. Also it ensures that the parameters don't get
	 * clamped.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_CloneColorSpaceTest()
	{
		float epsilon = 0.000001f;
		
		PHDRColor4 color1 = PHDRColor4.gen(PTup4i.gen(255 * 2, 255 * 4, 255 * 6, 255 * 8));
		
		assertTrue(Math.abs(2f - color1.getUnityR()) < epsilon);
		assertTrue(Math.abs(4f - color1.getUnityG()) < epsilon);
		assertTrue(Math.abs(6f - color1.getUnityB()) < epsilon);
		assertTrue(Math.abs(8f - color1.getUnityA()) < epsilon);
		
		PHDRColor4 color2 = PHDRColor4.gen(PTup4i.gen(255 * -2, 255 * -4, 255 * -6, 255 * -8));
		
		assertTrue(Math.abs(-2f - color2.getUnityR()) < epsilon);
		assertTrue(Math.abs(-4f - color2.getUnityG()) < epsilon);
		assertTrue(Math.abs(-6f - color2.getUnityB()) < epsilon);
		assertTrue(Math.abs(-8f - color2.getUnityA()) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link PHDRColor4#gen(float)}
	 * sets the components to the scalar. Also it ensures that the scalar doesn't get
	 * clamped.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ScalarUnitSpaceTest()
	{
		PHDRColor4 color1 = PHDRColor4.gen(1.2f);
		
		assertEquals(1.2f, color1.getUnityR());
		assertEquals(1.2f, color1.getUnityG());
		assertEquals(1.2f, color1.getUnityB());
		assertEquals(1.2f, color1.getUnityA());
		
		PHDRColor4 color2 = PHDRColor4.gen(-1.2f);
		
		assertEquals(-1.2f, color2.getUnityR());
		assertEquals(-1.2f, color2.getUnityG());
		assertEquals(-1.2f, color2.getUnityB());
		assertEquals(-1.2f, color2.getUnityA());
	}
	
	/**
	 * This test ensures, that the function {@link PHDRColor4#gen(int)}
	 * sets the components to scalar. Also it ensures that the scalar doesn't get
	 * clamped.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ScalarColorSpaceTest()
	{
		float epsilon = 0.000001f;
		
		PHDRColor4 color1 = PHDRColor4.gen(255 * 2);
		
		assertTrue(Math.abs(2f - color1.getUnityR()) < epsilon);
		assertTrue(Math.abs(2f - color1.getUnityG()) < epsilon);
		assertTrue(Math.abs(2f - color1.getUnityB()) < epsilon);
		assertTrue(Math.abs(2f - color1.getUnityA()) < epsilon);
		
		PHDRColor4 color2 = PHDRColor4.gen(255 * -2);
		
		assertTrue(Math.abs(-2f - color2.getUnityR()) < epsilon);
		assertTrue(Math.abs(-2f - color2.getUnityG()) < epsilon);
		assertTrue(Math.abs(-2f - color2.getUnityB()) < epsilon);
		assertTrue(Math.abs(-2f - color2.getUnityA()) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link PHDRColor4#gen(float, float, float, float)}
	 * sets the components to the corresponding parameters. Also it ensures that the parameters don't get
	 * clamped.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ComponentsUnitSpaceTest()
	{
		PHDRColor4 color1 = PHDRColor4.gen(1.2f, 3.4f, 5.6f, 7.8f);
		
		assertEquals(1.2f, color1.getUnityR());
		assertEquals(3.4f, color1.getUnityG());
		assertEquals(5.6f, color1.getUnityB());
		assertEquals(7.8f, color1.getUnityA());
		
		PHDRColor4 color2 = PHDRColor4.gen(-1.2f, -3.4f, -5.6f, -7.8f);
		
		assertEquals(-1.2f, color2.getUnityR());
		assertEquals(-3.4f, color2.getUnityG());
		assertEquals(-5.6f, color2.getUnityB());
		assertEquals(-7.8f, color2.getUnityA());
	}
	
	/**
	 * This test ensures, that the function {@link PHDRColor4#gen(int, int, int, int)}
	 * sets the components to the corresponding parameters. Also it ensures that the parameters don't get
	 * clamped.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ComponentsColorSpaceTest()
	{
		float epsilon = 0.000001f;
		
		PHDRColor4 color1 = PHDRColor4.gen(255 * 2, 255 * 4, 255 * 6, 255 * 8);
		
		assertTrue(Math.abs(2f - color1.getUnityR()) < epsilon);
		assertTrue(Math.abs(4f - color1.getUnityG()) < epsilon);
		assertTrue(Math.abs(6f - color1.getUnityB()) < epsilon);
		assertTrue(Math.abs(8f - color1.getUnityA()) < epsilon);
		
		PHDRColor4 color2 = PHDRColor4.gen(255 * -2, 255 * -4, 255 * -6, 255 * -8);
		
		assertTrue(Math.abs(-2f - color2.getUnityR()) < epsilon);
		assertTrue(Math.abs(-4f - color2.getUnityG()) < epsilon);
		assertTrue(Math.abs(-6f - color2.getUnityB()) < epsilon);
		assertTrue(Math.abs(-8f - color2.getUnityA()) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link PHDRColor4#getUnityR()}
	 * returns the r component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getUnityRTest()
	{
		float epsilon = 0.000001f;
		
		PHDRColor4 color1 = PHDRColor4.gen(2f, 4f, 6f, 8f);
		
		assertEquals(2f, color1.getUnityR());
		
		PHDRColor4 color2 = PHDRColor4.gen(255 * 2, 255 * 4, 255 * 6, 255 * 8);
		
		assertTrue(Math.abs(2f - color2.getUnityR()) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link PHDRColor4#getUnityG()}
	 * returns the g component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getUnityGTest()
	{
		float epsilon = 0.000001f;
		
		PHDRColor4 color1 = PHDRColor4.gen(2f, 4f, 6f, 8f);
		
		assertEquals(4f, color1.getUnityG());
		
		PHDRColor4 color2 = PHDRColor4.gen(255 * 2, 255 * 4, 255 * 6, 255 * 8);
		
		assertTrue(Math.abs(4f - color2.getUnityG()) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link PHDRColor4#getUnityB()}
	 * returns the b component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getUnityBTest()
	{
		float epsilon = 0.000001f;
		
		PHDRColor4 color1 = PHDRColor4.gen(2f, 4f, 6f, 8f);
		
		assertEquals(6f, color1.getUnityB());
		
		PHDRColor4 color2 = PHDRColor4.gen(255 * 2, 255 * 4, 255 * 6, 255 * 8);
		
		assertTrue(Math.abs(6f - color2.getUnityB()) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link PHDRColor4#getUnityA()}
	 * returns the a component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getUnityATest()
	{
		float epsilon = 0.000001f;
		
		PHDRColor4 color1 = PHDRColor4.gen(2f, 4f, 6f, 8f);
		
		assertEquals(8f, color1.getUnityA());
		
		PHDRColor4 color2 = PHDRColor4.gen(255 * 2, 255 * 4, 255 * 6, 255 * 8);
		
		assertTrue(Math.abs(8f - color2.getUnityA()) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link PHDRColor4#getR()}
	 * returns the r component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getRTest()
	{
		float epsilon = 0.000001f;
		
		PHDRColor4 color1 = PHDRColor4.gen(2f, 4f, 6f, 8f);
		
		assertTrue(Math.abs(2 * 255 - color1.getR()) < epsilon);
		
		PHDRColor4 color2 = PHDRColor4.gen(255 * 2, 255 * 4,  255 * 6, 255 * 8);
		
		assertEquals(2 * 255, color2.getR());
	}
	
	/**
	 * This test ensures, that the function {@link PHDRColor4#getG()}
	 * returns the g component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getGTest()
	{
		float epsilon = 0.000001f;
		
		PHDRColor4 color1 = PHDRColor4.gen(2f, 4f, 6f, 8f);
		
		assertTrue(Math.abs(4 * 255 - color1.getG()) < epsilon);
		
		PHDRColor4 color2 = PHDRColor4.gen(255 * 2, 255 * 4,  255 * 6, 255 * 8);
		
		assertEquals(4 * 255, color2.getG());
	}
	
	/**
	 * This test ensures, that the function {@link PHDRColor4#getB()}
	 * returns the b component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getBTest()
	{
		float epsilon = 0.000001f;
		
		PHDRColor4 color1 = PHDRColor4.gen(2f, 4f, 6f, 8f);
		
		assertTrue(Math.abs(6 * 255 - color1.getB()) < epsilon);
		
		PHDRColor4 color2 = PHDRColor4.gen(255 * 2, 255 * 4,  255 * 6, 255 * 8);
		
		assertEquals(6 * 255, color2.getB());
	}
	
	/**
	 * This test ensures, that the function {@link PHDRColor4#getA()}
	 * returns the a component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getATest()
	{
		float epsilon = 0.000001f;
		
		PHDRColor4 color1 = PHDRColor4.gen(2f, 4f, 6f, 8f);
		
		assertTrue(Math.abs(8 * 255 - color1.getA()) < epsilon);
		
		PHDRColor4 color2 = PHDRColor4.gen(255 * 2, 255 * 4,  255 * 6, 255 * 8);
		
		assertEquals(8 * 255, color2.getA());
	}
}