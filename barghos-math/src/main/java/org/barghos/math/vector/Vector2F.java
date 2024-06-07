package org.barghos.math.vector;

import org.barghos.math.BarghosMathConfiguration;
import org.barghos.util.tuple.floats.Tup2RF;
import org.barghos.util.tuple.floats.TupRF;

public class Vector2F
{
	private static final VecFactory2F FACTORY;
	
	static
	{
		FACTORY = BarghosMathConfiguration.vecFactory2f();
	}
	
	public static Vec2WF get()
	{
		return FACTORY.get();
	}
	
	public static Vec2WF get(Tup2RF t)
	{
		return FACTORY.get(t);
	}
	
	public static Vec2WF get(TupRF t)
	{
		return FACTORY.get(t);
	}
	
	public static Vec2WF get(float value)
	{
		return FACTORY.get(value);
	}
	
	public static Vec2WF get(float x, float y)
	{
		return FACTORY.get(x, y);
	}
	
	public static Vec2WF temp()
	{
		return FACTORY.temp();
	}
	
	public static Vec2WF temp(Tup2RF t)
	{
		return FACTORY.temp(t);
	}
	
	public static Vec2WF temp(TupRF t)
	{
		return FACTORY.temp(t);
	}
	
	public static Vec2WF temp(float value)
	{
		return FACTORY.temp(value);
	}
	
	public static Vec2WF temp(float x, float y)
	{
		return FACTORY.temp(x, y);
	}
	
	public static void store(Vec2WF v)
	{
		FACTORY.store(v);
	}
	
	public static Vec2RF immutable(Tup2RF t)
	{
		return FACTORY.immutable(t);
	}
	
	public static Vec2RF immutable(TupRF t)
	{
		return FACTORY.immutable(t);
	}
	
	public static Vec2RF immutable(float value)
	{
		return FACTORY.immutable(value);
	}
	
	public static Vec2RF immutable(float x, float y)
	{
		return FACTORY.immutable(x, y);
	}
}
