package org.barghos.core.test.color;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.color.LDRColor3;
import org.barghos.core.tuple3.PTup3f;
import org.barghos.core.tuple3.PTup3i;

/**
 * This class provides component tests for the class {@link LDRColor3}.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
class LDRColor3Test
{
	/**
	 * This test ensures, that the constructor {@link LDRColor3#LDRColor3()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		LDRColor3 color = new LDRColor3();
		
		assertEquals(0, color.r);
		assertEquals(0, color.g);
		assertEquals(0, color.b);
	}
	
	/**
	 * This test ensures, that the constructor
	 * {@link LDRColor3#LDRColor3(org.barghos.core.api.tuple3.Tup3fR) LDRColor3.LDRColor3(Tup3fR)}
	 * aktually works and that the components are adopted from the tuple in unit space (0.0 - 1.0). Also it ensures,
	 * that the adopted values are getting clamped to the range from 0.0 to 1.0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneUnitSpaceTest()
	{
		LDRColor3 color1 = new LDRColor3(PTup3f.gen(0f, 0.5f, 1f));
		
		assertEquals(0f, color1.r);
		assertEquals(0.5f, color1.g);
		assertEquals(1f, color1.b);
		
		LDRColor3 color2 = new LDRColor3(PTup3f.gen(1.2f, 3.4f, 5.6f));
		
		assertEquals(1f, color2.r);
		assertEquals(1f, color2.g);
		assertEquals(1f, color2.b);
		
		LDRColor3 color3 = new LDRColor3(PTup3f.gen(-1.2f, -3.4f, -5.6f));
		
		assertEquals(0f, color3.r);
		assertEquals(0f, color3.g);
		assertEquals(0f, color3.b);
	}
	
	/**
	 * This test ensures, that the constructor
	 * {@link LDRColor3#LDRColor3(org.barghos.core.api.tuple3.Tup3iR) LDRColor3.LDRColor3(Tup3iR)}
	 * aktually works and that the components are adopted from the tuple in color space (0 - 255). Also it ensures,
	 * that the adopted values are getting clamped to the range from 0 to 255.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneColorSpaceTest()
	{
		float epsilon = 0.000001f;
		
		LDRColor3 color1 = new LDRColor3(PTup3i.gen(0, 153, 255));
		
		assertTrue(Math.abs(0f - color1.r) < epsilon);
		assertTrue(Math.abs(0.6f - color1.g) < epsilon);
		assertTrue(Math.abs(1f - color1.b) < epsilon);
		
		LDRColor3 color2 = new LDRColor3(PTup3i.gen(255 * 2, 255 * 4, 255 * 6));
		
		assertTrue(Math.abs(1f - color2.r) < epsilon);
		assertTrue(Math.abs(1f - color2.g) < epsilon);
		assertTrue(Math.abs(1f - color2.b) < epsilon);
		
		LDRColor3 color3 = new LDRColor3(PTup3i.gen(255 * -2, 255 * -4, 255 * -6));
		
		assertTrue(Math.abs(0f - color3.r) < epsilon);
		assertTrue(Math.abs(0f - color3.g) < epsilon);
		assertTrue(Math.abs(0f - color3.b) < epsilon);
	}
	
	/**
	 * This test ensures, that the constructor {@link LDRColor3#LDRColor3(float)} aktually works
	 * and that the components are set to the scalar in unit space (0.0 - 1.0). Also it ensures,
	 * that the scalar gets clamped to the range from 0.0 to 1.0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarUnitSpaceTest()
	{
		LDRColor3 color1 = new LDRColor3(0.5f);
		
		assertEquals(0.5f, color1.r);
		assertEquals(0.5f, color1.g);
		assertEquals(0.5f, color1.b);
		
		LDRColor3 color2 = new LDRColor3(3.4f);
		
		assertEquals(1f, color2.r);
		assertEquals(1f, color2.g);
		assertEquals(1f, color2.b);
		
		LDRColor3 color3 = new LDRColor3(-3.4f);
		
		assertEquals(0f, color3.r);
		assertEquals(0f, color3.g);
		assertEquals(0f, color3.b);
	}
	
	/**
	 * This test ensures, that the constructor {@link LDRColor3#LDRColor3(int)} aktually works
	 * and that the components are set to the scalar in color space (0 - 255). Also it ensures,
	 * that the scalar gets clamped to the range from 0 to 255.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarColorSpaceTest()
	{
		float epsilon = 0.000001f;
		
		LDRColor3 color1 = new LDRColor3(153);
		
		assertTrue(Math.abs(0.6f - color1.r) < epsilon);
		assertTrue(Math.abs(0.6f - color1.g) < epsilon);
		assertTrue(Math.abs(0.6f - color1.b) < epsilon);
		
		LDRColor3 color2 = new LDRColor3(255 * 4);
		
		assertTrue(Math.abs(1f - color2.r) < epsilon);
		assertTrue(Math.abs(1f - color2.g) < epsilon);
		assertTrue(Math.abs(1f - color2.b) < epsilon);
		
		LDRColor3 color3 = new LDRColor3(255 * -4);
		
		assertTrue(Math.abs(0f - color3.r) < epsilon);
		assertTrue(Math.abs(0f - color3.g) < epsilon);
		assertTrue(Math.abs(0f - color3.b) < epsilon);
	}
	
	/**
	 * This test ensures, that the constructor {@link LDRColor3#LDRColor3(float, float, float)} aktually works
	 * and that the components are set to the respective parameters in unit space (0.0 - 1.0). Also it ensures,
	 * that the parameters get clamped to the range from 0.0 to 1.0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsUnitSpaceTest()
	{
		LDRColor3 color1 = new LDRColor3(0f, 0.5f, 1f);
		
		assertEquals(0f, color1.r);
		assertEquals(0.5f, color1.g);
		assertEquals(1f, color1.b);
		
		LDRColor3 color2 = new LDRColor3(1.2f, 3.4f, 5.6f);
		
		assertEquals(1f, color2.r);
		assertEquals(1f, color2.g);
		assertEquals(1f, color2.b);
		
		LDRColor3 color3 = new LDRColor3(-1.2f, -3.4f, -5.6f);
		
		assertEquals(0f, color3.r);
		assertEquals(0f, color3.g);
		assertEquals(0f, color3.b);
	}
	
	/**
	 * This test ensures, that the constructor {@link LDRColor3#LDRColor3(int, int, int)} aktually works
	 * and that the components are set to the respective parameters in color space (0 - 255). Also it ensures,
	 * that the parameters get clamped to the range from 0 to 255.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsColorSpaceTest()
	{
		float epsilon = 0.000001f;
		
		LDRColor3 color1 = new LDRColor3(0, 153, 255);
		
		assertTrue(Math.abs(0f - color1.r) < epsilon);
		assertTrue(Math.abs(0.6f - color1.g) < epsilon);
		assertTrue(Math.abs(1f - color1.b) < epsilon);
		
		LDRColor3 color2 = new LDRColor3(255 * 2, 255 * 4, 255 * 6);
		
		assertTrue(Math.abs(1f - color2.r) < epsilon);
		assertTrue(Math.abs(1f - color2.g) < epsilon);
		assertTrue(Math.abs(1f - color2.b) < epsilon);
		
		LDRColor3 color3 = new LDRColor3(255 * -2, 255 * -4, 255 * -6);
		
		assertTrue(Math.abs(0f - color3.r) < epsilon);
		assertTrue(Math.abs(0f - color3.g) < epsilon);
		assertTrue(Math.abs(0f - color3.b) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor3#setX(float)} sets the r component to the value
	 * in unit space (0.0 - 1.0). Also it ensures, that the value gets clamped to the range from 0.0 to 1.0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		LDRColor3 color1 = new LDRColor3();
		
		assertSame(color1, color1.setX(0.5f));
		assertEquals(0.5f, color1.r);
		
		LDRColor3 color2 = new LDRColor3();
		
		assertSame(color2, color2.setX(3.4f));
		assertEquals(1f, color2.r);
		
		LDRColor3 color3 = new LDRColor3();
		
		assertSame(color3, color3.setX(-3.4f));
		assertEquals(0f, color3.r);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor3#setY(float)} sets the g component to the value
	 * in unit space (0.0 - 1.0). Also it ensures, that the value gets clamped to the range from 0.0 to 1.0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		LDRColor3 color1 = new LDRColor3();
		
		assertSame(color1, color1.setY(0.5f));
		assertEquals(0.5f, color1.g);
		
		LDRColor3 color2 = new LDRColor3();
		
		assertSame(color2, color2.setY(3.4f));
		assertEquals(1f, color2.g);
		
		LDRColor3 color3 = new LDRColor3();
		
		assertSame(color3, color3.setY(-3.4f));
		assertEquals(0f, color3.g);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor3#setZ(float)} sets the b component to the value
	 * in unit space (0.0 - 1.0). Also it ensures, that the value gets clamped to the range from 0.0 to 1.0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		LDRColor3 color1 = new LDRColor3();
		
		assertSame(color1, color1.setZ(0.5f));
		assertEquals(0.5f, color1.b);
		
		LDRColor3 color2 = new LDRColor3();
		
		assertSame(color2, color2.setZ(3.4f));
		assertEquals(1f, color2.b);
		
		LDRColor3 color3 = new LDRColor3();
		
		assertSame(color3, color3.setZ(-3.4f));
		assertEquals(0f, color3.b);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor3#setUnityR(float)} sets the r component to the value
	 * in unit space (0.0 - 1.0). Also it ensures, that the value gets clamped to the range from 0.0 to 1.0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setUnityRTest()
	{
		LDRColor3 color1 = new LDRColor3();
		
		assertSame(color1, color1.setUnityR(0.5f));
		assertEquals(0.5f, color1.r);
		
		LDRColor3 color2 = new LDRColor3();
		
		assertSame(color2, color2.setUnityR(1f));
		assertEquals(1f, color2.r);
		
		LDRColor3 color3 = new LDRColor3();
		
		assertSame(color3, color3.setUnityR(-3.4f));
		assertEquals(0f, color3.r);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor3#setUnityG(float)} sets the g component to the value
	 * in unit space (0.0 - 1.0). Also it ensures, that the value gets clamped to the range from 0.0 to 1.0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setUnityGTest()
	{
		LDRColor3 color1 = new LDRColor3();
		
		assertSame(color1, color1.setUnityG(0.5f));
		assertEquals(0.5f, color1.g);
		
		LDRColor3 color2 = new LDRColor3();
		
		assertSame(color2, color2.setUnityG(3.4f));
		assertEquals(1f, color2.g);
		
		LDRColor3 color3 = new LDRColor3();
		
		assertSame(color3, color3.setUnityG(-3.4f));
		assertEquals(0f, color3.g);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor3#setUnityB(float)} sets the b component to the value
	 * in unit space (0.0 - 1.0). Also it ensures, that the value gets clamped to the range from 0.0 to 1.0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setUnityBTest()
	{
		LDRColor3 color1 = new LDRColor3();
		
		assertSame(color1, color1.setUnityB(0.5f));
		assertEquals(0.5f, color1.b);
		
		LDRColor3 color2 = new LDRColor3();
		
		assertSame(color2, color2.setUnityB(3.4f));
		assertEquals(1f, color2.b);
		
		LDRColor3 color3 = new LDRColor3();
		
		assertSame(color3, color3.setUnityB(-3.4f));
		assertEquals(0f, color3.b);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor3#setR(int)} sets the r component to the value
	 * in color space (0 - 255). Also it ensures, that the value gets clamped to the range from 0 to 255.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setRTest()
	{
		float epsilon = 0.000001f;
		
		LDRColor3 color1 = new LDRColor3();

		assertSame(color1, color1.setR(153));
		assertTrue(Math.abs(0.6f - color1.r) < epsilon);
		
		LDRColor3 color2 = new LDRColor3();

		assertSame(color2, color2.setR(255 * 4));
		assertTrue(Math.abs(1f - color2.r) < epsilon);
		
		LDRColor3 color3 = new LDRColor3();
		
		assertSame(color3, color3.setR(255 * -4));
		assertTrue(Math.abs(0f - color3.r) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor3#setG(int)} sets the g component to the value
	 * in color space (0 - 255). Also it ensures, that the value gets clamped to the range from 0 to 255.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setGTest()
	{
		float epsilon = 0.000001f;
		
		LDRColor3 color1 = new LDRColor3();

		assertSame(color1, color1.setG(153));
		assertTrue(Math.abs(0.6f - color1.g) < epsilon);
		
		LDRColor3 color2 = new LDRColor3();

		assertSame(color2, color2.setG(255 * 4));
		assertTrue(Math.abs(1f - color2.g) < epsilon);
		
		LDRColor3 color3 = new LDRColor3();
		
		assertSame(color3, color3.setG(255 * -4));
		assertTrue(Math.abs(0f - color3.g) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor3#setB(int)} sets the b component to the value
	 * in color space (0 - 255). Also it ensures, that the value gets clamped to the range from 0 to 255.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setBTest()
	{
		float epsilon = 0.000001f;
		
		LDRColor3 color1 = new LDRColor3();

		assertSame(color1, color1.setB(153));
		assertTrue(Math.abs(0.6f - color1.b) < epsilon);
		
		LDRColor3 color2 = new LDRColor3();

		assertSame(color2, color2.setB(255 * 4));
		assertTrue(Math.abs(1f - color2.b) < epsilon);
		
		LDRColor3 color3 = new LDRColor3();
		
		assertSame(color3, color3.setB(255 * -4));
		assertTrue(Math.abs(0f - color3.b) < epsilon);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link LDRColor3#set(org.barghos.core.api.tuple3.Tup3fR) LDRColor3.set(Tup3fR)}
	 * adopts the components from the tuple in unit space (0.0 - 1.0). Also it ensures,
	 * that the adopted values are clamped to the range from 0.0 to 1.0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_cloneUnitSpaceTest()
	{
		LDRColor3 color1 = new LDRColor3();
		
		assertSame(color1, color1.set(PTup3f.gen(0f, 0.5f, 1f)));
		assertEquals(0f, color1.r);
		assertEquals(0.5f, color1.g);
		assertEquals(1f, color1.b);
		
		LDRColor3 color2 = new LDRColor3();
		
		assertSame(color2, color2.set(PTup3f.gen(1.2f, 3.4f, 5.6f)));
		assertEquals(1f, color2.r);
		assertEquals(1f, color2.g);
		assertEquals(1f, color2.b);
		
		LDRColor3 color3 = new LDRColor3();
		
		assertSame(color3, color3.set(PTup3f.gen(-1.2f, -3.4f, -5.6f)));
		assertEquals(0f, color3.r);
		assertEquals(0f, color3.g);
		assertEquals(0f, color3.b);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link LDRColor3#set(org.barghos.core.api.tuple3.Tup3iR) LDRColor3.set(Tup3iR)}
	 * adopts the components from the tuple in color space (0 - 255). Also it ensures,
	 * that the adopted values are clamped to the range from 0 to 255.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_cloneColorSpaceTest()
	{
		float epsilon = 0.000001f;
		
		LDRColor3 color1 = new LDRColor3();
		
		assertSame(color1, color1.set(PTup3i.gen(0, 153, 255)));
		assertTrue(Math.abs(0f - color1.r) < epsilon);
		assertTrue(Math.abs(0.6f - color1.g) < epsilon);
		assertTrue(Math.abs(1f - color1.b) < epsilon);
		
		LDRColor3 color2 = new LDRColor3();
		
		assertSame(color2, color2.set(PTup3i.gen(255 * 2, 255 * 4, 255 * 6)));
		assertTrue(Math.abs(1f - color2.r) < epsilon);
		assertTrue(Math.abs(1f - color2.g) < epsilon);
		assertTrue(Math.abs(1f - color2.b) < epsilon);
		
		LDRColor3 color3 = new LDRColor3();
		
		assertSame(color3, color3.set(PTup3i.gen(255 * -2, 255 * -4, 255 * -6)));
		assertTrue(Math.abs(0f - color3.r) < epsilon);
		assertTrue(Math.abs(0f - color3.g) < epsilon);
		assertTrue(Math.abs(0f - color3.b) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor3#set(float)} sets the components to the scalar
	 * in unit space (0.0 - 1.0). Also it ensures, that the scalar gets clamped to the range from 0.0 to 1.0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_scalarUnitSpaceTest()
	{
		LDRColor3 color1 = new LDRColor3();
		
		assertSame(color1, color1.set(0.5f));
		assertEquals(0.5f, color1.r);
		assertEquals(0.5f, color1.g);
		assertEquals(0.5f, color1.b);
		
		LDRColor3 color2 = new LDRColor3();
		
		assertSame(color2, color2.set(3.4f));
		assertEquals(1f, color2.r);
		assertEquals(1f, color2.g);
		assertEquals(1f, color2.b);
		
		LDRColor3 color3 = new LDRColor3();
		
		assertSame(color3, color3.set(-3.4f));
		assertEquals(0f, color3.r);
		assertEquals(0f, color3.g);
		assertEquals(0f, color3.b);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor3#set(int)} sets the components to the scalar
	 * in color space (0 - 255). Also it ensures, that the scalar gets clamped to the range from 0 to 255.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_scalarColorSpaceTest()
	{
		float epsilon = 0.000001f;
		
		LDRColor3 color1 = new LDRColor3();
		
		assertSame(color1, color1.set(153));
		assertTrue(Math.abs(0.6f - color1.r) < epsilon);
		assertTrue(Math.abs(0.6f - color1.g) < epsilon);
		assertTrue(Math.abs(0.6f - color1.b) < epsilon);
		
		LDRColor3 color2 = new LDRColor3();
		
		assertSame(color2, color2.set(255 * 4));
		assertTrue(Math.abs(1f - color2.r) < epsilon);
		assertTrue(Math.abs(1f - color2.g) < epsilon);
		assertTrue(Math.abs(1f - color2.b) < epsilon);
		
		LDRColor3 color3 = new LDRColor3();
		
		assertSame(color3, color3.set(255 * -4));
		assertTrue(Math.abs(0f - color3.r) < epsilon);
		assertTrue(Math.abs(0f - color3.g) < epsilon);
		assertTrue(Math.abs(0f - color3.b) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor3#set(float, float, float)} sets the components to
	 * the respective parameters in unit space (0.0 - 1.0). Also it ensures, that the parameters get
	 * clamped to the range from 0.0 to 1.0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_componentsUnitSpaceTest()
	{
		LDRColor3 color1 = new LDRColor3();
		
		assertSame(color1, color1.set(0f, 0.5f, 1f));
		assertEquals(0f, color1.r);
		assertEquals(0.5f, color1.g);
		assertEquals(1f, color1.b);
		
		LDRColor3 color2 = new LDRColor3();
		
		assertSame(color2, color2.set(1.2f, 3.4f, 5.6f));
		assertEquals(1f, color2.r);
		assertEquals(1f, color2.g);
		assertEquals(1f, color2.b);
		
		LDRColor3 color3 = new LDRColor3();
		
		assertSame(color3, color3.set(-1.2f, -3.4f, -5.6f));
		assertEquals(0f, color3.r);
		assertEquals(0f, color3.g);
		assertEquals(0f, color3.b);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor3#set(int, int, int)} sets the components to
	 * the respective parameters in unit space (0 - 255). Also it ensures, that the parameters get
	 * clamped to the range from 0 to 255.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_componentsColorSpaceTest()
	{
		float epsilon = 0.000001f;
		
		LDRColor3 color1 = new LDRColor3();
		
		assertSame(color1, color1.set(0, 153, 255));
		assertTrue(Math.abs(0f - color1.r) < epsilon);
		assertTrue(Math.abs(0.6f - color1.g) < epsilon);
		assertTrue(Math.abs(1f - color1.b) < epsilon);
		
		LDRColor3 color2 = new LDRColor3();
		
		assertSame(color2, color2.set(255 * 2, 255 * 4, 255 * 6));
		assertTrue(Math.abs(1f - color2.r) < epsilon);
		assertTrue(Math.abs(1f - color2.g) < epsilon);
		assertTrue(Math.abs(1f - color2.b) < epsilon);
		
		LDRColor3 color3 = new LDRColor3();
		
		assertSame(color3, color3.set(255 * -2, 255 * -4, 255 * -6));
		assertTrue(Math.abs(0f - color3.r) < epsilon);
		assertTrue(Math.abs(0f - color3.g) < epsilon);
		assertTrue(Math.abs(0f - color3.b) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor3#getR()} returns the r component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getRTest()
	{
		float epsilon = 0.000001f;
		
		LDRColor3 color = new LDRColor3(0, 153, 255);
		
		assertTrue(Math.abs(0 - color.getR()) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor3#getG()} returns the g component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getGTest()
	{
		float epsilon = 0.000001f;
		
		LDRColor3 color = new LDRColor3(0, 153, 255);
		
		assertTrue(Math.abs(153 - color.getG()) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor3#getB()} returns the b component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getBTest()
	{
		float epsilon = 0.000001f;
		
		LDRColor3 color = new LDRColor3(0, 153, 255);
		
		assertTrue(Math.abs(255 - color.getB()) < epsilon);
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor3#getUnityR()} returns the r component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getUnityRTest()
	{
		LDRColor3 color = new LDRColor3(0f, 0.5f, 1f);
		
		assertEquals(0f, color.getUnityR());
		assertEquals(color.r, color.getUnityR());
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor3#getUnityG()} returns the g component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getUnityGTest()
	{
		LDRColor3 color = new LDRColor3(0f, 0.5f, 1f);
		
		assertEquals(0.5f, color.getUnityG());
		assertEquals(color.g, color.getUnityG());
	}
	
	/**
	 * This test ensures, that the function {@link LDRColor3#getUnityB()} returns the b component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getUnityBTest()
	{
		LDRColor3 color = new LDRColor3(0f, 0.5f, 1f);
		
		assertEquals(1f, color.getUnityB());
		assertEquals(color.b, color.getUnityB());
	}
}