package org.barghos.impl.math.vector;

public class ArithmeticOpsVec2F
{
	private ArithmeticOpsVec2F() { }
	
	public static float[] tup_add_2f(float[] v1, Vec2F v2)
	{
		v1[0] += v2.data[0];
		v1[1] += v2.data[1];
		
		return v1;
	}
	
	public static Vec2F add_vec2f(Vec2F v1, Vec2F v2)
	{
		v1.data[0] += v2.data[0];
		v1.data[1] += v2.data[1];
		
		return v1;
	}
}
