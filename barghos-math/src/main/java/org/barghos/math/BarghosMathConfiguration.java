package org.barghos.math;

import org.barghos.math.vector.DefaultVecFactory2F;
import org.barghos.math.vector.VecFactory2F;

public class BarghosMathConfiguration
{
	private static VecFactory2F VEC_FACTORY_2F = new DefaultVecFactory2F();
	
	public static void vecFactory2f(VecFactory2F factory)
	{
		VEC_FACTORY_2F = factory;
	}
	
	public static VecFactory2F vecFactory2f()
	{
		return VEC_FACTORY_2F;
	}
}
