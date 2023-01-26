package org.barghos.math.vector;

public class JOMLConvertUtils
{
	public static org.joml.Vector2f toJomlN(org.barghos.math.api.vector.SimpleVec2fR v)
	{
		return new org.joml.Vector2f(v.getX(), v.getY());
	}
	
	public static org.joml.Vector2f toJomlR(org.barghos.math.api.vector.SimpleVec2fR v, org.joml.Vector2f res)
	{
		res.x = v.getX();
		res.y = v.getY();
		
		return res;
	}
	
	public static <T> T toJomlFunc(org.barghos.math.api.vector.SimpleVec2fR v, org.barghos.core.api.util.function.FloatFunction2<T> func)
	{
		return func.apply(v.getX(), v.getY());
	}
	
	public static org.barghos.math.vector.Vec2f toBarghosN(org.joml.Vector2fc v)
	{
		return new org.barghos.math.vector.Vec2f(v.x(), v.y());
	}
	
	public static <T extends org.barghos.math.api.vector.SimpleVec2fC> T toBarghosR(org.joml.Vector2fc v, T res)
	{
		res.set(v.x(), v.y());
		
		return res;
	}
	
	public static <T> T toBarghosFunc(org.joml.Vector2fc v, org.barghos.core.api.util.function.FloatFunction2<T> func)
	{
		return func.apply(v.x(), v.y());
	}
}