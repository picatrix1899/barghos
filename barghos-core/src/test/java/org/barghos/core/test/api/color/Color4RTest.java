package org.barghos.core.test.api.color;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.color.Color4R;

/**
 * This class provides component tests for the interface {@link Color4R}.
 * 
 * @author picatrix1899
 * 
 *  @since 1.0.0.0
 */
public class Color4RTest
{
	/**
	 * This test ensures, that the function {@link Color4R#getX()} returns
	 * the value from {@link Color4R#getUnityR()}.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Color4R c = new Color4R() {
			@Override
			public float getUnityR()
			{
				return 2.1f;
			}
			
			@Override
			public float getUnityG()
			{
				return 3.2f;
			}
			
			@Override
			public float getUnityB()
			{
				return 4.3f;
			}
			
			@Override
			public float getUnityA()
			{
				return 5.4f;
			}
			
			@Override
			public int getR()
			{
				return 0;
			}
			
			@Override
			public int getG()
			{
				return 0;
			}
			
			@Override
			public int getB()
			{
				return 0;
			}
			
			@Override
			public int getA()
			{
				return 0;
			}
		};
		
		assertEquals(2.1f, c.getX());
		assertEquals(c.getUnityR(), c.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Color4R#getY()} returns
	 * the value from {@link Color4R#getUnityG()}.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Color4R c = new Color4R() {
			@Override
			public float getUnityR()
			{
				return 2.1f;
			}
			
			@Override
			public float getUnityG()
			{
				return 3.2f;
			}
			
			@Override
			public float getUnityB()
			{
				return 4.3f;
			}
			
			@Override
			public float getUnityA()
			{
				return 5.4f;
			}
			
			@Override
			public int getR()
			{
				return 0;
			}
			
			@Override
			public int getG()
			{
				return 0;
			}
			
			@Override
			public int getB()
			{
				return 0;
			}
			
			@Override
			public int getA()
			{
				return 0;
			}
		};
		
		assertEquals(3.2f, c.getY());
		assertEquals(c.getUnityG(), c.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Color4R#getZ()} returns
	 * the value from {@link Color4R#getUnityB()}.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Color4R c = new Color4R() {
			@Override
			public float getUnityR()
			{
				return 2.1f;
			}
			
			@Override
			public float getUnityG()
			{
				return 3.2f;
			}
			
			@Override
			public float getUnityB()
			{
				return 4.3f;
			}
			
			@Override
			public float getUnityA()
			{
				return 5.4f;
			}
			
			@Override
			public int getR()
			{
				return 0;
			}
			
			@Override
			public int getG()
			{
				return 0;
			}
			
			@Override
			public int getB()
			{
				return 0;
			}
			
			@Override
			public int getA()
			{
				return 0;
			}
		};
		
		assertEquals(4.3f, c.getZ());
		assertEquals(c.getUnityB(), c.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Color4R#getW()} returns
	 * the value from {@link Color4R#getUnityA()}.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getWTest()
	{
		Color4R c = new Color4R() {
			@Override
			public float getUnityR()
			{
				return 2.1f;
			}
			
			@Override
			public float getUnityG()
			{
				return 3.2f;
			}
			
			@Override
			public float getUnityB()
			{
				return 4.3f;
			}
			
			@Override
			public float getUnityA()
			{
				return 5.4f;
			}
			
			@Override
			public int getR()
			{
				return 0;
			}
			
			@Override
			public int getG()
			{
				return 0;
			}
			
			@Override
			public int getB()
			{
				return 0;
			}
			
			@Override
			public int getA()
			{
				return 0;
			}
		};
		
		assertEquals(5.4f, c.getW());
		assertEquals(c.getUnityA(), c.getW());
	}
}