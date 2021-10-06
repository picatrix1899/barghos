//package org.barghos.core.test.api.color;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Test;
//
//import org.barghos.core.api.color.Color3R;
//
///**
// * This class provides component tests for the interface {@link Color3R}.
// * 
// * @author picatrix1899
// * 
// *  @since 1.0.0.0
// */
//class Color3RTest
//{
//	/**
//	 * This test ensures, that the function {@link Color3R#getX()} returns
//	 * the value from {@link Color3R#getUnityR()}.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void getXTest()
//	{
//		Color3R c = new Color3R() {
//			@Override
//			public float getUnityR()
//			{
//				return 2.1f;
//			}
//			
//			@Override
//			public float getUnityG()
//			{
//				return 3.2f;
//			}
//			
//			@Override
//			public float getUnityB()
//			{
//				return 4.3f;
//			}
//			
//			@Override
//			public int getR()
//			{
//				return 0;
//			}
//			
//			@Override
//			public int getG()
//			{
//				return 0;
//			}
//			
//			@Override
//			public int getB()
//			{
//				return 0;
//			}
//			
//			@Override
//			public Color3R getNewInstance(float x, float y, float z)
//			{
//				return null;
//			}
//		};
//		
//		assertEquals(2.1f, c.getX());
//		assertEquals(c.getUnityR(), c.getX());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Color3R#getY()} returns
//	 * the value from {@link Color3R#getUnityG()}.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void getYTest()
//	{
//		Color3R c = new Color3R() {
//			@Override
//			public float getUnityR()
//			{
//				return 2.1f;
//			}
//			
//			@Override
//			public float getUnityG()
//			{
//				return 3.2f;
//			}
//			
//			@Override
//			public float getUnityB()
//			{
//				return 4.3f;
//			}
//			
//			@Override
//			public int getR()
//			{
//				return 0;
//			}
//			
//			@Override
//			public int getG()
//			{
//				return 0;
//			}
//			
//			@Override
//			public int getB()
//			{
//				return 0;
//			}
//			
//			@Override
//			public Color3R getNewInstance(float x, float y, float z)
//			{
//				return null;
//			}
//		};
//		
//		assertEquals(3.2f, c.getY());
//		assertEquals(c.getUnityG(), c.getY());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Color3R#getZ()} returns
//	 * the value from {@link Color3R#getUnityB()}.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	@Test
//	void getZTest()
//	{
//		Color3R c = new Color3R() {
//			@Override
//			public float getUnityR()
//			{
//				return 2.1f;
//			}
//			
//			@Override
//			public float getUnityG()
//			{
//				return 3.2f;
//			}
//			
//			@Override
//			public float getUnityB()
//			{
//				return 4.3f;
//			}
//			
//			@Override
//			public int getR()
//			{
//				return 0;
//			}
//			
//			@Override
//			public int getG()
//			{
//				return 0;
//			}
//			
//			@Override
//			public int getB()
//			{
//				return 0;
//			}
//			
//			@Override
//			public Color3R getNewInstance(float x, float y, float z)
//			{
//				return null;
//			}
//		};
//		
//		assertEquals(4.3f, c.getZ());
//		assertEquals(c.getUnityB(), c.getZ());
//	}
//}