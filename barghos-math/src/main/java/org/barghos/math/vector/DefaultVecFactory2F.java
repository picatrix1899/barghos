package org.barghos.math.vector;

import org.barghos.util.tuple.floats.Tup2RF;
import org.barghos.util.tuple.floats.TupRF;

public class DefaultVecFactory2F implements VecFactory2F
{
	@Override
	public Vec2WF get()
	{
		return new Vec2F();
	}

	@Override
	public Vec2WF get(Tup2RF t)
	{
		return new Vec2F(t);
	}

	@Override
	public Vec2WF get(TupRF t)
	{
		return new Vec2F(t);
	}

	@Override
	public Vec2WF get(float value)
	{
		return new Vec2F(value);
	}

	@Override
	public Vec2WF get(float x, float y)
	{
		return new Vec2F(x, y);
	}

	@Override
	public Vec2WF temp()
	{
		return new Vec2F();
	}

	@Override
	public Vec2WF temp(Tup2RF t)
	{
		return new Vec2F(t);
	}

	@Override
	public Vec2WF temp(TupRF t)
	{
		return new Vec2F(t);
	}

	@Override
	public Vec2WF temp(float value)
	{
		return new Vec2F(value);
	}

	@Override
	public Vec2WF temp(float x, float y)
	{
		return new Vec2F(x, y);
	}

	@Override
	public void store(Vec2WF v)
	{
	}

	@Override
	public Vec2RF immutable(Tup2RF t)
	{
		return new Vec2F(t);
	}

	@Override
	public Vec2RF immutable(TupRF t)
	{
		return new Vec2F(t);
	}

	@Override
	public Vec2RF immutable(float value)
	{
		return new Vec2F(value);
	}

	@Override
	public Vec2RF immutable(float x, float y)
	{
		return new Vec2F(x, y);
	}

}
