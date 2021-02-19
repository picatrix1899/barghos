package org.barghos.core.test.color;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.color.LDRColor4;
import org.barghos.core.tuple4.PTup4f;
import org.barghos.core.tuple4.PTup4i;

/**
 * This class provides component tests for the class {@link LDRColor4}.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
class LDRColor4Test
{
	/**
	 * This test ensures, that the constructor {@link LDRColor4#LDRColor4()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		LDRColor4 color = new LDRColor4();
		
		assertEquals(0, color.r);
		assertEquals(0, color.g);
		assertEquals(0, color.b);
		assertEquals(0, color.a);
	}
	
	/**
	 * This test ensures, that the constructor
	 * {@link LDRColor4#LDRColor4(org.barghos.core.api.tuple3.Tup4fR) LDRColor4.LDRColor4(Tup4fR)}
	 * aktually works and that the components are adopted from the tuple in unit space (0.0 - 1.0). Also it ensures,
	 * that the adopted values are getting clamped to the range from 0.0 to 1.0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneUnitSpaceTest()
	{
		LDRColor4 color1 = new LDRColor4(PTup4f.gen(0f, 0.5f, 0.8f, 1f));
		
		assertEquals(0f, color1.r);
		assertEquals(0.5f, color1.g);
		assertEquals(0.8f, color1.b);
		assertEquals(1f, color1.a);
		
		LDRColor4 color2 = new LDRColor4(PTup4f.gen(1.2f, 3.4f, 5.6f, 7.8f));
		
		assertEquals(1f, color2.r);
		assertEquals(1f, color2.g);
		assertEquals(1f, color2.b);
		assertEquals(1f, color2.a);
		
		LDRColor4 color3 = new LDRColor4(PTup4f.gen(-1.2f, -3.4f, -5.6f, -7.8f));
		
		assertEquals(0f, color3.r);
		assertEquals(0f, color3.g);
		assertEquals(0f, color3.b);
		assertEquals(0f, color3.a);
	}
	
	/**
	 * This test ensures, that the constructor
	 * {@link LDRColor4#LDRColor4(org.barghos.core.api.tuple4.Tup4iR) LDRColor4.LDRColor4(Tup4iR)}
	 * aktually works and that the components are adopted from the tuple in color space (0 - 255). Also it ensures,
	 * that the adopted values are getting clamped to the range from 0 to 255.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneColorSpaceTest()
	{
		float epsilon = 0.000001f;
		
		LDRColor4 color1 = new LDRColor4(PTup4i.gen(0, 153, 204, 255));
		
		assertTrue(Math.abs(0f - color1.r) < epsilon);
		assertTrue(Math.abs(0.6f - color1.g) < epsilon);
		assertTrue(Math.abs(0.8f - color1.b) < epsilon);
		assertTrue(Math.abs(1f - color1.a) < epsilon);
		
		LDRColor4 color2 = new LDRColor4(PTup4i.gen(255 * 2, 255 * 4, 255 * 6, 255 * 8));
		
		assertTrue(Math.abs(1f - color2.r) < epsilon);
		assertTrue(Math.abs(1f - color2.g) < epsilon);
		assertTrue(Math.abs(1f - color2.b) < epsilon);
		assertTrue(Math.abs(1f - color2.a) < epsilon);
		
		LDRColor4 color3 = new LDRColor4(PTup4i.gen(255 * -2, 255 * -4, 255 * -6, 255 * -8));
		
		assertTrue(Math.abs(0f - color3.r) < epsilon);
		assertTrue(Math.abs(0f - color3.g) < epsilon);
		assertTrue(Math.abs(0f - color3.b) < epsilon);
		assertTrue(Math.abs(0f - color3.a) < epsilon);
	}
	
	/**
	 * This test ensures, that the constructor {@link LDRColor4#LDRColor4(float)} aktually works
	 * and that the components are set to the scalar in unit space (0.0 - 1.0). Also it ensures,
	 * that the scalar gets clamped to the range from 0.0 to 1.0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarUnitSpaceTest()
	{
		LDRColor4 color1 = new LDRColor4(0.5f);
		
		assertEquals(0.5f, color1.r);
		assertEquals(0.5f, color1.g);
		assertEquals(0.5f, color1.b);
		assertEquals(0.5f, color1.a);
		
		LDRColor4 color2 = new LDRColor4(3.4f);
		
		assertEquals(1f, color2.r);
		assertEquals(1f, color2.g);
		assertEquals(1f, color2.b);
		assertEquals(1f, color2.a);
		
		LDRColor4 color3 = new LDRColor4(-3.4f);
		
		assertEquals(0f, color3.r);
		assertEquals(0f, color3.g);
		assertEquals(0f, color3.b);
		assertEquals(0f, color3.a);
	}
	
	/**
	 * This test ensures, that the constructor {@link LDRColor4#LDRColor4(int)} aktually works
	 * and that the components are set to the scalar in color space (0 - 255). Also it ensures,
	 * that the scalar gets clamped to the range from 0 to 255.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarColorSpaceTest()
	{
		float epsilon = 0.000001f;
		
		LDRColor4 color1 = new LDRColor4(153);
		
		assertTrue(Math.abs(0.6f - color1.r) < epsilon);
		assertTrue(Math.abs(0.6f - color1.g) < epsilon);
		assertTrue(Math.abs(0.6f - color1.b) < epsilon);
		assertTrue(Math.abs(0.6f - color1.a) < epsilon);
		
		LDRColor4 color2 = new LDRColor4(255 * 4);
		
		assertTrue(Math.abs(1f - color2.r) < epsilon);
		assertTrue(Math.abs(1f - color2.g) < epsilon);
		assertTrue(Math.abs(1f - color2.b) < epsilon);
		assertTrue(Math.abs(1f - color2.a) < epsilon);
		
		LDRColor4 color3 = new LDRColor4(255 * -4);
		
		assertTrue(Math.abs(0f - color3.r) < epsilon);
		assertTrue(Math.abs(0f - color3.g) < epsilon);
		assertTrue(Math.abs(0f - color3.b) < epsilon);
		assertTrue(Math.abs(0f - color3.a) < epsilon);
	}
	
	/**
	 * This test ensures, that the constructor {@link LDRColor4#LDRColor4(float, float, float, float)} aktually works
	 * and that the components are set to the respective parameters in unit space (0.0 - 1.0). Also it ensures,
	 * that the parameters get clamped to the range from 0.0 to 1.0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsUnitSpaceTest()
	{
		LDRColor4 color1 = new LDRColor4(0f, 0.5f, 0.8f, 1f);
		
		assertEquals(0f, color1.r);
		assertEquals(0.5f, color1.g);
		assertEquals(0.8f, color1.b);
		assertEquals(1f, color1.a);
		
		LDRColor4 color2 = new LDRColor4(1.2f, 3.4f, 5.6f, 7.8f);
		
		assertEquals(1f, color2.r);
		assertEquals(1f, color2.g);
		assertEquals(1f, color2.b);
		assertEquals(1f, color2.a);
		
		LDRColor4 color3 = new LDRColor4(-1.2f, -3.4f, -5.6f, -7.8f);
		
		assertEquals(0f, color3.r);
		assertEquals(0f, color3.g);
		assertEquals(0f, color3.b);
		assertEquals(0f, color3.a);
	}
	
	/**
	 * This test ensures, that the constructor {@link LDRColor4#LDRColor4(int, int, int, int)} aktually works
	 * and that the components are set to the respective parameters in color space (0 - 255). Also it ensures,
	 * that the parameters get clamped to the range from 0 to 255.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsColorSpaceTest()
	{
		float epsilon = 0.000001f;
		
		LDRColor4 color1 = new LDRColor4(0, 153, 204, 255);
		
		assertTrue(Math.abs(0f - color1.r) < epsilon);
		assertTrue(Math.abs(0.6f - color1.g) < epsilon);
		assertTrue(Math.abs(0.8f - color1.b) < epsilon);
		assertTrue(Math.abs(1f - color1.a) < epsilon);
		
		LDRColor4 color2 = new LDRColor4(255 * 2, 255 * 4, 255 * 6, 255 * 8);
		
		assertTrue(Math.abs(1f - color2.r) < epsilon);
		assertTrue(Math.abs(1f - color2.g) < epsilon);
		assertTrue(Math.abs(1f - color2.b) < epsilon);
		assertTrue(Math.abs(1f - color2.a) < epsilon);
		
		LDRColor4 color3 = new LDRColor4(255 * -2, 255 * -4, 255 * -6, 255 * -8);
		
		assertTrue(Math.abs(0f - color3.r) < epsilon);
		assertTrue(Math.abs(0f - color3.g) < epsilon);
		assertTrue(Math.abs(0f - color3.b) < epsilon);
		assertTrue(Math.abs(0f - color3.a) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor4#setX(float)} sets the r component to the value
	 * in unit space (0.0 - 1.0). Also it ensures, that the value gets clamped to the range from 0.0 to 1.0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		LDRColor4 color1 = new LDRColor4();
		
		assertSame(color1, color1.setX(0.5f));
		assertEquals(0.5f, color1.r);
		
		LDRColor4 color2 = new LDRColor4();
		
		assertSame(color2, color2.setX(3.4f));
		assertEquals(1f, color2.r);
		
		LDRColor4 color3 = new LDRColor4();
		
		assertSame(color3, color3.setX(-3.4f));
		assertEquals(0f, color3.r);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor4#setY(float)} sets the g component to the value
	 * in unit space (0.0 - 1.0). Also it ensures, that the value gets clamped to the range from 0.0 to 1.0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		LDRColor4 color1 = new LDRColor4();
		
		assertSame(color1, color1.setY(0.5f));
		assertEquals(0.5f, color1.g);
		
		LDRColor4 color2 = new LDRColor4();
		
		assertSame(color2, color2.setY(3.4f));
		assertEquals(1f, color2.g);
		
		LDRColor4 color3 = new LDRColor4();
		
		assertSame(color3, color3.setY(-3.4f));
		assertEquals(0f, color3.g);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor4#setZ(float)} sets the b component to the value
	 * in unit space (0.0 - 1.0). Also it ensures, that the value gets clamped to the range from 0.0 to 1.0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		LDRColor4 color1 = new LDRColor4();
		
		assertSame(color1, color1.setZ(0.5f));
		assertEquals(0.5f, color1.b);
		
		LDRColor4 color2 = new LDRColor4();
		
		assertSame(color2, color2.setZ(3.4f));
		assertEquals(1f, color2.b);
		
		LDRColor4 color3 = new LDRColor4();
		
		assertSame(color3, color3.setZ(-3.4f));
		assertEquals(0f, color3.b);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor4#setW(float)} sets the a component to the value
	 * in unit space (0.0 - 1.0). Also it ensures, that the value gets clamped to the range from 0.0 to 1.0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setWTest()
	{
		LDRColor4 color1 = new LDRColor4();
		
		assertSame(color1, color1.setW(0.5f));
		assertEquals(0.5f, color1.a);
		
		LDRColor4 color2 = new LDRColor4();
		
		assertSame(color2, color2.setW(3.4f));
		assertEquals(1f, color2.a);
		
		LDRColor4 color3 = new LDRColor4();
		
		assertSame(color3, color3.setW(-3.4f));
		assertEquals(0f, color3.a);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor4#setUnityR(float)} sets the r component to the value
	 * in unit space (0.0 - 1.0). Also it ensures, that the value gets clamped to the range from 0.0 to 1.0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setUnityRTest()
	{
		LDRColor4 color1 = new LDRColor4();
		
		assertSame(color1, color1.setUnityR(0.5f));
		assertEquals(0.5f, color1.r);
		
		LDRColor4 color2 = new LDRColor4();
		
		assertSame(color2, color2.setUnityR(1f));
		assertEquals(1f, color2.r);
		
		LDRColor4 color3 = new LDRColor4();
		
		assertSame(color3, color3.setUnityR(-3.4f));
		assertEquals(0f, color3.r);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor4#setUnityG(float)} sets the g component to the value
	 * in unit space (0.0 - 1.0). Also it ensures, that the value gets clamped to the range from 0.0 to 1.0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setUnityGTest()
	{
		LDRColor4 color1 = new LDRColor4();
		
		assertSame(color1, color1.setUnityG(0.5f));
		assertEquals(0.5f, color1.g);
		
		LDRColor4 color2 = new LDRColor4();
		
		assertSame(color2, color2.setUnityG(3.4f));
		assertEquals(1f, color2.g);
		
		LDRColor4 color3 = new LDRColor4();
		
		assertSame(color3, color3.setUnityG(-3.4f));
		assertEquals(0f, color3.g);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor4#setUnityB(float)} sets the b component to the value
	 * in unit space (0.0 - 1.0). Also it ensures, that the value gets clamped to the range from 0.0 to 1.0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setUnityBTest()
	{
		LDRColor4 color1 = new LDRColor4();
		
		assertSame(color1, color1.setUnityB(0.5f));
		assertEquals(0.5f, color1.b);
		
		LDRColor4 color2 = new LDRColor4();
		
		assertSame(color2, color2.setUnityB(3.4f));
		assertEquals(1f, color2.b);
		
		LDRColor4 color3 = new LDRColor4();
		
		assertSame(color3, color3.setUnityB(-3.4f));
		assertEquals(0f, color3.b);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor4#setUnityA(float)} sets the a component to the value
	 * in unit space (0.0 - 1.0). Also it ensures, that the value gets clamped to the range from 0.0 to 1.0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setUnityATest()
	{
		LDRColor4 color1 = new LDRColor4();
		
		assertSame(color1, color1.setUnityA(0.5f));
		assertEquals(0.5f, color1.a);
		
		LDRColor4 color2 = new LDRColor4();
		
		assertSame(color2, color2.setUnityA(3.4f));
		assertEquals(1f, color2.a);
		
		LDRColor4 color3 = new LDRColor4();
		
		assertSame(color3, color3.setUnityA(-3.4f));
		assertEquals(0f, color3.a);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor4#setR(int)} sets the r component to the value
	 * in color space (0 - 255). Also it ensures, that the value gets clamped to the range from 0 to 255.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setRTest()
	{
		float epsilon = 0.000001f;
		
		LDRColor4 color1 = new LDRColor4();

		assertSame(color1, color1.setR(153));
		assertTrue(Math.abs(0.6f - color1.r) < epsilon);
		
		LDRColor4 color2 = new LDRColor4();

		assertSame(color2, color2.setR(255 * 4));
		assertTrue(Math.abs(1f - color2.r) < epsilon);
		
		LDRColor4 color3 = new LDRColor4();
		
		assertSame(color3, color3.setR(255 * -4));
		assertTrue(Math.abs(0f - color3.r) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor4#setG(int)} sets the g component to the value
	 * in color space (0 - 255). Also it ensures, that the value gets clamped to the range from 0 to 255.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setGTest()
	{
		float epsilon = 0.000001f;
		
		LDRColor4 color1 = new LDRColor4();

		assertSame(color1, color1.setG(153));
		assertTrue(Math.abs(0.6f - color1.g) < epsilon);
		
		LDRColor4 color2 = new LDRColor4();

		assertSame(color2, color2.setG(255 * 4));
		assertTrue(Math.abs(1f - color2.g) < epsilon);
		
		LDRColor4 color3 = new LDRColor4();
		
		assertSame(color3, color3.setG(255 * -4));
		assertTrue(Math.abs(0f - color3.g) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor4#setB(int)} sets the b component to the value
	 * in color space (0 - 255). Also it ensures, that the value gets clamped to the range from 0 to 255.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setBTest()
	{
		float epsilon = 0.000001f;
		
		LDRColor4 color1 = new LDRColor4();

		assertSame(color1, color1.setB(153));
		assertTrue(Math.abs(0.6f - color1.b) < epsilon);
		
		LDRColor4 color2 = new LDRColor4();

		assertSame(color2, color2.setB(255 * 4));
		assertTrue(Math.abs(1f - color2.b) < epsilon);
		
		LDRColor4 color3 = new LDRColor4();
		
		assertSame(color3, color3.setB(255 * -4));
		assertTrue(Math.abs(0f - color3.b) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor4#setA(int)} sets the a component to the value
	 * in color space (0 - 255). Also it ensures, that the value gets clamped to the range from 0 to 255.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setATest()
	{
		float epsilon = 0.000001f;
		
		LDRColor4 color1 = new LDRColor4();

		assertSame(color1, color1.setA(153));
		assertTrue(Math.abs(0.6f - color1.a) < epsilon);
		
		LDRColor4 color2 = new LDRColor4();

		assertSame(color2, color2.setA(255 * 4));
		assertTrue(Math.abs(1f - color2.a) < epsilon);
		
		LDRColor4 color3 = new LDRColor4();
		
		assertSame(color3, color3.setA(255 * -4));
		assertTrue(Math.abs(0f - color3.a) < epsilon);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link LDRColor4#set(org.barghos.core.api.tuple3.Tup4fR) LDRColor4.set(Tup4fR)}
	 * adopts the components from the tuple in unit space (0.0 - 1.0). Also it ensures,
	 * that the adopted values are clamped to the range from 0.0 to 1.0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_cloneUnitSpaceTest()
	{
		LDRColor4 color1 = new LDRColor4();
		
		assertSame(color1, color1.set(PTup4f.gen(0f, 0.5f, 0.8f, 1f)));
		assertEquals(0f, color1.r);
		assertEquals(0.5f, color1.g);
		assertEquals(0.8f, color1.b);
		assertEquals(1f, color1.a);
		
		LDRColor4 color2 = new LDRColor4();
		
		assertSame(color2, color2.set(PTup4f.gen(1.2f, 3.4f, 5.6f, 7.8f)));
		assertEquals(1f, color2.r);
		assertEquals(1f, color2.g);
		assertEquals(1f, color2.b);
		assertEquals(1f, color2.a);
		
		LDRColor4 color3 = new LDRColor4();
		
		assertSame(color3, color3.set(PTup4f.gen(-1.2f, -3.4f, -5.6f, -7.8f)));
		assertEquals(0f, color3.r);
		assertEquals(0f, color3.g);
		assertEquals(0f, color3.b);
		assertEquals(0f, color3.a);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link LDRColor4#set(org.barghos.core.api.tuple4.Tup4iR) LDRColor4.set(Tup4iR)}
	 * adopts the components from the tuple in color space (0 - 255). Also it ensures,
	 * that the adopted values are clamped to the range from 0 to 255.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_cloneColorSpaceTest()
	{
		float epsilon = 0.000001f;
		
		LDRColor4 color1 = new LDRColor4();
		
		assertSame(color1, color1.set(PTup4i.gen(0, 153, 204, 255)));
		assertTrue(Math.abs(0f - color1.r) < epsilon);
		assertTrue(Math.abs(0.6f - color1.g) < epsilon);
		assertTrue(Math.abs(0.8f - color1.b) < epsilon);
		assertTrue(Math.abs(1f - color1.a) < epsilon);
		
		LDRColor4 color2 = new LDRColor4();
		
		assertSame(color2, color2.set(PTup4i.gen(255 * 2, 255 * 4, 255 * 6, 255 * 8)));
		assertTrue(Math.abs(1f - color2.r) < epsilon);
		assertTrue(Math.abs(1f - color2.g) < epsilon);
		assertTrue(Math.abs(1f - color2.b) < epsilon);
		assertTrue(Math.abs(1f - color2.a) < epsilon);
		
		LDRColor4 color3 = new LDRColor4();
		
		assertSame(color3, color3.set(PTup4i.gen(255 * -2, 255 * -4, 255 * -6, 255 * -8)));
		assertTrue(Math.abs(0f - color3.r) < epsilon);
		assertTrue(Math.abs(0f - color3.g) < epsilon);
		assertTrue(Math.abs(0f - color3.b) < epsilon);
		assertTrue(Math.abs(0f - color3.a) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor4#set(float)} sets the components to the scalar
	 * in unit space (0.0 - 1.0). Also it ensures, that the scalar gets clamped to the range from 0.0 to 1.0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_scalarUnitSpaceTest()
	{
		LDRColor4 color1 = new LDRColor4();
		
		assertSame(color1, color1.set(0.5f));
		assertEquals(0.5f, color1.r);
		assertEquals(0.5f, color1.g);
		assertEquals(0.5f, color1.b);
		assertEquals(0.5f, color1.a);
		
		LDRColor4 color2 = new LDRColor4();
		
		assertSame(color2, color2.set(3.4f));
		assertEquals(1f, color2.r);
		assertEquals(1f, color2.g);
		assertEquals(1f, color2.b);
		assertEquals(1f, color2.a);
		
		LDRColor4 color3 = new LDRColor4();
		
		assertSame(color3, color3.set(-3.4f));
		assertEquals(0f, color3.r);
		assertEquals(0f, color3.g);
		assertEquals(0f, color3.b);
		assertEquals(0f, color3.a);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor4#set(int)} sets the components to the scalar
	 * in color space (0 - 255). Also it ensures, that the scalar gets clamped to the range from 0 to 255.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_scalarColorSpaceTest()
	{
		float epsilon = 0.000001f;
		
		LDRColor4 color1 = new LDRColor4();
		
		assertSame(color1, color1.set(153));
		assertTrue(Math.abs(0.6f - color1.r) < epsilon);
		assertTrue(Math.abs(0.6f - color1.g) < epsilon);
		assertTrue(Math.abs(0.6f - color1.b) < epsilon);
		assertTrue(Math.abs(0.6f - color1.a) < epsilon);
		
		LDRColor4 color2 = new LDRColor4();
		
		assertSame(color2, color2.set(255 * 4));
		assertTrue(Math.abs(1f - color2.r) < epsilon);
		assertTrue(Math.abs(1f - color2.g) < epsilon);
		assertTrue(Math.abs(1f - color2.b) < epsilon);
		assertTrue(Math.abs(1f - color2.a) < epsilon);
		
		LDRColor4 color3 = new LDRColor4();
		
		assertSame(color3, color3.set(255 * -4));
		assertTrue(Math.abs(0f - color3.r) < epsilon);
		assertTrue(Math.abs(0f - color3.g) < epsilon);
		assertTrue(Math.abs(0f - color3.b) < epsilon);
		assertTrue(Math.abs(0f - color3.a) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor4#set(float, float, float, float)} sets the components to
	 * the respective parameters in unit space (0.0 - 1.0). Also it ensures, that the parameters get
	 * clamped to the range from 0.0 to 1.0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_componentsUnitSpaceTest()
	{
		LDRColor4 color1 = new LDRColor4();
		
		assertSame(color1, color1.set(0f, 0.5f, 0.8f, 1f));
		assertEquals(0f, color1.r);
		assertEquals(0.5f, color1.g);
		assertEquals(0.8f, color1.b);
		assertEquals(1f, color1.a);
		
		LDRColor4 color2 = new LDRColor4();
		
		assertSame(color2, color2.set(1.2f, 3.4f, 5.6f, 7.8f));
		assertEquals(1f, color2.r);
		assertEquals(1f, color2.g);
		assertEquals(1f, color2.b);
		assertEquals(1f, color2.a);
		
		LDRColor4 color3 = new LDRColor4();
		
		assertSame(color3, color3.set(-1.2f, -3.4f, -5.6f, -7.8f));
		assertEquals(0f, color3.r);
		assertEquals(0f, color3.g);
		assertEquals(0f, color3.b);
		assertEquals(0f, color3.a);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor4#set(int, int, int, int)} sets the components to
	 * the respective parameters in unit space (0 - 255). Also it ensures, that the parameters get
	 * clamped to the range from 0 to 255.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_componentsColorSpaceTest()
	{
		float epsilon = 0.000001f;
		
		LDRColor4 color1 = new LDRColor4();
		
		assertSame(color1, color1.set(0, 153, 204, 255));
		assertTrue(Math.abs(0f - color1.r) < epsilon);
		assertTrue(Math.abs(0.6f - color1.g) < epsilon);
		assertTrue(Math.abs(0.8f - color1.b) < epsilon);
		assertTrue(Math.abs(1f - color1.a) < epsilon);
		
		LDRColor4 color2 = new LDRColor4();
		
		assertSame(color2, color2.set(255 * 2, 255 * 4, 255 * 6, 255 * 8));
		assertTrue(Math.abs(1f - color2.r) < epsilon);
		assertTrue(Math.abs(1f - color2.g) < epsilon);
		assertTrue(Math.abs(1f - color2.b) < epsilon);
		assertTrue(Math.abs(1f - color2.a) < epsilon);
		
		LDRColor4 color3 = new LDRColor4();
		
		assertSame(color3, color3.set(255 * -2, 255 * -4, 255 * -6, 255 * -8));
		assertTrue(Math.abs(0f - color3.r) < epsilon);
		assertTrue(Math.abs(0f - color3.g) < epsilon);
		assertTrue(Math.abs(0f - color3.b) < epsilon);
		assertTrue(Math.abs(0f - color3.a) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor4#getR()} returns the r component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getRTest()
	{
		float epsilon = 0.000001f;
		
		LDRColor4 color = new LDRColor4(0, 153, 204, 255);
		
		assertTrue(Math.abs(0 - color.getR()) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor4#getG()} returns the g component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getGTest()
	{
		float epsilon = 0.000001f;
		
		LDRColor4 color = new LDRColor4(0, 153, 204, 255);
		
		assertTrue(Math.abs(153 - color.getG()) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor4#getB()} returns the b component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getBTest()
	{
		float epsilon = 0.000001f;
		
		LDRColor4 color = new LDRColor4(0, 153, 204, 255);
		
		assertTrue(Math.abs(204 - color.getB()) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor4#getA()} returns the a component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getATest()
	{
		float epsilon = 0.000001f;
		
		LDRColor4 color = new LDRColor4(0, 153, 204, 255);
		
		assertTrue(Math.abs(255 - color.getA()) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor4#getUnityR()} returns the r component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getUnityRTest()
	{
		LDRColor4 color = new LDRColor4(0f, 0.5f, 0.8f, 1f);
		
		assertEquals(0f, color.getUnityR());
		assertEquals(color.r, color.getUnityR());
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor4#getUnityG()} returns the g component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getUnityGTest()
	{
		LDRColor4 color = new LDRColor4(0f, 0.5f, 0.8f, 1f);
		
		assertEquals(0.5f, color.getUnityG());
		assertEquals(color.g, color.getUnityG());
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor4#getUnityB()} returns the b component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getUnityBTest()
	{
		LDRColor4 color = new LDRColor4(0f, 0.5f, 0.8f, 1f);
		
		assertEquals(0.8f, color.getUnityB());
		assertEquals(color.b, color.getUnityB());
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor4#getUnityA()} returns the a component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getUnityATest()
	{
		LDRColor4 color = new LDRColor4(0f, 0.5f, 0.8f, 1f);
		
		assertEquals(1f, color.getUnityA());
		assertEquals(color.a, color.getUnityA());
	}
}